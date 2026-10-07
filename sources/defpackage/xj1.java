package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xj1 {
    public final rre a;
    public final v2a b = new v2a(new pl(2), 26, new vj1(0));

    public xj1(rre rreVar) {
        this.a = rreVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object c(xj1 xj1Var, ArrayList arrayList, int i, nq4 nq4Var) {
        sj1 sj1Var;
        if (nq4Var instanceof sj1) {
            sj1Var = (sj1) nq4Var;
            int i2 = sj1Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sj1Var.h = i2 - Integer.MIN_VALUE;
            } else {
                sj1Var = new sj1(xj1Var, nq4Var);
            }
        } else {
            sj1Var = new sj1(xj1Var, nq4Var);
        }
        Object obj = sj1Var.f;
        int i3 = sj1Var.h;
        int i4 = 2;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i3 == 0) {
            ch3.d0(obj);
            sj1Var.d = xj1Var;
            sj1Var.e = i;
            sj1Var.h = 1;
            Object objI = ch3.I(sj1Var, xj1Var.a, false, true, new tc(xj1Var, 10, arrayList));
            if (objI != hu4Var) {
                objI = sbiVar;
            }
            if (objI != hu4Var) {
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = sj1Var.e;
        xj1Var = sj1Var.d;
        ch3.d0(obj);
        sj1Var.d = null;
        sj1Var.e = i;
        sj1Var.h = 2;
        Object objI2 = ch3.I(sj1Var, xj1Var.a, false, true, new hb8(i, i4));
        if (objI2 != hu4Var) {
            objI2 = sbiVar;
        }
        return objI2 == hu4Var ? hu4Var : sbiVar;
    }

    public final Object a(nq4 nq4Var) {
        Object objI = ch3.I(nq4Var, this.a, false, true, new vi2(28));
        return objI == hu4.a ? objI : sbi.a;
    }

    public final Object b(List list, nq4 nq4Var) {
        Object objI = ch3.I(nq4Var, this.a, false, true, new tj1(0, nbh.x(")", nbh.C("DELETE FROM call_history WHERE history_id IN ("), list), list));
        return objI == hu4.a ? objI : sbi.a;
    }
}
