package defpackage;

import kotlinx.coroutines.flow.internal.AbortFlowException;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class jz implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xx6 b;

    public /* synthetic */ jz(xx6 xx6Var, int i) {
        this.a = i;
        this.b = xx6Var;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00ea  */
    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        qz6 qz6Var;
        Object obj;
        AbortFlowException e;
        int i = this.a;
        int i2 = 0;
        int i3 = 5;
        int i4 = 6;
        int i5 = 11;
        int i6 = 12;
        int i7 = 19;
        int i8 = 24;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        xx6 xx6Var = this.b;
        switch (i) {
            case 0:
                Object objCollect = xx6Var.collect(new iz(yx6Var, i2), lq4Var);
                return objCollect == hu4Var ? objCollect : sbiVar;
            case 1:
                Object objCollect2 = xx6Var.collect(new iz(yx6Var, i3), lq4Var);
                return objCollect2 == hu4Var ? objCollect2 : sbiVar;
            case 2:
                Object objCollect3 = xx6Var.collect(new iz(yx6Var, i4), lq4Var);
                return objCollect3 == hu4Var ? objCollect3 : sbiVar;
            case 3:
                Object objCollect4 = xx6Var.collect(new iz(yx6Var, i5), lq4Var);
                return objCollect4 == hu4Var ? objCollect4 : sbiVar;
            case 4:
                Object objCollect5 = xx6Var.collect(new iz(yx6Var, i6), lq4Var);
                return objCollect5 == hu4Var ? objCollect5 : sbiVar;
            case 5:
                Object objCollect6 = xx6Var.collect(new iz(yx6Var, 14), lq4Var);
                return objCollect6 == hu4Var ? objCollect6 : sbiVar;
            case 6:
                Object objCollect7 = xx6Var.collect(new iz(yx6Var, 15), lq4Var);
                return objCollect7 == hu4Var ? objCollect7 : sbiVar;
            case 7:
                Object objCollect8 = xx6Var.collect(new iz(yx6Var, 17), lq4Var);
                return objCollect8 == hu4Var ? objCollect8 : sbiVar;
            case 8:
                Object objCollect9 = xx6Var.collect(new iz(yx6Var, 18), lq4Var);
                return objCollect9 == hu4Var ? objCollect9 : sbiVar;
            case 9:
                Object objCollect10 = xx6Var.collect(new iz(yx6Var, i7), lq4Var);
                return objCollect10 == hu4Var ? objCollect10 : sbiVar;
            case 10:
                Object objCollect11 = xx6Var.collect(new iz(yx6Var, 21), lq4Var);
                return objCollect11 == hu4Var ? objCollect11 : sbiVar;
            case 11:
                if (lq4Var instanceof qz6) {
                    qz6Var = (qz6) lq4Var;
                    int i9 = qz6Var.e;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        qz6Var.e = i9 - Integer.MIN_VALUE;
                    } else {
                        qz6Var = new qz6(this, lq4Var);
                    }
                } else {
                    qz6Var = new qz6(this, lq4Var);
                }
                Object obj2 = qz6Var.d;
                int i10 = qz6Var.e;
                if (i10 == 0) {
                    ch3.d0(obj2);
                    Object obj3 = new Object();
                    try {
                        so5 so5Var = new so5(new ufe(), yx6Var, obj3, 2);
                        qz6Var.g = obj3;
                        qz6Var.e = 1;
                        return xx6Var.collect(so5Var, qz6Var) == hu4Var ? hu4Var : sbiVar;
                    } catch (AbortFlowException e2) {
                        obj = obj3;
                        e = e2;
                    }
                } else {
                    if (i10 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = qz6Var.g;
                    try {
                        ch3.d0(obj2);
                        return sbiVar;
                    } catch (AbortFlowException e3) {
                        e = e3;
                    }
                }
                if (e.a == obj) {
                    return sbiVar;
                }
                throw e;
            case 12:
                Object objCollect12 = xx6Var.collect(new iz(yx6Var, 23), lq4Var);
                return objCollect12 == hu4Var ? objCollect12 : sbiVar;
            case 13:
                Object objCollect13 = xx6Var.collect(new iz(yx6Var, i8), lq4Var);
                return objCollect13 == hu4Var ? objCollect13 : sbiVar;
            case 14:
                Object objCollect14 = xx6Var.collect(new iz(yx6Var, 25), lq4Var);
                return objCollect14 == hu4Var ? objCollect14 : sbiVar;
            case 15:
                Object objCollect15 = xx6Var.collect(new iz(yx6Var, 27), lq4Var);
                return objCollect15 == hu4Var ? objCollect15 : sbiVar;
            case 16:
                Object objCollect16 = xx6Var.collect(new el9(yx6Var, i2), lq4Var);
                return objCollect16 == hu4Var ? objCollect16 : sbiVar;
            case 17:
                Object objCollect17 = xx6Var.collect(new el9(yx6Var, 4), lq4Var);
                return objCollect17 == hu4Var ? objCollect17 : sbiVar;
            case 18:
                Object objCollect18 = xx6Var.collect(new el9(yx6Var, i3), lq4Var);
                return objCollect18 == hu4Var ? objCollect18 : sbiVar;
            case 19:
                Object objCollect19 = xx6Var.collect(new el9(yx6Var, i4), lq4Var);
                return objCollect19 == hu4Var ? objCollect19 : sbiVar;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                Object objCollect20 = xx6Var.collect(new el9(yx6Var, 10), lq4Var);
                return objCollect20 == hu4Var ? objCollect20 : sbiVar;
            case 21:
                Object objCollect21 = xx6Var.collect(new el9(yx6Var, i5), lq4Var);
                return objCollect21 == hu4Var ? objCollect21 : sbiVar;
            case 22:
                Object objCollect22 = xx6Var.collect(new el9(yx6Var, i6), lq4Var);
                return objCollect22 == hu4Var ? objCollect22 : sbiVar;
            case 23:
                Object objCollect23 = xx6Var.collect(new el9(yx6Var, 13), lq4Var);
                return objCollect23 == hu4Var ? objCollect23 : sbiVar;
            case 24:
                Object objCollect24 = xx6Var.collect(new el9(yx6Var, i7), lq4Var);
                return objCollect24 == hu4Var ? objCollect24 : sbiVar;
            default:
                Object objCollect25 = xx6Var.collect(new el9(yx6Var, i8), lq4Var);
                return objCollect25 == hu4Var ? objCollect25 : sbiVar;
        }
    }
}
