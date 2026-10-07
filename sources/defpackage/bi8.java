package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class bi8 extends a8j implements pd4 {
    public static final /* synthetic */ zv8[] u = {new z8b(bi8.class, "authJob", "getAuthJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, bi8.class, "jobPhoneValidation", "getJobPhoneValidation()Lkotlinx/coroutines/Job;")};
    public final /* synthetic */ c8j c;
    public final nh8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ic6 i;
    public final pzf j;
    public final ic6 k;
    public final q8e l;
    public final String m;
    public final fz6 n;
    public final p3c o;
    public final p3c p;
    public volatile boolean q;
    public final tnh r;
    public final xx6 s;
    public final r8e t;

    public bi8(ny8 ny8Var, nh8 nh8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        c8j c8jVar = new c8j(ny8Var3, new ik4(9));
        this.c = c8jVar;
        this.d = nh8Var;
        this.e = ny8Var;
        this.f = ny8Var2;
        this.g = ny8Var5;
        this.h = ny8Var6;
        this.i = new ic6(null);
        pzf pzfVarB = e9i.b(0, 0, 7);
        this.j = pzfVarB;
        this.k = new ic6(null);
        this.l = nh8Var.h;
        this.m = bi8.class.getName();
        fz6 fz6Var = new fz6(e9i.m0(pzfVarB, new jz(c8jVar.d, 13)), new y73(this, (lq4) null, 10), 3);
        this.n = fz6Var;
        this.o = qyj.S();
        this.p = qyj.S();
        this.r = new tnh(R.string.oneme_login_input_select_country_info);
        this.s = nh8Var.a(new yh8(2, null, 0));
        this.t = nh8Var.b(this.b);
        e9i.j0(e9i.T(new fz6(fz6Var, new o83(this, ny8Var4, (lq4) null, 4), 3), ((n0c) ((xhh) ny8Var2.getValue())).a()), this.b);
        e9i.j0(e9i.o(new ai8(this, null, 0)), this.b);
    }

    @Override // defpackage.pd4
    public final q8e q() {
        return this.c.d;
    }

    @Override // defpackage.a8j
    public final void y() {
        zv8[] zv8VarArr = u;
        zv8 zv8Var = zv8VarArr[0];
        p3c p3cVar = this.o;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8Var);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        p3cVar.B(this, zv8VarArr[0], null);
        zv8 zv8Var2 = zv8VarArr[1];
        p3c p3cVar2 = this.p;
        vo8 vo8Var2 = (vo8) p3cVar2.m(this, zv8Var2);
        if (vo8Var2 != null) {
            vo8Var2.b(null);
        }
        p3cVar2.B(this, zv8VarArr[1], null);
    }
}
