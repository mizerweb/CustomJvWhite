package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class q55 implements mjd {
    public final uj7 a;
    public final Executor b;
    public final e68 c;
    public final t3a d;
    public final at5 e;
    public final boolean f;
    public final mjd g;
    public final int h;
    public final w4 i;

    public q55(uj7 uj7Var, Executor executor, e68 e68Var, t3a t3aVar, at5 at5Var, boolean z, mjd mjdVar, int i, w4 w4Var) {
        this.a = uj7Var;
        this.b = executor;
        this.c = e68Var;
        this.d = t3aVar;
        this.e = at5Var;
        this.f = z;
        this.g = mjdVar;
        this.h = i;
        this.i = w4Var;
    }

    @Override // defpackage.mjd
    public final void b(lq0 lq0Var, es0 es0Var) {
        q55 q55Var;
        es0 es0Var2;
        lq0 m55Var;
        v78 v78Var = es0Var.a;
        qe7.v();
        if (rki.d(v78Var.b) || w78.c(v78Var.b)) {
            q55Var = this;
            es0Var2 = es0Var;
            m55Var = new m55(q55Var, lq0Var, es0Var2, new nvd(this.a), this.d, this.h);
        } else {
            m55Var = new l55(this, lq0Var, es0Var, this.h);
            q55Var = this;
            es0Var2 = es0Var;
        }
        q55Var.g.b(m55Var, es0Var2);
    }
}
