package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bac {
    public final float a;
    public final int b;

    public bac(int i, float f) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bac)) {
            return false;
        }
        bac bacVar = (bac) obj;
        return Float.compare(this.a, bacVar.a) == 0 && Float.compare(0.0f, 0.0f) == 0 && this.b == bacVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + nbh.m(Float.hashCode(this.a) * 31, 0.0f, 31);
    }

    public final String toString() {
        return "IndicatorConfig(topCorners=" + this.a + ", bottomCorners=0.0, height=" + this.b + ")";
    }
}
