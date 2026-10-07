package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qja extends u7e {
    public final ny8 e;
    public final ny8 f;

    public qja(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        super(ny8Var3, ny8Var4, ny8Var5);
        this.e = ny8Var;
        this.f = ny8Var2;
    }

    public final Object D(long j, long j2, hja hjaVar, nq4 nq4Var) {
        Object objW;
        rt2 rt2Var = (rt2) ((xn3) this.e.getValue()).l(j).a.getValue();
        return (rt2Var != null && (objW = w(rt2Var, j2, hjaVar, nq4Var)) == hu4.a) ? objW : sbi.a;
    }

    @Override // defpackage.u7e
    public final String g() {
        return "MessageReactionsUpdateLogic";
    }

    @Override // defpackage.u7e
    public final void h(sfa sfaVar) {
        ((t51) this.f.getValue()).c(new kfi(sfaVar.h, sfaVar.a, true));
    }
}
