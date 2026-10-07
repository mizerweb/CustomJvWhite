package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class d1g extends ohd {
    public static final d1g c = new d1g(k1g.a);

    @Override // defpackage.k0
    public final int h(Object obj) {
        return ((short[]) obj).length;
    }

    @Override // defpackage.sw3, defpackage.k0
    public final void j(v74 v74Var, int i, Object obj) {
        c1g c1gVar = (c1g) obj;
        short sW = v74Var.w(this.b, i);
        c1gVar.b(c1gVar.d() + 1);
        short[] sArr = c1gVar.a;
        int i2 = c1gVar.b;
        c1gVar.b = i2 + 1;
        sArr[i2] = sW;
    }

    @Override // defpackage.k0
    public final Object k(Object obj) {
        short[] sArr = (short[]) obj;
        c1g c1gVar = new c1g();
        c1gVar.a = sArr;
        c1gVar.b = sArr.length;
        c1gVar.b(10);
        return c1gVar;
    }

    @Override // defpackage.ohd
    public final Object n() {
        return new short[0];
    }

    @Override // defpackage.ohd
    public final void o(x74 x74Var, Object obj, int i) {
        short[] sArr = (short[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            x74Var.m(this.b, i2, sArr[i2]);
        }
    }
}
