package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class od6 {
    public final String a;
    public final int b;
    public final int c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final boolean i;

    public /* synthetic */ od6(String str, int i, int i2, long j, boolean z, boolean z2, int i3, boolean z3, boolean z4, int i4) {
        this(str, i, i2, (i4 & 8) != 0 ? 0L : j, z, (i4 & 32) != 0 ? false : z2, (i4 & 64) != 0 ? 5 : i3, z3, z4);
    }

    public static od6 a(od6 od6Var, String str, int i) {
        return new od6(str, od6Var.b, od6Var.c, od6Var.d, od6Var.e, od6Var.f, od6Var.g, (i & np0.m) != 0 ? od6Var.h : true, od6Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od6)) {
            return false;
        }
        od6 od6Var = (od6) obj;
        return cqk.d(this.a, od6Var.a) && this.b == od6Var.b && this.c == od6Var.c && this.d == od6Var.d && this.e == od6Var.e && this.f == od6Var.f && this.g == od6Var.g && this.h == od6Var.h && this.i == od6Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + nbh.n(zo5.c(this.g, nbh.n(nbh.n(qt4.g(zo5.c(this.c, zo5.c(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbR = c0a.r(this.b, "ExecutorConfig(threadName=", this.a, ", corePoolSize=", ", maxPoolSize=");
        c0a.v(sbR, this.c, ", keepAliveTimeMs=", this.d);
        qv1.v(", allowCoreThreadTimeOut=", ", prestartCoreThreads=", sbR, this.e, this.f);
        sbR.append(", threadPriority=");
        sbR.append(this.g);
        sbR.append(", allowNetwork=");
        sbR.append(this.h);
        return nbh.z(sbR, ", allowDisk=", this.i, ")");
    }

    public od6(String str, int i, int i2, long j, boolean z, boolean z2, int i3, boolean z3, boolean z4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = z;
        this.f = z2;
        this.g = i3;
        this.h = z3;
        this.i = z4;
    }
}
