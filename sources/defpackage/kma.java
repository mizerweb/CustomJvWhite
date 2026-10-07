package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kma implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xx6 b;
    public final /* synthetic */ nma c;

    public /* synthetic */ kma(gjg gjgVar, nma nmaVar, int i) {
        this.a = i;
        this.b = gjgVar;
        this.c = nmaVar;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        nma nmaVar = this.c;
        xx6 xx6Var = this.b;
        switch (i) {
            case 0:
                Object objCollect = xx6Var.collect(new gma(yx6Var, nmaVar, 2), lq4Var);
                return objCollect == hu4Var ? objCollect : sbiVar;
            default:
                Object objCollect2 = xx6Var.collect(new gma(yx6Var, nmaVar, 3), lq4Var);
                return objCollect2 == hu4Var ? objCollect2 : sbiVar;
        }
    }
}
