package defpackage;

import android.hardware.camera2.CameraDevice;

/* JADX INFO: loaded from: classes2.dex */
public final class gg2 {
    public final CameraDevice.StateCallback a;
    public final xp9 b;
    public final hw5 c;

    public gg2(CameraDevice.StateCallback stateCallback, xp9 xp9Var, hw5 hw5Var) {
        this.a = stateCallback;
        this.b = xp9Var;
        this.c = hw5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gg2)) {
            return false;
        }
        gg2 gg2Var = (gg2) obj;
        return cqk.d(this.a, gg2Var.a) && cqk.d(this.b, gg2Var.b) && cqk.d(this.c, gg2Var.c);
    }

    public final int hashCode() {
        CameraDevice.StateCallback stateCallback = this.a;
        int iHashCode = (stateCallback == null ? 0 : stateCallback.hashCode()) * 31;
        xp9 xp9Var = this.b;
        int iHashCode2 = (iHashCode + (xp9Var == null ? 0 : xp9Var.hashCode())) * 31;
        hw5 hw5Var = this.c;
        return iHashCode2 + (hw5Var != null ? Long.hashCode(hw5Var.a) : 0);
    }

    public final String toString() {
        return "CameraInteropConfig(cameraDeviceStateCallback=" + this.a + ", cameraCaptureSessionListener=" + this.b + ", cameraOpenRetryMaxTimeoutNs=" + this.c + ')';
    }
}
