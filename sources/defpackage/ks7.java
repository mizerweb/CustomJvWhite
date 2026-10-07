package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ks7 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public ks7(float f, float f2, float f3, float f4, float f5) {
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
        if (!(obj instanceof ks7)) {
            return false;
        }
        ks7 ks7Var = (ks7) obj;
        return Float.compare(this.a, ks7Var.a) == 0 && Float.compare(this.b, ks7Var.b) == 0 && Float.compare(this.c, ks7Var.c) == 0 && Float.compare(this.d, ks7Var.d) == 0 && Float.compare(this.e, ks7Var.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + nbh.m(nbh.m(nbh.m(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder sbN = bc1.n("HaloParams(circle1Radius=", this.a, ", circle2Radius=", this.b, ", alpha1=");
        c0a.u(sbN, this.c, ", alpha2=", this.d, ", alpha3=");
        sbN.append(this.e);
        sbN.append(")");
        return sbN.toString();
    }
}
