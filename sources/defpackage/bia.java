package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class bia implements cia {
    public final String a;
    public final Uri b;

    public bia(Uri uri, String str) {
        this.a = str;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bia)) {
            return false;
        }
        bia biaVar = (bia) obj;
        return cqk.d(this.a, biaVar.a) && cqk.d(this.b, biaVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Uri uri = this.b;
        return iHashCode + (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        return "Sticker(url=" + this.a + ", lowResPreviewUri=" + this.b + ")";
    }
}
