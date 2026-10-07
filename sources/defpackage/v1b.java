package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class v1b extends x1b {
    public final long a;

    public v1b(long j) {
        TimeUnit.SECONDS.getClass();
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v1b) && this.a == ((v1b) obj).a;
    }

    public final int hashCode() {
        return TimeUnit.SECONDS.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Defined(position=" + this.a + ", timeUnit=" + TimeUnit.SECONDS + ")";
    }
}
