package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class igc extends mk0 {
    public final Uri b;

    public igc(Uri uri) {
        super(10);
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof igc) && cqk.d(this.b, ((igc) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "OpenExternalLink(url=" + this.b + ")";
    }
}
