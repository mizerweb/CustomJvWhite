package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cb9 implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ xx6 c;

    public /* synthetic */ cb9(Object obj, int i, int i2) {
        this.a = i2;
        this.c = (xx6) obj;
        this.b = i;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        int i2 = this.b;
        xx6 xx6Var = this.c;
        switch (i) {
            case 0:
                Object objCollect = xx6Var.collect(new bb9(yx6Var, i2, 0), lq4Var);
                return objCollect == hu4Var ? objCollect : sbiVar;
            default:
                Object objCollect2 = ((r8e) xx6Var).a.collect(new bb9(yx6Var, i2, 1), lq4Var);
                return objCollect2 == hu4Var ? objCollect2 : sbiVar;
        }
    }
}
