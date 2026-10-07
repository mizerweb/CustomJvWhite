package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aba {
    public final int a;
    public final long b;
    public final int c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public aba(int i, long j, int i2, long j2, long j3, long j4, String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = i;
        this.b = j;
        this.c = i2;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = str5;
        this.l = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aba)) {
            return false;
        }
        aba abaVar = (aba) obj;
        return this.a == abaVar.a && this.b == abaVar.b && this.c == abaVar.c && this.d == abaVar.d && this.e == abaVar.e && this.f == abaVar.f && cqk.d(this.g, abaVar.g) && cqk.d(this.h, abaVar.h) && cqk.d(this.i, abaVar.i) && cqk.d(this.j, abaVar.j) && cqk.d(this.k, abaVar.k) && cqk.d(this.l, abaVar.l);
    }

    public final int hashCode() {
        int iG = qt4.g(qt4.g(qt4.g(zo5.c(this.c, qt4.g(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.j;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.k;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.l;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbX = zo5.x(this.a, this.b, "MemoryMetricReport:\n       |maxNativeHeapAllocated=", ",\n       |maxGraphics=");
        sbX.append(",\n       |minAvailableMemory=");
        sbX.append(this.c);
        sbX.append(",\n       |lowMemoryDurationMs=");
        sbX.append(this.d);
        qt4.z(this.e, ",\n       |gcCountDelta=", ",\n       |sessionRealtimeMs=", sbX);
        qv1.s(this.f, ",\n       |maxPssTotalWinner=", this.g, sbX);
        nbh.G(sbX, ",\n       |maxJavaHeapWinner=", this.h, ",\n       |maxNativeHeapWinner=", this.i);
        nbh.G(sbX, ",\n       |oomWinner=", this.j, ",\n       |topScreensByMaxPss=", this.k);
        sbX.append(",\n       |maxPssByProcess=");
        sbX.append(this.l);
        sbX.append("\n    ");
        return s5h.y0(sbX.toString());
    }
}
