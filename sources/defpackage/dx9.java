package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dx9 implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ xx6 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dx9(xx6 xx6Var, Object obj, long j, int i) {
        this.a = i;
        this.c = xx6Var;
        this.d = obj;
        this.b = j;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        Object obj = this.d;
        xx6 xx6Var = this.c;
        switch (i) {
            case 0:
                Object objCollect = ((xc3) xx6Var).collect(new qz3(yx6Var, (lx9) obj, this.b, 1), lq4Var);
                return objCollect == hu4Var ? objCollect : sbiVar;
            default:
                Object objCollect2 = ((r07) xx6Var).collect(new qz3(yx6Var, (ceh) obj, this.b, 3), lq4Var);
                return objCollect2 == hu4Var ? objCollect2 : sbiVar;
        }
    }
}
