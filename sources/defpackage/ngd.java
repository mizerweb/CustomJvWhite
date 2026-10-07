package defpackage;

import android.animation.Animator;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class ngd implements Animator.AnimatorListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ rcc f;
    public final /* synthetic */ float g;
    public final /* synthetic */ sz0 h;

    public ngd(View view, ogd ogdVar, View view2, float f, float f2, float f3, rcc rccVar, float f4, sz0 sz0Var) {
        this.a = view;
        this.b = view2;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = rccVar;
        this.g = f4;
        this.h = sz0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f = this.c;
        View view = this.a;
        if (view != null) {
            ogd.o(view, this.b, f, this.d, this.e);
        }
        this.f.setScaleX(this.g);
        sz0 sz0Var = this.h;
        if (sz0Var != null) {
            float fU = oc9.u(ogd.u(f), 0.0f, 25.0f);
            float f2 = sz0Var.k;
            sz0Var.k = fU;
            if (f2 == fU) {
                return;
            }
            sz0Var.invalidateSelf();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
