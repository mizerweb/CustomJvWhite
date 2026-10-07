package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tm6 implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r8e b;

    public /* synthetic */ tm6(r8e r8eVar, int i) {
        this.a = i;
        this.b = r8eVar;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        r8e r8eVar = this.b;
        switch (i) {
            case 0:
                Object objCollect = r8eVar.a.collect(new ud3(yx6Var, 20), lq4Var);
                return objCollect == hu4Var ? objCollect : sbiVar;
            case 1:
                Object objCollect2 = r8eVar.a.collect(new ud3(yx6Var, 27), lq4Var);
                return objCollect2 == hu4Var ? objCollect2 : sbiVar;
            default:
                Object objCollect3 = r8eVar.a.collect(new ud3(yx6Var, 28), lq4Var);
                return objCollect3 == hu4Var ? objCollect3 : sbiVar;
        }
    }
}
