package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class y8j extends ViewGroup {
    public final Rect a;
    public final Rect b;
    public final so3 c;
    public int d;
    public boolean e;
    public final p8j f;
    public final s8j g;
    public int h;
    public Parcelable i;
    public final w8j j;
    public final v8j k;
    public final z5f l;
    public final so3 m;
    public final qk6 n;
    public final tlc o;
    public see p;
    public boolean q;
    public boolean r;
    public int s;
    public final gvb t;

    public y8j(Context context) {
        super(context);
        this.a = new Rect();
        this.b = new Rect();
        so3 so3Var = new so3();
        this.c = so3Var;
        this.e = false;
        this.f = new p8j(0, this);
        this.h = -1;
        this.p = null;
        this.q = false;
        this.r = true;
        this.s = -1;
        gvb gvbVar = new gvb();
        gvbVar.a = this;
        gvbVar.b = new p3c(24, gvbVar);
        gvbVar.c = new v56(23, gvbVar);
        this.t = gvbVar;
        w8j w8jVar = new w8j(this, context);
        this.j = w8jVar;
        w8jVar.setId(View.generateViewId());
        this.j.setDescendantFocusability(131072);
        s8j s8jVar = new s8j(this);
        this.g = s8jVar;
        this.j.setLayoutManager(s8jVar);
        this.j.setScrollingTouchSlop(1);
        int[] iArr = j3e.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        i7j.k(this, context, iArr, null, typedArrayObtainStyledAttributes, 0, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.j.i(new r8j());
            z5f z5fVar = new z5f(this);
            this.l = z5fVar;
            this.n = new qk6(this, z5fVar, this.j);
            v8j v8jVar = new v8j(this);
            this.k = v8jVar;
            v8jVar.b(this.j);
            this.j.k(this.l);
            so3 so3Var2 = new so3();
            this.m = so3Var2;
            this.l.a = so3Var2;
            q8j q8jVar = new q8j(this, 0);
            q8j q8jVar2 = new q8j(this, 1);
            ((ArrayList) so3Var2.b).add(q8jVar);
            ((ArrayList) this.m.b).add(q8jVar2);
            gvb gvbVar2 = this.t;
            w8j w8jVar2 = this.j;
            gvbVar2.getClass();
            w8jVar2.setImportantForAccessibility(2);
            gvbVar2.d = new p8j(1, gvbVar2);
            y8j y8jVar = (y8j) gvbVar2.a;
            if (y8jVar.getImportantForAccessibility() == 0) {
                y8jVar.setImportantForAccessibility(1);
            }
            ((ArrayList) this.m.b).add(so3Var);
            tlc tlcVar = new tlc(this.g);
            this.o = tlcVar;
            ((ArrayList) this.m.b).add(tlcVar);
            w8j w8jVar3 = this.j;
            attachViewToParent(w8jVar3, 0, w8jVar3.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final boolean a() {
        qk6 qk6Var = this.n;
        z5f z5fVar = qk6Var.b;
        if (z5fVar.f == 1) {
            return false;
        }
        qk6Var.g = 0;
        qk6Var.f = 0.0f;
        qk6Var.h = SystemClock.uptimeMillis();
        VelocityTracker velocityTracker = qk6Var.d;
        if (velocityTracker == null) {
            qk6Var.d = VelocityTracker.obtain();
            qk6Var.e = ViewConfiguration.get(qk6Var.a.getContext()).getScaledMaximumFlingVelocity();
        } else {
            velocityTracker.clear();
        }
        z5fVar.e = 4;
        z5fVar.f(true);
        if (z5fVar.f != 0) {
            qk6Var.c.E0();
        }
        long j = qk6Var.h;
        MotionEvent motionEventObtain = MotionEvent.obtain(j, j, 0, 0.0f, 0.0f, 0);
        qk6Var.d.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    public final void b() {
        qk6 qk6Var = this.n;
        z5f z5fVar = qk6Var.b;
        boolean z = z5fVar.m;
        if (z) {
            if (z5fVar.f != 1 || z) {
                z5fVar.m = false;
                z5fVar.g();
                y5f y5fVar = z5fVar.g;
                if (y5fVar.c == 0) {
                    int i = y5fVar.a;
                    if (i != z5fVar.h) {
                        z5fVar.c(i);
                    }
                    z5fVar.d(0);
                    z5fVar.e();
                } else {
                    z5fVar.d(2);
                }
            }
            VelocityTracker velocityTracker = qk6Var.d;
            velocityTracker.computeCurrentVelocity(1000, qk6Var.e);
            if (qk6Var.c.M((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
                return;
            }
            y8j y8jVar = qk6Var.a;
            View viewE = y8jVar.k.e(y8jVar.g);
            if (viewE == null) {
                return;
            }
            int[] iArrC = y8jVar.k.c(y8jVar.g, viewE);
            int i2 = iArrC[0];
            if (i2 == 0 && iArrC[1] == 0) {
                return;
            }
            y8jVar.j.z0(i2, iArrC[1], false);
        }
    }

    public final void c(float f) {
        qk6 qk6Var = this.n;
        if (qk6Var.b.m) {
            float f2 = qk6Var.f - f;
            qk6Var.f = f2;
            int iRound = Math.round(f2 - qk6Var.g);
            qk6Var.g += iRound;
            long jUptimeMillis = SystemClock.uptimeMillis();
            boolean z = qk6Var.a.getOrientation() == 0;
            int i = z ? iRound : 0;
            if (z) {
                iRound = 0;
            }
            float f3 = z ? qk6Var.f : 0.0f;
            float f4 = z ? 0.0f : qk6Var.f;
            qk6Var.c.scrollBy(i, iRound);
            MotionEvent motionEventObtain = MotionEvent.obtain(qk6Var.h, jUptimeMillis, 2, f3, f4, 0);
            qk6Var.d.addMovement(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.j.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.j.canScrollVertically(i);
    }

    public final boolean d() {
        return this.n.b.m;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof x8j) {
            int i = ((x8j) parcelable).a;
            sparseArray.put(this.j.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        g();
    }

    public final void e(t8j t8jVar) {
        ((ArrayList) this.c.b).add(t8jVar);
    }

    public final void f() {
        tlc tlcVar = this.o;
        if (tlcVar.b == null) {
            return;
        }
        z5f z5fVar = this.l;
        z5fVar.g();
        y5f y5fVar = z5fVar.g;
        double d = ((double) y5fVar.a) + ((double) y5fVar.b);
        int i = (int) d;
        float f = (float) (d - ((double) i));
        tlcVar.i(i, f, Math.round(getPageSize() * f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g() {
        nee adapter;
        if (this.h == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.i;
        if (parcelable != null) {
            if (adapter instanceof tjg) {
                ((tjg) adapter).e(parcelable);
            }
            this.i = null;
        }
        int iMax = Math.max(0, Math.min(this.h, adapter.l() - 1));
        this.d = iMax;
        this.h = -1;
        this.j.w0(iMax);
        this.t.U();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.t.getClass();
        this.t.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public nee getAdapter() {
        return this.j.getAdapter();
    }

    public int getCurrentItem() {
        return this.d;
    }

    public int getItemDecorationCount() {
        return this.j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.s;
    }

    public int getOrientation() {
        return this.g.p == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        int orientation = getOrientation();
        w8j w8jVar = this.j;
        if (orientation == 0) {
            height = w8jVar.getWidth() - w8jVar.getPaddingLeft();
            paddingBottom = w8jVar.getPaddingRight();
        } else {
            height = w8jVar.getHeight() - w8jVar.getPaddingTop();
            paddingBottom = w8jVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.l.f;
    }

    public final void h(int i, boolean z) {
        if (d()) {
            ore.k("Cannot change current item when ViewPager2 is fake dragging");
        } else {
            i(i, z);
        }
    }

    public final void i(int i, boolean z) {
        nee adapter = getAdapter();
        if (adapter == null) {
            if (this.h != -1) {
                this.h = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.l() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i, 0), adapter.l() - 1);
        int i2 = this.d;
        z5f z5fVar = this.l;
        if (iMin == i2 && z5fVar.f == 0) {
            return;
        }
        if (iMin == i2 && z) {
            return;
        }
        double d = i2;
        this.d = iMin;
        this.t.U();
        if (z5fVar.f != 0) {
            z5fVar.g();
            y5f y5fVar = z5fVar.g;
            d = ((double) y5fVar.a) + ((double) y5fVar.b);
        }
        z5fVar.getClass();
        z5fVar.e = z ? 2 : 3;
        z5fVar.m = false;
        boolean z2 = z5fVar.i != iMin;
        z5fVar.i = iMin;
        z5fVar.d(2);
        if (z2) {
            z5fVar.c(iMin);
        }
        w8j w8jVar = this.j;
        if (!z) {
            w8jVar.w0(iMin);
            return;
        }
        double d2 = iMin;
        if (Math.abs(d2 - d) <= 3.0d) {
            w8jVar.A0(iMin);
        } else {
            w8jVar.w0(d2 > d ? iMin - 3 : iMin + 3);
            w8jVar.post(new v72(iMin, w8jVar));
        }
    }

    public final void j(t8j t8jVar) {
        ((ArrayList) this.c.b).remove(t8jVar);
    }

    public final void k() {
        v8j v8jVar = this.k;
        if (v8jVar == null) {
            ore.k("Design assumption violated.");
            return;
        }
        s8j s8jVar = this.g;
        View viewE = v8jVar.e(s8jVar);
        if (viewE == null) {
            return;
        }
        s8jVar.getClass();
        int iM = vee.M(viewE);
        if (iM != this.d && getScrollState() == 0) {
            this.m.j(iM);
        }
        this.e = false;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int iL;
        int iL2;
        int iL3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        y8j y8jVar = (y8j) this.t.a;
        if (y8jVar.getAdapter() == null) {
            iL = 0;
            iL2 = 0;
        } else if (y8jVar.getOrientation() == 1) {
            iL = y8jVar.getAdapter().l();
            iL2 = 1;
        } else {
            iL2 = y8jVar.getAdapter().l();
            iL = 1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) w4.m(iL, iL2, 0).a);
        nee adapter = y8jVar.getAdapter();
        if (adapter == null || (iL3 = adapter.l()) == 0 || !y8jVar.r) {
            return;
        }
        if (y8jVar.d > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (y8jVar.d < iL3 - 1) {
            accessibilityNodeInfo.addAction(np0.r);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        w8j w8jVar = this.j;
        int measuredWidth = w8jVar.getMeasuredWidth();
        int measuredHeight = w8jVar.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.a;
        rect.left = paddingLeft;
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.b;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        w8jVar.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.e) {
            k();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChild(this.j, i, i2);
        int measuredWidth = this.j.getMeasuredWidth();
        int measuredHeight = this.j.getMeasuredHeight();
        int measuredState = this.j.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof x8j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x8j x8jVar = (x8j) parcelable;
        super.onRestoreInstanceState(x8jVar.getSuperState());
        this.h = x8jVar.b;
        this.i = x8jVar.c;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        x8j x8jVar = new x8j(super.onSaveInstanceState());
        w8j w8jVar = this.j;
        x8jVar.a = w8jVar.getId();
        int i = this.h;
        if (i == -1) {
            i = this.d;
        }
        x8jVar.b = i;
        Parcelable parcelable = this.i;
        if (parcelable != null) {
            x8jVar.c = parcelable;
            return x8jVar;
        }
        Object adapter = w8jVar.getAdapter();
        if (adapter instanceof tjg) {
            x8jVar.c = ((tjg) adapter).a();
        }
        return x8jVar;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException(y8j.class.getSimpleName().concat(" does not support direct child views"));
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        gvb gvbVar = this.t;
        gvbVar.getClass();
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        gvbVar.getClass();
        y8j y8jVar = (y8j) gvbVar.a;
        if (i != 8192 && i != 4096) {
            c.t();
            return false;
        }
        int currentItem = i == 8192 ? y8jVar.getCurrentItem() - 1 : y8jVar.getCurrentItem() + 1;
        if (y8jVar.r) {
            y8jVar.i(currentItem, true);
        }
        return true;
    }

    public void setAdapter(nee neeVar) {
        w8j w8jVar = this.j;
        nee adapter = w8jVar.getAdapter();
        gvb gvbVar = this.t;
        if (adapter != null) {
            adapter.E((p8j) gvbVar.d);
        } else {
            gvbVar.getClass();
        }
        p8j p8jVar = this.f;
        if (adapter != null) {
            adapter.E(p8jVar);
        }
        w8jVar.setAdapter(neeVar);
        this.d = 0;
        g();
        gvbVar.U();
        if (neeVar != null) {
            neeVar.C((p8j) gvbVar.d);
        }
        if (neeVar != null) {
            neeVar.C(p8jVar);
        }
    }

    public void setCurrentItem(int i) {
        h(i, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.t.U();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            ore.p("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        } else {
            this.s = i;
            this.j.requestLayout();
        }
    }

    public void setOrientation(int i) {
        this.g.q1(i);
        this.t.U();
    }

    public void setPageTransformer(u8j u8jVar) {
        boolean z = this.q;
        w8j w8jVar = this.j;
        if (u8jVar != null) {
            if (!z) {
                this.p = w8jVar.getItemAnimator();
                this.q = true;
            }
            w8jVar.setItemAnimator(null);
        } else if (z) {
            w8jVar.setItemAnimator(this.p);
            this.p = null;
            this.q = false;
        }
        tlc tlcVar = this.o;
        if (u8jVar == tlcVar.b) {
            return;
        }
        tlcVar.b = u8jVar;
        f();
    }

    public void setUserInputEnabled(boolean z) {
        this.r = z;
        this.t.U();
    }
}
