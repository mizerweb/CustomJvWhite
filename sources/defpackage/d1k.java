package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class d1k implements bcf {
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    public final long[] g;

    public d1k(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = i2;
        this.e = j3;
        this.g = jArr;
        this.f = j3 != -1 ? j + j3 : -1L;
    }

    @Override // defpackage.bcf
    public final long a() {
        return this.a + ((long) this.b);
    }

    @Override // defpackage.bcf
    public final long b(long j) {
        long j2 = j - this.a;
        if (!f() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = this.g;
        jArr.getClass();
        double d = (j2 * 256.0d) / this.e;
        int iF = vqi.f(jArr, (long) d, true);
        long j3 = this.c;
        long j4 = (((long) iF) * j3) / 100;
        long j5 = jArr[iF];
        int i = iF + 1;
        long j6 = (j3 * ((long) i)) / 100;
        long j7 = iF == 99 ? 256L : jArr[i];
        return Math.round((j5 == j7 ? 0.0d : (d - j5) / (j7 - j5)) * (j6 - j4)) + j4;
    }

    @Override // defpackage.xbf
    public final wbf d(long j) {
        double d;
        double d2;
        boolean zF = f();
        int i = this.b;
        long j2 = this.a;
        if (!zF) {
            zbf zbfVar = new zbf(0L, j2 + ((long) i));
            return new wbf(zbfVar, zbfVar);
        }
        long jK = vqi.k(j, 0L, this.c);
        double d3 = (jK * 100.0d) / this.c;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i2 = (int) d3;
            long[] jArr = this.g;
            jArr.getClass();
            double d5 = jArr[i2];
            if (i2 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i2 + 1];
            }
            d4 = ((d2 - d5) * (d3 - ((double) i2))) + d5;
        }
        long j3 = this.e;
        zbf zbfVar2 = new zbf(jK, j2 + vqi.k(Math.round((d4 / d) * j3), i, j3 - 1));
        return new wbf(zbfVar2, zbfVar2);
    }

    @Override // defpackage.bcf
    public final long e() {
        return this.f;
    }

    @Override // defpackage.xbf
    public final boolean f() {
        return this.g != null;
    }

    @Override // defpackage.bcf
    public final int g() {
        return this.d;
    }

    @Override // defpackage.xbf
    public final long h() {
        return this.c;
    }
}
