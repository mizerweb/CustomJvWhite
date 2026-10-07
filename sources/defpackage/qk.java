package defpackage;

import android.animation.Animator;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class qk implements Animator.AnimatorListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;

    public qk(View view, float f, float f2, boolean z) {
        this.a = view;
        this.b = f;
        this.c = f2;
        this.d = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        float f = this.c;
        View view = this.a;
        view.setAlpha(f);
        view.setVisibility(this.d ? 0 : 8);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f = this.c;
        View view = this.a;
        view.setAlpha(f);
        view.setVisibility(this.d ? 0 : 8);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        float f = this.b;
        View view = this.a;
        view.setAlpha(f);
        view.setVisibility(0);
    }
}
