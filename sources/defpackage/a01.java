package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class a01 extends ohd {
    public static final a01 c = new a01(b01.a);

    @Override // defpackage.k0
    public final int h(Object obj) {
        return ((boolean[]) obj).length;
    }

    @Override // defpackage.sw3, defpackage.k0
    public final void j(v74 v74Var, int i, Object obj) {
        yz0 yz0Var = (yz0) obj;
        boolean zC = v74Var.C(this.b, i);
        yz0Var.b(yz0Var.d() + 1);
        boolean[] zArr = yz0Var.a;
        int i2 = yz0Var.b;
        yz0Var.b = i2 + 1;
        zArr[i2] = zC;
    }

    @Override // defpackage.k0
    public final Object k(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        yz0 yz0Var = new yz0();
        yz0Var.a = zArr;
        yz0Var.b = zArr.length;
        yz0Var.b(10);
        return yz0Var;
    }

    @Override // defpackage.ohd
    public final Object n() {
        return new boolean[0];
    }

    @Override // defpackage.ohd
    public final void o(x74 x74Var, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            x74Var.h(this.b, i2, zArr[i2]);
        }
    }
}
