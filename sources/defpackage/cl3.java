package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cl3 implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mjg b;

    public /* synthetic */ cl3(mjg mjgVar, int i) {
        this.a = i;
        this.b = mjgVar;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) throws Throwable {
        int i = this.a;
        hu4 hu4Var = hu4.a;
        mjg mjgVar = this.b;
        switch (i) {
            case 0:
                mjgVar.collect(new iz(yx6Var, 9), lq4Var);
                break;
            case 1:
                mjgVar.collect(new iz(yx6Var, 10), lq4Var);
                break;
            default:
                mjgVar.collect(new el9(yx6Var, 9), lq4Var);
                break;
        }
        return hu4Var;
    }
}
