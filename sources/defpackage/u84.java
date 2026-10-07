package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class u84 {
    public final String a;
    public final int b;
    public final int c;
    public final long d;
    public final Uri e;

    public u84(long j, String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = Uri.parse(str);
    }

    public final Uri a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u84)) {
            return false;
        }
        u84 u84Var = (u84) obj;
        return cqk.d(this.a, u84Var.a) && this.b == u84Var.b && this.c == u84Var.c && this.d == u84Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + zo5.c(this.c, zo5.c(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbR = c0a.r(this.b, "Item(url=", this.a, ", width=", ", height=");
        c0a.v(sbR, this.c, ", duration=", this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
