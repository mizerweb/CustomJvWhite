package org.webrtc;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.util.Range;
import android.view.Surface;
import defpackage.nbh;
import defpackage.ore;
import defpackage.qt4;
import defpackage.qv1;
import defpackage.zo5;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class Camera2Session implements CameraSession {
    private static final String TAG = "Camera2Session";
    private final Context applicationContext;
    private final CameraSession.CreateSessionCallback callback;
    private CameraCharacteristics cameraCharacteristics;
    private CameraDevice cameraDevice;
    private final String cameraId;
    private final CameraManager cameraManager;
    private int cameraOrientation;
    private final Handler cameraThreadHandler;
    private CameraEnumerationAndroid.CaptureFormat captureFormat;
    private final CameraVideoCapturer.CaptureFormatHelper captureFormatHelper;
    private CameraCaptureSession captureSession;
    private final CameraSession.ConfigurationProvider config;
    private final long constructionTimeNs;
    private final CameraSession.Events events;
    private boolean firstFrameReported;
    private int fpsUnitFactor;
    private final int framerate;
    private final int height;
    private boolean isCameraFrontFacing;
    private Surface surface;
    private final SurfaceTextureHelper surfaceTextureHelper;
    private final int width;
    private static final Histogram camera2StartTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera2.StartTimeMs", 1, 10000, 50);
    private static final Histogram camera2StopTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera2.StopTimeMs", 1, 10000, 50);
    private static final Histogram camera2ResolutionHistogram = Histogram.createEnumeration("WebRTC.Android.Camera2.Resolution", CameraEnumerationAndroid.COMMON_RESOLUTIONS.size());
    private SessionState state = SessionState.RUNNING;
    private volatile ProcessInfo infoOnStart = ProcessInfo.DUMMY;

    /* JADX INFO: renamed from: org.webrtc.Camera2Session$1 */
    public class AnonymousClass1 implements CameraVideoCapturer.CaptureFormatHelper {
        public AnonymousClass1() {
        }
    }

    public enum SessionState {
        RUNNING,
        STOPPED
    }

    private Camera2Session(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, CameraSession.ConfigurationProvider configurationProvider, Context context, CameraManager cameraManager, SurfaceTextureHelper surfaceTextureHelper, String str, CameraVideoCapturer.CaptureFormatHelper captureFormatHelper, int i, int i2, int i3) {
        Logging.d(TAG, "Create new camera2 session on camera " + str);
        this.constructionTimeNs = System.nanoTime();
        this.captureFormatHelper = captureFormatHelper == null ? new CameraVideoCapturer.CaptureFormatHelper() { // from class: org.webrtc.Camera2Session.1
            public AnonymousClass1() {
            }
        } : captureFormatHelper;
        this.cameraThreadHandler = new Handler();
        this.callback = createSessionCallback;
        this.events = events;
        this.config = configurationProvider;
        this.applicationContext = context;
        this.cameraManager = cameraManager;
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.cameraId = str;
        this.width = i;
        this.height = i2;
        this.framerate = i3;
        start();
    }

    public void checkIsOnCameraThread() {
        if (Thread.currentThread() == this.cameraThreadHandler.getLooper().getThread()) {
            return;
        }
        ore.k("Wrong thread");
    }

    public static void create(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, CameraSession.ConfigurationProvider configurationProvider, Context context, CameraManager cameraManager, SurfaceTextureHelper surfaceTextureHelper, String str, CameraVideoCapturer.CaptureFormatHelper captureFormatHelper, int i, int i2, int i3) {
        new Camera2Session(createSessionCallback, events, configurationProvider, context, cameraManager, surfaceTextureHelper, str, captureFormatHelper, i, i2, i3);
    }

    private void findCaptureFormat() {
        checkIsOnCameraThread();
        Range[] rangeArr = (Range[]) this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        int fpsUnitFactor = Camera2Enumerator.getFpsUnitFactor(rangeArr);
        this.fpsUnitFactor = fpsUnitFactor;
        List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> listConvertFramerates = Camera2Enumerator.convertFramerates(rangeArr, fpsUnitFactor);
        List<Size> supportedSizes = Camera2Enumerator.getSupportedSizes(this.cameraCharacteristics);
        Logging.d(TAG, "Available preview sizes: ".concat(String.valueOf(supportedSizes)));
        Logging.d(TAG, "Available fps ranges: ".concat(String.valueOf(listConvertFramerates)));
        if (listConvertFramerates.isEmpty() || supportedSizes.isEmpty()) {
            reportError("No supported capture formats.");
            return;
        }
        CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange = this.captureFormatHelper.getClosestSupportedFramerateRange(listConvertFramerates, this.framerate);
        Size closestSupportedSize = this.captureFormatHelper.getClosestSupportedSize(supportedSizes, this.width, this.height);
        CameraEnumerationAndroid.reportCameraResolution(camera2ResolutionHistogram, closestSupportedSize);
        CameraEnumerationAndroid.CaptureFormat captureFormat = new CameraEnumerationAndroid.CaptureFormat(closestSupportedSize.width, closestSupportedSize.height, closestSupportedFramerateRange);
        this.captureFormat = captureFormat;
        Logging.d(TAG, "Using capture format: ".concat(String.valueOf(captureFormat)));
    }

    public int getFrameOrientation() {
        int deviceOrientation = CameraSession.getDeviceOrientation(this.applicationContext);
        if (!this.isCameraFrontFacing) {
            deviceOrientation = 360 - deviceOrientation;
        }
        return (this.cameraOrientation + deviceOrientation) % 360;
    }

    private void openCamera() {
        checkIsOnCameraThread();
        Logging.d(TAG, "Opening camera " + this.cameraId);
        this.events.onCameraOpening();
        try {
            this.cameraManager.openCamera(this.cameraId, new CameraStateCallback(this, 0), this.cameraThreadHandler);
        } catch (CameraAccessException | IllegalArgumentException | SecurityException e) {
            reportError("Failed to open camera: ".concat(String.valueOf(e)));
        }
    }

    public void reportError(String str) {
        checkIsOnCameraThread();
        Logging.e(TAG, "Error: " + str);
        boolean z = this.captureSession == null && this.state != SessionState.STOPPED;
        this.state = SessionState.STOPPED;
        stopInternal();
        if (z) {
            this.callback.onFailure(CameraSession.FailureType.ERROR, str);
        } else {
            this.events.onCameraError(this, str);
        }
    }

    private void start() {
        checkIsOnCameraThread();
        Logging.d(TAG, "start");
        try {
            CameraCharacteristics cameraCharacteristics = this.cameraManager.getCameraCharacteristics(this.cameraId);
            this.cameraCharacteristics = cameraCharacteristics;
            this.cameraOrientation = ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
            this.isCameraFrontFacing = ((Integer) this.cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0;
            findCaptureFormat();
            if (this.captureFormat == null) {
                return;
            }
            openCamera();
        } catch (CameraAccessException | IllegalArgumentException e) {
            reportError(qv1.k("getCameraCharacteristics(): ", e.getMessage()));
        }
    }

    public void stopInternal() {
        Logging.d(TAG, "Stop internal");
        checkIsOnCameraThread();
        this.surfaceTextureHelper.stopListening();
        if (this.captureSession != null) {
            try {
                if (this.config.isCrashOnCameraCloseRequired()) {
                    throw new SecurityException("checkPidStatus: externally required exception during camera closing");
                }
                this.captureSession.close();
                this.captureSession = null;
            } catch (SecurityException e) {
                String message = e.getMessage();
                if (message.startsWith("checkPidStatus")) {
                    message = zo5.o(message, ProcessInfo.diffToString(this.infoOnStart, ProcessInfo.create(null)));
                }
                this.events.onNonFatal(this, message, e);
            }
        }
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
            this.surface = null;
        }
        CameraDevice cameraDevice = this.cameraDevice;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.cameraDevice = null;
        }
        Logging.d(TAG, "Stop done");
    }

    @Override // org.webrtc.CameraSession
    public void stop() {
        Logging.d(TAG, "Stop camera2 session on camera " + this.cameraId);
        checkIsOnCameraThread();
        SessionState sessionState = this.state;
        SessionState sessionState2 = SessionState.STOPPED;
        if (sessionState != sessionState2) {
            long jNanoTime = System.nanoTime();
            this.state = sessionState2;
            stopInternal();
            camera2StopTimeMsHistogram.addSample((int) ((System.nanoTime() - jNanoTime) / 1000000));
        }
    }

    public static class CameraCaptureCallback extends CameraCaptureSession.CaptureCallback {
        public /* synthetic */ CameraCaptureCallback(int i) {
            this();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            Logging.d(Camera2Session.TAG, "Capture failed: ".concat(String.valueOf(captureFailure)));
        }

        private CameraCaptureCallback() {
        }
    }

    public class CameraStateCallback extends CameraDevice.StateCallback {
        private CameraStateCallback() {
        }

        private String getErrorDescription(int i) {
            if (i == 1) {
                return "Camera device is in use already.";
            }
            if (i == 2) {
                return "Camera device could not be opened because there are too many other open camera devices.";
            }
            if (i == 3) {
                return "Camera device could not be opened due to a device policy.";
            }
            if (i != 4) {
                return i != 5 ? zo5.h(i, "Unknown camera error: ") : "Camera service has encountered a fatal error.";
            }
            return "Camera device has encountered a fatal error.";
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            Camera2Session.this.checkIsOnCameraThread();
            Logging.d(Camera2Session.TAG, "Camera device closed.");
            Camera2Session.this.events.onCameraClosed(Camera2Session.this);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            Camera2Session.this.checkIsOnCameraThread();
            boolean z = Camera2Session.this.captureSession == null && Camera2Session.this.state != SessionState.STOPPED;
            Camera2Session.this.state = SessionState.STOPPED;
            Camera2Session.this.stopInternal();
            Camera2Session camera2Session = Camera2Session.this;
            if (z) {
                camera2Session.callback.onFailure(CameraSession.FailureType.DISCONNECTED, "Camera disconnected / evicted.");
            } else {
                camera2Session.events.onCameraDisconnected(Camera2Session.this);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            Camera2Session.this.checkIsOnCameraThread();
            Camera2Session.this.reportError(getErrorDescription(i));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            Camera2Session.this.checkIsOnCameraThread();
            Logging.d(Camera2Session.TAG, "Camera opened.");
            Camera2Session.this.cameraDevice = cameraDevice;
            Camera2Session.this.surfaceTextureHelper.setTextureSize(Camera2Session.this.captureFormat.width, Camera2Session.this.captureFormat.height);
            Camera2Session.this.surface = new Surface(Camera2Session.this.surfaceTextureHelper.getSurfaceTexture());
            try {
                cameraDevice.createCaptureSession(Arrays.asList(Camera2Session.this.surface), new CaptureSessionCallback(Camera2Session.this, 0), Camera2Session.this.cameraThreadHandler);
            } catch (CameraAccessException e) {
                Camera2Session.this.reportError("Failed to create capture session. ".concat(String.valueOf(e)));
            }
        }

        public /* synthetic */ CameraStateCallback(Camera2Session camera2Session, int i) {
            this();
        }
    }

    public class CaptureSessionCallback extends CameraCaptureSession.StateCallback {
        private CaptureSessionCallback() {
        }

        private void chooseFocusMode(CaptureRequest.Builder builder) {
            for (int i : (int[]) Camera2Session.this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES)) {
                if (i == 3) {
                    builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
                    Logging.d(Camera2Session.TAG, "Using continuous video auto-focus.");
                    return;
                }
            }
            Logging.d(Camera2Session.TAG, "Auto-focus is not available.");
        }

        private void chooseStabilizationMode(CaptureRequest.Builder builder) {
            int[] iArr = (int[]) Camera2Session.this.cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 1) {
                        builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
                        builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
                        Logging.d(Camera2Session.TAG, "Using optical stabilization.");
                        return;
                    }
                }
            }
            int[] iArr2 = (int[]) Camera2Session.this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
            if (iArr2 != null) {
                for (int i2 : iArr2) {
                    if (i2 == 1) {
                        builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                        builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
                        Logging.d(Camera2Session.TAG, "Using video stabilization.");
                        return;
                    }
                }
            }
            Logging.d(Camera2Session.TAG, "Stabilization not available.");
        }

        public /* synthetic */ void lambda$onConfigured$0(VideoFrame videoFrame) {
            Camera2Session.this.checkIsOnCameraThread();
            if (Camera2Session.this.state != SessionState.RUNNING) {
                Logging.d(Camera2Session.TAG, "Texture frame captured but camera is no longer running.");
                return;
            }
            if (!Camera2Session.this.firstFrameReported) {
                Camera2Session.this.firstFrameReported = true;
                Camera2Session.camera2StartTimeMsHistogram.addSample((int) ((System.nanoTime() - Camera2Session.this.constructionTimeNs) / 1000000));
            }
            VideoFrame videoFrame2 = new VideoFrame(CameraSession.createTextureBufferWithModifiedTransformMatrix((TextureBufferImpl) videoFrame.getBuffer(), Camera2Session.this.isCameraFrontFacing, -Camera2Session.this.cameraOrientation), Camera2Session.this.getFrameOrientation(), videoFrame.getTimestampNs());
            Camera2Session.this.events.onFrameCaptured(Camera2Session.this, videoFrame2);
            videoFrame2.release();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            Camera2Session.this.checkIsOnCameraThread();
            cameraCaptureSession.close();
            Camera2Session.this.reportError("Failed to configure capture session.");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Camera2Session.this.checkIsOnCameraThread();
            Logging.d(Camera2Session.TAG, "Camera capture session configured.");
            Camera2Session.this.captureSession = cameraCaptureSession;
            Camera2Session camera2Session = Camera2Session.this;
            camera2Session.infoOnStart = ProcessInfo.create(camera2Session.infoOnStart);
            try {
                CaptureRequest.Builder builderCreateCaptureRequest = Camera2Session.this.cameraDevice.createCaptureRequest(3);
                builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(Camera2Session.this.captureFormat.framerate.min / Camera2Session.this.fpsUnitFactor), Integer.valueOf(Camera2Session.this.captureFormat.framerate.max / Camera2Session.this.fpsUnitFactor)));
                builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.FALSE);
                chooseStabilizationMode(builderCreateCaptureRequest);
                chooseFocusMode(builderCreateCaptureRequest);
                builderCreateCaptureRequest.addTarget(Camera2Session.this.surface);
                cameraCaptureSession.setRepeatingRequest(builderCreateCaptureRequest.build(), new CameraCaptureCallback(0), Camera2Session.this.cameraThreadHandler);
                Camera2Session.this.surfaceTextureHelper.startListening(new a(1, this));
                Logging.d(Camera2Session.TAG, "Camera device successfully started.");
                Camera2Session.this.callback.onDone(Camera2Session.this);
            } catch (CameraAccessException e) {
                Camera2Session.this.reportError("Failed to start capture request. ".concat(String.valueOf(e)));
            }
        }

        public /* synthetic */ CaptureSessionCallback(Camera2Session camera2Session, int i) {
            this();
        }
    }

    public static void create(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, CameraSession.ConfigurationProvider configurationProvider, Context context, CameraManager cameraManager, SurfaceTextureHelper surfaceTextureHelper, String str, int i, int i2, int i3) {
        new Camera2Session(createSessionCallback, events, configurationProvider, context, cameraManager, surfaceTextureHelper, str, null, i, i2, i3);
    }

    public static final class ProcessInfo {
        public static final ProcessInfo DUMMY = new ProcessInfo("NULL");
        public static final ProcessInfo ERROR = new ProcessInfo("ERROR");
        public final int count;
        public final long pid;
        public final String processName;
        public final long thid;
        public final long tid;
        public final long timestamp;
        public final long uid;

        public ProcessInfo(ProcessInfo processInfo) {
            if (processInfo != null) {
                this.count = processInfo.count + 1;
            } else {
                this.count = 0;
            }
            this.timestamp = System.currentTimeMillis();
            this.thid = Thread.currentThread().getId();
            this.pid = Process.myPid();
            this.tid = Process.myTid();
            this.uid = Process.myUid();
            if (Build.VERSION.SDK_INT >= 33) {
                this.processName = Process.myProcessName();
            } else {
                this.processName = "unknown";
            }
        }

        public static ProcessInfo create(ProcessInfo processInfo) {
            try {
                return new ProcessInfo(processInfo);
            } catch (Throwable unused) {
                return ERROR;
            }
        }

        public static String diffToString(ProcessInfo processInfo, ProcessInfo processInfo2) {
            int i = processInfo.count;
            int i2 = processInfo2.count;
            long j = processInfo.pid;
            long j2 = processInfo2.pid;
            long j3 = processInfo.tid;
            long j4 = processInfo2.tid;
            long j5 = processInfo.uid;
            long j6 = processInfo2.uid;
            long j7 = processInfo.thid;
            long j8 = processInfo2.thid;
            String str = processInfo.processName;
            String str2 = processInfo2.processName;
            long j9 = processInfo.timestamp;
            long j10 = processInfo2.timestamp;
            StringBuilder sbP = qv1.p("ProcessInfoDiff(#", i, " -> ", i2, ",\npid:");
            sbP.append(j);
            qt4.z(j2, " -> ", ",\ntid:", sbP);
            sbP.append(j3);
            qt4.z(j4, " -> ", ",\nuid:", sbP);
            sbP.append(j5);
            qt4.z(j6, " -> ", ",\nthid:", sbP);
            sbP.append(j7);
            qt4.z(j8, " -> ", ",\nname:", sbP);
            nbh.G(sbP, str, " -> ", str2, ",\ntime:");
            sbP.append(j9);
            return zo5.k(j10, " -> ", ",\n)", sbP);
        }

        private ProcessInfo(String str) {
            this.count = -1;
            this.pid = -1L;
            this.tid = -1L;
            this.thid = -1L;
            this.uid = -1L;
            this.timestamp = -1L;
            this.processName = str;
        }
    }
}
