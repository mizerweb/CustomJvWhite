package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ae4 {
    public static final ae4 f = new ae4(false, true, false, false, false);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public ae4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public static ae4 a(ae4 ae4Var, boolean z) {
        return new ae4(z, ae4Var.b, ae4Var.c, ae4Var.d, ae4Var.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae4)) {
            return false;
        }
        ae4 ae4Var = (ae4) obj;
        return this.a == ae4Var.a && this.b == ae4Var.b && this.c == ae4Var.c && this.d == ae4Var.d && this.e == ae4Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + nbh.n(nbh.n(nbh.n(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbB = zo5.B("Inet(c=", this.a, "|m=", this.b, "|r=");
        qt4.B("|t=", "|vpn=", sbB, this.c, this.d);
        return qt4.r(sbB, this.e, ")");
    }
}
