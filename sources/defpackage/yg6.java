package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yg6 {
    public final int a;
    public final int b;
    public final boolean c;

    public yg6(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg6)) {
            return false;
        }
        yg6 yg6Var = (yg6) obj;
        return this.a == yg6Var.a && this.b == yg6Var.b && this.c == yg6Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + zo5.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return qt4.r(qv1.p("ExpandedRange(firstVisible=", this.a, ", lastVisible=", this.b, ", isFirstItemPartiallyVisible="), this.c, ")");
    }
}
