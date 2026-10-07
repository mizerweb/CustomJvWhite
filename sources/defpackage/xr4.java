package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xr4 {
    public final boolean a;
    public final int b;
    public final int c;
    public final float d;
    public final float e;
    public final int f;

    public xr4(float f, float f2, int i, int i2, int i3, boolean z) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = f;
        this.e = f2;
        this.f = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr4)) {
            return false;
        }
        xr4 xr4Var = (xr4) obj;
        return this.a == xr4Var.a && this.b == xr4Var.b && this.c == xr4Var.c && Float.compare(this.d, xr4Var.d) == 0 && Float.compare(this.e, xr4Var.e) == 0 && this.f == xr4Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + nbh.m(nbh.m(zo5.c(this.c, zo5.c(this.b, Boolean.hashCode(this.a) * 31, 31), 31), this.d, 31), this.e, 31);
    }

    public final String toString() {
        return "AnimationState(isVisible=" + this.a + ", totalHeight=" + this.b + ", directionY=" + this.c + ", offsetY=" + this.d + ", startY=" + this.e + ", inset=" + this.f + ")";
    }
}
