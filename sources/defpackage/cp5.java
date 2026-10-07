package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cp5 extends ohd {
    public static final cp5 c = new cp5(hp5.a);

    @Override // defpackage.k0
    public final int h(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // defpackage.sw3, defpackage.k0
    public final void j(v74 v74Var, int i, Object obj) {
        ap5 ap5Var = (ap5) obj;
        double dE = v74Var.E(this.b, i);
        ap5Var.b(ap5Var.d() + 1);
        double[] dArr = ap5Var.a;
        int i2 = ap5Var.b;
        ap5Var.b = i2 + 1;
        dArr[i2] = dE;
    }

    @Override // defpackage.k0
    public final Object k(Object obj) {
        double[] dArr = (double[]) obj;
        ap5 ap5Var = new ap5();
        ap5Var.a = dArr;
        ap5Var.b = dArr.length;
        ap5Var.b(10);
        return ap5Var;
    }

    @Override // defpackage.ohd
    public final Object n() {
        return new double[0];
    }

    @Override // defpackage.ohd
    public final void o(x74 x74Var, Object obj, int i) {
        double[] dArr = (double[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            x74Var.j(this.b, i2, dArr[i2]);
        }
    }
}
