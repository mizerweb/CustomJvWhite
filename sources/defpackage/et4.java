package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public class et4 extends ViewGroup implements fcb, gcb {
    public static final String s;
    public static final Class[] t;
    public static final ThreadLocal u;
    public static final o6 v;
    public static final sbd w;
    public final ArrayList a;
    public final gvb b;
    public final ArrayList c;
    public final int[] d;
    public final int[] e;
    public boolean f;
    public boolean g;
    public final int[] h;
    public View i;
    public View j;
    public ct4 k;
    public boolean l;
    public ixj m;
    public boolean n;
    public Drawable o;
    public ViewGroup.OnHierarchyChangeListener p;
    public zo7 q;
    public final bs0 r;

    static {
        Package r0 = et4.class.getPackage();
        s = r0 != null ? r0.getName() : null;
        v = new o6(4);
        t = new Class[]{Context.class, AttributeSet.class};
        u = new ThreadLocal();
        w = new sbd(12);
    }

    public et4(Context context) {
        super(context, null, R.attr.coordinatorLayoutStyle);
        this.a = new ArrayList();
        this.b = new gvb(6);
        this.c = new ArrayList();
        this.d = new int[2];
        this.e = new int[2];
        this.r = new bs0(1);
        int[] iArr = f3e.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.coordinatorLayoutStyle, 0);
        i7j.k(this, context, iArr, null, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.h = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                int[] iArr2 = this.h;
                iArr2[i] = (int) (iArr2[i] * f);
            }
        }
        this.o = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        y();
        super.setOnHierarchyChangeListener(new at4(0, this));
        WeakHashMap weakHashMap = i7j.a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect a() {
        Rect rect = (Rect) w.a();
        return rect == null ? new Rect() : rect;
    }

    public static void i(int i, Rect rect, Rect rect2, bt4 bt4Var, int i2, int i3) {
        int iWidth;
        int iHeight;
        int i4 = bt4Var.c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = bt4Var.d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 != 1) {
            iWidth = i8 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            iHeight = i9 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    public static bt4 k(View view) {
        bt4 bt4Var = (bt4) view.getLayoutParams();
        if (!bt4Var.b) {
            if (view instanceof rq) {
                ys4 behavior = ((rq) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                bt4Var.b(behavior);
                bt4Var.b = true;
                return bt4Var;
            }
            zs4 zs4Var = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                zs4Var = (zs4) superclass.getAnnotation(zs4.class);
                if (zs4Var != null) {
                    break;
                }
            }
            if (zs4Var != null) {
                try {
                    bt4Var.b((ys4) zs4Var.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + zs4Var.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            bt4Var.b = true;
        }
        return bt4Var;
    }

    public static void w(View view, int i) {
        bt4 bt4Var = (bt4) view.getLayoutParams();
        int i2 = bt4Var.i;
        if (i2 != i) {
            WeakHashMap weakHashMap = i7j.a;
            view.offsetLeftAndRight(i - i2);
            bt4Var.i = i;
        }
    }

    public static void x(View view, int i) {
        bt4 bt4Var = (bt4) view.getLayoutParams();
        int i2 = bt4Var.j;
        if (i2 != i) {
            WeakHashMap weakHashMap = i7j.a;
            view.offsetTopAndBottom(i - i2);
            bt4Var.j = i;
        }
    }

    public final void b(bt4 bt4Var, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) bt4Var).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) bt4Var).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) bt4Var).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) bt4Var).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    public final void c(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            h(rect, view);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof bt4) && super.checkLayoutParams(layoutParams);
    }

    public final List d(View view) {
        h6g h6gVar = (h6g) this.b.c;
        int i = h6gVar.c;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) h6gVar.i(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(h6gVar.f(i2));
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        ys4 ys4Var = ((bt4) view.getLayoutParams()).a;
        if (ys4Var != null) {
            ys4Var.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.o;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // defpackage.fcb
    public final void e(View view, View view2, int i, int i2) {
        bs0 bs0Var = this.r;
        if (i2 == 1) {
            bs0Var.c = i;
        } else {
            bs0Var.b = i;
        }
        this.j = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((bt4) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // defpackage.fcb
    public final void f(View view, int i) {
        bs0 bs0Var = this.r;
        if (i == 1) {
            bs0Var.c = 0;
        } else {
            bs0Var.b = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            bt4 bt4Var = (bt4) childAt.getLayoutParams();
            if (bt4Var.a(i)) {
                ys4 ys4Var = bt4Var.a;
                if (ys4Var != null) {
                    ys4Var.q(this, childAt, view, i);
                }
                if (i == 0) {
                    bt4Var.m = false;
                } else if (i == 1) {
                    bt4Var.n = false;
                }
                bt4Var.o = false;
            }
        }
        this.j = null;
    }

    @Override // defpackage.fcb
    public final void g(View view, int i, int i2, int[] iArr, int i3) {
        ys4 ys4Var;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                bt4 bt4Var = (bt4) childAt.getLayoutParams();
                if (bt4Var.a(i3) && (ys4Var = bt4Var.a) != null) {
                    int[] iArr2 = this.d;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    ys4Var.k(this, childAt, view, i, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new bt4(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof bt4) {
            return new bt4((bt4) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new bt4((ViewGroup.MarginLayoutParams) layoutParams) : new bt4(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        u();
        return Collections.unmodifiableList(this.a);
    }

    public final ixj getLastWindowInsets() {
        return this.m;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        bs0 bs0Var = this.r;
        return bs0Var.c | bs0Var.b;
    }

    public Drawable getStatusBarBackground() {
        return this.o;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(Rect rect, View view) {
        ThreadLocal threadLocal = r7j.a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = r7j.a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        r7j.a(this, view, matrix);
        ThreadLocal threadLocal3 = r7j.b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int j(int i) {
        int[] iArr = this.h;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    public final boolean l(View view, int i, int i2) {
        sbd sbdVar = w;
        Rect rectA = a();
        h(rectA, view);
        try {
            return rectA.contains(i, i2);
        } finally {
            rectA.setEmpty();
            sbdVar.d(rectA);
        }
    }

    @Override // defpackage.gcb
    public final void m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        ys4 ys4Var;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                bt4 bt4Var = (bt4) childAt.getLayoutParams();
                if (bt4Var.a(i5) && (ys4Var = bt4Var.a) != null) {
                    int[] iArr2 = this.d;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    ys4Var.l(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            p(1);
        }
    }

    @Override // defpackage.fcb
    public final void n(View view, int i, int i2, int i3, int i4, int i5) {
        m(view, i, i2, i3, i4, 0, this.e);
    }

    @Override // defpackage.fcb
    public final boolean o(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                bt4 bt4Var = (bt4) childAt.getLayoutParams();
                ys4 ys4Var = bt4Var.a;
                if (ys4Var != null) {
                    boolean zP = ys4Var.p(this, childAt, view, view2, i, i2);
                    z |= zP;
                    if (i2 == 0) {
                        bt4Var.m = zP;
                    } else if (i2 == 1) {
                        bt4Var.n = zP;
                    }
                } else if (i2 == 0) {
                    bt4Var.m = false;
                } else if (i2 == 1) {
                    bt4Var.n = false;
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
        if (this.l) {
            if (this.k == null) {
                this.k = new ct4(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.k);
        }
        if (this.m == null) {
            WeakHashMap weakHashMap = i7j.a;
            if (getFitsSystemWindows()) {
                w6j.c(this);
            }
        }
        this.g = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v();
        if (this.l && this.k != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.k);
        }
        View view = this.j;
        if (view != null) {
            f(view, 0);
        }
        this.g = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.n || this.o == null) {
            return;
        }
        ixj ixjVar = this.m;
        int iD = ixjVar != null ? ixjVar.d() : 0;
        if (iD > 0) {
            this.o.setBounds(0, 0, getWidth(), iD);
            this.o.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            v();
        }
        boolean zT = t(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zT;
        }
        this.i = null;
        v();
        return zT;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ys4 ys4Var;
        WeakHashMap weakHashMap = i7j.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((ys4Var = ((bt4) view.getLayoutParams()).a) == null || !ys4Var.h(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x012c  */
    /* JADX WARN: Code duplicated, block: B:72:0x015d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0167  */
    /* JADX WARN: Code duplicated, block: B:78:0x0186  */
    /* JADX WARN: Code duplicated, block: B:79:0x0189  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        ys4 ys4Var;
        int i6;
        int i7;
        boolean z2;
        int i8;
        int i9;
        ArrayList arrayList;
        int i10;
        View view;
        int i11;
        boolean zI;
        int iMax;
        et4 et4Var = this;
        et4Var.u();
        int childCount = et4Var.getChildCount();
        int i12 = 0;
        loop0: while (true) {
            if (i12 >= childCount) {
                z = false;
                break;
            }
            View childAt = et4Var.getChildAt(i12);
            h6g h6gVar = (h6g) et4Var.b.c;
            int i13 = h6gVar.c;
            for (int i14 = 0; i14 < i13; i14++) {
                ArrayList arrayList2 = (ArrayList) h6gVar.i(i14);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z = true;
                    break loop0;
                }
            }
            i12++;
        }
        if (z != et4Var.l) {
            boolean z3 = et4Var.g;
            if (z) {
                if (z3) {
                    if (et4Var.k == null) {
                        et4Var.k = new ct4(et4Var);
                    }
                    et4Var.getViewTreeObserver().addOnPreDrawListener(et4Var.k);
                }
                et4Var.l = true;
            } else {
                if (z3 && et4Var.k != null) {
                    et4Var.getViewTreeObserver().removeOnPreDrawListener(et4Var.k);
                }
                et4Var.l = false;
            }
        }
        int paddingLeft = et4Var.getPaddingLeft();
        int paddingTop = et4Var.getPaddingTop();
        int paddingRight = et4Var.getPaddingRight();
        int paddingBottom = et4Var.getPaddingBottom();
        WeakHashMap weakHashMap = i7j.a;
        int layoutDirection = et4Var.getLayoutDirection();
        boolean z4 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i15 = paddingLeft + paddingRight;
        int i16 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = et4Var.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = et4Var.getSuggestedMinimumHeight();
        boolean z5 = et4Var.m != null && et4Var.getFitsSystemWindows();
        ArrayList arrayList3 = et4Var.a;
        int size3 = arrayList3.size();
        int i17 = 0;
        int iCombineMeasuredStates = 0;
        while (i17 < size3) {
            View view2 = (View) arrayList3.get(i17);
            int i18 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i4 = size3;
                i11 = i17;
                i6 = paddingLeft;
                suggestedMinimumWidth = i18;
                z2 = false;
                i8 = paddingRight;
            } else {
                bt4 bt4Var = (bt4) view2.getLayoutParams();
                int i19 = bt4Var.e;
                if (i19 < 0 || mode == 0) {
                    i3 = suggestedMinimumHeight;
                } else {
                    int iJ = et4Var.j(i19);
                    int i20 = bt4Var.c;
                    if (i20 == 0) {
                        i20 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i20, layoutDirection) & 7;
                    i3 = suggestedMinimumHeight;
                    if ((absoluteGravity != 3 || z4) && !(absoluteGravity == 5 && z4)) {
                        if ((absoluteGravity == 5 && !z4) || (absoluteGravity == 3 && z4)) {
                            iMax = Math.max(0, iJ - paddingLeft);
                        }
                        if (z5 || view2.getFitsSystemWindows()) {
                            iMakeMeasureSpec = i;
                            iMakeMeasureSpec2 = i2;
                        } else {
                            int iC = et4Var.m.c() + et4Var.m.b();
                            int iA = et4Var.m.a() + et4Var.m.d();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iC, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iA, mode2);
                        }
                        ys4Var = bt4Var.a;
                        if (ys4Var != null) {
                            z2 = false;
                            i6 = paddingLeft;
                            i7 = i18;
                            i8 = paddingRight;
                            i9 = i3;
                            arrayList = arrayList3;
                            int i21 = iMakeMeasureSpec;
                            i11 = i17;
                            int i22 = iMakeMeasureSpec2;
                            zI = ys4Var.i(this, view2, i21, i5, i22);
                            view = view2;
                            iMakeMeasureSpec = i21;
                            i10 = i22;
                            if (zI) {
                                et4Var = this;
                            }
                            int iMax2 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) bt4Var).leftMargin + ((ViewGroup.MarginLayoutParams) bt4Var).rightMargin);
                            int iMax3 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) bt4Var).topMargin + ((ViewGroup.MarginLayoutParams) bt4Var).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                            suggestedMinimumWidth = iMax2;
                            suggestedMinimumHeight = iMax3;
                        } else {
                            i6 = paddingLeft;
                            i7 = i18;
                            z2 = false;
                            i8 = paddingRight;
                            i9 = i3;
                            arrayList = arrayList3;
                            i10 = iMakeMeasureSpec2;
                            view = view2;
                            i11 = i17;
                        }
                        et4Var = this;
                        et4Var.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
                        int iMax4 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) bt4Var).leftMargin + ((ViewGroup.MarginLayoutParams) bt4Var).rightMargin);
                        int iMax5 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) bt4Var).topMargin + ((ViewGroup.MarginLayoutParams) bt4Var).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax4;
                        suggestedMinimumHeight = iMax5;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iJ);
                    }
                    int i23 = size3;
                    i5 = iMax;
                    i4 = i23;
                    if (z5) {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    } else {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    }
                    ys4Var = bt4Var.a;
                    if (ys4Var != null) {
                        z2 = false;
                        i6 = paddingLeft;
                        i7 = i18;
                        i8 = paddingRight;
                        i9 = i3;
                        arrayList = arrayList3;
                        int i24 = iMakeMeasureSpec;
                        i11 = i17;
                        int i25 = iMakeMeasureSpec2;
                        zI = ys4Var.i(this, view2, i24, i5, i25);
                        view = view2;
                        iMakeMeasureSpec = i24;
                        i10 = i25;
                        if (zI) {
                            et4Var = this;
                        }
                        int iMax6 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) bt4Var).leftMargin + ((ViewGroup.MarginLayoutParams) bt4Var).rightMargin);
                        int iMax7 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) bt4Var).topMargin + ((ViewGroup.MarginLayoutParams) bt4Var).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax6;
                        suggestedMinimumHeight = iMax7;
                    } else {
                        i6 = paddingLeft;
                        i7 = i18;
                        z2 = false;
                        i8 = paddingRight;
                        i9 = i3;
                        arrayList = arrayList3;
                        i10 = iMakeMeasureSpec2;
                        view = view2;
                        i11 = i17;
                    }
                    et4Var = this;
                    et4Var.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
                    int iMax8 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) bt4Var).leftMargin + ((ViewGroup.MarginLayoutParams) bt4Var).rightMargin);
                    int iMax9 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) bt4Var).topMargin + ((ViewGroup.MarginLayoutParams) bt4Var).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax8;
                    suggestedMinimumHeight = iMax9;
                }
                i4 = size3;
                i5 = 0;
                if (z5) {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                } else {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                }
                ys4Var = bt4Var.a;
                if (ys4Var != null) {
                    z2 = false;
                    i6 = paddingLeft;
                    i7 = i18;
                    i8 = paddingRight;
                    i9 = i3;
                    arrayList = arrayList3;
                    int i26 = iMakeMeasureSpec;
                    i11 = i17;
                    int i27 = iMakeMeasureSpec2;
                    zI = ys4Var.i(this, view2, i26, i5, i27);
                    view = view2;
                    iMakeMeasureSpec = i26;
                    i10 = i27;
                    if (zI) {
                        et4Var = this;
                    }
                    int iMax10 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) bt4Var).leftMargin + ((ViewGroup.MarginLayoutParams) bt4Var).rightMargin);
                    int iMax11 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) bt4Var).topMargin + ((ViewGroup.MarginLayoutParams) bt4Var).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax10;
                    suggestedMinimumHeight = iMax11;
                } else {
                    i6 = paddingLeft;
                    i7 = i18;
                    z2 = false;
                    i8 = paddingRight;
                    i9 = i3;
                    arrayList = arrayList3;
                    i10 = iMakeMeasureSpec2;
                    view = view2;
                    i11 = i17;
                }
                et4Var = this;
                et4Var.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
                int iMax12 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) bt4Var).leftMargin + ((ViewGroup.MarginLayoutParams) bt4Var).rightMargin);
                int iMax13 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) bt4Var).topMargin + ((ViewGroup.MarginLayoutParams) bt4Var).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                suggestedMinimumWidth = iMax12;
                suggestedMinimumHeight = iMax13;
            }
            i17 = i11 + 1;
            paddingLeft = i6;
            paddingRight = i8;
            size3 = i4;
            arrayList3 = arrayList;
        }
        int i28 = iCombineMeasuredStates;
        et4Var.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i28), View.resolveSizeAndState(suggestedMinimumHeight, i2, i28 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                bt4 bt4Var = (bt4) childAt.getLayoutParams();
                if (bt4Var.a(0)) {
                    ys4 ys4Var = bt4Var.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        ys4 ys4Var;
        int childCount = getChildCount();
        boolean zJ = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                bt4 bt4Var = (bt4) childAt.getLayoutParams();
                if (bt4Var.a(0) && (ys4Var = bt4Var.a) != null) {
                    zJ |= ys4Var.j(childAt, view, f2);
                }
            }
        }
        return zJ;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        g(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        n(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        e(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof dt4)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        dt4 dt4Var = (dt4) parcelable;
        super.onRestoreInstanceState(dt4Var.a());
        SparseArray sparseArray = dt4Var.c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            ys4 ys4Var = k(childAt).a;
            if (id != -1 && ys4Var != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                ys4Var.n(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableO;
        dt4 dt4Var = new dt4(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            ys4 ys4Var = ((bt4) childAt.getLayoutParams()).a;
            if (id != -1 && ys4Var != null && (parcelableO = ys4Var.o(childAt)) != null) {
                sparseArray.append(id, parcelableO);
            }
        }
        dt4Var.c = sparseArray;
        return dt4Var;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return o(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        f(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zT;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.i;
        boolean z = false;
        if (view != null) {
            ys4 ys4Var = ((bt4) view.getLayoutParams()).a;
            zT = ys4Var != null ? ys4Var.r(this, this.i, motionEvent) : false;
        } else {
            zT = t(motionEvent, 1);
            if (actionMasked != 0 && zT) {
                z = true;
            }
        }
        if (this.i == null || actionMasked == 3) {
            zT |= super.onTouchEvent(motionEvent);
        } else if (z) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
            super.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return zT;
        }
        this.i = null;
        v();
        return zT;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00de  */
    public final void p(int i) {
        int i2;
        Rect rect;
        int i3;
        ArrayList arrayList;
        boolean zD;
        boolean z;
        boolean z2;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        bt4 bt4Var;
        int i10;
        View view;
        ys4 ys4Var;
        WeakHashMap weakHashMap = i7j.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        Rect rectA = a();
        Rect rectA2 = a();
        Rect rectA3 = a();
        int i11 = 0;
        while (true) {
            sbd sbdVar = w;
            if (i11 >= size) {
                Rect rect2 = rectA3;
                rectA.setEmpty();
                sbdVar.d(rectA);
                rectA2.setEmpty();
                sbdVar.d(rectA2);
                rect2.setEmpty();
                sbdVar.d(rect2);
                return;
            }
            View view2 = (View) arrayList2.get(i11);
            bt4 bt4Var2 = (bt4) view2.getLayoutParams();
            if (i != 0 || view2.getVisibility() != 8) {
                int i12 = 0;
                while (i12 < i11) {
                    if (bt4Var2.l == ((View) arrayList2.get(i12))) {
                        bt4 bt4Var3 = (bt4) view2.getLayoutParams();
                        if (bt4Var3.k != null) {
                            Rect rectA4 = a();
                            Rect rectA5 = a();
                            bt4 bt4Var4 = bt4Var2;
                            Rect rectA6 = a();
                            h(rectA4, bt4Var3.k);
                            c(view2, rectA5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            bt4Var = bt4Var4;
                            i10 = i12;
                            layoutDirection = layoutDirection;
                            view = view3;
                            i(layoutDirection, rectA4, rectA6, bt4Var3, measuredWidth, measuredHeight);
                            boolean z3 = (rectA6.left == rectA5.left && rectA6.top == rectA5.top) ? false : true;
                            b(bt4Var3, rectA6, measuredWidth, measuredHeight);
                            int i13 = rectA6.left - rectA5.left;
                            int i14 = rectA6.top - rectA5.top;
                            if (i13 != 0) {
                                WeakHashMap weakHashMap2 = i7j.a;
                                view.offsetLeftAndRight(i13);
                            }
                            if (i14 != 0) {
                                WeakHashMap weakHashMap3 = i7j.a;
                                view.offsetTopAndBottom(i14);
                            }
                            if (z3 && (ys4Var = bt4Var3.a) != null) {
                                ys4Var.d(this, view, bt4Var3.k);
                            }
                            rectA4.setEmpty();
                            sbdVar.d(rectA4);
                            rectA5.setEmpty();
                            sbdVar.d(rectA5);
                            rectA6.setEmpty();
                            sbdVar.d(rectA6);
                        } else {
                            bt4Var = bt4Var2;
                            i10 = i12;
                            view = view2;
                        }
                    } else {
                        bt4Var = bt4Var2;
                        i10 = i12;
                        view = view2;
                    }
                    i12 = i10 + 1;
                    bt4Var2 = bt4Var;
                    view2 = view;
                    arrayList2 = arrayList2;
                    size = size;
                    i11 = i11;
                    rectA3 = rectA3;
                }
                ArrayList arrayList3 = arrayList2;
                bt4 bt4Var5 = bt4Var2;
                int i15 = size;
                Rect rect3 = rectA3;
                i2 = i11;
                View view4 = view2;
                c(view4, rectA2, true);
                if (bt4Var5.g != 0 && !rectA2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(bt4Var5.g, layoutDirection);
                    int i16 = absoluteGravity & 112;
                    if (i16 == 48) {
                        rectA.top = Math.max(rectA.top, rectA2.bottom);
                    } else if (i16 == 80) {
                        rectA.bottom = Math.max(rectA.bottom, getHeight() - rectA2.top);
                    }
                    int i17 = absoluteGravity & 7;
                    if (i17 == 3) {
                        rectA.left = Math.max(rectA.left, rectA2.right);
                    } else if (i17 == 5) {
                        rectA.right = Math.max(rectA.right, getWidth() - rectA2.left);
                    }
                }
                if (bt4Var5.h != 0 && view4.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = i7j.a;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        bt4 bt4Var6 = (bt4) view4.getLayoutParams();
                        ys4 ys4Var2 = bt4Var6.a;
                        Rect rectA7 = a();
                        Rect rectA8 = a();
                        rectA8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (ys4Var2 == null || !ys4Var2.a(view4)) {
                            rectA7.set(rectA8);
                        } else if (!rectA8.contains(rectA7)) {
                            c.j("Rect should be within the child's bounds. Rect:", rectA7.toShortString(), " | Bounds:", rectA8.toShortString());
                            return;
                        }
                        rectA8.setEmpty();
                        sbdVar.d(rectA8);
                        if (rectA7.isEmpty()) {
                            rectA7.setEmpty();
                            sbdVar.d(rectA7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(bt4Var6.h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i8 = (rectA7.top - ((ViewGroup.MarginLayoutParams) bt4Var6).topMargin) - bt4Var6.j) >= (i9 = rectA.top)) {
                                z = false;
                            } else {
                                x(view4, i9 - i8);
                                z = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectA7.bottom) - ((ViewGroup.MarginLayoutParams) bt4Var6).bottomMargin) + bt4Var6.j) < (i7 = rectA.bottom)) {
                                x(view4, height - i7);
                                z = true;
                            }
                            if (!z) {
                                x(view4, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i5 = (rectA7.left - ((ViewGroup.MarginLayoutParams) bt4Var6).leftMargin) - bt4Var6.i) >= (i6 = rectA.left)) {
                                z2 = false;
                            } else {
                                w(view4, i6 - i5);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectA7.right) - ((ViewGroup.MarginLayoutParams) bt4Var6).rightMargin) + bt4Var6.i) < (i4 = rectA.right)) {
                                w(view4, width - i4);
                                z2 = true;
                            }
                            if (!z2) {
                                w(view4, 0);
                            }
                            rectA7.setEmpty();
                            sbdVar.d(rectA7);
                        }
                    }
                }
                if (i != 2) {
                    rect = rect3;
                    rect.set(((bt4) view4.getLayoutParams()).p);
                    if (rect.equals(rectA2)) {
                        arrayList = arrayList3;
                        i3 = i15;
                    } else {
                        ((bt4) view4.getLayoutParams()).p.set(rectA2);
                    }
                } else {
                    rect = rect3;
                }
                int i18 = i2 + 1;
                i3 = i15;
                while (true) {
                    arrayList = arrayList3;
                    if (i18 >= i3) {
                        break;
                    }
                    View view5 = (View) arrayList.get(i18);
                    bt4 bt4Var7 = (bt4) view5.getLayoutParams();
                    ys4 ys4Var3 = bt4Var7.a;
                    if (ys4Var3 != null && ys4Var3.b(view5, view4)) {
                        if (i == 0 && bt4Var7.o) {
                            bt4Var7.o = false;
                        } else {
                            if (i != 2) {
                                zD = ys4Var3.d(this, view5, view4);
                            } else {
                                ys4Var3.e(this, view4);
                                zD = true;
                            }
                            if (i == 1) {
                                bt4Var7.o = zD;
                            }
                        }
                    }
                    i18++;
                    arrayList3 = arrayList;
                }
            } else {
                arrayList = arrayList2;
                i3 = size;
                rect = rectA3;
                i2 = i11;
            }
            i11 = i2 + 1;
            rectA3 = rect;
            size = i3;
            arrayList2 = arrayList;
        }
    }

    public final void q(View view, int i) {
        int i2;
        bt4 bt4Var = (bt4) view.getLayoutParams();
        View view2 = bt4Var.k;
        if (view2 == null && bt4Var.f != -1) {
            ore.k("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            return;
        }
        sbd sbdVar = w;
        if (view2 != null) {
            Rect rectA = a();
            Rect rectA2 = a();
            try {
                h(rectA, view2);
                bt4 bt4Var2 = (bt4) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                i(i, rectA, rectA2, bt4Var2, measuredWidth, measuredHeight);
                b(bt4Var2, rectA2, measuredWidth, measuredHeight);
                view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
                return;
            } finally {
                rectA.setEmpty();
                sbdVar.d(rectA);
                rectA2.setEmpty();
                sbdVar.d(rectA2);
            }
        }
        int i3 = bt4Var.e;
        if (i3 < 0) {
            bt4 bt4Var3 = (bt4) view.getLayoutParams();
            Rect rectA3 = a();
            rectA3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) bt4Var3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) bt4Var3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) bt4Var3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) bt4Var3).bottomMargin);
            if (this.m != null) {
                WeakHashMap weakHashMap = i7j.a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectA3.left = this.m.b() + rectA3.left;
                    rectA3.top = this.m.d() + rectA3.top;
                    rectA3.right -= this.m.c();
                    rectA3.bottom -= this.m.a();
                }
            }
            Rect rectA4 = a();
            int i4 = bt4Var3.c;
            if ((i4 & 7) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            Gravity.apply(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), rectA3, rectA4, i);
            view.layout(rectA4.left, rectA4.top, rectA4.right, rectA4.bottom);
            rectA3.setEmpty();
            sbdVar.d(rectA3);
            rectA4.setEmpty();
            sbdVar.d(rectA4);
            return;
        }
        bt4 bt4Var4 = (bt4) view.getLayoutParams();
        int i5 = bt4Var4.c;
        if (i5 == 0) {
            i5 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i3 = width - i3;
        }
        int iJ = j(i3) - measuredWidth2;
        if (i6 == 1) {
            iJ += measuredWidth2 / 2;
        } else if (i6 == 5) {
            iJ += measuredWidth2;
        }
        if (i7 != 16) {
            i2 = i7 != 80 ? 0 : measuredHeight2;
        } else {
            i2 = measuredHeight2 / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) bt4Var4).leftMargin, Math.min(iJ, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) bt4Var4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) bt4Var4).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) bt4Var4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public final void r(View view, int i, int i2, int i3) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        ys4 ys4Var = ((bt4) view.getLayoutParams()).a;
        if (ys4Var == null || !ys4Var.m(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f) {
            return;
        }
        if (this.i == null) {
            int childCount = getChildCount();
            MotionEvent motionEventObtain = null;
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                ys4 ys4Var = ((bt4) childAt.getLayoutParams()).a;
                if (ys4Var != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    ys4Var.g(this, childAt, motionEventObtain);
                }
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
        }
        v();
        this.f = true;
    }

    public final boolean s(ys4 ys4Var, View view, MotionEvent motionEvent, int i) {
        if (i == 0) {
            return ys4Var.g(this, view, motionEvent);
        }
        if (i == 1) {
            return ys4Var.r(this, view, motionEvent);
        }
        ore.a();
        return false;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        y();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.p = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.o;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.o = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.o.setState(getDrawableState());
                }
                Drawable drawable3 = this.o;
                WeakHashMap weakHashMap = i7j.a;
                tsl.c(getLayoutDirection(), drawable3);
                this.o.setVisible(getVisibility() == 0, false);
                this.o.setCallback(this);
            }
            WeakHashMap weakHashMap2 = i7j.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? getContext().getDrawable(i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.o;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.o.setVisible(z, false);
    }

    public final boolean t(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.c;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        o6 o6Var = v;
        if (o6Var != null) {
            Collections.sort(arrayList, o6Var);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zS = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            ys4 ys4Var = ((bt4) view.getLayoutParams()).a;
            if (zS && actionMasked != 0) {
                if (ys4Var != null) {
                    if (motionEventObtain == null) {
                        motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.setAction(3);
                    }
                    s(ys4Var, view, motionEventObtain, i);
                }
            } else if (!zS && ys4Var != null && (zS = s(ys4Var, view, motionEvent, i))) {
                this.i = view;
                if (actionMasked != 3 && actionMasked != 1) {
                    for (int i4 = 0; i4 < i3; i4++) {
                        View view2 = (View) arrayList.get(i4);
                        ys4 ys4Var2 = ((bt4) view2.getLayoutParams()).a;
                        if (ys4Var2 != null) {
                            if (motionEventObtain == null) {
                                motionEventObtain = MotionEvent.obtain(motionEvent);
                                motionEventObtain.setAction(3);
                            }
                            s(ys4Var2, view2, motionEventObtain, i);
                        }
                    }
                }
            }
        }
        arrayList.clear();
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        return zS;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0084  */
    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:38:0x0093
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void u() {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.et4.u():void");
    }

    public final void v() {
        View view = this.i;
        if (view != null) {
            ys4 ys4Var = ((bt4) view.getLayoutParams()).a;
            if (ys4Var != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                ys4Var.r(this, this.i, motionEventObtain);
                motionEventObtain.recycle();
            }
            this.i = null;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((bt4) getChildAt(i).getLayoutParams()).getClass();
        }
        this.f = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.o;
    }

    public final void y() {
        WeakHashMap weakHashMap = i7j.a;
        if (!getFitsSystemWindows()) {
            y6j.l(this, null);
            return;
        }
        if (this.q == null) {
            this.q = new zo7(11, this);
        }
        y6j.l(this, this.q);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new bt4(getContext(), attributeSet);
    }
}
