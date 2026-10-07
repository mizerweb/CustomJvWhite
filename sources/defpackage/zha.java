package defpackage;

import android.net.Uri;
import android.text.Layout;

/* JADX INFO: loaded from: classes4.dex */
public final class zha implements cia {
    public final String a;
    public final int b;
    public final Layout c;
    public final Uri d;
    public final boolean e;
    public final Integer f;

    public zha(String str, int i, Layout layout, Uri uri, boolean z, Integer num) {
        this.a = str;
        this.b = i;
        this.c = layout;
        this.d = uri;
        this.e = z;
        this.f = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zha)) {
            return false;
        }
        zha zhaVar = (zha) obj;
        return cqk.d(this.a, zhaVar.a) && this.b == zhaVar.b && this.c.equals(zhaVar.c) && cqk.d(this.d, zhaVar.d) && this.e == zhaVar.e && cqk.d(this.f, zhaVar.f);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (this.c.hashCode() + zo5.c(this.b, (str == null ? 0 : str.hashCode()) * 31, 31)) * 31;
        Uri uri = this.d;
        int iN = nbh.n((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.e);
        Integer num = this.f;
        return iN + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = c0a.r(this.b, "Media(url=", this.a, ", attachCount=", ", description=");
        sbR.append(this.c);
        sbR.append(", lowResPreviewUri=");
        sbR.append(this.d);
        sbR.append(", isRoundPreview=");
        sbR.append(this.e);
        sbR.append(", placeholder=");
        sbR.append(this.f);
        sbR.append(")");
        return sbR.toString();
    }
}
