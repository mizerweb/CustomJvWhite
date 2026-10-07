package defpackage;

import android.animation.Animator;

/* JADX INFO: loaded from: classes2.dex */
public final class oyi implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pyi b;

    public /* synthetic */ oyi(pyi pyiVar, int i) {
        this.a = i;
        this.b = pyiVar;
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
        pyi pyiVar = this.b;
        switch (i) {
            case 0:
                pyiVar.u = null;
                pyiVar.v = false;
                break;
            default:
                pyiVar.r = null;
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
