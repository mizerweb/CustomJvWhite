package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class eld implements hld {
    public final Uri a;

    public eld(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eld) && this.a.equals(((eld) obj).a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1911932022;
    }

    public final String toString() {
        return "ShareMedia(localUrl=" + this.a + ", mimetype=image/*)";
    }
}
