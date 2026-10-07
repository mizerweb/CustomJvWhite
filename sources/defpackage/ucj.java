package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ucj implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ GradientDrawable b;

    public /* synthetic */ ucj(GradientDrawable gradientDrawable, int i) {
        this.a = i;
        this.b = gradientDrawable;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        GradientDrawable gradientDrawable = this.b;
        switch (i) {
            case 0:
                if (gradientDrawable != null) {
                    gradientDrawable.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
                break;
            default:
                if (gradientDrawable != null) {
                    gradientDrawable.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
                break;
        }
    }
}
