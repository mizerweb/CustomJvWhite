package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c51 {
    public static final /* synthetic */ zv8[] h;
    public final cf7 a;
    public final gu4 b;
    public final mjg c;
    public final r8e d;
    public volatile boolean e;
    public final p3c f;
    public p41 g;

    static {
        z8b z8bVar = new z8b(c51.class, "job", "getJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        h = new zv8[]{z8bVar};
    }

    public c51(Boolean bool, cf7 cf7Var, y82 y82Var) {
        this.a = cf7Var;
        this.b = y82Var;
        mjg mjgVarA = p90.a(bool);
        this.c = mjgVarA;
        this.d = new r8e(mjgVarA);
        this.f = qyj.S();
        this.g = yab.b(Integer.MAX_VALUE, 0, null, 6);
    }

    public final void a(Boolean bool) {
        p3c p3cVar = this.f;
        zv8[] zv8VarArr = h;
        p3cVar.B(this, zv8VarArr[0], null);
        this.g.i(null);
        this.e = false;
        this.g = yab.b(Integer.MAX_VALUE, 0, null, 6);
        this.e = false;
        mjg mjgVar = this.c;
        mjgVar.getClass();
        mjgVar.j(null, bool);
        this.f.B(this, zv8VarArr[0], yab.i0(this.b, null, 0, new i26(this, (lq4) null, 20), 3));
    }
}
