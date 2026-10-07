package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n1b implements jwa {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public n1b(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n1b.class == obj.getClass()) {
            n1b n1bVar = (n1b) obj;
            if (this.a == n1bVar.a && this.b == n1bVar.b && this.c == n1bVar.c && this.d == n1bVar.d && this.e == n1bVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return gpk.c(this.e) + ((gpk.c(this.d) + ((gpk.c(this.c) + ((gpk.c(this.b) + ((gpk.c(this.a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }
}
