package defpackage;

import java.util.Iterator;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes2.dex */
public final class ra1 implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ra1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ef  */
    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) throws Throwable {
        qy6 qy6Var;
        Iterator it;
        yx6 yx6Var2;
        int i = this.a;
        int i2 = 4;
        int i3 = 1;
        int i4 = 24;
        int i5 = 11;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Object objCollect = ((ua1) obj).collect(new o5(yx6Var, 7), lq4Var);
                return objCollect == hu4Var ? objCollect : sbiVar;
            case 1:
                Object objCollect2 = ((to5) obj).collect(new o5(yx6Var, 15), lq4Var);
                return objCollect2 == hu4Var ? objCollect2 : sbiVar;
            case 2:
                Object objCollect3 = ((p5) obj).collect(new o5(yx6Var, i4), lq4Var);
                return objCollect3 == hu4Var ? objCollect3 : sbiVar;
            case 3:
                Object objCollect4 = ((yo0) obj).collect(new uz1(yx6Var, 3), lq4Var);
                return objCollect4 == hu4Var ? objCollect4 : sbiVar;
            case 4:
                Object objCollect5 = ((ls2) obj).collect(new uz1(yx6Var, 14), lq4Var);
                return objCollect5 == hu4Var ? objCollect5 : sbiVar;
            case 5:
                Object objCollect6 = ((dz6) obj).collect(new uz1(yx6Var, 26), lq4Var);
                return objCollect6 == hu4Var ? objCollect6 : sbiVar;
            case 6:
                Object objCollect7 = ((o24) obj).collect(new ud3(yx6Var, i2), lq4Var);
                return objCollect7 == hu4Var ? objCollect7 : sbiVar;
            case 7:
                Object objCollect8 = ((xc3) obj).collect(new ud3(yx6Var, i5), lq4Var);
                return objCollect8 == hu4Var ? objCollect8 : sbiVar;
            case 8:
                Object objCollect9 = ((tz) obj).collect(new ud3(yx6Var, 22), lq4Var);
                return objCollect9 == hu4Var ? objCollect9 : sbiVar;
            case 9:
                if (lq4Var instanceof qy6) {
                    qy6Var = (qy6) lq4Var;
                    int i6 = qy6Var.e;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        qy6Var.e = i6 - Integer.MIN_VALUE;
                    } else {
                        qy6Var = new qy6(this, lq4Var);
                    }
                } else {
                    qy6Var = new qy6(this, lq4Var);
                }
                Object obj2 = qy6Var.d;
                int i7 = qy6Var.e;
                if (i7 == 0) {
                    ch3.d0(obj2);
                    it = ((Iterable) obj).iterator();
                    yx6Var2 = yx6Var;
                } else {
                    if (i7 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = qy6Var.h;
                    yx6 yx6Var3 = qy6Var.g;
                    ch3.d0(obj2);
                    yx6Var2 = yx6Var3;
                }
                while (it.hasNext()) {
                    Object next = it.next();
                    qy6Var.g = yx6Var2;
                    qy6Var.h = it;
                    qy6Var.e = 1;
                    if (yx6Var2.emit(next, qy6Var) == hu4Var) {
                        return hu4Var;
                    }
                }
                return sbiVar;
            case 10:
                Object objCollect10 = ((q72) obj).collect(new ud3(yx6Var, 29), lq4Var);
                return objCollect10 == hu4Var ? objCollect10 : sbiVar;
            case 11:
                Object objCollect11 = ((ra1) obj).collect(new eh8(yx6Var, 5), lq4Var);
                return objCollect11 == hu4Var ? objCollect11 : sbiVar;
            case 12:
                Object objCollect12 = ((ra1) obj).collect(new eh8(yx6Var, 6), lq4Var);
                return objCollect12 == hu4Var ? objCollect12 : sbiVar;
            case 13:
                ((usc) obj).collect(new eh8(yx6Var, 9), lq4Var);
                return hu4Var;
            case 14:
                Object objCollect13 = ((ua1) obj).collect(new t6b(yx6Var, 8), lq4Var);
                return objCollect13 == hu4Var ? objCollect13 : sbiVar;
            case 15:
                Object objCollect14 = ((xc3) obj).collect(new t6b(yx6Var, 16), lq4Var);
                return objCollect14 == hu4Var ? objCollect14 : sbiVar;
            case 16:
                Object objCollect15 = ((bye) obj).collect(new t6b(yx6Var, i4), lq4Var);
                return objCollect15 == hu4Var ? objCollect15 : sbiVar;
            case 17:
                Object objCollect16 = ((ua1) obj).collect(new jde(yx6Var, i2), lq4Var);
                return objCollect16 == hu4Var ? objCollect16 : sbiVar;
            case 18:
                Object objCollect17 = ((ir2) obj).collect(new jde(yx6Var, i5), lq4Var);
                return objCollect17 == hu4Var ? objCollect17 : sbiVar;
            case 19:
                Object objCollect18 = ((fz6) obj).collect(new jde(yx6Var, 12), lq4Var);
                return objCollect18 == hu4Var ? objCollect18 : sbiVar;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                Object objCollect19 = ((j3) obj).collect(new jde(yx6Var, i4), lq4Var);
                return objCollect19 == hu4Var ? objCollect19 : sbiVar;
            case 21:
                Object objCollect20 = ((ocd) obj).collect(new ngi(yx6Var, i3), lq4Var);
                return objCollect20 == hu4Var ? objCollect20 : sbiVar;
            default:
                Object objCollect21 = ((hde) obj).collect(new ngi(yx6Var, i5), lq4Var);
                return objCollect21 == hu4Var ? objCollect21 : sbiVar;
        }
    }
}
