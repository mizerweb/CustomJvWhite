package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final class ob5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ pb5 b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View d;
    public final /* synthetic */ rb5 e;

    public /* synthetic */ ob5(rb5 rb5Var, pb5 pb5Var, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.a = i;
        this.e = rb5Var;
        this.b = pb5Var;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        pb5 pb5Var = this.b;
        rb5 rb5Var = this.e;
        View view = this.d;
        ViewPropertyAnimator viewPropertyAnimator = this.c;
        switch (i) {
            case 0:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                rb5Var.b(pb5Var.a);
                rb5Var.r.remove(pb5Var.a);
                rb5Var.n();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                rb5Var.b(pb5Var.b);
                rb5Var.r.remove(pb5Var.b);
                rb5Var.n();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
    }
}
