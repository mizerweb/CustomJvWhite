package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CameraExtensionSession$StateCallback;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ug extends CameraExtensionSession$StateCallback {
    public final gg a;
    public final ci6 b;
    public final ic2 c;
    public final xp9 d;
    public final ww0 e;
    public final i40 f;
    public final i40 g = gvk.c(null);

    public ug(gg ggVar, ci6 ci6Var, mnf mnfVar, ic2 ic2Var, xp9 xp9Var, ww0 ww0Var) {
        this.a = ggVar;
        this.b = ci6Var;
        this.c = ic2Var;
        this.d = xp9Var;
        this.e = ww0Var;
        this.f = gvk.c(mnfVar);
    }

    public final jg a(CameraExtensionSession cameraExtensionSession, ic2 ic2Var) {
        jg jgVar = (jg) this.g.a;
        if (jgVar != null) {
            return jgVar;
        }
        jg jgVar2 = new jg(this.a, cameraExtensionSession, ic2Var, this.e);
        return this.g.a(null, jgVar2) ? jgVar2 : (jg) this.g.a;
    }

    public final void onClosed(CameraExtensionSession cameraExtensionSession) throws Exception {
        jg jgVarA = a(cameraExtensionSession, this.c);
        ci6 ci6Var = this.b;
        a(cameraExtensionSession, this.c);
        ci6Var.a.f();
        i40 i40Var = this.f;
        i40Var.getClass();
        mnf mnfVar = (mnf) i40.b.getAndSet(i40Var, null);
        if (mnfVar != null) {
            mnfVar.b();
        }
        this.b.b();
        xp9 xp9Var = this.d;
        if (xp9Var != null) {
            this.a.getClass();
            int i = jgVarA.e;
            Iterator it = ((List) ((i40) xp9Var.c).a).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onClosed((qhe) xp9Var.b);
            }
        }
    }

    public final void onConfigureFailed(CameraExtensionSession cameraExtensionSession) throws Exception {
        a(cameraExtensionSession, this.c);
        this.b.a.c();
        i40 i40Var = this.f;
        i40Var.getClass();
        mnf mnfVar = (mnf) i40.b.getAndSet(i40Var, null);
        if (mnfVar != null) {
            mnfVar.b();
        }
        this.b.b();
        xp9 xp9Var = this.d;
        if (xp9Var != null) {
            this.a.getClass();
            Iterator it = ((List) ((i40) xp9Var.c).a).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed((qhe) xp9Var.b);
            }
        }
    }

    public final void onConfigured(CameraExtensionSession cameraExtensionSession) {
        this.b.a.h(a(cameraExtensionSession, this.c));
        i40 i40Var = this.f;
        i40Var.getClass();
        mnf mnfVar = (mnf) i40.b.getAndSet(i40Var, null);
        if (mnfVar != null) {
            mnfVar.b();
        }
        xp9 xp9Var = this.d;
        if (xp9Var != null) {
            this.a.getClass();
            Iterator it = ((List) ((i40) xp9Var.c).a).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onConfigured((qhe) xp9Var.b);
            }
        }
    }
}
