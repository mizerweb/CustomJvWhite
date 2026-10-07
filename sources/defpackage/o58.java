package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class o58 implements d35 {
    public final /* synthetic */ t58 a;

    public o58(t58 t58Var) {
        this.a = t58Var;
    }

    @Override // defpackage.d35
    public final void a() {
    }

    @Override // defpackage.d35
    public final void b(t25 t25Var) {
        q0 q0Var = (q0) t25Var;
        float fC = q0Var.c();
        boolean z = (q0Var.g() || q0Var.d()) ? false : true;
        if (fC >= 0.99f || !z) {
            return;
        }
        boolean zIsCurrentThread = Looper.getMainLooper().isCurrentThread();
        t58 t58Var = this.a;
        if (zIsCurrentThread) {
            t58Var.setRemoteImageState(j58.a);
            ny8 ny8Var = t58Var.z;
            if (ny8Var.d()) {
                ((v50) ny8Var.getValue()).setLevel(gm0.K(fC * 10000.0f));
                return;
            }
            return;
        }
        Handler handler = t58Var.getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new q58(t58Var, fC, 0));
        } else {
            t58Var.post(new q58(t58Var, fC, 1));
        }
    }

    @Override // defpackage.d35
    public final void c(t25 t25Var) {
    }

    @Override // defpackage.d35
    public final void d(t25 t25Var) {
    }
}
