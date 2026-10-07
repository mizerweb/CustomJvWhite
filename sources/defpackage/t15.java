package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class t15 extends ush {
    public final long e;
    public final long f;
    public final long g;
    public final int h;
    public final long i;
    public final long j;
    public final long k;
    public final k15 l;
    public final ry9 m;
    public final iy9 n;

    public t15(long j, long j2, long j3, int i, long j4, long j5, long j6, k15 k15Var, ry9 ry9Var, iy9 iy9Var) {
        lvb.b0(k15Var.d == (iy9Var != null));
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = i;
        this.i = j4;
        this.j = j5;
        this.k = j6;
        this.l = k15Var;
        this.m = ry9Var;
        this.n = iy9Var;
    }

    @Override // defpackage.ush
    public final int b(Object obj) {
        int iIntValue;
        if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.h) >= 0 && iIntValue < h()) {
            return iIntValue;
        }
        return -1;
    }

    @Override // defpackage.ush
    public final rsh f(int i, rsh rshVar, boolean z) {
        lvb.U(i, h());
        k15 k15Var = this.l;
        String str = z ? k15Var.b(i).a : null;
        Integer numValueOf = z ? Integer.valueOf(this.h + i) : null;
        long jE = k15Var.e(i);
        long jX = vqi.X(k15Var.b(i).b - k15Var.b(0).b) - this.i;
        rshVar.getClass();
        rshVar.i(str, numValueOf, 0, jE, jX, fa.f, false);
        return rshVar;
    }

    @Override // defpackage.ush
    public final int h() {
        return this.l.m.size();
    }

    @Override // defpackage.ush
    public final Object l(int i) {
        lvb.U(i, h());
        return Integer.valueOf(this.h + i);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a5  */
    @Override // defpackage.ush
    public final tsh m(int i, tsh tshVar, long j) {
        boolean z;
        boolean z2;
        x15 x15VarC;
        lvb.U(i, 1);
        k15 k15Var = this.l;
        boolean z3 = k15Var.d;
        long jB = this.k;
        if (z3 && k15Var.e != -9223372036854775807L && k15Var.b == -9223372036854775807L) {
            if (j > 0) {
                jB += j;
                if (jB > this.j) {
                    z = true;
                    jB = -9223372036854775807L;
                }
                Object obj = tsh.p;
                if (k15Var.d || k15Var.e == -9223372036854775807L || k15Var.b != -9223372036854775807L) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                tshVar.b(obj, this.m, k15Var, this.e, this.f, this.g, true, z2, this.n, jB, this.j, 0, h() - 1, this.i);
                return tshVar;
            }
            long j2 = this.i + jB;
            long jE = k15Var.e(0);
            int i2 = 0;
            while (i2 < k15Var.m.size() - 1 && j2 >= jE) {
                j2 -= jE;
                i2++;
                jE = k15Var.e(i2);
            }
            fsc fscVarB = k15Var.b(i2);
            int iA = fscVarB.a(2);
            z = true;
            if (iA != -1 && (x15VarC = ((ble) ((ga) fscVarB.c.get(iA)).c.get(0)).c()) != null && x15VarC.s(jE) != 0) {
                jB = (x15VarC.b(x15VarC.n(j2, jE)) + jB) - j2;
            }
        } else {
            z = true;
        }
        Object obj2 = tsh.p;
        if (k15Var.d) {
            z2 = false;
        } else {
            z2 = false;
        }
        tshVar.b(obj2, this.m, k15Var, this.e, this.f, this.g, true, z2, this.n, jB, this.j, 0, h() - 1, this.i);
        return tshVar;
    }

    @Override // defpackage.ush
    public final int o() {
        return 1;
    }
}
