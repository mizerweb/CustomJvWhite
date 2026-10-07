package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class r96 extends AnimatorListenerAdapter {
    public final /* synthetic */ EnhancedAnimatedVectorDrawable a;

    public r96(EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable) {
        this.a = enhancedAnimatedVectorDrawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = this.a;
        int iO0 = xw3.O0(enhancedAnimatedVectorDrawable.animationCallbacks);
        if (iO0 < 0) {
            return;
        }
        int i = 0;
        while (true) {
            gi giVar = (gi) ww3.u1(i, enhancedAnimatedVectorDrawable.animationCallbacks);
            if (giVar != null) {
                giVar.a(enhancedAnimatedVectorDrawable);
            }
            if (i == iO0) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = this.a;
        int iO0 = xw3.O0(enhancedAnimatedVectorDrawable.animationCallbacks);
        if (iO0 < 0) {
            return;
        }
        int i = 0;
        while (true) {
            gi giVar = (gi) ww3.u1(i, enhancedAnimatedVectorDrawable.animationCallbacks);
            if (giVar != null) {
                giVar.b(enhancedAnimatedVectorDrawable);
            }
            if (i == iO0) {
                return;
            } else {
                i++;
            }
        }
    }
}
