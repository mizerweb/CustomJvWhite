package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vs5 {
    public final long a;
    public final long b;

    public vs5(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs5)) {
            return false;
        }
        vs5 vs5Var = (vs5) obj;
        return this.a == vs5Var.a && this.b == vs5Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return c0a.m(this.b, ")", qt4.s(this.a, "ProgressDownload(bytesDownloaded=", ", contentLength="));
    }
}
