package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class yo0 implements xx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mjg b;

    public /* synthetic */ yo0(mjg mjgVar, int i) {
        this.a = i;
        this.b = mjgVar;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        int i = this.a;
        hu4 hu4Var = hu4.a;
        mjg mjgVar = this.b;
        switch (i) {
            case 0:
                mjgVar.collect(new o5(yx6Var, 6), lq4Var);
                break;
            case 1:
                mjgVar.collect(new o5(yx6Var, 22), lq4Var);
                break;
            case 2:
                mjgVar.collect(new uz1(yx6Var, 10), lq4Var);
                break;
            case 3:
                mjgVar.collect(new ud3(yx6Var, 6), lq4Var);
                break;
            case 4:
                mjgVar.collect(new eh8(yx6Var, 11), lq4Var);
                break;
            case 5:
                mjgVar.collect(new eh8(yx6Var, 12), lq4Var);
                break;
            case 6:
                mjgVar.collect(new eh8(yx6Var, 17), lq4Var);
                break;
            case 7:
                mjgVar.collect(new eh8(yx6Var, 26), lq4Var);
                break;
            case 8:
                mjgVar.collect(new jde(yx6Var, 27), lq4Var);
                break;
            case 9:
                mjgVar.collect(new jde(yx6Var, 28), lq4Var);
                break;
            case 10:
                mjgVar.collect(new ngi(yx6Var, 5), lq4Var);
                break;
            case 11:
                mjgVar.collect(new ngi(yx6Var, 6), lq4Var);
                break;
            case 12:
                mjgVar.collect(new ngi(yx6Var, 7), lq4Var);
                break;
            default:
                mjgVar.collect(new ngi(yx6Var, 9), lq4Var);
                break;
        }
        return hu4Var;
    }
}
