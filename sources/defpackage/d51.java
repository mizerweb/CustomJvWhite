package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class d51 {
    public final long a;
    public final boolean b;

    public d51(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d51)) {
            return false;
        }
        d51 d51Var = (d51) obj;
        return this.a == d51Var.a && this.b == d51Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbU = qt4.u(this.a, "BufferingState(messageId=", ", isBuffering=", this.b);
        sbU.append(")");
        return sbU.toString();
    }
}
