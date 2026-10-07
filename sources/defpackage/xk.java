package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes4.dex */
public final class xk extends AnimatorListenerAdapter {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ yk d;
    public final /* synthetic */ er4 e;
    public final /* synthetic */ boolean f;

    public xk(yk ykVar, er4 er4Var, View view, View view2, ViewGroup viewGroup, boolean z) {
        this.a = view;
        this.b = view2;
        this.c = viewGroup;
        this.d = ykVar;
        this.e = er4Var;
        this.f = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        yk ykVar = this.d;
        View view = this.a;
        if (view != null) {
            ykVar.n(view);
        }
        View view2 = this.b;
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            ViewGroup viewGroup = this.c;
            if (parent == viewGroup) {
                viewGroup.removeView(view2);
            }
        }
        ykVar.k(this.e, this);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        yk ykVar = this.d;
        if (ykVar.e || ykVar.h == null) {
            return;
        }
        boolean z = this.f;
        View view = this.a;
        if (view != null && (!z || ykVar.d())) {
            this.c.removeView(view);
        }
        ykVar.k(this.e, this);
        if (!z || view == null) {
            return;
        }
        ykVar.n(view);
    }
}
