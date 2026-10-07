package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import one.me.android.root.RootController;

/* JADX INFO: loaded from: classes2.dex */
public final class hn2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public hn2(nl6 nl6Var) {
        this.a = 1;
        this.c = nl6Var;
        this.b = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                super.onAnimationCancel(animator);
                this.b = true;
                ((in2) obj).c.invoke();
                break;
            case 1:
                this.b = true;
                break;
            default:
                boolean z = this.b;
                zv8[] zv8VarArr = RootController.k;
                ((RootController) obj).t1(z);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (!this.b) {
                    ((in2) obj).c(false);
                }
                break;
            case 1:
                nl6 nl6Var = (nl6) obj;
                if (this.b) {
                    this.b = false;
                } else if (((Float) nl6Var.z.getAnimatedValue()).floatValue() != 0.0f) {
                    nl6Var.A = 2;
                    nl6Var.s.invalidate();
                } else {
                    nl6Var.A = 0;
                    nl6Var.l(0);
                }
                break;
            default:
                boolean z = this.b;
                zv8[] zv8VarArr = RootController.k;
                ((RootController) obj).t1(z);
                break;
        }
    }

    public hn2(RootController rootController, boolean z) {
        this.a = 2;
        this.c = rootController;
        this.b = z;
    }

    public hn2(in2 in2Var) {
        this.a = 0;
        this.c = in2Var;
    }
}
