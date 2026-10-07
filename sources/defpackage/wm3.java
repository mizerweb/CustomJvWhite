package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* JADX INFO: loaded from: classes4.dex */
public final class wm3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ym3 b;
    public final /* synthetic */ AnimatorSet c;

    public /* synthetic */ wm3(ym3 ym3Var, AnimatorSet animatorSet, int i) {
        this.a = i;
        this.b = ym3Var;
        this.c = animatorSet;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
        AnimatorSet animatorSet = this.c;
        ym3 ym3Var = this.b;
        switch (i) {
            case 0:
                if (ym3Var.g == animatorSet) {
                    ym3Var.g = null;
                    ym3Var.h(true);
                    ym3Var.c();
                    ym3Var.i = ym3Var.e == null ? 1 : 3;
                    break;
                }
                break;
            default:
                if (ym3Var.g == animatorSet) {
                    ym3Var.g = null;
                    ym3Var.h(true);
                    ym3Var.c();
                    ym3Var.i = ym3Var.e == null ? 1 : 3;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        AnimatorSet animatorSet = this.c;
        ym3 ym3Var = this.b;
        switch (i) {
            case 0:
                if (ym3Var.g == animatorSet) {
                    ym3Var.g = null;
                    ym3Var.h(true);
                    ym3Var.c();
                    ym3Var.i = 3;
                    break;
                }
                break;
            default:
                if (ym3Var.g == animatorSet) {
                    ym3Var.g = null;
                    ym3Var.h(true);
                    ym3Var.c();
                    ym3Var.d();
                    break;
                }
                break;
        }
    }
}
