package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xp0 {
    public final long a;
    public final yhh b;

    public xp0(long j, yhh yhhVar) {
        this.a = j;
        this.b = yhhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp0)) {
            return false;
        }
        xp0 xp0Var = (xp0) obj;
        return this.a == xp0Var.a && cqk.d(this.b, xp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BaseError(requestId=" + this.a + ", error=" + this.b + ")";
    }
}
