package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xv7 {
    public final int a;
    public final String b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;

    public xv7(int i, String str, float f, float f2, float f3, float f4, float f5) {
        this.a = i;
        this.b = str;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv7)) {
            return false;
        }
        xv7 xv7Var = (xv7) obj;
        return this.a == xv7Var.a && cqk.d(this.b, xv7Var.b) && Float.compare(this.c, xv7Var.c) == 0 && Float.compare(this.d, xv7Var.d) == 0 && Float.compare(this.e, xv7Var.e) == 0 && Float.compare(this.f, xv7Var.f) == 0 && Float.compare(this.g, xv7Var.g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + nbh.m(nbh.m(nbh.m(nbh.m(zo5.d(Integer.hashCode(this.a) * 31, 31, this.b), this.c, 31), this.d, 31), this.e, 31), this.f, 31);
    }

    public final String toString() {
        StringBuilder sbA = nbh.A(this.a, "SelectedLineState(line=", ", highlightText=", this.b, ", textX=");
        c0a.u(sbA, this.c, ", textY=", this.d, ", baseLine=");
        c0a.u(sbA, this.e, ", textWidth=", this.f, ", textHeight=");
        sbA.append(this.g);
        sbA.append(")");
        return sbA.toString();
    }
}
