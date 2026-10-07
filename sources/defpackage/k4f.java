package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k4f {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public k4f(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = z;
        this.j = z2;
        this.k = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4f)) {
            return false;
        }
        k4f k4fVar = (k4f) obj;
        return this.a == k4fVar.a && this.b == k4fVar.b && this.c == k4fVar.c && this.d == k4fVar.d && this.e == k4fVar.e && this.f == k4fVar.f && this.g == k4fVar.g && this.h == k4fVar.h && this.i == k4fVar.i && this.j == k4fVar.j && this.k == k4fVar.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + nbh.n(nbh.n(zo5.c(this.h, zo5.c(this.g, zo5.c(this.f, zo5.c(this.e, zo5.c(this.d, zo5.c(this.c, zo5.c(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbP = qv1.p("ScreenInfo(realHeight=", this.a, ", realWidth=", this.b, ", currentWidth=");
        qt4.x(this.c, this.d, ", currentHeight=", ", topInset=", sbP);
        qt4.x(this.e, this.f, ", bottomInset=", ", leftInset=", sbP);
        qt4.x(this.g, this.h, ", rightInset=", ", isWeakDevice=", sbP);
        qt4.B(", isLong=", ", isWide=", sbP, this.i, this.j);
        return qt4.r(sbP, this.k, ")");
    }
}
