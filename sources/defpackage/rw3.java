package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.WeakHashMap;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class rw3 extends FrameLayout {
    public ixj A;
    public int B;
    public boolean C;
    public int D;
    public boolean E;
    public boolean a;
    public final int b;
    public ViewGroup c;
    public View d;
    public View e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final Rect j;
    public final nw3 k;
    public final s36 l;
    public boolean m;
    public boolean n;
    public Drawable o;
    public Drawable p;
    public int q;
    public boolean r;
    public ValueAnimator s;
    public long t;
    public final TimeInterpolator u;
    public final TimeInterpolator v;
    public int w;
    public pw3 x;
    public int y;
    public int z;

    public rw3(Context context) {
        int i;
        ColorStateList colorStateListR;
        ColorStateList colorStateListR2;
        super(p90.T(context, null, R.attr.collapsingToolbarLayoutStyle, R.style.Widget_Design_CollapsingToolbar), null, R.attr.collapsingToolbarLayoutStyle);
        this.a = true;
        this.j = new Rect();
        this.w = -1;
        this.B = 0;
        this.D = 0;
        Context context2 = getContext();
        nw3 nw3Var = new nw3(this);
        this.k = nw3Var;
        nw3Var.W = lk.e;
        nw3Var.g(false);
        nw3Var.J = false;
        this.l = new s36(context2);
        ch3.d(context2, null, R.attr.collapsingToolbarLayoutStyle, R.style.Widget_Design_CollapsingToolbar);
        int[] iArr = k3e.j;
        ch3.f(context2, null, iArr, R.attr.collapsingToolbarLayoutStyle, R.style.Widget_Design_CollapsingToolbar, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, iArr, R.attr.collapsingToolbarLayoutStyle, R.style.Widget_Design_CollapsingToolbar);
        int i2 = typedArrayObtainStyledAttributes.getInt(4, 8388691);
        if (nw3Var.j != i2) {
            nw3Var.j = i2;
            nw3Var.g(false);
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(0, 8388627);
        if (nw3Var.k != i3) {
            nw3Var.k = i3;
            nw3Var.g(false);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.i = dimensionPixelSize;
        this.h = dimensionPixelSize;
        this.g = dimensionPixelSize;
        this.f = dimensionPixelSize;
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(9)) {
            this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
        }
        this.m = typedArrayObtainStyledAttributes.getBoolean(20, true);
        setTitle(typedArrayObtainStyledAttributes.getText(18));
        nw3Var.j(R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        nw3Var.h(R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (typedArrayObtainStyledAttributes.hasValue(10)) {
            nw3Var.j(typedArrayObtainStyledAttributes.getResourceId(10, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            nw3Var.h(typedArrayObtainStyledAttributes.getResourceId(1, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            int i4 = typedArrayObtainStyledAttributes.getInt(22, -1);
            setTitleEllipsize(i4 != 0 ? i4 != 1 ? i4 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START);
        }
        if (typedArrayObtainStyledAttributes.hasValue(11) && nw3Var.n != (colorStateListR2 = cqk.r(context2, typedArrayObtainStyledAttributes, 11))) {
            nw3Var.n = colorStateListR2;
            nw3Var.g(false);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2) && nw3Var.o != (colorStateListR = cqk.r(context2, typedArrayObtainStyledAttributes, 2))) {
            nw3Var.o = colorStateListR;
            nw3Var.g(false);
        }
        this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, -1);
        if (typedArrayObtainStyledAttributes.hasValue(14) && (i = typedArrayObtainStyledAttributes.getInt(14, 1)) != nw3Var.n0) {
            nw3Var.n0 = i;
            Bitmap bitmap = nw3Var.K;
            if (bitmap != null) {
                bitmap.recycle();
                nw3Var.K = null;
            }
            nw3Var.g(false);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            nw3Var.V = AnimationUtils.loadInterpolator(context2, typedArrayObtainStyledAttributes.getResourceId(21, 0));
            nw3Var.g(false);
        }
        this.t = typedArrayObtainStyledAttributes.getInt(15, 600);
        this.u = e9i.v0(context2, R.attr.motionEasingStandardInterpolator, lk.c);
        this.v = e9i.v0(context2, R.attr.motionEasingStandardInterpolator, lk.d);
        setContentScrim(typedArrayObtainStyledAttributes.getDrawable(3));
        setStatusBarScrim(typedArrayObtainStyledAttributes.getDrawable(17));
        setTitleCollapseMode(typedArrayObtainStyledAttributes.getInt(19, 0));
        this.b = typedArrayObtainStyledAttributes.getResourceId(23, -1);
        this.C = typedArrayObtainStyledAttributes.getBoolean(13, false);
        this.E = typedArrayObtainStyledAttributes.getBoolean(12, false);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
        ft0 ft0Var = new ft0(this);
        WeakHashMap weakHashMap = i7j.a;
        y6j.l(this, ft0Var);
    }

    public static o8j b(View view) {
        o8j o8jVar = (o8j) view.getTag(R.id.view_offset_helper);
        if (o8jVar != null) {
            return o8jVar;
        }
        o8j o8jVar2 = new o8j(view);
        view.setTag(R.id.view_offset_helper, o8jVar2);
        return o8jVar2;
    }

    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        Context context = getContext();
        TypedValue typedValueS0 = e9i.s0(context, R.attr.colorSurfaceContainer);
        ColorStateList colorStateListValueOf = null;
        if (typedValueS0 != null) {
            int i = typedValueS0.resourceId;
            if (i != 0) {
                colorStateListValueOf = np4.l(context, i);
            } else {
                int i2 = typedValueS0.data;
                if (i2 != 0) {
                    colorStateListValueOf = ColorStateList.valueOf(i2);
                }
            }
        }
        if (colorStateListValueOf != null) {
            return colorStateListValueOf.getDefaultColor();
        }
        float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
        s36 s36Var = this.l;
        return s36Var.a(s36Var.d, dimension);
    }

    public final void a() {
        View view;
        if (this.a) {
            ViewGroup viewGroup = null;
            this.c = null;
            this.d = null;
            int i = this.b;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.c = viewGroup2;
                if (viewGroup2 != null) {
                    ViewParent parent = viewGroup2.getParent();
                    while (true) {
                        if (parent == this) {
                            view = viewGroup2;
                            break;
                        } else {
                            if (parent == null) {
                                break;
                            }
                            if (parent instanceof View) {
                                view = (View) parent;
                            }
                            parent = parent.getParent();
                            view = view;
                        }
                    }
                    this.d = view;
                }
            }
            if (this.c == null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.c = viewGroup;
            }
            c();
            this.a = false;
        }
    }

    public final void c() {
        View view;
        if (!this.m && (view = this.e) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.e);
            }
        }
        if (!this.m || this.c == null) {
            return;
        }
        if (this.e == null) {
            this.e = new View(getContext());
        }
        if (this.e.getParent() == null) {
            this.c.addView(this.e, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ow3;
    }

    public final void d() {
        if (this.o == null && this.p == null) {
            return;
        }
        setScrimsShown(getHeight() + this.y < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        a();
        if (this.c == null && (drawable = this.o) != null && this.q > 0) {
            drawable.mutate().setAlpha(this.q);
            this.o.draw(canvas);
        }
        if (this.m && this.n) {
            ViewGroup viewGroup = this.c;
            nw3 nw3Var = this.k;
            if (viewGroup == null || this.o == null || this.q <= 0 || this.z != 1 || nw3Var.b >= nw3Var.e) {
                nw3Var.c(canvas);
            } else {
                int iSave = canvas.save();
                canvas.clipRect(this.o.getBounds(), Region.Op.DIFFERENCE);
                nw3Var.c(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        if (this.p == null || this.q <= 0) {
            return;
        }
        ixj ixjVar = this.A;
        int iD = ixjVar != null ? ixjVar.d() : 0;
        if (iD > 0) {
            this.p.setBounds(0, -this.y, getWidth(), iD - this.y);
            this.p.mutate().setAlpha(this.q);
            this.p.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        View view2;
        Drawable drawable = this.o;
        if (drawable == null || this.q <= 0 || ((view2 = this.d) == null || view2 == this ? view != this.c : view != view2)) {
            z = false;
        } else {
            int width = getWidth();
            int height = getHeight();
            if (this.z == 1 && view != null && this.m) {
                height = view.getBottom();
            }
            drawable.setBounds(0, 0, width, height);
            this.o.mutate().setAlpha(this.q);
            this.o.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.p;
        boolean z = false;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.o;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        nw3 nw3Var = this.k;
        if (nw3Var != null) {
            nw3Var.R = drawableState;
            ColorStateList colorStateList2 = nw3Var.o;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = nw3Var.n) != null && colorStateList.isStateful())) {
                nw3Var.g(false);
                z = true;
            }
            state |= z;
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(boolean z, int i, int i2, int i3, int i4) {
        View view;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        if (!this.m || (view = this.e) == null) {
            return;
        }
        WeakHashMap weakHashMap = i7j.a;
        int titleMarginStart = 0;
        boolean z2 = view.isAttachedToWindow() && this.e.getVisibility() == 0;
        this.n = z2;
        if (z2 || z) {
            boolean z3 = getLayoutDirection() == 1;
            View view2 = this.d;
            if (view2 == null) {
                view2 = this.c;
            }
            int height = ((getHeight() - b(view2).b) - view2.getHeight()) - ((FrameLayout.LayoutParams) ((ow3) view2.getLayoutParams())).bottomMargin;
            View view3 = this.e;
            ThreadLocal threadLocal = zh5.a;
            int width = view3.getWidth();
            int height2 = view3.getHeight();
            Rect rect = this.j;
            rect.set(0, 0, width, height2);
            ThreadLocal threadLocal2 = zh5.a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            zh5.a(this, view3, matrix);
            ThreadLocal threadLocal3 = zh5.b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            ViewGroup viewGroup = this.c;
            if (viewGroup instanceof Toolbar) {
                Toolbar toolbar = (Toolbar) viewGroup;
                titleMarginStart = toolbar.getTitleMarginStart();
                titleMarginEnd = toolbar.getTitleMarginEnd();
                titleMarginTop = toolbar.getTitleMarginTop();
                titleMarginBottom = toolbar.getTitleMarginBottom();
            } else if (viewGroup instanceof android.widget.Toolbar) {
                android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                titleMarginStart = toolbar2.getTitleMarginStart();
                titleMarginEnd = toolbar2.getTitleMarginEnd();
                titleMarginTop = toolbar2.getTitleMarginTop();
                titleMarginBottom = toolbar2.getTitleMarginBottom();
            } else {
                titleMarginBottom = 0;
                titleMarginEnd = 0;
                titleMarginTop = 0;
            }
            int i5 = rect.left + (z3 ? titleMarginEnd : titleMarginStart);
            int i6 = rect.top + height + titleMarginTop;
            int i7 = rect.right;
            if (!z3) {
                titleMarginStart = titleMarginEnd;
            }
            int i8 = i7 - titleMarginStart;
            int i9 = (rect.bottom + height) - titleMarginBottom;
            nw3 nw3Var = this.k;
            Rect rect2 = nw3Var.h;
            if (rect2.left != i5 || rect2.top != i6 || rect2.right != i8 || rect2.bottom != i9) {
                rect2.set(i5, i6, i8, i9);
                nw3Var.S = true;
            }
            int i10 = z3 ? this.h : this.f;
            int i11 = rect.top + this.g;
            int i12 = (i3 - i) - (z3 ? this.f : this.h);
            int i13 = (i4 - i2) - this.i;
            Rect rect3 = nw3Var.g;
            if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                rect3.set(i10, i11, i12, i13);
                nw3Var.S = true;
            }
            nw3Var.g(z);
        }
    }

    public final void f() {
        CharSequence title;
        if (this.c != null && this.m && TextUtils.isEmpty(this.k.G)) {
            ViewGroup viewGroup = this.c;
            if (viewGroup instanceof Toolbar) {
                title = ((Toolbar) viewGroup).getTitle();
            } else {
                title = viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null;
            }
            setTitle(title);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ow3(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ow3 ow3Var = new ow3(context, attributeSet);
        ow3Var.a = 0;
        ow3Var.b = 0.5f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k3e.k);
        ow3Var.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        ow3Var.b = typedArrayObtainStyledAttributes.getFloat(1, 0.5f);
        typedArrayObtainStyledAttributes.recycle();
        return ow3Var;
    }

    public int getCollapsedTitleGravity() {
        return this.k.k;
    }

    public float getCollapsedTitleTextSize() {
        return this.k.m;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.k.w;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public Drawable getContentScrim() {
        return this.o;
    }

    public int getExpandedTitleGravity() {
        return this.k.j;
    }

    public int getExpandedTitleMarginBottom() {
        return this.i;
    }

    public int getExpandedTitleMarginEnd() {
        return this.h;
    }

    public int getExpandedTitleMarginStart() {
        return this.f;
    }

    public int getExpandedTitleMarginTop() {
        return this.g;
    }

    public float getExpandedTitleTextSize() {
        return this.k.l;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.k.z;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getHyphenationFrequency() {
        return this.k.q0;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.k.i0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.k.i0.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.k.i0.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.k.n0;
    }

    public int getScrimAlpha() {
        return this.q;
    }

    public long getScrimAnimationDuration() {
        return this.t;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.w;
        if (i >= 0) {
            return i + this.B + this.D;
        }
        ixj ixjVar = this.A;
        int iD = ixjVar != null ? ixjVar.d() : 0;
        WeakHashMap weakHashMap = i7j.a;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + iD, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.p;
    }

    public CharSequence getTitle() {
        if (this.m) {
            return this.k.G;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.z;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.k.V;
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.k.F;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof rq) {
            rq rqVar = (rq) parent;
            int i = 0;
            if (this.z == 1) {
                rqVar.setLiftOnScroll(false);
            }
            WeakHashMap weakHashMap = i7j.a;
            setFitsSystemWindows(rqVar.getFitsSystemWindows());
            if (this.x == null) {
                this.x = new pw3(i, this);
            }
            rqVar.a(this.x);
            w6j.c(this);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.k.f(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ViewParent parent = getParent();
        pw3 pw3Var = this.x;
        if (pw3Var != null && (parent instanceof rq)) {
            ((rq) parent).f(pw3Var);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ixj ixjVar = this.A;
        if (ixjVar != null) {
            int iD = ixjVar.d();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                WeakHashMap weakHashMap = i7j.a;
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < iD) {
                    childAt.offsetTopAndBottom(iD);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            o8j o8jVarB = b(getChildAt(i6));
            View view = o8jVarB.a;
            o8jVarB.b = view.getTop();
            o8jVarB.c = view.getLeft();
        }
        e(false, i, i2, i3, i4);
        f();
        d();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            b(getChildAt(i7)).a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007f  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        rw3 rw3Var;
        int measuredHeight;
        int measuredHeight2;
        a();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        ixj ixjVar = this.A;
        int iD = ixjVar != null ? ixjVar.d() : 0;
        if ((mode == 0 || this.C) && iD > 0) {
            this.B = iD;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + iD, 1073741824));
        }
        if (this.E) {
            nw3 nw3Var = this.k;
            if (nw3Var.n0 > 1) {
                f();
                rw3Var = this;
                rw3Var.e(true, 0, 0, getMeasuredWidth(), getMeasuredHeight());
                int i3 = nw3Var.p;
                if (i3 > 1) {
                    TextPaint textPaint = nw3Var.U;
                    textPaint.setTextSize(nw3Var.l);
                    textPaint.setTypeface(nw3Var.z);
                    textPaint.setLetterSpacing(nw3Var.g0);
                    rw3Var.D = (i3 - 1) * Math.round(textPaint.descent() + (-textPaint.ascent()));
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(rw3Var.getMeasuredHeight() + rw3Var.D, 1073741824));
                }
            } else {
                rw3Var = this;
            }
        } else {
            rw3Var = this;
        }
        ViewGroup viewGroup = rw3Var.c;
        if (viewGroup != null) {
            View view = rw3Var.d;
            if (view == null || view == rw3Var) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    measuredHeight = viewGroup.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    measuredHeight = viewGroup.getMeasuredHeight();
                }
                rw3Var.setMinimumHeight(measuredHeight);
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                measuredHeight2 = view.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            } else {
                measuredHeight2 = view.getMeasuredHeight();
            }
            rw3Var.setMinimumHeight(measuredHeight2);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.o;
        if (drawable != null) {
            ViewGroup viewGroup = this.c;
            if (this.z == 1 && viewGroup != null && this.m) {
                i2 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        nw3 nw3Var = this.k;
        if (nw3Var.k != i) {
            nw3Var.k = i;
            nw3Var.g(false);
        }
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.k.h(i);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        nw3 nw3Var = this.k;
        if (nw3Var.o != colorStateList) {
            nw3Var.o = colorStateList;
            nw3Var.g(false);
        }
    }

    public void setCollapsedTitleTextSize(float f) {
        nw3 nw3Var = this.k;
        if (nw3Var.m != f) {
            nw3Var.m = f;
            nw3Var.g(false);
        }
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.k.i(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.o;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.o = drawableMutate;
            if (drawableMutate != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.c;
                if (this.z == 1 && viewGroup != null && this.m) {
                    height = viewGroup.getBottom();
                }
                drawableMutate.setBounds(0, 0, width, height);
                this.o.setCallback(this);
                this.o.setAlpha(this.q);
            }
            WeakHashMap weakHashMap = i7j.a;
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(getContext().getDrawable(i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        nw3 nw3Var = this.k;
        if (nw3Var.j != i) {
            nw3Var.j = i;
            nw3Var.g(false);
        }
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.i = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.h = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.g = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.k.j(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        nw3 nw3Var = this.k;
        if (nw3Var.n != colorStateList) {
            nw3Var.n = colorStateList;
            nw3Var.g(false);
        }
    }

    public void setExpandedTitleTextSize(float f) {
        nw3 nw3Var = this.k;
        if (nw3Var.l != f) {
            nw3Var.l = f;
            nw3Var.g(false);
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.k.k(typeface);
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.E = z;
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.C = z;
    }

    public void setHyphenationFrequency(int i) {
        this.k.q0 = i;
    }

    public void setLineSpacingAdd(float f) {
        this.k.o0 = f;
    }

    public void setLineSpacingMultiplier(float f) {
        this.k.p0 = f;
    }

    public void setMaxLines(int i) {
        nw3 nw3Var = this.k;
        if (i != nw3Var.n0) {
            nw3Var.n0 = i;
            Bitmap bitmap = nw3Var.K;
            if (bitmap != null) {
                bitmap.recycle();
                nw3Var.K = null;
            }
            nw3Var.g(false);
        }
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.k.J = z;
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.q) {
            if (this.o != null && (viewGroup = this.c) != null) {
                WeakHashMap weakHashMap = i7j.a;
                viewGroup.postInvalidateOnAnimation();
            }
            this.q = i;
            WeakHashMap weakHashMap2 = i7j.a;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.t = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.w != i) {
            this.w = i;
            d();
        }
    }

    public void setScrimsShown(boolean z) {
        WeakHashMap weakHashMap = i7j.a;
        int i = 1;
        boolean z2 = isLaidOut() && !isInEditMode();
        if (this.r != z) {
            if (z2) {
                int i2 = z ? 255 : 0;
                a();
                ValueAnimator valueAnimator = this.s;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.s = valueAnimator2;
                    valueAnimator2.setInterpolator(i2 > this.q ? this.u : this.v);
                    this.s.addUpdateListener(new m11(i, this));
                } else if (valueAnimator.isRunning()) {
                    this.s.cancel();
                }
                this.s.setDuration(this.t);
                this.s.setIntValues(this.q, i2);
                this.s.start();
            } else {
                setScrimAlpha(z ? 255 : 0);
            }
            this.r = z;
        }
    }

    public void setStaticLayoutBuilderConfigurer(qw3 qw3Var) {
        nw3 nw3Var = this.k;
        if (qw3Var != null) {
            nw3Var.g(true);
        } else {
            nw3Var.getClass();
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.p = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.p.setState(getDrawableState());
                }
                Drawable drawable3 = this.p;
                WeakHashMap weakHashMap = i7j.a;
                tsl.c(getLayoutDirection(), drawable3);
                this.p.setVisible(getVisibility() == 0, false);
                this.p.setCallback(this);
                this.p.setAlpha(this.q);
            }
            WeakHashMap weakHashMap2 = i7j.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(getContext().getDrawable(i));
    }

    public void setTitle(CharSequence charSequence) {
        nw3 nw3Var = this.k;
        if (charSequence == null || !TextUtils.equals(nw3Var.G, charSequence)) {
            nw3Var.G = charSequence;
            nw3Var.H = null;
            Bitmap bitmap = nw3Var.K;
            if (bitmap != null) {
                bitmap.recycle();
                nw3Var.K = null;
            }
            nw3Var.g(false);
        }
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i) {
        this.z = i;
        boolean z = i == 1;
        this.k.c = z;
        ViewParent parent = getParent();
        if (parent instanceof rq) {
            rq rqVar = (rq) parent;
            if (this.z == 1) {
                rqVar.setLiftOnScroll(false);
            }
        }
        if (z && this.o == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        nw3 nw3Var = this.k;
        nw3Var.F = truncateAt;
        nw3Var.g(false);
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.m) {
            this.m = z;
            setContentDescription(getTitle());
            c();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        nw3 nw3Var = this.k;
        nw3Var.V = timeInterpolator;
        nw3Var.g(false);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.p;
        if (drawable != null && drawable.isVisible() != z) {
            this.p.setVisible(z, false);
        }
        Drawable drawable2 = this.o;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.o.setVisible(z, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.o || drawable == this.p;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new ow3(-1, -1);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ow3 ow3Var = new ow3(layoutParams);
        ow3Var.a = 0;
        ow3Var.b = 0.5f;
        return ow3Var;
    }
}
