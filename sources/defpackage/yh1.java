package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class yh1 implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ur2 b;

    public /* synthetic */ yh1(ur2 ur2Var, int i) {
        this.a = i;
        this.b = ur2Var;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        ur2 ur2Var = this.b;
        switch (i) {
            case 0:
                Object objCollect = ur2Var.collect(new o5(yx6Var, 18), lq4Var);
                return objCollect == hu4Var ? objCollect : sbiVar;
            case 1:
                Object objCollect2 = ur2Var.collect(new uz1(yx6Var, 6), lq4Var);
                return objCollect2 == hu4Var ? objCollect2 : sbiVar;
            default:
                Object objCollect3 = ur2Var.collect(new ngi(yx6Var, 15), lq4Var);
                return objCollect3 == hu4Var ? objCollect3 : sbiVar;
        }
    }
}
