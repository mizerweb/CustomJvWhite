package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class u2h implements x2h {
    public final long a;
    public final int b;

    public u2h(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2h)) {
            return false;
        }
        u2h u2hVar = (u2h) obj;
        return wxg.b(this.a, u2hVar.a) && this.b == u2hVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return c0a.l(this.b, "SegmentUploaded(storyId=", wxg.c(this.a), ", segmentIndex=", ")");
    }
}
