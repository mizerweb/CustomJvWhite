package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mx6 {
    public final ex8 a;
    public final lx6 b;

    public mx6(uba ubaVar, cbd cbdVar) {
        oc9.i(Boolean.valueOf(cbdVar.d > 0));
        this.b = new lx6(ubaVar, cbdVar, nhb.e());
        this.a = new ex8(16, this);
    }

    public final g95 a(int i) {
        return au3.k0((byte[]) this.b.get(i), this.a, au3.f);
    }
}
