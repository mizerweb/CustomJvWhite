package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class koi implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jz b;
    public final /* synthetic */ gpi c;

    public /* synthetic */ koi(jz jzVar, gpi gpiVar, int i) {
        this.a = i;
        this.b = jzVar;
        this.c = gpiVar;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        gpi gpiVar = this.c;
        jz jzVar = this.b;
        switch (i) {
            case 0:
                Object objCollect = jzVar.collect(new joi(yx6Var, gpiVar, 0), lq4Var);
                return objCollect == hu4Var ? objCollect : sbiVar;
            default:
                Object objCollect2 = jzVar.collect(new joi(yx6Var, gpiVar, 2), lq4Var);
                return objCollect2 == hu4Var ? objCollect2 : sbiVar;
        }
    }
}
