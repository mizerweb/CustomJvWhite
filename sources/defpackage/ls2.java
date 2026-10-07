package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ls2 implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xx6 b;
    public final /* synthetic */ ns2 c;

    public /* synthetic */ ls2(xx6 xx6Var, ns2 ns2Var, int i) {
        this.a = i;
        this.b = xx6Var;
        this.c = ns2Var;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        ns2 ns2Var = this.c;
        xx6 xx6Var = this.b;
        switch (i) {
            case 0:
                Object objCollect = xx6Var.collect(new ks2(yx6Var, ns2Var, 0), lq4Var);
                return objCollect == hu4Var ? objCollect : sbiVar;
            default:
                Object objCollect2 = xx6Var.collect(new ks2(yx6Var, ns2Var, 1), lq4Var);
                return objCollect2 == hu4Var ? objCollect2 : sbiVar;
        }
    }
}
