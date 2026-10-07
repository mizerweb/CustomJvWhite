package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes3.dex */
public final class wbg {
    public static final /* synthetic */ zv8[] e = {new z8b(wbg.class, "infiniteAnimationJob", "getInfiniteAnimationJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, wbg.class, "stateAnimationJob", "getStateAnimationJob()Lkotlinx/coroutines/Job;")};
    public final w09 a;
    public final ny8 b = rx8.P(3, new irf(16));
    public final p3c c = qyj.S();
    public final p3c d = qyj.S();

    public wbg(w09 w09Var) {
        this.a = w09Var;
    }

    public static void a(tg8 tg8Var, int i) {
        if (tg8Var == null) {
            return;
        }
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(((pbg) tg8Var).w.getCurrentTextColor()), Integer.valueOf(i));
        valueAnimatorOfObject.setDuration(200L);
        valueAnimatorOfObject.addUpdateListener(new vbg(tg8Var, 1));
        valueAnimatorOfObject.start();
    }

    public final void b() {
        zv8[] zv8VarArr = e;
        zv8 zv8Var = zv8VarArr[0];
        p3c p3cVar = this.c;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8Var);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        p3cVar.B(this, zv8VarArr[0], null);
    }
}
