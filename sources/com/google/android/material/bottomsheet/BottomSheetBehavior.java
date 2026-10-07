package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.bt4;
import defpackage.cmf;
import defpackage.cqk;
import defpackage.e0;
import defpackage.et4;
import defpackage.i7j;
import defpackage.io9;
import defpackage.j7j;
import defpackage.jo9;
import defpackage.k3e;
import defpackage.k4;
import defpackage.l4;
import defpackage.m11;
import defpackage.mf;
import defpackage.n11;
import defpackage.ni8;
import defpackage.o11;
import defpackage.o9j;
import defpackage.ore;
import defpackage.p11;
import defpackage.s4;
import defpackage.swj;
import defpackage.td0;
import defpackage.w6j;
import defpackage.wn9;
import defpackage.xs;
import defpackage.y6j;
import defpackage.ys4;
import defpackage.ywf;
import defpackage.zo5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends ys4 {
    public final p11 A;
    public HashMap A1;
    public final ValueAnimator B;
    public final SparseIntArray B1;
    public final int C;
    public final o11 C1;
    public int D;
    public int E;
    public final float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public int X;
    public j7j Y;
    public boolean Z;
    public final int a;
    public boolean b;
    public final float c;
    public final int d;
    public int e;
    public boolean f;
    public int g;
    public final int h;
    public final jo9 i;
    public final ColorStateList j;
    public final int k;
    public final int l;
    public int m;
    public final boolean n;
    public int n1;
    public final boolean o;
    public boolean o1;
    public final boolean p;
    public final float p1;
    public final boolean q;
    public int q1;
    public final boolean r;
    public int r1;
    public final boolean s;
    public int s1;
    public final boolean t;
    public WeakReference t1;
    public final boolean u;
    public WeakReference u1;
    public int v;
    public final ArrayList v1;
    public int w;
    public VelocityTracker w1;
    public final boolean x;
    public int x1;
    public final ywf y;
    public int y1;
    public boolean z;
    public boolean z1;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i2 = 0;
        this.a = 0;
        this.b = true;
        this.k = -1;
        this.l = -1;
        this.A = new p11(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.X = 4;
        this.p1 = 0.1f;
        this.v1 = new ArrayList();
        this.y1 = -1;
        this.B1 = new SparseIntArray();
        this.C1 = new o11(i2, this);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k3e.e);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.j = cqk.r(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.y = ywf.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).d();
        }
        ywf ywfVar = this.y;
        if (ywfVar != null) {
            jo9 jo9Var = new jo9(ywfVar);
            this.i = jo9Var;
            jo9Var.h(context);
            ColorStateList colorStateList = this.j;
            if (colorStateList != null) {
                this.i.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(t(), 1.0f);
        this.B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.B.addUpdateListener(new m11(i2, this));
        this.H = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue == null || (i = typedValuePeekValue.data) != -1) {
            B(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            B(i);
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(8, false);
        if (this.I != z) {
            this.I = z;
            if (!z && this.X == 5) {
                C(4);
            }
            G();
        }
        this.n = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.b != z2) {
            this.b = z2;
            if (this.t1 != null) {
                s();
            }
            D((this.b && this.X == 6) ? 3 : this.X);
            H(this.X, true);
            G();
        }
        this.J = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.K = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.a = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            ore.p("ratio must be a float value between 0 and 1");
            throw null;
        }
        this.F = f;
        if (this.t1 != null) {
            this.E = (int) ((1.0f - f) * this.s1);
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
            if (dimensionPixelOffset < 0) {
                ore.p("offset must be greater than or equal to 0");
                throw null;
            }
            this.C = dimensionPixelOffset;
            H(this.X, true);
        } else {
            int i3 = typedValuePeekValue2.data;
            if (i3 < 0) {
                ore.p("offset must be greater than or equal to 0");
                throw null;
            }
            this.C = i3;
            H(this.X, true);
        }
        this.d = typedArrayObtainStyledAttributes.getInt(11, 500);
        this.o = typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.p = typedArrayObtainStyledAttributes.getBoolean(18, false);
        this.q = typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.r = typedArrayObtainStyledAttributes.getBoolean(20, true);
        this.s = typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.t = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.u = typedArrayObtainStyledAttributes.getBoolean(16, false);
        this.x = typedArrayObtainStyledAttributes.getBoolean(23, true);
        typedArrayObtainStyledAttributes.recycle();
        this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static View w(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = i7j.a;
        if (y6j.h(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewW = w(viewGroup.getChildAt(i));
            if (viewW != null) {
                return viewW;
            }
        }
        return null;
    }

    public static int x(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public final boolean A() {
        WeakReference weakReference = this.t1;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.t1.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void B(int i) {
        boolean z = this.f;
        if (i == -1) {
            if (z) {
                return;
            } else {
                this.f = true;
            }
        } else {
            if (!z && this.e == i) {
                return;
            }
            this.f = false;
            this.e = Math.max(0, i);
        }
        J();
    }

    public final void C(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(zo5.w(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.I && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.b && z(i) <= this.D) ? 3 : i;
        WeakReference weakReference = this.t1;
        if (weakReference == null || weakReference.get() == null) {
            D(i);
            return;
        }
        View view = (View) this.t1.get();
        xs xsVar = new xs(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = i7j.a;
            if (view.isAttachedToWindow()) {
                view.post(xsVar);
                return;
            }
        }
        xsVar.run();
    }

    public final void D(int i) {
        if (this.X == i) {
            return;
        }
        this.X = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.I;
        }
        WeakReference weakReference = this.t1;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            I(true);
        } else if (i == 6 || i == 5 || i == 4) {
            I(false);
        }
        H(i, true);
        ArrayList arrayList = this.v1;
        if (arrayList.size() <= 0) {
            G();
        } else {
            arrayList.get(0).getClass();
            ore.m();
        }
    }

    public final boolean E(float f, View view) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        return Math.abs(((f * this.p1) + ((float) view.getTop())) - ((float) this.G)) / ((float) u()) > 0.5f;
    }

    public final void F(View view, int i, boolean z) {
        int iZ = z(i);
        j7j j7jVar = this.Y;
        if (j7jVar == null || (!z ? j7jVar.q(view, view.getLeft(), iZ) : j7jVar.o(view.getLeft(), iZ))) {
            D(i);
            return;
        }
        D(2);
        H(i, true);
        this.A.a(i);
    }

    public final void G() {
        View view;
        int iA;
        WeakReference weakReference = this.t1;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        i7j.i(view, 524288);
        i7j.g(view, 0);
        i7j.i(view, 262144);
        i7j.g(view, 0);
        i7j.i(view, 1048576);
        i7j.g(view, 0);
        SparseIntArray sparseIntArray = this.B1;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            i7j.i(view, i);
            i7j.g(view, 0);
            sparseIntArray.delete(0);
        }
        int i2 = 3;
        int i3 = 6;
        if (!this.b && this.X != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            mf mfVar = new mf(this, i3, i2);
            ArrayList arrayListE = i7j.e(view);
            int i4 = 0;
            while (true) {
                if (i4 >= arrayListE.size()) {
                    int i5 = 0;
                    int i6 = -1;
                    while (true) {
                        int[] iArr = i7j.d;
                        if (i5 >= 32 || i6 != -1) {
                            break;
                        }
                        int i7 = iArr[i5];
                        boolean z = true;
                        for (int i8 = 0; i8 < arrayListE.size(); i8++) {
                            z &= ((s4) arrayListE.get(i8)).a() != i7;
                        }
                        if (z) {
                            i6 = i7;
                        }
                        i5++;
                    }
                    iA = i6;
                    break;
                }
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((s4) arrayListE.get(i4)).a).getLabel())) {
                    iA = ((s4) arrayListE.get(i4)).a();
                    break;
                }
                i4++;
            }
            if (iA != -1) {
                s4 s4Var = new s4(null, iA, string, mfVar, null);
                View.AccessibilityDelegate accessibilityDelegateC = i7j.c(view);
                l4 l4Var = accessibilityDelegateC == null ? null : accessibilityDelegateC instanceof k4 ? ((k4) accessibilityDelegateC).a : new l4(accessibilityDelegateC);
                if (l4Var == null) {
                    l4Var = new l4();
                }
                i7j.l(view, l4Var);
                i7j.i(view, s4Var.a());
                i7j.e(view).add(s4Var);
                i7j.g(view, 0);
            }
            sparseIntArray.put(0, iA);
        }
        if (this.I) {
            int i9 = 5;
            if (this.X != 5) {
                i7j.j(view, s4.j, new mf(this, i9, i2));
            }
        }
        int i10 = this.X;
        int i11 = 4;
        if (i10 == 3) {
            i7j.j(view, s4.i, new mf(this, this.b ? 4 : 6, i2));
            return;
        }
        if (i10 == 4) {
            i7j.j(view, s4.h, new mf(this, this.b ? 3 : 6, i2));
        } else {
            if (i10 != 6) {
                return;
            }
            i7j.j(view, s4.i, new mf(this, i11, i2));
            i7j.j(view, s4.h, new mf(this, i2, i2));
        }
    }

    public final void H(int i, boolean z) {
        jo9 jo9Var;
        if (i == 2) {
            return;
        }
        boolean z2 = this.X == 3 && (this.x || A());
        if (this.z == z2 || (jo9Var = this.i) == null) {
            return;
        }
        this.z = z2;
        ValueAnimator valueAnimator = this.B;
        if (z && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(jo9Var.a.i, z2 ? t() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float fT = this.z ? t() : 1.0f;
        io9 io9Var = jo9Var.a;
        if (io9Var.i != fT) {
            io9Var.i = fT;
            jo9Var.e = true;
            jo9Var.invalidateSelf();
        }
    }

    public final void I(boolean z) {
        WeakReference weakReference = this.t1;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof et4) {
            et4 et4Var = (et4) parent;
            int childCount = et4Var.getChildCount();
            if (z) {
                if (this.A1 != null) {
                    return;
                } else {
                    this.A1 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = et4Var.getChildAt(i);
                if (childAt != this.t1.get() && z) {
                    this.A1.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.A1 = null;
        }
    }

    public final void J() {
        View view;
        if (this.t1 != null) {
            s();
            if (this.X != 4 || (view = (View) this.t1.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // defpackage.ys4
    public final void c(bt4 bt4Var) {
        this.t1 = null;
        this.Y = null;
    }

    @Override // defpackage.ys4
    public final void f() {
        this.t1 = null;
        this.Y = null;
    }

    @Override // defpackage.ys4
    public final boolean g(et4 et4Var, View view, MotionEvent motionEvent) {
        int i;
        j7j j7jVar;
        if (!view.isShown() || !this.K) {
            this.Z = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.x1 = -1;
            this.y1 = -1;
            VelocityTracker velocityTracker = this.w1;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.w1 = null;
            }
        }
        if (this.w1 == null) {
            this.w1 = VelocityTracker.obtain();
        }
        this.w1.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.y1 = (int) motionEvent.getY();
            if (this.X != 2) {
                WeakReference weakReference = this.u1;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && et4Var.l(view2, x, this.y1)) {
                    this.x1 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.z1 = true;
                }
            }
            this.Z = this.x1 == -1 && !et4Var.l(view, x, this.y1);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.z1 = false;
            this.x1 = -1;
            if (this.Z) {
                this.Z = false;
                return false;
            }
        }
        if (this.Z || (j7jVar = this.Y) == null || !j7jVar.p(motionEvent)) {
            WeakReference weakReference2 = this.u1;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.Z || this.X == 1 || et4Var.l(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.Y == null || (i = this.y1) == -1 || Math.abs(i - motionEvent.getY()) <= this.Y.b) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ys4
    public final boolean h(et4 et4Var, View view, int i) {
        WeakHashMap weakHashMap = i7j.a;
        if (et4Var.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i2 = 0;
        byte b = 0;
        if (this.t1 == null) {
            this.g = et4Var.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.n || this.f) ? false : true;
            if (this.o || this.p || this.q || this.s || this.t || this.u || z) {
                n11 n11Var = new n11(this, z, i2);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                td0 td0Var = new td0(7);
                td0Var.b = paddingStart;
                td0Var.c = paddingEnd;
                td0Var.d = paddingBottom;
                y6j.l(view, new cmf(n11Var, td0Var, b == true ? 1 : 0, 10));
                if (view.isAttachedToWindow()) {
                    w6j.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new o9j());
                }
            }
            swj.a(view, new ni8(view));
            this.t1 = new WeakReference(view);
            new wn9(view);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            jo9 jo9Var = this.i;
            if (jo9Var != null) {
                view.setBackground(jo9Var);
                float fE = this.H;
                if (fE == -1.0f) {
                    fE = y6j.e(view);
                }
                jo9Var.i(fE);
            } else {
                ColorStateList colorStateList = this.j;
                if (colorStateList != null) {
                    y6j.i(view, colorStateList);
                }
            }
            G();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.Y == null) {
            this.Y = new j7j(et4Var.getContext(), et4Var, this.C1);
        }
        int top = view.getTop();
        et4Var.q(view, i);
        this.r1 = et4Var.getWidth();
        this.s1 = et4Var.getHeight();
        int height = view.getHeight();
        this.q1 = height;
        int iMin = this.s1;
        int i3 = iMin - height;
        int i4 = this.w;
        if (i3 < i4) {
            boolean z2 = this.r;
            int i5 = this.l;
            if (z2) {
                if (i5 != -1) {
                    iMin = Math.min(iMin, i5);
                }
                this.q1 = iMin;
            } else {
                int iMin2 = iMin - i4;
                if (i5 != -1) {
                    iMin2 = Math.min(iMin2, i5);
                }
                this.q1 = iMin2;
            }
        }
        this.D = Math.max(0, this.s1 - this.q1);
        this.E = (int) ((1.0f - this.F) * this.s1);
        s();
        int i6 = this.X;
        if (i6 == 3) {
            view.offsetTopAndBottom(y());
        } else if (i6 == 6) {
            view.offsetTopAndBottom(this.E);
        } else if (this.I && i6 == 5) {
            view.offsetTopAndBottom(this.s1);
        } else if (i6 == 4) {
            view.offsetTopAndBottom(this.G);
        } else if (i6 == 1 || i6 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        H(this.X, false);
        this.u1 = new WeakReference(w(view));
        ArrayList arrayList = this.v1;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        ore.m();
        return false;
    }

    @Override // defpackage.ys4
    public final boolean i(et4 et4Var, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(x(i, et4Var.getPaddingRight() + et4Var.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.k, marginLayoutParams.width), x(i3, et4Var.getPaddingBottom() + et4Var.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.l, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.ys4
    public final boolean j(View view, View view2, float f) {
        WeakReference weakReference = this.u1;
        return (weakReference == null || view2 != weakReference.get() || this.X == 3) ? false : true;
    }

    @Override // defpackage.ys4
    public final void k(et4 et4Var, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.u1;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        boolean z = this.K;
        if (i2 > 0) {
            if (i4 < y()) {
                int iY = top - y();
                iArr[1] = iY;
                int i5 = -iY;
                WeakHashMap weakHashMap = i7j.a;
                view.offsetTopAndBottom(i5);
                D(3);
            } else {
                if (!z) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap2 = i7j.a;
                view.offsetTopAndBottom(-i2);
                D(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i6 = this.G;
            if (i4 > i6 && !this.I) {
                int i7 = top - i6;
                iArr[1] = i7;
                int i8 = -i7;
                WeakHashMap weakHashMap3 = i7j.a;
                view.offsetTopAndBottom(i8);
                D(4);
            } else {
                if (!z) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap4 = i7j.a;
                view.offsetTopAndBottom(-i2);
                D(1);
            }
        }
        v(view.getTop());
        this.n1 = i2;
        this.o1 = true;
    }

    @Override // defpackage.ys4
    public final void l(et4 et4Var, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // defpackage.ys4
    public final void n(View view, Parcelable parcelable) {
        a aVar = (a) parcelable;
        int i = this.a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.e = aVar.d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.b = aVar.e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.I = aVar.f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.J = aVar.g;
            }
        }
        int i2 = aVar.c;
        if (i2 == 1 || i2 == 2) {
            this.X = 4;
        } else {
            this.X = i2;
        }
    }

    @Override // defpackage.ys4
    public final Parcelable o(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new a(this);
    }

    @Override // defpackage.ys4
    public final boolean p(et4 et4Var, View view, View view2, View view3, int i, int i2) {
        this.n1 = 0;
        this.o1 = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    @Override // defpackage.ys4
    public final void q(et4 et4Var, View view, View view2, int i) {
        int top;
        int top2;
        int i2;
        float yVelocity;
        int i3 = 3;
        if (view.getTop() == y()) {
            D(3);
            return;
        }
        WeakReference weakReference = this.u1;
        if (weakReference != null && view2 == weakReference.get() && this.o1) {
            if (this.n1 > 0) {
                if (!this.b && view.getTop() > this.E) {
                    i3 = 6;
                }
            } else if (this.I) {
                VelocityTracker velocityTracker = this.w1;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.c);
                    yVelocity = this.w1.getYVelocity(this.x1);
                }
                if (E(yVelocity, view)) {
                    i3 = 5;
                } else if (this.n1 == 0) {
                    top2 = view.getTop();
                    if (this.b) {
                        i2 = this.E;
                        if (top2 < i2) {
                            if (top2 >= Math.abs(top2 - this.G)) {
                            }
                        } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.G)) {
                            i3 = 4;
                        }
                        i3 = 6;
                    } else if (Math.abs(top2 - this.D) >= Math.abs(top2 - this.G)) {
                        i3 = 4;
                    }
                } else {
                    if (!this.b) {
                        top = view.getTop();
                        if (Math.abs(top - this.E) < Math.abs(top - this.G)) {
                            i3 = 6;
                        }
                    }
                    i3 = 4;
                }
            } else if (this.n1 == 0) {
                top2 = view.getTop();
                if (this.b) {
                    i2 = this.E;
                    if (top2 < i2) {
                        if (top2 >= Math.abs(top2 - this.G)) {
                        }
                    } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.G)) {
                        i3 = 4;
                    }
                    i3 = 6;
                } else if (Math.abs(top2 - this.D) >= Math.abs(top2 - this.G)) {
                    i3 = 4;
                }
            } else {
                if (!this.b) {
                    top = view.getTop();
                    if (Math.abs(top - this.E) < Math.abs(top - this.G)) {
                        i3 = 6;
                    }
                }
                i3 = 4;
            }
            F(view, i3, false);
            this.o1 = false;
        }
    }

    @Override // defpackage.ys4
    public final boolean r(et4 et4Var, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.X;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        j7j j7jVar = this.Y;
        boolean z = this.K;
        if (j7jVar != null && (z || i == 1)) {
            j7jVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.x1 = -1;
            this.y1 = -1;
            VelocityTracker velocityTracker = this.w1;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.w1 = null;
            }
        }
        if (this.w1 == null) {
            this.w1 = VelocityTracker.obtain();
        }
        this.w1.addMovement(motionEvent);
        if (this.Y != null && ((z || this.X == 1) && actionMasked == 2 && !this.Z)) {
            float fAbs = Math.abs(this.y1 - motionEvent.getY());
            j7j j7jVar2 = this.Y;
            if (fAbs > j7jVar2.b) {
                j7jVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.Z;
    }

    public final void s() {
        int iU = u();
        boolean z = this.b;
        int i = this.s1;
        if (z) {
            this.G = Math.max(i - iU, this.D);
        } else {
            this.G = i - iU;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    public final float t() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float f;
        float f2 = 0.0f;
        jo9 jo9Var = this.i;
        if (jo9Var != null && (weakReference = this.t1) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.t1.get();
            if (A() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                float fA = jo9Var.a.a.e.a(jo9Var.f());
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    if (radius <= 0.0f || fA <= 0.0f) {
                        f = 0.0f;
                    } else {
                        f = radius / fA;
                    }
                } else {
                    f = 0.0f;
                }
                float fA2 = jo9Var.a.a.f.a(jo9Var.f());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && fA2 > 0.0f) {
                        f2 = radius2 / fA2;
                    }
                }
                return Math.max(f, f2);
            }
        }
        return 0.0f;
    }

    public final int u() {
        int iMin;
        int i;
        int i2;
        if (this.f) {
            iMin = Math.min(Math.max(this.g, this.s1 - ((this.r1 * 9) / 16)), this.q1);
            i = this.v;
        } else {
            if (!this.n && !this.o && (i2 = this.m) > 0) {
                return Math.max(this.e, i2 + this.h);
            }
            iMin = this.e;
            i = this.v;
        }
        return iMin + i;
    }

    public final void v(int i) {
        if (((View) this.t1.get()) != null) {
            ArrayList arrayList = this.v1;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.G;
            if (i <= i2 && i2 != y()) {
                y();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            ore.m();
        }
    }

    public final int y() {
        if (this.b) {
            return this.D;
        }
        return Math.max(this.C, this.r ? 0 : this.w);
    }

    public final int z(int i) {
        if (i == 3) {
            return y();
        }
        if (i == 4) {
            return this.G;
        }
        if (i == 5) {
            return this.s1;
        }
        if (i == 6) {
            return this.E;
        }
        ore.p(zo5.h(i, "Invalid state to get top offset: "));
        return 0;
    }

    public static class a extends e0 {
        public static final Parcelable.Creator<a> CREATOR = new com.google.android.material.bottomsheet.a();
        public final int c;
        public final int d;
        public final boolean e;
        public final boolean f;
        public final boolean g;

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
            this.d = parcel.readInt();
            this.e = parcel.readInt() == 1;
            this.f = parcel.readInt() == 1;
            this.g = parcel.readInt() == 1;
        }

        @Override // defpackage.e0, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeInt(this.g ? 1 : 0);
        }

        public a(Parcel parcel) {
            this(parcel, null);
        }

        public a(BottomSheetBehavior bottomSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.c = bottomSheetBehavior.X;
            this.d = bottomSheetBehavior.e;
            this.e = bottomSheetBehavior.b;
            this.f = bottomSheetBehavior.I;
            this.g = bottomSheetBehavior.J;
        }
    }

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.k = -1;
        this.l = -1;
        this.A = new p11(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.X = 4;
        this.p1 = 0.1f;
        this.v1 = new ArrayList();
        this.y1 = -1;
        this.B1 = new SparseIntArray();
        this.C1 = new o11(0, this);
    }
}
