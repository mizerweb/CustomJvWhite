package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hy3 {
    public final String a = hy3.class.getName();
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;

    public hy3(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (b(r2, r1, r4) == r5) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (d(r2, r1, r4) == r5) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.nc r21, defpackage.nq4 r22) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hy3.a(nc, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object b(q24 q24Var, List list, nq4 nq4Var) {
        ey3 ey3Var;
        q24 q24Var2;
        List list2;
        if (nq4Var instanceof ey3) {
            ey3Var = (ey3) nq4Var;
            int i = ey3Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                ey3Var.h = i - Integer.MIN_VALUE;
            } else {
                ey3Var = new ey3(this, nq4Var);
            }
        } else {
            ey3Var = new ey3(this, nq4Var);
        }
        ey3 ey3Var2 = ey3Var;
        Object obj = ey3Var2.f;
        int i2 = ey3Var2.h;
        if (i2 == 0) {
            ch3.d0(obj);
            l34 l34Var = (l34) this.b.getValue();
            ey3Var2.d = q24Var;
            ey3Var2.e = list;
            ey3Var2.h = 1;
            Object objC = l34Var.C(q24Var, list, wja.DELETED, true, ey3Var2);
            hu4 hu4Var = hu4.a;
            if (objC == hu4Var) {
                return hu4Var;
            }
            q24Var2 = q24Var;
            list2 = list;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list2 = ey3Var2.e;
            q24Var2 = ey3Var2.d;
            ch3.d0(obj);
        }
        ((p24) this.c.getValue()).a(new xy3(q24Var2, list2));
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(lc lcVar, nq4 nq4Var) {
        fy3 fy3Var;
        if (nq4Var instanceof fy3) {
            fy3Var = (fy3) nq4Var;
            int i = fy3Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                fy3Var.g = i - Integer.MIN_VALUE;
            } else {
                fy3Var = new fy3(this, nq4Var);
            }
        } else {
            fy3Var = new fy3(this, nq4Var);
        }
        Object objI = fy3Var.e;
        int i2 = fy3Var.g;
        if (i2 == 0) {
            ch3.d0(objI);
            if (!lcVar.d) {
                return lcVar.c;
            }
            l34 l34Var = (l34) this.b.getValue();
            q24 q24Var = lcVar.a;
            long j = lcVar.b;
            fy3Var.d = lcVar;
            fy3Var.g = 1;
            g24 g24VarM = l34Var.m();
            g24VarM.getClass();
            objI = ch3.I(fy3Var, g24VarM.a, true, false, new s14(q24Var.a, q24Var.b, j, g24VarM, 0));
            hu4 hu4Var = hu4.a;
            if (objI == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lcVar = fy3Var.d;
            ch3.d0(objI);
        }
        return ww3.k1(ww3.G1(lcVar.c, (List) objI));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object d(q24 q24Var, List list, nq4 nq4Var) {
        gy3 gy3Var;
        q24 q24Var2;
        List list2;
        if (nq4Var instanceof gy3) {
            gy3Var = (gy3) nq4Var;
            int i = gy3Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                gy3Var.h = i - Integer.MIN_VALUE;
            } else {
                gy3Var = new gy3(this, nq4Var);
            }
        } else {
            gy3Var = new gy3(this, nq4Var);
        }
        gy3 gy3Var2 = gy3Var;
        Object obj = gy3Var2.f;
        int i2 = gy3Var2.h;
        if (i2 == 0) {
            ch3.d0(obj);
            l34 l34Var = (l34) this.b.getValue();
            gy3Var2.d = q24Var;
            gy3Var2.e = list;
            gy3Var2.h = 1;
            Object objC = l34Var.C(q24Var, list, wja.ACTIVE, false, gy3Var2);
            hu4 hu4Var = hu4.a;
            if (objC == hu4Var) {
                return hu4Var;
            }
            q24Var2 = q24Var;
            list2 = list;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list2 = gy3Var2.e;
            q24Var2 = gy3Var2.d;
            ch3.d0(obj);
        }
        ((p24) this.c.getValue()).a(new vy3(q24Var2, list2, false, true));
        return sbi.a;
    }
}
