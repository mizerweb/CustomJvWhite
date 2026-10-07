package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qz1 implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nr2 b;

    public /* synthetic */ qz1(nr2 nr2Var, int i) {
        this.a = i;
        this.b = nr2Var;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        nr2 nr2Var = this.b;
        switch (i) {
            case 0:
                Object objCollect = nr2Var.collect(new o5(yx6Var, 28), lq4Var);
                return objCollect == hu4Var ? objCollect : sbiVar;
            case 1:
                Object objCollect2 = nr2Var.collect(new ud3(yx6Var, 21), lq4Var);
                return objCollect2 == hu4Var ? objCollect2 : sbiVar;
            default:
                Object objCollect3 = nr2Var.collect(new t6b(yx6Var, 5), lq4Var);
                return objCollect3 == hu4Var ? objCollect3 : sbiVar;
        }
    }
}
