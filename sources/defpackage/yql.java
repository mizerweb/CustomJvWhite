package defpackage;

import java.util.EnumSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yql {
    public static final sdg a(rt2 rt2Var) {
        if (rt2Var.d0()) {
            return new ndg(rt2Var.A());
        }
        if (rt2Var.b0()) {
            vg4 vg4VarW = rt2Var.w();
            if (vg4VarW != null) {
                return new pdg(vg4VarW.v());
            }
            return null;
        }
        if (!rt2Var.h0()) {
            return new odg(rt2Var.A());
        }
        vg4 vg4VarW2 = rt2Var.w();
        if (vg4VarW2 != null) {
            return new qdg(vg4VarW2.v());
        }
        return null;
    }

    public static final j28 b(w55 w55Var, int i) {
        String str = w55Var.a;
        ux9 ux9VarC = srk.c(i, w55Var.b);
        ux9 ux9VarC2 = srk.c(i, w55Var.c);
        int i2 = w55Var.d;
        int i3 = 1;
        if (i2 != 0) {
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 0 : 4;
                }
            } else {
                i3 = 2;
            }
        }
        int i4 = w55Var.e;
        EnumSet enumSetNoneOf = EnumSet.noneOf(gdc.class);
        for (gdc gdcVar : gdc.c) {
            if ((gdcVar.a & i4) != 0) {
                enumSetNoneOf.add(gdcVar);
            }
        }
        return new j28(str, ux9VarC, ux9VarC2, i3, enumSetNoneOf);
    }
}
