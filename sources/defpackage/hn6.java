package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hn6 {
    public final long a;
    public final ilb b;
    public final long c;
    public final int d;
    public final Long e;
    public final long f;
    public final Long g;
    public final String h;
    public final long i;
    public final long j;
    public final String k;
    public final long l;
    public final long m;

    public hn6(long j, ilb ilbVar, long j2, int i, Long l, long j3, Long l2, String str, long j4, long j5, String str2, long j6, long j7) {
        this.a = j;
        this.b = ilbVar;
        this.c = j2;
        this.d = i;
        this.e = l;
        this.f = j3;
        this.g = l2;
        this.h = str;
        this.i = j4;
        this.j = j5;
        this.k = str2;
        this.l = j6;
        this.m = j7;
    }

    public static hn6 a(hn6 hn6Var) {
        long j = hn6Var.a;
        ilb ilbVar = hn6Var.b;
        long j2 = hn6Var.c;
        Long l = hn6Var.e;
        long j3 = hn6Var.f;
        Long l2 = hn6Var.g;
        String str = hn6Var.h;
        long j4 = hn6Var.i;
        long j5 = hn6Var.j;
        String str2 = hn6Var.k;
        long j6 = hn6Var.l;
        long j7 = hn6Var.m;
        hn6Var.getClass();
        return new hn6(j, ilbVar, j2, 3, l, j3, l2, str, j4, j5, str2, j6, j7);
    }

    public final int b() {
        return this.d;
    }

    public final ilb c() {
        return this.b;
    }

    public final long d() {
        return this.f;
    }

    public final long e() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn6)) {
            return false;
        }
        hn6 hn6Var = (hn6) obj;
        return this.a == hn6Var.a && this.b.equals(hn6Var.b) && this.c == hn6Var.c && this.d == hn6Var.d && cqk.d(this.e, hn6Var.e) && this.f == hn6Var.f && cqk.d(this.g, hn6Var.g) && cqk.d(this.h, hn6Var.h) && this.i == hn6Var.i && this.j == hn6Var.j && cqk.d(this.k, hn6Var.k) && this.l == hn6Var.l && this.m == hn6Var.m;
    }

    public final String f() {
        return this.h;
    }

    public final long g() {
        return this.i;
    }

    public final long h() {
        return this.c;
    }

    public final int hashCode() {
        int iF = c0a.f(this.d, qt4.g((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31, this.c), 31);
        Long l = this.e;
        int iG = qt4.g((iF + (l == null ? 0 : l.hashCode())) * 31, 31, this.f);
        Long l2 = this.g;
        int iHashCode = (iG + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.h;
        return Long.hashCode(this.m) + qt4.g(zo5.d(qt4.g(qt4.g((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final long i() {
        return this.a;
    }

    public final String j() {
        return this.k;
    }

    public final long k() {
        return this.j;
    }

    public final Long l() {
        return this.e;
    }

    public final Long m() {
        return this.g;
    }

    public final long n() {
        return this.l;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("FcmAnalyticsEntryDb(pushId=");
        sb.append(this.a);
        sb.append(", chatRef=");
        sb.append(this.b);
        qt4.z(this.c, ", messageId=", ", analyticsStatus=", sb);
        int i = this.d;
        if (i == 1) {
            str = "UNDEFINED";
        } else if (i != 2) {
            str = i != 3 ? "null" : "SENT";
        } else {
            str = "NOT_SENT";
        }
        sb.append(str);
        sb.append(", senderUserId=");
        sb.append(this.e);
        sb.append(", contentLength=");
        sb.append(this.f);
        sb.append(", sentTime=");
        sb.append(this.g);
        p.j(sb, ", eventKey=", this.h, ", fcmSentTime=");
        sb.append(this.i);
        qt4.z(this.j, ", receivedTime=", ", pushType=", sb);
        sb.append(this.k);
        sb.append(", time=");
        sb.append(this.l);
        return zo5.k(this.m, ", createdTime=", ")", sb);
    }
}
