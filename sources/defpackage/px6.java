package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class px6 extends ohd {
    public static final px6 c = new px6(sx6.a);

    @Override // defpackage.k0
    public final int h(Object obj) {
        return ((float[]) obj).length;
    }

    @Override // defpackage.sw3, defpackage.k0
    public final void j(v74 v74Var, int i, Object obj) {
        nx6 nx6Var = (nx6) obj;
        float fU = v74Var.u(this.b, i);
        nx6Var.b(nx6Var.d() + 1);
        float[] fArr = nx6Var.a;
        int i2 = nx6Var.b;
        nx6Var.b = i2 + 1;
        fArr[i2] = fU;
    }

    @Override // defpackage.k0
    public final Object k(Object obj) {
        float[] fArr = (float[]) obj;
        nx6 nx6Var = new nx6();
        nx6Var.a = fArr;
        nx6Var.b = fArr.length;
        nx6Var.b(10);
        return nx6Var;
    }

    @Override // defpackage.ohd
    public final Object n() {
        return new float[0];
    }

    @Override // defpackage.ohd
    public final void o(x74 x74Var, Object obj, int i) {
        float[] fArr = (float[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            x74Var.D(this.b, i2, fArr[i2]);
        }
    }
}
