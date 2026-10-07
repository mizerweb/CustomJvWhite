package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p8h {
    public final long a;
    public final int b;
    public final String c;
    public final String d;
    public final CharSequence e;
    public final String f;
    public final String g;

    public p8h(long j, int i, String str, String str2, CharSequence charSequence, String str3, String str4) {
        this.a = j;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = charSequence;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8h)) {
            return false;
        }
        p8h p8hVar = (p8h) obj;
        return this.a == p8hVar.a && this.b == p8hVar.b && cqk.d(this.c, p8hVar.c) && cqk.d(this.d, p8hVar.d) && cqk.d(this.e, p8hVar.e) && cqk.d(this.f, p8hVar.f) && cqk.d(this.g, p8hVar.g);
    }

    public final int hashCode() {
        int iF = c0a.f(this.b, Long.hashCode(this.a) * 31, 31);
        String str = this.c;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        CharSequence charSequence = this.e;
        int iHashCode3 = (iHashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "Suggest(id=", ", type=");
        sbS.append(v0h.s(this.b));
        sbS.append(", title=");
        sbS.append(this.c);
        sbS.append(", description=");
        sbS.append(this.d);
        sbS.append(", inputResult=");
        sbS.append((Object) this.e);
        sbS.append(", avatarUrl=");
        return nbh.y(sbS, this.f, ", query=", this.g, ")");
    }
}
