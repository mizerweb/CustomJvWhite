package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class za implements dzc {
    public static final /* synthetic */ zv8[] j;
    public final long a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public gu4 e;
    public final pzf f;
    public final q8e g;
    public final p3c h;
    public final boolean i;

    static {
        z8b z8bVar = new z8b(za.class, "processActionJob", "getProcessActionJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        j = new zv8[]{z8bVar};
    }

    public za(long j2, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = j2;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        boolean z = false;
        pzf pzfVarB = e9i.b(0, Integer.MAX_VALUE, 5);
        this.f = pzfVarB;
        this.g = new q8e(pzfVarB);
        this.h = qyj.S();
        rt2 rt2Var = (rt2) ((xn3) ny8Var.getValue()).k(j2).a.getValue();
        if (rt2Var != null && rt2Var.d0()) {
            z = true;
        }
        this.i = z;
    }

    @Override // defpackage.dzc
    public final void a(dq4 dq4Var) {
        this.e = dq4Var;
    }

    @Override // defpackage.dzc
    public final void b() {
        this.e = null;
    }

    @Override // defpackage.dzc
    public final void c(xyc xycVar) {
    }

    @Override // defpackage.dzc
    public final void e(long j2) {
    }

    public final gjf f() {
        return (gjf) this.d.getValue();
    }
}
