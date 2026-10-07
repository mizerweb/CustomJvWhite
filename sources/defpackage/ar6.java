package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ar6 extends a8j {
    public static final /* synthetic */ zv8[] q;
    public final long c;
    public final long d;
    public final String e;
    public final long f;
    public final String g;
    public final String h;
    public final long i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final ny8 o;
    public final p3c p = qyj.S();

    static {
        z8b z8bVar = new z8b(ar6.class, "downloadJob", "getDownloadJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        q = new zv8[]{z8bVar};
    }

    public ar6(long j, long j2, String str, long j3, String str2, String str3, long j4, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.c = j;
        this.d = j2;
        this.e = str;
        this.f = j3;
        this.g = str2;
        this.h = str3;
        this.i = j4;
        this.j = ny8Var;
        this.k = ny8Var2;
        this.l = ny8Var3;
        this.m = ny8Var4;
        this.n = ny8Var5;
        this.o = ny8Var6;
    }

    public final sdg B() {
        rt2 rt2Var = (rt2) ((xn3) this.m.getValue()).k(this.c).a.getValue();
        if (rt2Var == null) {
            return null;
        }
        return yql.a(rt2Var);
    }

    @Override // defpackage.a8j
    public final void y() {
        zv8[] zv8VarArr = q;
        zv8 zv8Var = zv8VarArr[0];
        p3c p3cVar = this.p;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8Var);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        p3cVar.B(this, zv8VarArr[0], null);
    }
}
