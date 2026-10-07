package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pfg {
    public final int a;
    public final double b;

    public pfg(int i, double d) {
        this.a = i;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfg)) {
            return false;
        }
        pfg pfgVar = (pfg) obj;
        return this.a == pfgVar.a && Double.compare(this.b, pfgVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SquircleParams(radius=" + this.a + ", curvature=" + this.b + ")";
    }
}
