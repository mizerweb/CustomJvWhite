package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.os.Handler;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ng extends CameraCaptureSession.StateCallback {
    public final gg a;
    public final id2 b;
    public final ic2 c;
    public final xp9 d;
    public final Handler e;
    public final i40 f;
    public final i40 g = gvk.c(null);

    public ng(gg ggVar, id2 id2Var, mnf mnfVar, ic2 ic2Var, xp9 xp9Var, Handler handler) {
        this.a = ggVar;
        this.b = id2Var;
        this.c = ic2Var;
        this.d = xp9Var;
        this.e = handler;
        this.f = gvk.c(mnfVar);
    }

    public final jd2 a(CameraCaptureSession cameraCaptureSession, ic2 ic2Var) {
        jd2 jd2Var = (jd2) this.g.a;
        if (jd2Var != null) {
            return jd2Var;
        }
        Handler handler = this.e;
        boolean z = cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession;
        gg ggVar = this.a;
        jd2 fgVar = z ? new fg(ggVar, (CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession, ic2Var, handler) : new eg(ggVar, cameraCaptureSession, ic2Var, handler);
        return this.g.a(null, fgVar) ? fgVar : (jd2) this.g.a;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        jd2 jd2VarA = a(cameraCaptureSession, this.c);
        id2 id2Var = this.b;
        a(cameraCaptureSession, this.c);
        id2Var.e();
        xp9 xp9Var = this.d;
        if (xp9Var != null) {
            this.a.getClass();
            jd2VarA.getClass();
            Iterator it = ((List) ((i40) xp9Var.c).a).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onActive((qhe) xp9Var.b);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        jd2 jd2VarA = a(cameraCaptureSession, this.c);
        id2 id2Var = this.b;
        a(cameraCaptureSession, this.c);
        id2Var.g();
        xp9 xp9Var = this.d;
        if (xp9Var != null) {
            this.a.getClass();
            jd2VarA.getClass();
            qhe qheVar = (qhe) xp9Var.b;
            Iterator it = ((List) ((i40) xp9Var.c).a).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onCaptureQueueEmpty(qheVar);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        ic2 ic2Var = this.c;
        jd2 jd2VarA = a(cameraCaptureSession, ic2Var);
        id2 id2Var = this.b;
        a(cameraCaptureSession, ic2Var);
        id2Var.f();
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
            jd2VarA.getClass();
            Iterator it = ((List) ((i40) xp9Var.c).a).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onClosed((qhe) xp9Var.b);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        jd2 jd2VarA = a(cameraCaptureSession, this.c);
        this.b.c();
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
            jd2VarA.getClass();
            Iterator it = ((List) ((i40) xp9Var.c).a).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed((qhe) xp9Var.b);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        this.b.h(a(cameraCaptureSession, this.c));
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

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        jd2 jd2VarA = a(cameraCaptureSession, this.c);
        id2 id2Var = this.b;
        a(cameraCaptureSession, this.c);
        id2Var.a();
        xp9 xp9Var = this.d;
        if (xp9Var != null) {
            this.a.getClass();
            jd2VarA.getClass();
            Iterator it = ((List) ((i40) xp9Var.c).a).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onReady((qhe) xp9Var.b);
            }
        }
    }
}
