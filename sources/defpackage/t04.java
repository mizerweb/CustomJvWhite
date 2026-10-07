package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class t04 implements hw7 {
    public final q24 b;
    public final ny8 c;

    public t04(q24 q24Var, ny8 ny8Var) {
        this.b = q24Var;
        this.c = ny8Var;
    }

    @Override // defpackage.hw7
    public final boolean a() {
        return true;
    }

    @Override // defpackage.hw7
    public final long d() {
        nx2 nx2Var;
        s04 s04VarM = m();
        if (s04VarM == null || (nx2Var = s04VarM.b) == null) {
            return 0L;
        }
        return nx2Var.y;
    }

    @Override // defpackage.hw7
    public final long e() {
        return 0L;
    }

    @Override // defpackage.hw7
    public final String j() {
        nx2 nx2Var;
        nx2 nx2Var2;
        s04 s04VarM = m();
        Long lValueOf = null;
        Long lValueOf2 = (s04VarM == null || (nx2Var2 = s04VarM.b) == null) ? null : Long.valueOf(nx2Var2.y);
        if (s04VarM != null && (nx2Var = s04VarM.b) != null) {
            lValueOf = Long.valueOf(nx2Var.j);
        }
        return "firstId:" + lValueOf2 + "|lastId:" + lValueOf;
    }

    @Override // defpackage.hw7
    public final long k() {
        nx2 nx2Var;
        s04 s04VarM = m();
        if (s04VarM == null || (nx2Var = s04VarM.b) == null) {
            return 0L;
        }
        return nx2Var.j;
    }

    @Override // defpackage.hw7
    public final List l() {
        nx2 nx2Var;
        fx2 fx2Var;
        ArrayList arrayListE;
        s04 s04VarM = m();
        return (s04VarM == null || (nx2Var = s04VarM.b) == null || (fx2Var = nx2Var.n) == null || (arrayListE = fx2Var.e(mg5.REGULAR)) == null) ? r66.a : arrayListE;
    }

    public final s04 m() {
        return (s04) ((r8e) ((xn3) this.c.getValue()).c.i(this.b)).a.getValue();
    }
}
