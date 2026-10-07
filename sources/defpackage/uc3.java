package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class uc3 implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l50 b;

    public /* synthetic */ uc3(l50 l50Var, int i) {
        this.a = i;
        this.b = l50Var;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        l50 l50Var = this.b;
        switch (i) {
            case 0:
                Object objCollect = l50Var.collect(new uz1(yx6Var, 24), lq4Var);
                return objCollect == hu4Var ? objCollect : sbiVar;
            default:
                Object objCollect2 = l50Var.collect(new ngi(yx6Var, 4), lq4Var);
                return objCollect2 == hu4Var ? objCollect2 : sbiVar;
        }
    }
}
