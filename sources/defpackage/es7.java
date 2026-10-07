package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class es7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ js7 b;

    public /* synthetic */ es7(js7 js7Var, int i) {
        this.a = i;
        this.b = js7Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        js7 js7Var = this.b;
        switch (i) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                js7Var.l = esk.b(120.0f, 84.0f, fFloatValue);
                js7Var.o = esk.b(0.3f, 0.0f, fFloatValue);
                js7Var.b();
                break;
            default:
                js7Var.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                js7Var.b();
                break;
        }
    }
}
