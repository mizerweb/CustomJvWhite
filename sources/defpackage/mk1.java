package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class mk1 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mk1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
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
                nk1 nk1Var = (nk1) this.b;
                View view = (View) this.c;
                view.setAlpha(1.0f);
                view.setClipBounds(null);
                b9b b9bVar = nk1Var.u;
                lfe lfeVar = (lfe) this.d;
                b9bVar.m(lfeVar);
                nk1Var.o(lfeVar);
                if (!((ValueAnimator) this.e).isRunning()) {
                    nk1Var.c();
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                nk1 nk1Var = (nk1) obj4;
                View view = (View) obj3;
                view.setAlpha(1.0f);
                view.setClipBounds(null);
                lfe lfeVar = (lfe) obj2;
                nk1Var.u.m(lfeVar);
                nk1Var.o(lfeVar);
                if (!((ValueAnimator) obj).isRunning()) {
                    nk1Var.c();
                }
                break;
            default:
                if (!((sfe) obj4).a) {
                    ((za2) obj3).invoke();
                }
                ((tp2) obj2).setAlpha(1.0f);
                ((tgd) obj).a = null;
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
