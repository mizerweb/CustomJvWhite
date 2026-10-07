package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class fi0 {
    public final Uri a;

    public fi0(Uri uri) {
        if (uri != null) {
            this.a = uri;
        } else {
            ore.n("Null outputUri");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fi0) {
            return this.a.equals(((fi0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "OutputResults{outputUri=" + this.a + "}";
    }
}
