package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class yug extends mk0 {
    public final long b;
    public final t3f c;
    public final gvg d;

    public yug(long j, t3f t3fVar, gvg gvgVar) {
        super(22);
        this.b = j;
        this.c = t3fVar;
        this.d = gvgVar;
    }

    public final long a() {
        return this.b;
    }

    public final t3f b() {
        return this.c;
    }

    public final gvg c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yug)) {
            return false;
        }
        yug yugVar = (yug) obj;
        return this.b == yugVar.b && cqk.d(this.c, yugVar.c) && this.d == yugVar.d;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.b) * 31;
        t3f t3fVar = this.c;
        return this.d.hashCode() + ((avg.USER.hashCode() + ((iHashCode + (t3fVar == null ? 0 : t3fVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "OpenStoriesViewer(itemId=" + this.b + ", scopeId=" + this.c + ", ownerType=" + avg.USER + ", type=" + this.d + ")";
    }
}
