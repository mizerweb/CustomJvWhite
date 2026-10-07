package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wd8 {
    public final rre a;
    public final pl b = new pl(7);

    public wd8(rre rreVar) {
        this.a = rreVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(wd8 wd8Var, ArrayList arrayList, List list, nq4 nq4Var) {
        vd8 vd8Var;
        if (nq4Var instanceof vd8) {
            vd8Var = (vd8) nq4Var;
            int i = vd8Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                vd8Var.h = i - Integer.MIN_VALUE;
            } else {
                vd8Var = new vd8(wd8Var, nq4Var);
            }
        } else {
            vd8Var = new vd8(wd8Var, nq4Var);
        }
        Object obj = vd8Var.f;
        int i2 = vd8Var.h;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(obj);
            vd8Var.d = wd8Var;
            vd8Var.e = list;
            vd8Var.h = 1;
            if (wd8Var.b(arrayList, vd8Var) != hu4Var) {
            }
        }
        if (i2 == 1) {
            list = vd8Var.e;
            wd8Var = vd8Var.d;
            ch3.d0(obj);
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list2 = vd8Var.e;
            ch3.d0(obj);
        }
        vd8Var.d = null;
        vd8Var.e = null;
        vd8Var.h = 2;
        Object objI = ch3.I(vd8Var, wd8Var.a, false, true, new w14(wd8Var, 22, list));
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        return objI == hu4Var ? hu4Var : sbiVar;
    }

    public final Object b(Collection collection, nq4 nq4Var) {
        StringBuilder sbC = nbh.C("DELETE FROM informer_banner WHERE id in (");
        vd7.b(sbC, collection.size());
        sbC.append(")");
        Object objI = ch3.I(nq4Var, this.a, false, true, new w14(sbC.toString(), 21, collection));
        return objI == hu4.a ? objI : sbi.a;
    }

    public final Object c(ge8 ge8Var, nq4 nq4Var) {
        Object objI = ch3.I(nq4Var, this.a, false, true, new w14(this, 23, ge8Var));
        return objI == hu4.a ? objI : sbi.a;
    }

    public final Object d(String str, nq4 nq4Var) {
        return ch3.I(nq4Var, this.a, true, false, new qo1(str, 8));
    }
}
