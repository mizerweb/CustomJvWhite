package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pna implements tna {
    public final long a;
    public final oxi b;

    public pna(long j, oxi oxiVar) {
        this.a = j;
        this.b = oxiVar;
    }

    @Override // defpackage.tna
    public final oxi b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pna)) {
            return false;
        }
        pna pnaVar = (pna) obj;
        return this.a == pnaVar.a && cqk.d(this.b, pnaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    @Override // defpackage.una
    public final long l() {
        return this.a;
    }

    public final String toString() {
        return "OnSurfaceClick(messageId=" + this.a + ", model=" + this.b + ")";
    }
}
