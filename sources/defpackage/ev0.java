package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ev0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public ev0(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final long a() {
        return this.d;
    }

    public final long b() {
        return this.c;
    }

    public final long c() {
        return this.b;
    }

    public final long d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev0)) {
            return false;
        }
        ev0 ev0Var = (ev0) obj;
        return this.a == ev0Var.a && this.b == ev0Var.b && this.c == ev0Var.c && this.d == ev0Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + qt4.g(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "CpuTicks(utime=", ", stime=");
        sbS.append(this.b);
        qt4.z(this.c, ", cutime=", ", cstime=", sbS);
        return c0a.m(this.d, ")", sbS);
    }
}
