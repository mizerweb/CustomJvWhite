package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r07 implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xx6 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r07(xx6 xx6Var, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = xx6Var;
        this.c = obj;
        this.d = obj2;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        Object obj = this.d;
        Object obj2 = this.c;
        xx6 xx6Var = this.b;
        switch (i) {
            case 0:
                Object objN = n1g.n(lq4Var, yx6Var, jr4.c, new vm1((tf7) obj, (lq4) null, 8), new xx6[]{xx6Var, (xx6) obj2});
                return objN == hu4Var ? objN : sbiVar;
            case 1:
                Object objCollect = xx6Var.collect(new so5(yx6Var, (rre) obj2, (cf7) obj, 3), lq4Var);
                return objCollect == hu4Var ? objCollect : sbiVar;
            case 2:
                Object objCollect2 = xx6Var.collect(new gy6(yx6Var, (qf7) obj2, (nh8) obj), lq4Var);
                return objCollect2 == hu4Var ? objCollect2 : sbiVar;
            case 3:
                Object objCollect3 = xx6Var.collect(new so5(yx6Var, (gu4) obj2, (nh8) obj, 4), lq4Var);
                return objCollect3 == hu4Var ? objCollect3 : sbiVar;
            default:
                Object objCollect4 = ((fz6) xx6Var).collect(new so5(yx6Var, (ha9) obj2, (j6b) obj, 5), lq4Var);
                return objCollect4 == hu4Var ? objCollect4 : sbiVar;
        }
    }
}
