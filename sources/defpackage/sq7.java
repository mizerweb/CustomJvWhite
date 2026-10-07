package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class sq7 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final int e;
    public final int f;
    public final Drawable g;
    public final int h;

    public sq7(float f, float f2, float f3, int i, int i2, int i3, Drawable drawable, int i4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = drawable;
        this.h = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq7)) {
            return false;
        }
        sq7 sq7Var = (sq7) obj;
        return Float.compare(this.a, sq7Var.a) == 0 && Float.compare(this.b, sq7Var.b) == 0 && Float.compare(this.c, sq7Var.c) == 0 && this.d == sq7Var.d && this.e == sq7Var.e && this.f == sq7Var.f && cqk.d(this.g, sq7Var.g) && this.h == sq7Var.h;
    }

    public final int hashCode() {
        int iC = zo5.c(this.f, zo5.c(this.e, zo5.c(this.d, nbh.m(nbh.m(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), 31), 31), 31);
        Drawable drawable = this.g;
        return Integer.hashCode(this.h) + ((iC + (drawable == null ? 0 : drawable.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbN = bc1.n("DrawConfiguration(bigDotRadius=", this.a, ", mediumDotRadius=", this.b, ", smallDotRadius=");
        sbN.append(this.c);
        sbN.append(", dotContainerWidth=");
        sbN.append(this.d);
        sbN.append(", normalDotColor=");
        qt4.x(this.e, this.f, ", selectedDotColor=", ", zeroPageIcon=", sbN);
        sbN.append(this.g);
        sbN.append(", zeroPageIconSize=");
        sbN.append(this.h);
        sbN.append(")");
        return sbN.toString();
    }
}
