package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class xgh extends HorizontalScrollView {
    public static final sbd q1 = new sbd(16);
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public boolean G;
    public gp0 H;
    public final TimeInterpolator I;
    public rgh J;
    public final ArrayList K;
    public int a;
    public final ArrayList b;
    public ugh c;
    public final tgh d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public ColorStateList l;
    public ColorStateList m;
    public ColorStateList n;
    public ValueAnimator n1;
    public Drawable o;
    public int o1;
    public int p;
    public final rbd p1;
    public final float q;
    public final float r;
    public final int s;
    public int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public int y;
    public final int z;

    public xgh(Context context) {
        super(p90.T(context, null, R.attr.tabStyle, R.style.Widget_Design_TabLayout), null, R.attr.tabStyle);
        this.a = -1;
        this.b = new ArrayList();
        this.k = -1;
        this.p = 0;
        this.t = Integer.MAX_VALUE;
        this.E = -1;
        this.K = new ArrayList();
        this.p1 = new rbd(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        tgh tghVar = new tgh(this, context2);
        this.d = tghVar;
        super.addView(tghVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayB = ch3.B(context2, null, k3e.A, R.attr.tabStyle, R.style.Widget_Design_TabLayout, 24);
        ColorStateList colorStateListK = f55.k(getBackground());
        if (colorStateListK != null) {
            jo9 jo9Var = new jo9();
            jo9Var.j(colorStateListK);
            jo9Var.h(context2);
            WeakHashMap weakHashMap = i7j.a;
            jo9Var.i(y6j.e(this));
            setBackground(jo9Var);
        }
        setSelectedTabIndicator(cqk.t(context2, typedArrayB, 5));
        setSelectedTabIndicatorColor(typedArrayB.getColor(8, 0));
        tghVar.b(typedArrayB.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(typedArrayB.getInt(10, 0));
        setTabIndicatorAnimationMode(typedArrayB.getInt(7, 0));
        setTabIndicatorFullWidth(typedArrayB.getBoolean(9, true));
        int dimensionPixelSize = typedArrayB.getDimensionPixelSize(16, 0);
        this.h = dimensionPixelSize;
        this.g = dimensionPixelSize;
        this.f = dimensionPixelSize;
        this.e = dimensionPixelSize;
        this.e = typedArrayB.getDimensionPixelSize(19, dimensionPixelSize);
        this.f = typedArrayB.getDimensionPixelSize(20, dimensionPixelSize);
        this.g = typedArrayB.getDimensionPixelSize(18, dimensionPixelSize);
        this.h = typedArrayB.getDimensionPixelSize(17, dimensionPixelSize);
        if (e9i.t0(R.attr.isMaterial3Theme, context2, false)) {
            this.i = R.attr.textAppearanceTitleSmall;
        } else {
            this.i = R.attr.textAppearanceButton;
        }
        int resourceId = typedArrayB.getResourceId(24, R.style.TextAppearance_Design_Tab);
        this.j = resourceId;
        int[] iArr = l3e.w;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.q = dimensionPixelSize2;
            this.l = cqk.r(context2, typedArrayObtainStyledAttributes, 3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayB.hasValue(22)) {
                this.k = typedArrayB.getResourceId(22, resourceId);
            }
            int i = this.k;
            if (i != -1) {
                TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(i, iArr);
                try {
                    typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, (int) dimensionPixelSize2);
                    ColorStateList colorStateListR = cqk.r(context2, typedArrayObtainStyledAttributes2, 3);
                    if (colorStateListR != null) {
                        this.l = f(this.l.getDefaultColor(), colorStateListR.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListR.getDefaultColor()));
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th;
                }
            }
            if (typedArrayB.hasValue(25)) {
                this.l = cqk.r(context2, typedArrayB, 25);
            }
            if (typedArrayB.hasValue(23)) {
                this.l = f(this.l.getDefaultColor(), typedArrayB.getColor(23, 0));
            }
            this.m = cqk.r(context2, typedArrayB, 3);
            e9i.o0(typedArrayB.getInt(4, -1), null);
            this.n = cqk.r(context2, typedArrayB, 21);
            this.z = typedArrayB.getInt(6, 300);
            this.I = e9i.v0(context2, R.attr.motionEasingEmphasizedInterpolator, lk.b);
            this.u = typedArrayB.getDimensionPixelSize(14, -1);
            this.v = typedArrayB.getDimensionPixelSize(13, -1);
            this.s = typedArrayB.getResourceId(0, 0);
            this.x = typedArrayB.getDimensionPixelSize(1, 0);
            this.B = typedArrayB.getInt(15, 1);
            this.y = typedArrayB.getInt(2, 0);
            this.C = typedArrayB.getBoolean(12, false);
            this.G = typedArrayB.getBoolean(26, false);
            typedArrayB.recycle();
            Resources resources = getResources();
            this.r = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.w = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            d();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public static ColorStateList f(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.u;
        if (i != -1) {
            return i;
        }
        int i2 = this.B;
        if (i2 == 0 || i2 == 2) {
            return this.w;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        tgh tghVar = this.d;
        int childCount = tghVar.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = tghVar.getChildAt(i2);
                if ((i2 != i || childAt.isSelected()) && (i2 == i || !childAt.isSelected())) {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                } else {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                    if (childAt instanceof wgh) {
                        ((wgh) childAt).e();
                    }
                }
                i2++;
            }
        }
    }

    public final void a(rgh rghVar) {
        ArrayList arrayList = this.K;
        if (arrayList.contains(rghVar)) {
            return;
        }
        arrayList.add(rghVar);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void b(ugh ughVar, int i, boolean z) {
        if (ughVar.c != this) {
            ore.p("Tab belongs to a different TabLayout.");
            return;
        }
        ughVar.a = i;
        ArrayList arrayList = this.b;
        arrayList.add(i, ughVar);
        int size = arrayList.size();
        int i2 = -1;
        for (int i3 = i + 1; i3 < size; i3++) {
            if (((ugh) arrayList.get(i3)).a == this.a) {
                i2 = i3;
            }
            ((ugh) arrayList.get(i3)).a = i3;
        }
        this.a = i2;
        wgh wghVar = ughVar.d;
        wghVar.setSelected(false);
        wghVar.setActivated(false);
        int i4 = ughVar.a;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.B == 1 && this.y == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.d.addView(wghVar, i4, layoutParams);
        if (z) {
            ughVar.a();
        }
    }

    public final void c(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap = i7j.a;
            if (isLaidOut()) {
                tgh tghVar = this.d;
                int childCount = tghVar.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (tghVar.getChildAt(i2).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int iE = e(i, 0.0f);
                if (scrollX != iE) {
                    g();
                    this.n1.setIntValues(scrollX, iE);
                    this.n1.start();
                }
                ValueAnimator valueAnimator = tghVar.a;
                if (valueAnimator != null && valueAnimator.isRunning() && tghVar.b.a != i) {
                    tghVar.a.cancel();
                }
                tghVar.d(i, this.z, true);
                return;
            }
        }
        o(i, 0.0f, true, true, true);
    }

    public final void d() {
        int i = this.B;
        int iMax = (i == 0 || i == 2) ? Math.max(0, this.x - this.e) : 0;
        WeakHashMap weakHashMap = i7j.a;
        tgh tghVar = this.d;
        tghVar.setPaddingRelative(iMax, 0, 0, 0);
        int i2 = this.B;
        if (i2 == 0) {
            int i3 = this.y;
            if (i3 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i3 == 1) {
                tghVar.setGravity(1);
            } else if (i3 == 2) {
            }
            tghVar.setGravity(8388611);
        } else if (i2 == 1 || i2 == 2) {
            if (this.y == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            tghVar.setGravity(1);
        }
        p(true);
    }

    public final int e(int i, float f) {
        tgh tghVar;
        View childAt;
        int i2 = this.B;
        if ((i2 != 0 && i2 != 2) || (childAt = (tghVar = this.d).getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        View childAt2 = i3 < tghVar.getChildCount() ? tghVar.getChildAt(i3) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        WeakHashMap weakHashMap = i7j.a;
        return getLayoutDirection() == 0 ? left + i4 : left - i4;
    }

    public final void g() {
        if (this.n1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.n1 = valueAnimator;
            valueAnimator.setInterpolator(this.I);
            this.n1.setDuration(this.z);
            this.n1.addUpdateListener(new m11(4, this));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        ugh ughVar = this.c;
        if (ughVar != null) {
            return ughVar.a;
        }
        return -1;
    }

    public int getTabCount() {
        return this.b.size();
    }

    public int getTabGravity() {
        return this.y;
    }

    public ColorStateList getTabIconTint() {
        return this.m;
    }

    public int getTabIndicatorAnimationMode() {
        return this.F;
    }

    public int getTabIndicatorGravity() {
        return this.A;
    }

    public int getTabMaxWidth() {
        return this.t;
    }

    public int getTabMode() {
        return this.B;
    }

    public ColorStateList getTabRippleColor() {
        return this.n;
    }

    public Drawable getTabSelectedIndicator() {
        return this.o;
    }

    public ColorStateList getTabTextColors() {
        return this.l;
    }

    public final ugh h(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (ugh) this.b.get(i);
    }

    public final ugh i() {
        ugh ughVar = (ugh) q1.a();
        if (ughVar == null) {
            ughVar = new ugh();
            ughVar.a = -1;
        }
        ughVar.c = this;
        rbd rbdVar = this.p1;
        wgh wghVar = rbdVar != null ? (wgh) rbdVar.a() : null;
        if (wghVar == null) {
            wghVar = new wgh(this, getContext());
        }
        wghVar.setTab(ughVar);
        wghVar.setFocusable(true);
        wghVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(null)) {
            wghVar.setContentDescription(null);
        } else {
            wghVar.setContentDescription(null);
        }
        ughVar.d = wghVar;
        return ughVar;
    }

    public final void j() {
        for (int childCount = this.d.getChildCount() - 1; childCount >= 0; childCount--) {
            m(childCount);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ugh ughVar = (ugh) it.next();
            it.remove();
            ughVar.c = null;
            ughVar.d = null;
            ughVar.a = -1;
            ughVar.b = null;
            q1.d(ughVar);
        }
        this.c = null;
    }

    public final void k(rgh rghVar) {
        this.K.remove(rghVar);
    }

    public final void l(int i) {
        ugh ughVar = this.c;
        int i2 = ughVar != null ? ughVar.a : 0;
        m(i);
        ArrayList arrayList = this.b;
        ugh ughVar2 = (ugh) arrayList.remove(i);
        int i3 = -1;
        if (ughVar2 != null) {
            ughVar2.c = null;
            ughVar2.d = null;
            ughVar2.a = -1;
            ughVar2.b = null;
            q1.d(ughVar2);
        }
        int size = arrayList.size();
        for (int i4 = i; i4 < size; i4++) {
            if (((ugh) arrayList.get(i4)).a == this.a) {
                i3 = i4;
            }
            ((ugh) arrayList.get(i4)).a = i4;
        }
        this.a = i3;
        if (i2 == i) {
            n(arrayList.isEmpty() ? null : (ugh) arrayList.get(Math.max(0, i - 1)), true);
        }
    }

    public final void m(int i) {
        tgh tghVar = this.d;
        wgh wghVar = (wgh) tghVar.getChildAt(i);
        tghVar.removeViewAt(i);
        if (wghVar != null) {
            wghVar.setTab(null);
            wghVar.setSelected(false);
            this.p1.d(wghVar);
        }
        requestLayout();
    }

    public final void n(ugh ughVar, boolean z) {
        xgh xghVar;
        ugh ughVar2 = this.c;
        ArrayList arrayList = this.K;
        if (ughVar2 == ughVar) {
            if (ughVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((rgh) arrayList.get(size)).getClass();
                }
                c(ughVar.a);
                return;
            }
            return;
        }
        int i = ughVar != null ? ughVar.a : -1;
        if (z) {
            if ((ughVar2 == null || ughVar2.a == -1) && i != -1) {
                xghVar = this;
                xghVar.o(i, 0.0f, true, true, true);
            } else {
                xghVar = this;
                xghVar.c(i);
            }
            if (i != -1) {
                xghVar.setSelectedTabView(i);
            }
        } else {
            xghVar = this;
        }
        xghVar.c = ughVar;
        if (ughVar2 != null && ughVar2.c != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((rgh) arrayList.get(size2)).getClass();
            }
        }
        if (ughVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((rgh) arrayList.get(size3)).a(ughVar);
            }
        }
    }

    public final void o(int i, float f, boolean z, boolean z2, boolean z3) {
        float f2 = i + f;
        int iRound = Math.round(f2);
        if (iRound >= 0) {
            tgh tghVar = this.d;
            if (iRound >= tghVar.getChildCount()) {
                return;
            }
            if (z2) {
                tghVar.b.a = Math.round(f2);
                ValueAnimator valueAnimator = tghVar.a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    tghVar.a.cancel();
                }
                tghVar.c(tghVar.getChildAt(i), tghVar.getChildAt(i + 1), f);
            }
            ValueAnimator valueAnimator2 = this.n1;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.n1.cancel();
            }
            int iE = e(i, f);
            int scrollX = getScrollX();
            boolean z4 = (i < getSelectedTabPosition() && iE >= scrollX) || (i > getSelectedTabPosition() && iE <= scrollX) || i == getSelectedTabPosition();
            WeakHashMap weakHashMap = i7j.a;
            if (getLayoutDirection() == 1) {
                z4 = (i < getSelectedTabPosition() && iE <= scrollX) || (i > getSelectedTabPosition() && iE >= scrollX) || i == getSelectedTabPosition();
            }
            if (z4 || this.o1 == 1 || z3) {
                if (i < 0) {
                    iE = 0;
                }
                scrollTo(iE, 0);
            }
            if (z) {
                setSelectedTabView(iRound);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof jo9) {
            p90.P(this, (jo9) background);
        }
        getParent();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        wgh wghVar;
        Drawable drawable;
        int i = 0;
        while (true) {
            tgh tghVar = this.d;
            if (i >= tghVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = tghVar.getChildAt(i);
            if ((childAt instanceof wgh) && (drawable = (wghVar = (wgh) childAt).i) != null) {
                drawable.setBounds(wghVar.getLeft(), wghVar.getTop(), wghVar.getRight(), wghVar.getBottom());
                wghVar.i.draw(canvas);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) w4.m(1, getTabCount(), 1).a);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iRound = Math.round(e9i.J(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + iRound, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int iJ = this.v;
            if (iJ <= 0) {
                iJ = (int) (size - e9i.J(getContext(), 56));
            }
            this.t = iJ;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i3 = this.B;
            if (i3 == 0) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (i3 != 1) {
                if (i3 != 2) {
                    return;
                }
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void p(boolean z) {
        int i = 0;
        while (true) {
            tgh tghVar = this.d;
            if (i >= tghVar.getChildCount()) {
                return;
            }
            View childAt = tghVar.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.B == 1 && this.y == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof jo9) {
            ((jo9) background).i(f);
        }
    }

    public void setInlineLabel(boolean z) {
        if (this.C == z) {
            return;
        }
        this.C = z;
        int i = 0;
        while (true) {
            tgh tghVar = this.d;
            if (i >= tghVar.getChildCount()) {
                d();
                return;
            }
            View childAt = tghVar.getChildAt(i);
            if (childAt instanceof wgh) {
                wgh wghVar = (wgh) childAt;
                wghVar.setOrientation(!wghVar.k.C ? 1 : 0);
                TextView textView = wghVar.g;
                if (textView == null && wghVar.h == null) {
                    wghVar.f(wghVar.b, wghVar.c, true);
                } else {
                    wghVar.f(textView, wghVar.h, false);
                }
            }
            i++;
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(rgh rghVar) {
        rgh rghVar2 = this.J;
        if (rghVar2 != null) {
            k(rghVar2);
        }
        this.J = rghVar;
        if (rghVar != null) {
            a(rghVar);
        }
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        g();
        this.n1.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = drawable.mutate();
        this.o = drawableMutate;
        int i = this.p;
        if (i != 0) {
            drawableMutate.setTint(i);
        } else {
            drawableMutate.setTintList(null);
        }
        int intrinsicHeight = this.E;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.o.getIntrinsicHeight();
        }
        this.d.b(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.p = i;
        Drawable drawable = this.o;
        if (i != 0) {
            drawable.setTint(i);
        } else {
            drawable.setTintList(null);
        }
        p(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.A != i) {
            this.A = i;
            WeakHashMap weakHashMap = i7j.a;
            this.d.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.E = i;
        this.d.b(i);
    }

    public void setTabGravity(int i) {
        if (this.y != i) {
            this.y = i;
            d();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ugh) arrayList.get(i)).c();
            }
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(np4.l(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.F = i;
        if (i == 0) {
            this.H = new gp0(25);
            return;
        }
        if (i == 1) {
            this.H = new p36(0);
        } else {
            if (i == 2) {
                this.H = new p36(1);
                return;
            }
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.D = z;
        int i = tgh.c;
        tgh tghVar = this.d;
        tghVar.a(tghVar.b.getSelectedTabPosition());
        WeakHashMap weakHashMap = i7j.a;
        tghVar.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.B) {
            this.B = i;
            d();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.n == colorStateList) {
            return;
        }
        this.n = colorStateList;
        int i = 0;
        while (true) {
            tgh tghVar = this.d;
            if (i >= tghVar.getChildCount()) {
                return;
            }
            View childAt = tghVar.getChildAt(i);
            if (childAt instanceof wgh) {
                Context context = getContext();
                int i2 = wgh.l;
                ((wgh) childAt).d(context);
            }
            i++;
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(np4.l(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ugh) arrayList.get(i)).c();
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(vlc vlcVar) {
        j();
    }

    public void setUnboundedRipple(boolean z) {
        if (this.G == z) {
            return;
        }
        this.G = z;
        int i = 0;
        while (true) {
            tgh tghVar = this.d;
            if (i >= tghVar.getChildCount()) {
                return;
            }
            View childAt = tghVar.getChildAt(i);
            if (childAt instanceof wgh) {
                Context context = getContext();
                int i2 = wgh.l;
                ((wgh) childAt).d(context);
            }
            i++;
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(z8j z8jVar) {
        j();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Deprecated
    public void setOnTabSelectedListener(sgh sghVar) {
        setOnTabSelectedListener((rgh) sghVar);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(wk8.o(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
