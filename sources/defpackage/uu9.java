package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uu9 implements gv9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jv9 b;
    public final /* synthetic */ float c;

    public /* synthetic */ uu9(jv9 jv9Var, float f, int i) {
        this.a = i;
        this.b = jv9Var;
        this.c = f;
    }

    @Override // defpackage.gv9
    public final void c(e38 e38Var, int i) {
        int i2 = this.a;
        float f = this.c;
        jv9 jv9Var = this.b;
        switch (i2) {
            case 0:
                e38Var.M(jv9Var.c, i, f);
                break;
            case 1:
                e38Var.j(jv9Var.c, i, f);
                break;
            default:
                xnf xnfVar = jv9Var.n;
                xnfVar.getClass();
                int iE = xnfVar.a.e();
                sv9 sv9Var = jv9Var.c;
                if (iE < 6) {
                    e38Var.j(sv9Var, i, f);
                } else {
                    e38Var.H(sv9Var, i);
                }
                break;
        }
    }
}
