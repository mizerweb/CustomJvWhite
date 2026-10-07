package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kgd {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public kgd(float f, float f2, float f3, int i, int i2, int i3, int i4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgd)) {
            return false;
        }
        kgd kgdVar = (kgd) obj;
        return Float.compare(this.a, kgdVar.a) == 0 && Float.compare(this.b, kgdVar.b) == 0 && Float.compare(this.c, kgdVar.c) == 0 && this.d == kgdVar.d && this.e == kgdVar.e && this.f == kgdVar.f && this.g == kgdVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + zo5.c(this.f, zo5.c(this.e, zo5.c(this.d, nbh.m(nbh.m(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = bc1.n("Geometry(startTranslationY=", this.a, ", endTranslationY=", this.b, ", endTranslationX=");
        sbN.append(this.c);
        sbN.append(", startHeight=");
        sbN.append(this.d);
        sbN.append(", endHeight=");
        qt4.x(this.e, this.f, ", startWidth=", ", endWidth=", sbN);
        return zo5.t(sbN, this.g, ")");
    }
}
