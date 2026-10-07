package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ij4 {
    public final t51 a;
    public final gu4 b;
    public final pzf c = e9i.b(0, 0, 7);

    public ij4(t51 t51Var, gu4 gu4Var) {
        this.a = t51Var;
        this.b = gu4Var;
        t51Var.d(this);
    }

    public final void a(long j) {
        this.a.c(new so4(j));
    }

    @l7h
    public final void onEvent(bg9 bg9Var) {
        yab.i0(this.b, null, 0, new qn6(this, (lq4) null, 12), 3);
    }

    @l7h
    public final void onEvent(ouc oucVar) {
        yab.i0(this.b, null, 0, new hj4(this, null, 0), 3);
    }

    @l7h
    public final void onEvent(so4 so4Var) {
        yab.i0(this.b, null, 0, new qob(this, so4Var, null, 18), 3);
    }

    @l7h
    public final void onEvent(rei reiVar) {
        yab.i0(this.b, null, 0, new hj4(this, null, 1), 3);
    }
}
