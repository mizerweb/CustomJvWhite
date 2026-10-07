package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qgc {
    public final ok0 a;
    public final CharSequence b;
    public final fu1 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final npi g;
    public final int h;
    public final boolean i;
    public final CharSequence j;

    public qgc(ok0 ok0Var, CharSequence charSequence, fu1 fu1Var, boolean z, boolean z2, boolean z3, npi npiVar, int i, boolean z4, CharSequence charSequence2) {
        this.a = ok0Var;
        this.b = charSequence;
        this.c = fu1Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = npiVar;
        this.h = i;
        this.i = z4;
        this.j = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgc)) {
            return false;
        }
        qgc qgcVar = (qgc) obj;
        return cqk.d(this.a, qgcVar.a) && cqk.d(this.b, qgcVar.b) && cqk.d(this.c, qgcVar.c) && this.d == qgcVar.d && this.e == qgcVar.e && this.f == qgcVar.f && cqk.d(this.g, qgcVar.g) && this.h == qgcVar.h && this.i == qgcVar.i && cqk.d(this.j, qgcVar.j);
    }

    public final int hashCode() {
        ok0 ok0Var = this.a;
        int iHashCode = (ok0Var == null ? 0 : ok0Var.hashCode()) * 31;
        CharSequence charSequence = this.b;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        fu1 fu1Var = this.c;
        int iN = nbh.n(nbh.n(nbh.n((iHashCode2 + (fu1Var == null ? 0 : fu1Var.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        npi npiVar = this.g;
        int iN2 = nbh.n(c0a.f(this.h, (iN + (npiVar == null ? 0 : npiVar.hashCode())) * 31, 31), 31, this.i);
        CharSequence charSequence2 = this.j;
        return iN2 + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpponentPipState(avatar=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append((Object) this.b);
        sb.append(", id=");
        sb.append(this.c);
        sb.append(", isTalking=");
        sb.append(this.d);
        sb.append(", isMicrophoneEnabled=");
        qt4.B(", isConnecting=", ", videoState=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", action=");
        sb.append(v0h.q(this.h));
        sb.append(", isMe=");
        sb.append(this.i);
        sb.append(", userNameWithState=");
        sb.append((Object) this.j);
        sb.append(")");
        return sb.toString();
    }
}
