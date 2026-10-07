package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hnc implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j3 b;
    public final /* synthetic */ pnc c;

    public /* synthetic */ hnc(j3 j3Var, pnc pncVar, int i) {
        this.a = i;
        this.b = j3Var;
        this.c = pncVar;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        pnc pncVar = this.c;
        j3 j3Var = this.b;
        switch (i) {
            case 0:
                Object objCollect = j3Var.collect(new gnc(yx6Var, pncVar, 0), lq4Var);
                return objCollect == hu4Var ? objCollect : sbiVar;
            default:
                Object objCollect2 = j3Var.collect(new gnc(yx6Var, pncVar, 2), lq4Var);
                return objCollect2 == hu4Var ? objCollect2 : sbiVar;
        }
    }
}
