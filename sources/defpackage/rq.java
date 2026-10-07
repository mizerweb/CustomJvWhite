package defpackage;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class rq extends LinearLayout {
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public ixj g;
    public ArrayList h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public WeakReference n;
    public final boolean o;
    public ValueAnimator p;
    public final ValueAnimator.AnimatorUpdateListener q;
    public final ArrayList r;
    public final long s;
    public final TimeInterpolator t;
    public int[] u;
    public Drawable v;
    public Integer w;
    public final float x;
    public AppBarLayout$Behavior y;

    public rq(Context context) {
        Integer numValueOf;
        super(p90.T(context, null, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout), null, R.attr.appBarLayoutStyle);
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.f = 0;
        this.r = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayB = ch3.B(context3, null, qe7.e, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayB.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayB.getResourceId(0, 0)));
            }
            typedArrayB.recycle();
            TypedArray typedArrayB2 = ch3.B(context2, null, k3e.a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
            Drawable drawable = typedArrayB2.getDrawable(0);
            WeakHashMap weakHashMap = i7j.a;
            setBackground(drawable);
            final ColorStateList colorStateListR = cqk.r(context2, typedArrayB2, 6);
            this.o = colorStateListR != null;
            final ColorStateList colorStateListK = f55.k(getBackground());
            if (colorStateListK != null) {
                final jo9 jo9Var = new jo9();
                jo9Var.j(colorStateListK);
                if (colorStateListR != null) {
                    Context context4 = getContext();
                    TypedValue typedValueS0 = e9i.s0(context4, R.attr.colorSurface);
                    if (typedValueS0 != null) {
                        int i = typedValueS0.resourceId;
                        numValueOf = Integer.valueOf(i != 0 ? context4.getColor(i) : typedValueS0.data);
                    } else {
                        numValueOf = null;
                    }
                    final Integer num = numValueOf;
                    this.q = new ValueAnimator.AnimatorUpdateListener() { // from class: jq
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Integer num2;
                            rq rqVar = this.a;
                            ArrayList arrayList = rqVar.r;
                            int iK = qyj.K(colorStateListK.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue(), colorStateListR.getDefaultColor());
                            ColorStateList colorStateListValueOf = ColorStateList.valueOf(iK);
                            jo9 jo9Var2 = jo9Var;
                            jo9Var2.j(colorStateListValueOf);
                            if (rqVar.v != null && (num2 = rqVar.w) != null && num2.equals(num)) {
                                rqVar.v.setTint(iK);
                            }
                            if (arrayList.isEmpty()) {
                                return;
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (it.next() != null) {
                                    ore.m();
                                    return;
                                } else if (jo9Var2.a.c != null) {
                                    throw null;
                                }
                            }
                        }
                    };
                    setBackground(jo9Var);
                } else {
                    jo9Var.h(context2);
                    this.q = new ValueAnimator.AnimatorUpdateListener() { // from class: kq
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            jo9Var.i(fFloatValue);
                            rq rqVar = this.a;
                            Drawable drawable2 = rqVar.v;
                            if (drawable2 instanceof jo9) {
                                ((jo9) drawable2).i(fFloatValue);
                            }
                            Iterator it = rqVar.r.iterator();
                            if (it.hasNext()) {
                                qt4.A(it.next());
                                throw null;
                            }
                        }
                    };
                    setBackground(jo9Var);
                }
            }
            this.s = e9i.u0(R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration), context2);
            this.t = e9i.v0(context2, R.attr.motionEasingStandardInterpolator, lk.a);
            if (typedArrayB2.hasValue(4)) {
                g(typedArrayB2.getBoolean(4, false), false, false);
            }
            if (typedArrayB2.hasValue(3)) {
                qe7.J(this, typedArrayB2.getDimensionPixelSize(3, 0));
            }
            if (typedArrayB2.hasValue(2)) {
                setKeyboardNavigationCluster(typedArrayB2.getBoolean(2, false));
            }
            if (typedArrayB2.hasValue(1)) {
                setTouchscreenBlocksFocus(typedArrayB2.getBoolean(1, false));
            }
            this.x = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.l = typedArrayB2.getBoolean(5, false);
            this.m = typedArrayB2.getResourceId(7, -1);
            setStatusBarForeground(typedArrayB2.getDrawable(8));
            typedArrayB2.recycle();
            y6j.l(this, new w4(this));
        } catch (Throwable th) {
            typedArrayB.recycle();
            throw th;
        }
    }

    public static pq c(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            pq pqVar = new pq((LinearLayout.LayoutParams) layoutParams);
            pqVar.a = 1;
            return pqVar;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            pq pqVar2 = new pq((ViewGroup.MarginLayoutParams) layoutParams);
            pqVar2.a = 1;
            return pqVar2;
        }
        pq pqVar3 = new pq(layoutParams);
        pqVar3.a = 1;
        return pqVar3;
    }

    public final void a(oq oqVar) {
        if (this.h == null) {
            this.h = new ArrayList();
        }
        if (oqVar == null || this.h.contains(oqVar)) {
            return;
        }
        this.h.add(oqVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: b */
    public final pq generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        pq pqVar = new pq(context, attributeSet);
        pqVar.a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k3e.b);
        pqVar.a = typedArrayObtainStyledAttributes.getInt(1, 0);
        pqVar.b = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new fik(3);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            pqVar.c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return pqVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof pq;
    }

    public final void d() {
        AppBarLayout$Behavior appBarLayout$Behavior = this.y;
        nq nqVarD = (appBarLayout$Behavior == null || this.b == -1 || this.f != 0) ? null : appBarLayout$Behavior.D(e0.b, this);
        this.b = -1;
        this.c = -1;
        this.d = -1;
        if (nqVarD != null) {
            AppBarLayout$Behavior appBarLayout$Behavior2 = this.y;
            if (appBarLayout$Behavior2.m != null) {
                return;
            }
            appBarLayout$Behavior2.m = nqVarD;
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.v == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.a);
        this.v.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.v;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final void e(int i) {
        this.a = i;
        if (!willNotDraw()) {
            WeakHashMap weakHashMap = i7j.a;
            postInvalidateOnAnimation();
        }
        ArrayList arrayList = this.h;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                oq oqVar = (oq) this.h.get(i2);
                if (oqVar != null) {
                    oqVar.R0(this, i);
                }
            }
        }
    }

    public final void f(oq oqVar) {
        ArrayList arrayList = this.h;
        if (arrayList == null || oqVar == null) {
            return;
        }
        arrayList.remove(oqVar);
    }

    public final void g(boolean z, boolean z2, boolean z3) {
        this.f = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new pq();
    }

    public ys4 getBehavior() {
        AppBarLayout$Behavior appBarLayout$Behavior = new AppBarLayout$Behavior();
        this.y = appBarLayout$Behavior;
        return appBarLayout$Behavior;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                pq pqVar = (pq) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = pqVar.a;
                if ((i3 & 5) != 5) {
                    if (i2 > 0) {
                        break;
                    }
                } else {
                    int i4 = ((LinearLayout.LayoutParams) pqVar).topMargin + ((LinearLayout.LayoutParams) pqVar).bottomMargin;
                    if ((i3 & 8) != 0) {
                        WeakHashMap weakHashMap = i7j.a;
                        minimumHeight = childAt.getMinimumHeight();
                    } else {
                        if ((i3 & 2) != 0) {
                            WeakHashMap weakHashMap2 = i7j.a;
                            minimumHeight = measuredHeight - childAt.getMinimumHeight();
                        } else {
                            iMin = i4 + measuredHeight;
                        }
                        if (childCount == 0) {
                            WeakHashMap weakHashMap3 = i7j.a;
                            if (childAt.getFitsSystemWindows()) {
                                iMin = Math.min(iMin, measuredHeight - getTopInset());
                            }
                        }
                        i2 += iMin;
                    }
                    iMin = minimumHeight + i4;
                    if (childCount == 0) {
                        WeakHashMap weakHashMap4 = i7j.a;
                        if (childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                    }
                    i2 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i2);
        this.c = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                pq pqVar = (pq) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) pqVar).topMargin + ((LinearLayout.LayoutParams) pqVar).bottomMargin + childAt.getMeasuredHeight();
                int i3 = pqVar.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i3 & 2) != 0) {
                    WeakHashMap weakHashMap = i7j.a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.d = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.m;
    }

    public jo9 getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof jo9) {
            return (jo9) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap weakHashMap = i7j.a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f;
    }

    public Drawable getStatusBarForeground() {
        return this.v;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        ixj ixjVar = this.g;
        if (ixjVar != null) {
            return ixjVar.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                pq pqVar = (pq) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = pqVar.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) pqVar).topMargin + ((LinearLayout.LayoutParams) pqVar).bottomMargin + minimumHeight;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = i7j.a;
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= getTopInset();
                    }
                }
                minimumHeight = topInset;
                if ((i3 & 2) != 0) {
                    WeakHashMap weakHashMap2 = i7j.a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.b = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final boolean h(boolean z) {
        if (this.i || this.k == z) {
            return false;
        }
        this.k = z;
        refreshDrawableState();
        if (!(getBackground() instanceof jo9)) {
            return true;
        }
        if (this.o) {
            j(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
            return true;
        }
        if (!this.l) {
            return true;
        }
        float f = this.x;
        j(z ? 0.0f : f, z ? f : 0.0f);
        return true;
    }

    public final boolean i(View view) {
        int i;
        if (this.n == null && (i = this.m) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.m);
            }
            if (viewFindViewById != null) {
                this.n = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.n;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    public final void j(float f, float f2) {
        ValueAnimator valueAnimator = this.p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.p = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.s);
        this.p.setInterpolator(this.t);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.q;
        if (animatorUpdateListener != null) {
            this.p.addUpdateListener(animatorUpdateListener);
        }
        this.p.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof jo9) {
            p90.P(this, (jo9) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.u == null) {
            this.u = new int[4];
        }
        int[] iArr = this.u;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.j;
        int i2 = R.attr.state_liftable;
        if (!z) {
            i2 = -R.attr.state_liftable;
        }
        iArr[0] = i2;
        int i3 = R.attr.state_lifted;
        if (!z || !this.k) {
            i3 = -R.attr.state_lifted;
        }
        iArr[1] = i3;
        int i4 = R.attr.state_collapsible;
        if (!z) {
            i4 = -R.attr.state_collapsible;
        }
        iArr[2] = i4;
        int i5 = R.attr.state_collapsed;
        if (!z || !this.k) {
            i5 = -R.attr.state_collapsed;
        }
        iArr[3] = i5;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.n = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        WeakHashMap weakHashMap = i7j.a;
        boolean z2 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    getChildAt(childCount).offsetTopAndBottom(topInset);
                }
            }
        }
        d();
        this.e = false;
        int childCount2 = getChildCount();
        for (int i5 = 0; i5 < childCount2; i5++) {
            if (((pq) getChildAt(i5).getLayoutParams()).c != null) {
                this.e = true;
                break;
            }
        }
        Drawable drawable = this.v;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.i) {
            return;
        }
        if (!this.l) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((pq) getChildAt(i6).getLayoutParams()).a;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        if (this.j != z2) {
            this.j = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            WeakHashMap weakHashMap = i7j.a;
            if (getFitsSystemWindows() && getChildCount() > 0) {
                View childAt = getChildAt(0);
                if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                    int measuredHeight = getMeasuredHeight();
                    if (mode == Integer.MIN_VALUE) {
                        measuredHeight = np4.f(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                    } else if (mode == 0) {
                        measuredHeight += getTopInset();
                    }
                    setMeasuredDimension(getMeasuredWidth(), measuredHeight);
                }
            }
        }
        d();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof jo9) {
            ((jo9) background).i(f);
        }
    }

    public void setExpanded(boolean z) {
        WeakHashMap weakHashMap = i7j.a;
        g(z, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.l = z;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.m = -1;
        if (view != null) {
            this.n = new WeakReference(view);
            return;
        }
        WeakReference weakReference = this.n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.n = null;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.m = i;
        WeakReference weakReference = this.n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.n = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.i = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
        } else {
            ore.p("AppBarLayout is always vertical and does not support horizontal orientation");
        }
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.v;
        if (drawable2 != drawable) {
            Integer numValueOf = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.v = drawableMutate;
            if (drawableMutate instanceof jo9) {
                numValueOf = Integer.valueOf(((jo9) drawableMutate).u);
            } else {
                ColorStateList colorStateListK = f55.k(drawableMutate);
                if (colorStateListK != null) {
                    numValueOf = Integer.valueOf(colorStateListK.getDefaultColor());
                }
            }
            this.w = numValueOf;
            Drawable drawable3 = this.v;
            boolean z = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.v.setState(getDrawableState());
                }
                Drawable drawable4 = this.v;
                WeakHashMap weakHashMap = i7j.a;
                tsl.c(getLayoutDirection(), drawable4);
                this.v.setVisible(getVisibility() == 0, false);
                this.v.setCallback(this);
            }
            if (this.v != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(!z);
            WeakHashMap weakHashMap2 = i7j.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(wk8.o(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        qe7.J(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.v;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.v;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return c(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new pq();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return c(layoutParams);
    }
}
