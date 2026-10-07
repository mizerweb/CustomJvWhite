package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class r6j implements View.OnAttachStateChangeListener {
    public boolean a;
    public boolean b;
    public boolean c;
    public int d;
    public v56 e;
    public q6j f;

    public static View a(ViewGroup viewGroup) {
        if (viewGroup.getChildCount() == 0) {
            return viewGroup;
        }
        View childAt = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
        return childAt instanceof ViewGroup ? a((ViewGroup) childAt) : childAt;
    }

    public final void b() {
        if (!this.a || !this.b || this.c || this.d == 3) {
            return;
        }
        this.d = 3;
        br4 br4Var = (br4) this.e.b;
        br4Var.viewIsAttached = true;
        br4Var.viewWasDetached = false;
        br4Var.attach(br4Var.view);
    }

    public final void c(boolean z) {
        v56 v56Var = this.e;
        boolean z2 = this.d == 2;
        if (z) {
            this.d = 2;
        } else {
            this.d = 1;
        }
        if (z2 && !z) {
            br4 br4Var = (br4) v56Var.b;
            if (br4Var.isDetachFrozen) {
                return;
            }
            br4Var.detach(br4Var.view, false, false);
            return;
        }
        br4 br4Var2 = (br4) v56Var.b;
        br4Var2.viewIsAttached = false;
        br4Var2.viewWasDetached = true;
        if (br4Var2.isDetachFrozen) {
            return;
        }
        br4Var2.detach(br4Var2.view, false, z);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.a) {
            return;
        }
        this.a = true;
        t3a t3aVar = new t3a(this);
        if (!(view instanceof ViewGroup)) {
            this.b = true;
            b();
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getChildCount() == 0) {
            this.b = true;
            b();
        } else {
            this.f = new q6j(this, t3aVar);
            a(viewGroup).addOnAttachStateChangeListener(this.f);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a = false;
        if (this.b) {
            this.b = false;
            c(false);
        }
    }
}
