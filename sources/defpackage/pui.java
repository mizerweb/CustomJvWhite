package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class pui {
    public final Uri a;
    public final Uri b;
    public final float c;
    public final int d;
    public final int e;

    public pui(Uri uri, Uri uri2, float f, int i, int i2) {
        this.a = uri;
        this.b = uri2;
        this.c = f;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pui)) {
            return false;
        }
        pui puiVar = (pui) obj;
        return cqk.d(this.a, puiVar.a) && cqk.d(this.b, puiVar.b) && Float.compare(this.c, puiVar.c) == 0 && this.d == puiVar.d && this.e == puiVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return Integer.hashCode(this.e) + zo5.c(this.d, nbh.m((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31, this.c, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoConfig(previewUri=");
        sb.append(this.a);
        sb.append(", lowResUri=");
        sb.append(this.b);
        sb.append(", rotationAngle=");
        sb.append(this.c);
        sb.append(", width=");
        sb.append(this.d);
        sb.append(", height=");
        return zo5.t(sb, this.e, ")");
    }
}
