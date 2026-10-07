package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class r8a {
    public final long a;
    public final long b;
    public final t51 c;
    public final pzf d = e9i.b(0, 0, 7);
    public final dq4 e;

    public r8a(long j, long j2, t51 t51Var, xhh xhhVar) {
        this.a = j;
        this.b = j2;
        this.c = t51Var;
        this.e = cqk.a(((n0c) xhhVar).a());
        t51Var.d(this);
    }

    @l7h
    public final void onEvent(kfi kfiVar) {
        if (kfiVar.b == this.b) {
            if (kfiVar.c == this.a || kfiVar.d) {
                yab.i0(this.e, null, 0, new q8a(this, null, 1), 3);
            }
        }
    }

    @l7h
    public final void onEvent(wo3 wo3Var) {
        if (wo3Var.b.contains(Long.valueOf(this.b))) {
            yab.i0(this.e, null, 0, new q8a(this, null, 0), 3);
        }
    }
}
