package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ud8 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final byte f;
    public final byte g;
    public final long h;
    public final Long i;
    public final String j;
    public final byte k;

    public ud8(String str, String str2, int i, String str3, String str4, byte b, byte b2, long j, Long l, String str5, byte b3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = b;
        this.g = b2;
        this.h = j;
        this.i = l;
        this.j = str5;
        this.k = b3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud8)) {
            return false;
        }
        ud8 ud8Var = (ud8) obj;
        return this.a.equals(ud8Var.a) && this.b.equals(ud8Var.b) && this.c == ud8Var.c && cqk.d(this.d, ud8Var.d) && cqk.d(this.e, ud8Var.e) && this.f == ud8Var.f && this.g == ud8Var.g && ew5.f(this.h, ud8Var.h) && cqk.d(this.i, ud8Var.i) && cqk.d(this.j, ud8Var.j) && this.k == ud8Var.k;
    }

    public final int hashCode() {
        int iC = zo5.c(this.c, zo5.d(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (Byte.hashCode(this.g) + ((Byte.hashCode(this.f) + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
        ghb ghbVar = ew5.b;
        int iG = qt4.g(iHashCode2, 31, this.h);
        Long l = this.i;
        int iHashCode3 = (iG + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.j;
        return Byte.hashCode(this.k) + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String strT = ew5.t(this.h);
        StringBuilder sbQ = qv1.q("InformerBanner(id=", this.a, ", title=", this.b, ", settings=");
        sbQ.append(this.c);
        sbQ.append(", description=");
        sbQ.append(this.d);
        sbQ.append(", buttonText=");
        sbQ.append(this.e);
        sbQ.append(", priority=");
        sbQ.append((int) this.f);
        sbQ.append(", repeat=");
        sbQ.append((int) this.g);
        sbQ.append(", rerun=");
        sbQ.append(strT);
        sbQ.append(", animojiId=");
        sbQ.append(this.i);
        sbQ.append(", url=");
        sbQ.append(this.j);
        sbQ.append(", type=");
        return zo5.t(sbQ, this.k, ")");
    }
}
