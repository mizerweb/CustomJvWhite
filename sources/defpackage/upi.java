package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class upi extends oqi {
    public final long a;

    public upi(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof upi) && this.a == ((upi) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "HideAuthorAndAdvance(ownerId=", ")");
    }
}
