package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dy8 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final double f;
    public final boolean g;

    public dy8(float f, float f2, float f3, float f4, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = Math.toRadians(f5);
        this.g = Math.abs(f) <= Float.MAX_VALUE && 0.0f <= f && f <= 1.0f && Math.abs(f2) <= Float.MAX_VALUE && 0.0f <= f2 && f2 <= 1.0f && Math.abs(f3) <= Float.MAX_VALUE && f3 > 0.0f && f3 <= 1.0f && Math.abs(f4) <= Float.MAX_VALUE && f4 > 0.0f && f4 <= 1.0f && Math.abs(f5) <= Float.MAX_VALUE && 0.0f <= f5 && f5 <= 360.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy8)) {
            return false;
        }
        dy8 dy8Var = (dy8) obj;
        return Float.compare(this.a, dy8Var.a) == 0 && Float.compare(this.b, dy8Var.b) == 0 && Float.compare(this.c, dy8Var.c) == 0 && Float.compare(this.d, dy8Var.d) == 0 && Float.compare(this.e, dy8Var.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + nbh.m(nbh.m(nbh.m(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder sbN = bc1.n("LayerCoordinatesModel(x=", this.a, ", y=", this.b, ", w=");
        c0a.u(sbN, this.c, ", h=", this.d, ", rotation=");
        sbN.append(this.e);
        sbN.append(")");
        return sbN.toString();
    }
}
