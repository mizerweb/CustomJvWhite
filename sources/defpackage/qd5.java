package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import one.me.android.root.RootController;

/* JADX INFO: loaded from: classes2.dex */
public final class qd5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public qd5(wy1 wy1Var, boolean z, RootController rootController) {
        this.c = wy1Var;
        this.b = z;
        this.d = rootController;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                RootController rootController = (RootController) this.d;
                zv8[] zv8VarArr = RootController.k;
                rootController.t1(this.b);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                ((ViewGroup) this.c).endViewTransition(null);
                if (!z) {
                    throw null;
                }
                throw null;
            default:
                RootController rootController = (RootController) this.d;
                zv8[] zv8VarArr = RootController.k;
                rootController.t1(z);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                RootController rootController = (RootController) this.d;
                wy1 wy1Var = (wy1) this.c;
                boolean z = this.b;
                if (wy1Var != null) {
                    wy1Var.c(z);
                }
                zv8[] zv8VarArr = RootController.k;
                rootController.z1().setTranslationY(0.0f);
                if (!z) {
                    rootController.B1(false);
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public qd5(ViewGroup viewGroup, boolean z, oeg oegVar, rd5 rd5Var) {
        this.c = viewGroup;
        this.b = z;
        this.d = rd5Var;
    }
}
