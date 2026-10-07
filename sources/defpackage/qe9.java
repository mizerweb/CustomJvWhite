package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qe9 {
    public final int a;
    public final long b;
    public final long c;
    public final long d;

    public qe9(int i, long j, long j2, long j3) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe9)) {
            return false;
        }
        qe9 qe9Var = (qe9) obj;
        return this.a == qe9Var.a && this.b == qe9Var.b && this.c == qe9Var.c && this.d == qe9Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + qt4.g(qt4.g(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbX = zo5.x(this.a, this.b, "ThrottleInfo(count=", ", totalIntervalMs=");
        qt4.z(this.c, ", intervalMinMs=", ", intervalMaxMs=", sbX);
        return c0a.m(this.d, ")", sbX);
    }
}
