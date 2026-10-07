package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class scf extends exe {
    public final rcf h;
    public final k71 i;
    public final qcf j;
    public final byte[] k;
    public final e81 l;

    public scf(rcf rcfVar, k71 k71Var, qcf qcfVar, byte[] bArr) {
        this.h = rcfVar;
        this.i = k71Var;
        this.j = qcfVar;
        this.k = bArr;
        this.l = new e81(k71Var, rcfVar.b, bArr, qcfVar);
    }

    @Override // defpackage.exe
    public final void d() {
        this.l.j = true;
    }

    @Override // defpackage.exe
    public final Object e() throws Exception {
        this.l.a();
        qcf qcfVar = this.j;
        if (qcfVar == null) {
            return null;
        }
        qcfVar.e++;
        qcfVar.a.d(qcfVar.b, qcfVar.d, qcfVar.a());
        return null;
    }
}
