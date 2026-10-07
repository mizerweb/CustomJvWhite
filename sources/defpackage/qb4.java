package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class qb4 extends a8j implements pd4 {
    public static final /* synthetic */ zv8[] y;
    public static final String z;
    public final /* synthetic */ c8j c;
    public final int d;
    public String e;
    public final String f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ifh m;
    public final pzf n;
    public final nr2 o;
    public final ic6 p;
    public final mjg q;
    public final r8e r;
    public final q8e s;
    public final mjg t;
    public final mjg u;
    public volatile String v;
    public sgg w;
    public final p3c x;

    static {
        z8b z8bVar = new z8b(qb4.class, "loginJob", "getLoginJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        y = new zv8[]{z8bVar};
        z = qb4.class.getName();
    }

    public qb4(int i, String str, String str2, long j, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9) {
        c8j c8jVar = new c8j(ny8Var6, new w83(11));
        this.c = c8jVar;
        this.d = i;
        this.e = str;
        this.f = str2;
        this.g = ny8Var;
        this.h = ny8Var2;
        this.i = ny8Var3;
        this.j = ny8Var4;
        this.k = ny8Var5;
        this.l = ny8Var8;
        this.m = new ifh(new za2(ny8Var9, 24, this));
        pzf pzfVarB = e9i.b(0, 1, 1);
        this.n = pzfVarB;
        nr2 nr2VarM0 = e9i.m0(pzfVarB, new cu2(new jz(c8jVar.d, 13), 5));
        this.o = nr2VarM0;
        this.p = new ic6(null);
        mjg mjgVarA = p90.a(Long.valueOf(ew5.s(j, lw5.SECONDS)));
        this.q = mjgVarA;
        int i2 = 3;
        this.r = e9i.G0(new yo0(mjgVarA, i2), this.b, j0g.a, null);
        this.s = ((ep7) ny8Var8.getValue()).c;
        Boolean bool = Boolean.FALSE;
        this.t = p90.a(bool);
        this.u = p90.a(bool);
        this.x = qyj.S();
        e9i.j0(e9i.T(new fz6(nr2VarM0, new fze(this, ny8Var7, (lq4) null, 21), i2), ((n0c) ((xhh) ny8Var5.getValue())).a()), this.b);
    }

    @Override // defpackage.pd4
    public final q8e q() {
        return this.c.d;
    }

    @Override // defpackage.a8j
    public final void y() throws IllegalAccessException, InvocationTargetException {
        sgg sggVar = this.w;
        if (sggVar != null) {
            sggVar.b(null);
        }
        this.w = null;
        zv8[] zv8VarArr = y;
        zv8 zv8Var = zv8VarArr[0];
        p3c p3cVar = this.x;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8Var);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        p3cVar.B(this, zv8VarArr[0], null);
    }
}
