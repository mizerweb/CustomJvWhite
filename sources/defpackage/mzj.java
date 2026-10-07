package defpackage;

import androidx.work.OverwritingInputMerger;
import androidx.work.WorkRequest;

/* JADX INFO: loaded from: classes.dex */
public final class mzj {
    public final String a;
    public kyj b;
    public final String c;
    public final String d;
    public d25 e;
    public final d25 f;
    public long g;
    public long h;
    public long i;
    public kg4 j;
    public int k;
    public rn0 l;
    public long m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public yic r;
    public final int s;
    public final int t;
    public long u;
    public int v;
    public final int w;
    public String x;
    public Boolean y;
    public static final String z = n1g.Z("WorkSpec");
    public static final ore A = new ore(14);

    public /* synthetic */ mzj(String str, kyj kyjVar, String str2, String str3, d25 d25Var, d25 d25Var2, long j, long j2, long j3, kg4 kg4Var, int i, rn0 rn0Var, long j4, long j5, long j6, long j7, boolean z2, yic yicVar, int i2, long j8, int i3, int i4, String str4, Boolean bool, int i5) {
        this(str, (i5 & 2) != 0 ? kyj.a : kyjVar, str2, (i5 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i5 & 16) != 0 ? d25.b : d25Var, (i5 & 32) != 0 ? d25.b : d25Var2, (i5 & 64) != 0 ? 0L : j, (i5 & np0.m) != 0 ? 0L : j2, (i5 & np0.n) != 0 ? 0L : j3, (i5 & np0.o) != 0 ? kg4.j : kg4Var, (i5 & 1024) != 0 ? 0 : i, (i5 & np0.q) != 0 ? rn0.a : rn0Var, (i5 & np0.r) != 0 ? WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS : j4, (i5 & 8192) != 0 ? -1L : j5, (i5 & 16384) == 0 ? j6 : 0L, (32768 & i5) != 0 ? -1L : j7, (65536 & i5) != 0 ? false : z2, (131072 & i5) != 0 ? yic.a : yicVar, (262144 & i5) != 0 ? 0 : i2, 0, (1048576 & i5) != 0 ? Long.MAX_VALUE : j8, (2097152 & i5) != 0 ? 0 : i3, (4194304 & i5) != 0 ? -256 : i4, (8388608 & i5) != 0 ? null : str4, (i5 & 16777216) != 0 ? Boolean.FALSE : bool);
    }

    public static mzj b(mzj mzjVar, String str, kyj kyjVar, d25 d25Var, int i, long j, int i2, int i3, long j2, int i4, int i5) {
        String str2 = (i5 & 1) != 0 ? mzjVar.a : str;
        kyj kyjVar2 = (i5 & 2) != 0 ? mzjVar.b : kyjVar;
        String str3 = (i5 & 4) != 0 ? mzjVar.c : "androidx.work.multiprocess.RemoteListenableDelegatingWorker";
        String str4 = mzjVar.d;
        d25 d25Var2 = (i5 & 16) != 0 ? mzjVar.e : d25Var;
        d25 d25Var3 = mzjVar.f;
        long j3 = mzjVar.g;
        long j4 = mzjVar.h;
        long j5 = mzjVar.i;
        kg4 kg4Var = mzjVar.j;
        int i6 = (i5 & 1024) != 0 ? mzjVar.k : i;
        rn0 rn0Var = mzjVar.l;
        long j6 = mzjVar.m;
        long j7 = (i5 & 8192) != 0 ? mzjVar.n : j;
        long j8 = mzjVar.o;
        long j9 = mzjVar.p;
        boolean z2 = mzjVar.q;
        yic yicVar = mzjVar.r;
        int i7 = (i5 & 262144) != 0 ? mzjVar.s : i2;
        int i8 = (i5 & 524288) != 0 ? mzjVar.t : i3;
        long j10 = (i5 & 1048576) != 0 ? mzjVar.u : j2;
        int i9 = (i5 & 2097152) != 0 ? mzjVar.v : i4;
        int i10 = mzjVar.w;
        String str5 = mzjVar.x;
        Boolean bool = mzjVar.y;
        mzjVar.getClass();
        return new mzj(str2, kyjVar2, str3, str4, d25Var2, d25Var3, j3, j4, j5, kg4Var, i6, rn0Var, j6, j7, j8, j9, z2, yicVar, i7, i8, j10, i9, i10, str5, bool);
    }

    public final long a() {
        return sb8.g(this.b == kyj.a && this.k > 0, this.k, this.l, this.m, this.n, this.s, c(), this.g, this.i, this.h, this.u);
    }

    public final boolean c() {
        return this.h != 0;
    }

    public final void d(long j) {
        String str = z;
        if (j > WorkRequest.MAX_BACKOFF_MILLIS) {
            n1g.x().j0(str, "Backoff delay duration exceeds maximum value");
        }
        if (j < 10000) {
            n1g.x().j0(str, "Backoff delay duration less than minimum value");
        }
        this.m = oc9.x(j, 10000L, WorkRequest.MAX_BACKOFF_MILLIS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzj)) {
            return false;
        }
        mzj mzjVar = (mzj) obj;
        return cqk.d(this.a, mzjVar.a) && this.b == mzjVar.b && cqk.d(this.c, mzjVar.c) && cqk.d(this.d, mzjVar.d) && cqk.d(this.e, mzjVar.e) && cqk.d(this.f, mzjVar.f) && this.g == mzjVar.g && this.h == mzjVar.h && this.i == mzjVar.i && cqk.d(this.j, mzjVar.j) && this.k == mzjVar.k && this.l == mzjVar.l && this.m == mzjVar.m && this.n == mzjVar.n && this.o == mzjVar.o && this.p == mzjVar.p && this.q == mzjVar.q && this.r == mzjVar.r && this.s == mzjVar.s && this.t == mzjVar.t && this.u == mzjVar.u && this.v == mzjVar.v && this.w == mzjVar.w && cqk.d(this.x, mzjVar.x) && cqk.d(this.y, mzjVar.y);
    }

    public final int hashCode() {
        int iC = zo5.c(this.w, zo5.c(this.v, qt4.g(zo5.c(this.t, zo5.c(this.s, (this.r.hashCode() + nbh.n(qt4.g(qt4.g(qt4.g(qt4.g((this.l.hashCode() + zo5.c(this.k, (this.j.hashCode() + qt4.g(qt4.g(qt4.g((this.f.hashCode() + ((this.e.hashCode() + zo5.d(zo5.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31, 31)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q)) * 31, 31), 31), 31, this.u), 31), 31);
        String str = this.x;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.y;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return x05.i(new StringBuilder("{WorkSpec: "), this.a, '}');
    }

    public mzj(String str, kyj kyjVar, String str2, String str3, d25 d25Var, d25 d25Var2, long j, long j2, long j3, kg4 kg4Var, int i, rn0 rn0Var, long j4, long j5, long j6, long j7, boolean z2, yic yicVar, int i2, int i3, long j8, int i4, int i5, String str4, Boolean bool) {
        this.a = str;
        this.b = kyjVar;
        this.c = str2;
        this.d = str3;
        this.e = d25Var;
        this.f = d25Var2;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = kg4Var;
        this.k = i;
        this.l = rn0Var;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.p = j7;
        this.q = z2;
        this.r = yicVar;
        this.s = i2;
        this.t = i3;
        this.u = j8;
        this.v = i4;
        this.w = i5;
        this.x = str4;
        this.y = bool;
    }
}
