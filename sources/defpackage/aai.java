package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aai extends ohd {
    public static final aai c = new aai(bai.a);

    @Override // defpackage.k0
    public final int h(Object obj) {
        return ((y9i) obj).a.length;
    }

    @Override // defpackage.sw3, defpackage.k0
    public final void j(v74 v74Var, int i, Object obj) {
        z9i z9iVar = (z9i) obj;
        int i2 = v74Var.c(this.b, i).i();
        z9iVar.b(z9iVar.d() + 1);
        int[] iArr = z9iVar.a;
        int i3 = z9iVar.b;
        z9iVar.b = i3 + 1;
        iArr[i3] = i2;
    }

    @Override // defpackage.k0
    public final Object k(Object obj) {
        int[] iArr = ((y9i) obj).a;
        z9i z9iVar = new z9i();
        z9iVar.a = iArr;
        z9iVar.b = iArr.length;
        z9iVar.b(10);
        return z9iVar;
    }

    @Override // defpackage.ohd
    public final Object n() {
        return new y9i(new int[0]);
    }

    @Override // defpackage.ohd
    public final void o(x74 x74Var, Object obj, int i) {
        int[] iArr = ((y9i) obj).a;
        for (int i2 = 0; i2 < i; i2++) {
            x74Var.q(this.b, i2).A(iArr[i2]);
        }
    }
}
