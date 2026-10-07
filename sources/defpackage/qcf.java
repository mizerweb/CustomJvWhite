package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qcf implements d81 {
    public final xs5 a;
    public final long b;
    public final int c;
    public long d;
    public int e;

    public qcf(xs5 xs5Var, long j, int i, long j2, int i2) {
        this.a = xs5Var;
        this.b = j;
        this.c = i;
        this.d = j2;
        this.e = i2;
    }

    public final float a() {
        long j = this.b;
        if (j != -1 && j != 0) {
            return vqi.b0(this.d, j);
        }
        int i = this.c;
        if (i != 0) {
            return vqi.b0(this.e, i);
        }
        return -1.0f;
    }

    @Override // defpackage.d81
    public final void b(long j, long j2, long j3) {
        long j4 = this.d + j3;
        this.d = j4;
        this.a.d(this.b, j4, a());
    }
}
