package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class n7j {
    public static final Rect a = new Rect();

    public static final void a(ViewGroup viewGroup, View view, Integer num) {
        if (view.getParent() == null) {
            viewGroup.addView(view, num != null ? num.intValue() : -1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View$OnLayoutChangeListener, java.lang.Object, k7j] */
    public static final void c(View view, final long j, cf7 cf7Var) {
        final Handler handler = new Handler(Looper.getMainLooper());
        final wfe wfeVar = new wfe();
        ?? r3 = new View.OnLayoutChangeListener() { // from class: k7j
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                Handler handler2 = handler;
                handler2.removeCallbacksAndMessages(null);
                handler2.postDelayed((Runnable) wfeVar.a, j);
            }
        };
        wfeVar.a = new w77(handler, view, r3, cf7Var, 5);
        view.addOnLayoutChangeListener(r3);
        if (view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new m7j(view, handler, view, r3));
        } else {
            handler.removeCallbacksAndMessages(null);
            view.removeOnLayoutChangeListener(r3);
        }
        handler.postDelayed((Runnable) wfeVar.a, j);
    }

    public static void e(View view, af7 af7Var) {
        ytb ytbVar = new ytb(view, af7Var);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(ytbVar);
        }
        view.addOnAttachStateChangeListener(ytbVar);
    }

    public static final View f(View view, int i) {
        if (view.getId() == i) {
            return view;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                View view2 = (View) parent;
                if (view2.getId() == i) {
                    return view2;
                }
            }
        }
        return null;
    }

    public static final Integer g(View view) {
        Insets insets;
        if (Build.VERSION.SDK_INT < 30) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets != null) {
                return Integer.valueOf(rootWindowInsets.getSystemWindowInsetBottom());
            }
            return null;
        }
        WindowInsets rootWindowInsets2 = view.getRootWindowInsets();
        if (rootWindowInsets2 == null || (insets = rootWindowInsets2.getInsets(8)) == null) {
            return null;
        }
        return Integer.valueOf(insets.bottom);
    }

    public static final Integer h(View view) {
        Insets insetsIgnoringVisibility;
        if (Build.VERSION.SDK_INT < 30) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets != null) {
                return Integer.valueOf(rootWindowInsets.getStableInsetBottom());
            }
            return null;
        }
        WindowInsets rootWindowInsets2 = view.getRootWindowInsets();
        if (rootWindowInsets2 == null || (insetsIgnoringVisibility = rootWindowInsets2.getInsetsIgnoringVisibility(WindowInsets.Type.systemBars())) == null) {
            return null;
        }
        return Integer.valueOf(insetsIgnoringVisibility.bottom);
    }

    public static final View i(ny8 ny8Var) {
        if (o(ny8Var)) {
            return (View) ny8Var.getValue();
        }
        return null;
    }

    public static final int j(ny8 ny8Var) {
        if (ny8Var.d()) {
            return ((View) ny8Var.getValue()).getMeasuredHeight();
        }
        return 0;
    }

    public static final int k(ny8 ny8Var) {
        if (ny8Var.d()) {
            return ((View) ny8Var.getValue()).getMeasuredWidth();
        }
        return 0;
    }

    public static final Integer l(View view) {
        Insets insetsIgnoringVisibility;
        if (Build.VERSION.SDK_INT < 30) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets != null) {
                return Integer.valueOf(rootWindowInsets.getStableInsetTop());
            }
            return null;
        }
        WindowInsets rootWindowInsets2 = view.getRootWindowInsets();
        if (rootWindowInsets2 == null || (insetsIgnoringVisibility = rootWindowInsets2.getInsetsIgnoringVisibility(WindowInsets.Type.systemBars())) == null) {
            return null;
        }
        return Integer.valueOf(insetsIgnoringVisibility.top);
    }

    public static final void m(ViewStub viewStub, View view, af7 af7Var) {
        if (n(viewStub)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
        int iIndexOfChild = viewGroup.indexOfChild(viewStub);
        viewGroup.removeViewInLayout(viewStub);
        ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
        layoutParams.height = view.getLayoutParams().height;
        layoutParams.width = view.getLayoutParams().width;
        view.setId(viewStub.getId());
        viewGroup.addView(view, iIndexOfChild, layoutParams);
        if (af7Var != null) {
            af7Var.invoke();
        }
    }

    public static final boolean n(ViewStub viewStub) {
        return viewStub.getParent() == null;
    }

    public static final boolean o(ny8 ny8Var) {
        return ny8Var.d() && ((View) ny8Var.getValue()).getVisibility() == 0;
    }

    public static final void p(View view, Runnable runnable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            runnable.run();
            return;
        }
        Handler handler = view.getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(runnable);
        } else {
            view.post(runnable);
        }
    }
}
