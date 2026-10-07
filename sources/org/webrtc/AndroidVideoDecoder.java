package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import defpackage.ore;
import defpackage.qv1;
import defpackage.zo5;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes3.dex */
public class AndroidVideoDecoder implements VideoDecoder, VideoSink {
    private static final int DEQUEUE_INPUT_TIMEOUT_US = 500000;
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final String TAG = "AndroidVideoDecoder";
    public static volatile ErrorCallback errorCallback;
    private volatile VideoDecoder.Callback callback;
    public volatile MediaCodecWrapper codec;
    private final String codecName;
    private final VideoCodecMimeType codecType;
    private int colorFormat;
    private final DecoderSsrcControl control;
    private ThreadUtils.ThreadChecker decoderThreadChecker;
    private final BlockingDeque<FrameInfo> frameInfos;
    private volatile boolean hasDecodedFirstFrame;
    private int height;
    private volatile boolean keyFrameRequired;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    private Thread outputThread;
    private ThreadUtils.ThreadChecker outputThreadChecker;
    private volatile DecodedTextureMetadata renderedTextureMetadata;
    private volatile boolean running;
    private final EglBase.Context sharedContext;
    private volatile Exception shutdownException;
    private int sliceHeight;
    private volatile long ssrc;
    private int stride;
    public volatile Surface surface;
    public volatile SurfaceTextureHelper surfaceTextureHelper;
    private int width;
    private final Object initLock = new Object();
    private final Object dimensionLock = new Object();
    private final Object renderedTextureMetadataLock = new Object();
    private final ConditionVariable variable = new ConditionVariable(true);

    public static class DecodedTextureMetadata {
        final Integer decodeTimeMs;
        final long presentationTimestampUs;

        public DecodedTextureMetadata(long j, Integer num) {
            this.presentationTimestampUs = j;
            this.decodeTimeMs = num;
        }
    }

    public interface ErrorCallback {
        void error(Exception exc, String str);
    }

    public static class FrameInfo {
        final long decodeStartTimeMs;
        final int rotation;

        public FrameInfo(long j, int i) {
            this.decodeStartTimeMs = j;
            this.rotation = i;
        }
    }

