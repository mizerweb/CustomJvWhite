package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ov0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final int g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;
    public final long n;
    public final long o;
    public final long p;
    public final boolean q;
    public final boolean r;

    public ov0(long j, long j2, long j3, long j4, long j5, int i, int i2, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, boolean z, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = i;
        this.g = i2;
        this.h = j6;
        this.i = j7;
        this.j = j8;
        this.k = j9;
        this.l = j10;
        this.m = j11;
        this.n = j12;
        this.o = j13;
        this.p = j14;
        this.q = z;
        this.r = z2;
    }

    public final int a() {
        return this.f;
    }

    public final long b() {
        return this.e;
    }

    public final long c() {
        return this.d;
    }

    public final long d() {
        return this.j;
    }

    public final long e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ov0) {
            ov0 ov0Var = (ov0) obj;
            if (this.a == ov0Var.a && this.b == ov0Var.b && this.c == ov0Var.c && this.d == ov0Var.d && this.e == ov0Var.e && this.f == ov0Var.f && this.g == ov0Var.g && this.h == ov0Var.h && this.i == ov0Var.i && this.j == ov0Var.j && this.k == ov0Var.k && this.l == ov0Var.l && this.m == ov0Var.m && this.n == ov0Var.n && this.o == ov0Var.o && this.p == ov0Var.p && this.q == ov0Var.q && this.r == ov0Var.r) {
                return true;
            }
        }
        return false;
    }

    public final long f() {
        return this.i;
    }

    public final long g() {
        return this.m;
    }

    public final long h() {
        return this.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.r) + nbh.n(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(zo5.c(this.g, zo5.c(this.f, qt4.g(qt4.g(qt4.g(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q);
    }

    public final long i() {
        return this.l;
    }

    public final long j() {
        return this.p;
    }

    public final long k() {
        return this.a;
    }

    public final long l() {
        return this.c;
    }

    public final int m() {
        return this.g;
    }

    public final long n() {
        return this.n;
    }

    public final long o() {
        return this.o;
    }

    public final long p() {
        return this.b;
    }

    public final boolean q() {
        return this.r;
    }

    public final boolean r() {
        return this.q;
    }

    public final String toString() {
        String strB = tid.b(this.p);
        StringBuilder sbS = qt4.s(this.a, "BatterySnapshot:\n            |slice=", "\n            |cpuTicks=(u->");
        sbS.append(this.b);
        qt4.z(this.c, ",s->", ",cu->", sbS);
        sbS.append(this.d);
        qt4.z(this.e, ",cs->", ")\n            |batteryPercent=", sbS);
        qt4.x(this.f, this.g, "\n            |temperature=", "\n            |healthStatsNet=(mRx->", sbS);
        sbS.append(this.h);
        qt4.z(this.i, ",mTx->", ",mIdle->", sbS);
        sbS.append(this.j);
        qt4.z(this.k, ",wRx->", ",wTx->", sbS);
        sbS.append(this.l);
        qt4.z(this.m, ",wIdle->", ")\n            |trafficStatsNet=(mRx->", sbS);
        sbS.append(this.n);
        qt4.z(this.o, ",mTx->", ")\n            |env=(bo=", sbS);
        qt4.B(",ba=", ")\n            |processes=", sbS, this.q, this.r);
        sbS.append(strB);
        sbS.append("\n        ");
        return s5h.y0(sbS.toString());
    }
}
