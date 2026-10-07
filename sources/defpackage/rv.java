package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rv {
    public float a;
    public float b;
    public float c;
    public float d;

    public rv(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv)) {
            return false;
        }
        rv rvVar = (rv) obj;
        return Float.compare(this.a, rvVar.a) == 0 && Float.compare(this.b, rvVar.b) == 0 && Float.compare(this.c, rvVar.c) == 0 && Float.compare(this.d, rvVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + nbh.m(nbh.m(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = this.d;
        StringBuilder sbN = bc1.n("ArcFrame(t=", f, ", trimStart=", f2, ", trimEnd=");
        sbN.append(f3);
        sbN.append(", rotationDeg=");
        sbN.append(f4);
        sbN.append(")");
        return sbN.toString();
    }
}
