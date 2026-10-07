package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mi9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qi9 b;

    public /* synthetic */ mi9(qi9 qi9Var, int i) {
        this.a = i;
        this.b = qi9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        qi9 qi9Var = this.b;
        switch (i) {
            case 0:
                qi9Var.f().setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                qi9Var.f().setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
