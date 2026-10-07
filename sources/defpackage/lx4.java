package defpackage;

import android.animation.Animator;

/* JADX INFO: loaded from: classes2.dex */
public final class lx4 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ mx4 b;

    public /* synthetic */ lx4(mx4 mx4Var, int i) {
        this.a = i;
        this.b = mx4Var;
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

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    private final void i(Animator animator) {
    }

    private final void j(Animator animator) {
    }

    private final void k(Animator animator) {
    }

    private final void l(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
        mx4 mx4Var = this.b;
        switch (i) {
            case 0:
                mx4Var.q1 = null;
                break;
            case 2:
                mx4Var.J1 = null;
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        mx4 mx4Var = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                mx4Var.q1 = null;
                if (mx4Var.isAttachedToWindow()) {
                    mx4Var.N();
                    mx4.R(mx4Var);
                }
                break;
            case 2:
                break;
            default:
                mx4Var.J1 = null;
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
