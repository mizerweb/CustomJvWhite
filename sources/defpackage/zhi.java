package defpackage;

import one.me.stories.viewer.viewer.UserStoriesScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class zhi implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zhi(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) throws Throwable {
        int i = this.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Object objCollect = ((jz) obj2).collect(new fbg(yx6Var, 9, (cii) obj), lq4Var);
                return objCollect == hu4Var ? objCollect : sbiVar;
            case 1:
                Object objCollect2 = ((xx6) obj2).collect(new fbg(yx6Var, 10, (UserStoriesScreen) obj), lq4Var);
                return objCollect2 == hu4Var ? objCollect2 : sbiVar;
            case 2:
                Object objCollect3 = ((r8e) obj2).a.collect(new joi(yx6Var, (gpi) obj, 4), lq4Var);
                return objCollect3 == hu4Var ? objCollect3 : sbiVar;
            case 3:
                Object objCollect4 = ((xx6) obj2).collect(new fbg(yx6Var, 11, (xzi) obj), lq4Var);
                return objCollect4 == hu4Var ? objCollect4 : sbiVar;
            case 4:
                ((mjg) obj2).collect(new ngi(yx6Var, (i6j) obj), lq4Var);
                return hu4Var;
            default:
                xx6[] xx6VarArr = (xx6[]) obj2;
                Object objN = n1g.n(lq4Var, yx6Var, new j7(xx6VarArr, 12), new rgi((lq4) null, (ioj) obj, 17), xx6VarArr);
                return objN == hu4Var ? objN : sbiVar;
        }
    }
}
