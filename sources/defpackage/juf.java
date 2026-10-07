package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class juf extends mk0 {
    public final long b;

    public juf(long j) {
        super(18);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof juf) && this.b == ((juf) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return nbh.s(this.b, "EditProfile(id=", ")");
    }
}
