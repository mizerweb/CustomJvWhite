package defpackage;

import android.animation.Animator;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class k6e implements Animator.AnimatorListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ m6e b;
    public final /* synthetic */ View c;

    public k6e(boolean z, m6e m6eVar, View view) {
        this.a = z;
        this.b = m6eVar;
        this.c = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            boolean zBooleanValue = ((Boolean) this.b.a.invoke()).booleanValue();
            View view = this.c;
            if (zBooleanValue) {
                w5e w5eVar = view instanceof w5e ? (w5e) view : null;
                if (w5eVar == null || !w5eVar.b()) {
                    return;
                }
            }
            p0m.a(view, lt7.CONFIRM);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
