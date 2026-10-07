package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lxa implements cmi, n68 {
    public final w8b a;

    public lxa() {
        w8b w8bVarE = w8b.e();
        w8bVarE.m(cmi.X0, ki2.a);
        w8bVarE.m(wih.S0, "MeteringRepeating");
        w8bVarE.m(cmi.g1, emi.f);
        this.a = w8bVarE;
    }

    @Override // defpackage.cmi
    public final emi L() {
        return emi.f;
    }

    @Override // defpackage.n8e
    public final t94 getConfig() {
        return this.a;
    }

    @Override // defpackage.n68
    public final int getInputFormat() {
        return 34;
    }
}
