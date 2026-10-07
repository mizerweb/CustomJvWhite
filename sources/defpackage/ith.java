package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ith {
    public final long a;

    public static String a(long j) {
        return "TimestampNs(value=" + j + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ith) {
            return this.a == ((ith) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
