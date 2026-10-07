package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zia {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final List i;
    public final kja j;
    public final int k;
    public final long l;
    public final boolean m;
    public final long n;
    public final String o;
    public final String p;
    public final String q;
    public final int r;
    public final wja s;
    public final int t;
    public final long u;
    public final int v;
    public final long w;
    public final Long x;
    public final Boolean y;

    public zia(long j, long j2, long j3, long j4, long j5, long j6, long j7, String str, List list, kja kjaVar, int i, long j8, boolean z, long j9, String str2, String str3, String str4, int i2, wja wjaVar, int i3, long j10, int i4, long j11, Long l, Boolean bool) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = str;
        this.i = list;
        this.j = kjaVar;
        this.k = i;
        this.l = j8;
        this.m = z;
        this.n = j9;
        this.o = str2;
        this.p = str3;
        this.q = str4;
        this.r = i2;
        this.s = wjaVar;
        this.t = i3;
        this.u = j10;
        this.v = i4;
        this.w = j11;
        this.x = l;
        this.y = bool;
    }

    public static zia a(zia ziaVar, long j, long j2, long j3, long j4, String str, kja kjaVar, int i, long j5, boolean z, long j6, String str2, String str3, String str4, int i2, int i3) {
        return new zia((i3 & 1) != 0 ? ziaVar.a : j, (i3 & 2) != 0 ? ziaVar.b : j2, ziaVar.c, (i3 & 8) != 0 ? ziaVar.d : j3, ziaVar.e, ziaVar.f, (i3 & 64) != 0 ? ziaVar.g : j4, (i3 & np0.m) != 0 ? ziaVar.h : str, ziaVar.i, (i3 & np0.o) != 0 ? ziaVar.j : kjaVar, (i3 & 1024) != 0 ? ziaVar.k : i, j5, (i3 & np0.r) != 0 ? ziaVar.m : z, (i3 & 8192) != 0 ? ziaVar.n : j6, (i3 & 16384) != 0 ? ziaVar.o : str2, (32768 & i3) != 0 ? ziaVar.p : str3, (65536 & i3) != 0 ? ziaVar.q : str4, (i3 & 131072) != 0 ? ziaVar.r : i2, ziaVar.s, ziaVar.t, ziaVar.u, ziaVar.v, ziaVar.w, ziaVar.x, ziaVar.y);
    }

    public final long b() {
        return this.d;
    }

    public final long c() {
        return this.g;
    }

    public final List d() {
        return this.i;
    }

    public final long e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zia)) {
            return false;
        }
        zia ziaVar = (zia) obj;
        return this.a == ziaVar.a && this.b == ziaVar.b && this.c == ziaVar.c && this.d == ziaVar.d && this.e == ziaVar.e && this.f == ziaVar.f && this.g == ziaVar.g && cqk.d(this.h, ziaVar.h) && this.i.equals(ziaVar.i) && cqk.d(this.j, ziaVar.j) && this.k == ziaVar.k && this.l == ziaVar.l && this.m == ziaVar.m && this.n == ziaVar.n && cqk.d(this.o, ziaVar.o) && cqk.d(this.p, ziaVar.p) && cqk.d(this.q, ziaVar.q) && this.r == ziaVar.r && this.s == ziaVar.s && this.t == ziaVar.t && this.u == ziaVar.u && this.v == ziaVar.v && this.w == ziaVar.w && cqk.d(this.x, ziaVar.x) && cqk.d(this.y, ziaVar.y);
    }

    public final boolean f() {
        return this.m;
    }

    public final long g() {
        return this.w;
    }

    public final int h() {
        return this.r;
    }

    public final int hashCode() {
        int iG = qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        int iC = qv1.c((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.i);
        kja kjaVar = this.j;
        int iG2 = qt4.g(nbh.n(qt4.g(zo5.c(this.k, (iC + (kjaVar == null ? 0 : kjaVar.hashCode())) * 31, 31), 31, this.l), 31, this.m), 31, this.n);
        String str2 = this.o;
        int iHashCode = (iG2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.p;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.q;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        int i = this.r;
        int iG3 = qt4.g(zo5.c(this.v, qt4.g(c0a.f(this.t, (this.s.hashCode() + ((iHashCode3 + (i == 0 ? 0 : qt4.D(i))) * 31)) * 31, 31), 31, this.u), 31), 31, this.w);
        Long l = this.x;
        int iHashCode4 = (iG3 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.y;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String i() {
        return this.q;
    }

    public final String j() {
        return this.p;
    }

    public final String k() {
        return this.o;
    }

    public final long l() {
        return this.n;
    }

    public final long m() {
        return this.l;
    }

    public final int n() {
        return this.k;
    }

    public final Boolean o() {
        return this.y;
    }

    public final int p() {
        return this.v;
    }

    public final kja q() {
        return this.j;
    }

    public final long r() {
        return this.f;
    }

    public final long s() {
        return this.b;
    }

    public final wja t() {
        return this.s;
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "MessagePartEntity(id=", ", serverId=");
        sbS.append(this.b);
        qt4.z(this.c, ", time=", ", chatId=", sbS);
        sbS.append(this.d);
        qt4.z(this.e, ", updateTime=", ", sender=", sbS);
        sbS.append(this.f);
        qt4.z(this.g, ", cid=", ", text=", sbS);
        sbS.append(this.h);
        sbS.append(", elements=");
        sbS.append(this.i);
        sbS.append(", reactions=");
        sbS.append(this.j);
        sbS.append(", messagesLinkType=");
        sbS.append(this.k);
        sbS.append(", messagesLinkId=");
        sbS.append(this.l);
        sbS.append(", insertedFromMessageLink=");
        sbS.append(this.m);
        qt4.z(this.n, ", messagesLinkChatId=", ", messageLinkChatName=", sbS);
        nbh.G(sbS, this.o, ", messageLinkChatLink=", this.p, ", messageLinkChatIconUrl=");
        sbS.append(this.q);
        sbS.append(", messageLinkChatAccessType=");
        sbS.append(tt2.j(this.r));
        sbS.append(", status=");
        sbS.append(this.s);
        sbS.append(", type=");
        sbS.append(r5a.m(this.t));
        sbS.append(", viewTime=");
        c0a.w(sbS, this.u, ", options=", this.v);
        qt4.z(this.w, ", liveUntil=", ", timeToFire=", sbS);
        sbS.append(this.x);
        sbS.append(", notifySender=");
        sbS.append(this.y);
        sbS.append(")");
        return sbS.toString();
    }

    public final String u() {
        return this.h;
    }

    public final long v() {
        return this.c;
    }

    public final Long w() {
        return this.x;
    }

    public final int x() {
        return this.t;
    }

    public final long y() {
        return this.e;
    }

    public final long z() {
        return this.u;
    }
}
