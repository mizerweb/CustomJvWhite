package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cy8 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public cy8(float f, float f2, float f3, float f4, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy8)) {
            return false;
        }
        cy8 cy8Var = (cy8) obj;
        return Float.compare(this.a, cy8Var.a) == 0 && Float.compare(this.b, cy8Var.b) == 0 && Float.compare(this.c, cy8Var.c) == 0 && Float.compare(this.d, cy8Var.d) == 0 && Float.compare(this.e, cy8Var.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + nbh.m(nbh.m(nbh.m(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder sbN = bc1.n("LayerCoordinatesApi(x=", this.a, ", y=", this.b, ", w=");
        c0a.u(sbN, this.c, ", h=", this.d, ", rotation=");
        sbN.append(this.e);
        sbN.append(")");
        return sbN.toString();
    }
}
