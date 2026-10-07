package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ox0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public ox0(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox0)) {
            return false;
        }
        ox0 ox0Var = (ox0) obj;
        return this.a == ox0Var.a && this.b == ox0Var.b && this.c == ox0Var.c && this.d == ox0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + nbh.n(nbh.n(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return bc1.m(", tokenSaved=", ")", zo5.B("BiometryInfo(available=", this.a, ", accessRequested=", this.b, ", accessGranted="), this.c, this.d);
    }
}
