package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hii {
    public final int a;
    public final long b;
    public final x0m c;

    public hii(int i, long j, x0m x0mVar) {
        this.a = i;
        this.b = j;
        this.c = x0mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hii)) {
            return false;
        }
        hii hiiVar = (hii) obj;
        return this.a == hiiVar.a && this.b == hiiVar.b && cqk.d(this.c, hiiVar.c);
    }

    public final int hashCode() {
        int iG = qt4.g(Integer.hashCode(this.a) * 31, 31, this.b);
        x0m x0mVar = this.c;
        return iG + (x0mVar == null ? 0 : x0mVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbX = zo5.x(this.a, this.b, "UploadState(progress=", ", fileSize=");
        sbX.append(", resultData=");
        sbX.append(this.c);
        sbX.append(")");
        return sbX.toString();
    }
}
