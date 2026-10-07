package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kf1 implements nf1 {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final c32 d;

    public kf1(long j, boolean z, boolean z2, c32 c32Var) {
        this.a = j;
        this.b = z;
        this.c = z2;
        this.d = c32Var;
    }

    @Override // defpackage.nf1
    public final boolean c() {
        return this.b;
    }

    @Override // defpackage.nf1
    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf1)) {
            return false;
        }
        kf1 kf1Var = (kf1) obj;
        return this.a == kf1Var.a && this.b == kf1Var.b && this.c == kf1Var.c && this.d == kf1Var.d;
    }

    public final int hashCode() {
        int iN = nbh.n(nbh.n(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        c32 c32Var = this.d;
        return iN + (c32Var == null ? 0 : c32Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbU = qt4.u(this.a, "Chat(chatId=", ", isVideoEnabled=", this.b);
        sbU.append(", isAudioEnabled=");
        sbU.append(this.c);
        sbU.append(", callStartSource=");
        sbU.append(this.d);
        sbU.append(")");
        return sbU.toString();
    }
}
