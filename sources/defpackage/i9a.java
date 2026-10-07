package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class i9a implements m9a {
    public final long a;

    public i9a(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i9a) && this.a == ((i9a) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "OnMemberClicked(id=", ")");
    }
}
