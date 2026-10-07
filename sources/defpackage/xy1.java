package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xy1 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bz1 b;

    public /* synthetic */ xy1(bz1 bz1Var, int i) {
        this.a = i;
        this.b = bz1Var;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i;
        int i2 = this.a;
        bz1 bz1Var = this.b;
        switch (i2) {
            case 0:
                i = ((k4f) bz1Var.t.getValue()).b;
                break;
            case 1:
                qq7 qq7Var = bz1Var.x;
                if (qq7Var != null) {
                    return qq7Var.j;
                }
                return null;
            case 2:
                return bz1.v(bz1Var);
            default:
                i = ((k4f) bz1Var.t.getValue()).a;
                break;
        }
        return Integer.valueOf(i);
    }
}
