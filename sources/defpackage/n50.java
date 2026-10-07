package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n50 implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xx6 b;
    public final /* synthetic */ long c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ n50(a4 a4Var, long j, int i) {
        this.a = i;
        this.b = (xx6) a4Var;
        this.c = j;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        long j = this.c;
        xx6 xx6Var = this.b;
        switch (i) {
            case 0:
                Object objCollect = xx6Var.collect(new k50(yx6Var, j, 1), lq4Var);
                return objCollect == hu4Var ? objCollect : sbiVar;
            case 1:
                Object objCollect2 = xx6Var.collect(new k50(yx6Var, j, 3), lq4Var);
                return objCollect2 == hu4Var ? objCollect2 : sbiVar;
            case 2:
                Object objCollect3 = xx6Var.collect(new k50(yx6Var, j, 4), lq4Var);
                return objCollect3 == hu4Var ? objCollect3 : sbiVar;
            default:
                Object objCollect4 = xx6Var.collect(new k50(yx6Var, j, 5), lq4Var);
                return objCollect4 == hu4Var ? objCollect4 : sbiVar;
        }
    }
}
