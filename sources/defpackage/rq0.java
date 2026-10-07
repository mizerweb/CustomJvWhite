package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class rq0 implements d35 {
    @Override // defpackage.d35
    public void a() {
    }

    @Override // defpackage.d35
    public void b(t25 t25Var) {
    }

    @Override // defpackage.d35
    public final void c(t25 t25Var) {
        try {
            e(t25Var);
        } finally {
            t25Var.close();
        }
    }

    @Override // defpackage.d35
    public final void d(t25 t25Var) {
        q0 q0Var = (q0) t25Var;
        boolean zG = q0Var.g();
        try {
            f(q0Var);
        } finally {
            if (zG) {
                q0Var.close();
            }
        }
    }

    public abstract void e(t25 t25Var);

    public abstract void f(q0 q0Var);
}
