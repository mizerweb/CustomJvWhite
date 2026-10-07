package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class u0d {
    public final long a;
    public final t51 b;
    public final xhh c;
    public final gu4 d;
    public final pzf e = e9i.b(0, 0, 7);

    public u0d(long j, t51 t51Var, xhh xhhVar, dq4 dq4Var) {
        this.a = j;
        this.b = t51Var;
        this.c = xhhVar;
        this.d = dq4Var;
        t51Var.d(this);
    }

    public final void a() {
        try {
            this.b.f(this);
        } catch (Throwable unused) {
        }
    }

    @l7h
    public final void onEvent(kfi kfiVar) {
        long j = kfiVar.b;
        long j2 = this.a;
        if (j == j2) {
            t0d t0dVar = new t0d(j2, kfiVar.c);
            yab.i0(this.d, ((n0c) this.c).a(), 0, new l0d(this, t0dVar, null, 1), 2);
        }
    }
}
