package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ssh extends ush {
    public final c98 e;
    public final c98 f;
    public final int[] g;
    public final int[] h;

    public ssh(ghe gheVar, ghe gheVar2, int[] iArr) {
        lvb.R(gheVar.d == iArr.length);
        this.e = gheVar;
        this.f = gheVar2;
        this.g = iArr;
        this.h = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.h[iArr[i]] = i;
        }
    }

    @Override // defpackage.ush
    public final int a(boolean z) {
        if (p()) {
            return -1;
        }
        if (z) {
            return this.g[0];
        }
        return 0;
    }

    @Override // defpackage.ush
    public final int b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ush
    public final int c(boolean z) {
        if (p()) {
            return -1;
        }
        c98 c98Var = this.e;
        if (!z) {
            return c98Var.size() - 1;
        }
        return this.g[c98Var.size() - 1];
    }

    @Override // defpackage.ush
    public final int e(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i == c(z)) {
            if (i2 == 2) {
                return a(z);
            }
            return -1;
        }
        if (!z) {
            return i + 1;
        }
        return this.g[this.h[i] + 1];
    }

    @Override // defpackage.ush
    public final rsh f(int i, rsh rshVar, boolean z) {
        rsh rshVar2 = (rsh) this.f.get(i);
        rshVar.i(rshVar2.a, rshVar2.b, rshVar2.c, rshVar2.d, rshVar2.e, rshVar2.g, rshVar2.f);
        return rshVar;
    }

    @Override // defpackage.ush
    public final int h() {
        return this.f.size();
    }

    @Override // defpackage.ush
    public final int k(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i == a(z)) {
            if (i2 == 2) {
                return c(z);
            }
            return -1;
        }
        if (!z) {
            return i - 1;
        }
        return this.g[this.h[i] - 1];
    }

    @Override // defpackage.ush
    public final Object l(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ush
    public final tsh m(int i, tsh tshVar, long j) {
        tsh tshVar2 = (tsh) this.e.get(i);
        tshVar.b(tshVar2.a, tshVar2.b, tshVar2.c, tshVar2.d, tshVar2.e, tshVar2.f, tshVar2.g, tshVar2.h, tshVar2.i, tshVar2.k, tshVar2.l, tshVar2.m, tshVar2.n, tshVar2.o);
        tshVar.j = tshVar2.j;
        return tshVar;
    }

    @Override // defpackage.ush
    public final int o() {
        return this.e.size();
    }
}
