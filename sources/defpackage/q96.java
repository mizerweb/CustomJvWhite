package defpackage;

import android.animation.AnimatorSet;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class q96 {
    public final EnhancedAnimatedVectorDrawable a;
    public final AnimatorSet b;
    public final boolean c;

    public q96(EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable, AnimatorSet animatorSet) {
        this.a = enhancedAnimatedVectorDrawable;
        AnimatorSet animatorSetClone = animatorSet.clone();
        this.b = animatorSetClone;
        this.c = animatorSetClone.getTotalDuration() == -1;
    }
}
