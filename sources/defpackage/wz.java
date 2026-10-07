package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wz implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q8e b;

    public /* synthetic */ wz(q8e q8eVar, int i) {
        this.a = i;
        this.b = q8eVar;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        q8e q8eVar = this.b;
        switch (i) {
            case 0:
                Object objCollect = q8eVar.a.collect(new iz(yx6Var, 3), lq4Var);
                return objCollect == hu4Var ? objCollect : sbiVar;
            case 1:
                Object objCollect2 = q8eVar.a.collect(new iz(yx6Var, 4), lq4Var);
                return objCollect2 == hu4Var ? objCollect2 : sbiVar;
            case 2:
                Object objCollect3 = q8eVar.a.collect(new iz(yx6Var, 20), lq4Var);
                return objCollect3 == hu4Var ? objCollect3 : sbiVar;
            case 3:
                Object objCollect4 = q8eVar.a.collect(new el9(yx6Var, 20), lq4Var);
                return objCollect4 == hu4Var ? objCollect4 : sbiVar;
            default:
                Object objCollect5 = q8eVar.a.collect(new el9(yx6Var, 23), lq4Var);
                return objCollect5 == hu4Var ? objCollect5 : sbiVar;
        }
    }
}
