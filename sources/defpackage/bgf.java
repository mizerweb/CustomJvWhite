package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bgf {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;

    public bgf(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i, int i2) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = i;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgf)) {
            return false;
        }
        bgf bgfVar = (bgf) obj;
        return Float.compare(this.a, bgfVar.a) == 0 && Float.compare(this.b, bgfVar.b) == 0 && Float.compare(this.c, bgfVar.c) == 0 && Float.compare(this.d, bgfVar.d) == 0 && Float.compare(this.e, bgfVar.e) == 0 && Float.compare(this.f, bgfVar.f) == 0 && Float.compare(this.g, bgfVar.g) == 0 && Float.compare(this.h, bgfVar.h) == 0 && this.i == bgfVar.i && this.j == bgfVar.j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.j) + zo5.c(this.i, nbh.m(nbh.m(nbh.m(nbh.m(nbh.m(nbh.m(nbh.m(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), this.h, 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = bc1.n("SelectionSpec(selectionPaddingPx=", this.a, ", strokeWidthPx=", this.b, ", cornerStrokeWidthPx=");
        c0a.u(sbN, this.c, ", cornerHandleLengthPx=", this.d, ", dashDrawIntervalPx=");
        c0a.u(sbN, this.e, ", dashSkipIntervalPx=", this.f, ", selectionCornerRadiusPx=");
        c0a.u(sbN, this.g, ", shadowBlurRadiusPx=", this.h, ", strokeColor=");
        sbN.append(this.i);
        sbN.append(", shadowColor=");
        sbN.append(this.j);
        sbN.append(")");
        return sbN.toString();
    }
}
