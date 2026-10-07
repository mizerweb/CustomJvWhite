package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xhj extends aij {
    public final long a;

    public xhj(long j) {
        this.a = j;
    }

    @Override // defpackage.aij
    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xhj) && this.a == ((xhj) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "Cancelled(requestId=", ")");
    }
}
