package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.search.SearchBar$ScrollingViewBehavior;
import defpackage.bt4;
import defpackage.et4;
import defpackage.i7j;
import defpackage.ixj;
import defpackage.k3e;
import defpackage.n8j;
import defpackage.np4;
import defpackage.rq;
import defpackage.ys4;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends n8j {
    public final Rect c;
    public final Rect d;
    public int e;
    public final int f;

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        this.c = new Rect();
        this.d = new Rect();
        this.e = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k3e.x);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static rq u(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = (View) list.get(i);
            if (view instanceof rq) {
                return (rq) view;
            }
        }
        return null;
    }

    @Override // defpackage.ys4
    public final boolean b(View view, View view2) {
        return view2 instanceof rq;
    }

    @Override // defpackage.ys4
    public boolean d(et4 et4Var, View view, View view2) {
        ys4 ys4Var = ((bt4) view2.getLayoutParams()).a;
        if (ys4Var instanceof AppBarLayout$BaseBehavior) {
            int bottom = (((view2.getBottom() - view.getTop()) + ((AppBarLayout$BaseBehavior) ys4Var).j) + this.e) - v(view2);
            WeakHashMap weakHashMap = i7j.a;
            view.offsetTopAndBottom(bottom);
        }
        if (!(view2 instanceof rq)) {
            return false;
        }
        rq rqVar = (rq) view2;
        if (!rqVar.l) {
            return false;
        }
        rqVar.h(rqVar.i(view));
        return false;
    }

    @Override // defpackage.ys4
    public final void e(et4 et4Var, View view) {
        if (view instanceof rq) {
            i7j.l(et4Var, null);
        }
    }

    @Override // defpackage.ys4
    public final boolean i(et4 et4Var, View view, int i, int i2, int i3) {
        rq rqVarU;
        ixj lastWindowInsets;
        int i4 = view.getLayoutParams().height;
        if ((i4 != -1 && i4 != -2) || (rqVarU = u(et4Var.d(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size > 0) {
            WeakHashMap weakHashMap = i7j.a;
            if (rqVarU.getFitsSystemWindows() && (lastWindowInsets = et4Var.getLastWindowInsets()) != null) {
                size += lastWindowInsets.a() + lastWindowInsets.d();
            }
        } else {
            size = et4Var.getHeight();
        }
        int totalScrollRange = rqVarU.getTotalScrollRange() + size;
        int measuredHeight = rqVarU.getMeasuredHeight();
        if (this instanceof SearchBar$ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            totalScrollRange -= measuredHeight;
        }
        et4Var.r(view, i, i2, View.MeasureSpec.makeMeasureSpec(totalScrollRange, i4 == -1 ? 1073741824 : Integer.MIN_VALUE));
        return true;
    }

    @Override // defpackage.ys4
    public final boolean m(et4 et4Var, View view, Rect rect, boolean z) {
        rq rqVarU = u(et4Var.d(view));
        if (rqVarU != null) {
            Rect rect2 = new Rect(rect);
            rect2.offset(view.getLeft(), view.getTop());
            int width = et4Var.getWidth();
            int height = et4Var.getHeight();
            Rect rect3 = this.c;
            rect3.set(0, 0, width, height);
            if (!rect3.contains(rect2)) {
                rqVarU.g(false, !z, true);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.n8j
    public final void t(et4 et4Var, View view, int i) {
        rq rqVarU = u(et4Var.d(view));
        if (rqVarU == null) {
            et4Var.q(view, i);
            this.e = 0;
            return;
        }
        bt4 bt4Var = (bt4) view.getLayoutParams();
        int paddingLeft = et4Var.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) bt4Var).leftMargin;
        int bottom = rqVarU.getBottom() + ((ViewGroup.MarginLayoutParams) bt4Var).topMargin;
        int width = (et4Var.getWidth() - et4Var.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) bt4Var).rightMargin;
        int bottom2 = ((rqVarU.getBottom() + et4Var.getHeight()) - et4Var.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) bt4Var).bottomMargin;
        Rect rect = this.c;
        rect.set(paddingLeft, bottom, width, bottom2);
        ixj lastWindowInsets = et4Var.getLastWindowInsets();
        if (lastWindowInsets != null) {
            WeakHashMap weakHashMap = i7j.a;
            if (et4Var.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left = lastWindowInsets.b() + rect.left;
                rect.right -= lastWindowInsets.c();
            }
        }
        int i2 = bt4Var.c;
        if (i2 == 0) {
            i2 = 8388659;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.d;
        Gravity.apply(i2, measuredWidth, measuredHeight, rect, rect2, i);
        int iV = v(rqVarU);
        view.layout(rect2.left, rect2.top - iV, rect2.right, rect2.bottom - iV);
        this.e = rect2.top - rqVarU.getBottom();
    }

    public final int v(View view) {
        int i;
        int i2 = this.f;
        if (i2 == 0) {
            return 0;
        }
        float f = 0.0f;
        if (view instanceof rq) {
            rq rqVar = (rq) view;
            int totalScrollRange = rqVar.getTotalScrollRange();
            int downNestedPreScrollRange = rqVar.getDownNestedPreScrollRange();
            ys4 ys4Var = ((bt4) rqVar.getLayoutParams()).a;
            int iX = ys4Var instanceof AppBarLayout$BaseBehavior ? ((AppBarLayout$BaseBehavior) ys4Var).x() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + iX > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                f = (iX / i) + 1.0f;
            }
        }
        return np4.f((int) (f * i2), 0, i2);
    }

    public AppBarLayout$ScrollingViewBehavior() {
        this.c = new Rect();
        this.d = new Rect();
        this.e = 0;
    }
}
