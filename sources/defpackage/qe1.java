package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qe1 {
    public final Long a;
    public final CharSequence b;
    public final CharSequence c;
    public final ok0 d;
    public final qk0 e;
    public final boolean f;
    public final String g;
    public final String h;
    public final Long i;

    public qe1(Long l, CharSequence charSequence, CharSequence charSequence2, ok0 ok0Var, qk0 qk0Var, boolean z, String str, String str2, Long l2, int i) {
        l = (i & 1) != 0 ? null : l;
        charSequence = (i & 2) != 0 ? null : charSequence;
        charSequence2 = (i & 4) != 0 ? null : charSequence2;
        ok0Var = (i & 8) != 0 ? null : ok0Var;
        qk0Var = (i & 16) != 0 ? null : qk0Var;
        str = (i & 64) != 0 ? null : str;
        str2 = (i & np0.m) != 0 ? null : str2;
        l2 = (i & np0.n) != 0 ? null : l2;
        this.a = l;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = ok0Var;
        this.e = qk0Var;
        this.f = z;
        this.g = str;
        this.h = str2;
        this.i = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe1)) {
            return false;
        }
        qe1 qe1Var = (qe1) obj;
        return cqk.d(this.a, qe1Var.a) && cqk.d(this.b, qe1Var.b) && cqk.d(this.c, qe1Var.c) && cqk.d(this.d, qe1Var.d) && cqk.d(this.e, qe1Var.e) && this.f == qe1Var.f && cqk.d(this.g, qe1Var.g) && cqk.d(this.h, qe1Var.h) && cqk.d(this.i, qe1Var.i);
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        CharSequence charSequence = this.b;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.c;
        int iHashCode3 = (iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        ok0 ok0Var = this.d;
        int iHashCode4 = (iHashCode3 + (ok0Var == null ? 0 : ok0Var.hashCode())) * 31;
        qk0 qk0Var = this.e;
        int iN = nbh.n((iHashCode4 + (qk0Var == null ? 0 : qk0Var.hashCode())) * 31, 31, this.f);
        String str = this.g;
        int iHashCode5 = (iN + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.i;
        return iHashCode6 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallChatState(chatId=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append((Object) this.b);
        sb.append(", organization=");
        sb.append((Object) this.c);
        sb.append(", avatar=");
        sb.append(this.d);
        sb.append(", overlay=");
        sb.append(this.e);
        sb.append(", isLinkCall=");
        sb.append(this.f);
        sb.append(", country=");
        nbh.G(sb, this.g, ", registrationTimestamp=", this.h, ", phoneNumber=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }
}
