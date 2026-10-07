package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class je8 extends me8 {
    public final long a;

    public je8(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof je8) && this.a == ((je8) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "Cancelled(requestId=", ")");
    }
}
