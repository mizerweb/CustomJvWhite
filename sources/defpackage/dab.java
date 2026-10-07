package defpackage;

import one.me.pinbars.PinBarsWidget;

/* JADX INFO: loaded from: classes.dex */
public final class dab implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xx6 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dab(xx6 xx6Var, Object obj, int i) {
        this.a = i;
        this.b = xx6Var;
        this.c = obj;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) throws Throwable {
        int i = this.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        Object obj = this.c;
        xx6 xx6Var = this.b;
        switch (i) {
            case 0:
                Object objCollect = ((q8e) xx6Var).a.collect(new vmb(yx6Var, 15, (s7f) obj), lq4Var);
                return objCollect == hu4Var ? objCollect : sbiVar;
            case 1:
                Object objCollect2 = xx6Var.collect(new vmb(yx6Var, 16, (String) obj), lq4Var);
                return objCollect2 == hu4Var ? objCollect2 : sbiVar;
            case 2:
                Object objCollect3 = ((fz6) xx6Var).collect(new vmb(yx6Var, 17, (qrc) obj), lq4Var);
                return objCollect3 == hu4Var ? objCollect3 : sbiVar;
            case 3:
                Object objCollect4 = xx6Var.collect(new vmb(yx6Var, 18, (PinBarsWidget) obj), lq4Var);
                return objCollect4 == hu4Var ? objCollect4 : sbiVar;
            case 4:
                Object objCollect5 = ((fz6) xx6Var).collect(new vmb(yx6Var, 19, (n3) obj), lq4Var);
                return objCollect5 == hu4Var ? objCollect5 : sbiVar;
            case 5:
                Object objCollect6 = ((tz) xx6Var).collect(new ted(yx6Var, (wed) obj, 0), lq4Var);
                return objCollect6 == hu4Var ? objCollect6 : sbiVar;
            case 6:
                Object objCollect7 = ((dab) xx6Var).collect(new ted(yx6Var, (wed) obj, 1), lq4Var);
                return objCollect7 == hu4Var ? objCollect7 : sbiVar;
            case 7:
                Object objCollect8 = ((dab) xx6Var).collect(new ted(yx6Var, (wed) obj, 2), lq4Var);
                return objCollect8 == hu4Var ? objCollect8 : sbiVar;
            case 8:
                Object objCollect9 = ((tz) xx6Var).collect(new tge(yx6Var, (wge) obj, 0), lq4Var);
                return objCollect9 == hu4Var ? objCollect9 : sbiVar;
            case 9:
                Object objCollect10 = xx6Var.collect(new tge(yx6Var, (wge) obj, 1), lq4Var);
                return objCollect10 == hu4Var ? objCollect10 : sbiVar;
            case 10:
                Object objCollect11 = ((r07) xx6Var).collect(new tge(yx6Var, (wge) obj, 2), lq4Var);
                return objCollect11 == hu4Var ? objCollect11 : sbiVar;
            case 11:
                Object objCollect12 = xx6Var.collect(new el9(yx6Var, (eog) obj, 16), lq4Var);
                return objCollect12 == hu4Var ? objCollect12 : sbiVar;
            case 12:
                Object objCollect13 = xx6Var.collect(new vmb(yx6Var, 20, (ftg) obj), lq4Var);
                return objCollect13 == hu4Var ? objCollect13 : sbiVar;
            case 13:
                Object objCollect14 = ((r8e) xx6Var).a.collect(new el9(yx6Var, (ftg) obj, 17), lq4Var);
                return objCollect14 == hu4Var ? objCollect14 : sbiVar;
            case 14:
                Object objCollect15 = ((nr2) xx6Var).collect(new vmb(yx6Var, 21, (iug) obj), lq4Var);
                return objCollect15 == hu4Var ? objCollect15 : sbiVar;
            case 15:
                Object objCollect16 = xx6Var.collect(new vmb(yx6Var, 22, (jvg) obj), lq4Var);
                return objCollect16 == hu4Var ? objCollect16 : sbiVar;
            case 16:
                Object objCollect17 = xx6Var.collect(new vmb(yx6Var, 23, (hbc) obj), lq4Var);
                return objCollect17 == hu4Var ? objCollect17 : sbiVar;
            default:
                Object objCollect18 = ((qg9) xx6Var).collect(new vmb(yx6Var, 24, (lbj) obj), lq4Var);
                return objCollect18 == hu4Var ? objCollect18 : sbiVar;
        }
    }
}
