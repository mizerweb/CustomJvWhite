package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ad8 implements xbf {
    public final bi9 a;
    public final bi9 b;
    public long c;

    public ad8(long j, long[] jArr, long[] jArr2) {
        lvb.R(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.a = new bi9(length, 0);
            this.b = new bi9(length, 0);
        } else {
            int i = length + 1;
            bi9 bi9Var = new bi9(i, 0);
            this.a = bi9Var;
            bi9 bi9Var2 = new bi9(i, 0);
            this.b = bi9Var2;
            bi9Var.a(0L);
            bi9Var2.a(0L);
        }
        this.a.b(jArr);
        this.b.b(jArr2);
        this.c = j;
    }

    @Override // defpackage.xbf
    public final wbf d(long j) {
        bi9 bi9Var = this.b;
        if (bi9Var.a == 0) {
            zbf zbfVar = zbf.c;
            return new wbf(zbfVar, zbfVar);
        }
        int iC = vqi.c(bi9Var, j);
        long jC = bi9Var.c(iC);
        bi9 bi9Var2 = this.a;
        zbf zbfVar2 = new zbf(jC, bi9Var2.c(iC));
        if (jC == j || iC == bi9Var.a - 1) {
            return new wbf(zbfVar2, zbfVar2);
        }
        int i = iC + 1;
        return new wbf(zbfVar2, new zbf(bi9Var.c(i), bi9Var2.c(i)));
    }

    @Override // defpackage.xbf
    public final boolean f() {
        return this.b.a > 0;
    }

    @Override // defpackage.xbf
    public final long h() {
        return this.c;
    }
}
