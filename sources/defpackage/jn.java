package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jn {
    public static final /* synthetic */ zv8[] j;
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final dq4 g;
    public final p3c h;
    public final boolean i;

    static {
        z8b z8bVar = new z8b(jn.class, "invalidateCacheJob", "getInvalidateCacheJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        j = new zv8[]{z8bVar};
    }

    public jn(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, pk5 pk5Var, xhh xhhVar, yt4 yt4Var) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
        this.f = ny8Var6;
        xt4 xt4VarA = ((n0c) xhhVar).a();
        xt4VarA.getClass();
        this.g = cqk.a(lvb.x0(xt4VarA, yt4Var));
        this.h = qyj.S();
        this.i = pk5Var.compareTo(pk5.AVERAGE) >= 0;
    }

    public final boolean a() {
        return ((nni) this.a.getValue()).d.getBoolean("app.media.animoji.enabled", this.i);
    }
}
