package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class t2h implements x2h {
    public final long a;
    public final int b;
    public final Throwable c;

    public t2h(long j, int i, Throwable th) {
        this.a = j;
        this.b = i;
        this.c = th;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2h)) {
            return false;
        }
        t2h t2hVar = (t2h) obj;
        return wxg.b(this.a, t2hVar.a) && this.b == t2hVar.b && cqk.d(this.c, t2hVar.c);
    }

    public final int hashCode() {
        int iC = zo5.c(this.b, Long.hashCode(this.a) * 31, 31);
        Throwable th = this.c;
        return iC + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        StringBuilder sbR = c0a.r(this.b, "SegmentFailed(storyId=", wxg.c(this.a), ", segmentIndex=", ", exception=");
        sbR.append(this.c);
        sbR.append(")");
        return sbR.toString();
    }
}
