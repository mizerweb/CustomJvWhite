package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class boe extends mk0 {
    public final Uri b;

    public boe(Uri uri) {
        super(15);
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof boe) && this.b.equals(((boe) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "OpenSelfServiceRecovery(uri=" + this.b + ")";
    }
}
