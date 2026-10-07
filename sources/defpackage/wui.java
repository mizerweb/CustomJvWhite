package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wui {
    public final xui a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final long i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final long n;
    public final long o;
    public final long p;
    public final long q;
    public final long r;
    public final String s;
    public final Float t;
    public final Integer u;
    public final Integer v;
    public final Integer w;
    public final Integer x;

    public wui(xui xuiVar, boolean z, String str, String str2, String str3, boolean z2, boolean z3, long j, long j2, int i, int i2, int i3, float f, long j3, long j4, long j5, long j6, long j7, String str4, Float f2, Integer num, Integer num2, Integer num3, Integer num4) {
        this.a = xuiVar;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z2;
        this.g = z3;
        this.h = j;
        this.i = j2;
        this.j = i;
        this.k = i2;
        this.l = i3;
        this.m = f;
        this.n = j3;
        this.o = j4;
        this.p = j5;
        this.q = j6;
        this.r = j7;
        this.s = str4;
        this.t = f2;
        this.u = num;
        this.v = num2;
        this.w = num3;
        this.x = num4;
    }

    public static wui a(wui wuiVar, String str, String str2, String str3, long j, long j2, int i, int i2, int i3, float f, long j3, long j4, long j5, long j6, long j7, String str4, Float f2, Integer num, Integer num2, Integer num3, Integer num4, int i4) {
        xui xuiVar = wuiVar.a;
        boolean z = (i4 & 2) != 0 ? wuiVar.b : true;
        String str5 = (i4 & 4) != 0 ? wuiVar.c : str;
        String str6 = (i4 & 8) != 0 ? wuiVar.d : str2;
        String str7 = (i4 & 16) != 0 ? wuiVar.e : str3;
        boolean z2 = (i4 & 32) != 0 ? wuiVar.f : true;
        boolean z3 = (i4 & 64) != 0 ? wuiVar.g : true;
        long j8 = (i4 & np0.m) != 0 ? wuiVar.h : j;
        long j9 = (i4 & np0.n) != 0 ? wuiVar.i : j2;
        int i5 = (i4 & np0.o) != 0 ? wuiVar.j : i;
        int i6 = (i4 & 1024) != 0 ? wuiVar.k : i2;
        int i7 = (i4 & np0.q) != 0 ? wuiVar.l : i3;
        float f3 = (i4 & np0.r) != 0 ? wuiVar.m : f;
        boolean z4 = z;
        long j10 = (i4 & 8192) != 0 ? wuiVar.n : j3;
        long j11 = (i4 & 16384) != 0 ? wuiVar.o : j4;
        long j12 = (32768 & i4) != 0 ? wuiVar.p : j5;
        long j13 = (65536 & i4) != 0 ? wuiVar.q : j6;
        long j14 = (131072 & i4) != 0 ? wuiVar.r : j7;
        String str8 = (262144 & i4) != 0 ? wuiVar.s : str4;
        Float f4 = (524288 & i4) != 0 ? wuiVar.t : f2;
        Integer num5 = (1048576 & i4) != 0 ? wuiVar.u : num;
        Integer num6 = (2097152 & i4) != 0 ? wuiVar.v : num2;
        Integer num7 = (4194304 & i4) != 0 ? wuiVar.w : num3;
        Integer num8 = (i4 & 8388608) != 0 ? wuiVar.x : num4;
        wuiVar.getClass();
        return new wui(xuiVar, z4, str5, str6, str7, z2, z3, j8, j9, i5, i6, i7, f3, j10, j11, j12, j13, j14, str8, f4, num5, num6, num7, num8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wui)) {
            return false;
        }
        wui wuiVar = (wui) obj;
        return cqk.d(this.a, wuiVar.a) && this.b == wuiVar.b && cqk.d(this.c, wuiVar.c) && cqk.d(this.d, wuiVar.d) && cqk.d(this.e, wuiVar.e) && this.f == wuiVar.f && this.g == wuiVar.g && bj8.b(this.h, wuiVar.h) && bj8.b(this.i, wuiVar.i) && this.j == wuiVar.j && this.k == wuiVar.k && this.l == wuiVar.l && Float.compare(this.m, wuiVar.m) == 0 && this.n == wuiVar.n && this.o == wuiVar.o && this.p == wuiVar.p && this.q == wuiVar.q && this.r == wuiVar.r && cqk.d(this.s, wuiVar.s) && cqk.d(this.t, wuiVar.t) && cqk.d(this.u, wuiVar.u) && cqk.d(this.v, wuiVar.v) && cqk.d(this.w, wuiVar.w) && cqk.d(this.x, wuiVar.x);
    }

    public final int hashCode() {
        int iN = nbh.n(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iN + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iG = qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(nbh.m(zo5.c(this.l, zo5.c(this.k, zo5.c(this.j, qt4.g(qt4.g(nbh.n(nbh.n((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31), 31), 31), this.m, 31), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r);
        String str4 = this.s;
        int iHashCode3 = (iG + (str4 == null ? 0 : str4.hashCode())) * 31;
        Float f = this.t;
        int iHashCode4 = (iHashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.u;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.v;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.w;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.x;
        return iHashCode7 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        String strA = b1e.a(this.h);
        String strA2 = b1e.a(this.i);
        StringBuilder sb = new StringBuilder("VideoConversion(videoConversionData=");
        sb.append(this.a);
        sb.append(", finished=");
        sb.append(this.b);
        sb.append(", preparedMimeType=");
        nbh.G(sb, this.c, ", preparedPath=", this.d, ", resultPath=");
        sb.append(this.e);
        sb.append(", isWarmConversion=");
        sb.append(this.f);
        sb.append(", isOriginalQuality=");
        sb.append(this.g);
        sb.append(", initialSize=");
        sb.append(strA);
        sb.append(", outputSize=");
        sb.append(strA2);
        sb.append(", initialBitrate=");
        sb.append(this.j);
        sb.append(", requestedBitrate=");
        qt4.x(this.k, this.l, ", outputBitrate=", ", frameRate=", sb);
        sb.append(this.m);
        sb.append(", initialFileSize=");
        sb.append(this.n);
        qt4.z(this.o, ", approximateFileSize=", ", outputFileSize=", sb);
        sb.append(this.p);
        qt4.z(this.q, ", initialDuration=", ", outputDuration=", sb);
        qv1.s(this.r, ", encoderName=", this.s, sb);
        sb.append(", iFrameIntervalSec=");
        sb.append(this.t);
        sb.append(", maxNumReorderSamples=");
        sb.append(this.u);
        sb.append(", mediaInfoSourceCode=");
        sb.append(this.v);
        sb.append(", bitrateNormalizationSourceCode=");
        sb.append(this.w);
        sb.append(", transcodeReasonCode=");
        sb.append(this.x);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public wui(xui xuiVar, boolean z, String str, String str2, String str3, int i) {
        long jA = bj8.a(0, 0);
        this(xuiVar, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, str3, false, false, jA, jA, 0, 0, 0, 0.0f, 0L, 0L, 0L, 0L, 0L, null, null, null, null, null, null);
    }
}
