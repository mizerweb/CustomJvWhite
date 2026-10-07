package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yi8 extends ohd {
    public static final yi8 c = new yi8(ij8.a);

    @Override // defpackage.k0
    public final int h(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // defpackage.sw3, defpackage.k0
    public final void j(v74 v74Var, int i, Object obj) {
        ((wi8) obj).e(v74Var.l(this.b, i));
    }

    @Override // defpackage.k0
    public final Object k(Object obj) {
        return new wi8((int[]) obj);
    }

    @Override // defpackage.ohd
    public final Object n() {
        return new int[0];
    }

    @Override // defpackage.ohd
    public final void o(x74 x74Var, Object obj, int i) {
        int[] iArr = (int[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            x74Var.y(i2, iArr[i2], this.b);
        }
    }
}
