package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import defpackage.bt4;
import defpackage.c0a;
import defpackage.cqk;
import defpackage.cy5;
import defpackage.e0;
import defpackage.et4;
import defpackage.f0;
import defpackage.gz8;
import defpackage.i7j;
import defpackage.iw2;
import defpackage.j7j;
import defpackage.jo9;
import defpackage.k3e;
import defpackage.mt4;
import defpackage.o11;
import defpackage.ore;
import defpackage.p11;
import defpackage.qr7;
import defpackage.qt4;
import defpackage.s4;
import defpackage.wn9;
import defpackage.y6j;
import defpackage.yab;
import defpackage.ys4;
import defpackage.ywf;
import defpackage.zo5;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public class SideSheetBehavior<V extends View> extends ys4 {
    public gz8 a;
    public final jo9 b;
    public final ColorStateList c;
    public final ywf d;
    public final p11 e;
    public final float f;
    public final boolean g;
    public int h;
    public j7j i;
    public boolean j;
    public final float k;
    public int l;
    public int m;
    public int n;
    public int o;
    public WeakReference p;
    public WeakReference q;
    public final int r;
    public VelocityTracker s;
    public int t;
    public final LinkedHashSet u;
    public final o11 v;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.e = new p11(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.u = new LinkedHashSet();
        this.v = new o11(2, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k3e.z);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.c = cqk.r(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.d = ywf.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).d();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.r = resourceId;
            WeakReference weakReference = this.q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.q = null;
            WeakReference weakReference2 = this.p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = i7j.a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        ywf ywfVar = this.d;
        if (ywfVar != null) {
            jo9 jo9Var = new jo9(ywfVar);
            this.b = jo9Var;
            jo9Var.h(context);
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                this.b.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.b.setTint(typedValue.data);
            }
        }
        this.f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.ys4
    public final void c(bt4 bt4Var) {
        this.p = null;
        this.i = null;
    }

    @Override // defpackage.ys4
    public final void f() {
        this.p = null;
        this.i = null;
    }

    @Override // defpackage.ys4
    public final boolean g(et4 et4Var, View view, MotionEvent motionEvent) {
        j7j j7jVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && i7j.d(view) == null) || !this.g) {
            this.j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.j) {
            this.j = false;
            return false;
        }
        return (this.j || (j7jVar = this.i) == null || !j7jVar.p(motionEvent)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0240  */
    /* JADX WARN: Code duplicated, block: B:42:0x00af  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00be  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:59:0x011e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0122  */
    /* JADX WARN: Code duplicated, block: B:62:0x0125  */
    /* JADX WARN: Code duplicated, block: B:64:0x012f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0151  */
    /* JADX WARN: Code duplicated, block: B:77:0x018e  */
    @Override // defpackage.ys4
    public final boolean h(et4 et4Var, View view, int i) {
        bt4 bt4Var;
        ywf ywfVar;
        WeakReference weakReference;
        ywf ywfVar2;
        View view2;
        WeakReference weakReference2;
        ywf ywfVar3;
        View view3;
        int left;
        int i2;
        int iD;
        int i3;
        View viewFindViewById;
        int i4;
        WeakHashMap weakHashMap = i7j.a;
        if (et4Var.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference3 = this.p;
        jo9 jo9Var = this.b;
        if (weakReference3 == null) {
            this.p = new WeakReference(view);
            new wn9(view);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (jo9Var != null) {
                view.setBackground(jo9Var);
                float fE = this.f;
                if (fE == -1.0f) {
                    fE = y6j.e(view);
                }
                jo9Var.i(fE);
            } else {
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    y6j.i(view, colorStateList);
                }
            }
            int i5 = this.h == 5 ? 4 : 0;
            if (view.getVisibility() != i5) {
                view.setVisibility(i5);
            }
            v();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (i7j.d(view) == null) {
                i7j.m(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i6 = Gravity.getAbsoluteGravity(((bt4) view.getLayoutParams()).c, i) == 3 ? 1 : 0;
        gz8 gz8Var = this.a;
        if (gz8Var != null) {
            switch (gz8Var.a) {
                case 0:
                    i4 = 1;
                    break;
                default:
                    i4 = 0;
                    break;
            }
            if (i4 != i6) {
                bt4Var = null;
                ywfVar = this.d;
                if (i6 == 0) {
                    this.a = new gz8(this, 1);
                    if (ywfVar != null) {
                        weakReference2 = this.p;
                        if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof bt4)) {
                            bt4Var = (bt4) view3.getLayoutParams();
                        }
                        if (bt4Var != null || ((ViewGroup.MarginLayoutParams) bt4Var).rightMargin <= 0) {
                            yab yabVar = ywfVar.a;
                            yab yabVar2 = ywfVar.b;
                            yab yabVar3 = ywfVar.c;
                            yab yabVar4 = ywfVar.d;
                            mt4 mt4Var = ywfVar.e;
                            mt4 mt4Var2 = ywfVar.h;
                            cy5 cy5Var = ywfVar.i;
                            cy5 cy5Var2 = ywfVar.j;
                            cy5 cy5Var3 = ywfVar.k;
                            cy5 cy5Var4 = ywfVar.l;
                            f0 f0Var = new f0(0.0f);
                            f0 f0Var2 = new f0(0.0f);
                            ywfVar3 = new ywf();
                            ywfVar3.a = yabVar;
                            ywfVar3.b = yabVar2;
                            ywfVar3.c = yabVar3;
                            ywfVar3.d = yabVar4;
                            ywfVar3.e = mt4Var;
                            ywfVar3.f = f0Var;
                            ywfVar3.g = f0Var2;
                            ywfVar3.h = mt4Var2;
                            ywfVar3.i = cy5Var;
                            ywfVar3.j = cy5Var2;
                            ywfVar3.k = cy5Var3;
                            ywfVar3.l = cy5Var4;
                            if (jo9Var != null) {
                                jo9Var.setShapeAppearanceModel(ywfVar3);
                            }
                        }
                    }
                } else {
                    if (i6 == 1) {
                        ore.p(c0a.k(i6, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                        return false;
                    }
                    this.a = new gz8(this, 0);
                    if (ywfVar != null) {
                        weakReference = this.p;
                        if (weakReference != null && (view2 = (View) weakReference.get()) != null && (view2.getLayoutParams() instanceof bt4)) {
                            bt4Var = (bt4) view2.getLayoutParams();
                        }
                        if (bt4Var != null || ((ViewGroup.MarginLayoutParams) bt4Var).leftMargin <= 0) {
                            yab yabVar5 = ywfVar.a;
                            yab yabVar6 = ywfVar.b;
                            yab yabVar7 = ywfVar.c;
                            yab yabVar8 = ywfVar.d;
                            mt4 mt4Var3 = ywfVar.f;
                            mt4 mt4Var4 = ywfVar.g;
                            cy5 cy5Var5 = ywfVar.i;
                            cy5 cy5Var6 = ywfVar.j;
                            cy5 cy5Var7 = ywfVar.k;
                            cy5 cy5Var8 = ywfVar.l;
                            f0 f0Var3 = new f0(0.0f);
                            f0 f0Var4 = new f0(0.0f);
                            ywfVar2 = new ywf();
                            ywfVar2.a = yabVar5;
                            ywfVar2.b = yabVar6;
                            ywfVar2.c = yabVar7;
                            ywfVar2.d = yabVar8;
                            ywfVar2.e = f0Var3;
                            ywfVar2.f = mt4Var3;
                            ywfVar2.g = mt4Var4;
                            ywfVar2.h = f0Var4;
                            ywfVar2.i = cy5Var5;
                            ywfVar2.j = cy5Var6;
                            ywfVar2.k = cy5Var7;
                            ywfVar2.l = cy5Var8;
                            if (jo9Var != null) {
                                jo9Var.setShapeAppearanceModel(ywfVar2);
                            }
                        }
                    }
                }
            }
        } else {
            bt4Var = null;
            ywfVar = this.d;
            if (i6 == 0) {
                this.a = new gz8(this, 1);
                if (ywfVar != null) {
                    weakReference2 = this.p;
                    if (weakReference2 != null) {
                        bt4Var = (bt4) view3.getLayoutParams();
                    }
                    if (bt4Var != null) {
                        yab yabVar9 = ywfVar.a;
                        yab yabVar10 = ywfVar.b;
                        yab yabVar11 = ywfVar.c;
                        yab yabVar12 = ywfVar.d;
                        mt4 mt4Var5 = ywfVar.e;
                        mt4 mt4Var6 = ywfVar.h;
                        cy5 cy5Var9 = ywfVar.i;
                        cy5 cy5Var10 = ywfVar.j;
                        cy5 cy5Var11 = ywfVar.k;
                        cy5 cy5Var12 = ywfVar.l;
                        f0 f0Var5 = new f0(0.0f);
                        f0 f0Var6 = new f0(0.0f);
                        ywfVar3 = new ywf();
                        ywfVar3.a = yabVar9;
                        ywfVar3.b = yabVar10;
                        ywfVar3.c = yabVar11;
                        ywfVar3.d = yabVar12;
                        ywfVar3.e = mt4Var5;
                        ywfVar3.f = f0Var5;
                        ywfVar3.g = f0Var6;
                        ywfVar3.h = mt4Var6;
                        ywfVar3.i = cy5Var9;
                        ywfVar3.j = cy5Var10;
                        ywfVar3.k = cy5Var11;
                        ywfVar3.l = cy5Var12;
                        if (jo9Var != null) {
                            jo9Var.setShapeAppearanceModel(ywfVar3);
                        }
                    } else {
                        yab yabVar13 = ywfVar.a;
                        yab yabVar14 = ywfVar.b;
                        yab yabVar15 = ywfVar.c;
                        yab yabVar16 = ywfVar.d;
                        mt4 mt4Var7 = ywfVar.e;
                        mt4 mt4Var8 = ywfVar.h;
                        cy5 cy5Var13 = ywfVar.i;
                        cy5 cy5Var14 = ywfVar.j;
                        cy5 cy5Var15 = ywfVar.k;
                        cy5 cy5Var16 = ywfVar.l;
                        f0 f0Var7 = new f0(0.0f);
                        f0 f0Var8 = new f0(0.0f);
                        ywfVar3 = new ywf();
                        ywfVar3.a = yabVar13;
                        ywfVar3.b = yabVar14;
                        ywfVar3.c = yabVar15;
                        ywfVar3.d = yabVar16;
                        ywfVar3.e = mt4Var7;
                        ywfVar3.f = f0Var7;
                        ywfVar3.g = f0Var8;
                        ywfVar3.h = mt4Var8;
                        ywfVar3.i = cy5Var13;
                        ywfVar3.j = cy5Var14;
                        ywfVar3.k = cy5Var15;
                        ywfVar3.l = cy5Var16;
                        if (jo9Var != null) {
                            jo9Var.setShapeAppearanceModel(ywfVar3);
                        }
                    }
                }
            } else {
                if (i6 == 1) {
                    ore.p(c0a.k(i6, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                    return false;
                }
                this.a = new gz8(this, 0);
                if (ywfVar != null) {
                    weakReference = this.p;
                    if (weakReference != null) {
                        bt4Var = (bt4) view2.getLayoutParams();
                    }
                    if (bt4Var != null) {
                        yab yabVar17 = ywfVar.a;
                        yab yabVar18 = ywfVar.b;
                        yab yabVar19 = ywfVar.c;
                        yab yabVar20 = ywfVar.d;
                        mt4 mt4Var9 = ywfVar.f;
                        mt4 mt4Var10 = ywfVar.g;
                        cy5 cy5Var17 = ywfVar.i;
                        cy5 cy5Var18 = ywfVar.j;
                        cy5 cy5Var19 = ywfVar.k;
                        cy5 cy5Var20 = ywfVar.l;
                        f0 f0Var9 = new f0(0.0f);
                        f0 f0Var10 = new f0(0.0f);
                        ywfVar2 = new ywf();
                        ywfVar2.a = yabVar17;
                        ywfVar2.b = yabVar18;
                        ywfVar2.c = yabVar19;
                        ywfVar2.d = yabVar20;
                        ywfVar2.e = f0Var9;
                        ywfVar2.f = mt4Var9;
                        ywfVar2.g = mt4Var10;
                        ywfVar2.h = f0Var10;
                        ywfVar2.i = cy5Var17;
                        ywfVar2.j = cy5Var18;
                        ywfVar2.k = cy5Var19;
                        ywfVar2.l = cy5Var20;
                        if (jo9Var != null) {
                            jo9Var.setShapeAppearanceModel(ywfVar2);
                        }
                    } else {
                        yab yabVar110 = ywfVar.a;
                        yab yabVar111 = ywfVar.b;
                        yab yabVar112 = ywfVar.c;
                        yab yabVar21 = ywfVar.d;
                        mt4 mt4Var11 = ywfVar.f;
                        mt4 mt4Var12 = ywfVar.g;
                        cy5 cy5Var110 = ywfVar.i;
                        cy5 cy5Var111 = ywfVar.j;
                        cy5 cy5Var112 = ywfVar.k;
                        cy5 cy5Var21 = ywfVar.l;
                        f0 f0Var11 = new f0(0.0f);
                        f0 f0Var12 = new f0(0.0f);
                        ywfVar2 = new ywf();
                        ywfVar2.a = yabVar110;
                        ywfVar2.b = yabVar111;
                        ywfVar2.c = yabVar112;
                        ywfVar2.d = yabVar21;
                        ywfVar2.e = f0Var11;
                        ywfVar2.f = mt4Var11;
                        ywfVar2.g = mt4Var12;
                        ywfVar2.h = f0Var12;
                        ywfVar2.i = cy5Var110;
                        ywfVar2.j = cy5Var111;
                        ywfVar2.k = cy5Var112;
                        ywfVar2.l = cy5Var21;
                        if (jo9Var != null) {
                            jo9Var.setShapeAppearanceModel(ywfVar2);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new j7j(et4Var.getContext(), et4Var, this.v);
        }
        int iD2 = this.a.d(view);
        et4Var.q(view, i);
        this.m = et4Var.getWidth();
        switch (this.a.a) {
            case 0:
                left = et4Var.getLeft();
                break;
            default:
                left = et4Var.getRight();
                break;
        }
        this.n = left;
        this.l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            switch (this.a.a) {
                case 0:
                    i2 = marginLayoutParams.leftMargin;
                    break;
                default:
                    i2 = marginLayoutParams.rightMargin;
                    break;
            }
        } else {
            i2 = 0;
        }
        this.o = i2;
        int i7 = this.h;
        if (i7 == 1 || i7 == 2) {
            iD = iD2 - this.a.d(view);
        } else if (i7 == 3) {
            iD = 0;
        } else {
            if (i7 != 5) {
                qr7.g(this.h, "Unexpected value: ");
                return false;
            }
            iD = this.a.c();
        }
        view.offsetLeftAndRight(iD);
        if (this.q == null && (i3 = this.r) != -1 && (viewFindViewById = et4Var.findViewById(i3)) != null) {
            this.q = new WeakReference(viewFindViewById);
        }
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                ore.m();
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ys4
    public final boolean i(et4 et4Var, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, et4Var.getPaddingRight() + et4Var.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, et4Var.getPaddingBottom() + et4Var.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.ys4
    public final void n(View view, Parcelable parcelable) {
        int i = ((a) parcelable).c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // defpackage.ys4
    public final Parcelable o(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new a(this);
    }

    @Override // defpackage.ys4
    public final boolean r(et4 et4Var, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.h == 1 && actionMasked == 0) {
            return true;
        }
        if (t()) {
            this.i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (t() && actionMasked == 2 && !this.j && t()) {
            float fAbs = Math.abs(this.t - motionEvent.getX());
            j7j j7jVar = this.i;
            if (fAbs > j7jVar.b) {
                j7jVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.j;
    }

    public final void s(int i) {
        View view;
        if (this.h == i) {
            return;
        }
        this.h = i;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.u.iterator();
        if (it.hasNext()) {
            throw qt4.h(it);
        }
        v();
    }

    public final boolean t() {
        if (this.i != null) {
            return this.g || this.h == 1;
        }
        return false;
    }

    public final void u(View view, int i, boolean z) {
        int iB;
        if (i == 3) {
            iB = this.a.b();
        } else {
            if (i != 5) {
                ore.p(zo5.h(i, "Invalid state to get outer edge offset: "));
                return;
            }
            iB = this.a.c();
        }
        j7j j7jVar = this.i;
        if (j7jVar == null || (!z ? j7jVar.q(view, iB, view.getTop()) : j7jVar.o(iB, view.getTop()))) {
            s(i);
        } else {
            s(2);
            this.e.a(i);
        }
    }

    public final void v() {
        View view;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        i7j.i(view, 262144);
        i7j.g(view, 0);
        i7j.i(view, 1048576);
        i7j.g(view, 0);
        int i = 8;
        int i2 = 5;
        if (this.h != 5) {
            i7j.j(view, s4.j, new iw2(this, i2, i));
        }
        int i3 = 3;
        if (this.h != 3) {
            i7j.j(view, s4.h, new iw2(this, i3, i));
        }
    }

    public static class a extends e0 {
        public static final Parcelable.Creator<a> CREATOR = new com.google.android.material.sidesheet.a();
        public final int c;

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
        }

        @Override // defpackage.e0, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
        }

        public a(Parcel parcel) {
            this(parcel, null);
        }

        public a(SideSheetBehavior sideSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.c = sideSheetBehavior.h;
        }
    }

    public SideSheetBehavior() {
        this.e = new p11(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.u = new LinkedHashSet();
        this.v = new o11(2, this);
    }
}
