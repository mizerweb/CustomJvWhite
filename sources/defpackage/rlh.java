package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rlh extends lk9 implements jg5 {
    public final ifh c;
    public final qlh d = new qlh();

    public rlh(yjg yjgVar) {
        this.c = new ifh(yjgVar);
    }

    @Override // defpackage.xt4
    public final void D0(vt4 vt4Var, Runnable runnable) {
        T0().D0(vt4Var, runnable);
    }

    @Override // defpackage.xt4
    public final void I0(vt4 vt4Var, Runnable runnable) {
        T0().I0(vt4Var, runnable);
    }

    @Override // defpackage.jg5
    public final void P(long j, ek2 ek2Var) {
        tt4 tt4VarT0 = T0();
        jg5 jg5Var = tt4VarT0 instanceof jg5 ? (jg5) tt4VarT0 : null;
        if (jg5Var == null) {
            jg5Var = pa5.a;
        }
        jg5Var.P(j, ek2Var);
    }

    @Override // defpackage.xt4
    public final boolean P0(vt4 vt4Var) {
        return T0().P0(vt4Var);
    }

    @Override // defpackage.lk9
    public final lk9 S0() {
        lk9 lk9VarS0;
        xt4 xt4VarT0 = T0();
        lk9 lk9Var = xt4VarT0 instanceof lk9 ? (lk9) xt4VarT0 : null;
        return (lk9Var == null || (lk9VarS0 = lk9Var.S0()) == null) ? this : lk9VarS0;
    }

    public final xt4 T0() {
        xt4 xt4Var = (xt4) this.d.a();
        return xt4Var == null ? (xt4) this.c.getValue() : xt4Var;
    }

    @Override // defpackage.jg5
    public final no5 t0(long j, Runnable runnable, vt4 vt4Var) {
        tt4 tt4VarT0 = T0();
        jg5 jg5Var = tt4VarT0 instanceof jg5 ? (jg5) tt4VarT0 : null;
        if (jg5Var == null) {
            jg5Var = pa5.a;
        }
        return jg5Var.t0(j, runnable, vt4Var);
    }
}
