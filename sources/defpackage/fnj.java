package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class fnj implements ynj {
    public final Uri a;

    public fnj(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fnj) && cqk.d(this.a, ((fnj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InternalNavigation(uri=" + this.a + ")";
    }
}
