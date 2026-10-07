package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class lhg extends nhg {
    public final Uri a;

    public lhg(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lhg) && cqk.d(this.a, ((lhg) obj).a);
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
