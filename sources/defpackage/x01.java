package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class x01 implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gfb b;
    public final /* synthetic */ vg4 c;

    public /* synthetic */ x01(gfb gfbVar, vg4 vg4Var, int i) {
        this.a = i;
        this.b = gfbVar;
        this.c = vg4Var;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        vg4 vg4Var = this.c;
        gfb gfbVar = this.b;
        switch (i) {
            case 0:
                Object objCollect = gfbVar.collect(new w01(yx6Var, vg4Var, 0), lq4Var);
                return objCollect == hu4Var ? objCollect : sbiVar;
            default:
                Object objCollect2 = gfbVar.collect(new w01(yx6Var, vg4Var, 1), lq4Var);
                return objCollect2 == hu4Var ? objCollect2 : sbiVar;
        }
    }
}
