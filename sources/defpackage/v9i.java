package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class v9i extends ohd {
    public static final v9i c = new v9i(w9i.a);

    @Override // defpackage.k0
    public final int h(Object obj) {
        return ((t9i) obj).a.length;
    }

    @Override // defpackage.sw3, defpackage.k0
    public final void j(v74 v74Var, int i, Object obj) {
        u9i u9iVar = (u9i) obj;
        byte bD = v74Var.c(this.b, i).D();
        u9iVar.b(u9iVar.d() + 1);
        byte[] bArr = u9iVar.a;
        int i2 = u9iVar.b;
        u9iVar.b = i2 + 1;
        bArr[i2] = bD;
    }

    @Override // defpackage.k0
    public final Object k(Object obj) {
        byte[] bArr = ((t9i) obj).a;
        u9i u9iVar = new u9i();
        u9iVar.a = bArr;
        u9iVar.b = bArr.length;
        u9iVar.b(10);
        return u9iVar;
    }

    @Override // defpackage.ohd
    public final Object n() {
        return new t9i(new byte[0]);
    }

    @Override // defpackage.ohd
    public final void o(x74 x74Var, Object obj, int i) {
        byte[] bArr = ((t9i) obj).a;
        for (int i2 = 0; i2 < i; i2++) {
            x74Var.q(this.b, i2).f(bArr[i2]);
        }
    }
}
