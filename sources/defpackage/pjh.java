package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pjh {
    public final long a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final String k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final ns5 o;
    public final long p;
    public final String q;

    public pjh(long j, String str, long j2, long j3, long j4, long j5, String str2, boolean z, boolean z2, long j6, String str3, int i, boolean z3, boolean z4, ns5 ns5Var, String str4) {
        long jHashCode = (31 * j) + ((long) str.hashCode());
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = str2;
        this.h = z;
        this.i = z2;
        this.j = j6;
        this.k = str3;
        this.l = i;
        this.m = z3;
        this.n = z4;
        this.o = ns5Var;
        this.p = jHashCode;
        this.q = str4;
    }

    public final long a() {
        return this.a;
    }

    public final boolean b() {
        return this.c > 0 || this.d > 0 || this.e > 0 || this.j > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjh)) {
            return false;
        }
        pjh pjhVar = (pjh) obj;
        return this.a == pjhVar.a && cqk.d(this.b, pjhVar.b) && this.c == pjhVar.c && this.d == pjhVar.d && this.e == pjhVar.e && this.f == pjhVar.f && cqk.d(this.g, pjhVar.g) && this.h == pjhVar.h && this.i == pjhVar.i && this.j == pjhVar.j && cqk.d(this.k, pjhVar.k) && this.l == pjhVar.l && this.m == pjhVar.m && this.n == pjhVar.n && this.o == pjhVar.o && this.p == pjhVar.p && cqk.d(this.q, pjhVar.q);
    }

    public final int hashCode() {
        int iG = qt4.g((this.o.hashCode() + nbh.n(nbh.n(zo5.c(this.l, zo5.d(qt4.g(nbh.n(nbh.n(zo5.d(qt4.g(qt4.g(qt4.g(qt4.g(zo5.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31), 31, this.m), 31, this.n)) * 31, 31, this.p);
        String str = this.q;
        return iG + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        boolean zC = gm0.c();
        String str = zC ? this.g : "******";
        String str2 = zC ? this.k : "******";
        StringBuilder sbT = qt4.t(this.a, "TaskAttachDownloadData{messageId=", ", attachId='", this.b);
        qt4.z(this.c, "', videoId=", ", audioId=", sbT);
        sbT.append(this.d);
        qt4.z(this.e, ", mp4GifId=", ", stickerId=", sbT);
        qv1.s(this.f, ", url='", str, sbT);
        qv1.v("', notifyProgress=", ", checkAutoLoadConnection=", sbT, this.h, this.i);
        qt4.z(this.j, ", fileId=", ", fileName='", sbT);
        sbT.append(str2);
        sbT.append("', invalidateCount=");
        sbT.append(this.l);
        sbT.append(", useOriginalExtension=");
        qt4.B(", notCopyVideoToGallery=", ", place=", sbT, this.m, this.n);
        sbT.append(this.o);
        sbT.append(", failover='");
        sbT.append(this.q);
        sbT.append("'}");
        return sbT.toString();
    }
}
