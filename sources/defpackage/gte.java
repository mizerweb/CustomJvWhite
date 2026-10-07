package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import one.me.android.root.RootController;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gte implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ View b;
    public final /* synthetic */ float c;

    public /* synthetic */ gte(float f, View view) {
        this.c = f;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        float fFloatValue = this.c;
        View view = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = RootController.k;
                Object animatedValue = valueAnimator.getAnimatedValue("topMarginProp");
                Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
                if (f != null) {
                    fFloatValue = f.floatValue();
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.topMargin = (int) fFloatValue;
                view.setLayoutParams(marginLayoutParams);
                break;
            default:
                view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (fFloatValue == 0.0f) {
                    fFloatValue = 0.0f;
                }
                if (valueAnimator.getAnimatedFraction() >= fFloatValue) {
                    view.setAlpha(valueAnimator.getAnimatedFraction());
                }
                break;
        }
    }

    public /* synthetic */ gte(View view, float f) {
        this.b = view;
        this.c = f;
    }
}
