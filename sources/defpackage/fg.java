package defpackage;

import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class fg extends eg {
    public final CameraConstrainedHighSpeedCaptureSession e;

    public fg(gg ggVar, CameraConstrainedHighSpeedCaptureSession cameraConstrainedHighSpeedCaptureSession, ic2 ic2Var, Handler handler) {
        super(ggVar, cameraConstrainedHighSpeedCaptureSession, ic2Var, handler);
        this.e = cameraConstrainedHighSpeedCaptureSession;
    }

    @Override // defpackage.eg, defpackage.ndi
    public final Object W(sr3 sr3Var) {
        return sr3Var.equals(zfe.a(CameraConstrainedHighSpeedCaptureSession.class)) ? this.e : super.W(sr3Var);
    }
}
