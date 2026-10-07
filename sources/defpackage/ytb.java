package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class ytb implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public static final Handler e = new Handler(Looper.getMainLooper());
    public final View a;
    public final af7 b;
    public ViewTreeObserver c;
    public boolean d;

    public ytb(View view, af7 af7Var) {
        this.a = view;
        this.b = af7Var;
        this.c = view.getViewTreeObserver();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean z = true;
        if (!this.d) {
            boolean zBooleanValue = ((Boolean) this.b.invoke()).booleanValue();
            this.d = true;
            e.post(new e6(25, this));
            z = zBooleanValue;
        }
        if (!z) {
            gm0.x("OneShotOnPreDrawListener", "skipping frame", null);
        }
        return z;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.c.isAlive();
        View view2 = this.a;
        if (zIsAlive) {
            this.c.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
