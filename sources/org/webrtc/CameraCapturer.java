package org.webrtc;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import defpackage.c0a;
import defpackage.ore;
import defpackage.qv1;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
abstract class CameraCapturer implements CameraVideoCapturer {
    private static final int MAX_OPEN_CAMERA_ATTEMPTS = 3;
    private static final int OPEN_CAMERA_DELAY_MS = 500;
    private static final int OPEN_CAMERA_TIMEOUT = 10000;
    private static final String TAG = "CameraCapturer";
    private Context applicationContext;
    private final CameraEnumerator cameraEnumerator;
    private String cameraName;
    private final CameraSession.ConfigurationProvider cameraSessionConfigurationProvider;
    private final CameraSession.Events cameraSessionEventsHandler;
    private CameraVideoCapturer.CameraStatistics cameraStatistics;
    private Handler cameraThreadHandler;
    protected final CameraVideoCapturer.CaptureFormatHelper captureFormatHelper;
    private CapturerObserver capturerObserver;
    private final CameraVideoCapturer.CameraConfigurationProvider configProvider;
    private final CameraSession.CreateSessionCallback createSessionCallback;
    private CameraSession currentSession;
    private final CameraVideoCapturer.CameraEventsHandler eventsHandler;
    private boolean firstFrameObserved;
    private int framerate;
    private int height;
    private int openAttemptsRemaining;
    private final Runnable openCameraTimeoutRunnable;
    private String pendingCameraName;
    private boolean sessionOpening;
    private final Object stateLock;
    private boolean stopRequested;
    private SurfaceTextureHelper surfaceHelper;
    private CameraVideoCapturer.CameraSwitchHandler switchEventsHandler;
    private SwitchState switchState;
    private final Handler uiThreadHandler;
    private int width;

    /* JADX INFO: renamed from: org.webrtc.CameraCapturer$1 */
    public class AnonymousClass1 implements CameraSession.CreateSessionCallback {
        public AnonymousClass1() {
        }

