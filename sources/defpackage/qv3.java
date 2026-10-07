package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class qv3 implements d35 {
    public final /* synthetic */ xv3 a;
    public final /* synthetic */ h58 b;
    public final /* synthetic */ jv3 c;

    public qv3(xv3 xv3Var, h58 h58Var, jv3 jv3Var) {
        this.a = xv3Var;
        this.b = h58Var;
        this.c = jv3Var;
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
        int iK = gm0.K(fC * 10000.0f);
        xv3 xv3Var = this.a;
        ViewGroup viewGroup = xv3Var.b;
        boolean zIsCurrentThread = Looper.getMainLooper().isCurrentThread();
        jv3 jv3Var = this.c;
        h58 h58Var = this.b;
        if (zIsCurrentThread) {
            xv3.a(xv3Var, h58Var, jv3Var, iK);
            return;
        }
        Handler handler = viewGroup.getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new rv3(xv3Var, h58Var, jv3Var, iK, 0));
        } else {
            viewGroup.post(new rv3(xv3Var, h58Var, jv3Var, iK, 1));
        }
    }

    @Override // defpackage.d35
    public final void c(t25 t25Var) {
    }

    @Override // defpackage.d35
    public final void d(t25 t25Var) {
    }
}
