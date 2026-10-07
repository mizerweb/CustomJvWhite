package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vc4 {
    public final ksh a;
    public volatile v44 b;
    public volatile v44 c;
    public volatile int d;
    public volatile long e;
    public volatile long f;
    public volatile long g;
    public volatile String h = "";
    public volatile int i = -1;

    public vc4(f2 f2Var) {
        this.a = f2Var;
        this.b = f2Var.a();
        this.c = this.b;
    }

    public final wc4 a() {
        long jC = this.c.c(this.b);
        ew5 ew5Var = new ew5(jC);
        if (!ew5.n(jC)) {
            ew5Var = null;
        }
        return new wc4(ew5Var != null ? ew5.g(ew5Var.a) : -1L, this.e, this.f, this.g, this.h, this.i, this.d);
    }
}
