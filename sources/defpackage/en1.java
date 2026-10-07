package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class en1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ View c;

    public /* synthetic */ en1(View view, float f, int i) {
        this.a = i;
        this.c = view;
        this.b = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        float f = this.b;
        View view = this.c;
        switch (i) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ls7 ls7Var = ((hn1) view).s;
                ls7Var.setRadiusScale((0.6666666f * fFloatValue) + 0.33333334f);
                ls7Var.setFalloffOverride(5.0f * fFloatValue);
                ls7Var.setBlurScale(((1.0f - f) * fFloatValue) + f);
                ls7Var.b();
                break;
            default:
                x6a x6aVar = (x6a) view;
                x6aVar.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x6aVar.invalidate();
                if (x6aVar.A == f) {
                    x6aVar.B.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
                break;
        }
    }
}
