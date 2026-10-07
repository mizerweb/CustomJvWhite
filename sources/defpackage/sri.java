package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sri {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;

    public sri(String str, int i, int i2, int i3, boolean z, int i4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return this.b;
    }

    public final boolean d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sri)) {
            return false;
        }
        sri sriVar = (sri) obj;
        return this.a.equals(sriVar.a) && this.b == sriVar.b && this.c == sriVar.c && this.d == sriVar.d && this.e == sriVar.e && this.f == sriVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + nbh.n(zo5.c(this.d, zo5.c(this.c, zo5.c(this.b, this.a.hashCode() * 31, 31), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbR = c0a.r(this.b, "Pattern(image=", this.a, ", width=", ", height=");
        qt4.x(this.c, this.d, ", opacity=", ", isOverlay=", sbR);
        sbR.append(this.e);
        sbR.append(", color=");
        sbR.append(this.f);
        sbR.append(")");
        return sbR.toString();
    }
}
