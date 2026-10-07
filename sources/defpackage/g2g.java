package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class g2g extends ck4 {
    public final Uri a;

    public g2g(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g2g) && cqk.d(this.a, ((g2g) obj).a);
    }

    public final int hashCode() {
        Uri uri = this.a;
        if (uri == null) {
            return 0;
        }
        return uri.hashCode();
    }

    public final String toString() {
        return "ShowInviteDialog(qrCodeUri=" + this.a + ")";
    }
}
