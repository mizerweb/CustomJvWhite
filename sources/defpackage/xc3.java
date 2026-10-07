package defpackage;

import java.util.ArrayList;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes4.dex */
public final class xc3 implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xx6 b;

    public /* synthetic */ xc3(xx6 xx6Var, int i) {
        this.a = i;
        this.b = xx6Var;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x0152  */
    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        j07 j07Var;
        yx6 yx6Var2;
        wfe wfeVar;
        int i = this.a;
        int i2 = 25;
        int i3 = 10;
        int i4 = 12;
        int i5 = 13;
        int i6 = 28;
        int i7 = 1;
        int i8 = 14;
        int i9 = 15;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        xx6 xx6Var = this.b;
        switch (i) {
            case 0:
                Object objCollect = xx6Var.collect(new uz1(yx6Var, i2), lq4Var);
                return objCollect == hu4Var ? objCollect : sbiVar;
            case 1:
                Object objCollect2 = xx6Var.collect(new ud3(yx6Var, 7), lq4Var);
                return objCollect2 == hu4Var ? objCollect2 : sbiVar;
            case 2:
                Object objCollect3 = xx6Var.collect(new ud3(yx6Var, 8), lq4Var);
                return objCollect3 == hu4Var ? objCollect3 : sbiVar;
            case 3:
                Object objCollect4 = xx6Var.collect(new ud3(yx6Var, i3), lq4Var);
                return objCollect4 == hu4Var ? objCollect4 : sbiVar;
            case 4:
                Object objCollect5 = xx6Var.collect(new ud3(yx6Var, i4), lq4Var);
                return objCollect5 == hu4Var ? objCollect5 : sbiVar;
            case 5:
                Object objCollect6 = xx6Var.collect(new ud3(yx6Var, i8), lq4Var);
                return objCollect6 == hu4Var ? objCollect6 : sbiVar;
            case 6:
                Object objCollect7 = xx6Var.collect(new ud3(yx6Var, i9), lq4Var);
                return objCollect7 == hu4Var ? objCollect7 : sbiVar;
            case 7:
                Object objCollect8 = xx6Var.collect(new ud3(yx6Var, 17), lq4Var);
                return objCollect8 == hu4Var ? objCollect8 : sbiVar;
            case 8:
                if (lq4Var instanceof j07) {
                    j07Var = (j07) lq4Var;
                    int i10 = j07Var.e;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        j07Var.e = i10 - Integer.MIN_VALUE;
                    } else {
                        j07Var = new j07(this, lq4Var);
                    }
                } else {
                    j07Var = new j07(this, lq4Var);
                }
                Object obj = j07Var.d;
                int i11 = j07Var.e;
                if (i11 == 0) {
                    wfe wfeVarP = nbh.p(obj);
                    l07 l07Var = new l07(wfeVarP, 0, yx6Var);
                    j07Var.g = yx6Var;
                    j07Var.h = wfeVarP;
                    j07Var.e = 1;
                    if (xx6Var.collect(l07Var, j07Var) != hu4Var) {
                        yx6Var2 = yx6Var;
                        wfeVar = wfeVarP;
                    }
                    return hu4Var;
                }
                if (i11 != 1) {
                    if (i11 == 2) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wfeVar = j07Var.h;
                yx6Var2 = j07Var.g;
                ch3.d0(obj);
                ArrayList arrayList = (ArrayList) wfeVar.a;
                if (arrayList == null) {
                    return sbiVar;
                }
                j07Var.g = null;
                j07Var.h = null;
                j07Var.e = 2;
                if (yx6Var2.emit(arrayList, j07Var) != hu4Var) {
                    return sbiVar;
                }
                return hu4Var;
            case 9:
                Object objCollect9 = xx6Var.collect(new l07(yx6Var, new ufe(), i7), lq4Var);
                return objCollect9 == hu4Var ? objCollect9 : sbiVar;
            case 10:
                Object objCollect10 = xx6Var.collect(new ud3(yx6Var, 24), lq4Var);
                return objCollect10 == hu4Var ? objCollect10 : sbiVar;
            case 11:
                Object objCollect11 = xx6Var.collect(new ud3(yx6Var, i2), lq4Var);
                return objCollect11 == hu4Var ? objCollect11 : sbiVar;
            case 12:
                Object objCollect12 = xx6Var.collect(new eh8(yx6Var, i5), lq4Var);
                return objCollect12 == hu4Var ? objCollect12 : sbiVar;
            case 13:
                Object objCollect13 = xx6Var.collect(new eh8(yx6Var, i8), lq4Var);
                return objCollect13 == hu4Var ? objCollect13 : sbiVar;
            case 14:
                Object objCollect14 = xx6Var.collect(new eh8(yx6Var, i9), lq4Var);
                return objCollect14 == hu4Var ? objCollect14 : sbiVar;
            case 15:
                Object objCollect15 = xx6Var.collect(new eh8(yx6Var, 18), lq4Var);
                return objCollect15 == hu4Var ? objCollect15 : sbiVar;
            case 16:
                Object objCollect16 = xx6Var.collect(new eh8(yx6Var, 19), lq4Var);
                return objCollect16 == hu4Var ? objCollect16 : sbiVar;
            case 17:
                Object objCollect17 = xx6Var.collect(new eh8(yx6Var, 20), lq4Var);
                return objCollect17 == hu4Var ? objCollect17 : sbiVar;
            case 18:
                Object objCollect18 = xx6Var.collect(new eh8(yx6Var, i6), lq4Var);
                return objCollect18 == hu4Var ? objCollect18 : sbiVar;
            case 19:
                Object objCollect19 = xx6Var.collect(new t6b(yx6Var, i7), lq4Var);
                return objCollect19 == hu4Var ? objCollect19 : sbiVar;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                Object objCollect20 = xx6Var.collect(new t6b(yx6Var, 6), lq4Var);
                return objCollect20 == hu4Var ? objCollect20 : sbiVar;
            case 21:
                Object objCollect21 = xx6Var.collect(new t6b(yx6Var, i3), lq4Var);
                return objCollect21 == hu4Var ? objCollect21 : sbiVar;
            case 22:
                Object objCollect22 = xx6Var.collect(new t6b(yx6Var, 11), lq4Var);
                return objCollect22 == hu4Var ? objCollect22 : sbiVar;
            case 23:
                Object objCollect23 = xx6Var.collect(new t6b(yx6Var, i4), lq4Var);
                return objCollect23 == hu4Var ? objCollect23 : sbiVar;
            case 24:
                Object objCollect24 = xx6Var.collect(new t6b(yx6Var, i5), lq4Var);
                return objCollect24 == hu4Var ? objCollect24 : sbiVar;
            case 25:
                Object objCollect25 = xx6Var.collect(new t6b(yx6Var, i8), lq4Var);
                return objCollect25 == hu4Var ? objCollect25 : sbiVar;
            case 26:
                Object objCollect26 = xx6Var.collect(new t6b(yx6Var, i9), lq4Var);
                return objCollect26 == hu4Var ? objCollect26 : sbiVar;
            case 27:
                Object objCollect27 = xx6Var.collect(new t6b(yx6Var, 21), lq4Var);
                return objCollect27 == hu4Var ? objCollect27 : sbiVar;
            case 28:
                Object objCollect28 = xx6Var.collect(new t6b(yx6Var, 23), lq4Var);
                return objCollect28 == hu4Var ? objCollect28 : sbiVar;
            default:
                Object objCollect29 = xx6Var.collect(new t6b(yx6Var, i6), lq4Var);
                return objCollect29 == hu4Var ? objCollect29 : sbiVar;
        }
    }
}
