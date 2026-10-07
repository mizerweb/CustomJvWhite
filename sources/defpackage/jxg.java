package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jxg {
    public final long a;
    public final long b;
    public final int c;
    public final String d;
    public final int e;
    public final int f;
    public final String g;
    public final String h;
    public final int i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public final Float n;
    public final Float o;
    public final Float p;
    public final Float q;

    public jxg(long j, long j2, int i, String str, int i2, int i3, String str2, String str3, int i4, float f, float f2, float f3, float f4, Float f5, Float f6, Float f7, Float f8) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = str;
        this.e = i2;
        this.f = i3;
        this.g = str2;
        this.h = str3;
        this.i = i4;
        this.j = f;
        this.k = f2;
        this.l = f3;
        this.m = f4;
        this.n = f5;
        this.o = f6;
        this.p = f7;
        this.q = f8;
    }

    public final String a() {
        return this.d;
    }

    public final long b() {
        return this.b;
    }

    public final long c() {
        return this.a;
    }

    public final int d() {
        return this.i;
    }

    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxg)) {
            return false;
        }
        jxg jxgVar = (jxg) obj;
        return this.a == jxgVar.a && this.b == jxgVar.b && this.c == jxgVar.c && cqk.d(this.d, jxgVar.d) && this.e == jxgVar.e && this.f == jxgVar.f && cqk.d(this.g, jxgVar.g) && cqk.d(this.h, jxgVar.h) && this.i == jxgVar.i && Float.compare(this.j, jxgVar.j) == 0 && Float.compare(this.k, jxgVar.k) == 0 && Float.compare(this.l, jxgVar.l) == 0 && Float.compare(this.m, jxgVar.m) == 0 && cqk.d(this.n, jxgVar.n) && cqk.d(this.o, jxgVar.o) && cqk.d(this.p, jxgVar.p) && cqk.d(this.q, jxgVar.q);
    }

    public final float f() {
        return this.m;
    }

    public final float g() {
        return this.l;
    }

    public final String h() {
        return this.g;
    }

    public final int hashCode() {
        int iM = nbh.m(nbh.m(nbh.m(nbh.m(zo5.c(this.i, zo5.d(zo5.d(zo5.c(this.f, zo5.c(this.e, zo5.d(zo5.c(this.c, qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31), 31), 31, this.g), 31, this.h), 31), this.j, 31), this.k, 31), this.l, 31), this.m, 31);
        Float f = this.n;
        int iHashCode = (iM + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.o;
        int iHashCode2 = (iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.p;
        int iHashCode3 = (iHashCode2 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.q;
        return iHashCode3 + (f4 != null ? f4.hashCode() : 0);
    }

    public final int i() {
        return this.f;
    }

    public final Float j() {
        return this.q;
    }

    public final Float k() {
        return this.n;
    }

    public final Float l() {
        return this.p;
    }

    public final Float m() {
        return this.o;
    }

    public final int n() {
        return this.e;
    }

    public final String o() {
        return this.h;
    }

    public final float p() {
        return this.j;
    }

    public final float q() {
        return this.k;
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "StoryDraftTextLayerEntity(layerId=", ", draftId=");
        c0a.w(sbS, this.b, ", position=", this.c);
        sbS.append(", alignMode=");
        sbS.append(this.d);
        sbS.append(", textColor=");
        sbS.append(this.e);
        sbS.append(", textBackgroundColor=");
        sbS.append(this.f);
        sbS.append(", text=");
        sbS.append(this.g);
        sbS.append(", textStyle=");
        sbS.append(this.h);
        sbS.append(", layoutWidth=");
        sbS.append(this.i);
        sbS.append(", translationX=");
        sbS.append(this.j);
        sbS.append(", translationY=");
        sbS.append(this.k);
        sbS.append(", scale=");
        sbS.append(this.l);
        sbS.append(", rotation=");
        sbS.append(this.m);
        sbS.append(", textBoundsLeft=");
        sbS.append(this.n);
        sbS.append(", textBoundsTop=");
        sbS.append(this.o);
        sbS.append(", textBoundsRight=");
        sbS.append(this.p);
        sbS.append(", textBoundsBottom=");
        sbS.append(this.q);
        sbS.append(")");
        return sbS.toString();
    }
}
