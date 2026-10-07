package defpackage;

import androidx.camera.core.CameraControl$OperationCanceledException;

/* JADX INFO: loaded from: classes2.dex */
public final class eb2 implements fli {
    public final fb2 a;
    public final omi b;
    public final zx3 c;
    public kli d;

    public eb2(fb2 fb2Var, omi omiVar, zx3 zx3Var) {
        this.a = fb2Var;
        this.b = omiVar;
        this.c = zx3Var;
    }

    @Override // defpackage.fli
    public final void b(kli kliVar) {
        this.d = kliVar;
        if (kliVar != null) {
            zx3 zx3Var = this.c;
            fb2 fb2Var = this.a;
            zx3Var.c(fb2Var);
            zx3Var.a(fb2Var, this.b.e);
            fb2Var.a(kliVar, false);
        }
    }

    @Override // defpackage.fli
    public final void reset() {
        fb2 fb2Var = this.a;
        synchronized (fb2Var.b) {
            try {
                i64 i64Var = fb2Var.d;
                if (i64Var != null) {
                    fb2Var.d = null;
                    i64Var.j0(new CameraControl$OperationCanceledException("The camera control has became inactive."));
                }
                i64 i64Var2 = fb2Var.e;
                if (i64Var2 != null) {
                    fb2Var.e = null;
                    i64Var2.j0(new CameraControl$OperationCanceledException("The camera control has became inactive."));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c.c(this.a);
    }
}
