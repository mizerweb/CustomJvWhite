package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tm5 {
    public final ym5 a;
    public final x71 b;

    public tm5(ym5 ym5Var, x71 x71Var) {
        this.a = ym5Var;
        this.b = x71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tm5) {
            tm5 tm5Var = (tm5) obj;
            return this.a.equals(tm5Var.a) && this.b == tm5Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DiskCacheDownloadRequest(source=" + this.a + ", cacheLoadParams=" + this.b + ")";
    }
}
