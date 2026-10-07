package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class olg {
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final String e;
    public final long f;
    public final String g;
    public final String h;
    public final String i;
    public final List j;
    public final int k;
    public final long l;
    public final String m;
    public final boolean n;
    public final int o;
    public final String p;

    public olg(long j, long j2, int i, int i2, String str, long j3, String str2, String str3, String str4, List list, int i3, long j4, String str5, boolean z, int i4, String str6) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
        this.e = str;
        this.f = j3;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = list;
        this.k = i3;
        this.l = j4;
        this.m = str5;
        this.n = z;
        this.o = i4;
        this.p = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof olg)) {
            return false;
        }
        olg olgVar = (olg) obj;
        return this.a == olgVar.a && this.b == olgVar.b && this.c == olgVar.c && this.d == olgVar.d && cqk.d(this.e, olgVar.e) && this.f == olgVar.f && cqk.d(this.g, olgVar.g) && cqk.d(this.h, olgVar.h) && cqk.d(this.i, olgVar.i) && cqk.d(this.j, olgVar.j) && this.k == olgVar.k && this.l == olgVar.l && cqk.d(this.m, olgVar.m) && this.n == olgVar.n && this.o == olgVar.o && cqk.d(this.p, olgVar.p);
    }

    public final int hashCode() {
        int iC = zo5.c(this.d, zo5.c(this.c, qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31), 31);
        String str = this.e;
        int iG = qt4.g((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        String str2 = this.g;
        int iHashCode = (iG + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int iG2 = qt4.g(c0a.f(this.k, qv1.c((iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.j), 31), 31, this.l);
        String str5 = this.m;
        int iF = c0a.f(this.o, nbh.n((iG2 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.n), 31);
        String str6 = this.p;
        return iF + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "StickerEntity(id=", ", stickerId=");
        c0a.w(sbS, this.b, ", width=", this.c);
        sbS.append(", height=");
        sbS.append(this.d);
        sbS.append(", url=");
        sbS.append(this.e);
        qt4.z(this.f, ", updateTime=", ", mp4Url=", sbS);
        nbh.G(sbS, this.g, ", firstUrl=", this.h, ", previewUrl=");
        sbS.append(this.i);
        sbS.append(", tags=");
        sbS.append(this.j);
        sbS.append(", stickerType=");
        sbS.append(c0a.B(this.k));
        sbS.append(", setId=");
        sbS.append(this.l);
        sbS.append(", lottieUrl=");
        sbS.append(this.m);
        sbS.append(", audio=");
        sbS.append(this.n);
        sbS.append(", authorType=");
        sbS.append(c0a.A(this.o));
        sbS.append(", videoUrl=");
        sbS.append(this.p);
        sbS.append(")");
        return sbS.toString();
    }
}
