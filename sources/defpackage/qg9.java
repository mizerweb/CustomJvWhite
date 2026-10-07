package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qg9 implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q72 b;

    public /* synthetic */ qg9(q72 q72Var, int i) {
        this.a = i;
        this.b = q72Var;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        q72 q72Var = this.b;
        switch (i) {
            case 0:
                Object objCollect = q72Var.collect(new iz(yx6Var, 28), lq4Var);
                return objCollect == hu4Var ? objCollect : sbiVar;
            default:
                Object objCollect2 = q72Var.collect(new el9(yx6Var, 25), lq4Var);
                return objCollect2 == hu4Var ? objCollect2 : sbiVar;
        }
    }
}
