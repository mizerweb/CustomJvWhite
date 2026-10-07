package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oj5 implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xx6[] b;

    public /* synthetic */ oj5(xx6[] xx6VarArr, int i) {
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
                Object objN = n1g.n(lq4Var, yx6Var, new j7(xx6VarArr, 4), new nj5(3, null, 0), xx6VarArr);
                return objN == hu4Var ? objN : sbiVar;
            case 1:
                Object objN2 = n1g.n(lq4Var, yx6Var, new j7(xx6VarArr, 6), new nj5(3, null, 1), xx6VarArr);
                return objN2 == hu4Var ? objN2 : sbiVar;
            case 2:
                Object objN3 = n1g.n(lq4Var, yx6Var, new j7(xx6VarArr, 10), new nj5(3, null, 3), xx6VarArr);
                return objN3 == hu4Var ? objN3 : sbiVar;
            case 3:
                Object objN4 = n1g.n(lq4Var, yx6Var, new j7(xx6VarArr, 11), new nj5(3, null, 4), xx6VarArr);
                return objN4 == hu4Var ? objN4 : sbiVar;
            default:
                Object objN5 = n1g.n(lq4Var, yx6Var, new j7(xx6VarArr, 13), new nj5(3, null, 5), xx6VarArr);
                return objN5 == hu4Var ? objN5 : sbiVar;
        }
    }
}
