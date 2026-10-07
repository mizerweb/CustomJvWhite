package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public final class yy5 implements zy5 {
    public final Uri a;
    public final boolean b;
    public final boolean c;

    public yy5(Uri uri, boolean z, boolean z2) {
        this.a = uri;
        this.b = z;
        this.c = z2;
    }

    public static yy5 a(yy5 yy5Var, Uri uri, boolean z, int i) {
        if ((i & 1) != 0) {
            uri = yy5Var.a;
        }
        if ((i & 2) != 0) {
            z = yy5Var.b;
        }
        return new yy5(uri, z, yy5Var.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy5)) {
            return false;
        }
        yy5 yy5Var = (yy5) obj;
        return cqk.d(this.a, yy5Var.a) && this.b == yy5Var.b && this.c == yy5Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + nbh.n(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultPreview(uri=");
        sb.append(this.a);
        sb.append(", isSending=");
        sb.append(this.b);
        sb.append(", isDownloadAllowed=");
        return qt4.r(sb, this.c, ")");
    }
}
