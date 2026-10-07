package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vug extends mk0 {
    public final long b;

    public vug(long j) {
        super(21);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vug) && this.b == ((vug) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return nbh.s(this.b, "NavigateToProfile(contactId=", ")");
    }
}
