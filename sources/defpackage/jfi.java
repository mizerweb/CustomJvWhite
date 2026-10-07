package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jfi {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final int g;
    public final long h;
    public final xfa i;
    public final wja j;
    public final Long k;
    public final Boolean l;
    public final long m;
    public final long n;

    public jfi(long j, long j2, long j3, long j4, long j5, long j6, int i, long j7, xfa xfaVar, wja wjaVar, Long l, Boolean bool, long j8, long j9) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = i;
        this.h = j7;
        this.i = xfaVar;
        this.j = wjaVar;
        this.k = l;
        this.l = bool;
        this.m = j8;
        this.n = j9;
    }

    public final long a() {
        return this.c;
    }

    public final xfa b() {
        return this.i;
    }

    public final long c() {
        return this.a;
    }

    public final long d() {
        return this.h;
    }

    public final long e() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfi)) {
            return false;
        }
        jfi jfiVar = (jfi) obj;
        return this.a == jfiVar.a && this.b == jfiVar.b && this.c == jfiVar.c && this.d == jfiVar.d && this.e == jfiVar.e && this.f == jfiVar.f && this.g == jfiVar.g && this.h == jfiVar.h && this.i == jfiVar.i && this.j == jfiVar.j && cqk.d(this.k, jfiVar.k) && cqk.d(this.l, jfiVar.l) && this.m == jfiVar.m && this.n == jfiVar.n;
    }

    public final long f() {
        return this.n;
    }

    public final Boolean g() {
        return this.l;
    }

    public final int h() {
        return this.g;
    }

    public final int hashCode() {
        int iHashCode = (this.j.hashCode() + ((this.i.hashCode() + qt4.g(zo5.c(this.g, qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h)) * 31)) * 31;
        Long l = this.k;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.l;
        return Long.hashCode(this.n) + qt4.g((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.m);
    }

    public final long i() {
        return this.b;
    }

    public final wja j() {
        return this.j;
    }

    public final long k() {
        return this.d;
    }

    public final long l() {
        return this.e;
    }

    public final Long m() {
        return this.k;
    }

    public final long n() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "UpdateMessageDbEntity(id=", ", serverId=");
        sbS.append(this.b);
        qt4.z(this.c, ", cid=", ", time=", sbS);
        sbS.append(this.d);
        qt4.z(this.e, ", timeLocal=", ", viewTime=", sbS);
        c0a.w(sbS, this.f, ", options=", this.g);
        qt4.z(this.h, ", liveUntil=", ", deliveryStatus=", sbS);
        sbS.append(this.i);
        sbS.append(", status=");
        sbS.append(this.j);
        sbS.append(", timeToFire=");
        sbS.append(this.k);
        sbS.append(", notifySender=");
        sbS.append(this.l);
        sbS.append(", messageLinkOutChatId=");
        sbS.append(this.m);
        return zo5.k(this.n, ", messageLinkOutMessageId=", ")", sbS);
    }
}
