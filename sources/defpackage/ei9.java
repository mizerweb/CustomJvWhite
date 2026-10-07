package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ei9 extends ohd {
    public static final ei9 c = new ei9(ti9.a);

    @Override // defpackage.k0
    public final int h(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // defpackage.sw3, defpackage.k0
    public final void j(v74 v74Var, int i, Object obj) {
        ci9 ci9Var = (ci9) obj;
        long jQ = v74Var.q(this.b, i);
        ci9Var.b(ci9Var.d() + 1);
        long[] jArr = ci9Var.a;
        int i2 = ci9Var.b;
        ci9Var.b = i2 + 1;
        jArr[i2] = jQ;
    }

    @Override // defpackage.k0
    public final Object k(Object obj) {
        long[] jArr = (long[]) obj;
        ci9 ci9Var = new ci9();
        ci9Var.a = jArr;
        ci9Var.b = jArr.length;
        ci9Var.b(10);
        return ci9Var;
    }

    @Override // defpackage.ohd
    public final Object n() {
        return new long[0];
    }

    @Override // defpackage.ohd
    public final void o(x74 x74Var, Object obj, int i) {
        long[] jArr = (long[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            x74Var.e(this.b, i2, jArr[i2]);
        }
    }
}
