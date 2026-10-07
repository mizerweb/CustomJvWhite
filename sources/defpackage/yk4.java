package defpackage;

import android.content.Context;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class yk4 extends a8j {
    public static final /* synthetic */ zv8[] G = {new z8b(yk4.class, "showInviteDialogJob", "getShowInviteDialogJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, yk4.class, "contactListSearchActionJob", "getContactListSearchActionJob()Lkotlinx/coroutines/Job;")};
    public static final zc6 H = new zc6(xw3.P0(wg4.c, wg4.h, wg4.i, wg4.a, wg4.b, wg4.d, wg4.j, wg4.f, wg4.e, wg4.g));
    public final ic6 A;
    public final ic6 B;
    public final mjg C;
    public final mjg D;
    public final String E;
    public final ifh F;
    public final cl4 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
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
    public final r8e u;
    public final ifh v;
    public final p3c w;
    public final p3c x;
    public final qo4 y;
    public final ic6 z;

    public yk4(cl4 cl4Var, hk4 hk4Var, Context context, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11, ny8 ny8Var12, ny8 ny8Var13, ny8 ny8Var14, ny8 ny8Var15, ny8 ny8Var16, ny8 ny8Var17, ny8 ny8Var18, ny8 ny8Var19, ny8 ny8Var20, ny8 ny8Var21, ny8 ny8Var22, ny8 ny8Var23) {
        this.c = cl4Var;
        this.d = ny8Var2;
        this.e = ny8Var4;
        this.f = ny8Var5;
        this.g = ny8Var6;
        this.h = ny8Var7;
        this.i = ny8Var8;
        this.j = ny8Var9;
        this.k = ny8Var10;
        this.l = ny8Var11;
        this.m = ny8Var12;
        this.n = ny8Var13;
        this.o = ny8Var14;
        this.p = ny8Var16;
        this.q = ny8Var17;
        this.r = ny8Var18;
        this.s = ny8Var19;
        this.t = ny8Var23;
        mjg mjgVarA = p90.a(vj4.d);
        r8e r8eVar = new r8e(mjgVarA);
        this.u = r8eVar;
        this.v = new ifh(new fu(ny8Var15, 2));
        this.w = qyj.S();
        this.x = qyj.S();
        lq4 lq4Var = null;
        this.y = new qo4(this.b, r8eVar, cl4Var == cl4.c ? new gvb(context, ny8Var, ny8Var21, ny8Var20) : null, ny8Var2, ny8Var3);
        this.z = new ic6(null);
        this.A = new ic6(null);
        this.B = new ic6(null);
        mjg mjgVarA2 = p90.a(new tnh(R.string.contact_list_search_hint));
        this.C = mjgVarA2;
        this.D = mjgVarA2;
        this.E = yk4.class.getName();
        xx6 xx6VarB = hk4Var.b();
        int iOrdinal = cl4Var.ordinal();
        int i = 1;
        if (iOrdinal == 0) {
            xx6VarB = new xc3(xx6VarB, 1);
        } else if (iOrdinal != 1 && iOrdinal != 2) {
            ore.o();
            throw null;
        }
        e9i.j0(new fz6(xx6VarB, new bp(2, mjgVarA, f9b.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 7), 3), this.b);
        hk4Var.a();
        xt4 xt4VarB = ((n0c) E()).b();
        yt4 yt4VarD = D();
        xt4VarB.getClass();
        a8j.t(this, lvb.x0(xt4VarB, yt4VarD), new wyj(this, lq4Var, 6), 2);
        this.F = new ifh(new z5(this, ny8Var2, ny8Var22, i));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object B(yk4 yk4Var, long j, boolean z, nq4 nq4Var) {
        wk4 wk4Var;
        yk4 yk4Var2;
        long j2;
        yk4Var.getClass();
        if (nq4Var instanceof wk4) {
            wk4Var = (wk4) nq4Var;
            int i = wk4Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                wk4Var.h = i - Integer.MIN_VALUE;
            } else {
                wk4Var = new wk4(yk4Var, nq4Var);
            }
        } else {
            wk4Var = new wk4(yk4Var, nq4Var);
        }
        Object objK0 = wk4Var.f;
        int i2 = wk4Var.h;
        if (i2 == 0) {
            ch3.d0(objK0);
            wk4Var.d = j;
            wk4Var.e = z;
            wk4Var.h = 1;
            yk4Var2 = yk4Var;
            objK0 = yab.K0(((n0c) yk4Var.E()).b(), new uk4(yk4Var2, j, null, 2), wk4Var);
            hu4 hu4Var = hu4.a;
            if (objK0 == hu4Var) {
                return hu4Var;
            }
            j2 = j;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = wk4Var.e;
            j2 = wk4Var.d;
            ch3.d0(objK0);
            yk4Var2 = yk4Var;
        }
        boolean zBooleanValue = ((Boolean) objK0).booleanValue();
        sbi sbiVar = sbi.a;
        if (zBooleanValue) {
            a8j.x(yk4Var2.A, f3g.a);
            return sbiVar;
        }
        a8j.x(yk4Var2.z, new bhg(j2, z));
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object C(yk4 yk4Var, long j, boolean z, nq4 nq4Var) {
        xk4 xk4Var;
        yk4Var.getClass();
        if (nq4Var instanceof xk4) {
            xk4Var = (xk4) nq4Var;
            int i = xk4Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                xk4Var.g = i - Integer.MIN_VALUE;
            } else {
                xk4Var = new xk4(yk4Var, nq4Var);
            }
        } else {
            xk4Var = new xk4(yk4Var, nq4Var);
        }
        Object objA = xk4Var.e;
        hu4 hu4Var = hu4.a;
        int i2 = xk4Var.g;
        if (i2 == 0) {
            ch3.d0(objA);
            nm4 nm4Var = (nm4) yk4Var.i.getValue();
            xk4Var.d = z;
            xk4Var.g = 1;
            objA = nm4Var.a(j, xk4Var);
            if (objA == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = xk4Var.d;
            ch3.d0(objA);
        }
        yhh yhhVar = (yhh) objA;
        if (yhhVar != null) {
            if (cqk.d(yhhVar.b, "not.found")) {
                a8j.x(yk4Var.A, new m3g(new tnh(R.string.snackbar_contact_removed), R.drawable.icon_block, new tnh(R.string.contact_not_support_unblock)));
            } else {
                String str = yk4Var.E;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "unblockContact: unsupported error " + yhhVar, null);
                    }
                }
            }
        } else if (z) {
            a8j.x(yk4Var.A, new m3g(new tnh(R.string.contact_unblocked)));
        }
        return sbi.a;
    }

    public final yt4 D() {
        return (yt4) this.q.getValue();
    }

    public final xhh E() {
        return (xhh) this.d.getValue();
    }

    public final void F(int i, long j) {
        xt4 xt4VarA = ((n0c) E()).a();
        yt4 yt4VarD = D();
        xt4VarA.getClass();
        a8j.t(this, lvb.x0(xt4VarA, yt4VarD), new x53(i, this, j, (lq4) null, 2), 2);
    }

    public final void G() {
        zv8[] zv8VarArr = G;
        zv8 zv8Var = zv8VarArr[0];
        p3c p3cVar = this.w;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8Var);
        if (vo8Var == null || !vo8Var.isActive()) {
            lk9 lk9VarC = ((n0c) E()).c();
            yt4 yt4VarD = D();
            lk9VarC.getClass();
            p3cVar.B(this, zv8VarArr[0], a8j.t(this, lvb.x0(lk9VarC, yt4VarD), new jd3(this, (lq4) null, 18), 2));
        }
    }
}
