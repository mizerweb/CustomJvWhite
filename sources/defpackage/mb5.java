package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class mb5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ lfe b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ rb5 e;

    public mb5(rb5 rb5Var, lfe lfeVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = rb5Var;
        this.b = lfeVar;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        lfe lfeVar = this.b;
        rb5 rb5Var = this.e;
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        switch (i) {
            case 0:
                viewPropertyAnimator.setListener(null);
                this.c.setAlpha(1.0f);
                rb5Var.o(lfeVar);
                rb5Var.q.remove(lfeVar);
                rb5Var.n();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                rb5Var.b(lfeVar);
                rb5Var.o.remove(lfeVar);
                rb5Var.n();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
    }

    public mb5(rb5 rb5Var, lfe lfeVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = rb5Var;
        this.b = lfeVar;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
