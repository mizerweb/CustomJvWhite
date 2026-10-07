package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class r7g extends gr4 implements View.OnAttachStateChangeListener {
    public boolean d;
    public final boolean e;
    public boolean f;
    public ViewGroup g;
    public er4 h;

    public r7g(boolean z) {
        this.d = z;
        this.e = true;
    }

    @Override // defpackage.gr4
    public final void a() {
        er4 er4Var = this.h;
        if (er4Var != null) {
            er4Var.a();
        }
        this.h = null;
        ViewGroup viewGroup = this.g;
        if (viewGroup != null) {
            viewGroup.removeOnAttachStateChangeListener(this);
        }
        this.g = null;
    }

    @Override // defpackage.gr4
    public final gr4 b() {
        return new r7g(this.d);
    }

    @Override // defpackage.gr4
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.gr4
    public final boolean e() {
        return this.e;
    }

    @Override // defpackage.gr4
    public final void f(gr4 gr4Var, br4 br4Var) {
        this.f = true;
    }

    @Override // defpackage.gr4
    public final void g(ViewGroup viewGroup, View view, View view2, boolean z, er4 er4Var) {
        if (this.f) {
            return;
        }
        if (view != null && (!z || this.d)) {
            viewGroup.removeView(view);
        }
        if (view2 != null && view2.getParent() == null) {
            viewGroup.addView(view2);
        }
        if (viewGroup.getWindowToken() != null) {
            er4Var.a();
            return;
        }
        this.h = er4Var;
        this.g = viewGroup;
        viewGroup.addOnAttachStateChangeListener(this);
    }

    @Override // defpackage.gr4
    public final void h(Bundle bundle) {
        this.d = bundle.getBoolean("SimpleSwapChangeHandler.removesFromViewOnPush");
    }

    @Override // defpackage.gr4
    public final void i(Bundle bundle) {
        bundle.putBoolean("SimpleSwapChangeHandler.removesFromViewOnPush", this.d);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        er4 er4Var = this.h;
        if (er4Var != null) {
            er4Var.a();
        }
        this.h = null;
        ViewGroup viewGroup = this.g;
        if (viewGroup != null) {
            viewGroup.removeOnAttachStateChangeListener(this);
        }
        this.g = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public r7g() {
        this(true);
    }
}
