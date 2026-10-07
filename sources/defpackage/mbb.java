package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class mbb {
    public final String a;
    public final String b;
    public final Map c;
    public final long d;

    public mbb(String str, ul9 ul9Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.a = "NAV";
        this.b = str;
        this.c = ul9Var;
        this.d = jCurrentTimeMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbb)) {
            return false;
        }
        mbb mbbVar = (mbb) obj;
        return cqk.d(this.a, mbbVar.a) && cqk.d(this.b, mbbVar.b) && cqk.d(this.c, mbbVar.c) && this.d == mbbVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + v0h.c(this.c, zo5.d(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("NavEntry(type=", this.a, ", event=", this.b, ", params=");
        sbQ.append(this.c);
        sbQ.append(", time=");
        sbQ.append(this.d);
        sbQ.append(")");
        return sbQ.toString();
    }
}
