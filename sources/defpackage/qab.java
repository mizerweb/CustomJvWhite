package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qab extends xt4 implements jg5 {
    public final /* synthetic */ jg5 c;
    public final xt4 d;
    public final String e;

    /* JADX WARN: Multi-variable type inference failed */
    public qab(xt4 xt4Var, String str) {
        jg5 jg5Var = xt4Var instanceof jg5 ? (jg5) xt4Var : null;
        this.c = jg5Var == null ? pa5.a : jg5Var;
        this.d = xt4Var;
        this.e = str;
    }

    @Override // defpackage.xt4
    public final void D0(vt4 vt4Var, Runnable runnable) {
        this.d.D0(vt4Var, runnable);
    }

    @Override // defpackage.xt4
    public final void I0(vt4 vt4Var, Runnable runnable) {
        this.d.I0(vt4Var, runnable);
    }

    @Override // defpackage.jg5
    public final void P(long j, ek2 ek2Var) {
        this.c.P(j, ek2Var);
    }

    @Override // defpackage.xt4
    public final boolean P0(vt4 vt4Var) {
        return this.d.P0(vt4Var);
    }

    @Override // defpackage.jg5
    public final no5 t0(long j, Runnable runnable, vt4 vt4Var) {
        return this.c.t0(j, runnable, vt4Var);
    }

    @Override // defpackage.xt4
    public final String toString() {
        return this.e;
    }
}
