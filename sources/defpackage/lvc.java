package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lvc extends a8j {
    public static final /* synthetic */ zv8[] q;
    public final String c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final mjg g;
    public final String h;
    public final r8e i;
    public final mjg j;
    public final r8e k;
    public final mjg l;
    public final r8e m;
    public final ic6 n;
    public final p3c o;
    public final ex8 p;

    static {
        z8b z8bVar = new z8b(lvc.class, "saveJob", "getSaveJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        q = new zv8[]{z8bVar};
    }

    public lvc(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, qu5 qu5Var, k11 k11Var, String str) {
        this.c = str;
        this.d = ny8Var;
        this.e = ny8Var2;
        this.f = ny8Var3;
        mjg mjgVarA = p90.a(null);
        this.g = mjgVarA;
        this.h = lvc.class.getName();
        this.i = new r8e(mjgVarA);
        mjg mjgVarA2 = p90.a(qu5Var == null ? qu5.a : qu5Var);
        this.j = mjgVarA2;
        this.k = new r8e(mjgVarA2);
        mjg mjgVarA3 = p90.a(k11Var == null ? k11.a : k11Var);
        this.l = mjgVarA3;
        this.m = new r8e(mjgVarA3);
        this.n = new ic6(null);
        this.o = qyj.S();
        this.p = new ex8(24, this);
    }

    public final void B(k11 k11Var) {
        mjg mjgVar;
        Object value;
        do {
            mjgVar = this.l;
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, k11Var));
    }
}
