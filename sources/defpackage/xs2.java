package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xs2 extends ohd {
    public static final xs2 c = new xs2(jt2.a);

    @Override // defpackage.k0
    public final int h(Object obj) {
        return ((char[]) obj).length;
    }

    @Override // defpackage.sw3, defpackage.k0
    public final void j(v74 v74Var, int i, Object obj) {
        vs2 vs2Var = (vs2) obj;
        char cE = v74Var.e(this.b, i);
        vs2Var.b(vs2Var.d() + 1);
        char[] cArr = vs2Var.a;
        int i2 = vs2Var.b;
        vs2Var.b = i2 + 1;
        cArr[i2] = cE;
    }

    @Override // defpackage.k0
    public final Object k(Object obj) {
        char[] cArr = (char[]) obj;
        vs2 vs2Var = new vs2();
        vs2Var.a = cArr;
        vs2Var.b = cArr.length;
        vs2Var.b(10);
        return vs2Var;
    }

    @Override // defpackage.ohd
    public final Object n() {
        return new char[0];
    }

    @Override // defpackage.ohd
    public final void o(x74 x74Var, Object obj, int i) {
        char[] cArr = (char[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            x74Var.z(this.b, i2, cArr[i2]);
        }
    }
}
