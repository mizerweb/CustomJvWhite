package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ud7 {
    public static final /* synthetic */ zv8[] d;
    public final gu4 a;
    public final cf7 b;
    public final p3c c = qyj.S();

    static {
        z8b z8bVar = new z8b(ud7.class, "timeoutJob", "getTimeoutJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        d = new zv8[]{z8bVar};
    }

    public ud7(gu4 gu4Var, cf7 cf7Var) {
        this.a = gu4Var;
        this.b = cf7Var;
    }

    public final void a() {
        zv8[] zv8VarArr = d;
        zv8 zv8Var = zv8VarArr[0];
        p3c p3cVar = this.c;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8Var);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        p3cVar.B(this, zv8VarArr[0], null);
    }
}
