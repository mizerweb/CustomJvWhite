package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class rri {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final int[] f;
    public final float[] g;

    public rri(float f, float f2, float f3, float f4, float f5, float[] fArr, int[] iArr) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = iArr;
        this.g = fArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rri)) {
            return false;
        }
        rri rriVar = (rri) obj;
        return Float.compare(this.a, rriVar.a) == 0 && Float.compare(this.b, rriVar.b) == 0 && Float.compare(this.c, rriVar.c) == 0 && Float.compare(this.d, rriVar.d) == 0 && Float.compare(this.e, rriVar.e) == 0 && this.f.equals(rriVar.f) && this.g.equals(rriVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.g) + ((Arrays.hashCode(this.f) + nbh.m(nbh.m(nbh.m(nbh.m(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31)) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.f);
        String string2 = Arrays.toString(this.g);
        StringBuilder sbN = bc1.n("GradientEllipse(x=", this.a, ", y=", this.b, ", radiusX=");
        c0a.u(sbN, this.c, ", radiusY=", this.d, ", angle=");
        sbN.append(this.e);
        sbN.append(", color=");
        sbN.append(string);
        sbN.append(", stops=");
        return zo5.w(sbN, string2, ")");
    }
}
