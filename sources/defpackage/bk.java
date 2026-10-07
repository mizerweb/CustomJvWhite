package defpackage;

import android.animation.Animator;
import android.util.Property;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class bk implements Animator.AnimatorListener {
    public final /* synthetic */ Property a;
    public final /* synthetic */ View b;
    public final /* synthetic */ float c;

    public bk(Property property, View view, float f) {
        this.a = property;
        this.b = view;
        this.c = f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.set(this.b, Float.valueOf(this.c));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
