package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class v2h implements x2h {
    public final long a;
    public final int b;
    public final float c;

    public v2h(int i, long j, float f) {
        this.a = j;
        this.b = i;
        this.c = f;
    }

    public final float a() {
        return this.c;
    }

    public final long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2h)) {
            return false;
        }
        v2h v2hVar = (v2h) obj;
        return wxg.b(this.a, v2hVar.a) && this.b == v2hVar.b && Float.compare(this.c, v2hVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + zo5.c(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbR = c0a.r(this.b, "SegmentUploading(storyId=", wxg.c(this.a), ", segmentIndex=", ", progress=");
        sbR.append(this.c);
        sbR.append(")");
        return sbR.toString();
    }
}
