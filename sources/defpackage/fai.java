package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fai extends ohd {
    public static final fai c = new fai(gai.a);

    @Override // defpackage.k0
    public final int h(Object obj) {
        return ((dai) obj).a.length;
    }

    @Override // defpackage.sw3, defpackage.k0
    public final void j(v74 v74Var, int i, Object obj) {
        eai eaiVar = (eai) obj;
        long jM = v74Var.c(this.b, i).m();
        eaiVar.b(eaiVar.d() + 1);
        long[] jArr = eaiVar.a;
        int i2 = eaiVar.b;
        eaiVar.b = i2 + 1;
        jArr[i2] = jM;
    }

    @Override // defpackage.k0
    public final Object k(Object obj) {
        long[] jArr = ((dai) obj).a;
        eai eaiVar = new eai();
        eaiVar.a = jArr;
        eaiVar.b = jArr.length;
        eaiVar.b(10);
        return eaiVar;
    }

    @Override // defpackage.ohd
    public final Object n() {
        return new dai(new long[0]);
    }

    @Override // defpackage.ohd
    public final void o(x74 x74Var, Object obj, int i) {
        long[] jArr = ((dai) obj).a;
        for (int i2 = 0; i2 < i; i2++) {
            x74Var.q(this.b, i2).p(jArr[i2]);
        }
    }
}
