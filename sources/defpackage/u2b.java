package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class u2b implements jwa {
    public final long a;
    public final long b;
    public final long c;

    public u2b(long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = -1L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2b)) {
            return false;
        }
        u2b u2bVar = (u2b) obj;
        return this.a == u2bVar.a && this.b == u2bVar.b && this.c == u2bVar.c;
    }

    public final int hashCode() {
        return gpk.c(this.c) + ((gpk.c(this.b) + ((gpk.c(this.a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }

    public u2b(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }
}
