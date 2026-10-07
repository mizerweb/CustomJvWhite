package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l30 implements xx6 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xx6 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public l30(nr2 nr2Var, ny8 ny8Var, n30 n30Var, ny8 ny8Var2) {
        this.b = nr2Var;
        this.c = ny8Var;
        this.e = n30Var;
        this.d = ny8Var2;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        xx6 xx6Var = this.b;
        switch (i) {
            case 0:
                Object objCollect = ((nr2) xx6Var).collect(new k30(yx6Var, (ny8) obj3, (n30) obj, (ny8) obj2), lq4Var);
                return objCollect == hu4Var ? objCollect : sbiVar;
            default:
                Object objCollect2 = ((r07) xx6Var).collect(new k30(yx6Var, (zc6) obj3, (rl3) obj2, (Long) obj, 3), lq4Var);
                return objCollect2 == hu4Var ? objCollect2 : sbiVar;
        }
    }

    public l30(r07 r07Var, zc6 zc6Var, rl3 rl3Var, Long l) {
        this.b = r07Var;
        this.c = zc6Var;
        this.d = rl3Var;
        this.e = l;
    }
}
