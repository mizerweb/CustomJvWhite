package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class in7 {
    public final int a;
    public final long b;
    public final long c;
    public final float d;
    public final boolean e;

    public in7(int i, long j, long j2, float f, int i2) {
        boolean z = (i2 & 32) != 0;
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = f;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in7)) {
            return false;
        }
        in7 in7Var = (in7) obj;
        return this.a == in7Var.a && this.b == in7Var.b && this.c == in7Var.c && Float.compare(this.d, in7Var.d) == 0 && Float.compare(0.6f, 0.6f) == 0 && this.e == in7Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + nbh.m(nbh.m(qt4.g(qt4.g(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), this.d, 31), 0.6f, 31);
    }

    public final String toString() {
        StringBuilder sbX = zo5.x(this.a, this.b, "AnimationConfig(repeatCount=", ", startDelay=");
        qt4.z(this.c, ", duration=", ", tiltDegrees=", sbX);
        sbX.append(this.d);
        sbX.append(", shineWidthFraction=0.6, startOnAttach=");
        sbX.append(this.e);
        sbX.append(")");
        return sbX.toString();
    }
}
