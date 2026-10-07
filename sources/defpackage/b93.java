package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b93 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;

    public b93(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = z10;
        this.k = z11;
        this.l = z12;
        this.m = z13;
        this.n = z14;
        this.o = z15;
        this.p = z16;
        this.q = z17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b93)) {
            return false;
        }
        b93 b93Var = (b93) obj;
        return this.a == b93Var.a && this.b == b93Var.b && this.c == b93Var.c && this.d == b93Var.d && this.e == b93Var.e && this.f == b93Var.f && this.g == b93Var.g && this.h == b93Var.h && this.i == b93Var.i && this.j == b93Var.j && this.k == b93Var.k && this.l == b93Var.l && this.m == b93Var.m && this.n == b93Var.n && this.o == b93Var.o && this.p == b93Var.p && this.q == b93Var.q;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.q) + nbh.n(nbh.n(nbh.n(nbh.n(nbh.n(nbh.n(nbh.n(nbh.n(nbh.n(nbh.n(nbh.n(nbh.n(nbh.n(nbh.n(nbh.n(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p);
    }

    public final String toString() {
        StringBuilder sbB = zo5.B("ChatOptions(signAdmin=", this.a, ", onlyOwnerCanChangeIconTitle=", this.b, ", official=");
        qt4.B(", onlyAdminCanAddMember=", ", allCanPinMessage=", sbB, this.c, this.d);
        qt4.B(", ok=", ", onlyAdminCanCall=", sbB, this.e, this.f);
        qt4.B(", sentByPhone=", ", serviceChat=", sbB, this.g, this.h);
        qt4.B(", membersCanSeePrivateLink=", ", contentLevelChat=", sbB, this.i, this.j);
        qt4.B(", aPlusChannel=", ", joinRequest=", sbB, this.k, this.l);
        qt4.B(", comments=", ", commentsDisabled=", sbB, this.m, this.n);
        qt4.B(", confirmBeforeSend=", ", disableForward=", sbB, this.o, this.p);
        return qt4.r(sbB, this.q, ")");
    }
}
