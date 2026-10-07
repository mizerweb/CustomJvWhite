package defpackage;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes4.dex */
public final class wq3 {
    public final yk0 a;
    public final kyh b;
    public final int c;
    public final int d;
    public final long e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public long[] m;
    public int[] n;

    public wq3(int i, yk0 yk0Var, kyh kyhVar) {
        int i2 = yk0Var.d;
        this.a = yk0Var;
        int iA = yk0Var.a();
        boolean z = true;
        if (iA != 1 && iA != 2) {
            z = false;
        }
        lvb.R(z);
        int i3 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.c = (iA == 2 ? 1667497984 : 1651965952) | i3;
        long j = ((long) yk0Var.b) * 1000000;
        long j2 = yk0Var.c;
        String str = vqi.a;
        this.e = vqi.i0(i2, j, j2, RoundingMode.DOWN);
        this.b = kyhVar;
        this.d = iA == 2 ? i3 | 1650720768 : -1;
        this.l = -1L;
        this.m = new long[np0.o];
        this.n = new int[np0.o];
        this.f = i2;
    }

    public final zbf a(int i) {
        return new zbf((this.e / ((long) this.f)) * ((long) this.n[i]), this.m[i]);
    }

    public final wbf b(long j) {
        if (this.k == 0) {
            zbf zbfVar = new zbf(0L, this.l);
            return new wbf(zbfVar, zbfVar);
        }
        int i = (int) (j / (this.e / ((long) this.f)));
        int iE = vqi.e(this.n, i, true, true);
        if (this.n[iE] == i) {
            zbf zbfVarA = a(iE);
            return new wbf(zbfVarA, zbfVarA);
        }
        zbf zbfVarA2 = a(iE);
        int i2 = iE + 1;
        return i2 < this.m.length ? new wbf(zbfVarA2, a(i2)) : new wbf(zbfVarA2, zbfVarA2);
    }
}
