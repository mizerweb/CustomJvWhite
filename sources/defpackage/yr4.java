package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class yr4 {
    public static final yr4 d = new yr4();
    public final int a;
    public final int b;
    public final boolean c;

    public yr4(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public static yr4 a(yr4 yr4Var, int i, int i2, boolean z, int i3) {
        if ((i3 & 1) != 0) {
            i = yr4Var.a;
        }
        if ((i3 & 2) != 0) {
            i2 = yr4Var.b;
        }
        if ((i3 & 4) != 0) {
            z = yr4Var.c;
        }
        yr4Var.getClass();
        return new yr4(i, i2, z);
    }

    public final int b() {
        return this.a + this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr4)) {
            return false;
        }
        yr4 yr4Var = (yr4) obj;
        return this.a == yr4Var.a && this.b == yr4Var.b && this.c == yr4Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + zo5.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return qt4.r(qv1.p("ControlState(heightView=", this.a, ", inset=", this.b, ", isVisible="), this.c, ")");
    }

    public /* synthetic */ yr4() {
        this(0, 0, true);
    }
}
