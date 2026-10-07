package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vai {
    public final CharSequence a;
    public final CharSequence b;
    public final qe1 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final CharSequence j;

    public vai(CharSequence charSequence, String str, qe1 qe1Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, CharSequence charSequence2) {
        this.a = charSequence;
        this.b = str;
        this.c = qe1Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vai)) {
            return false;
        }
        vai vaiVar = (vai) obj;
        return cqk.d(this.a, vaiVar.a) && cqk.d(this.b, vaiVar.b) && cqk.d(this.c, vaiVar.c) && this.d == vaiVar.d && this.e == vaiVar.e && this.f == vaiVar.f && this.g == vaiVar.g && this.h == vaiVar.h && this.i == vaiVar.i && cqk.d(this.j, vaiVar.j);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        qe1 qe1Var = this.c;
        int iN = nbh.n(nbh.n(nbh.n(nbh.n(nbh.n(nbh.n((iHashCode2 + (qe1Var == null ? 0 : qe1Var.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        CharSequence charSequence3 = this.j;
        return iN + (charSequence3 != null ? charSequence3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnavailableCallState(callDescription=");
        sb.append((Object) this.a);
        sb.append(", callStateStatus=");
        sb.append((Object) this.b);
        sb.append(", chatInfo=");
        sb.append(this.c);
        sb.append(", isCallBackAvailable=");
        sb.append(this.d);
        sb.append(", isVideoCall=");
        qt4.B(", isBlockedLabelVisible=", ", isSendMessageAvailable=", sb, this.e, this.f);
        qt4.B(", isPhoneRecallAvailable=", ", isIosRestriction=", sb, this.g, this.h);
        sb.append(this.i);
        sb.append(", organization=");
        sb.append((Object) this.j);
        sb.append(")");
        return sb.toString();
    }
}
