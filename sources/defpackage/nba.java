package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nba {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;

    public nba(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
    }

    public final long a() {
        return this.c;
    }

    public final long b() {
        return this.e;
    }

    public final long c() {
        return this.a;
    }

    public final long d() {
        return this.b;
    }

    public final long e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nba)) {
            return false;
        }
        nba nbaVar = (nba) obj;
        return this.a == nbaVar.a && this.b == nbaVar.b && this.c == nbaVar.c && this.d == nbaVar.d && this.e == nbaVar.e && this.f == nbaVar.f && this.g == nbaVar.g && this.h == nbaVar.h && this.i == nbaVar.i;
    }

    public final long f() {
        return this.d;
    }

    public final long g() {
        return this.h;
    }

    public final long h() {
        return this.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.i) + qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final long i() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "Pss(javaHeap=", ", nativeHeap=");
        sbS.append(this.b);
        qt4.z(this.c, ", code=", ", stack=", sbS);
        sbS.append(this.d);
        qt4.z(this.e, ", graphics=", ", other=", sbS);
        sbS.append(this.f);
        qt4.z(this.g, ", system=", ", swap=", sbS);
        sbS.append(this.h);
        return zo5.k(this.i, ", total=", ")", sbS);
    }
}
