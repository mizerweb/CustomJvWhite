package defpackage;

import android.animation.Animator;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public final class t0i implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0i b;

    public /* synthetic */ t0i(u0i u0iVar, int i) {
        this.a = i;
        this.b = u0iVar;
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

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                this.b.c.setVisibility(8);
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
        u0i u0iVar = this.b;
        switch (i) {
            case 0:
                u0iVar.q = true;
                break;
            case 1:
                break;
            default:
                u0iVar.b.setAlpha(0.0f);
                ImageView imageView = u0iVar.c;
                imageView.setAlpha(255.0f);
                imageView.setVisibility(0);
                break;
        }
    }
}
