package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ge8 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final byte e;
    public final byte f;
    public final long g;
    public final Long h;
    public final String i;
    public final fe8 j;
    public final long k;
    public final long l;
    public final long m;
    public final int n;
    public final String o;

    public ge8(String str, String str2, int i, String str3, byte b, byte b2, long j, Long l, String str4, fe8 fe8Var, long j2, long j3, long j4, int i2, String str5) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = b;
        this.f = b2;
        this.g = j;
        this.h = l;
        this.i = str4;
        this.j = fe8Var;
        this.k = j2;
        this.l = j3;
        this.m = j4;
        this.n = i2;
        this.o = str5;
    }

    public static ge8 a(ge8 ge8Var, long j, long j2, long j3, int i, int i2) {
        String str = ge8Var.a;
        String str2 = ge8Var.b;
        int i3 = ge8Var.c;
        String str3 = ge8Var.d;
        byte b = ge8Var.e;
        byte b2 = ge8Var.f;
        long j4 = ge8Var.g;
        Long l = ge8Var.h;
        String str4 = ge8Var.i;
        fe8 fe8Var = ge8Var.j;
        long j5 = (i2 & 1024) != 0 ? ge8Var.k : j;
        long j6 = (i2 & np0.q) != 0 ? ge8Var.l : j2;
        long j7 = (i2 & np0.r) != 0 ? ge8Var.m : j3;
        int i4 = (i2 & 8192) != 0 ? ge8Var.n : i;
        String str5 = ge8Var.o;
        ge8Var.getClass();
        return new ge8(str, str2, i3, str3, b, b2, j4, l, str4, fe8Var, j5, j6, j7, i4, str5);
    }

    public final Long b() {
        return this.h;
    }

    public final String c() {
        return this.o;
    }

    public final long d() {
        return this.k;
    }

    public final long e() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge8)) {
            return false;
        }
        ge8 ge8Var = (ge8) obj;
        return cqk.d(this.a, ge8Var.a) && cqk.d(this.b, ge8Var.b) && this.c == ge8Var.c && cqk.d(this.d, ge8Var.d) && this.e == ge8Var.e && this.f == ge8Var.f && this.g == ge8Var.g && cqk.d(this.h, ge8Var.h) && cqk.d(this.i, ge8Var.i) && cqk.d(this.j, ge8Var.j) && this.k == ge8Var.k && this.l == ge8Var.l && this.m == ge8Var.m && this.n == ge8Var.n && cqk.d(this.o, ge8Var.o);
    }

    public final String f() {
        return this.d;
    }

    public final boolean g() {
        return (this.c & 2) != 0;
    }

    public final boolean h() {
        return (this.c & 4) != 0;
    }

    public final int hashCode() {
        int iC = zo5.c(this.c, zo5.d(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        int iG = qt4.g((Byte.hashCode(this.f) + ((Byte.hashCode(this.e) + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.g);
        Long l = this.h;
        int iHashCode = (iG + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.i;
        int iC2 = zo5.c(this.n, qt4.g(qt4.g(qt4.g((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.j.a) * 31, 31, this.k), 31, this.l), 31, this.m), 31);
        String str3 = this.o;
        return iC2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String i() {
        return this.a;
    }

    public final byte j() {
        return this.e;
    }

    public final byte k() {
        return this.f;
    }

    public final long l() {
        return this.g;
    }

    public final int m() {
        return this.c;
    }

    public final int n() {
        return this.n;
    }

    public final long o() {
        return this.l;
    }

    public final String p() {
        return this.b;
    }

    public final fe8 q() {
        return this.j;
    }

    public final String r() {
        return this.i;
    }

    public final boolean s() {
        return (this.c & 1) != 0;
    }

    public final boolean t() {
        return (this.c & 8) != 0;
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("InformerBannerEntity(id=", this.a, ", title=", this.b, ", settings=");
        sbQ.append(this.c);
        sbQ.append(", description=");
        sbQ.append(this.d);
        sbQ.append(", priority=");
        qt4.x(this.e, this.f, ", repeat=", ", rerunMillis=", sbQ);
        sbQ.append(this.g);
        sbQ.append(", animojiId=");
        sbQ.append(this.h);
        sbQ.append(", url=");
        sbQ.append(this.i);
        sbQ.append(", type=");
        sbQ.append(this.j);
        qt4.z(this.k, ", clickTime=", ", showTime=", sbQ);
        sbQ.append(this.l);
        qt4.z(this.m, ", closeTime=", ", showCount=", sbQ);
        sbQ.append(this.n);
        sbQ.append(", buttonText=");
        sbQ.append(this.o);
        sbQ.append(")");
        return sbQ.toString();
    }

    public final boolean u() {
        return (this.c & 16) != 0;
    }

    public /* synthetic */ ge8(String str, String str2, int i, String str3, byte b, byte b2, long j, Long l, String str4, fe8 fe8Var, String str5) {
        this(str, str2, i, str3, b, b2, j, l, str4, fe8Var, 0L, 0L, 0L, 0, str5);
    }
}
