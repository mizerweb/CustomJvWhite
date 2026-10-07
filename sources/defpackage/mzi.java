package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class mzi {
    public final Uri a;
    public long b = 0;
    public boolean c = false;
    public Throwable d = null;

    public mzi(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzi)) {
            return false;
        }
        mzi mziVar = (mzi) obj;
        return cqk.d(this.a, mziVar.a) && this.b == mziVar.b && this.c == mziVar.c && cqk.d(this.d, mziVar.d);
    }

    public final int hashCode() {
        int iN = nbh.n(qt4.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Throwable th = this.d;
        return iN + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "VideoFragment(uri=" + this.a + ", durationMs=" + this.b + ", finalized=" + this.c + ", finalizationError=" + this.d + ")";
    }
}
