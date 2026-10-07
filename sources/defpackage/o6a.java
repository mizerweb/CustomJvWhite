package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class o6a {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public o6a(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6a)) {
            return false;
        }
        o6a o6aVar = (o6a) obj;
        return Float.compare(this.a, o6aVar.a) == 0 && Float.compare(this.b, o6aVar.b) == 0 && Float.compare(this.c, o6aVar.c) == 0 && Float.compare(this.d, o6aVar.d) == 0 && Float.compare(this.e, o6aVar.e) == 0 && Float.compare(this.f, o6aVar.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + nbh.m(nbh.m(nbh.m(nbh.m(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31);
    }

    public final String toString() {
        StringBuilder sbN = bc1.n("MediaTransformState(translationX=", this.a, ", translationY=", this.b, ", scale=");
        c0a.u(sbN, this.c, ", rotation=", this.d, ", pivotX=");
        sbN.append(this.e);
        sbN.append(", pivotY=");
        sbN.append(this.f);
        sbN.append(")");
        return sbN.toString();
    }
}
