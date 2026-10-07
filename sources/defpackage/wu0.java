package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wu0 {
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public int j;
    public long k;
    public boolean l;
    public boolean m;
    public final String n;

    public wu0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, int i, long j10, boolean z, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = i;
        this.k = j10;
        this.l = z;
        this.m = z2;
        this.n = wu0.class.getName();
    }

    public final void a(ov0 ov0Var) {
        this.i |= ov0Var.p;
        this.k = Math.max(this.k, ov0Var.g);
        boolean z = true;
        this.l = this.l || ov0Var.q;
        if (!this.m && !ov0Var.r) {
            z = false;
        }
        this.m = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wu0) {
            wu0 wu0Var = (wu0) obj;
            if (this.a == wu0Var.a && this.b == wu0Var.b && this.c == wu0Var.c && this.d == wu0Var.d && this.e == wu0Var.e && this.f == wu0Var.f && this.g == wu0Var.g && this.h == wu0Var.h && this.i == wu0Var.i && this.j == wu0Var.j && this.k == wu0Var.k && this.l == wu0Var.l && this.m == wu0Var.m) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.m) + nbh.n(qt4.g(zo5.c(this.j, qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31), 31, this.k), 31, this.l);
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        long j4 = this.d;
        long j5 = this.e;
        long j6 = this.f;
        long j7 = this.g;
        long j8 = this.h;
        String strB = tid.b(this.i);
        int i = this.j;
        long j9 = this.k;
        boolean z = this.l;
        boolean z2 = this.m;
        StringBuilder sbS = qt4.s(j, "BatteryMetricsDiff(batteryPercent=", ", cpuTicks=");
        sbS.append(j2);
        qt4.z(j3, ", mobileRxBytes=", ", mobileTxBytes=", sbS);
        sbS.append(j4);
        qt4.z(j5, ", mobileIdleMs=", ", wifiRxBytes=", sbS);
        sbS.append(j6);
        qt4.z(j7, ", wifiTxBytes=", ", wifiIdleMs=", sbS);
        qv1.s(j8, ", processes=", strB, sbS);
        sbS.append(", networkSourceMask=");
        sbS.append(i);
        sbS.append(", maxTemperature=");
        sbS.append(j9);
        sbS.append(", wasBatteryOptimizationsEnabled=");
        sbS.append(z);
        return nbh.z(sbS, ", wasBackgroundActivityDisabled=", z2, ")");
    }

    public wu0() {
        this(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0, 0L, false, false);
    }
}
