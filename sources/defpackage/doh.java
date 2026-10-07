package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class doh implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r07 b;

    public /* synthetic */ doh(r07 r07Var, int i) {
        this.a = i;
        this.b = r07Var;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        r07 r07Var = this.b;
        switch (i) {
            case 0:
                Object objCollect = r07Var.collect(new jde(yx6Var, 25), lq4Var);
                return objCollect == hu4Var ? objCollect : sbiVar;
            default:
                Object objCollect2 = r07Var.collect(new ngi(yx6Var, 14), lq4Var);
                return objCollect2 == hu4Var ? objCollect2 : sbiVar;
        }
    }
}
