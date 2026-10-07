package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i4m {
    public static boolean a(ViewParent viewParent, ViewGroup viewGroup, float f, float f2, boolean z) {
        try {
            return viewParent.onNestedFling(viewGroup, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    public static boolean b(ViewParent viewParent, ViewGroup viewGroup, float f, float f2) {
        try {
            return viewParent.onNestedPreFling(viewGroup, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    public static void c(ViewParent viewParent, ViewGroup viewGroup, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof fcb) {
            ((fcb) viewParent).g(viewGroup, i, i2, iArr, i3);
            return;
        }
        if (i3 == 0) {
            try {
                viewParent.onNestedPreScroll(viewGroup, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
            }
        }
    }

    public static void d(ViewParent viewParent, ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof gcb) {
            ((gcb) viewParent).m(viewGroup, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof fcb) {
            ((fcb) viewParent).n(viewGroup, i, i2, i3, i4, i5);
            return;
        }
        if (i5 == 0) {
            try {
                viewParent.onNestedScroll(viewGroup, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e);
            }
        }
    }

    public static void e(ViewParent viewParent, View view, ViewGroup viewGroup, int i, int i2) {
        if (viewParent instanceof fcb) {
            ((fcb) viewParent).e(view, viewGroup, i, i2);
            return;
        }
        if (i2 == 0) {
            try {
                viewParent.onNestedScrollAccepted(view, viewGroup, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
            }
        }
    }

    public static boolean f(ViewParent viewParent, View view, ViewGroup viewGroup, int i, int i2) {
        if (viewParent instanceof fcb) {
            return ((fcb) viewParent).o(view, viewGroup, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        try {
            return viewParent.onStartNestedScroll(view, viewGroup, i);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
            return false;
        }
    }

    public static void g(ViewParent viewParent, ViewGroup viewGroup, int i) {
        if (viewParent instanceof fcb) {
            ((fcb) viewParent).f(viewGroup, i);
            return;
        }
        if (i == 0) {
            try {
                viewParent.onStopNestedScroll(viewGroup);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
            }
        }
    }

    public static Throwable h(o1 o1Var) {
        return o1Var.p();
    }
}
