package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tq7 {
    public int a;
    public int b;
    public float c;
    public int d;
    public boolean e;
    public int f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq7)) {
            return false;
        }
        tq7 tq7Var = (tq7) obj;
        return this.a == tq7Var.a && this.b == tq7Var.b && Float.compare(this.c, tq7Var.c) == 0 && this.d == tq7Var.d && this.e == tq7Var.e && this.f == tq7Var.f;
    }

    public final int hashCode() {
        return qt4.D(this.f) + nbh.n(zo5.c(this.d, nbh.m(zo5.c(this.b, Integer.hashCode(this.a) * 31, 31), this.c, 31), 31), 31, this.e);
    }

    public final String toString() {
        String str;
        int i = this.a;
        int i2 = this.b;
        float f = this.c;
        int i3 = this.d;
        boolean z = this.e;
        int i4 = this.f;
        StringBuilder sbP = qv1.p("PageState(pagesNumber=", i, ", selectedPageIndex=", i2, ", pageOffsetFraction=");
        sbP.append(f);
        sbP.append(", selectedBigDotIndex=");
        sbP.append(i3);
        sbP.append(", wasShiftedFromZeroToZero=");
        sbP.append(z);
        sbP.append(", dotsAnimationType=");
        if (i4 == 1) {
            str = "NONE";
        } else if (i4 == 2) {
            str = "BIG_DOTS_CHANGE";
        } else if (i4 != 3) {
            str = i4 != 4 ? "null" : "ALL_DOTS_TO_RIGHT";
        } else {
            str = "ALL_DOTS_TO_LEFT";
        }
        sbP.append(str);
        sbP.append(")");
        return sbP.toString();
    }
}
