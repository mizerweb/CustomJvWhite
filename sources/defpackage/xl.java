package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xl {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final Long f;
    public final String g;

    public xl(long j, long j2, String str, String str2, String str3, Long l, String str4) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = l;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl)) {
            return false;
        }
        xl xlVar = (xl) obj;
        return this.a == xlVar.a && this.b == xlVar.b && cqk.d(this.c, xlVar.c) && cqk.d(this.d, xlVar.d) && cqk.d(this.e, xlVar.e) && cqk.d(this.f, xlVar.f) && cqk.d(this.g, xlVar.g);
    }

    public final int hashCode() {
        int iD = zo5.d(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.g;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "AnimojiEntity(id=", ", updateTime=");
        qv1.s(this.b, ", emoji=", this.c, sbS);
        nbh.G(sbS, ", lottieUrl=", this.d, ", lottiePlayUrl=", this.e);
        sbS.append(", setId=");
        sbS.append(this.f);
        sbS.append(", iconUrl=");
        sbS.append(this.g);
        sbS.append(")");
        return sbS.toString();
    }
}
