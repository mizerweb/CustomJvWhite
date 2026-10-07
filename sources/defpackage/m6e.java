package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes3.dex */
public final class m6e extends Visibility {
    public static final PathInterpolator b = new PathInterpolator(0.9f, 0.0f, 0.66f, 1.0f);
    public final x5e a;

    public m6e(x5e x5eVar) {
        this.a = x5eVar;
    }

    public final AnimatorSet a(View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        float f = z ? 0.0f : 1.0f;
        float f2 = z ? 1.0f : 0.0f;
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(100L);
        addListener(new j6e(view, ifg.r, f2));
        view.setScaleX(f);
        ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(100L);
        addListener(new j6e(view, ifg.s, f2));
        view.setScaleY(f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.setInterpolator(b);
        addListener(new l6e(view, f));
        valueAnimatorOfFloat.addUpdateListener(new z6(view, 6));
        animatorSet.playTogether(duration, duration2, valueAnimatorOfFloat);
        animatorSet.addListener(new k6e(z, this, view));
        return animatorSet;
    }

    @Override // android.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return a(view, true);
    }

    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return a(view, false);
    }
}
