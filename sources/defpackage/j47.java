package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j47 {
    public final int a;
    public final int b;
    public final int c;

    public j47(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j47)) {
            return false;
        }
        j47 j47Var = (j47) obj;
        return this.a == j47Var.a && this.b == j47Var.b && this.c == j47Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + zo5.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return zo5.t(qv1.p("WidthConstraints(scrollThresholdItemCount=", this.a, ", min=", this.b, ", max="), this.c, ")");
    }
}
