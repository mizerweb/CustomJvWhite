package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ff9 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public ff9(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff9)) {
            return false;
        }
        ff9 ff9Var = (ff9) obj;
        return this.a == ff9Var.a && this.b == ff9Var.b && this.c == ff9Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + nbh.n(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return qt4.r(zo5.B("Login2Flags(configEnabled=", this.a, ", contactEnabled=", this.b, ", profileEnabled="), this.c, ")");
    }
}
