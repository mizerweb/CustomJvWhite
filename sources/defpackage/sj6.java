package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class sj6 extends AnimatorListenerAdapter implements q2i {
    public final View a;
    public boolean b = false;

    public sj6(View view) {
        this.a = view;
    }

    @Override // defpackage.q2i
    public final void a(r2i r2iVar) {
    }

    @Override // defpackage.q2i
    public final void b() {
        View view = this.a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? q9j.a.a(view) : 0.0f));
    }

    @Override // defpackage.q2i
    public final void c(r2i r2iVar) {
    }

    @Override // defpackage.q2i
    public final void d() {
        this.a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // defpackage.q2i
    public final void e(r2i r2iVar) {
    }

    @Override // defpackage.q2i
    public final void f(r2i r2iVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        q9j.d(this.a, 1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.b;
        View view = this.a;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        q9j.d(view, 1.0f);
        q9j.a.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }
}
