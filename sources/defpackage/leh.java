package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class leh extends c4m {
    public int a;
    public int b = -1;
    public final /* synthetic */ SwipeDismissBehavior c;

    public leh(SwipeDismissBehavior swipeDismissBehavior) {
        this.c = swipeDismissBehavior;
    }

    @Override // defpackage.c4m
    public final int a(View view, int i) {
        int width;
        int width2;
        WeakHashMap weakHashMap = i7j.a;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.c.d;
        if (i2 == 0) {
            width = this.a;
            if (z) {
                width -= view.getWidth();
                width2 = this.a;
            } else {
                width2 = view.getWidth() + width;
            }
        } else {
            int i3 = this.a;
            if (i2 != 1) {
                width = i3 - view.getWidth();
                width2 = this.a + view.getWidth();
            } else if (z) {
                width2 = view.getWidth() + i3;
                width = i3;
            } else {
                width = i3 - view.getWidth();
                width2 = this.a;
            }
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // defpackage.c4m
    public final int b(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.c4m
    public final int e(View view) {
        return view.getWidth();
    }

    @Override // defpackage.c4m
    public final void g(View view, int i) {
        this.b = i;
        this.a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.c;
            swipeDismissBehavior.c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.c = false;
        }
    }

    @Override // defpackage.c4m
    public final void h(int i) {
    }

    @Override // defpackage.c4m
    public final void i(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.c;
        float f = width * swipeDismissBehavior.e;
        float width2 = view.getWidth() * swipeDismissBehavior.f;
        float fAbs = Math.abs(i - this.a);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    @Override // defpackage.c4m
    public final void j(View view, float f, float f2) {
        int i;
        int left;
        int i2;
        this.b = -1;
        int width = view.getWidth();
        boolean z = false;
        SwipeDismissBehavior swipeDismissBehavior = this.c;
        if (f != 0.0f) {
            WeakHashMap weakHashMap = i7j.a;
            boolean z2 = view.getLayoutDirection() == 1;
            int i3 = swipeDismissBehavior.d;
            if (i3 != 2 && (i3 != 0 ? i3 != 1 || (!z2 ? f < 0.0f : f > 0.0f) : !z2 ? f > 0.0f : f < 0.0f)) {
                i = this.a;
            } else {
                if (f >= 0.0f) {
                    left = view.getLeft();
                    i2 = this.a;
                    if (left < i2) {
                        i = this.a - width;
                    } else {
                        i = i2 + width;
                    }
                } else {
                    i = this.a - width;
                }
                z = true;
            }
        } else {
            if (Math.abs(view.getLeft() - this.a) >= Math.round(view.getWidth() * 0.5f)) {
                if (f >= 0.0f) {
                    left = view.getLeft();
                    i2 = this.a;
                    if (left < i2) {
                        i = this.a - width;
                    } else {
                        i = i2 + width;
                    }
                } else {
                    i = this.a - width;
                }
                z = true;
            } else {
                i = this.a;
            }
        }
        if (swipeDismissBehavior.a.o(i, view.getTop())) {
            og7 og7Var = new og7(swipeDismissBehavior, view, z);
            WeakHashMap weakHashMap2 = i7j.a;
            view.postOnAnimation(og7Var);
        }
    }

    @Override // defpackage.c4m
    public final boolean k(View view, int i) {
        int i2 = this.b;
        return (i2 == -1 || i2 == i) && this.c.s();
    }
}
