package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class m1d {
    public static final m1d e = new m1d(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public m1d(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1d)) {
            return false;
        }
        m1d m1dVar = (m1d) obj;
        return Float.compare(this.a, m1dVar.a) == 0 && Float.compare(this.b, m1dVar.b) == 0 && Float.compare(this.c, m1dVar.c) == 0 && Float.compare(this.d, m1dVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + nbh.m(nbh.m(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sbN = bc1.n("PipBounds(maxLeftOffset=", this.a, ", maxRightOffset=", this.b, ", maxTopOffset=");
        sbN.append(this.c);
        sbN.append(", maxBottomOffset=");
        sbN.append(this.d);
        sbN.append(")");
        return sbN.toString();
    }
}
