package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jna implements lna {
    public final e7d a;
    public final long b;

    public jna(e7d e7dVar, long j) {
        this.a = e7dVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jna)) {
            return false;
        }
        jna jnaVar = (jna) obj;
        return cqk.d(this.a, jnaVar.a) && this.b == jnaVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.una
    public final long l() {
        return this.b;
    }

    public final String toString() {
        return "OpenResultScreen(model=" + this.a + ", messageId=" + this.b + ")";
    }
}
