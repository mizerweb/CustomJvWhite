package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class g12 {
    public final dnf a;
    public final xmf b;

    public g12(cnf cnfVar, xmf xmfVar) {
        cnfVar.getClass();
        this.a = cnfVar;
        this.b = xmfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g12)) {
            return false;
        }
        g12 g12Var = (g12) obj;
        return cqk.d(this.a, g12Var.a) && this.b.equals(g12Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdatedParams(roomId=" + this.a + ", room=" + this.b + ")";
    }
}
