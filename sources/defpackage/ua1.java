package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ua1 implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q8e b;

    public /* synthetic */ ua1(q8e q8eVar, int i) {
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
                Object objCollect = q8eVar.a.collect(new o5(yx6Var, 8), lq4Var);
                return objCollect == hu4Var ? objCollect : sbiVar;
            case 1:
                Object objCollect2 = q8eVar.a.collect(new ud3(yx6Var, 0), lq4Var);
                return objCollect2 == hu4Var ? objCollect2 : sbiVar;
            case 2:
                Object objCollect3 = q8eVar.a.collect(new ud3(yx6Var, 2), lq4Var);
                return objCollect3 == hu4Var ? objCollect3 : sbiVar;
            case 3:
                Object objCollect4 = q8eVar.a.collect(new eh8(yx6Var, 1), lq4Var);
                return objCollect4 == hu4Var ? objCollect4 : sbiVar;
            case 4:
                Object objCollect5 = q8eVar.a.collect(new eh8(yx6Var, 21), lq4Var);
                return objCollect5 == hu4Var ? objCollect5 : sbiVar;
            case 5:
                Object objCollect6 = q8eVar.a.collect(new eh8(yx6Var, 22), lq4Var);
                return objCollect6 == hu4Var ? objCollect6 : sbiVar;
            case 6:
                Object objCollect7 = q8eVar.a.collect(new eh8(yx6Var, 23), lq4Var);
                return objCollect7 == hu4Var ? objCollect7 : sbiVar;
            case 7:
                Object objCollect8 = q8eVar.a.collect(new eh8(yx6Var, 29), lq4Var);
                return objCollect8 == hu4Var ? objCollect8 : sbiVar;
            case 8:
                Object objCollect9 = q8eVar.a.collect(new t6b(yx6Var, 9), lq4Var);
                return objCollect9 == hu4Var ? objCollect9 : sbiVar;
            default:
                Object objCollect10 = q8eVar.a.collect(new jde(yx6Var, 5), lq4Var);
                return objCollect10 == hu4Var ? objCollect10 : sbiVar;
        }
    }
}
