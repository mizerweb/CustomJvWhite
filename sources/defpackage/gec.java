package defpackage;

/* JADX INFO: loaded from: classes.dex */
@mif
public final class gec extends iec {
    public static final fec Companion = new fec();
    public final long b;
    public final long c;
    public final int d;
    public final double e;
    public final long f;
    public final long g;
    public final double h;
    public final long i;

    public gec(int i, long j, long j2, int i2, double d, long j3, long j4, double d2, long j5) {
        if (7 != (i & 7)) {
            shl.b(i, 7, eec.a.d());
            throw null;
        }
        this.b = j;
        this.c = j2;
        this.d = i2;
        if ((i & 8) == 0) {
            this.e = 0.02d;
        } else {
            this.e = d;
        }
        if ((i & 16) == 0) {
            this.f = 75L;
        } else {
            this.f = j3;
        }
        if ((i & 32) == 0) {
            this.g = 750L;
        } else {
            this.g = j4;
        }
        this.h = (i & 64) == 0 ? 0.25d : d2;
        this.i = (i & np0.m) == 0 ? 500L : j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gec)) {
            return false;
        }
        gec gecVar = (gec) obj;
        return this.b == gecVar.b && this.c == gecVar.c && this.d == gecVar.d && Double.compare(this.e, gecVar.e) == 0 && this.f == gecVar.f && this.g == gecVar.g && Double.compare(this.h, gecVar.h) == 0 && this.i == gecVar.i;
    }

    public final int hashCode() {
        return Long.hashCode(this.i) + ((Double.hashCode(this.h) + qt4.g(qt4.g((Double.hashCode(this.e) + zo5.c(this.d, qt4.g(Long.hashCode(this.b) * 31, 31, this.c), 31)) * 31, 31, this.f), 31, this.g)) * 31);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.b, "Enabled(maxCacheSizeMb=", ", maxDurationMs=");
        c0a.w(sbS, this.c, ", preloadCount=", this.d);
        sbS.append(", tooFastScrollDiffThresholdPercent=");
        sbS.append(this.e);
        sbS.append(", tooLargeTimeDiffThresholdMs=");
        sbS.append(this.f);
        qt4.z(this.g, ", maxUnconsumedTimeDiffMs=", ", maxUnconsumedScrollDiffPercent=", sbS);
        sbS.append(this.h);
        return zo5.k(this.i, ", idleScrollInactivityMs=", ")", sbS);
    }
}
