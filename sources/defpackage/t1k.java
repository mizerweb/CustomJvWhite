package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class t1k {
    public final float a;
    public final float b;
    public final float c;

    public t1k(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final float a() {
        return this.c;
    }

    public final float b() {
        return this.b;
    }

    public final float c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1k)) {
            return false;
        }
        t1k t1kVar = (t1k) obj;
        return Float.compare(this.a, t1kVar.a) == 0 && Float.compare(this.b, t1kVar.b) == 0 && Float.compare(this.c, t1kVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + nbh.m(Float.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        return "ZoomValue(zoomRatio=" + this.a + ", minZoomRatio=" + this.b + ", maxZoomRatio=" + this.c + ')';
    }
}
