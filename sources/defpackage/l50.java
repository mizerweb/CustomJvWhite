package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class l50 implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ xx6 c;

    public /* synthetic */ l50(xx6 xx6Var, long j, int i) {
        this.a = i;
        this.c = xx6Var;
        this.b = j;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        long j = this.b;
        xx6 xx6Var = this.c;
        switch (i) {
            case 0:
                Object objCollect = ((jz) xx6Var).collect(new k50(yx6Var, j, 0), lq4Var);
                return objCollect == hu4Var ? objCollect : sbiVar;
            default:
                Object objCollect2 = ((q8e) xx6Var).a.collect(new k50(yx6Var, j, 2), lq4Var);
                return objCollect2 == hu4Var ? objCollect2 : sbiVar;
        }
    }
}
