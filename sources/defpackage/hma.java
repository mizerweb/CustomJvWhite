package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hma implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mjg b;
    public final /* synthetic */ nma c;

    public /* synthetic */ hma(mjg mjgVar, nma nmaVar, int i) {
        this.a = i;
        this.b = mjgVar;
        this.c = nmaVar;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) throws Throwable {
        int i = this.a;
        hu4 hu4Var = hu4.a;
        nma nmaVar = this.c;
        mjg mjgVar = this.b;
        switch (i) {
            case 0:
                mjgVar.collect(new gma(yx6Var, nmaVar, 0), lq4Var);
                break;
            default:
                mjgVar.collect(new gma(yx6Var, nmaVar, 1), lq4Var);
                break;
        }
        return hu4Var;
    }
}
