package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sd7 {
    public static final /* synthetic */ zv8[] f;
    public final w09 a;
    public final long b;
    public final vi2 c;
    public final vi2 d;
    public final p3c e = qyj.S();

    static {
        z8b z8bVar = new z8b(sd7.class, "cameraNotStartedJob", "getCameraNotStartedJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        f = new zv8[]{z8bVar};
    }

    public sd7(w09 w09Var, long j, vi2 vi2Var, vi2 vi2Var2) {
        this.a = w09Var;
        this.b = j;
        this.c = vi2Var;
        this.d = vi2Var2;
    }

    public final void a() {
        zv8[] zv8VarArr = f;
        zv8 zv8Var = zv8VarArr[0];
        p3c p3cVar = this.e;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8Var);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        p3cVar.B(this, zv8VarArr[0], null);
    }
}
