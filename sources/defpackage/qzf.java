package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qzf extends b4 {
    public long a;
    public ek2 b;

    @Override // defpackage.b4
    public final boolean a(a4 a4Var) {
        pzf pzfVar = (pzf) a4Var;
        if (this.a >= 0) {
            return false;
        }
        long j = pzfVar.i;
        if (j < pzfVar.j) {
            pzfVar.j = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.b4
    public final lq4[] b(a4 a4Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((pzf) a4Var).w(j);
    }
}
