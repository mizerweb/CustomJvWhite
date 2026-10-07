package defpackage;

import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class n0b implements bcf {
    public final long[] a;
    public final long[] b;
    public final long c;

    public n0b(long j, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? vqi.X(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair i(long j, long[] jArr, long[] jArr2) {
        int iF = vqi.f(jArr, j, true);
        long j2 = jArr[iF];
        long j3 = jArr2[iF];
        int i = iF + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // defpackage.bcf
    public final long a() {
        return 0L;
    }

    @Override // defpackage.bcf
    public final long b(long j) {
        return vqi.X(((Long) i(j, this.a, this.b).second).longValue());
    }

    @Override // defpackage.xbf
    public final wbf d(long j) {
        Pair pairI = i(vqi.p0(vqi.k(j, 0L, this.c)), this.b, this.a);
        zbf zbfVar = new zbf(vqi.X(((Long) pairI.first).longValue()), ((Long) pairI.second).longValue());
        return new wbf(zbfVar, zbfVar);
    }

    @Override // defpackage.bcf
    public final long e() {
        return -1L;
    }

    @Override // defpackage.xbf
    public final boolean f() {
        return true;
    }

    @Override // defpackage.bcf
    public final int g() {
        return -2147483647;
    }

    @Override // defpackage.xbf
    public final long h() {
        return this.c;
    }
}
