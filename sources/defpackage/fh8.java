package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fh8 extends a8j implements pd4 {
    public static final /* synthetic */ zv8[] k;
    public final /* synthetic */ c8j c;
    public final String d;
    public final String e;
    public final p3c f;
    public final ic6 g;
    public final ks9 h;
    public final ic6 i;
    public final nr2 j;

    static {
        z8b z8bVar = new z8b(fh8.class, "registerJob", "getRegisterJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        k = new zv8[]{z8bVar};
    }

    public fh8(String str, String str2, ny8 ny8Var) {
        c8j c8jVar = new c8j(ny8Var, new x27(12));
        this.c = c8jVar;
        this.d = str;
        this.e = str2;
        this.f = qyj.S();
        this.g = new ic6(null);
        this.h = new ks9(14, xw3.P0(new a09(64), new rf(), new fhb()));
        ic6 ic6Var = new ic6(null);
        this.i = ic6Var;
        this.j = e9i.m0(ic6Var, new cu2(new jz(c8jVar.d, 13), 7));
    }

    public final void B(String str, boolean z) {
        a8j.x(this.i, (z || str.length() != 0) ? d3g.a : lv7.a);
    }

    @Override // defpackage.pd4
    public final q8e q() {
        return this.c.d;
    }

    @Override // defpackage.a8j
    public final void y() {
        zv8[] zv8VarArr = k;
        zv8 zv8Var = zv8VarArr[0];
        p3c p3cVar = this.f;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8Var);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        p3cVar.B(this, zv8VarArr[0], null);
    }
}
