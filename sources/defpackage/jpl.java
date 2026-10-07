package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jpl {
    public static final boolean a(f9f f9fVar, sh3 sh3Var) {
        if (sh3Var instanceof rh3) {
            return true;
        }
        if (!(sh3Var instanceof qh3)) {
            ore.o();
            return false;
        }
        if (f9fVar.a == 1) {
            Set set = ((qh3) sh3Var).a;
            rt2 rt2Var = f9fVar.d;
            if (ww3.j1(set, rt2Var != null ? Long.valueOf(rt2Var.a) : null)) {
                return true;
            }
        }
        return false;
    }

    public static final rv8 b(fif fifVar) {
        if (fifVar instanceof op4) {
            return ((op4) fifVar).b;
        }
        if (fifVar instanceof gif) {
            return b(((gif) fifVar).a);
        }
        return null;
    }

    public static final void c(khb khbVar, fif fifVar) {
        b(fifVar);
    }
}
