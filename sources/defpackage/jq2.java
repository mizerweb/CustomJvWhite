package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jq2 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final iq2 e;

    public jq2(int i, boolean z, boolean z2, boolean z3, iq2 iq2Var) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = iq2Var;
    }

    public static jq2 a(jq2 jq2Var, boolean z, boolean z2, boolean z3, iq2 iq2Var, int i) {
        boolean z4 = z3;
        int i2 = jq2Var.a;
        if ((i & 8) != 0) {
            z4 = jq2Var.d;
        }
        if ((i & 16) != 0) {
            iq2Var = jq2Var.e;
        }
        return new jq2(i2, z, z2, z4, iq2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq2)) {
            return false;
        }
        jq2 jq2Var = (jq2) obj;
        return this.a == jq2Var.a && this.b == jq2Var.b && this.c == jq2Var.c && this.d == jq2Var.d && cqk.d(this.e, jq2Var.e);
    }

    public final int hashCode() {
        int iN = nbh.n(nbh.n(nbh.n(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        iq2 iq2Var = this.e;
        return iN + (iq2Var == null ? 0 : iq2Var.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeLinkScreenState(title=");
        sb.append(this.a);
        sb.append(", hasChanges=");
        sb.append(this.b);
        sb.append(", enabledButton=");
        qt4.B(", hasProgress=", ", header=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
