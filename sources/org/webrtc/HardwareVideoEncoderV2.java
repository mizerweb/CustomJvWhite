package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import defpackage.ai;
import defpackage.kb0;
import defpackage.np0;
import defpackage.ot7;
import defpackage.pt7;
import defpackage.qt4;
import defpackage.qt7;
import defpackage.qv1;
import defpackage.vs4;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class HardwareVideoEncoderV2 extends HardwareVideoEncoder {
    private static final String TAG = "HardwareVideoEncoderV2";
    private Handler codecHandler;
    private HandlerThread codecThread;
    private final CropAndScaleParamsProvider cropAndScaleParamsProvider;

    /* JADX INFO: renamed from: org.webrtc.HardwareVideoEncoderV2$1 */
    public class AnonymousClass1 extends Thread {
        public AnonymousClass1() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (HardwareVideoEncoderV2.this.running) {
                HardwareVideoEncoderV2.this.deliverEncodedImage();
            }
        }
    }

    public HardwareVideoEncoderV2(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, VideoCodecMimeType videoCodecMimeType, Integer num, Integer num2, Map<String, String> map, int i, int i2, BitrateAdjuster bitrateAdjuster, EglBase14.Context context, CropAndScaleParamsProvider cropAndScaleParamsProvider, HardwareVideoEncoderExceptionHandler hardwareVideoEncoderExceptionHandler) {
        super(mediaCodecWrapperFactory, str, videoCodecMimeType, num, num2, map, i, i2, bitrateAdjuster, context, hardwareVideoEncoderExceptionHandler);
        this.cropAndScaleParamsProvider = cropAndScaleParamsProvider;
    }

    private VideoCodecStatus encodeByteBuffer(VideoFrame videoFrame, long j, EncodedImage.Builder builder) {
        Handler handler = this.codecHandler;
        if (handler == null) {
            return VideoCodecStatus.ERROR;
        }
        videoFrame.retain();
        handler.post(new ot7(this, builder, videoFrame, j, 0));
        return VideoCodecStatus.OK;
    }

    private VideoCodecStatus encodeTextureBuffer(VideoFrame videoFrame, long j, EncodedImage.Builder builder) {
        Handler handler = this.codecHandler;
        if (handler == null) {
            return VideoCodecStatus.ERROR;
        }
        videoFrame.retain();
        handler.post(new ot7(this, builder, videoFrame, j, 1));
        return VideoCodecStatus.OK;
    }

    public /* synthetic */ void lambda$deliverEncodedImage$7(int i) {
        try {
            this.codec.releaseOutputBuffer(i, false);
        } catch (Exception e) {
            Logging.e(TAG, "releaseOutputBuffer failed", e);
            this.exceptionHandler.handle(e);
        }
        this.outputBuffersBusyCount.decrement();
    }

    public /* synthetic */ void lambda$encodeByteBuffer$4(EncodedImage.Builder builder, VideoFrame videoFrame, long j) {
        try {
            this.outputBuilders.offer(builder);
            try {
                int iDequeueInputBuffer = this.codec.dequeueInputBuffer(0L);
                if (iDequeueInputBuffer == -1) {
                    Logging.d(TAG, "Dropped frame, no input buffers available");
                    this.outputBuilders.pollLast();
                    videoFrame.release();
                    return;
                }
                try {
                    ByteBuffer inputBuffer = this.codec.getInputBuffer(iDequeueInputBuffer);
                    if (inputBuffer.capacity() >= this.frameSizeBytes) {
                        fillInputBuffer(inputBuffer, videoFrame.getBuffer());
                        try {
                            this.codec.queueInputBuffer(iDequeueInputBuffer, 0, this.frameSizeBytes, j, 0);
                            videoFrame.release();
                            return;
                        } catch (IllegalStateException e) {
                            Logging.e(TAG, "queueInputBuffer failed", e);
                            this.outputBuilders.pollLast();
                            videoFrame.release();
                            return;
                        }
                    }
                    Logging.e(TAG, "Input buffer size: " + inputBuffer.capacity() + " is smaller than frame size: " + this.frameSizeBytes);
                    this.outputBuilders.pollLast();
                    videoFrame.release();
                } catch (IllegalStateException e2) {
                    Logging.e(TAG, "getInputBuffer with index=" + iDequeueInputBuffer + " failed", e2);
                    this.outputBuilders.pollLast();
                    videoFrame.release();
                }
            } catch (IllegalStateException e3) {
                Logging.e(TAG, "dequeueInputBuffer failed", e3);
                this.outputBuilders.pollLast();
                videoFrame.release();
            }
        } catch (Throwable th) {
            videoFrame.release();
            throw th;
        }
    }

    public /* synthetic */ void lambda$encodeTextureBuffer$3(EncodedImage.Builder builder, VideoFrame videoFrame, long j) {
        try {
            this.outputBuilders.offer(builder);
            GLES20.glClear(16384);
            this.videoFrameDrawer.drawFrame(new VideoFrame(videoFrame.getBuffer(), 0, videoFrame.getTimestampNs()), this.textureDrawer, null);
            this.textureEglBase.swapBuffers(TimeUnit.MICROSECONDS.toNanos(j));
        } catch (RuntimeException e) {
            this.outputBuilders.pollLast();
            this.exceptionHandler.handle(e);
        } finally {
            videoFrame.release();
        }
    }

    public /* synthetic */ Object lambda$initEncodeInternal$0(MediaFormat mediaFormat) throws Exception {
        this.codec.configure(mediaFormat, null, null, 1);
        if (this.useSurfaceMode) {
            this.textureEglBase = EglBase.createEgl14(this.sharedContext, EglBase.CONFIG_RECORDABLE);
            Surface surfaceCreateInputSurface = this.codec.createInputSurface();
            this.textureInputSurface = surfaceCreateInputSurface;
            this.textureEglBase.createSurface(surfaceCreateInputSurface);
            this.textureEglBase.makeCurrent();
        }
        updateInputFormat(this.codec.getInputFormat());
        this.codec.start();
        return null;
    }

    public static /* synthetic */ Object lambda$releaseCodecThread$1() throws Exception {
        return null;
    }

    public /* synthetic */ VideoCodecStatus lambda$releaseCodecThread$2() throws Exception {
        releaseCodecOnCodecThread();
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
        return VideoCodecStatus.OK;
    }

    public /* synthetic */ void lambda$requestKeyFrame$5(long j) {
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

    public /* synthetic */ VideoCodecStatus lambda$updateBitrate$6() throws Exception {
        this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
        Bundle bundle = new Bundle();
        bundle.putInt("video-bitrate", this.adjustedBitrate);
        this.codec.setParameters(bundle);
        return VideoCodecStatus.OK;
    }

    private void releaseCodecOnCodecThread() {
        Logging.d(TAG, "Releasing MediaCodec on input thread");
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

    public <T> T callAndWait(Handler handler, Callable<T> callable) throws Throwable {
        if (Looper.myLooper() == handler.getLooper()) {
            return callable.call();
        }
        FutureTask futureTask = new FutureTask(callable);
        if (!handler.post(futureTask)) {
            throw new RejectedExecutionException("Handler is shutting down or post() failed");
        }
        try {
            return (T) futureTask.get();
        } catch (ExecutionException e) {
            Logging.e(TAG, "callAndWait failed", e);
            Throwable cause = e.getCause();
            HardwareVideoEncoderExceptionHandler hardwareVideoEncoderExceptionHandler = this.exceptionHandler;
            if (cause == null) {
                hardwareVideoEncoderExceptionHandler.handle(e);
                throw e;
            }
            hardwareVideoEncoderExceptionHandler.handle(cause);
            throw cause;
        }
    }

    @Override // org.webrtc.HardwareVideoEncoder
    public Thread createOutputThread() {
        return new Thread() { // from class: org.webrtc.HardwareVideoEncoderV2.1
            public AnonymousClass1() {
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                while (HardwareVideoEncoderV2.this.running) {
                    HardwareVideoEncoderV2.this.deliverEncodedImage();
                }
            }
        };
    }

    @Override // org.webrtc.HardwareVideoEncoder
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
                aiVar = new ai(this, iDequeueOutputBuffer, 14);
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

    @Override // org.webrtc.HardwareVideoEncoder, org.webrtc.VideoEncoder
    public VideoCodecStatus encode(VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo) {
        VideoFrame.Buffer bufferCropAndScale;
        VideoFrame.Buffer buffer;
        VideoCodecStatus videoCodecStatusResetCodec;
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.codec == null) {
            return VideoCodecStatus.UNINITIALIZED;
        }
        boolean z = videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer;
        int width = videoFrame.getBuffer().getWidth();
        int height = videoFrame.getBuffer().getHeight();
        boolean z2 = canUseSurface() && z;
        if (z2 != this.useSurfaceMode && (videoCodecStatusResetCodec = resetCodec(this.width, this.height, z2)) != VideoCodecStatus.OK) {
            return videoCodecStatusResetCodec;
        }
        if (this.outputBuilders.size() > 2) {
            Logging.e(TAG, "Dropped frame, encoder queue full");
            return VideoCodecStatus.NO_OUTPUT;
        }
        VideoFrame.Buffer buffer2 = videoFrame.getBuffer();
        int i = this.width;
        if (width == i && height == this.height) {
            bufferCropAndScale = null;
            buffer = buffer2;
        } else {
            CropAndScaleParamsProvider.CropAndScaleParams cropAndScaleParamsCalculate = this.cropAndScaleParamsProvider.calculate(width, height, i, this.height);
            bufferCropAndScale = videoFrame.getBuffer().cropAndScale(cropAndScaleParamsCalculate.getCropX(), cropAndScaleParamsCalculate.getCropY(), cropAndScaleParamsCalculate.getCropWidth(), cropAndScaleParamsCalculate.getCropHeight(), cropAndScaleParamsCalculate.getScaleWidth(), cropAndScaleParamsCalculate.getScaleHeight());
            buffer = bufferCropAndScale;
        }
        VideoFrame videoFrame2 = new VideoFrame(buffer, videoFrame.getRotation(), videoFrame.getTimestampNs(), videoFrame.getCompactParticipantId());
        boolean z3 = false;
        for (EncodedImage.FrameType frameType : encodeInfo.frameTypes) {
            if (frameType == EncodedImage.FrameType.VideoFrameKey) {
                z3 = true;
            }
        }
        if (z3 || shouldForceKeyFrame(videoFrame.getTimestampNs())) {
            requestKeyFrame(videoFrame.getTimestampNs());
        }
        EncodedImage.Builder rotation = EncodedImage.builder().setCaptureTimeNs(videoFrame2.getTimestampNs()).setEncodedWidth(videoFrame2.getBuffer().getWidth()).setEncodedHeight(videoFrame2.getBuffer().getHeight()).setRotation(videoFrame2.getRotation());
        long j = this.nextPresentationTimestampUs;
        this.nextPresentationTimestampUs += (long) (1000000.0d / this.bitrateAdjuster.getAdjustedFramerateFps());
        VideoCodecStatus videoCodecStatusEncodeTextureBuffer = this.useSurfaceMode ? encodeTextureBuffer(videoFrame2, j, rotation) : encodeByteBuffer(videoFrame2, j, rotation);
        if (bufferCropAndScale != null) {
            bufferCropAndScale.release();
        }
        return videoCodecStatusEncodeTextureBuffer;
    }

    @Override // org.webrtc.HardwareVideoEncoder, org.webrtc.VideoEncoder
    public VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
        int i;
        this.encodeThreadChecker.checkIsOnValidThread();
        this.callback = callback;
        this.automaticResizeOn = settings.automaticResizeOn;
        Size sizeCalculateAlignment = this.cropAndScaleParamsProvider.calculateAlignment(new Size(settings.width, settings.height));
        this.width = sizeCalculateAlignment.width;
        this.height = sizeCalculateAlignment.height;
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

    /* JADX WARN: Code duplicated, block: B:38:0x00d2 A[Catch: all -> 0x006c, TryCatch #3 {all -> 0x006c, blocks: (B:9:0x0031, B:12:0x004d, B:14:0x0051, B:16:0x0068, B:21:0x0078, B:23:0x0096, B:27:0x00a5, B:38:0x00d2, B:32:0x00b4, B:34:0x00bc, B:35:0x00cb, B:39:0x00d9, B:41:0x00e4, B:42:0x00e9, B:44:0x00ef, B:45:0x00f6, B:19:0x006f, B:20:0x0075), top: B:57:0x0031 }] */
    @Override // org.webrtc.HardwareVideoEncoder
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
                if (!HardwareVideoEncoder.ODKL_CHANGE_CBR_BEHAVIOR) {
                    mediaFormatCreateVideoFormat.setInteger("bitrate-mode", 2);
                } else if (HardwareVideoEncoder.ODKL_CBR_SUPPORTED_CHECK) {
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
                HandlerThread handlerThread = new HandlerThread("HWEncoderCodec-" + this.codecName + "-" + hashCode());
                this.codecThread = handlerThread;
                handlerThread.start();
                Handler handler = new Handler(this.codecThread.getLooper());
                this.codecHandler = handler;
                callAndWait(handler, new vs4(this, 7, mediaFormatCreateVideoFormat));
                this.running = true;
                this.outputThreadChecker.detachThread();
                Thread threadCreateOutputThread = createOutputThread();
                this.outputThread = threadCreateOutputThread;
                threadCreateOutputThread.start();
                return VideoCodecStatus.OK;
            } catch (Throwable th) {
                Logging.e(TAG, "initEncodeInternal failed", th);
                this.exceptionHandler.handle(th);
                release();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (IOException | IllegalArgumentException | IllegalStateException e) {
            Logging.e(TAG, "Cannot create media encoder " + this.codecName, e);
            this.exceptionHandler.handle(e);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    @Override // org.webrtc.HardwareVideoEncoder, org.webrtc.VideoEncoder
    public VideoCodecStatus release() {
        VideoCodecStatus videoCodecStatus;
        this.encodeThreadChecker.checkIsOnValidThread();
        VideoCodecStatus videoCodecStatus2 = VideoCodecStatus.TARGET_BITRATE_OVERSHOOT;
        if (this.outputThread == null) {
            videoCodecStatus = VideoCodecStatus.OK;
        } else {
            this.running = false;
            if (ThreadUtils.joinUninterruptibly(this.outputThread, 5000L)) {
                videoCodecStatus = VideoCodecStatus.OK;
            } else {
                Logging.e(TAG, "Media encoder release timeout");
                videoCodecStatus = VideoCodecStatus.TIMEOUT;
            }
        }
        VideoCodecStatus videoCodecStatusReleaseCodecThread = releaseCodecThread();
        this.outputThread = null;
        this.encodeThreadChecker.detachThread();
        VideoCodecStatus videoCodecStatus3 = VideoCodecStatus.OK;
        if (videoCodecStatus != videoCodecStatus3) {
            return videoCodecStatus;
        }
        if (videoCodecStatusReleaseCodecThread != videoCodecStatus3) {
            return videoCodecStatusReleaseCodecThread;
        }
        if (this.shutdownException == null) {
            return videoCodecStatus3;
        }
        Logging.e(TAG, "Media encoder release exception", this.shutdownException);
        return VideoCodecStatus.ERROR;
    }

    public VideoCodecStatus releaseCodecThread() {
        Logging.d(TAG, "Releasing Codec on input thread");
        VideoCodecStatus videoCodecStatus = VideoCodecStatus.OK;
        Handler handler = this.codecHandler;
        HandlerThread handlerThread = this.codecThread;
        this.codecHandler = null;
        this.codecThread = null;
        if (handler != null) {
            try {
                handler.removeCallbacksAndMessages(null);
                callAndWait(handler, new qt7(0));
                videoCodecStatus = (VideoCodecStatus) callAndWait(handler, new pt7(this, 1));
            } catch (Throwable th) {
                Logging.e(TAG, "Media encoder release exception ", th);
                this.exceptionHandler.handle(th);
                videoCodecStatus = VideoCodecStatus.ERROR;
            }
        }
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        if (!ThreadUtils.joinUninterruptibly(handlerThread, 5000L)) {
            Logging.e(TAG, "CodecThead interrupt timeout");
        }
        return videoCodecStatus;
    }

    @Override // org.webrtc.HardwareVideoEncoder
    public void requestKeyFrame(long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        Handler handler = this.codecHandler;
        if (handler == null) {
            return;
        }
        handler.post(new kb0(this, j, 3));
    }

    @Override // org.webrtc.HardwareVideoEncoder
    public VideoCodecStatus updateBitrate() {
        Handler handler = this.codecHandler;
        if (handler == null) {
            return VideoCodecStatus.ERROR;
        }
        try {
            return (VideoCodecStatus) callAndWait(handler, new pt7(this, 0));
        } catch (Throwable th) {
            Logging.e(TAG, "updateBitrate failed", th);
            this.exceptionHandler.handle(th);
            return VideoCodecStatus.ERROR;
        }
    }
}
