package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ z6(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                int i2 = e7.q;
                view.setAlpha(valueAnimator.getAnimatedFraction());
                break;
            case 1:
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.rightMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    view.setLayoutParams(marginLayoutParams);
                }
                break;
            case 2:
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 == null) {
                    ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.rightMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    view.setLayoutParams(marginLayoutParams2);
                }
                break;
            case 3:
                view.setClipBounds(new Rect(0, ((Integer) valueAnimator.getAnimatedValue()).intValue(), view.getWidth(), view.getHeight()));
                break;
            case 4:
                o7j.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), view);
                break;
            case 5:
                view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
