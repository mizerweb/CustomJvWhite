package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uoi implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xx6 b;
    public final /* synthetic */ gpi c;

    public /* synthetic */ uoi(xx6 xx6Var, gpi gpiVar, int i) {
        this.a = i;
        this.b = xx6Var;
        this.c = gpiVar;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        gpi gpiVar = this.c;
        xx6 xx6Var = this.b;
        switch (i) {
            case 0:
                Object objCollect = xx6Var.collect(new joi(yx6Var, gpiVar, 1), lq4Var);
                return objCollect == hu4Var ? objCollect : sbiVar;
            default:
                Object objCollect2 = xx6Var.collect(new joi(yx6Var, gpiVar, 3), lq4Var);
                return objCollect2 == hu4Var ? objCollect2 : sbiVar;
        }
    }
}
