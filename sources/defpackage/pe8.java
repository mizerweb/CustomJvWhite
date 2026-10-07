package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class pe8 implements te8 {
    public final Uri a;

    public pe8(Uri uri) {
        this.a = uri;
    }

    public final Uri a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pe8) && cqk.d(this.a, ((pe8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenLink(url=" + this.a + ")";
    }
}
