package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class r61 extends ohd {
    public static final r61 c = new r61(w61.a);

    @Override // defpackage.k0
    public final int h(Object obj) {
        return ((byte[]) obj).length;
    }

    @Override // defpackage.sw3, defpackage.k0
    public final void j(v74 v74Var, int i, Object obj) {
        q61 q61Var = (q61) obj;
        byte bG = v74Var.g(this.b, i);
        q61Var.b(q61Var.d() + 1);
        byte[] bArr = q61Var.a;
        int i2 = q61Var.b;
        q61Var.b = i2 + 1;
        bArr[i2] = bG;
    }

    @Override // defpackage.k0
    public final Object k(Object obj) {
        byte[] bArr = (byte[]) obj;
        q61 q61Var = new q61();
        q61Var.a = bArr;
        q61Var.b = bArr.length;
        q61Var.b(10);
        return q61Var;
    }

    @Override // defpackage.ohd
    public final Object n() {
        return new byte[0];
    }

    @Override // defpackage.ohd
    public final void o(x74 x74Var, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            x74Var.k(this.b, i2, bArr[i2]);
        }
    }
}
