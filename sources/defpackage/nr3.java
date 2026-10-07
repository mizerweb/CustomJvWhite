package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class nr3 extends yk {
    public static final ll6 k = new ll6();

    public nr3(boolean z, int i) {
        super(500L, (i & 1) != 0 ? true : z);
    }

    @Override // defpackage.yk
    public final Animator l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        ll6 ll6Var = k;
        if (z && view2 != null) {
            or3 or3VarB = oml.b(view, true, true);
            if (or3VarB == null) {
                return o(view2, false);
            }
            float height = view2.getHeight();
            view2.setVisibility(0);
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view2, or3VarB.a, or3VarB.b, or3VarB.c, height);
            animatorCreateCircularReveal.setInterpolator(ll6Var);
            animatorCreateCircularReveal.setDuration(this.d);
            return animatorCreateCircularReveal;
        }
        if (z || view == null) {
            return o(view2, false);
        }
        or3 or3VarB2 = oml.b(view2, false, true);
        if (or3VarB2 == null) {
            return o(view, true);
        }
        Animator animatorCreateCircularReveal2 = ViewAnimationUtils.createCircularReveal(view, or3VarB2.a, or3VarB2.b, view.getHeight(), 0.0f);
        animatorCreateCircularReveal2.setInterpolator(ll6Var);
        animatorCreateCircularReveal2.setDuration(this.d);
        animatorCreateCircularReveal2.addListener(new c7(view, 1));
        return animatorCreateCircularReveal2;
    }

    @Override // defpackage.yk
    public final void n(View view) {
    }

    public final ValueAnimator o(View view, boolean z) {
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        if (view == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 0.0f);
            valueAnimatorOfFloat.setDuration(0L);
            return valueAnimatorOfFloat;
        }
        ylc ylcVar = z ? new ylc(fValueOf, fValueOf2) : new ylc(fValueOf2, fValueOf);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, ((Number) ylcVar.a).floatValue(), ((Number) ylcVar.b).floatValue());
        objectAnimatorOfFloat.setDuration(this.d);
        return objectAnimatorOfFloat;
    }

    public nr3() {
        this(false, 3);
    }
}
