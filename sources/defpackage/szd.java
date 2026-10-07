package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class szd {
    public final Uri a;
    public final Bitmap b;
    public final kbc c;

    public szd(Uri uri, Bitmap bitmap, kbc kbcVar) {
        this.a = uri;
        this.b = bitmap;
        this.c = kbcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szd)) {
            return false;
        }
        szd szdVar = (szd) obj;
        return cqk.d(this.a, szdVar.a) && cqk.d(this.b, szdVar.b) && cqk.d(this.c, szdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "QrCode(uri=" + this.a + ", bitmap=" + this.b + ", theme=" + this.c + ")";
    }
}
