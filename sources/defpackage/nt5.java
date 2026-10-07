package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class nt5 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public static final Handler e = new Handler(Looper.getMainLooper());
    public final View a;
    public final cf7 b;
    public int c;
    public ViewTreeObserver d;

    public nt5(View view, cf7 cf7Var) {
        this.a = view;
        this.b = cf7Var;
        this.d = view.getViewTreeObserver();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = this.c;
        this.c = i + 1;
        if (((Boolean) this.b.invoke(Integer.valueOf(i))).booleanValue()) {
            e.post(new e6(12, this));
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.d = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.d.isAlive();
        View view2 = this.a;
        if (zIsAlive) {
            this.d.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
