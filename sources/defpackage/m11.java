package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes2.dex */
public final class m11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m11(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jo9 jo9Var = ((BottomSheetBehavior) obj).i;
                if (jo9Var != null) {
                    io9 io9Var = jo9Var.a;
                    if (io9Var.i != fFloatValue) {
                        io9Var.i = fFloatValue;
                        jo9Var.e = true;
                        jo9Var.invalidateSelf();
                    }
                }
                break;
            case 1:
                ((rw3) obj).setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 2:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                nl6 nl6Var = (nl6) obj;
                nl6Var.c.setAlpha(iFloatValue);
                nl6Var.d.setAlpha(iFloatValue);
                nl6Var.s.invalidate();
                break;
            case 3:
                ((nn8) obj).m = valueAnimator.getAnimatedFraction();
                break;
            case 4:
                ((xgh) obj).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                break;
            default:
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                izi iziVar = (izi) obj;
                if (iziVar.x1 != iIntValue) {
                    iziVar.x1 = iIntValue;
                    iziVar.requestLayout();
                }
                break;
        }
    }
}
