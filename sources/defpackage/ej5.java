package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class ej5 {
    public static final AtomicLong b = new AtomicLong(0);
    public final long a;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ej5) {
            return this.a == ((ej5) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "DevButtonId(value=", ")");
    }
}
