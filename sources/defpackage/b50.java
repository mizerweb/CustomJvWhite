package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b50 extends ArrayList {
    public static b50 a(fka fkaVar) {
        b50 b50Var = new b50();
        int iT0 = fkaVar.t0();
        for (int i = 0; i < iT0; i++) {
            b50Var.add(l40.b(fkaVar));
        }
        return b50Var;
    }

    public static b50 b(fka fkaVar) {
        int iT0 = fkaVar.t0();
        b50 b50Var = new b50(iT0);
        for (int i = 0; i < iT0; i++) {
            b50Var.add(st2.b(fkaVar));
        }
        return b50Var;
    }

    public static b50 c(fka fkaVar) {
        int iJ = ch3.J(fkaVar);
        b50 b50Var = new b50(iJ);
        for (int i = 0; i < iJ; i++) {
            pj4 pj4VarE = pj4.e(fkaVar);
            oj4 oj4Var = oj4.t;
            if (pj4VarE == null) {
                Objects.requireNonNull(oj4Var, "defaultObj");
                pj4VarE = oj4Var;
            }
            b50Var.add(pj4VarE);
        }
        return b50Var;
    }

    public static b50 d(fka fkaVar) {
        int iJ = ch3.J(fkaVar);
        b50 b50Var = new b50(iJ);
        for (int i = 0; i < iJ; i++) {
            b50Var.add(Long.valueOf(ch3.T(fkaVar, 0L)));
        }
        return b50Var;
    }

    public static b50 f(fka fkaVar) {
        int iJ = ch3.J(fkaVar);
        b50 b50Var = new b50(iJ);
        for (int i = 0; i < iJ; i++) {
            b50Var.add(ch3.W(fkaVar));
        }
        return b50Var;
    }
}
