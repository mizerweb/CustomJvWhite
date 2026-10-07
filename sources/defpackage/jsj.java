package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class jsj {
    public static final isj Companion = new isj();
    public static final ny8[] e = {null, null, rx8.P(2, new o0j(26)), null};
    public final String a;
    public final int b;
    public final Map c;
    public final String d;

    public /* synthetic */ jsj(int i, String str, int i2, Map map, String str2) {
        if (15 != (i & 15)) {
            shl.b(i, 15, hsj.a.d());
            throw null;
        }
        this.a = str;
        this.b = i2;
        this.c = map;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jsj)) {
            return false;
        }
        jsj jsjVar = (jsj) obj;
        return cqk.d(this.a, jsjVar.a) && this.b == jsjVar.b && cqk.d(this.c, jsjVar.c) && cqk.d(this.d, jsjVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v0h.c(this.c, zo5.c(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbR = c0a.r(this.b, "WebAppVerifyMobileIdResponse(requestId=", this.a, ", statusCode=", ", headers=");
        sbR.append(this.c);
        sbR.append(", data=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }

    public jsj(String str, int i, Map map, String str2) {
        this.a = str;
        this.b = i;
        this.c = map;
        this.d = str2;
    }
}
