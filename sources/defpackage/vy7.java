package defpackage;

import android.animation.Animator;

/* JADX INFO: loaded from: classes4.dex */
public final class vy7 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y8j b;

    public /* synthetic */ vy7(y8j y8jVar, int i) {
        this.a = i;
        this.b = y8jVar;
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
        y8j y8jVar = this.b;
        switch (i) {
            case 0:
                y8jVar.b();
                break;
            case 1:
                y8jVar.b();
                break;
            default:
                y8jVar.b();
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        y8j y8jVar = this.b;
        switch (i) {
            case 0:
                y8jVar.b();
                break;
            case 1:
                y8jVar.b();
                break;
            default:
                y8jVar.b();
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
