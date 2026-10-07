package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Bundle;
import android.view.Surface;
import defpackage.ai;
import defpackage.c0a;
import defpackage.np0;
import defpackage.ore;
import defpackage.qt4;
import defpackage.qv1;
import defpackage.zo5;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class HardwareVideoEncoder implements VideoEncoder {
    protected static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    protected static final int MAX_ENCODER_Q_SIZE = 2;
    private static final int MAX_VIDEO_FRAMERATE = 30;
    protected static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    public static boolean ODKL_CBR_SUPPORTED_CHECK = false;
    public static boolean ODKL_CHANGE_CBR_BEHAVIOR = false;
    private static final int REQUIRED_RESOLUTION_ALIGNMENT = 16;
    private static final String TAG = "HardwareVideoEncoderV1";
    protected int adjustedBitrate;
    protected boolean automaticResizeOn;
    protected final BitrateAdjuster bitrateAdjuster;
    protected VideoEncoder.Callback callback;
    protected MediaCodecWrapper codec;
    protected final String codecName;
    protected final VideoCodecMimeType codecType;
    protected ByteBuffer configBuffer;
    protected final ThreadUtils.ThreadChecker encodeThreadChecker;
    protected HardwareVideoEncoderExceptionHandler exceptionHandler;
    protected final long forcedKeyFrameNs;
    protected int frameSizeBytes;
    protected int height;
    protected boolean isEncodingStatisticsEnabled;
    protected boolean isSemiPlanar;
    protected final int keyFrameIntervalSec;
    protected long lastKeyFrameNs;
    protected final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    protected long nextPresentationTimestampUs;
    protected final BusyCount outputBuffersBusyCount;
    protected Thread outputThread;
    protected final ThreadUtils.ThreadChecker outputThreadChecker;
    protected final Map<String, String> params;
    protected volatile boolean running;
    protected final EglBase14.Context sharedContext;
    protected volatile Exception shutdownException;
    protected int sliceHeight;
    protected int stride;
    protected final Integer surfaceColorFormat;
    protected EglBase14 textureEglBase;
    protected Surface textureInputSurface;
    protected boolean useSurfaceMode;
    protected int width;
    protected final Integer yuvColorFormat;
    protected final GlRectDrawer textureDrawer = new GlRectDrawer();
    protected final VideoFrameDrawer videoFrameDrawer = new VideoFrameDrawer();
    protected final BlockingDeque<EncodedImage.Builder> outputBuilders = new LinkedBlockingDeque();

    /* JADX INFO: renamed from: org.webrtc.HardwareVideoEncoder$1 */
    public class AnonymousClass1 extends Thread {
        public AnonymousClass1() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                boolean z = HardwareVideoEncoder.this.running;
                HardwareVideoEncoder hardwareVideoEncoder = HardwareVideoEncoder.this;
                if (!z) {
                    hardwareVideoEncoder.releaseCodecOnOutputThread();
                    return;
                }
                hardwareVideoEncoder.deliverEncodedImage();
            }
        }
    }

    public static class BusyCount {
        private int count;
        private final Object countLock = new Object();

        public void decrement() {
            synchronized (this.countLock) {
                try {
                    int i = this.count - 1;
                    this.count = i;
                    if (i == 0) {
                        this.countLock.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void increment() {
            synchronized (this.countLock) {
                this.count++;
            }
        }

        public void waitForZero() {
            boolean z;
            synchronized (this.countLock) {
                z = false;
                while (this.count > 0) {
                    try {
                        this.countLock.wait();
                    } catch (InterruptedException e) {
                        Logging.e(HardwareVideoEncoder.TAG, "Interrupted while waiting on busy count", e);
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public HardwareVideoEncoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, VideoCodecMimeType videoCodecMimeType, Integer num, Integer num2, Map<String, String> map, int i, int i2, BitrateAdjuster bitrateAdjuster, EglBase14.Context context, HardwareVideoEncoderExceptionHandler hardwareVideoEncoderExceptionHandler) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.encodeThreadChecker = threadChecker;
        this.outputThreadChecker = new ThreadUtils.ThreadChecker();
        this.outputBuffersBusyCount = new BusyCount();
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
        this.codecName = str;
        this.codecType = videoCodecMimeType;
        this.surfaceColorFormat = num;
        this.yuvColorFormat = num2;
        this.params = map;
        this.keyFrameIntervalSec = i;
        this.forcedKeyFrameNs = TimeUnit.MILLISECONDS.toNanos(i2);
        this.bitrateAdjuster = bitrateAdjuster;
        this.sharedContext = context;
        this.exceptionHandler = hardwareVideoEncoderExceptionHandler;
        threadChecker.detachThread();
    }

    public /* synthetic */ void lambda$deliverEncodedImage$0(int i) {
        try {
            this.codec.releaseOutputBuffer(i, false);
        } catch (Exception e) {
            Logging.e(TAG, "releaseOutputBuffer failed", e);
            this.exceptionHandler.handle(e);
        }
        this.outputBuffersBusyCount.decrement();
    }

    public boolean canUseSurface() {
        return (this.sharedContext == null || this.surfaceColorFormat == null) ? false : true;
    }

    public Thread createOutputThread() {
        return new Thread() { // from class: org.webrtc.HardwareVideoEncoder.1
            public AnonymousClass1() {
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                while (true) {
                    boolean z = HardwareVideoEncoder.this.running;
                    HardwareVideoEncoder hardwareVideoEncoder = HardwareVideoEncoder.this;
                    if (!z) {
                        hardwareVideoEncoder.releaseCodecOnOutputThread();
                        return;
                    }
                    hardwareVideoEncoder.deliverEncodedImage();
                }
            }
        };
    }

    public void deliverEncodedImage() {
        ByteBuffer byteBufferSlice;
        ByteBuffer byteBuffer;
        MediaFormat outputFormat;
        VideoCodecMimeType videoCodecMimeType;
        this.outputThreadChecker.checkIsOnValidThread();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int iDequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 100000L);
            if (iDequeueOutputBuffer < 0) {
                if (iDequeueOutputBuffer == -3) {
                    this.outputBuffersBusyCount.waitForZero();
                    return;
                }
                return;
            }
            ByteBuffer outputBuffer = this.codec.getOutputBuffer(iDequeueOutputBuffer);
            if ((bufferInfo.flags & 2) != 0) {
                Logging.d(TAG, "Config frame generated. Offset: " + bufferInfo.offset + ". Size: " + bufferInfo.size);
                int i = bufferInfo.size;
                if (i > 0 && ((videoCodecMimeType = this.codecType) == VideoCodecMimeType.H264 || videoCodecMimeType == VideoCodecMimeType.H265)) {
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i);
                    this.configBuffer = byteBufferAllocateDirect;
                    byteBufferAllocateDirect.put(outputBuffer);
                }
                this.codec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                return;
            }
            this.bitrateAdjuster.reportEncodedFrame(bufferInfo.size);
            if (this.adjustedBitrate != this.bitrateAdjuster.getAdjustedBitrateBps()) {
                updateBitrate();
            }
            boolean z = true;
            if ((bufferInfo.flags & 1) == 0) {
                z = false;
            }
            if (z) {
                Logging.d(TAG, "Sync frame generated");
            }
            ai aiVar = null;
            Integer numValueOf = (this.isEncodingStatisticsEnabled && (outputFormat = this.codec.getOutputFormat(iDequeueOutputBuffer)) != null && outputFormat.containsKey("video-qp-average")) ? Integer.valueOf(outputFormat.getInteger("video-qp-average")) : null;
            if (!z || (byteBuffer = this.configBuffer) == null) {
                byteBufferSlice = outputBuffer.slice();
                this.outputBuffersBusyCount.increment();
                aiVar = new ai(this, iDequeueOutputBuffer, 13);
            } else {
                Logging.d(TAG, "Prepending config buffer of size " + byteBuffer.capacity() + " to output buffer with offset " + bufferInfo.offset + ", size " + bufferInfo.size);
                byteBufferSlice = ByteBuffer.allocateDirect(bufferInfo.size + this.configBuffer.capacity());
                byteBufferSlice.put(this.configBuffer);
                byteBufferSlice.put(outputBuffer);
                this.codec.releaseOutputBuffer(iDequeueOutputBuffer, false);
            }
            EncodedImage.FrameType frameType = z ? EncodedImage.FrameType.VideoFrameKey : EncodedImage.FrameType.VideoFrameDelta;
            EncodedImage.Builder builderPoll = this.outputBuilders.poll();
            builderPoll.setBuffer(byteBufferSlice, aiVar);
            builderPoll.setFrameType(frameType);
            builderPoll.setQp(numValueOf);
            EncodedImage encodedImageCreateEncodedImage = builderPoll.createEncodedImage();
            this.callback.onEncodedFrame(encodedImageCreateEncodedImage, new VideoEncoder.CodecSpecificInfo());
            encodedImageCreateEncodedImage.release();
        } catch (IllegalStateException e) {
            Logging.e(TAG, "deliverOutput failed", e);
            this.exceptionHandler.handle(e);
        }
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus encode(VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo) {
        VideoCodecStatus videoCodecStatusResetCodec;
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.codec == null) {
            return VideoCodecStatus.UNINITIALIZED;
        }
        boolean z = videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer;
        int width = videoFrame.getBuffer().getWidth();
        int height = videoFrame.getBuffer().getHeight();
        boolean z2 = canUseSurface() && z;
        if ((width != this.width || height != this.height || z2 != this.useSurfaceMode) && (videoCodecStatusResetCodec = resetCodec(width, height, z2)) != VideoCodecStatus.OK) {
            return videoCodecStatusResetCodec;
        }
        if (this.outputBuilders.size() > 2) {
            Logging.e(TAG, "Dropped frame, encoder queue full");
            return VideoCodecStatus.NO_OUTPUT;
        }
        boolean z3 = false;
        for (EncodedImage.FrameType frameType : encodeInfo.frameTypes) {
            if (frameType == EncodedImage.FrameType.VideoFrameKey) {
                z3 = true;
            }
        }
        if (z3 || shouldForceKeyFrame(videoFrame.getTimestampNs())) {
            requestKeyFrame(videoFrame.getTimestampNs());
        }
        this.outputBuilders.offer(EncodedImage.builder().setCaptureTimeNs(videoFrame.getTimestampNs()).setEncodedWidth(videoFrame.getBuffer().getWidth()).setEncodedHeight(videoFrame.getBuffer().getHeight()).setRotation(videoFrame.getRotation()));
        long j = this.nextPresentationTimestampUs;
        this.nextPresentationTimestampUs += (long) (1000000.0d / this.bitrateAdjuster.getAdjustedFramerateFps());
        VideoCodecStatus videoCodecStatusEncodeTextureBuffer = this.useSurfaceMode ? encodeTextureBuffer(videoFrame, j) : encodeByteBuffer(videoFrame, j);
        if (videoCodecStatusEncodeTextureBuffer != VideoCodecStatus.OK) {
            this.outputBuilders.pollLast();
        }
        return videoCodecStatusEncodeTextureBuffer;
    }

    public VideoCodecStatus encodeByteBuffer(VideoFrame videoFrame, long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            int iDequeueInputBuffer = this.codec.dequeueInputBuffer(0L);
            if (iDequeueInputBuffer == -1) {
                Logging.d(TAG, "Dropped frame, no input buffers available");
                return VideoCodecStatus.NO_OUTPUT;
            }
            try {
                ByteBuffer inputBuffer = this.codec.getInputBuffer(iDequeueInputBuffer);
                if (inputBuffer.capacity() >= this.frameSizeBytes) {
                    fillInputBuffer(inputBuffer, videoFrame.getBuffer());
                    try {
                        this.codec.queueInputBuffer(iDequeueInputBuffer, 0, this.frameSizeBytes, j, 0);
                        return VideoCodecStatus.OK;
                    } catch (IllegalStateException e) {
                        Logging.e(TAG, "queueInputBuffer failed", e);
                        this.exceptionHandler.handle(e);
                        return VideoCodecStatus.ERROR;
                    }
                }
                Logging.e(TAG, "Input buffer size: " + inputBuffer.capacity() + " is smaller than frame size: " + this.frameSizeBytes);
                return VideoCodecStatus.ERROR;
            } catch (IllegalStateException e2) {
                Logging.e(TAG, "getInputBuffer with index=" + iDequeueInputBuffer + " failed", e2);
                this.exceptionHandler.handle(e2);
                return VideoCodecStatus.ERROR;
            }
        } catch (IllegalStateException e3) {
            Logging.e(TAG, "dequeueInputBuffer failed", e3);
            this.exceptionHandler.handle(e3);
            return VideoCodecStatus.ERROR;
        }
    }

    public VideoCodecStatus encodeTextureBuffer(VideoFrame videoFrame, long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            GLES20.glClear(16384);
            this.videoFrameDrawer.drawFrame(new VideoFrame(videoFrame.getBuffer(), 0, videoFrame.getTimestampNs()), this.textureDrawer, null);
            this.textureEglBase.swapBuffers(TimeUnit.MICROSECONDS.toNanos(j));
            return VideoCodecStatus.OK;
        } catch (RuntimeException e) {
            Logging.e(TAG, "encodeTexture failed", e);
            this.exceptionHandler.handle(e);
            return VideoCodecStatus.ERROR;
        }
    }

    public void fillInputBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
        VideoFrame.I420Buffer i420 = buffer.toI420();
        if (this.isSemiPlanar) {
            YuvHelper.I420ToNV12(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight(), this.stride, this.sliceHeight);
        } else {
            YuvHelper.I420Copy(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight(), this.stride, this.sliceHeight);
        }
        i420.release();
    }

    @Override // org.webrtc.VideoEncoder
    public VideoEncoder.EncoderInfo getEncoderInfo() {
        return new VideoEncoder.EncoderInfo(16, false);
    }

    @Override // org.webrtc.VideoEncoder
    public String getImplementationName() {
        return this.codecName;
    }

    @Override // org.webrtc.VideoEncoder
    public VideoEncoder.ScalingSettings getScalingSettings() {
        if (this.automaticResizeOn) {
            VideoCodecMimeType videoCodecMimeType = this.codecType;
            if (videoCodecMimeType == VideoCodecMimeType.VP8) {
                return new VideoEncoder.ScalingSettings(29, 95);
            }
            if (videoCodecMimeType == VideoCodecMimeType.H264) {
                return new VideoEncoder.ScalingSettings(24, 37);
            }
        }
        return VideoEncoder.ScalingSettings.OFF;
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
        int i;
        this.encodeThreadChecker.checkIsOnValidThread();
        this.callback = callback;
        this.automaticResizeOn = settings.automaticResizeOn;
        this.width = settings.width;
        this.height = settings.height;
        this.useSurfaceMode = canUseSurface();
        int i2 = settings.startBitrate;
        if (i2 != 0 && (i = settings.maxFramerate) != 0) {
            this.bitrateAdjuster.setTargets(i2 * 1000, i);
        }
        this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
        String str = this.codecName;
        String strValueOf = String.valueOf(this.codecType);
        int i3 = this.width;
        int i4 = this.height;
        int i5 = settings.maxFramerate;
        int i6 = settings.startBitrate;
        boolean z = this.useSurfaceMode;
        StringBuilder sbQ = qv1.q("initEncode name: ", str, " type: ", strValueOf, " width: ");
        qt4.x(i3, i4, " height: ", " framerate_fps: ", sbQ);
        qt4.x(i5, i6, " bitrate_kbps: ", " surface mode: ", sbQ);
        sbQ.append(z);
        Logging.d(TAG, sbQ.toString());
        return initEncodeInternal();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d3 A[Catch: IllegalStateException -> 0x006a, IllegalArgumentException -> 0x006d, TryCatch #4 {IllegalArgumentException -> 0x006d, IllegalStateException -> 0x006a, blocks: (B:9:0x002f, B:12:0x004b, B:14:0x004f, B:16:0x0066, B:23:0x0079, B:25:0x0097, B:29:0x00a6, B:40:0x00d3, B:34:0x00b5, B:36:0x00bd, B:37:0x00cc, B:41:0x00da, B:43:0x00e5, B:44:0x00ea, B:46:0x00f0, B:47:0x00f7, B:49:0x010c, B:50:0x0128, B:21:0x0070, B:22:0x0076), top: B:62:0x002f }] */
    public VideoCodecStatus initEncodeInternal() {
        this.encodeThreadChecker.checkIsOnValidThread();
        this.nextPresentationTimestampUs = 0L;
        this.lastKeyFrameNs = -1L;
        this.isEncodingStatisticsEnabled = false;
        try {
            this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
            int iIntValue = (this.useSurfaceMode ? this.surfaceColorFormat : this.yuvColorFormat).intValue();
            try {
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), this.width, this.height);
                mediaFormatCreateVideoFormat.setInteger("bitrate", this.adjustedBitrate);
                if (!ODKL_CHANGE_CBR_BEHAVIOR) {
                    mediaFormatCreateVideoFormat.setInteger("bitrate-mode", 2);
                } else if (ODKL_CBR_SUPPORTED_CHECK) {
                    boolean zCbrSupported = this.codec.cbrSupported(mediaFormatCreateVideoFormat);
                    Logging.d(TAG, "    cbr supported " + zCbrSupported);
                    if (zCbrSupported) {
                        mediaFormatCreateVideoFormat.setInteger("bitrate-mode", 2);
                    }
                } else {
                    Logging.d(TAG, "    cbr disabled");
                }
                mediaFormatCreateVideoFormat.setInteger("color-format", iIntValue);
                mediaFormatCreateVideoFormat.setFloat("frame-rate", (float) this.bitrateAdjuster.getAdjustedFramerateFps());
                mediaFormatCreateVideoFormat.setInteger("i-frame-interval", this.keyFrameIntervalSec);
                if (this.codecType == VideoCodecMimeType.H264) {
                    String str = this.params.get("profile-level-id");
                    if (str == null) {
                        str = "42e01f";
                    }
                    int iHashCode = str.hashCode();
                    if (iHashCode != 1537948542) {
                        if (iHashCode == 1595523974 && str.equals("640c1f")) {
                            mediaFormatCreateVideoFormat.setInteger("profile", 8);
                            mediaFormatCreateVideoFormat.setInteger("level", np0.n);
                        } else {
                            Logging.w(TAG, "Unknown profile level id: ".concat(str));
                        }
                    } else if (!str.equals("42e01f")) {
                        Logging.w(TAG, "Unknown profile level id: ".concat(str));
                    }
                }
                if (this.codecName.equals("c2.google.av1.encoder")) {
                    mediaFormatCreateVideoFormat.setInteger("vendor.google-av1enc.encoding-preset.int32.value", 1);
                }
                if (isEncodingStatisticsSupported()) {
                    mediaFormatCreateVideoFormat.setInteger("video-encoding-statistics-level", 1);
                    this.isEncodingStatisticsEnabled = true;
                }
                Logging.d(TAG, "Format: ".concat(String.valueOf(mediaFormatCreateVideoFormat)));
                this.codec.configure(mediaFormatCreateVideoFormat, null, null, 1);
                if (this.useSurfaceMode) {
                    this.textureEglBase = EglBase.createEgl14(this.sharedContext, EglBase.CONFIG_RECORDABLE);
                    Surface surfaceCreateInputSurface = this.codec.createInputSurface();
                    this.textureInputSurface = surfaceCreateInputSurface;
                    this.textureEglBase.createSurface(surfaceCreateInputSurface);
                    this.textureEglBase.makeCurrent();
                }
                updateInputFormat(this.codec.getInputFormat());
                this.codec.start();
                this.running = true;
                this.outputThreadChecker.detachThread();
                Thread threadCreateOutputThread = createOutputThread();
                this.outputThread = threadCreateOutputThread;
                threadCreateOutputThread.start();
                return VideoCodecStatus.OK;
            } catch (IllegalArgumentException e) {
                e = e;
                Logging.e(TAG, "initEncodeInternal failed", e);
                this.exceptionHandler.handle(e);
                release();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            } catch (IllegalStateException e2) {
                e = e2;
                Logging.e(TAG, "initEncodeInternal failed", e);
                this.exceptionHandler.handle(e);
                release();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (IOException | IllegalArgumentException | IllegalStateException e3) {
            Logging.e(TAG, "Cannot create media encoder " + this.codecName, e3);
            this.exceptionHandler.handle(e3);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    public boolean isEncodingStatisticsSupported() {
        MediaCodecInfo codecInfo;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        VideoCodecMimeType videoCodecMimeType = this.codecType;
        if (videoCodecMimeType == VideoCodecMimeType.VP8 || videoCodecMimeType == VideoCodecMimeType.VP9 || (codecInfo = this.codec.getCodecInfo()) == null || (capabilitiesForType = codecInfo.getCapabilitiesForType(this.codecType.mimeType())) == null) {
            return false;
        }
        return capabilitiesForType.isFeatureSupported("encoding-statistics");
    }

    public boolean isSemiPlanar(int i) {
        if (i == 19) {
            return false;
        }
        if (i == 21 || i == 2141391872 || i == 2141391876) {
            return true;
        }
        ore.p(zo5.h(i, "Unsupported colorFormat: "));
        return false;
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus release() {
        VideoCodecStatus videoCodecStatus;
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.outputThread == null) {
            videoCodecStatus = VideoCodecStatus.OK;
        } else {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, 5000L)) {
                Logging.e(TAG, "Media encoder release timeout");
                videoCodecStatus = VideoCodecStatus.TIMEOUT;
            } else if (this.shutdownException != null) {
                Logging.e(TAG, "Media encoder release exception", this.shutdownException);
                videoCodecStatus = VideoCodecStatus.ERROR;
            } else {
                videoCodecStatus = VideoCodecStatus.OK;
            }
        }
        this.textureDrawer.release();
        this.videoFrameDrawer.release();
        EglBase14 eglBase14 = this.textureEglBase;
        if (eglBase14 != null) {
            eglBase14.release();
            this.textureEglBase = null;
        }
        Surface surface = this.textureInputSurface;
        if (surface != null) {
            surface.release();
            this.textureInputSurface = null;
        }
        this.outputBuilders.clear();
        this.codec = null;
        this.outputThread = null;
        this.encodeThreadChecker.detachThread();
        return videoCodecStatus;
    }

    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.d(TAG, "Releasing MediaCodec on output thread");
        this.outputBuffersBusyCount.waitForZero();
        try {
            this.codec.stop();
        } catch (Exception e) {
            Logging.e(TAG, "Media encoder stop failed", e);
            this.exceptionHandler.handle(e);
        }
        try {
            this.codec.release();
        } catch (Exception e2) {
            Logging.e(TAG, "Media encoder release failed", e2);
            this.exceptionHandler.handle(e2);
            this.shutdownException = e2;
        }
        this.configBuffer = null;
        Logging.d(TAG, "Release on output thread done");
    }

    public void requestKeyFrame(long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.codec.setParameters(bundle);
            this.lastKeyFrameNs = j;
        } catch (IllegalStateException e) {
            Logging.e(TAG, "requestKeyFrame failed", e);
            this.exceptionHandler.handle(e);
        }
    }

    public VideoCodecStatus resetCodec(int i, int i2, boolean z) {
        this.encodeThreadChecker.checkIsOnValidThread();
        VideoCodecStatus videoCodecStatusRelease = release();
        if (videoCodecStatusRelease != VideoCodecStatus.OK) {
            return videoCodecStatusRelease;
        }
        this.width = i;
        this.height = i2;
        this.useSurfaceMode = z;
        return initEncodeInternal();
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus setRateAllocation(VideoEncoder.BitrateAllocation bitrateAllocation, int i) {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (i > MAX_VIDEO_FRAMERATE) {
            i = MAX_VIDEO_FRAMERATE;
        }
        this.bitrateAdjuster.setTargets(bitrateAllocation.getSum(), i);
        return VideoCodecStatus.OK;
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus setRates(VideoEncoder.RateControlParameters rateControlParameters) {
        this.encodeThreadChecker.checkIsOnValidThread();
        this.bitrateAdjuster.setTargets(rateControlParameters.bitrate.getSum(), rateControlParameters.framerateFps);
        return VideoCodecStatus.OK;
    }

    public boolean shouldForceKeyFrame(long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        long j2 = this.forcedKeyFrameNs;
        return j2 > 0 && j > this.lastKeyFrameNs + j2;
    }

    public VideoCodecStatus updateBitrate() {
        this.outputThreadChecker.checkIsOnValidThread();
        this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", this.adjustedBitrate);
            this.codec.setParameters(bundle);
            return VideoCodecStatus.OK;
        } catch (IllegalStateException e) {
            Logging.e(TAG, "updateBitrate failed", e);
            this.exceptionHandler.handle(e);
            return VideoCodecStatus.ERROR;
        }
    }

    public void updateInputFormat(MediaFormat mediaFormat) {
        this.stride = this.width;
        this.sliceHeight = this.height;
        if (mediaFormat != null) {
            if (mediaFormat.containsKey("stride")) {
                int integer = mediaFormat.getInteger("stride");
                this.stride = integer;
                this.stride = Math.max(integer, this.width);
            }
            if (mediaFormat.containsKey("slice-height")) {
                int integer2 = mediaFormat.getInteger("slice-height");
                this.sliceHeight = integer2;
                this.sliceHeight = Math.max(integer2, this.height);
            }
        }
        boolean zIsSemiPlanar = isSemiPlanar(this.yuvColorFormat.intValue());
        this.isSemiPlanar = zIsSemiPlanar;
        if (zIsSemiPlanar) {
            int i = (this.height + 1) / 2;
            int i2 = this.sliceHeight;
            int i3 = this.stride;
            this.frameSizeBytes = (i * i3) + (i2 * i3);
        } else {
            int i4 = this.stride;
            int i5 = this.sliceHeight;
            this.frameSizeBytes = (((i5 + 1) / 2) * ((i4 + 1) / 2) * 2) + (i5 * i4);
        }
        String strValueOf = String.valueOf(mediaFormat);
        int i6 = this.stride;
        int i7 = this.sliceHeight;
        boolean z = this.isSemiPlanar;
        int i8 = this.frameSizeBytes;
        StringBuilder sbR = c0a.r(i6, "updateInputFormat format: ", strValueOf, " stride: ", " sliceHeight: ");
        sbR.append(i7);
        sbR.append(" isSemiPlanar: ");
        sbR.append(z);
        sbR.append(" frameSizeBytes: ");
        sbR.append(i8);
        Logging.d(TAG, sbR.toString());
    }
}
