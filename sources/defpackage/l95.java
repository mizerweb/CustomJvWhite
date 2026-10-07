package defpackage;

import androidx.media3.exoplayer.source.BehindLiveWindowException;

/* JADX INFO: loaded from: classes2.dex */
public final class l95 {
    public final long a;
    public long b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;

    public l95(long j, ble bleVar, ws0 ws0Var, q51 q51Var, long j2, x15 x15Var) {
        this.a = j;
        this.d = bleVar;
        this.e = ws0Var;
        this.b = j2;
        this.c = q51Var;
        this.f = x15Var;
    }

    public l95 a(long j, ble bleVar) throws BehindLiveWindowException {
        long jN;
        x15 x15VarC = ((ble) this.d).c();
        x15 x15VarC2 = bleVar.c();
        Object obj = this.c;
        Object obj2 = this.e;
        if (x15VarC == null) {
            return new l95(j, bleVar, (ws0) obj2, (q51) obj, this.b, x15VarC);
        }
        if (!x15VarC.F()) {
            return new l95(j, bleVar, (ws0) obj2, (q51) obj, this.b, x15VarC2);
        }
        long jS = x15VarC.s(j);
        if (jS == 0) {
            return new l95(j, bleVar, (ws0) obj2, (q51) obj, this.b, x15VarC2);
        }
        x15VarC2.getClass();
        long jH = x15VarC.H();
        long jB = x15VarC.b(jH);
        long j2 = jS + jH;
        long j3 = j2 - 1;
        long jD = x15VarC.d(j3, j) + x15VarC.b(j3);
        long jH2 = x15VarC2.H();
        long jB2 = x15VarC2.b(jH2);
        long j4 = this.b;
        if (jD == jB2) {
            jN = (j2 - jH2) + j4;
        } else {
            if (jD < jB2) {
                throw new BehindLiveWindowException();
            }
            jN = jB2 < jB ? j4 - (x15VarC2.n(jB, j) - jH) : (x15VarC.n(jB2, j) - jH2) + j4;
        }
        return new l95(j, bleVar, (ws0) obj2, (q51) obj, jN, x15VarC2);
    }

    public long b(long j) {
        x15 x15Var = (x15) this.f;
        x15Var.getClass();
        long j2 = this.a;
        long jG = x15Var.g(j2, j) + this.b;
        x15Var.getClass();
        return (x15Var.J(j2, j) + jG) - 1;
    }

    public long c() {
        x15 x15Var = (x15) this.f;
        x15Var.getClass();
        return x15Var.s(this.a);
    }

    public long d(long j) {
        long jE = e(j);
        x15 x15Var = (x15) this.f;
        x15Var.getClass();
        return x15Var.d(j - this.b, this.a) + jE;
    }

    public long e(long j) {
        x15 x15Var = (x15) this.f;
        x15Var.getClass();
        return x15Var.b(j - this.b);
    }

    public boolean f(long j, long j2) {
        x15 x15Var = (x15) this.f;
        x15Var.getClass();
        return x15Var.F() || j2 == -9223372036854775807L || d(j) <= j2;
    }

    public void g() {
        sgg sggVar = (sgg) this.f;
        if (sggVar != null) {
            sggVar.b(null);
        }
        this.f = null;
    }

    public l95(dq4 dq4Var, long j, aoi aoiVar, vbi vbiVar) {
        this.c = dq4Var;
        this.a = j;
        this.d = aoiVar;
        this.e = vbiVar;
    }
}
