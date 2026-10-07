package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mj implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mj(View view, float f, Object obj, int i) {
        this.a = i;
        this.c = view;
        this.b = f;
        this.d = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        float f = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((cyb) obj2).setTranslationY(fFloatValue);
                ((cyb) obj).setTranslationY((-f) + fFloatValue);
                break;
            case 1:
                mx4.m((mx4) obj2, f, (tfe) obj, valueAnimator);
                break;
            case 2:
                ecd.b((ecd) obj2, (qf7) obj, f, valueAnimator);
                break;
            case 3:
                sag sagVar = (sag) obj;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                ((y8j) obj2).setTranslationX((1.0f - animatedFraction) * f);
                sagVar.a = (-f) * animatedFraction;
                sagVar.invalidateSelf();
                break;
            default:
                qeh qehVar = (qeh) obj2;
                qehVar.z().offsetTopAndBottom(((Integer) valueAnimator.getAnimatedValue()).intValue() - qehVar.v());
                ((qf7) obj).invoke(Float.valueOf(valueAnimator.getAnimatedFraction()), Float.valueOf(f));
                break;
        }
    }

    public /* synthetic */ mj(Object obj, Object obj2, float f, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = f;
    }
}
