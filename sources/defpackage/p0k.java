package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p0k implements v1i {
    public final u25 a;
    public final v1i b;

    public p0k(u25 u25Var, v1i v1iVar) {
        this.a = u25Var;
        this.b = v1iVar;
    }

    @Override // defpackage.v1i
    public final void c(u25 u25Var, a35 a35Var, boolean z) {
        this.b.c(this.a, a35Var, z);
    }

    @Override // defpackage.v1i
    public final void d(u25 u25Var, a35 a35Var, boolean z, int i) {
        this.b.d(this.a, a35Var, z, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0k)) {
            return false;
        }
        p0k p0kVar = (p0k) obj;
        return this.a.equals(p0kVar.a) && cqk.d(this.b, p0kVar.b);
    }

    @Override // defpackage.v1i
    public final void h(u25 u25Var, a35 a35Var, boolean z) {
        this.b.h(this.a, a35Var, z);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.v1i
    public final void i(u25 u25Var, a35 a35Var, boolean z) {
        this.b.i(this.a, a35Var, z);
    }

    public final String toString() {
        return "WrapperTransferListener(dataSource=" + this.a + ", listener=" + this.b + ")";
    }
}
