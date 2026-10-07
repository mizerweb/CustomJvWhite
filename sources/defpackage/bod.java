package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bod extends mk0 {
    public final long b;

    public bod(long j) {
        super(12);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bod) && this.b == ((bod) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return nbh.s(this.b, "InviteByLink(id=", ")");
    }
}
