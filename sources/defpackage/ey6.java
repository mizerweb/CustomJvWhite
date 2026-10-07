package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ey6 implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nr2 b;

    public /* synthetic */ ey6(nr2 nr2Var, int i) {
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
                Object objCollect = nr2Var.collect(new iz(yx6Var, 22), lq4Var);
                return objCollect == hu4Var ? objCollect : sbiVar;
            default:
                Object objCollect2 = nr2Var.collect(new el9(yx6Var, 15), lq4Var);
                return objCollect2 == hu4Var ? objCollect2 : sbiVar;
        }
    }
}
