package defpackage;

import android.animation.Animator;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class vw1 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ View d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ View f;
    public final /* synthetic */ boolean g;

    public /* synthetic */ vw1(yk ykVar, View view, boolean z, View view2, boolean z2, View view3, boolean z3, int i) {
        this.a = i;
        this.b = view;
        this.c = z;
        this.d = view2;
        this.e = z2;
        this.f = view3;
        this.g = z3;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
        boolean z = this.e;
        View view = this.d;
        switch (i) {
            case 0:
                int i2 = ww1.m;
                uy1 uy1Var = view instanceof uy1 ? (uy1) view : null;
                if (uy1Var != null) {
                    uy1Var.h(z);
                }
                if (z) {
                    view.setOutlineProvider(null);
                }
                break;
            default:
                int i3 = g22.m;
                wy1 wy1Var = view instanceof wy1 ? (wy1) view : null;
                if (wy1Var != null) {
                    wy1Var.b(z);
                }
                if (z) {
                    view.setOutlineProvider(null);
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        boolean z = this.c;
        View view = this.b;
        switch (i) {
            case 0:
                int i2 = ww1.m;
                uy1 uy1Var = view instanceof uy1 ? (uy1) view : null;
                if (uy1Var != null) {
                    uy1Var.h(z);
                }
                if (z) {
                    view.setOutlineProvider(null);
                }
                break;
            default:
                int i3 = g22.m;
                wy1 wy1Var = view instanceof wy1 ? (wy1) view : null;
                if (wy1Var != null) {
                    wy1Var.b(z);
                }
                if (z) {
                    view.setOutlineProvider(null);
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
        boolean z = this.g;
        View view = this.f;
        switch (i) {
            case 0:
                uy1 uy1Var = view instanceof uy1 ? (uy1) view : null;
                if (uy1Var != null) {
                    uy1Var.j(z);
                }
                break;
            default:
                wy1 wy1Var = view instanceof wy1 ? (wy1) view : null;
                if (wy1Var != null) {
                    wy1Var.c(z);
                }
                break;
        }
    }
}
