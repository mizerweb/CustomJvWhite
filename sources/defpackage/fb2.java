package defpackage;

import androidx.camera.core.CameraControl$OperationCanceledException;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class fb2 implements cle {
    public final Object a = new Object();
    public final Object b = new Object();
    public ft0 c = new ft0();
    public i64 d;
    public i64 e;

    public final i64 a(kli kliVar, boolean z) {
        jc2 jc2VarR;
        i64 i64Var = new i64();
        synchronized (this.a) {
            jc2VarR = this.c.r();
        }
        synchronized (this.b) {
            try {
                if (kliVar != null) {
                    i64 i64Var2 = this.d;
                    if (z) {
                        if (i64Var2 != null) {
                            i64Var2.j0(new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options."));
                        }
                    } else if (i64Var2 != null) {
                        rpl.d(i64Var, i64Var2);
                    }
                    this.d = i64Var;
                    kliVar.h(jc2VarR, Collections.singletonMap("Camera2CameraControl.tag", Integer.valueOf(i64Var.hashCode())));
                } else {
                    i64 i64Var3 = this.e;
                    if (i64Var3 != null) {
                        i64Var3.j0(new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options."));
                    }
                    this.e = i64Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i64Var;
    }

    @Override // defpackage.cle
    public final void k0(jme jmeVar, long j, wg wgVar) {
        synchronized (this.b) {
            i64 i64Var = this.d;
            if (i64Var != null) {
                if (cqk.d(((ghh) jmeVar.b(ihh.a, ghh.b)).a.get("Camera2CameraControl.tag"), Integer.valueOf(i64Var.hashCode()))) {
                    i64Var.Q(null);
                    this.d = null;
                    i64 i64Var2 = this.e;
                    if (i64Var2 != null) {
                        i64Var2.Q(null);
                        this.e = null;
                    }
                }
            }
        }
    }
}
