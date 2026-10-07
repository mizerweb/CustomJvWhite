package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ly2 {
    public final t51 a;
    public final long b;
    public final pzf c;
    public final dq4 d;
    public final q8e e;

    public ly2(xhh xhhVar, t51 t51Var, long j) {
        this.a = t51Var;
        this.b = j;
        pzf pzfVarB = e9i.b(0, 0, 7);
        this.c = pzfVarB;
        this.d = cqk.a(((n0c) xhhVar).a());
        this.e = new q8e(pzfVarB);
        t51Var.d(this);
    }

    @l7h
    public final void onEvent(joe joeVar) {
        if (this.b != joeVar.c) {
            return;
        }
        yab.i0(this.d, null, 0, new m5(this, null, 22), 3);
    }
}
