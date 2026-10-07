package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class r19 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s19 b;

    public /* synthetic */ r19(s19 s19Var, int i) {
        this.a = i;
        this.b = s19Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                s19 s19Var = this.b;
                s19Var.c();
                gi giVar = s19Var.j;
                if (giVar != null) {
                    giVar.a((yc8) s19Var.a);
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
                s19 s19Var = this.b;
                s19Var.g = (s19Var.g + 1) % s19Var.f.c.length;
                s19Var.h = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
