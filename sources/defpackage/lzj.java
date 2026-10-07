package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lzj {
    public final String a;
    public final kyj b;
    public final d25 c;
    public final long d;
    public final long e;
    public final long f;
    public final kg4 g;
    public final int h;
    public final rn0 i;
    public final long j;
    public final long k;
    public final int l;
    public final int m;
    public final long n;
    public final int o;
    public final List p;
    public final List q;

    public lzj(String str, kyj kyjVar, d25 d25Var, long j, long j2, long j3, kg4 kg4Var, int i, rn0 rn0Var, long j4, long j5, int i2, int i3, long j6, int i4, List list, List list2) {
        this.a = str;
        this.b = kyjVar;
        this.c = d25Var;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = kg4Var;
        this.h = i;
        this.i = rn0Var;
        this.j = j4;
        this.k = j5;
        this.l = i2;
        this.m = i3;
        this.n = j6;
        this.o = i4;
        this.p = list;
        this.q = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzj)) {
            return false;
        }
        lzj lzjVar = (lzj) obj;
        return cqk.d(this.a, lzjVar.a) && this.b == lzjVar.b && cqk.d(this.c, lzjVar.c) && this.d == lzjVar.d && this.e == lzjVar.e && this.f == lzjVar.f && this.g.equals(lzjVar.g) && this.h == lzjVar.h && this.i == lzjVar.i && this.j == lzjVar.j && this.k == lzjVar.k && this.l == lzjVar.l && this.m == lzjVar.m && this.n == lzjVar.n && this.o == lzjVar.o && this.p.equals(lzjVar.p) && this.q.equals(lzjVar.q);
    }

    public final int hashCode() {
        return this.q.hashCode() + qv1.c(zo5.c(this.o, qt4.g(zo5.c(this.m, zo5.c(this.l, qt4.g(qt4.g((this.i.hashCode() + zo5.c(this.h, (this.g.hashCode() + qt4.g(qt4.g(qt4.g((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31, 31)) * 31, 31, this.j), 31, this.k), 31), 31), 31, this.n), 31), 31, this.p);
    }

    public final String toString() {
        return "WorkInfoPojo(id=" + this.a + ", state=" + this.b + ", output=" + this.c + ", initialDelay=" + this.d + ", intervalDuration=" + this.e + ", flexDuration=" + this.f + ", constraints=" + this.g + ", runAttemptCount=" + this.h + ", backoffPolicy=" + this.i + ", backoffDelayDuration=" + this.j + ", lastEnqueueTime=" + this.k + ", periodCount=" + this.l + ", generation=" + this.m + ", nextScheduleTimeOverride=" + this.n + ", stopReason=" + this.o + ", tags=" + this.p + ", progress=" + this.q + ')';
    }
}
