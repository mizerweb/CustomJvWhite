package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class lph {
    public final float a;
    public final float b;
    public final int[] c;
    public final float[] d;
    public final float e;
    public final float f;
    public final float g;

    public lph(float f, float f2, float f3, float f4, float f5, float[] fArr, int[] iArr) {
        this.a = f;
        this.b = f2;
        this.c = iArr;
        this.d = fArr;
        this.e = f3;
        this.f = f4;
        this.g = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lph)) {
            return false;
        }
        lph lphVar = (lph) obj;
        return Float.compare(this.a, lphVar.a) == 0 && Float.compare(this.b, lphVar.b) == 0 && this.c.equals(lphVar.c) && this.d.equals(lphVar.d) && Float.compare(this.e, lphVar.e) == 0 && Float.compare(this.f, lphVar.f) == 0 && Float.compare(this.g, lphVar.g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + nbh.m(nbh.m((Arrays.hashCode(this.d) + ((Arrays.hashCode(this.c) + nbh.m(Float.hashCode(this.a) * 31, this.b, 31)) * 31)) * 31, this.e, 31), this.f, 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.c);
        String string2 = Arrays.toString(this.d);
        StringBuilder sbN = bc1.n("GradientEllipse(x=", this.a, ", y=", this.b, ", color=");
        nbh.G(sbN, string, ", stops=", string2, ", radiusX=");
        c0a.u(sbN, this.e, ", radiusY=", this.f, ", angle=");
        sbN.append(this.g);
        sbN.append(")");
        return sbN.toString();
    }
}
