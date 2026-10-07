package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class dz3 {
    public final long a;
    public final long b;
    public final long c;
    public final q24 d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final List i;
    public final kja j;
    public final int k;
    public final int l;
    public final long m;
    public final boolean n;
    public final wja o;
    public final int p;

    public dz3(long j, long j2, long j3, q24 q24Var, long j4, long j5, long j6, String str, List list, kja kjaVar, int i, int i2, long j7, boolean z, wja wjaVar, int i3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = q24Var;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = str;
        this.i = list;
        this.j = kjaVar;
        this.k = i;
        this.l = i2;
        this.m = j7;
        this.n = z;
        this.o = wjaVar;
        this.p = i3;
    }

    public static dz3 a(dz3 dz3Var, long j, long j2, q24 q24Var, long j3, String str, kja kjaVar, int i, long j4, boolean z) {
        long j5 = dz3Var.c;
        long j6 = dz3Var.e;
        long j7 = dz3Var.f;
        List list = dz3Var.i;
        int i2 = dz3Var.k;
        wja wjaVar = dz3Var.o;
        int i3 = dz3Var.p;
        dz3Var.getClass();
        return new dz3(j, j2, j5, q24Var, j6, j7, j3, str, list, kjaVar, i2, i, j4, z, wjaVar, i3);
    }

    public final long b() {
        return this.g;
    }

    public final boolean c() {
        return this.n;
    }

    public final long d() {
        return this.m;
    }

    public final int e() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz3)) {
            return false;
        }
        dz3 dz3Var = (dz3) obj;
        return this.a == dz3Var.a && this.b == dz3Var.b && this.c == dz3Var.c && cqk.d(this.d, dz3Var.d) && this.e == dz3Var.e && this.f == dz3Var.f && this.g == dz3Var.g && cqk.d(this.h, dz3Var.h) && this.i.equals(dz3Var.i) && cqk.d(this.j, dz3Var.j) && this.k == dz3Var.k && this.l == dz3Var.l && this.m == dz3Var.m && this.n == dz3Var.n && this.o == dz3Var.o && this.p == dz3Var.p;
    }

    public final kja f() {
        return this.j;
    }

    public final long g() {
        return this.b;
    }

    public final String h() {
        return this.h;
    }

    public final int hashCode() {
        int iG = qt4.g(qt4.g(qt4.g((this.d.hashCode() + qt4.g(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        int iC = qv1.c((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.i);
        kja kjaVar = this.j;
        return Integer.hashCode(this.p) + ((this.o.hashCode() + nbh.n(qt4.g(zo5.c(this.l, c0a.f(this.k, (iC + (kjaVar != null ? kjaVar.hashCode() : 0)) * 31, 31), 31), 31, this.m), 31, this.n)) * 31);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "CommentPartEntity(id=", ", serverId=");
        sbS.append(this.b);
        qt4.z(this.c, ", time=", ", commentsId=", sbS);
        sbS.append(this.d);
        sbS.append(", updateTime=");
        sbS.append(this.e);
        qt4.z(this.f, ", sender=", ", cid=", sbS);
        qv1.s(this.g, ", text=", this.h, sbS);
        sbS.append(", elements=");
        sbS.append(this.i);
        sbS.append(", reactions=");
        sbS.append(this.j);
        sbS.append(", messageType=");
        sbS.append(r5a.m(this.k));
        sbS.append(", messagesLinkType=");
        sbS.append(this.l);
        qt4.z(this.m, ", messagesLinkId=", ", insertedFromMessageLink=", sbS);
        sbS.append(this.n);
        sbS.append(", status=");
        sbS.append(this.o);
        sbS.append(", options=");
        return zo5.t(sbS, this.p, ")");
    }
}
