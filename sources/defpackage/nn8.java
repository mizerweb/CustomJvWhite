package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class nn8 implements Animator.AnimatorListener {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final lfe e;
    public final int f;
    public final ValueAnimator g;
    public boolean h;
    public float i;
    public float j;
    public boolean k = false;
    public boolean l = false;
    public float m;
    public final /* synthetic */ int n;
    public final /* synthetic */ lfe o;
    public final /* synthetic */ rn8 p;

    public nn8(rn8 rn8Var, lfe lfeVar, int i, float f, float f2, float f3, float f4, int i2, lfe lfeVar2) {
        this.p = rn8Var;
        this.n = i2;
        this.o = lfeVar2;
        this.f = i;
        this.e = lfeVar;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.g = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new m11(3, this));
        valueAnimatorOfFloat.setTarget(lfeVar.a);
        valueAnimatorOfFloat.addListener(this);
        this.m = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.l) {
            this.e.y(true);
        }
        this.l = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.m = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (this.k) {
            return;
        }
        int i = this.n;
        lfe lfeVar = this.o;
        rn8 rn8Var = this.p;
        if (i <= 0) {
            rn8Var.m.b(rn8Var.r, lfeVar);
        } else {
            rn8Var.a.add(lfeVar.a);
            this.h = true;
            if (i > 0) {
                rn8Var.r.post(new og7(rn8Var, this, i));
            }
        }
        View view = rn8Var.w;
        View view2 = lfeVar.a;
        if (view == view2 && view2 == view) {
            rn8Var.w = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
