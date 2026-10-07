package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lai extends ohd {
    public static final lai c = new lai(mai.a);

    @Override // defpackage.k0
    public final int h(Object obj) {
        return ((jai) obj).a.length;
    }

    @Override // defpackage.sw3, defpackage.k0
    public final void j(v74 v74Var, int i, Object obj) {
        kai kaiVar = (kai) obj;
        short sO = v74Var.c(this.b, i).o();
        kaiVar.b(kaiVar.d() + 1);
        short[] sArr = kaiVar.a;
        int i2 = kaiVar.b;
        kaiVar.b = i2 + 1;
        sArr[i2] = sO;
    }

    @Override // defpackage.k0
    public final Object k(Object obj) {
        short[] sArr = ((jai) obj).a;
        kai kaiVar = new kai();
        kaiVar.a = sArr;
        kaiVar.b = sArr.length;
        kaiVar.b(10);
        return kaiVar;
    }

    @Override // defpackage.ohd
    public final Object n() {
        return new jai(new short[0]);
    }

    @Override // defpackage.ohd
    public final void o(x74 x74Var, Object obj, int i) {
        short[] sArr = ((jai) obj).a;
        for (int i2 = 0; i2 < i; i2++) {
            x74Var.q(this.b, i2).u(sArr[i2]);
        }
    }
}
