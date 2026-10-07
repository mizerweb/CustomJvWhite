package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class hkd implements ikd {
    public final Uri a;

    public hkd(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hkd) && this.a.equals(((hkd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShareImage(uri=" + this.a + ")";
    }
}
