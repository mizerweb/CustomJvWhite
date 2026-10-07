package org.webrtc;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import defpackage.ai;
import defpackage.kch;
import defpackage.ore;
import defpackage.q31;
import defpackage.zo5;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public class SurfaceTextureHelper {
    private static final String TAG = "SurfaceTextureHelper";
    private final EglBase eglBase;
    private final FrameRefMonitor frameRefMonitor;
    private int frameRotation;
    private final FrameGeometryAdjuster geometryAdjuster;
    private final Handler handler;
    private boolean hasPendingTexture;
    private boolean isQuitting;
    private volatile boolean isTextureInUse;
    private VideoSink listener;
    private final int oesTextureId;
    private VideoSink pendingListener;
    final Runnable setListenerRunnable;
    private final SurfaceTexture surfaceTexture;
    private int textureHeight;
    private final TextureBufferImpl.RefCountMonitor textureRefCountMonitor;
    private int textureWidth;
    private final TimestampAligner timestampAligner;
    private final YuvConverter yuvConverter;

    /* JADX INFO: renamed from: org.webrtc.SurfaceTextureHelper$1 */
    public class AnonymousClass1 implements Callable<SurfaceTextureHelper> {
        final /* synthetic */ boolean val$alignTimestamps;
        final /* synthetic */ FrameRefMonitor val$frameRefMonitor;
        final /* synthetic */ FrameGeometryAdjuster val$geometryAdjuster;
        final /* synthetic */ Handler val$handler;
        final /* synthetic */ String val$threadName;
        final /* synthetic */ YuvConverter val$yuvConverter;

        public AnonymousClass1() {
            handler = handler;
            z = z;
            yuvConverter = yuvConverter;
            frameRefMonitor = frameRefMonitor;
            frameGeometryAdjuster = frameGeometryAdjuster;
            str = str;
        }

        @Override // java.util.concurrent.Callable
        public SurfaceTextureHelper call() {
            try {
                return new SurfaceTextureHelper(context, handler, z, yuvConverter, frameRefMonitor, frameGeometryAdjuster, 0);
            } catch (RuntimeException e) {
                Logging.e(SurfaceTextureHelper.TAG, str + " create failure", e);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: org.webrtc.SurfaceTextureHelper$2 */
    public class AnonymousClass2 implements TextureBufferImpl.RefCountMonitor {
        public AnonymousClass2() {
        }

        @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
        public void onDestroy(TextureBufferImpl textureBufferImpl) {
            SurfaceTextureHelper.this.returnTextureFrame();
            if (SurfaceTextureHelper.this.frameRefMonitor != null) {
                SurfaceTextureHelper.this.frameRefMonitor.onDestroyBuffer(textureBufferImpl);
            }
        }

        @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
        public void onRelease(TextureBufferImpl textureBufferImpl) {
            if (SurfaceTextureHelper.this.frameRefMonitor != null) {
                SurfaceTextureHelper.this.frameRefMonitor.onReleaseBuffer(textureBufferImpl);
            }
        }

        @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
        public void onRetain(TextureBufferImpl textureBufferImpl) {
            if (SurfaceTextureHelper.this.frameRefMonitor != null) {
                SurfaceTextureHelper.this.frameRefMonitor.onRetainBuffer(textureBufferImpl);
            }
        }
    }

    /* JADX INFO: renamed from: org.webrtc.SurfaceTextureHelper$3 */
    public class AnonymousClass3 implements Runnable {
        public AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Logging.d(SurfaceTextureHelper.TAG, "Setting listener to ".concat(String.valueOf(SurfaceTextureHelper.this.pendingListener)));
            SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
            surfaceTextureHelper.listener = surfaceTextureHelper.pendingListener;
            SurfaceTextureHelper.this.pendingListener = null;
            if (SurfaceTextureHelper.this.hasPendingTexture) {
                SurfaceTextureHelper.this.updateTexImage();
                SurfaceTextureHelper.this.hasPendingTexture = false;
            }
        }
    }

    public static class FrameGeometry {
        public final int height;
        public final int scaledHeight;
        public final int scaledWidth;
        public final Matrix transform;
        public final int width;

        public FrameGeometry(int i, int i2, int i3, int i4, Matrix matrix) {
            this.width = i;
            this.height = i2;
            this.scaledWidth = i3;
            this.scaledHeight = i4;
            this.transform = matrix;
        }
    }

    public interface FrameGeometryAdjuster {
        FrameGeometry adjustFrameGeometry(Matrix matrix, int i, int i2);
    }

    public interface FrameRefMonitor {
        void onDestroyBuffer(VideoFrame.TextureBuffer textureBuffer);

        void onNewBuffer(VideoFrame.TextureBuffer textureBuffer);

        void onReleaseBuffer(VideoFrame.TextureBuffer textureBuffer);

        void onRetainBuffer(VideoFrame.TextureBuffer textureBuffer);
    }

    private SurfaceTextureHelper(EglBase.Context context, Handler handler, boolean z, YuvConverter yuvConverter, FrameRefMonitor frameRefMonitor, FrameGeometryAdjuster frameGeometryAdjuster) {
        this.textureRefCountMonitor = new TextureBufferImpl.RefCountMonitor() { // from class: org.webrtc.SurfaceTextureHelper.2
            public AnonymousClass2() {
            }

            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onDestroy(TextureBufferImpl textureBufferImpl) {
                SurfaceTextureHelper.this.returnTextureFrame();
                if (SurfaceTextureHelper.this.frameRefMonitor != null) {
                    SurfaceTextureHelper.this.frameRefMonitor.onDestroyBuffer(textureBufferImpl);
                }
            }

            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onRelease(TextureBufferImpl textureBufferImpl) {
                if (SurfaceTextureHelper.this.frameRefMonitor != null) {
                    SurfaceTextureHelper.this.frameRefMonitor.onReleaseBuffer(textureBufferImpl);
                }
            }

            @Override // org.webrtc.TextureBufferImpl.RefCountMonitor
            public void onRetain(TextureBufferImpl textureBufferImpl) {
                if (SurfaceTextureHelper.this.frameRefMonitor != null) {
                    SurfaceTextureHelper.this.frameRefMonitor.onRetainBuffer(textureBufferImpl);
                }
            }
        };
        this.setListenerRunnable = new Runnable() { // from class: org.webrtc.SurfaceTextureHelper.3
            public AnonymousClass3() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Logging.d(SurfaceTextureHelper.TAG, "Setting listener to ".concat(String.valueOf(SurfaceTextureHelper.this.pendingListener)));
                SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                surfaceTextureHelper.listener = surfaceTextureHelper.pendingListener;
                SurfaceTextureHelper.this.pendingListener = null;
                if (SurfaceTextureHelper.this.hasPendingTexture) {
                    SurfaceTextureHelper.this.updateTexImage();
                    SurfaceTextureHelper.this.hasPendingTexture = false;
                }
            }
        };
        if (handler.getLooper().getThread() != Thread.currentThread()) {
            ore.k("SurfaceTextureHelper must be created on the handler thread");
            throw null;
        }
        this.handler = handler;
        this.timestampAligner = z ? new TimestampAligner() : null;
        this.geometryAdjuster = frameGeometryAdjuster;
        this.yuvConverter = yuvConverter;
        this.frameRefMonitor = frameRefMonitor;
        EglBase eglBaseCreate = EglBase.create(context, EglBase.CONFIG_PIXEL_BUFFER);
        this.eglBase = eglBaseCreate;
        try {
            eglBaseCreate.createDummyPbufferSurface();
            eglBaseCreate.makeCurrent();
            int iGenerateTexture = GlUtil.generateTexture(36197);
            this.oesTextureId = iGenerateTexture;
            SurfaceTexture surfaceTexture = new SurfaceTexture(iGenerateTexture);
            this.surfaceTexture = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: lch
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                    this.a.lambda$new$0(surfaceTexture2);
                }
            }, handler);
        } catch (RuntimeException e) {
            this.eglBase.release();
            handler.getLooper().quit();
            throw e;
        }
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context, boolean z, YuvConverter yuvConverter, FrameRefMonitor frameRefMonitor, FrameGeometryAdjuster frameGeometryAdjuster) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        return (SurfaceTextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<SurfaceTextureHelper>() { // from class: org.webrtc.SurfaceTextureHelper.1
            final /* synthetic */ boolean val$alignTimestamps;
            final /* synthetic */ FrameRefMonitor val$frameRefMonitor;
            final /* synthetic */ FrameGeometryAdjuster val$geometryAdjuster;
            final /* synthetic */ Handler val$handler;
            final /* synthetic */ String val$threadName;
            final /* synthetic */ YuvConverter val$yuvConverter;

            public AnonymousClass1() {
                handler = handler;
                z = z;
                yuvConverter = yuvConverter;
                frameRefMonitor = frameRefMonitor;
                frameGeometryAdjuster = frameGeometryAdjuster;
                str = str;
            }

            @Override // java.util.concurrent.Callable
            public SurfaceTextureHelper call() {
                try {
                    return new SurfaceTextureHelper(context, handler, z, yuvConverter, frameRefMonitor, frameGeometryAdjuster, 0);
                } catch (RuntimeException e) {
                    Logging.e(SurfaceTextureHelper.TAG, str + " create failure", e);
                    return null;
                }
            }
        });
    }

    private VideoFrame.TextureBuffer createFrameBuffer(int i, int i2, VideoFrame.TextureBuffer.Type type, int i3, Matrix matrix, Handler handler, YuvConverter yuvConverter, TextureBufferImpl.RefCountMonitor refCountMonitor) {
        Matrix matrix2;
        FrameGeometry frameGeometryAdjustFrameGeometry;
        FrameGeometryAdjuster frameGeometryAdjuster = this.geometryAdjuster;
        if (frameGeometryAdjuster != null) {
            matrix2 = matrix;
            frameGeometryAdjustFrameGeometry = frameGeometryAdjuster.adjustFrameGeometry(matrix2, i, i2);
        } else {
            matrix2 = matrix;
            frameGeometryAdjustFrameGeometry = null;
        }
        return frameGeometryAdjustFrameGeometry != null ? new TextureBufferImpl(frameGeometryAdjustFrameGeometry.width, frameGeometryAdjustFrameGeometry.height, frameGeometryAdjustFrameGeometry.scaledWidth, frameGeometryAdjustFrameGeometry.scaledHeight, type, i3, frameGeometryAdjustFrameGeometry.transform, handler, yuvConverter, refCountMonitor) : new TextureBufferImpl(i, i2, type, i3, matrix2, handler, yuvConverter, refCountMonitor);
    }

    public /* synthetic */ void lambda$dispose$6() {
        this.isQuitting = true;
        if (this.isTextureInUse) {
            return;
        }
        release();
    }

    public /* synthetic */ void lambda$forceFrame$3() {
        this.hasPendingTexture = true;
        tryDeliverTextureFrame();
    }

    public /* synthetic */ void lambda$new$0(SurfaceTexture surfaceTexture) {
        if (this.hasPendingTexture) {
            Logging.d(TAG, "A frame is already pending, dropping frame.");
        }
        this.hasPendingTexture = true;
        tryDeliverTextureFrame();
    }

    public /* synthetic */ void lambda$returnTextureFrame$5() {
        this.isTextureInUse = false;
        if (this.isQuitting) {
            release();
        } else {
            tryDeliverTextureFrame();
        }
    }

    public /* synthetic */ void lambda$setFrameRotation$4(int i) {
        this.frameRotation = i;
    }

    public /* synthetic */ void lambda$setTextureSize$2(int i, int i2) {
        this.textureWidth = i;
        this.textureHeight = i2;
        tryDeliverTextureFrame();
    }

    public /* synthetic */ void lambda$stopListening$1() {
        this.listener = null;
        this.pendingListener = null;
    }

    private void release() {
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            ore.k("Wrong thread.");
            return;
        }
        if (this.isTextureInUse || !this.isQuitting) {
            ore.k("Unexpected release.");
            return;
        }
        this.yuvConverter.release();
        GLES20.glDeleteTextures(1, new int[]{this.oesTextureId}, 0);
        this.surfaceTexture.release();
        this.eglBase.release();
        this.handler.getLooper().quit();
        TimestampAligner timestampAligner = this.timestampAligner;
        if (timestampAligner != null) {
            timestampAligner.dispose();
        }
    }

    public void returnTextureFrame() {
        this.handler.post(new kch(this, 2));
    }

    private void tryDeliverTextureFrame() {
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            ore.k("Wrong thread.");
            return;
        }
        if (this.isQuitting || !this.hasPendingTexture || this.isTextureInUse || this.listener == null) {
            return;
        }
        if (this.textureWidth == 0 || this.textureHeight == 0) {
            Logging.w(TAG, "Texture size has not been set.");
            return;
        }
        this.isTextureInUse = true;
        this.hasPendingTexture = false;
        updateTexImage();
        float[] fArr = new float[16];
        this.surfaceTexture.getTransformMatrix(fArr);
        long timestamp = this.surfaceTexture.getTimestamp();
        TimestampAligner timestampAligner = this.timestampAligner;
        if (timestampAligner != null) {
            timestamp = timestampAligner.translateTimestamp(timestamp);
        }
        VideoFrame.TextureBuffer textureBufferCreateFrameBuffer = createFrameBuffer(this.textureWidth, this.textureHeight, VideoFrame.TextureBuffer.Type.OES, this.oesTextureId, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), this.handler, this.yuvConverter, this.textureRefCountMonitor);
        FrameRefMonitor frameRefMonitor = this.frameRefMonitor;
        if (frameRefMonitor != null) {
            frameRefMonitor.onNewBuffer(textureBufferCreateFrameBuffer);
        }
        VideoFrame videoFrame = new VideoFrame(textureBufferCreateFrameBuffer, this.frameRotation, timestamp);
        this.listener.onFrame(videoFrame);
        videoFrame.release();
    }

    public void updateTexImage() {
        synchronized (EglBase.lock) {
            this.surfaceTexture.updateTexImage();
        }
    }

    public void deliverFrame() {
        if (this.hasPendingTexture) {
            Logging.d(TAG, "A frame is already pending, dropping frame.");
        }
        this.hasPendingTexture = true;
        tryDeliverTextureFrame();
    }

    public void dispose() {
        Logging.d(TAG, "dispose()");
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new kch(this, 1));
    }

    public void forceFrame() {
        this.handler.post(new kch(this, 3));
    }

    public Handler getHandler() {
        return this.handler;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.surfaceTexture;
    }

    public boolean isTextureInUse() {
        return this.isTextureInUse;
    }

    public void setFrameRotation(int i) {
        this.handler.post(new ai(this, i, 22));
    }

    public void setTextureSize(int i, int i2) {
        if (i <= 0) {
            ore.p(zo5.h(i, "Texture width must be positive, but was "));
        } else if (i2 <= 0) {
            ore.p(zo5.h(i2, "Texture height must be positive, but was "));
        } else {
            this.surfaceTexture.setDefaultBufferSize(i, i2);
            this.handler.post(new q31(this, i, i2, 7));
        }
    }

    public void startListening(VideoSink videoSink) {
        if (this.listener != null || this.pendingListener != null) {
            ore.k("SurfaceTextureHelper listener has already been set.");
        } else {
            this.pendingListener = videoSink;
            this.handler.post(this.setListenerRunnable);
        }
    }

    public void stopListening() {
        Logging.d(TAG, "stopListening()");
        this.handler.removeCallbacks(this.setListenerRunnable);
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new kch(this, 0));
    }

    @Deprecated
    public VideoFrame.I420Buffer textureToYuv(VideoFrame.TextureBuffer textureBuffer) {
        return textureBuffer.toI420();
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context, boolean z, YuvConverter yuvConverter, FrameRefMonitor frameRefMonitor) {
        return create(str, context, false, new YuvConverter(), frameRefMonitor, null);
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context) {
        return create(str, context, false, new YuvConverter(), null);
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context, boolean z) {
        return create(str, context, z, new YuvConverter(), null);
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context, boolean z, YuvConverter yuvConverter) {
        return create(str, context, z, yuvConverter, null);
    }

    public /* synthetic */ SurfaceTextureHelper(EglBase.Context context, Handler handler, boolean z, YuvConverter yuvConverter, FrameRefMonitor frameRefMonitor, FrameGeometryAdjuster frameGeometryAdjuster, int i) {
        this(context, handler, z, yuvConverter, frameRefMonitor, frameGeometryAdjuster);
    }
}
