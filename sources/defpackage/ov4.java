package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ov4 implements qv4 {
    public final long a;

    public ov4(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ov4) && this.a == ((ov4) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "Fail(requestId=", ")");
    }
}
