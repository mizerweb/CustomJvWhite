package defpackage;

import android.animation.Animator;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class rha implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tha b;
    public final /* synthetic */ ny8 c;

    public /* synthetic */ rha(tha thaVar, ny8 ny8Var, int i) {
        this.a = i;
        this.b = thaVar;
        this.c = ny8Var;
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
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
        ny8 ny8Var = this.c;
        tha thaVar = this.b;
        switch (i) {
            case 0:
                ImageView imageView = thaVar.k;
                imageView.setAlpha(0.0f);
                imageView.setVisibility(0);
                thaVar.b.setTranslationX(0.0f);
                if (ny8Var.d()) {
                    ((gig) ny8Var.getValue()).setTranslationX(0.0f);
                }
                break;
            default:
                thaVar.f.setTranslationX(0.0f);
                thaVar.b.setTranslationX(0.0f);
                if (ny8Var.d()) {
                    ((gig) ny8Var.getValue()).setTranslationX(0.0f);
                }
                thaVar.k.setVisibility(0);
                break;
        }
    }
}
