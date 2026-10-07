package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xug extends mk0 {
    public final long b;

    public xug(long j) {
        super(22);
        this.b = j;
    }

    public final long a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xug) && this.b == ((xug) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return nbh.s(this.b, "OpenProfile(contactId=", ")");
    }
}
