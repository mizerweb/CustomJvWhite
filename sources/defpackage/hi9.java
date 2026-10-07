package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hi9 {
    public final long a;
    public final long b;

    public hi9(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hi9)) {
            return false;
        }
        hi9 hi9Var = (hi9) obj;
        return hi9Var.a == this.a && hi9Var.b == this.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) ^ Long.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.a);
        sb.append(", ");
        return zo5.u(sb, this.b, ')');
    }
}
