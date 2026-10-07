package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class e30 implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fz6 b;

    public /* synthetic */ e30(fz6 fz6Var, int i) {
        this.a = i;
        this.b = fz6Var;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) throws Throwable {
        int i = this.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        fz6 fz6Var = this.b;
        switch (i) {
            case 0:
                Object objCollect = fz6Var.collect(new o5(yx6Var, 2), lq4Var);
                return objCollect == hu4Var ? objCollect : sbiVar;
            case 1:
                Object objCollect2 = fz6Var.collect(new uz1(yx6Var, 19), lq4Var);
                return objCollect2 == hu4Var ? objCollect2 : sbiVar;
            case 2:
                Object objCollect3 = fz6Var.collect(new uz1(yx6Var, 20), lq4Var);
                return objCollect3 == hu4Var ? objCollect3 : sbiVar;
            case 3:
                Object objCollect4 = fz6Var.collect(new uz1(yx6Var, 22), lq4Var);
                return objCollect4 == hu4Var ? objCollect4 : sbiVar;
            case 4:
                Object objCollect5 = fz6Var.collect(new ud3(yx6Var, 16), lq4Var);
                return objCollect5 == hu4Var ? objCollect5 : sbiVar;
            case 5:
                Object objCollect6 = fz6Var.collect(new ud3(yx6Var, 23), lq4Var);
                return objCollect6 == hu4Var ? objCollect6 : sbiVar;
            case 6:
                Object objCollect7 = fz6Var.collect(new t6b(yx6Var, 18), lq4Var);
                return objCollect7 == hu4Var ? objCollect7 : sbiVar;
            case 7:
                Object objCollect8 = fz6Var.collect(new jde(yx6Var, 9), lq4Var);
                return objCollect8 == hu4Var ? objCollect8 : sbiVar;
            case 8:
                Object objCollect9 = fz6Var.collect(new jde(yx6Var, 13), lq4Var);
                return objCollect9 == hu4Var ? objCollect9 : sbiVar;
            default:
                Object objCollect10 = fz6Var.collect(new jde(yx6Var, 20), lq4Var);
                return objCollect10 == hu4Var ? objCollect10 : sbiVar;
        }
    }
}
