package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class v2b {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final Uri e;

    public v2b(int i, String str, int i2, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        Uri uriM = l21.m(str);
        if (uriM != null) {
            this.e = uriM;
        } else {
            ore.p("Required value was null.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2b)) {
            return false;
        }
        v2b v2bVar = (v2b) obj;
        return cqk.d(this.a, v2bVar.a) && this.b == v2bVar.b && this.c == v2bVar.c && this.d == v2bVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + zo5.c(this.c, zo5.c(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbR = c0a.r(this.b, "Item(url=", this.a, ", width=", ", height=");
        sbR.append(this.c);
        sbR.append(", bitrate=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
