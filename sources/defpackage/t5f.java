package defpackage;

import android.animation.Animator;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class t5f implements Animator.AnimatorListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ w5f b;
    public final /* synthetic */ r5f c;
    public final /* synthetic */ w5f d;
    public final /* synthetic */ j5f e;

    public t5f(View view, w5f w5fVar, r5f r5fVar, w5f w5fVar2, j5f j5fVar) {
        this.a = view;
        this.b = w5fVar;
        this.c = r5fVar;
        this.d = w5fVar2;
        this.e = j5fVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        View view = this.a;
        view.setVisibility(8);
        view.setTranslationY(0.0f);
        this.b.i.put(this.c, (Object) null);
        this.d.removeView(this.e);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.a;
        view.setVisibility(8);
        view.setTranslationY(0.0f);
        this.b.i.put(this.c, (Object) null);
        this.d.removeView(this.e);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
