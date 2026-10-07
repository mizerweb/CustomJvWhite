package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cug implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gjg b;

    public /* synthetic */ cug(gjg gjgVar, int i) {
        this.a = i;
        this.b = gjgVar;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        gjg gjgVar = this.b;
        switch (i) {
            case 0:
                Object objCollect = gjgVar.collect(new el9(yx6Var, 18), lq4Var);
                return objCollect == hu4Var ? objCollect : sbiVar;
            default:
                Object objCollect2 = gjgVar.collect(new el9(yx6Var, 21), lq4Var);
                return objCollect2 == hu4Var ? objCollect2 : sbiVar;
        }
    }
}
