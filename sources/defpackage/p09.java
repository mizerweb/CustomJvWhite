package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class p09 extends he2 {
    public g19 L;

    @Override // defpackage.he2
    public final o09 s() {
        if (this.L == null) {
            Log.d("CamLifecycleController", "Lifecycle is not set.");
            return null;
        }
        jid jidVar = this.r;
        if (jidVar == null) {
            Log.d("CamLifecycleController", "CameraProvider is not ready.");
            return null;
        }
        try {
            if (jidVar == null) {
                tvj.a("CameraController", "Camera not initialized.");
            } else if (this.t == null || this.s == null) {
                tvj.a("CameraController", "PreviewView not attached to CameraController.");
            }
            kr6 kr6VarF = f();
            if (kr6VarF == null) {
                return null;
            }
            jid jidVar2 = this.r;
            return jidVar2.a.a(this.L, this.a, kr6VarF);
        } catch (IllegalArgumentException e) {
            ore.l("The selected camera does not support the enabled use cases. Please disable use case and/or select a different camera. e.g. #setVideoCaptureEnabled(false)", e);
            return null;
        }
    }

    public final void x() {
        wxl.a();
        this.L = null;
        this.q = null;
        jid jidVar = this.r;
        if (jidVar != null) {
            jidVar.a.a.y();
        }
    }
}
