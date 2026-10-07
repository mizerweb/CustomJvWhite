package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class kp {
    public final long a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final Map f;

    public kp(long j, long j2, long j3, String str, String str2, Map map) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = str2;
        this.f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp)) {
            return false;
        }
        kp kpVar = (kp) obj;
        return this.a == kpVar.a && this.b == kpVar.b && this.c == kpVar.c && cqk.d(this.d, kpVar.d) && cqk.d(this.e, kpVar.e) && cqk.d(this.f, kpVar.f);
    }

    public final int hashCode() {
        int iD = zo5.d(zo5.d(qt4.g(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        Map map = this.f;
        return iD + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "ApiLogEntry(time=", ", userId=");
        sbS.append(this.b);
        qt4.z(this.c, ", sessionId=", ", type=", sbS);
        nbh.G(sbS, this.d, ", event=", this.e, ", params=");
        sbS.append(this.f);
        sbS.append(")");
        return sbS.toString();
    }
}
