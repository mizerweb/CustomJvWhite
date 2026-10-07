package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nwf extends a8j implements cc4 {
    public static final /* synthetic */ zv8[] g;
    public final ny8 c;
    public final ny8 d;
    public final p3c e = qyj.S();
    public final ic6 f = new ic6(null);

    static {
        z8b z8bVar = new z8b(nwf.class, "codeJob", "getCodeJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        g = new zv8[]{z8bVar};
    }

    public nwf(ny8 ny8Var, ny8 ny8Var2) {
        this.c = ny8Var;
        this.d = ny8Var2;
    }

    @Override // defpackage.cc4
    public final void a(String str) {
        xt4 xt4VarA = ((n0c) ((xhh) this.c.getValue())).a();
        yt4 yt4Var = (yt4) this.d.getValue();
        xt4VarA.getClass();
        sgg sggVarH0 = yab.h0(this.b, lvb.x0(xt4VarA, yt4Var), 2, new dtd(str, this, null, 26));
        this.e.B(this, g[0], sggVarH0);
    }
}
