package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mri implements bcf {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;

    public mri(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = i;
    }

    @Override // defpackage.bcf
    public final long a() {
        return this.d;
    }

    @Override // defpackage.bcf
    public final long b(long j) {
        return this.a[vqi.f(this.b, j, true)];
    }

    @Override // defpackage.xbf
    public final wbf d(long j) {
        long[] jArr = this.a;
        int iF = vqi.f(jArr, j, true);
        long j2 = jArr[iF];
        long[] jArr2 = this.b;
        zbf zbfVar = new zbf(j2, jArr2[iF]);
        if (j2 >= j || iF == jArr.length - 1) {
            return new wbf(zbfVar, zbfVar);
        }
        int i = iF + 1;
        return new wbf(zbfVar, new zbf(jArr[i], jArr2[i]));
    }

    @Override // defpackage.bcf
    public final long e() {
        return this.e;
    }

    @Override // defpackage.xbf
    public final boolean f() {
        return true;
    }

    @Override // defpackage.bcf
    public final int g() {
        return this.f;
    }

    @Override // defpackage.xbf
    public final long h() {
        return this.c;
    }
}
