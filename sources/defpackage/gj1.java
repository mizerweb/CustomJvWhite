package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gj1 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lj1 b;

    public /* synthetic */ gj1(lj1 lj1Var, int i) {
        this.a = i;
        this.b = lj1Var;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int iL;
        int i = this.a;
        lj1 lj1Var = this.b;
        switch (i) {
            case 0:
                return new jj1(lj1Var);
            case 1:
                af7 af7Var = lj1Var.y;
                if (af7Var != null) {
                    return (lxi) af7Var.invoke();
                }
                return null;
            case 2:
                iL = lj1Var.x.a;
                break;
            case 3:
                return Boolean.valueOf(lj1Var.x.a == 0);
            case 4:
                iL = lj1Var.u.l();
                break;
            default:
                return Boolean.valueOf(lj1Var.x.a == 0);
        }
        return Integer.valueOf(iL);
    }
}
