package defpackage;

import android.app.Application;
import android.graphics.RectF;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class bpf extends a8j {
    public static final /* synthetic */ zv8[] Y = {new z8b(bpf.class, "showInviteDialogJob", "getShowInviteDialogJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, bpf.class, "sectionItemsJob", "getSectionItemsJob()Lkotlinx/coroutines/Job;")};
    public final mjg B;
    public final r8e C;
    public final mjg D;
    public final r8e E;
    public final AtomicReference F;
    public final AtomicLong G;
    public final p3c H;
    public final p3c I;
    public final l8b J;
    public final ny8 K;
    public boolean X;
    public final ha9 c;
    public final xk7 d;
    public final im7 e;
    public final Application f;
    public final utd g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final ny8 o;
    public final ny8 p;
    public final ny8 q;
    public final ny8 r;
    public final ny8 s;
    public final ny8 t;
    public final ny8 u;
    public final ny8 v;
    public final ny8 w;
    public final ny8 x;
    public final v63 y = new v63(1);
    public final ic6 z = new ic6(null);
    public final ic6 A = new ic6(null);

    public bpf(l7f l7fVar, ha9 ha9Var, ny8 ny8Var, ny8 ny8Var2, xk7 xk7Var, im7 im7Var, kpd kpdVar, ny8 ny8Var3, ny8 ny8Var4, Application application, ny8 ny8Var5, ny8 ny8Var6, utd utdVar, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11, ny8 ny8Var12, ny8 ny8Var13, ny8 ny8Var14, ny8 ny8Var15, ny8 ny8Var16, ny8 ny8Var17, ny8 ny8Var18) {
        this.c = ha9Var;
        this.d = xk7Var;
        this.e = im7Var;
        this.f = application;
        this.g = utdVar;
        this.h = ny8Var;
        this.i = ny8Var2;
        this.j = ny8Var3;
        this.k = ny8Var4;
        this.l = ny8Var5;
        this.m = ny8Var6;
        this.n = ny8Var7;
        this.o = ny8Var8;
        this.p = ny8Var9;
        this.q = ny8Var10;
        this.r = ny8Var11;
        this.s = ny8Var12;
        this.t = ny8Var13;
        this.u = ny8Var14;
        this.v = ny8Var16;
        this.w = ny8Var17;
        this.x = ny8Var18;
        lq4 lq4Var = null;
        mjg mjgVarA = p90.a(ivf.g);
        this.B = mjgVarA;
        this.C = new r8e(mjgVarA);
        r66 r66Var = r66.a;
        mjg mjgVarA2 = p90.a(r66Var);
        this.D = mjgVarA2;
        xx6 xx6VarT = e9i.T(e9i.M0(((y6b) ny8Var17.getValue()).h, new rgi(lq4Var, this, 11)), ((n0c) ((xhh) ny8Var3.getValue())).a());
        dq4 dq4Var = this.b;
        a8g a8gVar = j0g.a;
        int i = 3;
        int i2 = 0;
        this.E = e9i.G0(new r07(mjgVarA2, e9i.G0(xx6VarT, dq4Var, a8gVar, s66.a), new nff(i, lq4Var, 1), i2), this.b, a8gVar, r66Var);
        this.F = new AtomicReference();
        this.G = new AtomicLong();
        this.H = qyj.S();
        this.I = qyj.S();
        this.J = new l8b(2);
        this.K = ny8Var15;
        B();
        e9i.j0(new fz6(e9i.K(((wsc) ny8Var4.getValue()).g("ignore_battery_optimizations", new cka(19)), 1), new tof(this, null, 0), i), this.b);
        e9i.j0(new fz6(e9i.K(((y6b) ny8Var17.getValue()).h, 1), new tof(this, null, 1), i), this.b);
        dq4 dq4Var2 = this.b;
        xt4 xt4VarA = ((n0c) ((xhh) ny8Var3.getValue())).a();
        vt4 vt4Var = (vt4) ny8Var12.getValue();
        xt4VarA.getClass();
        yab.i0(dq4Var2, lvb.x0(xt4VarA, vt4Var), 0, new voc(l7fVar, this, ny8Var, lq4Var, 27), 2);
        e9i.j0(new fz6(new q8e(kpdVar.a), new xof(this, lq4Var, i2), i), this.b);
    }

    public final void B() {
        sgg sggVarH0 = yab.h0(this.b, ((n0c) D()).a(), 2, new apf(this, null, 2));
        this.I.B(this, Y[1], sggVarH0);
    }

    public final yt4 C() {
        return (yt4) this.s.getValue();
    }

    public final xhh D() {
        return (xhh) this.j.getValue();
    }

    public final Long E() {
        long j = ((ivf) this.C.a.getValue()).a;
        Long lValueOf = Long.valueOf(j);
        if (j != -1) {
            return lValueOf;
        }
        return null;
    }

    public final void F(String str, RectF rectF) {
        xt4 xt4VarB = ((n0c) D()).b();
        yt4 yt4VarC = C();
        xt4VarB.getClass();
        yab.i0(this.b, lvb.x0(xt4VarB, yt4VarC), 0, new xra(15, (lq4) null, (Object) rectF, (Object) this, (Object) str, false), 2);
    }

    public final void G() {
        if (!((wsc) this.k.getValue()).c(wsc.n)) {
            a8j.x(this.z, huf.b);
            return;
        }
        xt4 xt4VarB = ((n0c) D()).b();
        yt4 yt4VarC = C();
        xt4VarB.getClass();
        yab.i0(this.b, lvb.x0(xt4VarB, yt4VarC), 0, new xof(this, null, 1), 2);
    }
}
