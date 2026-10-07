package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hw5 {
    public final long a;

    public static final int a(long j, long j2) {
        if (j == j2) {
            return 0;
        }
        return j < j2 ? -1 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hw5) {
            return this.a == ((hw5) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "DurationNs(value=" + this.a + ')';
    }
}
