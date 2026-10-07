package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class zj0 implements d35 {
    public final /* synthetic */ bk0 a;
    public final /* synthetic */ dk0 b;

    public zj0(bk0 bk0Var, dk0 dk0Var) {
        this.a = bk0Var;
        this.b = dk0Var;
    }

    @Override // defpackage.d35
    public final void a() {
    }

    @Override // defpackage.d35
    public final void b(t25 t25Var) {
    }

    @Override // defpackage.d35
    public final void c(t25 t25Var) {
    }

    @Override // defpackage.d35
    public final void d(t25 t25Var) {
        if (t25Var.f()) {
            bk0 bk0Var = this.a;
            synchronized (bk0Var) {
                if (bk0Var.j || bk0Var.d() || t25Var != bk0Var.i) {
                    return;
                }
                Runnable runnable = this.b.d;
                if (runnable != null) {
                    tai.l().execute(runnable);
                }
                this.a.k(null, false, ((q0) t25Var).a);
            }
        }
    }
}
