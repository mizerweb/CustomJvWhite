package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class u5f implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ float b;

    public u5f(View view, float f) {
        this.a = view;
        this.b = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.a;
        view.setTranslationY(fFloatValue);
        float f = this.b;
        if (valueAnimator.getAnimatedFraction() >= (f != 0.0f ? 1.0f - f : 0.0f)) {
            view.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
        }
    }
}
