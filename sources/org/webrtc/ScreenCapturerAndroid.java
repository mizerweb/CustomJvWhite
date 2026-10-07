package org.webrtc;

import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import defpackage.c4f;
import defpackage.ore;

/* JADX INFO: loaded from: classes3.dex */
public class ScreenCapturerAndroid implements VideoCapturer, VideoSink {
    private static final int DISPLAY_FLAGS = 3;
    public static final int FRAME_RESUBMIT_DELAY_MILLIS = 200;
    private static final int VIRTUAL_DISPLAY_DPI = 400;
    private CapturerObserver capturerObserver;
    private int height;
    private boolean isDisposed;
    private long lastNewFrameSystemtime;
    private long lastNewFrameTimestamp;
    private MediaProjection mediaProjection;
    private final MediaProjection.Callback mediaProjectionCallback;
    private MediaProjectionManager mediaProjectionManager;
    private final Intent mediaProjectionPermissionResultData;
    private long numCapturedFrames;
    private final Runnable rerequestTextureFrame = new c4f(this, 0);
    private SurfaceTextureHelper surfaceTextureHelper;
    private VirtualDisplay virtualDisplay;
    private int width;

    /* JADX INFO: renamed from: org.webrtc.ScreenCapturerAndroid$1 */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ScreenCapturerAndroid.this.surfaceTextureHelper.stopListening();
            ScreenCapturerAndroid.this.capturerObserver.onCapturerStopped();
            if (ScreenCapturerAndroid.this.virtualDisplay != null) {
                ScreenCapturerAndroid.this.virtualDisplay.release();
                ScreenCapturerAndroid.this.virtualDisplay = null;
            }
            if (ScreenCapturerAndroid.this.mediaProjection != null) {
                ScreenCapturerAndroid.this.mediaProjection.unregisterCallback(ScreenCapturerAndroid.this.mediaProjectionCallback);
                ScreenCapturerAndroid.this.mediaProjection.stop();
                ScreenCapturerAndroid.this.mediaProjection = null;
            }
        }
    }

    public ScreenCapturerAndroid(Intent intent, MediaProjection.Callback callback) {
        this.mediaProjectionPermissionResultData = intent;
        this.mediaProjectionCallback = callback;
    }

    private VideoFrame adjustTs(VideoFrame videoFrame) {
        long jMax;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        long timestampNs = videoFrame.getTimestampNs();
        long j = this.lastNewFrameTimestamp;
        if (timestampNs > j) {
            if (j == 0) {
                jMax = videoFrame.getTimestampNs();
            } else {
                jMax = Math.max(videoFrame.getTimestampNs(), (jElapsedRealtimeNanos - this.lastNewFrameSystemtime) + this.lastNewFrameTimestamp);
            }
            this.lastNewFrameTimestamp = jMax;
            this.lastNewFrameSystemtime = jElapsedRealtimeNanos;
        } else {
            jMax = (jElapsedRealtimeNanos - this.lastNewFrameSystemtime) + j;
        }
        return videoFrame.getTimestampNs() == jMax ? videoFrame : new VideoFrame(videoFrame.getBuffer(), videoFrame.getRotation(), jMax);
    }

    private void checkNotDisposed() {
        if (this.isDisposed) {
            ore.q("capturer is disposed.");
        }
    }

    private void createVirtualDisplay() {
        VirtualDisplay virtualDisplay = this.virtualDisplay;
        if (virtualDisplay != null) {
            virtualDisplay.release();
        }
        this.virtualDisplay = this.mediaProjection.createVirtualDisplay("WebRTC_ScreenCapture", this.width, this.height, 400, 3, new Surface(this.surfaceTextureHelper.getSurfaceTexture()), null, null);
    }

    public /* synthetic */ void lambda$new$0() {
        this.surfaceTextureHelper.deliverFrame();
    }

    public void updateVirtualDisplay() {
        this.surfaceTextureHelper.setTextureSize(this.width, this.height);
        VirtualDisplay virtualDisplay = this.virtualDisplay;
        if (virtualDisplay == null || Build.VERSION.SDK_INT < 31) {
            createVirtualDisplay();
        } else {
            virtualDisplay.resize(this.width, this.height, 400);
            this.virtualDisplay.setSurface(new Surface(this.surfaceTextureHelper.getSurfaceTexture()));
        }
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void changeCaptureFormat(int i, int i2, int i3) {
        checkNotDisposed();
        this.width = i;
        this.height = i2;
        if (this.virtualDisplay == null) {
            return;
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new c4f(this, 1));
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void dispose() {
        this.isDisposed = true;
        SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.getHandler().removeCallbacks(this.rerequestTextureFrame);
        }
    }

    public MediaProjection getMediaProjection() {
        return this.mediaProjection;
    }

    public long getNumCapturedFrames() {
        return this.numCapturedFrames;
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        checkNotDisposed();
        if (capturerObserver == null) {
            throw new RuntimeException("capturerObserver not set.");
        }
        this.capturerObserver = capturerObserver;
        if (surfaceTextureHelper == null) {
            throw new RuntimeException("surfaceTextureHelper not set.");
        }
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.mediaProjectionManager = (MediaProjectionManager) context.getSystemService("media_projection");
    }

    @Override // org.webrtc.VideoCapturer
    public boolean isScreencast() {
        return true;
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        this.numCapturedFrames++;
        if (!this.isDisposed) {
            Handler handler = this.surfaceTextureHelper.getHandler();
            handler.removeCallbacks(this.rerequestTextureFrame);
            handler.postDelayed(this.rerequestTextureFrame, 200L);
            if (this.isDisposed) {
                handler.removeCallbacks(this.rerequestTextureFrame);
            }
        }
        this.capturerObserver.onFrameCaptured(adjustTs(videoFrame));
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void startCapture(int i, int i2, int i3) {
        checkNotDisposed();
        this.width = i;
        this.height = i2;
        MediaProjection mediaProjection = this.mediaProjectionManager.getMediaProjection(-1, this.mediaProjectionPermissionResultData);
        this.mediaProjection = mediaProjection;
        mediaProjection.registerCallback(this.mediaProjectionCallback, this.surfaceTextureHelper.getHandler());
        updateVirtualDisplay();
        this.capturerObserver.onCapturerStarted(true);
        this.surfaceTextureHelper.startListening(this);
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void stopCapture() {
        checkNotDisposed();
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new Runnable() { // from class: org.webrtc.ScreenCapturerAndroid.1
            public AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ScreenCapturerAndroid.this.surfaceTextureHelper.stopListening();
                ScreenCapturerAndroid.this.capturerObserver.onCapturerStopped();
                if (ScreenCapturerAndroid.this.virtualDisplay != null) {
                    ScreenCapturerAndroid.this.virtualDisplay.release();
                    ScreenCapturerAndroid.this.virtualDisplay = null;
                }
                if (ScreenCapturerAndroid.this.mediaProjection != null) {
                    ScreenCapturerAndroid.this.mediaProjection.unregisterCallback(ScreenCapturerAndroid.this.mediaProjectionCallback);
                    ScreenCapturerAndroid.this.mediaProjection.stop();
                    ScreenCapturerAndroid.this.mediaProjection = null;
                }
            }
        });
    }
}
