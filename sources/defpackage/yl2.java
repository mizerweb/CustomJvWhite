package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class yl2 implements s72 {
    public static final long[] a = new long[0];

    public static final void a(br4 br4Var) {
        vt3 vt3Var = new vt3(br4Var);
        if (br4Var.getRouter() != null) {
            br4Var.getRouter().a(vt3Var);
        } else {
            br4Var.addLifecycleListener(new bb(br4Var, vt3Var, 20));
        }
    }

    public static final Set b(fif fifVar) {
        return wk8.f(fifVar);
    }
}
