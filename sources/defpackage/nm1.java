package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nm1 {
    public final x02 a;
    public final be1 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public nm1(x02 x02Var, be1 be1Var, boolean z, boolean z2, boolean z3) {
        this.a = x02Var;
        this.b = be1Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final be1 a() {
        return this.b;
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nm1)) {
            return false;
        }
        nm1 nm1Var = (nm1) obj;
        return cqk.d(this.a, nm1Var.a) && cqk.d(this.b, nm1Var.b) && this.c == nm1Var.c && this.d == nm1Var.d && this.e == nm1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + nbh.n(nbh.n((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeldBannerState(heldSession=");
        sb.append(this.a);
        sb.append(", chat=");
        sb.append(this.b);
        sb.append(", isInWaitingRoom=");
        qt4.B(", isInPip=", ", isSwitchAction=", sb, this.c, this.d);
        return qt4.r(sb, this.e, ")");
    }
}
