package defpackage;

import android.animation.Animator;

/* JADX INFO: loaded from: classes3.dex */
public final class mgd implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ af7 b;

    public /* synthetic */ mgd(int i, af7 af7Var) {
        this.a = i;
        this.b = af7Var;
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
        switch (this.a) {
            case 0:
                break;
            default:
                this.b.invoke();
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.invoke();
                break;
            default:
                this.b.invoke();
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
