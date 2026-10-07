package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wt9 implements i4j {
    public final /* synthetic */ kt9 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ zt9 c;

    public wt9(zt9 zt9Var, kt9 kt9Var, int i, long j) {
        this.c = zt9Var;
        this.a = kt9Var;
        this.b = i;
    }

    @Override // defpackage.i4j
    public final void a(long j) {
        this.c.N0(this.a, this.b, j);
    }

    @Override // defpackage.i4j
    public final void b() {
        iyl.b("dropVideoBuffer");
        this.a.m(this.b);
        iyl.c();
        this.c.S0(0, 1);
    }
}
