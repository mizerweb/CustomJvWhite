package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class db4 extends mk0 {
    public final Uri b;

    public db4(Uri uri) {
        super(6);
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof db4) && this.b.equals(((db4) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "OpenSelfServiceRecovery(uri=" + this.b + ")";
    }
}
