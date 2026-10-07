package defpackage;

import androidx.media3.exoplayer.source.BehindLiveWindowException;

/* JADX INFO: loaded from: classes2.dex */
public final class o95 {
    public final q51 a;
    public final ble b;
    public final ws0 c;
    public final x15 d;
    public final long e;
    public final long f;

    public o95(long j, ble bleVar, ws0 ws0Var, q51 q51Var, long j2, x15 x15Var) {
        this.e = j;
        this.b = bleVar;
        this.c = ws0Var;
        this.f = j2;
        this.a = q51Var;
        this.d = x15Var;
    }

    public final o95 a(long j, ble bleVar) throws BehindLiveWindowException {
        long jN;
        long jN2;
        x15 x15VarC = this.b.c();
        x15 x15VarC2 = bleVar.c();
        if (x15VarC == null) {
            return new o95(j, bleVar, this.c, this.a, this.f, x15VarC);
        }
        if (!x15VarC.F()) {
            return new o95(j, bleVar, this.c, this.a, this.f, x15VarC2);
        }
        long jS = x15VarC.s(j);
        if (jS == 0) {
            return new o95(j, bleVar, this.c, this.a, this.f, x15VarC2);
        }
        x15VarC2.getClass();
        long jH = x15VarC.H();
        long jB = x15VarC.b(jH);
        long j2 = jS + jH;
        long j3 = j2 - 1;
        long jD = x15VarC.d(j3, j) + x15VarC.b(j3);
        long jH2 = x15VarC2.H();
        long jB2 = x15VarC2.b(jH2);
        long j4 = this.f;
        if (jD != jB2) {
            if (jD < jB2) {
                throw new BehindLiveWindowException();
            }
            if (jB2 < jB) {
                jN2 = j4 - (x15VarC2.n(jB, j) - jH);
            } else {
                jN = x15VarC.n(jB2, j) - jH2;
            }
            return new o95(j, bleVar, this.c, this.a, jN2, x15VarC2);
        }
        jN = j2 - jH2;
        jN2 = jN + j4;
        return new o95(j, bleVar, this.c, this.a, jN2, x15VarC2);
    }

    public final long b(long j) {
        x15 x15Var = this.d;
        x15Var.getClass();
        return x15Var.g(this.e, j) + this.f;
    }

    public final long c() {
        x15 x15Var = this.d;
        x15Var.getClass();
        return x15Var.H() + this.f;
    }

    public final long d(long j) {
        long jB = b(j);
        x15 x15Var = this.d;
        x15Var.getClass();
        return (x15Var.J(this.e, j) + jB) - 1;
    }

    public final long e() {
        x15 x15Var = this.d;
        x15Var.getClass();
        return x15Var.s(this.e);
    }

    public final long f(long j) {
        long jH = h(j);
        x15 x15Var = this.d;
        x15Var.getClass();
        return x15Var.d(j - this.f, this.e) + jH;
    }

    public final long g(long j) {
        x15 x15Var = this.d;
        x15Var.getClass();
        return x15Var.n(j, this.e) + this.f;
    }

    public final long h(long j) {
        x15 x15Var = this.d;
        x15Var.getClass();
        return x15Var.b(j - this.f);
    }

    public final boolean i(long j, long j2) {
        x15 x15Var = this.d;
        x15Var.getClass();
        return x15Var.F() || j2 == -9223372036854775807L || f(j) <= j2;
    }
}
