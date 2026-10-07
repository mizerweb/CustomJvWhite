package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* JADX INFO: loaded from: classes2.dex */
public final class bl extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnimatorSet b;
    public final /* synthetic */ af7 c;

    public /* synthetic */ bl(AnimatorSet animatorSet, af7 af7Var, int i) {
        this.a = i;
        this.b = animatorSet;
        this.c = af7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.removeListener(this);
                this.c.invoke();
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                this.b.removeListener(this);
                this.c.invoke();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