    public AndroidVideoDecoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, VideoCodecMimeType videoCodecMimeType, int i, DecoderSsrcControl decoderSsrcControl, EglBase.Context context) {
        this.control = decoderSsrcControl;
        if (!isSupportedColorFormat(i)) {
            ore.p(zo5.h(i, "Unsupported color format: "));
            throw null;
        }
        String strValueOf = String.valueOf(videoCodecMimeType);
        String strValueOf2 = String.valueOf(context);
        StringBuilder sbQ = qv1.q("ctor name: ", str, " type: ", strValueOf, " color format: ");
        sbQ.append(i);
        sbQ.append(" context: ");
        sbQ.append(strValueOf2);
        Logging.d(TAG, sbQ.toString());
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
        this.codecName = str;
        this.codecType = videoCodecMimeType;
        this.colorFormat = i;
        this.sharedContext = context;
        this.frameInfos = new LinkedBlockingDeque();
    }

    private static final String codecConfigToString(String str, MediaFormat mediaFormat) {
        try {
            return str + "\n" + mediaFormat.toString();
        } catch (Throwable th) {
            return qv1.k("can not convert codec format to string: ", th.getMessage());
        }
    }

    private VideoFrame.Buffer copyI420Buffer(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        if (i % 2 != 0) {
            defpackage.c.e(zo5.h(i, "Stride is not divisible by two: "));
            return null;
        }
        int i5 = (i3 + 1) / 2;
        int i6 = i2 % 2;
        int i7 = i6 == 0 ? (i4 + 1) / 2 : i4 / 2;
        int i8 = i / 2;
        int i9 = i * i2;
        int i10 = i8 * i7;
        int i11 = ((i8 * i2) / 2) + i9;
        int i12 = i11 + i10;
        VideoFrame.I420Buffer i420BufferAllocateI420Buffer = allocateI420Buffer(i3, i4);
        copyPlane(byteBuffer.slice(), i, i420BufferAllocateI420Buffer.getDataY(), i420BufferAllocateI420Buffer.getStrideY(), i3, i4);
        copyPlane(byteBuffer.slice(), i8, i420BufferAllocateI420Buffer.getDataU(), i420BufferAllocateI420Buffer.getStrideU(), i5, i7);
        if (i6 == 1) {
            ByteBuffer dataU = i420BufferAllocateI420Buffer.getDataU();
            dataU.put(byteBuffer);
        }
        copyPlane(byteBuffer.slice(), i8, i420BufferAllocateI420Buffer.getDataV(), i420BufferAllocateI420Buffer.getStrideV(), i5, i7);
        if (i6 == 1) {
            ByteBuffer dataV = i420BufferAllocateI420Buffer.getDataV();
            dataV.put(byteBuffer);
        }
        return i420BufferAllocateI420Buffer;
    }

    private VideoFrame.Buffer copyNV12ToI420Buffer(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        return new NV12Buffer(i3, i4, i, i2, byteBuffer, null).toI420();
    }

    private Thread createOutputThread() {
        return new Thread("AndroidVideoDecoder.outputThread") { // from class: org.webrtc.AndroidVideoDecoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                AndroidVideoDecoder.this.outputThreadChecker = new ThreadUtils.ThreadChecker();
                MediaCodecWrapper mediaCodecWrapper = AndroidVideoDecoder.this.codec;
                while (AndroidVideoDecoder.this.running) {
                    try {
                        AndroidVideoDecoder.this.deliverDecodedFrame();
                    } catch (NullPointerException e) {
                        Logging.e(AndroidVideoDecoder.TAG, "err", e);
                    }
                }
                AndroidVideoDecoder.this.releaseCodecOnOutputThread(mediaCodecWrapper);
            }
        };
    }

    private void deliverByteFrame(int i, MediaCodec.BufferInfo bufferInfo, int i2, Integer num) {
        int i3;
        int i4;
        int i5;
        int i6;
        AndroidVideoDecoder androidVideoDecoder;
        VideoFrame.Buffer bufferCopyNV12ToI420Buffer;
        synchronized (this.dimensionLock) {
            i3 = this.width;
            i4 = this.height;
            i5 = this.stride;
            i6 = this.sliceHeight;
        }
        int i7 = bufferInfo.size;
        if (i7 < ((i3 * i4) * 3) / 2) {
            Logging.e(TAG, "Insufficient output buffer size: " + i7);
            return;
        }
        if (i7 < ((i5 * i4) * 3) / 2 && i6 == i4 && i5 > i3) {
            i5 = (i7 * 2) / (i4 * 3);
        }
        int i8 = i5;
        ByteBuffer outputBuffer = this.codec.getOutputBuffer(i);
        ByteBuffer byteBufferSlice = outputBuffer.slice();
        if (this.colorFormat == 19) {
            androidVideoDecoder = this;
            bufferCopyNV12ToI420Buffer = androidVideoDecoder.copyI420Buffer(byteBufferSlice, i8, i6, i3, i4);
        } else {
            androidVideoDecoder = this;
            bufferCopyNV12ToI420Buffer = androidVideoDecoder.copyNV12ToI420Buffer(byteBufferSlice, i8, i6, i3, i4);
        }
        androidVideoDecoder.codec.releaseOutputBuffer(i, false);
        VideoFrame videoFrame = new VideoFrame(bufferCopyNV12ToI420Buffer, i2, bufferInfo.presentationTimeUs * 1000);
        androidVideoDecoder.callback.onDecodedFrame(videoFrame, num, null);
        videoFrame.release();
    }

    private void deliverTextureFrame(int i, MediaCodec.BufferInfo bufferInfo, int i2, Integer num) {
        int i3;
        int i4;
        synchronized (this.dimensionLock) {
            i3 = this.width;
            i4 = this.height;
        }
        if (this.renderedTextureMetadata != null) {
            Logging.v(TAG, "blocking");
            this.variable.block(60L);
        }
        synchronized (this.renderedTextureMetadataLock) {
            try {
                if (this.renderedTextureMetadata != null) {
                    this.codec.releaseOutputBuffer(i, false);
                    Logging.v(TAG, "false release");
                    return;
                }
                this.variable.close();
                this.surfaceTextureHelper.setTextureSize(i3, i4);
                this.surfaceTextureHelper.setFrameRotation(i2);
                this.renderedTextureMetadata = new DecodedTextureMetadata(bufferInfo.presentationTimeUs, num);
                this.codec.releaseOutputBuffer(i, true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private VideoCodecStatus initDecodeInternal(int i, int i2, long j) {
        this.decoderThreadChecker.checkIsOnValidThread();
        synchronized (this.initLock) {
            try {
                if (this.sharedContext != null) {
                    this.surfaceTextureHelper = createSurfaceTextureHelper();
                    this.surface = new Surface(this.surfaceTextureHelper.getSurfaceTexture());
                    this.surfaceTextureHelper.startListening(this);
                }
                Logging.d(TAG, "initDecodeInternal " + this.codecType.mimeType() + " " + i + " x " + i2 + " " + this.colorFormat + " " + String.valueOf(this.surface));
                if (this.surface != null) {
                    Logging.d(TAG, "initDecodeInternal " + this.surface.isValid());
                    try {
                        Field declaredField = Surface.class.getDeclaredField("mNativeObject");
                        declaredField.setAccessible(true);
                        Logging.d(TAG, "initDecodeInternal ".concat(String.valueOf(declaredField.get(this.surface))));
                    } catch (Exception e) {
                        Logging.e(TAG, "initDecodeInternal ", e);
                    }
                }
                if (this.outputThread != null) {
                    Logging.e(TAG, "initDecodeInternal called while the codec is already running");
                    return VideoCodecStatus.FALLBACK_SOFTWARE;
                }
                synchronized (this.dimensionLock) {
                    this.width = i;
                    this.height = i2;
                    this.stride = i;
                    this.sliceHeight = i2;
                }
                this.hasDecodedFirstFrame = false;
                this.keyFrameRequired = true;
                try {
                    this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
                    String strCodecConfigToString = "";
                    try {
                        try {
                            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), i, i2);
                            if (this.sharedContext == null) {
                                mediaFormatCreateVideoFormat.setInteger("color-format", this.colorFormat);
                            }
                            strCodecConfigToString = codecConfigToString(this.codecName, mediaFormatCreateVideoFormat);
                            Logging.d(TAG, strCodecConfigToString);
                            this.codec.configure(mediaFormatCreateVideoFormat, this.surface, null, 0);
                            this.codec.start();
                            this.control.onDecoderInit(this, j);
                            this.frameInfos.clear();
                            this.running = true;
                            Thread threadCreateOutputThread = createOutputThread();
                            this.outputThread = threadCreateOutputThread;
                            threadCreateOutputThread.start();
                            Logging.d(TAG, "initDecodeInternal done");
                            return VideoCodecStatus.OK;
                        } catch (IllegalStateException e2) {
                            Logging.e(TAG, "initDecode failed", e2);
                            ErrorCallback errorCallback2 = errorCallback;
                            if (errorCallback2 != null) {
                                errorCallback2.error(e2, "hwdec.ise\n" + strCodecConfigToString);
                            }
                            release();
                            return VideoCodecStatus.FALLBACK_SOFTWARE;
                        }
                    } catch (IllegalArgumentException e3) {
                        ErrorCallback errorCallback3 = errorCallback;
                        if (errorCallback3 != null) {
                            errorCallback3.error(e3, "hwdec.iae\n" + strCodecConfigToString);
                        }
                        Logging.e(TAG, "initDecode failed", e3);
                        release();
                        return VideoCodecStatus.FALLBACK_SOFTWARE;
                    }
                } catch (IOException | IllegalArgumentException unused) {
                    Logging.e(TAG, "Cannot create media decoder " + this.codecName);
                    return VideoCodecStatus.FALLBACK_SOFTWARE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean isSupportedColorFormat(int i) {
        for (int i2 : MediaCodecUtils.DECODER_COLOR_FORMATS) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private void reformat(MediaFormat mediaFormat) {
        int integer;
        int integer2;
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.d(TAG, "Decoder format changed: ".concat(String.valueOf(mediaFormat)));
        if (mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            integer = (mediaFormat.getInteger("crop-right") + 1) - mediaFormat.getInteger("crop-left");
            integer2 = (mediaFormat.getInteger("crop-bottom") + 1) - mediaFormat.getInteger("crop-top");
        } else {
            integer = mediaFormat.getInteger("width");
            integer2 = mediaFormat.getInteger("height");
        }
        synchronized (this.dimensionLock) {
            try {
                if (integer != this.width || integer2 != this.height) {
                    if (this.hasDecodedFirstFrame) {
                        stopOnOutputThread(new RuntimeException("Unexpected size change. Configured " + this.width + "*" + this.height + ". New " + integer + "*" + integer2));
                        return;
                    }
                    if (integer > 0 && integer2 > 0) {
                        this.width = integer;
                        this.height = integer2;
                    }
                    Logging.w(TAG, "Unexpected format dimensions. Configured " + this.width + "*" + this.height + ". New " + integer + "*" + integer2 + ". Skip it");
                    return;
                }
                if (this.surfaceTextureHelper == null && mediaFormat.containsKey("color-format")) {
                    int integer3 = mediaFormat.getInteger("color-format");
                    this.colorFormat = integer3;
                    Logging.d(TAG, "Color: 0x" + Integer.toHexString(integer3));
                    if (!isSupportedColorFormat(this.colorFormat)) {
                        stopOnOutputThread(new IllegalStateException(zo5.h(this.colorFormat, "Unsupported color format: ")));
                        return;
                    }
                }
                synchronized (this.dimensionLock) {
                    try {
                        if (mediaFormat.containsKey("stride")) {
                            this.stride = mediaFormat.getInteger("stride");
                        }
                        if (mediaFormat.containsKey("slice-height")) {
                            this.sliceHeight = mediaFormat.getInteger("slice-height");
                        }
                        Logging.d(TAG, "Frame stride and slice height: " + this.stride + " x " + this.sliceHeight);
                        this.stride = Math.max(this.width, this.stride);
                        this.sliceHeight = Math.max(this.height, this.sliceHeight);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private VideoCodecStatus reinitDecode(int i, int i2, long j) {
        this.decoderThreadChecker.checkIsOnValidThread();
        VideoCodecStatus videoCodecStatusReleaseInternal = releaseInternal();
        return videoCodecStatusReleaseInternal != VideoCodecStatus.OK ? videoCodecStatusReleaseInternal : initDecodeInternal(i, i2, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseCodecOnOutputThread(MediaCodecWrapper mediaCodecWrapper) {
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.d(TAG, "Releasing MediaCodec on output thread");
        try {
            mediaCodecWrapper.stop();
        } catch (Exception e) {
            Logging.e(TAG, "Media decoder stop failed", e);
        }
        try {
            mediaCodecWrapper.release();
        } catch (Exception e2) {
            Logging.e(TAG, "Media decoder release failed", e2);
            this.shutdownException = e2;
        }
        Logging.d(TAG, "Release on output thread done");
    }

    private void stopOnOutputThread(Exception exc) {
        this.outputThreadChecker.checkIsOnValidThread();
        this.running = false;
        this.shutdownException = exc;
    }

    public VideoFrame.I420Buffer allocateI420Buffer(int i, int i2) {
        return JavaI420Buffer.allocate(i, i2);
    }

    public void copyPlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4) {
        YuvHelper.copyPlane(byteBuffer, i, byteBuffer2, i2, i3, i4);
    }

    public SurfaceTextureHelper createSurfaceTextureHelper() {
        return SurfaceTextureHelper.create("decoder-texture-thread", this.sharedContext);
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus decode(EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo, long j) {
        int i;
        int i2;
        VideoCodecStatus videoCodecStatusReinitDecode;
        boolean z;
        this.decoderThreadChecker.checkIsOnValidThread();
        VideoDecoder.Callback callback = this.callback;
        MediaCodecWrapper mediaCodecWrapper = this.codec;
        if (callback == null) {
            z = mediaCodecWrapper != null;
            Logging.d(TAG, "decode uninitalized, codec: " + z + ", callback: " + String.valueOf(this.callback));
            return VideoCodecStatus.UNINITIALIZED;
        }
        if (mediaCodecWrapper == null) {
            if (j == 0) {
                z = this.codec != null;
                Logging.d(TAG, "decode uninitalized, codec: " + z + ", callback: " + String.valueOf(this.callback));
                return VideoCodecStatus.UNINITIALIZED;
            }
            if (!this.control.ssrcAllowedCodecInit(this, j)) {
                return VideoCodecStatus.NO_OUTPUT;
            }
            VideoCodecStatus videoCodecStatusInitDecodeInternal = initDecodeInternal(encodedImage.encodedWidth, encodedImage.encodedHeight, j);
            if (videoCodecStatusInitDecodeInternal != VideoCodecStatus.OK) {
                return videoCodecStatusInitDecodeInternal;
            }
        }
        if (j != 0 && !this.control.ssrcAllowedDecode(this, j)) {
            return VideoCodecStatus.NO_OUTPUT;
        }
        ByteBuffer byteBuffer = encodedImage.buffer;
        if (byteBuffer == null) {
            Logging.e(TAG, "decode() - no input data");
            return VideoCodecStatus.ERR_PARAMETER;
        }
        int iRemaining = byteBuffer.remaining();
        if (iRemaining == 0) {
            Logging.e(TAG, "decode() - input buffer empty");
            return VideoCodecStatus.ERR_PARAMETER;
        }
        long j2 = this.ssrc;
        if (j2 != j && this.ssrc != 0) {
            this.control.onDecoderSsrcChanged(this, j, j2);
            this.ssrc = j;
        }
        synchronized (this.dimensionLock) {
            i = this.width;
            i2 = this.height;
        }
        int i3 = encodedImage.encodedWidth;
        int i4 = encodedImage.encodedHeight;
        if (i3 * i4 > 0 && ((i3 != i || i4 != i2) && (videoCodecStatusReinitDecode = reinitDecode(i3, i4, j)) != VideoCodecStatus.OK)) {
            return videoCodecStatusReinitDecode;
        }
        if (this.keyFrameRequired && encodedImage.frameType != EncodedImage.FrameType.VideoFrameKey) {
            Logging.e(TAG, "decode() - key frame required first");
            return VideoCodecStatus.NO_OUTPUT;
        }
        try {
            int iDequeueInputBuffer = this.codec.dequeueInputBuffer(500000L);
            if (iDequeueInputBuffer < 0) {
                Logging.e(TAG, "decode() - no HW buffers available; decoder falling behind");
                return VideoCodecStatus.ERROR;
            }
            try {
                ByteBuffer inputBuffer = this.codec.getInputBuffer(iDequeueInputBuffer);
                if (inputBuffer.capacity() < iRemaining) {
                    Logging.e(TAG, "decode() - HW buffer too small");
                    return VideoCodecStatus.ERROR;
                }
                inputBuffer.put(encodedImage.buffer);
                Logging.v(TAG, "frameInfos: " + this.frameInfos.size());
                this.frameInfos.offer(new FrameInfo(SystemClock.elapsedRealtime(), encodedImage.rotation));
                try {
                    this.codec.queueInputBuffer(iDequeueInputBuffer, 0, iRemaining, encodedImage.captureTimeNs / 1000, 0);
                    if (this.keyFrameRequired) {
                        this.keyFrameRequired = false;
                    }
                    return VideoCodecStatus.OK;
                } catch (IllegalStateException e) {
                    Logging.e(TAG, "queueInputBuffer failed", e);
                    this.frameInfos.pollLast();
                    return VideoCodecStatus.ERROR;
                }
            } catch (IllegalStateException e2) {
                Logging.e(TAG, "getInputBuffer with index=" + iDequeueInputBuffer + " failed", e2);
                return VideoCodecStatus.ERROR;
            }
        } catch (IllegalStateException e3) {
            Logging.e(TAG, "dequeueInputBuffer failed", e3);
            return VideoCodecStatus.ERROR;
        }
    }

    public void deliverDecodedFrame() {
        Integer numValueOf;
        int i;
        this.outputThreadChecker.checkIsOnValidThread();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int iDequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 100000L);
            if (iDequeueOutputBuffer == -2) {
                reformat(this.codec.getOutputFormat());
                return;
            }
            if (iDequeueOutputBuffer < 0) {
                Logging.v(TAG, "dequeueOutputBuffer returned " + iDequeueOutputBuffer);
                return;
            }
            FrameInfo frameInfoPoll = this.frameInfos.poll();
            if (frameInfoPoll != null) {
                numValueOf = Integer.valueOf((int) (SystemClock.elapsedRealtime() - frameInfoPoll.decodeStartTimeMs));
                i = frameInfoPoll.rotation;
            } else {
                numValueOf = null;
                i = 0;
            }
            this.hasDecodedFirstFrame = true;
            if (this.surfaceTextureHelper != null) {
                deliverTextureFrame(iDequeueOutputBuffer, bufferInfo, i, numValueOf);
            } else {
                deliverByteFrame(iDequeueOutputBuffer, bufferInfo, i, numValueOf);
            }
        } catch (IllegalStateException e) {
            Logging.e(TAG, "deliverDecodedFrame failed", e);
        }
    }

    @Override // org.webrtc.VideoDecoder
    public String getImplementationName() {
        return this.codecName;
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
        this.decoderThreadChecker = new ThreadUtils.ThreadChecker();
        this.callback = callback;
        synchronized (this.dimensionLock) {
            this.width = settings.width;
            this.height = settings.height;
        }
        return VideoCodecStatus.OK;
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        long j;
        Integer num;
        synchronized (this.renderedTextureMetadataLock) {
            if (this.renderedTextureMetadata == null) {
                throw new IllegalStateException("Rendered texture metadata was null in onTextureFrameAvailable.");
            }
            j = this.renderedTextureMetadata.presentationTimestampUs * 1000;
            num = this.renderedTextureMetadata.decodeTimeMs;
            this.renderedTextureMetadata = null;
        }
        this.variable.open();
        this.callback.onDecodedFrame(new VideoFrame(videoFrame.getBuffer(), videoFrame.getRotation(), j), num, null);
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus release() {
        Logging.d(TAG, "release");
        VideoCodecStatus videoCodecStatusReleaseInternal = releaseInternal();
        this.callback = null;
        return videoCodecStatusReleaseInternal;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0128 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x00e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public VideoCodecStatus releaseInternal() {
        Object obj;
        VideoCodecStatus videoCodecStatus;
        synchronized (this.initLock) {
            if (!this.running) {
                Logging.d(TAG, "release: Decoder is not running.");
                return VideoCodecStatus.OK;
            }
            try {
                this.running = false;
                if (!ThreadUtils.joinUninterruptibly(this.outputThread, 5000L)) {
                    RuntimeException runtimeException = new RuntimeException(TextUtils.join("\n", this.outputThread.getStackTrace()));
                    Logging.e(TAG, "Media decoder release timeout", runtimeException);
                    ErrorCallback errorCallback2 = errorCallback;
                    if (errorCallback2 != null) {
                        errorCallback2.error(runtimeException, "hwdec.release.timeout");
                    }
                    videoCodecStatus = VideoCodecStatus.OK;
                    this.codec = null;
                    this.outputThread = null;
                    try {
                        if (this.surface != null) {
                            releaseSurface();
                            this.surface = null;
                            this.surfaceTextureHelper.stopListening();
                            this.surfaceTextureHelper.dispose();
                            this.surfaceTextureHelper = null;
                        }
                        synchronized (this.renderedTextureMetadataLock) {
                            this.renderedTextureMetadata = null;
                        }
                        return videoCodecStatus;
                    } catch (Throwable th) {
                        synchronized (this.renderedTextureMetadataLock) {
                            this.renderedTextureMetadata = null;
                            throw th;
                        }
                    }
                }
                if (this.shutdownException != null) {
                    RuntimeException runtimeException2 = new RuntimeException(this.shutdownException);
                    Logging.e(TAG, "Media decoder release error", runtimeException2);
                    ErrorCallback errorCallback3 = errorCallback;
                    if (errorCallback3 != null) {
                        errorCallback3.error(runtimeException2, "hwdec.release.e");
                    }
                    this.shutdownException = null;
                    videoCodecStatus = VideoCodecStatus.ERROR;
                    this.codec = null;
                    this.outputThread = null;
                    try {
                        if (this.surface != null) {
                            releaseSurface();
                            this.surface = null;
                            this.surfaceTextureHelper.stopListening();
                            this.surfaceTextureHelper.dispose();
                            this.surfaceTextureHelper = null;
                        }
                        synchronized (this.renderedTextureMetadataLock) {
                            this.renderedTextureMetadata = null;
                        }
                        return videoCodecStatus;
                    } catch (Throwable th2) {
                        synchronized (this.renderedTextureMetadataLock) {
                            this.renderedTextureMetadata = null;
                            throw th2;
                        }
                    }
                }
                this.codec = null;
                this.outputThread = null;
                try {
                    if (this.surface == null) {
                        synchronized (this.renderedTextureMetadataLock) {
                            this.renderedTextureMetadata = null;
                            this.frameInfos.clear();
                            this.control.onDecoderRelease(this, this.ssrc);
                            return VideoCodecStatus.OK;
                        }
                    }
                    releaseSurface();
                    this.surface = null;
                    this.surfaceTextureHelper.stopListening();
                    this.surfaceTextureHelper.dispose();
                    this.surfaceTextureHelper = null;
                    synchronized (this.renderedTextureMetadataLock) {
                        this.renderedTextureMetadata = null;
                    }
                    this.frameInfos.clear();
                    this.control.onDecoderRelease(this, this.ssrc);
                    return VideoCodecStatus.OK;
                } catch (Throwable th3) {
                    synchronized (this.renderedTextureMetadataLock) {
                        this.renderedTextureMetadata = null;
                        throw th3;
                    }
                }
                throw th;
            } catch (Throwable th4) {
                this.codec = null;
                this.outputThread = null;
                try {
                    if (this.surface == null) {
                        synchronized (obj) {
                            throw th4;
                        }
                    }
                    releaseSurface();
                    this.surface = null;
                    this.surfaceTextureHelper.stopListening();
                    this.surfaceTextureHelper.dispose();
                    this.surfaceTextureHelper = null;
                    synchronized (obj) {
                        throw th4;
                    }
                } finally {
                    synchronized (this.renderedTextureMetadataLock) {
                        this.renderedTextureMetadata = null;
                    }
                }
            }
        }
    }

    public void releaseSurface() {
        this.surface.release();
    }

    public void shutdown() {
        releaseInternal();
    }
}
