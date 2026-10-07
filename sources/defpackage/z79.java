package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: loaded from: classes4.dex */
public final class z79 {
    public final k96 a;
    public final p7b b;
    public final wre c;
    public tee d;
    public b65 e;
    public Animator f;
    public int g = 1;
    public boolean h;
    public Boolean i;

    public z79(k96 k96Var, p7b p7bVar, wre wreVar) {
        this.a = k96Var;
        this.b = p7bVar;
        this.c = wreVar;
    }

    public final void a() {
        tee teeVar = this.d;
        tp3 tp3Var = teeVar instanceof tp3 ? (tp3) teeVar : null;
        if (tp3Var == null) {
            return;
        }
        b();
        this.g = 2;
        c(false);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(tp3Var.e, 1.0f);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.setInterpolator(this.b.a);
        valueAnimatorOfFloat.addUpdateListener(new x79(tp3Var, this, 1));
        valueAnimatorOfFloat.addListener(new y79(this, 0));
        valueAnimatorOfFloat.start();
        this.f = valueAnimatorOfFloat;
    }

    public final void b() {
        Animator animator = this.f;
        if (animator != null) {
            animator.removeAllListeners();
        }
        Animator animator2 = this.f;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.f = null;
    }

    public final void c(boolean z) {
        vee layoutManager = this.a.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || z == (!this.h)) {
            return;
        }
        linearLayoutManager.h = z;
        this.h = !z;
    }

    public final void d() {
        b();
        tee teeVar = this.d;
        k96 k96Var = this.a;
        if (teeVar != null) {
            k96Var.o0(teeVar);
        }
        this.d = null;
        b65 b65Var = this.e;
        if (b65Var != null) {
            k96Var.q0(b65Var);
        }
        this.e = null;
        c(true);
        Boolean bool = this.i;
        if (bool != null) {
            k96Var.setClipChildren(bool.booleanValue());
        }
        this.i = null;
        int childCount = k96Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Drawable background = k96Var.getChildAt(i).getBackground();
            RippleDrawable rippleDrawable = background instanceof RippleDrawable ? (RippleDrawable) background : null;
            if (rippleDrawable != null) {
                ch3.g0(rippleDrawable, 0, 0, 0, 14);
            }
        }
        k96Var.X();
        k96Var.requestLayout();
        k96Var.invalidate();
        this.g = 1;
    }
}
