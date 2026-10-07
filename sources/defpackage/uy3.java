package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class uy3 {
    public final kja A;
    public final long B;
    public final long a;
    public final q24 b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final xfa i;
    public final wja j;
    public final boolean k;
    public final long l;
    public final String m;
    public final String n;
    public final c46 o;
    public final int p;
    public final int q;
    public final boolean r;
    public final int s;
    public final long t;
    public final boolean u;
    public final long v;
    public final long w;
    public final long x;
    public final int y;
    public final List z;

    public uy3(long j, q24 q24Var, long j2, long j3, long j4, long j5, long j6, String str, xfa xfaVar, wja wjaVar, boolean z, long j7, String str2, String str3, c46 c46Var, int i, int i2, boolean z2, int i3, long j8, boolean z3, long j9, long j10, long j11, int i4, List list, kja kjaVar, long j12) {
        this.a = j;
        this.b = q24Var;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = str;
        this.i = xfaVar;
        this.j = wjaVar;
        this.k = z;
        this.l = j7;
        this.m = str2;
        this.n = str3;
        this.o = c46Var;
        this.p = i;
        this.q = i2;
        this.r = z2;
        this.s = i3;
        this.t = j8;
        this.u = z3;
        this.v = j9;
        this.w = j10;
        this.x = j11;
        this.y = i4;
        this.z = list;
        this.A = kjaVar;
        this.B = j12;
    }

    public final c46 a() {
        return this.o;
    }

    public final xfa b() {
        return this.i;
    }

    public final long c() {
        return this.a;
    }

    public final boolean d() {
        return this.u;
    }

    public final long e() {
        return this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy3)) {
            return false;
        }
        uy3 uy3Var = (uy3) obj;
        return this.a == uy3Var.a && cqk.d(this.b, uy3Var.b) && this.c == uy3Var.c && this.d == uy3Var.d && this.e == uy3Var.e && this.f == uy3Var.f && this.g == uy3Var.g && cqk.d(this.h, uy3Var.h) && this.i == uy3Var.i && this.j == uy3Var.j && this.k == uy3Var.k && this.l == uy3Var.l && cqk.d(this.m, uy3Var.m) && cqk.d(this.n, uy3Var.n) && cqk.d(this.o, uy3Var.o) && this.p == uy3Var.p && this.q == uy3Var.q && this.r == uy3Var.r && this.s == uy3Var.s && this.t == uy3Var.t && this.u == uy3Var.u && this.v == uy3Var.v && this.w == uy3Var.w && this.x == uy3Var.x && this.y == uy3Var.y && cqk.d(this.z, uy3Var.z) && cqk.d(this.A, uy3Var.A) && this.B == uy3Var.B;
    }

    public final int f() {
        return this.s;
    }

    public final kja g() {
        return this.A;
    }

    public final long h() {
        return this.c;
    }

    public final int hashCode() {
        int iG = qt4.g(qt4.g(qt4.g(qt4.g(qt4.g((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        int iG2 = qt4.g(nbh.n((this.j.hashCode() + ((this.i.hashCode() + ((iG + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.k), 31, this.l);
        String str2 = this.m;
        int iHashCode = (iG2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.n;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        c46 c46Var = this.o;
        int iC = qv1.c(zo5.c(this.y, qt4.g(qt4.g(qt4.g(nbh.n(qt4.g(zo5.c(this.s, nbh.n(c0a.f(this.q, zo5.c(this.p, (iHashCode2 + (c46Var == null ? 0 : c46Var.hashCode())) * 31, 31), 31), 31, this.r), 31), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31), 31, this.z);
        kja kjaVar = this.A;
        return Long.hashCode(this.B) + ((iC + (kjaVar != null ? kjaVar.hashCode() : 0)) * 31);
    }

    public final String i() {
        return this.h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommentEntity(id=");
        sb.append(this.a);
        sb.append(", commentsId=");
        sb.append(this.b);
        qt4.z(this.c, ", serverId=", ", time=", sb);
        sb.append(this.d);
        qt4.z(this.e, ", updateTime=", ", sender=", sb);
        sb.append(this.f);
        qt4.z(this.g, ", cid=", ", text=", sb);
        sb.append(this.h);
        sb.append(", deliveryStatus=");
        sb.append(this.i);
        sb.append(", status=");
        sb.append(this.j);
        sb.append(", statusInProcess=");
        sb.append(this.k);
        sb.append(", timeLocal=");
        qv1.s(this.l, ", error=", this.m, sb);
        sb.append(", localizedError=");
        sb.append(this.n);
        sb.append(", attaches=");
        sb.append(this.o);
        sb.append(", mediaType=");
        sb.append(this.p);
        sb.append(", messageType=");
        sb.append(r5a.m(this.q));
        sb.append(", detectShare=");
        sb.append(this.r);
        sb.append(", messagesLinkType=");
        sb.append(this.s);
        qt4.z(this.t, ", messagesLinkId=", ", insertedFromMessageLink=", sb);
        sb.append(this.u);
        sb.append(", messageLinkOutChatId=");
        sb.append(this.v);
        qt4.z(this.w, ", messageLinkOutPostId=", ", messageLinkOutMessageId=", sb);
        c0a.w(sb, this.x, ", options=", this.y);
        sb.append(", elements=");
        sb.append(this.z);
        sb.append(", reactions=");
        sb.append(this.A);
        return zo5.k(this.B, ", reactionsUpdateTime=", ")", sb);
    }

    public /* synthetic */ uy3(long j, q24 q24Var, long j2, long j3, long j4, long j5, long j6, String str, xfa xfaVar, wja wjaVar, long j7, c46 c46Var, int i, int i2, boolean z, int i3, long j8, boolean z2, long j9, long j10, long j11, int i4, List list, kja kjaVar, long j12) {
        this(j, q24Var, j2, j3, j4, j5, j6, str, xfaVar, wjaVar, false, j7, null, null, c46Var, i, i2, z, i3, j8, z2, j9, j10, j11, i4, list, kjaVar, j12);
    }
}
