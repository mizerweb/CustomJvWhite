package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k9a implements m9a {
    public final long a;

    public k9a(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k9a) && this.a == ((k9a) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "OnOwnerClicked(id=", ")");
    }
}
