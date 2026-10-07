package defpackage;

import android.animation.Animator;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public abstract class yk extends gr4 {
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public Animator h;
    public wk i;
    public boolean j;

    public /* synthetic */ yk(long j, int i) {
        this((i & 1) != 0 ? -1L : j, true);
    }

    @Override // defpackage.gr4
    public final void a() {
        this.f = true;
        Animator animator = this.h;
        if (animator != null) {
            animator.end();
            return;
        }
        wk wkVar = this.i;
        if (wkVar != null) {
            wkVar.a();
        }
    }

    @Override // defpackage.gr4
    public boolean d() {
        return this.j;
    }

    @Override // defpackage.gr4
    public final void f(gr4 gr4Var, br4 br4Var) {
        this.e = true;
        Animator animator = this.h;
        if (animator != null) {
            animator.cancel();
            return;
        }
        wk wkVar = this.i;
        if (wkVar != null) {
            wkVar.a();
        }
    }

    @Override // defpackage.gr4
    public final void g(ViewGroup viewGroup, View view, View view2, boolean z, er4 er4Var) {
        boolean z2 = view2 != null && view2.getParent() == null;
        if (z2) {
            if (z || view == null) {
                viewGroup.addView(view2);
            } else if (view2.getParent() == null) {
                viewGroup.addView(view2, viewGroup.indexOfChild(view));
            }
            if (view2.getWidth() <= 0 && view2.getHeight() <= 0) {
                this.i = new wk(this, er4Var, view, view2, viewGroup, z);
                view2.getViewTreeObserver().addOnPreDrawListener(this.i);
                return;
            }
        }
        m(viewGroup, view, view2, z, z2, er4Var);
    }

    @Override // defpackage.gr4
    public final void h(Bundle bundle) {
        this.d = bundle.getLong("AnimatorChangeHandler.duration");
        this.j = bundle.getBoolean("AnimatorChangeHandler.removesFromViewOnPush");
    }

    @Override // defpackage.gr4
    public final void i(Bundle bundle) {
        bundle.putLong("AnimatorChangeHandler.duration", this.d);
        bundle.putBoolean("AnimatorChangeHandler.removesFromViewOnPush", d());
    }

    public final void k(er4 er4Var, xk xkVar) {
        if (!this.g) {
            this.g = true;
            er4Var.a();
        }
        Animator animator = this.h;
        if (animator != null) {
            if (xkVar != null) {
                animator.removeListener(xkVar);
            }
            this.h.cancel();
            this.h = null;
        }
        this.i = null;
    }

    public abstract Animator l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2);

    public final void m(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2, er4 er4Var) {
        if (this.e) {
            k(er4Var, null);
            return;
        }
        if (!this.f) {
            Animator animatorL = l(viewGroup, view, view2, z, z2);
            this.h = animatorL;
            long j = this.d;
            if (j > 0) {
                animatorL.setDuration(j);
            }
            this.h.addListener(new xk(this, er4Var, view, view2, viewGroup, z));
            this.h.start();
            return;
        }
        if (view != null && (!z || d())) {
            viewGroup.removeView(view);
        }
        k(er4Var, null);
        if (!z || view == null) {
            return;
        }
        n(view);
    }

    public abstract void n(View view);

    public yk() {
        this(0L, 3);
    }

    public yk(long j, boolean z) {
        this.d = j;
        this.j = z;
    }

    public yk(int i) {
        this(-1L, true);
    }
}
