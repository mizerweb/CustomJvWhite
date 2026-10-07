package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class un1 extends rbb {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public un1(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        super(sbi.a);
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof un1)) {
            return false;
        }
        un1 un1Var = (un1) obj;
        return cqk.d(this.b, un1Var.b) && this.c == un1Var.c && this.d == un1Var.d && this.e == un1Var.e && this.f == un1Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + nbh.n(nbh.n(nbh.n(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbA = zo5.A("OpenLink(link=", this.b, ", isVideoCall=", ", isVideoEnabled=", this.c);
        qt4.B(", isAudioEnabled=", ", isFront=", sbA, this.d, this.e);
        return qt4.r(sbA, this.f, ")");
    }
}
