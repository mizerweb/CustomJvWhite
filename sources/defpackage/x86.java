package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class x86 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public x86(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x86)) {
            return false;
        }
        x86 x86Var = (x86) obj;
        return this.a == x86Var.a && this.b == x86Var.b && this.c == x86Var.c && this.d == x86Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + zo5.c(this.c, zo5.c(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = qv1.p("EncoderTarget(width=", this.a, ", height=", this.b, ", bitrate=");
        sbP.append(this.c);
        sbP.append(", fps=");
        sbP.append(this.d);
        sbP.append(")");
        return sbP.toString();
    }
}
