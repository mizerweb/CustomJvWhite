package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wc4 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final String e;
    public final int f;
    public final int g;

    public wc4(long j, long j2, long j3, long j4, String str, int i, int i2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = str;
        this.f = i;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wc4)) {
            return false;
        }
        wc4 wc4Var = (wc4) obj;
        return this.a == wc4Var.a && this.b == wc4Var.b && this.c == wc4Var.c && this.d == wc4Var.d && cqk.d(this.e, wc4Var.e) && this.f == wc4Var.f && this.g == wc4Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + zo5.c(this.f, zo5.d(qt4.g(qt4.g(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sbA = nbh.A(this.g, "ConnectionStat(n=", "|", this.e, ":");
        c0a.v(sbA, this.f, "|total=", this.a);
        qt4.z(this.b, "|dns=", "|tcp=", sbA);
        sbA.append(this.c);
        return zo5.k(this.d, "|tls=", ")", sbA);
    }
}
