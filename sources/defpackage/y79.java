package defpackage;

import android.animation.Animator;

/* JADX INFO: loaded from: classes4.dex */
public final class y79 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z79 b;

    public /* synthetic */ y79(z79 z79Var, int i) {
        this.a = i;
        this.b = z79Var;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        z79 z79Var = this.b;
        switch (i) {
            case 0:
                z79Var.f = null;
                z79Var.c(true);
                z79Var.g = 3;
                break;
            default:
                z79Var.f = null;
                z79Var.d();
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
    }
}
