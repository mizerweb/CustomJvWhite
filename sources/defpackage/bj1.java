package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bj1 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public bj1(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj1)) {
            return false;
        }
        bj1 bj1Var = (bj1) obj;
        return this.a == bj1Var.a && this.b == bj1Var.b && this.c == bj1Var.c && this.d == bj1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + pwe.b(pwe.b(Boolean.hashCode(this.a) * 31, this.b), this.c);
    }

    public final String toString() {
        return bc1.m(", isSessionStateEnabled=", ")", zo5.B("CallFlags(startedAsP2P=", this.a, ", initialVideoEnabled=", this.b, ", forceRelayPolicy="), this.c, this.d);
    }
}
