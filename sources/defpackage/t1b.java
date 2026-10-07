package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class t1b extends svk {
    public final long a;

    public t1b(long j) {
        TimeUnit.SECONDS.getClass();
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t1b) && this.a == ((t1b) obj).a;
    }

    public final int hashCode() {
        return TimeUnit.SECONDS.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Value(value=" + this.a + ", timeUnit=" + TimeUnit.SECONDS + ")";
    }
}
