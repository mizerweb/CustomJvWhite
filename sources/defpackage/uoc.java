package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class uoc extends xt4 {
    public final on5 c = new on5();

    @Override // defpackage.xt4
    public final void D0(vt4 vt4Var, Runnable runnable) {
        on5 on5Var = this.c;
        on5Var.getClass();
        ao5 ao5Var = ao5.a;
        lk9 lk9VarS0 = rk9.a.S0();
        if (lk9VarS0.P0(vt4Var) || on5Var.b || !on5Var.a) {
            lk9VarS0.D0(vt4Var, new gf5(on5Var, 5, runnable));
        } else if (on5Var.d.offer(runnable)) {
            on5Var.a();
        } else {
            ore.k("cannot enqueue any more runnables");
        }
    }

    @Override // defpackage.xt4
    public final boolean P0(vt4 vt4Var) {
        ao5 ao5Var = ao5.a;
        if (rk9.a.S0().P0(vt4Var)) {
            return true;
        }
        on5 on5Var = this.c;
        return !(on5Var.b || !on5Var.a);
    }
}
