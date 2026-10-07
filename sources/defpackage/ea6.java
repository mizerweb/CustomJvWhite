package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ea6 extends a8j implements cc4 {
    public static final /* synthetic */ zv8[] k;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ic6 f = new ic6(null);
    public final ic6 g = new ic6(null);
    public final ic6 h = new ic6(null);
    public final p3c i = qyj.S();
    public boolean j;

    static {
        z8b z8bVar = new z8b(ea6.class, "codeJob", "getCodeJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        k = new zv8[]{z8bVar};
    }

    public ea6(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.c = ny8Var;
        this.d = ny8Var2;
        this.e = ny8Var3;
    }

    @Override // defpackage.cc4
    public final void a(String str) {
        xt4 xt4VarA = ((n0c) ((xhh) this.d.getValue())).a();
        yt4 yt4Var = (yt4) this.e.getValue();
        xt4VarA.getClass();
        sgg sggVarH0 = yab.h0(this.b, lvb.x0(xt4VarA, yt4Var), 2, new jd3(this, str, (lq4) null, 28));
        this.i.B(this, k[0], sggVarH0);
    }
}
