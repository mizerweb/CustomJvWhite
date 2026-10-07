package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gfb implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r07 b;

    public /* synthetic */ gfb(r07 r07Var, int i) {
        this.a = i;
        this.b = r07Var;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        r07 r07Var = this.b;
        switch (i) {
            case 0:
                Object objCollect = r07Var.collect(new t6b(yx6Var, 3), lq4Var);
                return objCollect == hu4Var ? objCollect : sbiVar;
            case 1:
                Object objCollect2 = r07Var.collect(new t6b(yx6Var, 4), lq4Var);
                return objCollect2 == hu4Var ? objCollect2 : sbiVar;
            case 2:
                Object objCollect3 = r07Var.collect(new t6b(yx6Var, 7), lq4Var);
                return objCollect3 == hu4Var ? objCollect3 : sbiVar;
            case 3:
                Object objCollect4 = r07Var.collect(new t6b(yx6Var, 25), lq4Var);
                return objCollect4 == hu4Var ? objCollect4 : sbiVar;
            case 4:
                Object objCollect5 = r07Var.collect(new t6b(yx6Var, 26), lq4Var);
                return objCollect5 == hu4Var ? objCollect5 : sbiVar;
            default:
                Object objCollect6 = r07Var.collect(new t6b(yx6Var, 27), lq4Var);
                return objCollect6 == hu4Var ? objCollect6 : sbiVar;
        }
    }
}
