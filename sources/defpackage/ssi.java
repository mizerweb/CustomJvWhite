package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ssi {
    public final int a;
    public final Map b;
    public final String c;

    public ssi(int i, String str, Map map) {
        this.a = i;
        this.b = map;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssi)) {
            return false;
        }
        ssi ssiVar = (ssi) obj;
        return this.a == ssiVar.a && this.b.equals(ssiVar.b) && this.c.equals(ssiVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + v0h.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VerifyMobileIdResponseInfo(code=");
        sb.append(this.a);
        sb.append(", headers=");
        sb.append(this.b);
        sb.append(", data=");
        return zo5.w(sb, this.c, ")");
    }
}
