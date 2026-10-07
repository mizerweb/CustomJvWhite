package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gy4 implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xx6[] b;

    public /* synthetic */ gy4(xx6[] xx6VarArr, int i) {
        this.a = i;
        this.b = xx6VarArr;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) throws Throwable {
        int i = this.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        xx6[] xx6VarArr = this.b;
        switch (i) {
            case 0:
                Object objN = n1g.n(lq4Var, yx6Var, new ey4(xx6VarArr, 0), new fy4(3, null, 0), xx6VarArr);
                return objN == hu4Var ? objN : sbiVar;
            case 1:
                Object objN2 = n1g.n(lq4Var, yx6Var, new ey4(xx6VarArr, 1), new fy4(3, null, 1), xx6VarArr);
                return objN2 == hu4Var ? objN2 : sbiVar;
            default:
                Object objN3 = n1g.n(lq4Var, yx6Var, new ey4(xx6VarArr, 2), new fy4(3, null, 2), xx6VarArr);
                return objN3 == hu4Var ? objN3 : sbiVar;
        }
    }
}
