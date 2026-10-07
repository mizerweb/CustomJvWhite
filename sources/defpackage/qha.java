package defpackage;

import android.animation.Animator;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class qha implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tha b;

    public /* synthetic */ qha(tha thaVar, int i) {
        this.a = i;
        this.b = thaVar;
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

    private final void m(Animator animator) {
    }

    private final void n(Animator animator) {
    }

    private final void o(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        tha thaVar = this.b;
        switch (i) {
            case 0:
                thaVar.k.setAlpha(1.0f);
                break;
            case 2:
                thaVar.k.setAlpha(1.0f);
                break;
            case 3:
                thaVar.k.setAlpha(1.0f);
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
        tha thaVar = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                ImageView imageView = thaVar.k;
                imageView.setAlpha(0.0f);
                imageView.setVisibility(0);
                break;
            case 2:
            case 3:
                break;
            default:
                thaVar.k.setVisibility(4);
                break;
        }
    }
}
