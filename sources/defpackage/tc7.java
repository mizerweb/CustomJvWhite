package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tc7 {
    public final long a;

    public static String a(long j) {
        return zo5.j(j, "Frame-");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tc7) {
            return this.a == ((tc7) obj).a;
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
