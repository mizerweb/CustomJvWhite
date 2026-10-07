package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class u1b {
    public final long a;

    public u1b(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u1b) && this.a == ((u1b) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "MovieId(id=", ")");
    }
}
