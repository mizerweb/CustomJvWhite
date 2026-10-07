package defpackage;

/* JADX INFO: loaded from: classes.dex */
@mif
public final class uq {
    public static final tq Companion = new tq();
    public final long a;
    public final long b;
    public long c;
    public long d;
    public final i8b e;
    public boolean f;

    public /* synthetic */ uq(int i, long j, long j2, long j3, long j4, i8b i8bVar, boolean z) {
        if ((i & 1) == 0) {
            this.a = 0L;
        } else {
            this.a = j;
        }
        if ((i & 2) == 0) {
            this.b = 0L;
        } else {
            this.b = j2;
        }
        if ((i & 4) == 0) {
            this.c = 0L;
        } else {
            this.c = j3;
        }
        if ((i & 8) == 0) {
            this.d = 0L;
        } else {
            this.d = j4;
        }
        if ((i & 16) == 0) {
            this.e = new i8b();
        } else {
            this.e = i8bVar;
        }
        if ((i & 32) == 0) {
            this.f = true;
        } else {
            this.f = z;
        }
    }

    public final boolean a() {
        return this.a == 0 && this.b == 0 && this.c == 0 && this.d == 0 && this.e.b == 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq)) {
            return false;
        }
        uq uqVar = (uq) obj;
        return this.a == uqVar.a && this.b == uqVar.b && this.c == uqVar.c && this.d == uqVar.d && cqk.d(this.e, uqVar.e) && this.f == uqVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + qt4.g(qt4.g(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        long j = this.c;
        long j2 = this.d;
        boolean z = this.f;
        StringBuilder sbS = qt4.s(this.a, "AppClockDump(startRealtime=", ", startUptime=");
        sbS.append(this.b);
        qt4.z(j, ", lastRealtime=", ", lastUptime=", sbS);
        sbS.append(j2);
        sbS.append(", visibilityTimes=");
        sbS.append(this.e);
        return nbh.z(sbS, ", isStartedInForeground=", z, ")");
    }

    public uq(int i, long j, long j2) {
        j = (i & 1) != 0 ? 0L : j;
        j2 = (i & 2) != 0 ? 0L : j2;
        i8b i8bVar = new i8b();
        this.a = j;
        this.b = j2;
        this.c = 0L;
        this.d = 0L;
        this.e = i8bVar;
        this.f = true;
    }
}
