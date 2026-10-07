package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ane implements mjd {
    public final Executor a;
    public final qg7 b;
    public final mjd c;
    public final boolean d;
    public final y78 e;

    public ane(Executor executor, qg7 qg7Var, mjd mjdVar, boolean z, y78 y78Var) {
        executor.getClass();
        this.a = executor;
        qg7Var.getClass();
        this.b = qg7Var;
        this.c = mjdVar;
        y78Var.getClass();
        this.e = y78Var;
        this.d = z;
    }

    @Override // defpackage.mjd
    public final void b(lq0 lq0Var, es0 es0Var) {
        this.c.b(new zme(this, lq0Var, es0Var, this.d, this.e), es0Var);
    }
}
