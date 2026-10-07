package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class lm5 {
    public final Uri a;
    public final String b;
    public final String c;

    public lm5(Uri uri, String str, String str2, int i) {
        str2 = (i & 4) != 0 ? null : str2;
        this.a = uri;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lm5)) {
            return false;
        }
        lm5 lm5Var = (lm5) obj;
        return cqk.d(this.a, lm5Var.a) && this.b.equals(lm5Var.b) && cqk.d(this.c, lm5Var.c);
    }

    public final int hashCode() {
        int iD = zo5.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Integer.hashCode(0) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DirectionsOption(uri=");
        sb.append(this.a);
        sb.append(", tag=");
        sb.append(this.b);
        sb.append(", pkg=");
        return zo5.w(sb, this.c, ", matchMode=0)");
    }
}
