package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class e1d extends AnimatorListenerAdapter {
    public final /* synthetic */ f1d a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ev1 c;
    public final /* synthetic */ RectF d;
    public final /* synthetic */ vx9 e;

    public e1d(f1d f1dVar, View view, ev1 ev1Var, RectF rectF, vx9 vx9Var) {
        this.a = f1dVar;
        this.b = view;
        this.c = ev1Var;
        this.d = rectF;
        this.e = vx9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        RectF rectF = this.d;
        f1d f1dVar = this.a;
        View view = this.b;
        ev1 ev1Var = this.c;
        f1d.a(f1dVar, view, ev1Var, rectF);
        this.e.invoke();
        if (f1d.b()) {
            view.setLayerType(0, null);
            ev1Var.setLayerType(0, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        RectF rectF = this.d;
        f1d f1dVar = this.a;
        View view = this.b;
        ev1 ev1Var = this.c;
        f1d.a(f1dVar, view, ev1Var, rectF);
        this.e.invoke();
        if (f1d.b()) {
            view.setLayerType(0, null);
            ev1Var.setLayerType(0, null);
        }
    }
}
