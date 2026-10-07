package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gq2 extends a8j {
    public static final /* synthetic */ zv8[] k;
    public final wp2 c;
    public final mjg d;
    public final r8e e;
    public final mjg f;
    public final r8e g;
    public final ic6 h;
    public final ic6 i;
    public final p3c j;

    static {
        z8b z8bVar = new z8b(gq2.class, "submitChangesJob", "getSubmitChangesJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        k = new zv8[]{z8bVar};
    }

    public gq2(long j, nnd nndVar, mnd mndVar, ny8 ny8Var, mv2 mv2Var, yh4 yh4Var) {
        wp2 lv2Var;
        int iOrdinal = nndVar.ordinal();
        lq4 lq4Var = null;
        if (iOrdinal == 0 || iOrdinal == 1) {
            lv2Var = new lv2(j, this.b, mndVar, mv2Var.a, mv2Var.b, mv2Var.c, mv2Var.d, mv2Var.e, mv2Var.f, mv2Var.g, mv2Var.h, mv2Var.i, mv2Var.j, mv2Var.k, mv2Var.l, mv2Var.m, mv2Var.n, mv2Var.o, mv2Var.p);
        } else {
            if (iOrdinal != 2) {
                ore.o();
                throw null;
            }
            lv2Var = new xh4(j, this.b, yh4Var.a, yh4Var.b, yh4Var.c, yh4Var.d, yh4Var.e, yh4Var.f, yh4Var.g);
        }
        this.c = lv2Var;
        mjg mjgVarA = p90.a(r66.a);
        this.d = mjgVarA;
        this.e = new r8e(mjgVarA);
        mjg mjgVarA2 = p90.a(lq4Var);
        this.f = mjgVarA2;
        this.g = new r8e(mjgVarA2);
        this.h = new ic6(null);
        this.i = new ic6(null);
        this.j = qyj.S();
        int i = 3;
        e9i.j0(e9i.T(new fz6(lv2Var.f(), new eq2(this, lq4Var, 0), i), ((n0c) ((xhh) ny8Var.getValue())).a()), this.b);
        e9i.j0(e9i.T(new fz6(lv2Var.e, new eq2(this, null, 1), i), ((n0c) ((xhh) ny8Var.getValue())).a()), this.b);
        e9i.j0(e9i.T(new fz6(lv2Var.f, new eq2(this, null, 2), i), ((n0c) ((xhh) ny8Var.getValue())).c()), this.b);
    }

    @Override // defpackage.a8j
    public final void y() {
        this.c.b();
    }
}
