package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class bdc implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View a;
    public ViewTreeObserver b;
    public final Runnable c;

    public bdc(View view, Runnable runnable) {
        this.a = view;
        this.b = view.getViewTreeObserver();
        this.c = runnable;
    }

    public static bdc a(View view, Runnable runnable) {
        if (view == null) {
            ore.n("view == null");
            return null;
        }
        bdc bdcVar = new bdc(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(bdcVar);
        view.addOnAttachStateChangeListener(bdcVar);
        return bdcVar;
    }

    public final void b() {
        boolean zIsAlive = this.b.isAlive();
        View view = this.a;
        if (zIsAlive) {
            this.b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        b();
        this.c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        b();
    }
}
