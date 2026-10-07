package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lpi extends mpi {
    public final long a;

    public lpi(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lpi) && this.a == ((lpi) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "Unsupported(storyId=", ")");
    }
}
