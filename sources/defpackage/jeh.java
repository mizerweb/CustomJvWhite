package defpackage;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class jeh implements Animator.AnimatorListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ View c;
    public final /* synthetic */ View d;
    public final /* synthetic */ keh.a e;

    public jeh(ViewGroup viewGroup, boolean z, View view, View view2, keh.a aVar) {
        this.a = viewGroup;
        this.b = z;
        this.c = view;
        this.d = view2;
        this.e = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.b ? this.c : this.d;
        ViewGroup viewGroup = this.a;
        viewGroup.addView(ax.b(viewGroup.getContext(), null, this.e.k, 2), viewGroup.indexOfChild(view));
    }
}
