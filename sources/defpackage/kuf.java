package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class kuf extends mk0 {
    public final Uri b;

    public kuf(Uri uri) {
        super(18);
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kuf) && cqk.d(this.b, ((kuf) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "OpenBrowser(uri=" + this.b + ")";
    }
}
