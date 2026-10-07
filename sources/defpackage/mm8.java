package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mm8 extends a8j {
    public static final /* synthetic */ zv8[] j;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final String f = mm8.class.getName();
    public final mjg g;
    public final p3c h;
    public final r8e i;

    static {
        z8b z8bVar = new z8b(mm8.class, "qrCodeJob", "getQrCodeJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        j = new zv8[]{z8bVar};
    }

    public mm8(b0e b0eVar, int i, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.c = ny8Var2;
        this.d = ny8Var;
        this.e = ny8Var3;
        mjg mjgVarA = p90.a(null);
        this.g = mjgVarA;
        this.h = qyj.S();
        this.i = new r8e(mjgVarA);
        B(b0eVar, i != 0, i);
    }

    public final void B(b0e b0eVar, boolean z, int i) {
        zv8[] zv8VarArr = j;
        zv8 zv8Var = zv8VarArr[0];
        p3c p3cVar = this.h;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8Var);
        if (vo8Var == null || !vo8Var.isActive() || z) {
            xt4 xt4VarB = ((n0c) ((xhh) this.c.getValue())).b();
            yt4 yt4Var = (yt4) this.e.getValue();
            xt4VarB.getClass();
            p3cVar.B(this, zv8VarArr[0], yab.h0(this.b, lvb.x0(xt4VarB, yt4Var), 2, new lm8(this, b0eVar, z, i, null)));
        }
    }
}
