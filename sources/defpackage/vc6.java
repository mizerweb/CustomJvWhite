package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vc6 implements xye {
    public final b87 a;
    public long[] c;
    public boolean d;
    public xc6 e;
    public boolean f;
    public int g;
    public final fik b = new fik(16);
    public long h = -9223372036854775807L;

    public vc6(xc6 xc6Var, b87 b87Var, boolean z) {
        this.a = b87Var;
        this.e = xc6Var;
        this.c = xc6Var.b;
        a(xc6Var, z);
    }

    public final void a(xc6 xc6Var, boolean z) {
        int i = this.g;
        long j = -9223372036854775807L;
        long j2 = i == 0 ? -9223372036854775807L : this.c[i - 1];
        this.d = z;
        this.e = xc6Var;
        long[] jArr = xc6Var.b;
        this.c = jArr;
        long j3 = this.h;
        if (j3 == -9223372036854775807L) {
            if (j2 != -9223372036854775807L) {
                this.g = vqi.b(jArr, j2, false);
            }
        } else {
            int iB = vqi.b(jArr, j3, true);
            this.g = iB;
            if (this.d && iB == this.c.length) {
                j = j3;
            }
            this.h = j;
        }
    }

    @Override // defpackage.xye
    public final void b() {
    }

    @Override // defpackage.xye
    public final int f(v2a v2aVar, u55 u55Var, int i) {
        int i2 = this.g;
        boolean z = i2 == this.c.length;
        if (z && !this.d) {
            u55Var.a = 4;
            return -4;
        }
        if ((i & 2) != 0 || !this.f) {
            v2aVar.c = this.a;
            this.f = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.g = i2 + 1;
        }
        if ((i & 4) == 0) {
            byte[] bArrH = this.b.h(this.e.a[i2]);
            u55Var.s(bArrH.length);
            u55Var.d.put(bArrH);
        }
        u55Var.f = this.c[i2];
        u55Var.a = 1;
        return -4;
    }

    @Override // defpackage.xye
    public final boolean m() {
        return true;
    }

    @Override // defpackage.xye
    public final int o(long j) {
        int iMax = Math.max(this.g, vqi.b(this.c, j, true));
        int i = iMax - this.g;
        this.g = iMax;
        return i;
    }
}
