package defpackage;

import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
@mif
public final class bjg {
    public static final ajg Companion = new ajg();
    public static final bjg r = new bjg(0, 0, 0, 0, 0, BuildConfig.MAX_TIME_TO_UPLOAD, 0, BuildConfig.MAX_TIME_TO_UPLOAD, 0, 0, 0, BuildConfig.MAX_TIME_TO_UPLOAD, 0, BuildConfig.MAX_TIME_TO_UPLOAD, 0, 0, 0);
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;
    public final long n;
    public final long o;
    public final long p;
    public final long q;

    public /* synthetic */ bjg(int i, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        if (7 != (i & 7)) {
            shl.b(i, 7, zig.a.d());
            throw null;
        }
        this.a = j;
        this.b = j2;
        this.c = j3;
        if ((i & 8) == 0) {
            this.d = 0L;
        } else {
            this.d = j4;
        }
        if ((i & 16) == 0) {
            this.e = 0L;
        } else {
            this.e = j5;
        }
        int i2 = i & 32;
        long j18 = BuildConfig.MAX_TIME_TO_UPLOAD;
        if (i2 == 0) {
            this.f = BuildConfig.MAX_TIME_TO_UPLOAD;
        } else {
            this.f = j6;
        }
        if ((i & 64) == 0) {
            this.g = 0L;
        } else {
            this.g = j7;
        }
        if ((i & np0.m) == 0) {
            this.h = BuildConfig.MAX_TIME_TO_UPLOAD;
        } else {
            this.h = j8;
        }
        if ((i & np0.n) == 0) {
            this.i = 0L;
        } else {
            this.i = j9;
        }
        if ((i & np0.o) == 0) {
            this.j = 0L;
        } else {
            this.j = j10;
        }
        if ((i & 1024) == 0) {
            this.k = 0L;
        } else {
            this.k = j11;
        }
        if ((i & np0.q) == 0) {
            this.l = BuildConfig.MAX_TIME_TO_UPLOAD;
        } else {
            this.l = j12;
        }
        if ((i & np0.r) == 0) {
            this.m = 0L;
        } else {
            this.m = j13;
        }
        this.n = (i & 8192) != 0 ? j14 : j18;
        if ((i & 16384) == 0) {
            this.o = 0L;
        } else {
            this.o = j15;
        }
        if ((32768 & i) == 0) {
            this.p = 0L;
        } else {
            this.p = j16;
        }
        if ((i & 65536) == 0) {
            this.q = 0L;
        } else {
            this.q = j17;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjg)) {
            return false;
        }
        bjg bjgVar = (bjg) obj;
        return this.a == bjgVar.a && this.b == bjgVar.b && this.c == bjgVar.c && this.d == bjgVar.d && this.e == bjgVar.e && this.f == bjgVar.f && this.g == bjgVar.g && this.h == bjgVar.h && this.i == bjgVar.i && this.j == bjgVar.j && this.k == bjgVar.k && this.l == bjgVar.l && this.m == bjgVar.m && this.n == bjgVar.n && this.o == bjgVar.o && this.p == bjgVar.p && this.q == bjgVar.q;
    }

    public final int hashCode() {
        return Long.hashCode(this.q) + qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "FrescoStats(imageTotal=", ", imageCache=");
        sbS.append(this.b);
        qt4.z(this.c, ", imageError=", ", imageCdnTotal=", sbS);
        sbS.append(this.d);
        qt4.z(this.e, ", imageCdnSuccess=", ", imageCdnMinTimeFb=", sbS);
        sbS.append(this.f);
        qt4.z(this.g, ", imageCdnMaxTimeFb=", ", imageCdnMinTimeIntegral=", sbS);
        sbS.append(this.h);
        qt4.z(this.i, ", imageCdnMaxTimeIntegral=", ", imageHomeTotal=", sbS);
        sbS.append(this.j);
        qt4.z(this.k, ", imageHomeSuccess=", ", imageHomeMinTimeFb=", sbS);
        sbS.append(this.l);
        qt4.z(this.m, ", imageHomeMaxTimeFb=", ", imageHomeMinTimeIntegral=", sbS);
        sbS.append(this.n);
        qt4.z(this.o, ", imageHomeMaxTimeIntegral=", ", imageCacheTotal=", sbS);
        sbS.append(this.p);
        return zo5.k(this.q, ", imageCacheSuccess=", ")", sbS);
    }

    public bjg(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
        this.l = j12;
        this.m = j13;
        this.n = j14;
        this.o = j15;
        this.p = j16;
        this.q = j17;
    }
}
