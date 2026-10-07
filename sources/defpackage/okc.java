package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class okc implements g19, c1f {
    public i19 a;
    public s68 b;
    public boolean c;
    public Bundle d;

    public static final void a(okc okcVar, br4 br4Var, br4 br4Var2, gr4 gr4Var, hr4 hr4Var) {
        if (br4Var != br4Var2 || hr4Var.b || !gr4Var.d() || br4Var2.getView() == null) {
            return;
        }
        i19 i19Var = okcVar.a;
        if ((i19Var == null ? null : i19Var).d == n09.e) {
            if (i19Var == null) {
                i19Var = null;
            }
            i19Var.d(m09.ON_PAUSE);
            Bundle bundle = new Bundle();
            okcVar.d = bundle;
            s68 s68Var = okcVar.b;
            (s68Var != null ? s68Var : null).c(bundle);
            okcVar.c = true;
        }
    }

    @Override // defpackage.c1f
    public final b1f c() {
        s68 s68Var = this.b;
        if (s68Var == null) {
            s68Var = null;
        }
        return (b1f) s68Var.c;
    }

    @Override // defpackage.g19
    public final i19 f() {
        i19 i19Var = this.a;
        if (i19Var == null) {
            return null;
        }
        return i19Var;
    }
}
