package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class xhg extends a8j {
    public static final /* synthetic */ zv8[] v;
    public final ny8 c;
    public final xu1 d;
    public final gjf e;
    public final boolean f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final p3c n = qyj.S();
    public final mjg o;
    public final r8e p;
    public final qo4 q;
    public final mjg r;
    public final r8e s;
    public final ic6 t;
    public final ic6 u;

    static {
        z8b z8bVar = new z8b(xhg.class, "showInviteDialogJob", "getShowInviteDialogJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        v = new zv8[]{z8bVar};
    }

    public xhg(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, hk4 hk4Var, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, xu1 xu1Var, ny8 ny8Var7, ny8 ny8Var8, gjf gjfVar, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11, ny8 ny8Var12, boolean z) {
        this.c = ny8Var2;
        this.d = xu1Var;
        this.e = gjfVar;
        this.f = z;
        this.g = ny8Var8;
        this.h = ny8Var;
        this.i = ny8Var5;
        this.j = ny8Var6;
        this.k = ny8Var7;
        this.l = ny8Var9;
        this.m = ny8Var12;
        mjg mjgVarA = p90.a(vj4.d);
        this.o = mjgVarA;
        r8e r8eVar = new r8e(mjgVarA);
        this.p = r8eVar;
        this.q = new qo4(this.b, r8eVar, new gvb((Context) ny8Var2.getValue(), ny8Var4, ny8Var10, ny8Var11), ny8Var, ny8Var3);
        mjg mjgVarA2 = p90.a(r66.a);
        this.r = mjgVarA2;
        this.s = new r8e(mjgVarA2);
        lq4 lq4Var = null;
        this.t = new ic6(null);
        this.u = new ic6(null);
        e9i.j0(new fz6(hk4Var.b(), new ryf(this, lq4Var, 4), 3), this.b);
        hk4Var.a();
        a8j.t(this, null, new hpf(this, lq4Var, 5), 3);
    }

    public final void B() {
        zv8[] zv8VarArr = v;
        zv8 zv8Var = zv8VarArr[0];
        p3c p3cVar = this.n;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8Var);
        int i = 1;
        if (vo8Var == null || !vo8Var.isActive()) {
            lk9 lk9VarC = ((n0c) ((xhh) this.h.getValue())).c();
            yt4 yt4Var = (yt4) this.l.getValue();
            lk9VarC.getClass();
            p3cVar.B(this, zv8VarArr[0], a8j.t(this, lvb.x0(lk9VarC, yt4Var), new p7g(this, (lq4) null, i), 2));
        }
    }
}
