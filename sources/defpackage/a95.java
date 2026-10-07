package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a95 implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xx6[] b;
    public final /* synthetic */ List c;

    public /* synthetic */ a95(xx6[] xx6VarArr, List list, int i) {
        this.a = i;
        this.b = xx6VarArr;
        this.c = list;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) throws Throwable {
        int i = this.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        List list = this.c;
        xx6[] xx6VarArr = this.b;
        switch (i) {
            case 0:
                Object objN = n1g.n(lq4Var, yx6Var, new j7(xx6VarArr, 3), new z85(0, null, list), xx6VarArr);
                return objN == hu4Var ? objN : sbiVar;
            default:
                Object objN2 = n1g.n(lq4Var, yx6Var, new j7(xx6VarArr, 9), new z85(1, null, list), xx6VarArr);
                return objN2 == hu4Var ? objN2 : sbiVar;
        }
    }
}
