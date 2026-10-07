package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vb4 extends a8j implements cc4 {
    public static final /* synthetic */ zv8[] m;
    public final String c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final mjg h;
    public final jz i;
    public final p3c j;
    public final ic6 k;
    public final ic6 l;

    static {
        z8b z8bVar = new z8b(vb4.class, "codeInputJob", "getCodeInputJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        m = new zv8[]{z8bVar};
    }

    public vb4(String str, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.c = str;
        this.d = ny8Var;
        this.e = ny8Var2;
        this.f = ny8Var3;
        this.g = ny8Var4;
        mjg mjgVarA = p90.a(ub4.a);
        this.h = mjgVarA;
        this.i = new jz(mjgVarA, 13);
        this.j = qyj.S();
        this.k = new ic6(null);
        this.l = new ic6(null);
    }

    @Override // defpackage.cc4
    public final void a(String str) {
        xt4 xt4VarA = ((n0c) ((xhh) this.f.getValue())).a();
        yt4 yt4Var = (yt4) this.g.getValue();
        xt4VarA.getClass();
        sgg sggVarT = a8j.t(this, lvb.x0(xt4VarA, yt4Var), new jd3(str, this, (lq4) null, 12), 2);
        this.j.B(this, m[0], sggVarT);
    }
}
