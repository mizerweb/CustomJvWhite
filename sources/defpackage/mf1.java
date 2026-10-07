package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mf1 implements nf1 {
    public final long a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final c32 e;

    public mf1(long j, String str, boolean z, boolean z2, c32 c32Var) {
        this.a = j;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = c32Var;
    }

    @Override // defpackage.nf1
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.nf1
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mf1)) {
            return false;
        }
        mf1 mf1Var = (mf1) obj;
        if (this.a != mf1Var.a) {
            return false;
        }
        String str = mf1Var.b;
        ifh ifhVar = ns4.b;
        return cqk.d(this.b, str) && this.c == mf1Var.c && this.d == mf1Var.d && this.e == mf1Var.e;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        ifh ifhVar = ns4.b;
        int iN = nbh.n(nbh.n(zo5.d(iHashCode, 31, this.b), 31, this.c), 31, this.d);
        c32 c32Var = this.e;
        return iN + (c32Var == null ? 0 : c32Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "User(userId=", ", conversationId=", ns4.c(this.b));
        qv1.v(", isVideoEnabled=", ", isAudioEnabled=", sbT, this.c, this.d);
        sbT.append(", callStartSource=");
        sbT.append(this.e);
        sbT.append(")");
        return sbT.toString();
    }
}
