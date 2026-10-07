package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lf1 implements nf1 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final c32 g;

    public lf1(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, c32 c32Var) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = c32Var;
    }

    @Override // defpackage.nf1
    public final boolean c() {
        return this.e;
    }

    @Override // defpackage.nf1
    public final boolean d() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf1)) {
            return false;
        }
        lf1 lf1Var = (lf1) obj;
        return this.a.equals(lf1Var.a) && this.b == lf1Var.b && this.c == lf1Var.c && this.d == lf1Var.d && this.e == lf1Var.e && this.f == lf1Var.f && this.g == lf1Var.g;
    }

    public final int hashCode() {
        int iN = nbh.n(nbh.n(nbh.n(nbh.n(nbh.n(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        c32 c32Var = this.g;
        return iN + (c32Var == null ? 0 : c32Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbA = zo5.A("Link(link=", this.a, ", isNewLink=", ", isVideoCall=", this.b);
        qt4.B(", isFrontCameraEnabled=", ", isVideoEnabled=", sbA, this.c, this.d);
        qt4.B(", isAudioEnabled=", ", callStartSource=", sbA, this.e, this.f);
        sbA.append(this.g);
        sbA.append(")");
        return sbA.toString();
    }
}
