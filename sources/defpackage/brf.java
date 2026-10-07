package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class brf extends a8j implements f96 {
    public static final /* synthetic */ zv8[] q;
    public final fz0 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final mjg k;
    public final r8e l;
    public Long m;
    public int n;
    public final p3c o;
    public final ic6 p;

    static {
        z8b z8bVar = new z8b(brf.class, "openProfileJob", "getOpenProfileJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        q = new zv8[]{z8bVar};
    }

    public brf(fz0 fz0Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7) {
        this.c = fz0Var;
        this.d = ny8Var;
        this.e = ny8Var2;
        this.f = ny8Var3;
        this.g = ny8Var4;
        this.h = ny8Var5;
        this.i = ny8Var6;
        this.j = ny8Var7;
        mjg mjgVarA = p90.a(s66.a);
        this.k = mjgVarA;
        this.l = new r8e(mjgVarA);
        this.o = qyj.S();
        this.p = new ic6("blacklist");
        e9i.j0(new fz6(new q8e(fz0Var.b), new h30(this, ny8Var2, null), 3), this.b);
        a8j.t(this, null, new fpf(this, null, 2), 3);
    }

    public static final az0 B(brf brfVar, vg4 vg4Var) {
        ny8 ny8Var = brfVar.i;
        ny8 ny8Var2 = brfVar.i;
        boolean zD = jcd.d((jcd) ny8Var.getValue(), vg4Var, null, 2);
        long jV = vg4Var.v();
        String string = zD ? ((jcd) ny8Var2.getValue()).a().toString() : vg4Var.z(us0.b);
        String strK = vg4Var.k();
        if (strK == null) {
            strK = "";
        }
        return new az0(jV, string, strK, vg4Var.u(), zD ? Integer.valueOf(jcd.b((jcd) ny8Var2.getValue(), null, 1)) : null, zD);
    }

    @Override // defpackage.f96
    public final boolean A() {
        return this.n < Integer.MAX_VALUE;
    }

    public final void C(int i) {
        if (this.m == null) {
            pvb pvbVar = (pvb) this.d.getValue();
            this.m = Long.valueOf(pvb.s(pvbVar, new xj4(pvbVar.u().a.g(), i)));
        }
    }

    @Override // defpackage.f96
    public final boolean f() {
        return false;
    }

    @Override // defpackage.f96
    public final void o() {
        C(this.n);
    }

    @Override // defpackage.a8j
    public final void y() {
        fz0 fz0Var = this.c;
        ((t51) fz0Var.a.getValue()).f(fz0Var);
    }
}
