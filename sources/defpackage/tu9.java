package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tu9 implements gv9, r89 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jv9 b;

    public /* synthetic */ tu9(jv9 jv9Var, int i) {
        this.a = i;
        this.b = jv9Var;
    }

    @Override // defpackage.gv9
    public void c(e38 e38Var, int i) {
        int i2 = this.a;
        jv9 jv9Var = this.b;
        switch (i2) {
            case 0:
                e38Var.W(jv9Var.c, i);
                break;
            case 1:
                e38Var.h0(jv9Var.c, i);
                break;
            case 2:
                e38Var.X(jv9Var.c, i);
                break;
            case 3:
                e38Var.m(jv9Var.c, i);
                break;
            case 4:
                e38Var.d(jv9Var.c, i);
                break;
            case 5:
                e38Var.B(jv9Var.c, i);
                break;
            case 6:
                e38Var.q(jv9Var.c, i);
                break;
            case 7:
                e38Var.T(jv9Var.c, i);
                break;
            case 8:
                xnf xnfVar = jv9Var.n;
                xnfVar.getClass();
                int iE = xnfVar.a.e();
                sv9 sv9Var = jv9Var.c;
                if (iE < 6) {
                    e38Var.j(sv9Var, i, 0.0f);
                } else {
                    e38Var.f(sv9Var, i);
                }
                break;
            case 9:
                e38Var.L(jv9Var.c, i);
                break;
            case 10:
                e38Var.I(jv9Var.c, i);
                break;
            default:
                e38Var.l(jv9Var.c, i);
                break;
        }
    }

    @Override // defpackage.r89
    public void invoke(Object obj) {
        int i = this.a;
        jv9 jv9Var = this.b;
        j3d j3dVar = (j3d) obj;
        switch (i) {
            case 11:
                j3dVar.L0(jv9Var.z);
                break;
            default:
                j3dVar.L0(jv9Var.z);
                break;
        }
    }
}
