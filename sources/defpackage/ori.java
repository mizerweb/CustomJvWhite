package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ori {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float[] f;

    public ori(float f, float f2, float f3, float f4, float f5, float[] fArr) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = fArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ori)) {
            return false;
        }
        ori oriVar = (ori) obj;
        return Float.compare(this.a, oriVar.a) == 0 && Float.compare(this.b, oriVar.b) == 0 && Float.compare(this.c, oriVar.c) == 0 && Float.compare(this.d, oriVar.d) == 0 && Float.compare(this.e, oriVar.e) == 0 && this.f.equals(oriVar.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) + nbh.m(nbh.m(nbh.m(nbh.m(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.f);
        StringBuilder sbN = bc1.n("GradientEllipse(cx=", this.a, ", cy=", this.b, ", rx=");
        c0a.u(sbN, this.c, ", ry=", this.d, ", rotation=");
        sbN.append(this.e);
        sbN.append(", stops=");
        sbN.append(string);
        sbN.append(")");
        return sbN.toString();
    }
}
