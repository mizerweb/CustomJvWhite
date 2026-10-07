package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class iv7 extends Visibility {
    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int height = view.getHeight();
        float translationY = view.getTranslationY();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, translationY, translationY - height);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt((Object) null, new ik("clipTop", 0), 0, height);
        objectAnimatorOfInt.addUpdateListener(new z6(view, 3));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfInt);
        animatorSet.addListener(new c7(view, 4));
        return animatorSet;
    }
}
