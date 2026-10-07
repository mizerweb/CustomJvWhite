package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class b1e {
    public final long a;

    public static String a(long j) {
        return ((int) (j >> 32)) + "x" + ((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b1e) {
            return bj8.b(this.a, ((b1e) obj).a);
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