        @Override // org.webrtc.CameraSession.CreateSessionCallback
        public void onDone(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread();
            Logging.d(CameraCapturer.TAG, "Create session done. Switch state: ".concat(String.valueOf(CameraCapturer.this.switchState)));
            CameraCapturer.this.uiThreadHandler.removeCallbacks(CameraCapturer.this.openCameraTimeoutRunnable);
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    CameraCapturer.this.stopRequested = false;
                    CameraCapturer.this.capturerObserver.onCapturerStarted(true);
                    CameraCapturer.this.sessionOpening = false;
                    CameraCapturer.this.currentSession = cameraSession;
                    CameraCapturer cameraCapturer = CameraCapturer.this;
                    cameraCapturer.cameraStatistics = new CameraVideoCapturer.CameraStatistics(cameraCapturer.surfaceHelper, CameraCapturer.this.eventsHandler);
                    CameraCapturer.this.firstFrameObserved = false;
                    CameraCapturer.this.stateLock.notifyAll();
                    SwitchState switchState = CameraCapturer.this.switchState;
                    SwitchState switchState2 = SwitchState.IN_PROGRESS;
                    CameraCapturer cameraCapturer2 = CameraCapturer.this;
                    if (switchState == switchState2) {
                        cameraCapturer2.switchState = SwitchState.IDLE;
                        if (CameraCapturer.this.switchEventsHandler != null) {
                            CameraCapturer.this.switchEventsHandler.onCameraSwitchDone(CameraCapturer.this.cameraEnumerator.isFrontFacing(CameraCapturer.this.cameraName));
                            CameraCapturer.this.switchEventsHandler = null;
                        }
                    } else if (cameraCapturer2.switchState == SwitchState.PENDING) {
                        String str = CameraCapturer.this.pendingCameraName;
                        CameraCapturer.this.pendingCameraName = null;
                        CameraCapturer.this.switchState = SwitchState.IDLE;
                        CameraCapturer cameraCapturer3 = CameraCapturer.this;
                        cameraCapturer3.switchCameraInternal(cameraCapturer3.switchEventsHandler, str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // org.webrtc.CameraSession.CreateSessionCallback
        public void onFailure(CameraSession.FailureType failureType, String str) {
            CameraCapturer.this.checkIsOnCameraThread();
            CameraCapturer.this.uiThreadHandler.removeCallbacks(CameraCapturer.this.openCameraTimeoutRunnable);
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    CameraCapturer.this.capturerObserver.onCapturerStarted(false);
                    CameraCapturer.this.openAttemptsRemaining--;
                    if (CameraCapturer.this.openAttemptsRemaining <= 0) {
                        Logging.w(CameraCapturer.TAG, "Opening camera failed, passing: " + str);
                        CameraCapturer.this.sessionOpening = false;
                        CameraCapturer.this.stateLock.notifyAll();
                        SwitchState switchState = CameraCapturer.this.switchState;
                        SwitchState switchState2 = SwitchState.IDLE;
                        if (switchState != switchState2) {
                            if (CameraCapturer.this.switchEventsHandler != null) {
                                CameraCapturer.this.switchEventsHandler.onCameraSwitchError(str);
                                CameraCapturer.this.switchEventsHandler = null;
                            }
                            CameraCapturer.this.switchState = switchState2;
                        }
                        CameraSession.FailureType failureType2 = CameraSession.FailureType.DISCONNECTED;
                        CameraCapturer cameraCapturer = CameraCapturer.this;
                        if (failureType == failureType2) {
                            cameraCapturer.eventsHandler.onCameraDisconnected();
                        } else {
                            cameraCapturer.eventsHandler.onCameraError(str);
                        }
                    } else {
                        Logging.w(CameraCapturer.TAG, "Opening camera failed, retry: " + str);
                        CameraCapturer.this.createSessionInternal(500);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: org.webrtc.CameraCapturer$10 */
    public class AnonymousClass10 implements Runnable {
        final /* synthetic */ CameraCapturer this$0;
        final /* synthetic */ String val$cameraName;
        final /* synthetic */ CameraVideoCapturer.CameraSwitchHandler val$switchEventsHandler;

        public AnonymousClass10(CameraCapturer cameraCapturer) {
            cameraSwitchHandler = cameraSwitchHandler;
            str = str;
            this.this$0 = cameraCapturer;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.this$0.switchCameraInternal(cameraSwitchHandler, str);
        }
    }

    /* JADX INFO: renamed from: org.webrtc.CameraCapturer$11 */
    public class AnonymousClass11 implements Runnable {
        final /* synthetic */ CameraCapturer this$0;
        final /* synthetic */ CameraSession val$oldSession;

        public AnonymousClass11(CameraCapturer cameraCapturer) {
            cameraSession = cameraSession;
            this.this$0 = cameraCapturer;
        }

        @Override // java.lang.Runnable
        public void run() {
            cameraSession.stop();
        }
    }

    /* JADX INFO: renamed from: org.webrtc.CameraCapturer$2 */
    public class AnonymousClass2 implements CameraSession.Events {
        public AnonymousClass2() {
        }

        @Override // org.webrtc.CameraSession.Events
        public void onCameraClosed(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (cameraSession == CameraCapturer.this.currentSession || CameraCapturer.this.currentSession == null) {
                        CameraCapturer.this.eventsHandler.onCameraClosed();
                    } else {
                        Logging.d(CameraCapturer.TAG, "onCameraClosed from another session.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onCameraDisconnected(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (cameraSession != CameraCapturer.this.currentSession) {
                        Logging.w(CameraCapturer.TAG, "onCameraDisconnected from another session.");
                    } else {
                        CameraCapturer.this.eventsHandler.onCameraDisconnected();
                        CameraCapturer.this.stopCapture();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onCameraError(CameraSession cameraSession, String str) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (cameraSession == CameraCapturer.this.currentSession) {
                        CameraCapturer.this.eventsHandler.onCameraError(str);
                        CameraCapturer.this.stopCapture();
                    } else {
                        Logging.w(CameraCapturer.TAG, "onCameraError from another session: " + str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onCameraOpening() {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (CameraCapturer.this.currentSession != null) {
                        Logging.w(CameraCapturer.TAG, "onCameraOpening while session was open.");
                    } else {
                        CameraCapturer.this.eventsHandler.onCameraOpening(CameraCapturer.this.cameraName);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onFrameCaptured(CameraSession cameraSession, VideoFrame videoFrame) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (cameraSession != CameraCapturer.this.currentSession) {
                        Logging.w(CameraCapturer.TAG, "onFrameCaptured from another session.");
                        return;
                    }
                    if (!CameraCapturer.this.firstFrameObserved) {
                        CameraCapturer.this.eventsHandler.onFirstFrameAvailable();
                        CameraCapturer.this.firstFrameObserved = true;
                    }
                    CameraCapturer.this.cameraStatistics.addFrame();
                    CameraCapturer.this.capturerObserver.onFrameCaptured(videoFrame);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onNonFatal(CameraSession cameraSession, String str, Throwable th) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (cameraSession != CameraCapturer.this.currentSession) {
                        Logging.w(CameraCapturer.TAG, "onNonFatal from another session: " + str);
                    }
                    CameraCapturer.this.eventsHandler.onCameraError(str, th);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: org.webrtc.CameraCapturer$3 */
    public class AnonymousClass3 implements CameraSession.ConfigurationProvider {
        public AnonymousClass3() {
        }

        @Override // org.webrtc.CameraSession.ConfigurationProvider
        public boolean isCrashOnCameraCloseRequired() {
            return CameraCapturer.this.configProvider.isCrashOnCameraCloseRequired();
        }
    }

    /* JADX INFO: renamed from: org.webrtc.CameraCapturer$4 */
    public class AnonymousClass4 implements Runnable {
        public AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (CameraCapturer.this.sessionOpening) {
                        CameraCapturer.this.stopRequested = true;
                        CameraCapturer.this.stateLock.notifyAll();
                        CameraCapturer.this.eventsHandler.onCameraError("Camera failed to start within timeout.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: org.webrtc.CameraCapturer$5 */
    public class AnonymousClass5 implements CameraVideoCapturer.CameraEventsHandler {
        public AnonymousClass5() {
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onCameraClosed() {
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onCameraDisconnected() {
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onCameraError(String str, Throwable th) {
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onCameraFreezed(String str) {
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onCameraOpening(String str) {
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onFirstFrameAvailable() {
        }
    }

    /* JADX INFO: renamed from: org.webrtc.CameraCapturer$6 */
    public class AnonymousClass6 implements CameraVideoCapturer.CaptureFormatHelper {
        public AnonymousClass6() {
        }
    }

    /* JADX INFO: renamed from: org.webrtc.CameraCapturer$7 */
    public class AnonymousClass7 implements Runnable {
        public AnonymousClass7() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CameraCapturer cameraCapturer = CameraCapturer.this;
            cameraCapturer.createCameraSession(cameraCapturer.createSessionCallback, CameraCapturer.this.cameraSessionEventsHandler, CameraCapturer.this.cameraSessionConfigurationProvider, CameraCapturer.this.applicationContext, CameraCapturer.this.surfaceHelper, CameraCapturer.this.cameraName, CameraCapturer.this.width, CameraCapturer.this.height, CameraCapturer.this.framerate);
        }
    }

    /* JADX INFO: renamed from: org.webrtc.CameraCapturer$8 */
    public class AnonymousClass8 implements Runnable {
        final /* synthetic */ CameraCapturer this$0;
        final /* synthetic */ CameraSession val$oldSession;

        public AnonymousClass8(CameraCapturer cameraCapturer) {
            cameraSession = cameraSession;
            this.this$0 = cameraCapturer;
        }

        @Override // java.lang.Runnable
        public void run() {
            cameraSession.stop();
        }
    }

    /* JADX INFO: renamed from: org.webrtc.CameraCapturer$9 */
    public class AnonymousClass9 implements Runnable {
        final /* synthetic */ CameraCapturer this$0;
        final /* synthetic */ CameraVideoCapturer.CameraSwitchHandler val$switchEventsHandler;

        public AnonymousClass9(CameraCapturer cameraCapturer) {
            cameraSwitchHandler = cameraSwitchHandler;
            this.this$0 = cameraCapturer;
        }

        @Override // java.lang.Runnable
        public void run() {
            List listAsList = Arrays.asList(this.this$0.cameraEnumerator.getDeviceNames());
            int size = listAsList.size();
            CameraCapturer cameraCapturer = this.this$0;
            if (size < 2) {
                cameraCapturer.reportCameraSwitchError("No camera to switch to.", cameraSwitchHandler);
            } else {
                this.this$0.switchCameraInternal(cameraSwitchHandler, (String) listAsList.get((listAsList.indexOf(cameraCapturer.cameraName) + 1) % listAsList.size()));
            }
        }
    }

    public enum SwitchState {
        IDLE,
        PENDING,
        IN_PROGRESS
    }

    public CameraCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, CameraEnumerator cameraEnumerator, CameraVideoCapturer.CameraConfigurationProvider cameraConfigurationProvider, CameraVideoCapturer.CaptureFormatHelper captureFormatHelper) {
        this.createSessionCallback = new CameraSession.CreateSessionCallback() { // from class: org.webrtc.CameraCapturer.1
            public AnonymousClass1() {
            }

            @Override // org.webrtc.CameraSession.CreateSessionCallback
            public void onDone(CameraSession cameraSession) {
                CameraCapturer.this.checkIsOnCameraThread();
                Logging.d(CameraCapturer.TAG, "Create session done. Switch state: ".concat(String.valueOf(CameraCapturer.this.switchState)));
                CameraCapturer.this.uiThreadHandler.removeCallbacks(CameraCapturer.this.openCameraTimeoutRunnable);
                synchronized (CameraCapturer.this.stateLock) {
                    try {
                        CameraCapturer.this.stopRequested = false;
                        CameraCapturer.this.capturerObserver.onCapturerStarted(true);
                        CameraCapturer.this.sessionOpening = false;
                        CameraCapturer.this.currentSession = cameraSession;
                        CameraCapturer cameraCapturer = CameraCapturer.this;
                        cameraCapturer.cameraStatistics = new CameraVideoCapturer.CameraStatistics(cameraCapturer.surfaceHelper, CameraCapturer.this.eventsHandler);
                        CameraCapturer.this.firstFrameObserved = false;
                        CameraCapturer.this.stateLock.notifyAll();
                        SwitchState switchState = CameraCapturer.this.switchState;
                        SwitchState switchState2 = SwitchState.IN_PROGRESS;
                        CameraCapturer cameraCapturer2 = CameraCapturer.this;
                        if (switchState == switchState2) {
                            cameraCapturer2.switchState = SwitchState.IDLE;
                            if (CameraCapturer.this.switchEventsHandler != null) {
                                CameraCapturer.this.switchEventsHandler.onCameraSwitchDone(CameraCapturer.this.cameraEnumerator.isFrontFacing(CameraCapturer.this.cameraName));
                                CameraCapturer.this.switchEventsHandler = null;
                            }
                        } else if (cameraCapturer2.switchState == SwitchState.PENDING) {
                            String str2 = CameraCapturer.this.pendingCameraName;
                            CameraCapturer.this.pendingCameraName = null;
                            CameraCapturer.this.switchState = SwitchState.IDLE;
                            CameraCapturer cameraCapturer3 = CameraCapturer.this;
                            cameraCapturer3.switchCameraInternal(cameraCapturer3.switchEventsHandler, str2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // org.webrtc.CameraSession.CreateSessionCallback
            public void onFailure(CameraSession.FailureType failureType, String str2) {
                CameraCapturer.this.checkIsOnCameraThread();
                CameraCapturer.this.uiThreadHandler.removeCallbacks(CameraCapturer.this.openCameraTimeoutRunnable);
                synchronized (CameraCapturer.this.stateLock) {
                    try {
                        CameraCapturer.this.capturerObserver.onCapturerStarted(false);
                        CameraCapturer.this.openAttemptsRemaining--;
                        if (CameraCapturer.this.openAttemptsRemaining <= 0) {
                            Logging.w(CameraCapturer.TAG, "Opening camera failed, passing: " + str2);
                            CameraCapturer.this.sessionOpening = false;
                            CameraCapturer.this.stateLock.notifyAll();
                            SwitchState switchState = CameraCapturer.this.switchState;
                            SwitchState switchState2 = SwitchState.IDLE;
                            if (switchState != switchState2) {
                                if (CameraCapturer.this.switchEventsHandler != null) {
                                    CameraCapturer.this.switchEventsHandler.onCameraSwitchError(str2);
                                    CameraCapturer.this.switchEventsHandler = null;
                                }
                                CameraCapturer.this.switchState = switchState2;
                            }
                            CameraSession.FailureType failureType2 = CameraSession.FailureType.DISCONNECTED;
                            CameraCapturer cameraCapturer = CameraCapturer.this;
                            if (failureType == failureType2) {
                                cameraCapturer.eventsHandler.onCameraDisconnected();
                            } else {
                                cameraCapturer.eventsHandler.onCameraError(str2);
                            }
                        } else {
                            Logging.w(CameraCapturer.TAG, "Opening camera failed, retry: " + str2);
                            CameraCapturer.this.createSessionInternal(500);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        this.cameraSessionEventsHandler = new CameraSession.Events() { // from class: org.webrtc.CameraCapturer.2
            public AnonymousClass2() {
            }

            @Override // org.webrtc.CameraSession.Events
            public void onCameraClosed(CameraSession cameraSession) {
                CameraCapturer.this.checkIsOnCameraThread();
                synchronized (CameraCapturer.this.stateLock) {
                    try {
                        if (cameraSession == CameraCapturer.this.currentSession || CameraCapturer.this.currentSession == null) {
                            CameraCapturer.this.eventsHandler.onCameraClosed();
                        } else {
                            Logging.d(CameraCapturer.TAG, "onCameraClosed from another session.");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // org.webrtc.CameraSession.Events
            public void onCameraDisconnected(CameraSession cameraSession) {
                CameraCapturer.this.checkIsOnCameraThread();
                synchronized (CameraCapturer.this.stateLock) {
                    try {
                        if (cameraSession != CameraCapturer.this.currentSession) {
                            Logging.w(CameraCapturer.TAG, "onCameraDisconnected from another session.");
                        } else {
                            CameraCapturer.this.eventsHandler.onCameraDisconnected();
                            CameraCapturer.this.stopCapture();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // org.webrtc.CameraSession.Events
            public void onCameraError(CameraSession cameraSession, String str2) {
                CameraCapturer.this.checkIsOnCameraThread();
                synchronized (CameraCapturer.this.stateLock) {
                    try {
                        if (cameraSession == CameraCapturer.this.currentSession) {
                            CameraCapturer.this.eventsHandler.onCameraError(str2);
                            CameraCapturer.this.stopCapture();
                        } else {
                            Logging.w(CameraCapturer.TAG, "onCameraError from another session: " + str2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // org.webrtc.CameraSession.Events
            public void onCameraOpening() {
                CameraCapturer.this.checkIsOnCameraThread();
                synchronized (CameraCapturer.this.stateLock) {
                    try {
                        if (CameraCapturer.this.currentSession != null) {
                            Logging.w(CameraCapturer.TAG, "onCameraOpening while session was open.");
                        } else {
                            CameraCapturer.this.eventsHandler.onCameraOpening(CameraCapturer.this.cameraName);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // org.webrtc.CameraSession.Events
            public void onFrameCaptured(CameraSession cameraSession, VideoFrame videoFrame) {
                CameraCapturer.this.checkIsOnCameraThread();
                synchronized (CameraCapturer.this.stateLock) {
                    try {
                        if (cameraSession != CameraCapturer.this.currentSession) {
                            Logging.w(CameraCapturer.TAG, "onFrameCaptured from another session.");
                            return;
                        }
                        if (!CameraCapturer.this.firstFrameObserved) {
                            CameraCapturer.this.eventsHandler.onFirstFrameAvailable();
                            CameraCapturer.this.firstFrameObserved = true;
                        }
                        CameraCapturer.this.cameraStatistics.addFrame();
                        CameraCapturer.this.capturerObserver.onFrameCaptured(videoFrame);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // org.webrtc.CameraSession.Events
            public void onNonFatal(CameraSession cameraSession, String str2, Throwable th) {
                CameraCapturer.this.checkIsOnCameraThread();
                synchronized (CameraCapturer.this.stateLock) {
                    try {
                        if (cameraSession != CameraCapturer.this.currentSession) {
                            Logging.w(CameraCapturer.TAG, "onNonFatal from another session: " + str2);
                        }
                        CameraCapturer.this.eventsHandler.onCameraError(str2, th);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        };
        this.cameraSessionConfigurationProvider = new CameraSession.ConfigurationProvider() { // from class: org.webrtc.CameraCapturer.3
            public AnonymousClass3() {
            }

            @Override // org.webrtc.CameraSession.ConfigurationProvider
            public boolean isCrashOnCameraCloseRequired() {
                return CameraCapturer.this.configProvider.isCrashOnCameraCloseRequired();
            }
        };
        this.openCameraTimeoutRunnable = new Runnable() { // from class: org.webrtc.CameraCapturer.4
            public AnonymousClass4() {
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (CameraCapturer.this.stateLock) {
                    try {
                        if (CameraCapturer.this.sessionOpening) {
                            CameraCapturer.this.stopRequested = true;
                            CameraCapturer.this.stateLock.notifyAll();
                            CameraCapturer.this.eventsHandler.onCameraError("Camera failed to start within timeout.");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        this.stateLock = new Object();
        this.switchState = SwitchState.IDLE;
        cameraEventsHandler = cameraEventsHandler == null ? new CameraVideoCapturer.CameraEventsHandler() { // from class: org.webrtc.CameraCapturer.5
            public AnonymousClass5() {
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraClosed() {
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraDisconnected() {
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraError(String str2, Throwable th) {
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraFreezed(String str2) {
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraOpening(String str2) {
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onFirstFrameAvailable() {
            }
        } : cameraEventsHandler;
        this.captureFormatHelper = captureFormatHelper == null ? new CameraVideoCapturer.CaptureFormatHelper() { // from class: org.webrtc.CameraCapturer.6
            public AnonymousClass6() {
            }
        } : captureFormatHelper;
        this.eventsHandler = cameraEventsHandler;
        this.cameraEnumerator = cameraEnumerator;
        this.configProvider = cameraConfigurationProvider;
        this.cameraName = str;
        List listAsList = Arrays.asList(cameraEnumerator.getDeviceNames());
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        if (listAsList.isEmpty()) {
            ore.q("No cameras attached.");
            throw null;
        }
        if (listAsList.contains(this.cameraName)) {
            return;
        }
        ore.p(c0a.o("Camera name ", this.cameraName, " does not match any known camera device."));
        throw null;
    }

    public void checkIsOnCameraThread() {
        if (Thread.currentThread() == this.cameraThreadHandler.getLooper().getThread()) {
            return;
        }
        Logging.e(TAG, "Check is on camera thread failed.");
        ore.q("Not on camera thread.");
    }

    public void createSessionInternal(int i) {
        this.uiThreadHandler.postDelayed(this.openCameraTimeoutRunnable, i + OPEN_CAMERA_TIMEOUT);
        this.cameraThreadHandler.postDelayed(new Runnable() { // from class: org.webrtc.CameraCapturer.7
            public AnonymousClass7() {
            }

            @Override // java.lang.Runnable
            public void run() {
                CameraCapturer cameraCapturer = CameraCapturer.this;
                cameraCapturer.createCameraSession(cameraCapturer.createSessionCallback, CameraCapturer.this.cameraSessionEventsHandler, CameraCapturer.this.cameraSessionConfigurationProvider, CameraCapturer.this.applicationContext, CameraCapturer.this.surfaceHelper, CameraCapturer.this.cameraName, CameraCapturer.this.width, CameraCapturer.this.height, CameraCapturer.this.framerate);
            }
        }, i);
    }

    public void reportCameraSwitchError(String str, CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        Logging.e(TAG, str);
        if (cameraSwitchHandler != null) {
            cameraSwitchHandler.onCameraSwitchError(str);
        }
    }

    public void switchCameraInternal(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler, String str) {
        Logging.d(TAG, "switchCamera internal");
        if (!Arrays.asList(this.cameraEnumerator.getDeviceNames()).contains(str)) {
            reportCameraSwitchError(qv1.k("Attempted to switch to unknown camera device ", str), cameraSwitchHandler);
            return;
        }
        synchronized (this.stateLock) {
            try {
                if (this.switchState != SwitchState.IDLE) {
                    reportCameraSwitchError("Camera switch already in progress.", cameraSwitchHandler);
                    return;
                }
                boolean z = this.sessionOpening;
                if (!z && this.currentSession == null) {
                    reportCameraSwitchError("switchCamera: camera is not running.", cameraSwitchHandler);
                    return;
                }
                this.switchEventsHandler = cameraSwitchHandler;
                if (z) {
                    this.switchState = SwitchState.PENDING;
                    this.pendingCameraName = str;
                    return;
                }
                this.switchState = SwitchState.IN_PROGRESS;
                Logging.d(TAG, "switchCamera: Stopping session");
                this.cameraStatistics.release();
                this.cameraStatistics = null;
                this.cameraThreadHandler.post(new Runnable(this) { // from class: org.webrtc.CameraCapturer.11
                    final /* synthetic */ CameraCapturer this$0;
                    final /* synthetic */ CameraSession val$oldSession;

                    public AnonymousClass11(CameraCapturer this) {
                        cameraSession = cameraSession;
                        this.this$0 = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        cameraSession.stop();
                    }
                });
                this.currentSession = null;
                this.cameraName = str;
                this.sessionOpening = true;
                this.openAttemptsRemaining = 1;
                createSessionInternal(0);
                Logging.d(TAG, "switchCamera done");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void changeCaptureFormat(int i, int i2, int i3) {
        StringBuilder sbP = qv1.p("changeCaptureFormat: ", i, "x", i2, "@");
        sbP.append(i3);
        Logging.d(TAG, sbP.toString());
        synchronized (this.stateLock) {
            stopCapture();
            startCapture(i, i2, i3);
        }
    }

    public abstract void createCameraSession(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, CameraSession.ConfigurationProvider configurationProvider, Context context, SurfaceTextureHelper surfaceTextureHelper, String str, int i, int i2, int i3);

    @Override // org.webrtc.VideoCapturer
    public void dispose() {
        Logging.d(TAG, "dispose");
        stopCapture();
    }

    public String getCameraName() {
        String str;
        synchronized (this.stateLock) {
            str = this.cameraName;
        }
        return str;
    }

    @Override // org.webrtc.VideoCapturer
    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        this.applicationContext = context;
        this.capturerObserver = capturerObserver;
        this.surfaceHelper = surfaceTextureHelper;
        this.cameraThreadHandler = surfaceTextureHelper.getHandler();
    }

    @Override // org.webrtc.VideoCapturer
    public boolean isScreencast() {
        return false;
    }

    public void printStackTrace() {
        Handler handler = this.cameraThreadHandler;
        Thread thread = handler != null ? handler.getLooper().getThread() : null;
        if (thread != null) {
            StackTraceElement[] stackTrace = thread.getStackTrace();
            if (stackTrace.length > 0) {
                Logging.d(TAG, "CameraCapturer stack trace:");
                for (StackTraceElement stackTraceElement : stackTrace) {
                    Logging.d(TAG, stackTraceElement.toString());
                }
            }
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void startCapture(int i, int i2, int i3) {
        StringBuilder sbP = qv1.p("startCapture: ", i, "x", i2, "@");
        sbP.append(i3);
        Logging.d(TAG, sbP.toString());
        if (this.applicationContext == null) {
            ore.q("CameraCapturer must be initialized before calling startCapture.");
            return;
        }
        synchronized (this.stateLock) {
            try {
                if (!this.sessionOpening && this.currentSession == null) {
                    this.width = i;
                    this.height = i2;
                    this.framerate = i3;
                    this.stopRequested = false;
                    this.sessionOpening = true;
                    this.openAttemptsRemaining = 3;
                    createSessionInternal(0);
                    return;
                }
                Logging.w(TAG, "Session already open");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void stopCapture() {
        Logging.d(TAG, "Stop capture");
        synchronized (this.stateLock) {
            while (this.sessionOpening && !this.stopRequested) {
                Logging.d(TAG, "Stop capture: Waiting for session to open");
                try {
                    this.stateLock.wait();
                } catch (InterruptedException unused) {
                    Logging.w(TAG, "Stop capture interrupted while waiting for the session to open.");
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            this.sessionOpening = false;
            if (this.currentSession != null) {
                Logging.d(TAG, "Stop capture: Nulling session");
                this.cameraStatistics.release();
                this.cameraStatistics = null;
                this.cameraThreadHandler.post(new Runnable(this) { // from class: org.webrtc.CameraCapturer.8
                    final /* synthetic */ CameraCapturer this$0;
                    final /* synthetic */ CameraSession val$oldSession;

                    public AnonymousClass8(CameraCapturer this) {
                        cameraSession = cameraSession;
                        this.this$0 = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        cameraSession.stop();
                    }
                });
                this.currentSession = null;
                this.capturerObserver.onCapturerStopped();
            } else {
                Logging.d(TAG, "Stop capture: No session open");
            }
        }
        Logging.d(TAG, "Stop capture done");
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        Logging.d(TAG, "switchCamera");
        this.cameraThreadHandler.post(new Runnable(this) { // from class: org.webrtc.CameraCapturer.9
            final /* synthetic */ CameraCapturer this$0;
            final /* synthetic */ CameraVideoCapturer.CameraSwitchHandler val$switchEventsHandler;

            public AnonymousClass9(CameraCapturer this) {
                cameraSwitchHandler = cameraSwitchHandler;
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                List listAsList = Arrays.asList(this.this$0.cameraEnumerator.getDeviceNames());
                int size = listAsList.size();
                CameraCapturer cameraCapturer = this.this$0;
                if (size < 2) {
                    cameraCapturer.reportCameraSwitchError("No camera to switch to.", cameraSwitchHandler);
                } else {
                    this.this$0.switchCameraInternal(cameraSwitchHandler, (String) listAsList.get((listAsList.indexOf(cameraCapturer.cameraName) + 1) % listAsList.size()));
                }
            }
        });
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler, String str) {
        Logging.d(TAG, "switchCamera");
        this.cameraThreadHandler.post(new Runnable(this) { // from class: org.webrtc.CameraCapturer.10
            final /* synthetic */ CameraCapturer this$0;
            final /* synthetic */ String val$cameraName;
            final /* synthetic */ CameraVideoCapturer.CameraSwitchHandler val$switchEventsHandler;

            public AnonymousClass10(CameraCapturer this) {
                cameraSwitchHandler = cameraSwitchHandler;
                str = str;
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.switchCameraInternal(cameraSwitchHandler, str);
            }
        });
    }

    public CameraCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, CameraEnumerator cameraEnumerator, CameraVideoCapturer.CameraConfigurationProvider cameraConfigurationProvider) {
        this(str, cameraEventsHandler, cameraEnumerator, cameraConfigurationProvider, null);
    }
}
