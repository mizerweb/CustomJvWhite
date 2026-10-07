package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class stc {
    public final long a;
    public final long b;
    public final int c;
    public final String d;
    public final String e;
    public final long f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final int k;

    public stc(long j, long j2, int i, String str, String str2, long j3, String str3, String str4, String str5, String str6, int i2) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = j3;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = i2;
    }

    public final String a() {
        return this.j;
    }

    public final int b() {
        return this.c;
    }

    public final String c() {
        return this.g;
    }

    public final String d() {
        return this.h;
    }

    public final long e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stc)) {
            return false;
        }
        stc stcVar = (stc) obj;
        return this.a == stcVar.a && this.b == stcVar.b && this.c == stcVar.c && cqk.d(this.d, stcVar.d) && cqk.d(this.e, stcVar.e) && this.f == stcVar.f && cqk.d(this.g, stcVar.g) && cqk.d(this.h, stcVar.h) && cqk.d(this.i, stcVar.i) && cqk.d(this.j, stcVar.j) && this.k == stcVar.k;
    }

    public final String f() {
        return this.i;
    }

    public final String g() {
        return this.d;
    }

    public final String h() {
        return this.e;
    }

    public final int hashCode() {
        int iG = qt4.g(zo5.d(zo5.d(zo5.c(this.c, qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        int iD = zo5.d((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.h);
        String str2 = this.i;
        int iHashCode = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        return qt4.D(this.k) + ((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final long i() {
        return this.b;
    }

    public final long j() {
        return this.f;
    }

    public final int k() {
        return this.k;
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "PhoneEntity(id=", ", phonebookId=");
        c0a.w(sbS, this.b, ", contactId=", this.c);
        nbh.G(sbS, ", phone=", this.d, ", phoneKey=", this.e);
        qt4.z(this.f, ", serverPhone=", ", email=", sbS);
        nbh.G(sbS, this.g, ", firstName=", this.h, ", lastName=");
        nbh.G(sbS, this.i, ", avatarPath=", this.j, ", type=");
        sbS.append(iic.v(this.k));
        sbS.append(")");
        return sbS.toString();
    }
}
