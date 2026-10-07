package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class hr3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ir3 b;

    public /* synthetic */ hr3(ir3 ir3Var, int i) {
        this.a = i;
        this.b = ir3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                ir3 ir3Var = this.b;
                ir3Var.c();
                gi giVar = ir3Var.j;
                if (giVar != null) {
                    giVar.a((yc8) ir3Var.a);
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationRepeat(animator);
                ir3 ir3Var = this.b;
                ir3Var.g = (ir3Var.g + 4) % ir3Var.f.c.length;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
