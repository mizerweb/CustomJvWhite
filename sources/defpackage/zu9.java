package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zu9 implements gv9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jv9 b;
    public final /* synthetic */ ry9 c;

    public /* synthetic */ zu9(jv9 jv9Var, ry9 ry9Var, int i) {
        this.a = i;
        this.b = jv9Var;
        this.c = ry9Var;
    }

    @Override // defpackage.gv9
    public final void c(e38 e38Var, int i) {
        int i2 = this.a;
        ry9 ry9Var = this.c;
        jv9 jv9Var = this.b;
        switch (i2) {
            case 0:
                e38Var.a0(jv9Var.c, i, ry9Var.d(true));
                break;
            default:
                e38Var.u(jv9Var.c, i, ry9Var.d(true), true);
                break;
        }
    }
}
