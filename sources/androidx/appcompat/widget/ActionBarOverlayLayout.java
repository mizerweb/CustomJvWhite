package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import defpackage.a65;
import defpackage.a8;
import defpackage.b8;
import defpackage.bs0;
import defpackage.c8;
import defpackage.exj;
import defpackage.fcb;
import defpackage.gcb;
import defpackage.gg1;
import defpackage.gvh;
import defpackage.i7j;
import defpackage.ixj;
import defpackage.j8;
import defpackage.lwj;
import defpackage.m8;
import defpackage.mi8;
import defpackage.np0;
import defpackage.oca;
import defpackage.ore;
import defpackage.twj;
import defpackage.uwj;
import defpackage.vwj;
import defpackage.w6j;
import defpackage.wk8;
import defpackage.wwj;
import defpackage.xwj;
import defpackage.y6j;
import defpackage.y7;
import defpackage.yba;
import defpackage.z7;
import defpackage.zuh;
import java.util.WeakHashMap;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public class ActionBarOverlayLayout extends ViewGroup implements fcb, gcb {
    public static final int[] C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final ixj D;
    public static final Rect E;
    public final bs0 A;
    public final c8 B;
    public int a;
    public int b;
    public ContentFrameLayout c;
    public ActionBarContainer d;
    public a65 e;
    public Drawable f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public final Rect m;
    public final Rect n;
    public final Rect o;
    public final Rect p;
    public ixj q;
    public ixj r;
    public ixj s;
    public ixj t;
    public a8 u;
    public OverScroller v;
    public ViewPropertyAnimator w;
    public final y7 x;
    public final z7 y;
    public final z7 z;

    static {
        xwj uwjVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            uwjVar = new wwj();
        } else if (i >= 30) {
            uwjVar = new vwj();
        } else {
            uwjVar = i >= 29 ? new uwj() : new twj();
        }
        uwjVar.g(mi8.b(0, 1, 0, 1));
        D = uwjVar.b();
        E = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.m = new Rect();
        this.n = new Rect();
        this.o = new Rect();
        this.p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        ixj ixjVar = ixj.b;
        this.q = ixjVar;
        this.r = ixjVar;
        this.s = ixjVar;
        this.t = ixjVar;
        this.x = new y7(0, this);
        this.y = new z7(this, 0);
        this.z = new z7(this, 1);
        i(context);
        this.A = new bs0(1);
        c8 c8Var = new c8(context, 0);
        c8Var.setWillNotDraw(true);
        this.B = c8Var;
        addView(c8Var);
    }

    public static boolean a(View view, Rect rect, boolean z) {
        boolean z2;
        b8 b8Var = (b8) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) b8Var).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) b8Var).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) b8Var).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) b8Var).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) b8Var).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) b8Var).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) b8Var).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) b8Var).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    public final boolean b() {
        ActionMenuView actionMenuView;
        p();
        Toolbar toolbar = ((gvh) this.e).a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.s;
    }

    public final void c() {
        m8 m8Var;
        p();
        ActionMenuView actionMenuView = ((gvh) this.e).a.a;
        if (actionMenuView == null || (m8Var = actionMenuView.t) == null) {
            return;
        }
        m8Var.j();
        j8 j8Var = m8Var.t;
        if (j8Var == null || !j8Var.b()) {
            return;
        }
        j8Var.i.dismiss();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b8;
    }

    public final void d() {
        removeCallbacks(this.y);
        removeCallbacks(this.z);
        ViewPropertyAnimator viewPropertyAnimator = this.w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f != null) {
            if (this.d.getVisibility() == 0) {
                translationY = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f.setBounds(0, translationY, getWidth(), this.f.getIntrinsicHeight() + translationY);
            this.f.draw(canvas);
        }
    }

    @Override // defpackage.fcb
    public final void e(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.fcb
    public final void f(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // defpackage.fcb
    public final void g(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b8(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b8(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        bs0 bs0Var = this.A;
        return bs0Var.c | bs0Var.b;
    }

    public CharSequence getTitle() {
        p();
        return ((gvh) this.e).a.getTitle();
    }

    public final boolean h() {
        m8 m8Var;
        p();
        ActionMenuView actionMenuView = ((gvh) this.e).a.a;
        return (actionMenuView == null || (m8Var = actionMenuView.t) == null || !m8Var.j()) ? false : true;
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(C);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.v = new OverScroller(context);
    }

    public final void j(int i) {
        p();
        if (i == 2) {
            ((gvh) this.e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((gvh) this.e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final boolean k() {
        m8 m8Var;
        p();
        ActionMenuView actionMenuView = ((gvh) this.e).a.a;
        if (actionMenuView == null || (m8Var = actionMenuView.t) == null) {
            return false;
        }
        return m8Var.u != null || m8Var.k();
    }

    public final boolean l() {
        m8 m8Var;
        p();
        ActionMenuView actionMenuView = ((gvh) this.e).a.a;
        return (actionMenuView == null || (m8Var = actionMenuView.t) == null || !m8Var.k()) ? false : true;
    }

    @Override // defpackage.gcb
    public final void m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        n(view, i, i2, i3, i4, i5);
    }

    @Override // defpackage.fcb
    public final void n(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.fcb
    public final boolean o(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        p();
        ixj ixjVarG = ixj.g(windowInsets, this);
        boolean zA = a(this.d, new Rect(ixjVarG.b(), ixjVarG.d(), ixjVarG.c(), ixjVarG.a()), false);
        WeakHashMap weakHashMap = i7j.a;
        Rect rect = this.m;
        y6j.b(this, ixjVarG, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        exj exjVar = ixjVarG.a;
        ixj ixjVarL = exjVar.l(i, i2, i3, i4);
        this.q = ixjVarL;
        boolean z = true;
        if (!this.r.equals(ixjVarL)) {
            this.r = this.q;
            zA = true;
        }
        Rect rect2 = this.n;
        if (rect2.equals(rect)) {
            z = zA;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return exjVar.a().a.c().a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = i7j.a;
        w6j.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                b8 b8Var = (b8) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) b8Var).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) b8Var).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00df  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e9  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        ixj ixjVar;
        int i3;
        xwj twjVar;
        p();
        measureChildWithMargins(this.d, i, 0, i2, 0);
        b8 b8Var = (b8) this.d.getLayoutParams();
        int iMax = Math.max(0, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) b8Var).leftMargin + ((ViewGroup.MarginLayoutParams) b8Var).rightMargin);
        int iMax2 = Math.max(0, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) b8Var).topMargin + ((ViewGroup.MarginLayoutParams) b8Var).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        WeakHashMap weakHashMap = i7j.a;
        boolean z = (getWindowSystemUiVisibility() & np0.n) != 0;
        if (z) {
            measuredHeight = this.a;
            if (this.h && this.d.getTabContainer() != null) {
                measuredHeight += this.a;
            }
        } else {
            measuredHeight = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        Rect rect = this.m;
        Rect rect2 = this.o;
        rect2.set(rect);
        this.s = this.q;
        if (this.g || z) {
            mi8 mi8VarB = mi8.b(this.s.b(), this.s.d() + measuredHeight, this.s.c(), this.s.a());
            ixjVar = this.s;
            i3 = Build.VERSION.SDK_INT;
            if (i3 >= 34) {
                twjVar = new wwj(ixjVar);
            } else if (i3 >= 30) {
                twjVar = new vwj(ixjVar);
            } else if (i3 >= 29) {
                twjVar = new uwj(ixjVar);
            } else {
                twjVar = new twj(ixjVar);
            }
            twjVar.g(mi8VarB);
            this.s = twjVar.b();
        } else {
            c8 c8Var = this.B;
            ixj ixjVar2 = D;
            Rect rect3 = this.p;
            y6j.b(c8Var, ixjVar2, rect3);
            if (rect3.equals(E)) {
                mi8 mi8VarB2 = mi8.b(this.s.b(), this.s.d() + measuredHeight, this.s.c(), this.s.a());
                ixjVar = this.s;
                i3 = Build.VERSION.SDK_INT;
                if (i3 >= 34) {
                    twjVar = new wwj(ixjVar);
                } else if (i3 >= 30) {
                    twjVar = new vwj(ixjVar);
                } else if (i3 >= 29) {
                    twjVar = new uwj(ixjVar);
                } else {
                    twjVar = new twj(ixjVar);
                }
                twjVar.g(mi8VarB2);
                this.s = twjVar.b();
            } else {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.s = this.s.a.l(0, measuredHeight, 0, 0);
            }
        }
        a(this.c, rect2, true);
        if (!this.t.equals(this.s)) {
            ixj ixjVar3 = this.s;
            this.t = ixjVar3;
            i7j.b(this.c, ixjVar3);
        }
        measureChildWithMargins(this.c, i, 0, i2, 0);
        b8 b8Var2 = (b8) this.c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) b8Var2).leftMargin + ((ViewGroup.MarginLayoutParams) b8Var2).rightMargin);
        int iMax4 = Math.max(iMax2, this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) b8Var2).topMargin + ((ViewGroup.MarginLayoutParams) b8Var2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.i || !z) {
            return false;
        }
        this.v.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.v.getFinalY() > this.d.getHeight()) {
            d();
            this.z.run();
        } else {
            d();
            this.y.run();
        }
        this.j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.k + i2;
        this.k = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        lwj lwjVar;
        gg1 gg1Var;
        this.A.b = i;
        this.k = getActionBarHideOffset();
        d();
        a8 a8Var = this.u;
        if (a8Var == null || (gg1Var = (lwjVar = (lwj) a8Var).s) == null) {
            return;
        }
        gg1Var.a();
        lwjVar.s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.d.getVisibility() != 0) {
            return false;
        }
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.i || this.j) {
            return;
        }
        if (this.k <= this.d.getHeight()) {
            d();
            postDelayed(this.y, 600L);
        } else {
            d();
            postDelayed(this.z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        p();
        int i2 = this.l ^ i;
        this.l = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & np0.n) != 0;
        a8 a8Var = this.u;
        if (a8Var != null) {
            lwj lwjVar = (lwj) a8Var;
            lwjVar.o = !z2;
            if (z || !z2) {
                if (lwjVar.p) {
                    lwjVar.p = false;
                    lwjVar.n(true);
                }
            } else if (!lwjVar.p) {
                lwjVar.p = true;
                lwjVar.n(true);
            }
        }
        if ((i2 & np0.n) == 0 || this.u == null) {
            return;
        }
        WeakHashMap weakHashMap = i7j.a;
        w6j.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        a8 a8Var = this.u;
        if (a8Var != null) {
            ((lwj) a8Var).n = i;
        }
    }

    public final void p() {
        a65 wrapper;
        if (this.c == null) {
            this.c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof a65) {
                wrapper = (a65) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    ore.k("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.e = wrapper;
        }
    }

    public final void q(Menu menu, oca ocaVar) {
        p();
        gvh gvhVar = (gvh) this.e;
        Toolbar toolbar = gvhVar.a;
        if (gvhVar.m == null) {
            gvhVar.m = new m8(toolbar.getContext());
        }
        m8 m8Var = gvhVar.m;
        m8Var.e = ocaVar;
        yba ybaVar = (yba) menu;
        if (ybaVar == null && toolbar.a == null) {
            return;
        }
        toolbar.f();
        yba ybaVar2 = toolbar.a.p;
        if (ybaVar2 == ybaVar) {
            return;
        }
        if (ybaVar2 != null) {
            ybaVar2.s(toolbar.K);
            ybaVar2.s(toolbar.n1);
        }
        if (toolbar.n1 == null) {
            toolbar.n1 = new zuh(toolbar);
        }
        m8Var.q = true;
        Context context = toolbar.j;
        if (ybaVar != null) {
            ybaVar.c(m8Var, context);
            ybaVar.c(toolbar.n1, toolbar.j);
        } else {
            m8Var.i(context, null);
            toolbar.n1.i(toolbar.j, null);
            m8Var.e();
            toolbar.n1.e();
        }
        toolbar.a.setPopupTheme(toolbar.k);
        toolbar.a.setPresenter(m8Var);
        toolbar.K = m8Var;
        toolbar.u();
    }

    public final void r() {
        p();
        ((gvh) this.e).l = true;
    }

    public final boolean s() {
        m8 m8Var;
        p();
        ActionMenuView actionMenuView = ((gvh) this.e).a.a;
        return (actionMenuView == null || (m8Var = actionMenuView.t) == null || !m8Var.l()) ? false : true;
    }

    public void setActionBarHideOffset(int i) {
        d();
        this.d.setTranslationY(-Math.max(0, Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(a8 a8Var) {
        this.u = a8Var;
        if (getWindowToken() != null) {
            ((lwj) this.u).n = this.b;
            int i = this.l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = i7j.a;
                w6j.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.h = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.i) {
            this.i = z;
            if (z) {
                return;
            }
            d();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        p();
        gvh gvhVar = (gvh) this.e;
        gvhVar.d = i != 0 ? wk8.o(gvhVar.a.getContext(), i) : null;
        gvhVar.c();
    }

    public void setLogo(int i) {
        p();
        gvh gvhVar = (gvh) this.e;
        gvhVar.e = i != 0 ? wk8.o(gvhVar.a.getContext(), i) : null;
        gvhVar.c();
    }

    public void setOverlayMode(boolean z) {
        this.g = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        p();
        ((gvh) this.e).k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        p();
        gvh gvhVar = (gvh) this.e;
        if (gvhVar.g) {
            return;
        }
        Toolbar toolbar = gvhVar.a;
        gvhVar.h = charSequence;
        if ((gvhVar.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (gvhVar.g) {
                i7j.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b8(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        p();
        gvh gvhVar = (gvh) this.e;
        gvhVar.d = drawable;
        gvhVar.c();
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }
}
