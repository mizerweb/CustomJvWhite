package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ce9 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final Map e;
    public final long f;

    public ce9(long j, long j2, long j3, String str, String str2, Map map) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = map;
        this.f = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce9)) {
            return false;
        }
        ce9 ce9Var = (ce9) obj;
        return cqk.d(this.a, ce9Var.a) && cqk.d(this.b, ce9Var.b) && this.c == ce9Var.c && this.d == ce9Var.d && cqk.d(this.e, ce9Var.e) && this.f == ce9Var.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + v0h.c(this.e, qt4.g(qt4.g(zo5.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("LogEntry(type=", this.a, ", event=", this.b, ", userId=");
        sbQ.append(this.c);
        qt4.z(this.d, ", sessionId=", ", params=", sbQ);
        sbQ.append(this.e);
        sbQ.append(", time=");
        sbQ.append(this.f);
        sbQ.append(")");
        return sbQ.toString();
    }
}
