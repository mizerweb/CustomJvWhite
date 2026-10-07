package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends rq0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ u0 c;

    public s0(u0 u0Var, String str, boolean z) {
        this.c = u0Var;
        this.a = str;
        this.b = z;
    }

    @Override // defpackage.rq0, defpackage.d35
    public final void b(t25 t25Var) {
        q0 q0Var = (q0) t25Var;
        boolean zG = q0Var.g();
        float fC = q0Var.c();
        String str = this.a;
        u0 u0Var = this.c;
        if (!u0Var.g(str, q0Var)) {
            u0Var.h("ignore_old_datasource @ onProgress", null);
            q0Var.close();
        } else {
            if (zG) {
                return;
            }
            wj7 wj7Var = u0Var.h;
            wj6 wj6Var = wj7Var.e;
            if (wj6Var.d(3) == null) {
                return;
            }
            wj6Var.r++;
            wj7Var.l(fC);
            wj6Var.a();
        }
    }

    @Override // defpackage.rq0
    public final void e(t25 t25Var) {
        q0 q0Var = (q0) t25Var;
        this.c.k(this.a, q0Var, q0Var.b(), true);
    }

    @Override // defpackage.rq0
    public final void f(q0 q0Var) {
        boolean zG = q0Var.g();
        boolean z = q0Var instanceof cpe;
        float fC = q0Var.c();
        Object objE = q0Var.e();
        u0 u0Var = this.c;
        if (objE != null) {
            u0Var.l(this.a, q0Var, objE, fC, zG, this.b, z);
        } else if (zG) {
            u0Var.k(this.a, q0Var, new NullPointerException(), true);
        }
    }
}
