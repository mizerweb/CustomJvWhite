package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jf4 extends if4 implements bcf {
    public final long i;
    public final int j;
    public final int k;
    public final boolean l;
    public final long m;

    public jf4(long j, long j2, int i, int i2, boolean z, boolean z2) {
        super(j, j2, i, i2, z, z2);
        this.i = j2;
        this.j = i;
        this.k = i2;
        this.l = z;
        this.m = j == -1 ? -1L : j;
    }

    @Override // defpackage.bcf
    public final long a() {
        return this.i;
    }

    @Override // defpackage.bcf
    public final long b(long j) {
        return (Math.max(0L, j - this.b) * 8000000) / ((long) this.e);
    }

    @Override // defpackage.bcf
    public final long e() {
        return this.m;
    }

    @Override // defpackage.bcf
    public final int g() {
        return this.j;
    }
}
