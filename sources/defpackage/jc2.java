package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;

/* JADX INFO: loaded from: classes2.dex */
public final class jc2 extends i1m {
    public static final bh0 c = new bh0("camera2.captureRequest.templateType", Integer.TYPE, null);
    public static final bh0 d = new bh0("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class, null);
    public static final bh0 e = new bh0("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class, null);
    public static final bh0 f = new bh0("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class, null);
    public static final bh0 g;
    public static final bh0 h;
    public static final bh0 i;

    static {
        Class cls = Long.TYPE;
        g = new bh0("camera2.cameraCaptureSession.streamUseCase", cls, null);
        h = new bh0("camera2.cameraCaptureSession.streamUseHint", cls, null);
        i = new bh0("camera2.cameraCaptureSession.physicalCameraId", String.class, null);
    }
}
