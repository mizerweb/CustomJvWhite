package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gga {
    public final int A;
    public final int B;
    public final long C;
    public final int D;
    public final long E;
    public final List F;
    public final kja G;
    public final Long H;
    public final Boolean I;
    public final long J;
    public final int K;
    public final int L;
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final xfa h;
    public final wja i;
    public final boolean j;
    public final long k;
    public final String l;
    public final String m;
    public final c46 n;
    public final int o;
    public final boolean p;
    public final int q;
    public final long r;
    public final boolean s;
    public final long t;
    public final String u;
    public final String v;
    public final String w;
    public final long x;
    public final long y;
    public final long z;

    public gga(long j, long j2, long j3, long j4, long j5, long j6, String str, xfa xfaVar, wja wjaVar, boolean z, long j7, String str2, String str3, c46 c46Var, int i, boolean z2, int i2, long j8, boolean z3, long j9, String str4, String str5, String str6, int i3, long j10, long j11, int i4, long j12, int i5, int i6, long j13, int i7, long j14, List list, kja kjaVar, Long l, Boolean bool, long j15) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = str;
        this.h = xfaVar;
        this.i = wjaVar;
        this.j = z;
        this.k = j7;
        this.l = str2;
        this.m = str3;
        this.n = c46Var;
        this.o = i;
        this.p = z2;
        this.q = i2;
        this.r = j8;
        this.s = z3;
        this.t = j9;
        this.u = str4;
        this.v = str5;
        this.w = str6;
        this.K = i3;
        this.x = j10;
        this.y = j11;
        this.L = i4;
        this.z = j12;
        this.A = i5;
        this.B = i6;
        this.C = j13;
        this.D = i7;
        this.E = j14;
        this.F = list;
        this.G = kjaVar;
        this.H = l;
        this.I = bool;
        this.J = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gga)) {
            return false;
        }
        gga ggaVar = (gga) obj;
        return this.a == ggaVar.a && this.b == ggaVar.b && this.c == ggaVar.c && this.d == ggaVar.d && this.e == ggaVar.e && this.f == ggaVar.f && cqk.d(this.g, ggaVar.g) && this.h == ggaVar.h && this.i == ggaVar.i && this.j == ggaVar.j && this.k == ggaVar.k && cqk.d(this.l, ggaVar.l) && cqk.d(this.m, ggaVar.m) && cqk.d(this.n, ggaVar.n) && this.o == ggaVar.o && this.p == ggaVar.p && this.q == ggaVar.q && this.r == ggaVar.r && this.s == ggaVar.s && this.t == ggaVar.t && cqk.d(this.u, ggaVar.u) && cqk.d(this.v, ggaVar.v) && cqk.d(this.w, ggaVar.w) && this.K == ggaVar.K && this.x == ggaVar.x && this.y == ggaVar.y && this.L == ggaVar.L && this.z == ggaVar.z && this.A == ggaVar.A && this.B == ggaVar.B && this.C == ggaVar.C && this.D == ggaVar.D && this.E == ggaVar.E && cqk.d(this.F, ggaVar.F) && cqk.d(this.G, ggaVar.G) && cqk.d(this.H, ggaVar.H) && cqk.d(this.I, ggaVar.I) && this.J == ggaVar.J;
    }

    public final int hashCode() {
        int iG = qt4.g(qt4.g(qt4.g(qt4.g(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        int iG2 = qt4.g(nbh.n((this.i.hashCode() + ((this.h.hashCode() + ((iG + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.j), 31, this.k);
        String str2 = this.l;
        int iHashCode = (iG2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.m;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        c46 c46Var = this.n;
        int iG3 = qt4.g(nbh.n(qt4.g(zo5.c(this.q, nbh.n(zo5.c(this.o, (iHashCode2 + (c46Var == null ? 0 : c46Var.hashCode())) * 31, 31), 31, this.p), 31), 31, this.r), 31, this.s), 31, this.t);
        String str4 = this.u;
        int iHashCode3 = (iG3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.v;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.w;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        int i = this.K;
        int iC = qv1.c(qt4.g(zo5.c(this.D, qt4.g(zo5.c(this.B, zo5.c(this.A, qt4.g(c0a.f(this.L, qt4.g(qt4.g((iHashCode5 + (i == 0 ? 0 : qt4.D(i))) * 31, 31, this.x), 31, this.y), 31), 31, this.z), 31), 31), 31, this.C), 31), 31, this.E), 31, this.F);
        kja kjaVar = this.G;
        int iHashCode6 = (iC + (kjaVar == null ? 0 : kjaVar.hashCode())) * 31;
        Long l = this.H;
        int iHashCode7 = (iHashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.I;
        return Long.hashCode(this.J) + ((iHashCode7 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "MessageEntity(id=", ", serverId=");
        sbS.append(this.b);
        qt4.z(this.c, ", time=", ", updateTime=", sbS);
        sbS.append(this.d);
        qt4.z(this.e, ", sender=", ", cid=", sbS);
        qv1.s(this.f, ", text=", this.g, sbS);
        sbS.append(", deliveryStatus=");
        sbS.append(this.h);
        sbS.append(", status=");
        sbS.append(this.i);
        sbS.append(", statusInProcess=");
        sbS.append(this.j);
        sbS.append(", timeLocal=");
        qv1.s(this.k, ", error=", this.l, sbS);
        sbS.append(", localizedError=");
        sbS.append(this.m);
        sbS.append(", attaches=");
        sbS.append(this.n);
        sbS.append(", mediaType=");
        sbS.append(this.o);
        sbS.append(", detectShare=");
        sbS.append(this.p);
        sbS.append(", messagesLinkType=");
        sbS.append(this.q);
        sbS.append(", messagesLinkId=");
        sbS.append(this.r);
        sbS.append(", insertedFromMessageLink=");
        sbS.append(this.s);
        qt4.z(this.t, ", messagesLinkChatId=", ", messageLinkChatName=", sbS);
        nbh.G(sbS, this.u, ", messageLinkChatLink=", this.v, ", messageLinkChatIconUrl=");
        sbS.append(this.w);
        sbS.append(", messageLinkChatAccessType=");
        sbS.append(tt2.j(this.K));
        sbS.append(", messageLinkOutChatId=");
        sbS.append(this.x);
        qt4.z(this.y, ", messageLinkOutMessageId=", ", type=", sbS);
        sbS.append(r5a.m(this.L));
        sbS.append(", chatId=");
        sbS.append(this.z);
        zo5.C(this.A, this.B, ", channelViews=", ", channelForwards=", sbS);
        qt4.z(this.C, ", viewTime=", ", options=", sbS);
        c0a.v(sbS, this.D, ", liveUntil=", this.E);
        sbS.append(", elements=");
        sbS.append(this.F);
        sbS.append(", reactions=");
        sbS.append(this.G);
        sbS.append(", timeToFire=");
        sbS.append(this.H);
        sbS.append(", notifySender=");
        sbS.append(this.I);
        return zo5.k(this.J, ", reactionsUpdateTime=", ")", sbS);
    }

    public /* synthetic */ gga(long j, long j2, long j3, long j4, long j5, long j6, String str, xfa xfaVar, wja wjaVar, long j7, c46 c46Var, int i, boolean z, int i2, long j8, boolean z2, long j9, String str2, String str3, String str4, int i3, long j10, long j11, int i4, long j12, int i5, int i6, long j13, int i7, long j14, List list, kja kjaVar, Long l, Boolean bool, long j15) {
        this(j, j2, j3, j4, j5, j6, str, xfaVar, wjaVar, false, j7, null, null, c46Var, i, z, i2, j8, z2, j9, str2, str3, str4, i3, j10, j11, i4, j12, i5, i6, j13, i7, j14, list, kjaVar, l, bool, j15);
    }
}
