package org.webrtc;

import android.media.MediaRecorder;
import defpackage.ore;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface CameraVideoCapturer extends VideoCapturer {

    public interface CameraConfigurationProvider {
        boolean isCrashOnCameraCloseRequired();
    }

    public interface CameraEventsHandler {
        void onCameraClosed();

        void onCameraDisconnected();

        default void onCameraError(String str) {
            onCameraError(str, null);
        }

        void onCameraError(String str, Throwable th);

        void onCameraFreezed(String str);

        void onCameraOpening(String str);

        void onFirstFrameAvailable();
    }

    public static class CameraStatistics {
        private static final int CAMERA_FREEZE_REPORT_TIMOUT_MS = 4000;
        private static final int CAMERA_OBSERVER_PERIOD_MS = 2000;
        private static final String TAG = "CameraStatistics";
        private final Runnable cameraObserver;
        private final CameraEventsHandler eventsHandler;
        private int frameCount;
        private int freezePeriodCount;
        private final SurfaceTextureHelper surfaceTextureHelper;

        public CameraStatistics(SurfaceTextureHelper surfaceTextureHelper, CameraEventsHandler cameraEventsHandler) {
            Runnable runnable = new Runnable() { // from class: org.webrtc.CameraVideoCapturer.CameraStatistics.1
                @Override // java.lang.Runnable
                public void run() {
                    Logging.d(CameraStatistics.TAG, "Camera fps: " + Math.round((CameraStatistics.this.frameCount * 1000.0f) / 2000.0f) + ".");
                    int i = CameraStatistics.this.frameCount;
                    CameraStatistics cameraStatistics = CameraStatistics.this;
                    if (i == 0) {
                        cameraStatistics.freezePeriodCount++;
                        if (CameraStatistics.this.freezePeriodCount * CameraStatistics.CAMERA_OBSERVER_PERIOD_MS >= 4000 && CameraStatistics.this.eventsHandler != null) {
                            Logging.e(CameraStatistics.TAG, "Camera freezed.");
                            boolean zIsTextureInUse = CameraStatistics.this.surfaceTextureHelper.isTextureInUse();
                            CameraStatistics cameraStatistics2 = CameraStatistics.this;
                            if (zIsTextureInUse) {
                                cameraStatistics2.eventsHandler.onCameraFreezed("Camera failure. Client must return video buffers.");
                                return;
                            } else {
                                cameraStatistics2.eventsHandler.onCameraFreezed("Camera failure.");
                                return;
                            }
                        }
                    } else {
                        cameraStatistics.freezePeriodCount = 0;
                    }
                    CameraStatistics.this.frameCount = 0;
                    CameraStatistics.this.surfaceTextureHelper.getHandler().postDelayed(this, 2000L);
                }
            };
            this.cameraObserver = runnable;
            if (surfaceTextureHelper == null) {
                ore.p("SurfaceTextureHelper is null");
                throw null;
            }
            this.surfaceTextureHelper = surfaceTextureHelper;
            this.eventsHandler = cameraEventsHandler;
            this.frameCount = 0;
            this.freezePeriodCount = 0;
            surfaceTextureHelper.getHandler().postDelayed(runnable, 2000L);
        }

        private void checkThread() {
            if (Thread.currentThread() == this.surfaceTextureHelper.getHandler().getLooper().getThread()) {
                return;
            }
            ore.k("Wrong thread");
        }

        public void addFrame() {
            checkThread();
            this.frameCount++;
        }

        public void release() {
            this.surfaceTextureHelper.getHandler().removeCallbacks(this.cameraObserver);
        }
    }

    public interface CameraSwitchHandler {
        void onCameraSwitchDone(boolean z);

        void onCameraSwitchError(String str);
    }

    public interface CaptureFormatHelper {
        default CameraEnumerationAndroid.CaptureFormat.FramerateRange getClosestSupportedFramerateRange(List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> list, int i) {
            return CameraEnumerationAndroid.getClosestSupportedFramerateRange(list, i);
        }

        default Size getClosestSupportedSize(List<Size> list, int i, int i2) {
            return CameraEnumerationAndroid.getClosestSupportedSize(list, i, i2);
        }
    }

    @Deprecated
    public interface MediaRecorderHandler {
        void onMediaRecorderError(String str);

        void onMediaRecorderSuccess();
    }

    @Deprecated
    default void addMediaRecorderToCamera(MediaRecorder mediaRecorder, MediaRecorderHandler mediaRecorderHandler) {
        throw new UnsupportedOperationException("Deprecated and not implemented.");
    }

    @Deprecated
    default void removeMediaRecorderFromCamera(MediaRecorderHandler mediaRecorderHandler) {
        throw new UnsupportedOperationException("Deprecated and not implemented.");
    }

    void switchCamera(CameraSwitchHandler cameraSwitchHandler);

    void switchCamera(CameraSwitchHandler cameraSwitchHandler, String str);
}
