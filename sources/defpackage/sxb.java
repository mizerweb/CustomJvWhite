package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class sxb extends AnimatorListenerAdapter {
    public final /* synthetic */ af7 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ txb c;
    public final /* synthetic */ float d;

    public sxb(af7 af7Var, boolean z, txb txbVar, float f) {
        this.a = af7Var;
        this.b = z;
        this.c = txbVar;
        this.d = f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        af7 af7Var = this.a;
        if (af7Var != null) {
            af7Var.invoke();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f = this.d;
        boolean z = this.b;
        txb txbVar = this.c;
        if (z) {
            txbVar.setVisibility(0);
            txbVar.setAlpha(1.0f);
            txbVar.e(f);
        } else {
            txbVar.setVisibility(8);
            txbVar.setAlpha(0.0f);
            txbVar.e(f);
        }
        af7 af7Var = this.a;
        if (af7Var != null) {
            af7Var.invoke();
        }
        if (txbVar.f == animator) {
            txbVar.f = null;
        }
    }
}
