package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ke7 {
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;

    public final bjg a() {
        long jLongValue;
        long jLongValue2;
        Long l;
        long jLongValue3;
        Long l2;
        long jLongValue4;
        long j = this.a;
        long j2 = this.b;
        long j3 = this.d;
        long j4 = this.e;
        long j5 = this.f;
        Long lValueOf = Long.valueOf(this.g);
        if (this.f <= 0) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            jLongValue = lValueOf.longValue();
            jLongValue2 = 0;
        } else {
            jLongValue = 0;
            jLongValue2 = 0;
        }
        Long l3 = null;
        long j6 = this.h;
        Long lValueOf2 = Long.valueOf(this.i);
        if (this.f <= jLongValue2) {
            l = null;
        }
        if (l != null) {
            l = lValueOf2;
            jLongValue3 = l.longValue();
        } else {
            l = lValueOf2;
            jLongValue3 = jLongValue2;
        }
        long j7 = this.j;
        long j8 = this.k;
        long j9 = this.l;
        Long lValueOf3 = Long.valueOf(this.m);
        if (this.l <= jLongValue2) {
            l2 = null;
        }
        if (l2 != null) {
            l2 = lValueOf3;
            jLongValue4 = l2.longValue();
        } else {
            l2 = lValueOf3;
            jLongValue4 = jLongValue2;
        }
        long j10 = this.n;
        Long lValueOf4 = Long.valueOf(this.o);
        if (this.l > jLongValue2) {
            l3 = lValueOf4;
        }
        if (l3 != null) {
            jLongValue2 = l3.longValue();
        }
        return new bjg(j, j2, j3, j4, j5, jLongValue, j6, jLongValue3, j7, j8, j9, jLongValue4, j10, jLongValue2, this.p, this.q, this.r);
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        long j4 = this.d;
        long j5 = this.e;
        long j6 = this.f;
        long j7 = this.k;
        long j8 = this.l;
        long j9 = this.q;
        long j10 = this.r;
        StringBuilder sbS = qt4.s(j, "Stats(overall=", ", cache=");
        sbS.append(j2);
        qt4.z(j3, ", net=", ", error=", sbS);
        sbS.append(j4);
        qt4.z(j5, ", cdnTotal=", ", cdnSuccess=", sbS);
        sbS.append(j6);
        qt4.z(j7, ", homeTotal=", ", homeSuccess=", sbS);
        sbS.append(j8);
        qt4.z(j9, ", cacheTotal=", ", cacheSuccess=", sbS);
        return c0a.m(j10, ")", sbS);
    }
}
