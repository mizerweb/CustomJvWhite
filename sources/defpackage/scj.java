package defpackage;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class scj implements xbf {
    public final c70 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public scj(c70 c70Var, int i, long j, long j2) {
        this.a = c70Var;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / ((long) c70Var.c);
        this.d = j3;
        this.e = i(j3);
    }

    @Override // defpackage.xbf
    public final wbf d(long j) {
        c70 c70Var = this.a;
        long j2 = (((long) c70Var.b) * j) / (((long) this.b) * 1000000);
        long j3 = this.d - 1;
        long jK = vqi.k(j2, 0L, j3);
        int i = c70Var.c;
        long j4 = this.c;
        long jI = i(jK);
        zbf zbfVar = new zbf(jI, (((long) i) * jK) + j4);
        if (jI >= j || jK == j3) {
            return new wbf(zbfVar, zbfVar);
        }
        long j5 = jK + 1;
        return new wbf(zbfVar, new zbf(i(j5), (((long) i) * j5) + j4));
    }

    @Override // defpackage.xbf
    public final boolean f() {
        return true;
    }

    @Override // defpackage.xbf
    public final long h() {
        return this.e;
    }

    public final long i(long j) {
        long j2 = j * ((long) this.b);
        long j3 = this.a.b;
        String str = vqi.a;
        return vqi.i0(j2, 1000000L, j3, RoundingMode.DOWN);
    }
}
