package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hn7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ hn7(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                jn7 jn7Var = (jn7) view;
                jn7Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jn7Var.invalidate();
                break;
            default:
                d09 d09Var = (d09) view;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction <= 0.1f && d09Var.a) {
                    d09Var.a = false;
                    d09Var.b.a();
                } else if (animatedFraction > 0.1f) {
                    d09Var.a = true;
                }
                break;
        }
    }
}
