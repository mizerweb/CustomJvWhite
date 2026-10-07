package defpackage;

import android.animation.AnimatorSet;

/* JADX INFO: loaded from: classes2.dex */
public final class az7 {
    public final y8j a;
    public final xd1 b;
    public final lgb c;
    public AnimatorSet d;
    public boolean e;

    public az7(y8j y8jVar, xd1 xd1Var, lgb lgbVar) {
        this.a = y8jVar;
        this.b = xd1Var;
        this.c = lgbVar;
    }

    public final void a(float f, float f2) {
        this.a.c(f);
        xd1 xd1Var = this.b;
        xd1Var.setTranslationX(xd1Var.getTranslationX() + f);
        lgb lgbVar = this.c;
        lgbVar.setTranslationX(lgbVar.getTranslationX() + f);
        xd1Var.a(oc9.u(f2 / gm0.K(112.0f * yl5.d().getDisplayMetrics().density), -1.0f, 1.0f));
    }
}
