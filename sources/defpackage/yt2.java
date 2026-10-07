package defpackage;

import java.io.Serializable;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class yt2 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;

    public yt2(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(long j, nq4 nq4Var, String str) {
        xt2 xt2Var;
        if (nq4Var instanceof xt2) {
            xt2Var = (xt2) nq4Var;
            int i = xt2Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                xt2Var.g = i - Integer.MIN_VALUE;
            } else {
                xt2Var = new xt2(this, nq4Var);
            }
        } else {
            xt2Var = new xt2(this, nq4Var);
        }
        Object objH = xt2Var.e;
        int i2 = xt2Var.g;
        if (i2 == 0) {
            ch3.d0(objH);
            xn3 xn3Var = (xn3) this.a.getValue();
            xt2Var.d = str;
            xt2Var.g = 1;
            objH = xn3Var.h(j);
            hu4 hu4Var = hu4.a;
            if (objH == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = xt2Var.d;
            ch3.d0(objH);
        }
        rt2 rt2Var = (rt2) objH;
        if (rt2Var == null) {
            return r66.a;
        }
        nx2 nx2Var = rt2Var.b;
        fda fdaVar = rt2Var.c;
        r17 r17Var = (r17) ((sy4) this.b.getValue()).j(str).getValue();
        boolean zD = jcd.d((jcd) this.e.getValue(), null, rt2Var, 1);
        boolean zY0 = rt2Var.y0();
        c79 c79VarW = yab.w();
        if (r17Var != null && r17Var.a() && !zD && !rt2Var.i0()) {
            c79VarW.add(ut2.a);
        }
        ny8 ny8Var = this.d;
        if (r17Var != null) {
            LinkedHashSet linkedHashSet = r17Var.j;
            if (linkedHashSet.contains(Long.valueOf(rt2Var.A()))) {
                c79VarW.add(ut2.d);
            } else if (linkedHashSet.size() < ((g5d) ((gjf) ny8Var.getValue())).h()) {
                c79VarW.add(ut2.c);
            }
        }
        if (!zD) {
            if (!rt2Var.Z() && rt2Var.C0() && nx2Var.m == 0 && fdaVar != null) {
                c79VarW.add(ut2.e);
            } else if (rt2Var.C0() && nx2Var.m > 0 && fdaVar != null) {
                c79VarW.add(ut2.f);
            }
        }
        ut2 ut2Var = ut2.t;
        if (!zY0 && rt2Var.W()) {
            if (rt2Var.E0()) {
                if (!rt2Var.D0() && fdaVar != null && !rt2Var.K()) {
                    c79VarW.add(ut2Var);
                }
            } else if (rt2Var.s0((et3) this.c.getValue())) {
                c79VarW.add(ut2.h);
            } else {
                c79VarW.add(ut2.g);
            }
        }
        c79VarW.add(ut2.r);
        if (zY0 || !rt2Var.d0()) {
            if (!zY0) {
                boolean zQ0 = rt2Var.q0();
                ut2 ut2Var2 = ut2.i;
                if ((zQ0 || rt2Var.g0()) && !rt2Var.D0()) {
                    c79VarW.add(ut2Var2);
                } else {
                    boolean zB0 = rt2Var.b0();
                    ut2 ut2Var3 = ut2.n;
                    if (zB0) {
                        if (!rt2Var.D0() && !rt2Var.E0() && fdaVar != null && !rt2Var.K()) {
                            c79VarW.add(ut2Var);
                        }
                        if (((Boolean) ((g5d) ((gjf) ny8Var.getValue())).a.S0.a(e5d.S6[95]).i()).booleanValue() && !nx2Var.K.i(np0.n)) {
                            c79VarW.add(ut2.s);
                        }
                        if (!rt2Var.c0()) {
                            if (rt2Var.D0() || rt2Var.E0()) {
                                c79VarW.add(ut2Var3);
                            } else {
                                c79VarW.add(ut2.u);
                                c79VarW.add(ut2.v);
                            }
                        }
                    } else if (rt2Var.h0() && !rt2Var.D0()) {
                        if (!zD) {
                            if (rt2Var.a0()) {
                                c79VarW.add(ut2.q);
                            } else {
                                c79VarW.add(ut2.p);
                            }
                        }
                        c79VarW.add(ut2Var3);
                    } else if (!rt2Var.D0()) {
                        c79VarW.add(ut2Var2);
                        if (rt2Var.B0()) {
                            c79VarW.add(ut2.m);
                        }
                    }
                }
            } else if (fdaVar != null) {
                c79VarW.add(ut2.w);
            }
        } else if (rt2Var.B0()) {
            c79VarW.add(ut2.j);
            c79VarW.add(ut2.l);
        } else {
            c79VarW.add(ut2.k);
        }
        return yab.j(c79VarW);
    }
}
