package defpackage;

import android.animation.Animator;

/* JADX INFO: loaded from: classes2.dex */
public final class da0 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ha0 b;

    public /* synthetic */ da0(ha0 ha0Var, int i) {
        this.a = i;
        this.b = ha0Var;
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

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
        ha0 ha0Var = this.b;
        switch (i) {
            case 0:
                animator.end();
                ha0Var.requestLayout();
                break;
            default:
                if (!ha0Var.h.d) {
                    ha0Var.getTranscriptionView().setVisibility(8);
                }
                ha0Var.getTranscriptionView().setAlpha(1.0f);
                ha0Var.r.q = false;
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                break;
            default:
                ha0 ha0Var = this.b;
                if (!ha0Var.h.d) {
                    ha0Var.getTranscriptionView().setVisibility(8);
                }
                ha0Var.getTranscriptionView().setAlpha(1.0f);
                ha0Var.r.q = false;
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
