package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class luf extends mk0 {
    public final long b;

    public luf(long j) {
        super(18);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof luf) && this.b == ((luf) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return nbh.s(this.b, "ProfileAvatars(id=", ")");
    }
}
