package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public final class zl8 implements am8 {
    public final Uri a;

    public zl8(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zl8) && cqk.d(this.a, ((zl8) obj).a);
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
