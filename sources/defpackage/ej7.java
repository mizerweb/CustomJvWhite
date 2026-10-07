package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ej7 extends a8j {
    public static final /* synthetic */ int H = 0;
    public final si7 A;
    public sgg B;
    public final ti7 C;
    public final bj7 D;
    public final mjg E;
    public final ifh F;
    public final ic6 G;
    public final ph7 c;
    public final Context d;
    public final gi7 e;
    public final rb8 f;
    public final yt4 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final mjg l;
    public final mjg m;
    public final mjg n;
    public final o24 o;
    public oi7 p;
    public final mjg q;
    public final mjg r;
    public final mjg s;
    public final r8e t;
    public final p41 u;
    public final ir2 v;
    public final ief w;
    public boolean x;
    public sgg y;
    public sgg z;

    public ej7(ph7 ph7Var, Context context, gi7 gi7Var, rb8 rb8Var, yt4 yt4Var, ib9 ib9Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.c = ph7Var;
        this.d = context;
        this.e = gi7Var;
        this.f = rb8Var;
        this.g = yt4Var;
        this.h = ny8Var2;
        this.i = ny8Var;
        this.j = ny8Var3;
        this.k = ny8Var4;
        r66 r66Var = r66.a;
        this.l = p90.a(r66Var);
        Boolean bool = Boolean.FALSE;
        this.m = p90.a(bool);
        mjg mjgVarA = p90.a(r66Var);
        this.n = mjgVarA;
        this.o = new o24(mjgVarA, 8, this);
        this.p = tzl.a(context);
        mjg mjgVarA2 = p90.a(bool);
        this.q = mjgVarA2;
        this.r = mjgVarA2;
        mjg mjgVarA3 = p90.a(null);
        this.s = mjgVarA3;
        this.t = new r8e(mjgVarA3);
        p41 p41VarB = yab.b(-2, 0, null, 6);
        this.u = p41VarB;
        this.v = e9i.q0(p41VarB);
        ief iefVar = ib9Var.a;
        this.w = iefVar;
        si7 si7Var = new si7(this, 0);
        this.A = si7Var;
        ti7 ti7Var = new ti7(this, 0);
        this.C = ti7Var;
        bj7 bj7Var = new bj7(this);
        this.D = bj7Var;
        this.E = p90.a(null);
        ifh ifhVar = new ifh(new mp5(16, this));
        this.F = ifhVar;
        ic6 ic6Var = new ic6(null);
        this.G = ic6Var;
        dq4 dq4Var = this.b;
        sgg sggVar = rb8Var.o;
        if (sggVar == null || !sggVar.W()) {
            rb8Var.e();
        }
        gm0.n("ej7", "init");
        e9i.j0(e9i.T(new fz6(new xi7(ph7Var.b ? rb8Var.h : rb8Var.k, this, 0), new zi7(this, null, 0), 3), ((n0c) D()).f()), cqk.D(dq4Var, yt4Var));
        e9i.j0(e9i.T(new fz6(new xi7(rb8Var.m, this, 1), new zi7(this, null, 1), 3), ((n0c) D()).a()), cqk.D(dq4Var, yt4Var));
        if (ph7Var.c) {
            iefVar.c.add(ti7Var);
            iefVar.e.add(bj7Var);
            iefVar.f.add(si7Var);
            iefVar.l.add((ui7) ifhVar.getValue());
        }
        ghb ghbVar = ew5.b;
        e9i.j0(new fz6(oc9.e0(ic6Var, qe7.P(300L, lw5.MILLISECONDS)), new aj7(this, null, 0), 3), cqk.D(dq4Var, yt4Var));
    }

    public static final Object B(ej7 ej7Var, List list, nq4 nq4Var) {
        return yab.K0(((n0c) ej7Var.D()).f(), new y27(ej7Var, list, null), nq4Var);
    }

    public final void C(boolean z, boolean z2) {
        gm0.n("ej7", "clearSelections()");
        if (z2) {
            this.w.a();
        }
        xt4 xt4VarF = ((n0c) D()).f();
        xt4VarF.getClass();
        a8j.t(this, lvb.x0(xt4VarF, this.g), new in(this, z, null, 4), 2);
        this.e.B(r66.a);
    }

    public final xhh D() {
        return (xhh) this.h.getValue();
    }

    public final int E(kb9 kb9Var) {
        return this.w.h(h1h.b(kb9Var));
    }

    public final int F(kb9 kb9Var, boolean z) {
        gm0.n("ej7", "onItemSelect: " + kb9Var);
        this.x = true;
        hb9 hb9VarB = h1h.b(kb9Var);
        ief iefVar = this.w;
        int iH = iefVar.h(hb9VarB);
        if (iH == 0 && ((Boolean) this.m.getValue()).booleanValue()) {
            return 0;
        }
        int iE = ((g5d) ((gjf) this.j.getValue())).e();
        gi7 gi7Var = this.e;
        if (((Boolean) gi7Var.c.invoke()).booleanValue() && iH == 0 && iefVar.c() >= iE) {
            a8j.x(gi7Var.d, new bi7(iE));
            return 0;
        }
        if (z) {
            iefVar.w(hb9VarB);
        }
        xt4 xt4VarF = ((n0c) D()).f();
        xt4VarF.getClass();
        a8j.t(this, lvb.x0(xt4VarF, this.g), new qy3(this, null, 22), 2);
        this.x = false;
        return E(kb9Var);
    }

    @Override // defpackage.a8j
    public final void y() {
        gm0.n("ej7", "onCleared()");
        bj7 bj7Var = this.D;
        ief iefVar = this.w;
        iefVar.e.remove(bj7Var);
        iefVar.f.remove(this.A);
        iefVar.c.remove(this.C);
        iefVar.l.remove((ui7) this.F.getValue());
        ConcurrentHashMap concurrentHashMap = this.f.q;
        for (mh7 mh7Var : concurrentHashMap.keySet()) {
            if (mh7Var instanceof hh7) {
                concurrentHashMap.put(mh7Var, r66.a);
            }
        }
    }
}
