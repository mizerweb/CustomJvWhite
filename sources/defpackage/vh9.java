package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vh9 implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jz b;

    public /* synthetic */ vh9(jz jzVar, int i) {
        this.a = i;
        this.b = jzVar;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        jz jzVar = this.b;
        switch (i) {
            case 0:
                Object objCollect = jzVar.collect(new eh8(yx6Var, 4), lq4Var);
                return objCollect == hu4Var ? objCollect : sbiVar;
            default:
                Object objCollect2 = jzVar.collect(new eh8(yx6Var, 8), lq4Var);
                return objCollect2 == hu4Var ? objCollect2 : sbiVar;
        }
    }
}
