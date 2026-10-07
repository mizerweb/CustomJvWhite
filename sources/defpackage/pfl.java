package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pfl {
    public static int a(rt2 rt2Var, fda fdaVar) {
        lx2 lx2Var = rt2Var.b.b;
        return sfl.c(sfl.b(0, (lx2Var == lx2.b || lx2Var == lx2.e) && fdaVar.d()), fdaVar.d());
    }

    public static final boolean b(Throwable th) {
        while (!(th instanceof OutOfMemoryError)) {
            Throwable cause = th.getCause();
            if (cause == null || cause == th) {
                return false;
            }
            th = cause;
        }
        return true;
    }
}
