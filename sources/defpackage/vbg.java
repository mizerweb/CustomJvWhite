package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vbg implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tg8 b;

    public /* synthetic */ vbg(tg8 tg8Var, int i) {
        this.a = i;
        this.b = tg8Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        tg8 tg8Var = this.b;
        switch (i) {
            case 0:
                ((pbg) tg8Var).w.setTextColor(tre.I0(((pbg) tg8Var).w.getCurrentTextColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            default:
                ((pbg) tg8Var).w.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
