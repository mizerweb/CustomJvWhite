package defpackage;

import android.animation.Animator;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class lgd implements Animator.AnimatorListener {
    public final /* synthetic */ ku2 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ View d;
    public final /* synthetic */ View e;
    public final /* synthetic */ View f;

    public lgd(ku2 ku2Var, View view, TextView textView, View view2, View view3, kwb kwbVar) {
        this.a = ku2Var;
        this.b = view;
        this.c = textView;
        this.d = view2;
        this.e = view3;
        this.f = kwbVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ogd.q(this.b, this.c, this.d, this.e, this.f, 1.0f);
        this.a.setVisibility(8);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
