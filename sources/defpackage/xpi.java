package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class xpi extends oqi {
    public final Uri a;

    public xpi(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xpi) && cqk.d(this.a, ((xpi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("OpenInternalLink(uri=", this.a.toString(), ")");
    }
}
