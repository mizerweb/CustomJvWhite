package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xi7 implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xx6 b;
    public final /* synthetic */ ej7 c;

    public /* synthetic */ xi7(xx6 xx6Var, ej7 ej7Var, int i) {
        this.a = i;
        this.b = xx6Var;
        this.c = ej7Var;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        ej7 ej7Var = this.c;
        xx6 xx6Var = this.b;
        switch (i) {
            case 0:
                Object objCollect = xx6Var.collect(new wi7(yx6Var, ej7Var, 0), lq4Var);
                return objCollect == hu4Var ? objCollect : sbiVar;
            default:
                Object objCollect2 = xx6Var.collect(new wi7(yx6Var, ej7Var, 1), lq4Var);
                return objCollect2 == hu4Var ? objCollect2 : sbiVar;
        }
    }
}
