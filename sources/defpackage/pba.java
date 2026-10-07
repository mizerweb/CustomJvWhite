package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pba {
    public final long a;
    public final oba b;
    public final nba c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final List i;
    public final long j;
    public final int k;
    public final int l;
    public final long m;

    public pba(long j, oba obaVar, nba nbaVar, int i, boolean z, int i2, int i3, int i4, List list, long j2, int i5, int i6, long j3) {
        this.a = j;
        this.b = obaVar;
        this.c = nbaVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = list;
        this.j = j2;
        this.k = i5;
        this.l = i6;
        this.m = j3;
    }

    public final int a() {
        return this.f;
    }

    public final List b() {
        return this.i;
    }

    public final long c() {
        return this.m;
    }

    public final int d() {
        return this.k;
    }

    public final int e() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pba) {
            pba pbaVar = (pba) obj;
            if (this.a == pbaVar.a && this.b == pbaVar.b && this.c.equals(pbaVar.c) && this.d == pbaVar.d && this.e == pbaVar.e && this.f == pbaVar.f && this.g == pbaVar.g && this.h == pbaVar.h && this.i.equals(pbaVar.i) && this.j == pbaVar.j && this.k == pbaVar.k && this.l == pbaVar.l && this.m == pbaVar.m) {
                return true;
            }
        }
        return false;
    }

    public final long f() {
        return this.j;
    }

    public final nba g() {
        return this.c;
    }

    public final oba h() {
        return this.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + zo5.c(this.l, zo5.c(this.k, qt4.g(qv1.c(zo5.c(this.h, zo5.c(this.g, zo5.c(this.f, nbh.n(zo5.c(this.d, (this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31, 31), 31, this.e), 31), 31), 31), 31, this.i), 31, this.j), 31), 31);
    }

    public final int i() {
        return this.g;
    }

    public final int j() {
        return this.h;
    }

    public final long k() {
        return this.a;
    }

    public final int l() {
        return this.d;
    }

    public final boolean m() {
        return this.e;
    }

    public final String toString() {
        String strB = tid.b(this.j);
        StringBuilder sb = new StringBuilder("MemorySnapshot:\n            |sliceTime=");
        sb.append(this.a);
        sb.append("\n            |reason=");
        sb.append(this.b);
        sb.append("\n            |pss=");
        sb.append(this.c);
        sb.append("\n            |trimLevel=");
        sb.append(this.d);
        sb.append("\n            |isLowMemory=");
        sb.append(this.e);
        sb.append("\n            |availableMemory=");
        sb.append(this.f);
        zo5.C(this.g, this.h, "\n            |rss=", "\n            |shared=", sb);
        sb.append("\n            |backstack=");
        sb.append(this.i);
        sb.append("\n            |processes=");
        sb.append(strB);
        zo5.C(this.k, this.l, "\n            |importance=", "\n            |nativeHeapAllocated=", sb);
        sb.append("\n            |gcCount=");
        sb.append(this.m);
        sb.append("\n        ");
        return s5h.y0(sb.toString());
    }
}
