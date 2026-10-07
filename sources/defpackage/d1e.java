package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class d1e {
    public final y0e a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;
    public final boolean f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final Float k;
    public final Integer l;
    public final Integer m;
    public final Integer n;

    public d1e(y0e y0eVar, int i, int i2, int i3, long j, boolean z, int i4, int i5, int i6, float f, Float f2, Integer num, Integer num2, Integer num3) {
        this.a = y0eVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = j;
        this.f = z;
        this.g = i4;
        this.h = i5;
        this.i = i6;
        this.j = f;
        this.k = f2;
        this.l = num;
        this.m = num2;
        this.n = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1e)) {
            return false;
        }
        d1e d1eVar = (d1e) obj;
        return this.a == d1eVar.a && this.b == d1eVar.b && this.c == d1eVar.c && this.d == d1eVar.d && this.e == d1eVar.e && this.f == d1eVar.f && this.g == d1eVar.g && this.h == d1eVar.h && this.i == d1eVar.i && Float.compare(this.j, d1eVar.j) == 0 && cqk.d(this.k, d1eVar.k) && cqk.d(this.l, d1eVar.l) && cqk.d(this.m, d1eVar.m) && cqk.d(this.n, d1eVar.n);
    }

    public final int hashCode() {
        int iM = nbh.m(zo5.c(this.i, zo5.c(this.h, zo5.c(this.g, nbh.n(qt4.g(zo5.c(this.d, zo5.c(this.c, zo5.c(this.b, this.a.hashCode() * 31, 31), 31), 31), 31, this.e), 31, this.f), 31), 31), 31), this.j, 31);
        Float f = this.k;
        int iHashCode = (iM + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.l;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.m;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.n;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbP = qv1.p("Quality(", this.b, "x", this.c, "|");
        c0a.v(sbP, this.d, "|", this.e);
        sbP.append("B|ioq=");
        sbP.append(this.f);
        sbP.append("|");
        sbP.append(this.a);
        sbP.append(")");
        return sbP.toString();
    }
}
