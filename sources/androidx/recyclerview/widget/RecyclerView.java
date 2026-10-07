package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import defpackage.a29;
import defpackage.afe;
import defpackage.b7j;
import defpackage.bs0;
import defpackage.c;
import defpackage.cfe;
import defpackage.dcb;
import defpackage.dfe;
import defpackage.ecb;
import defpackage.efe;
import defpackage.fbc;
import defpackage.h6g;
import defpackage.hfe;
import defpackage.i3e;
import defpackage.i4m;
import defpackage.i7j;
import defpackage.ife;
import defpackage.ij7;
import defpackage.jfe;
import defpackage.kfe;
import defpackage.krk;
import defpackage.la;
import defpackage.lee;
import defpackage.lfe;
import defpackage.ma;
import defpackage.mee;
import defpackage.mwh;
import defpackage.nee;
import defpackage.nfe;
import defpackage.nk5;
import defpackage.nl6;
import defpackage.np0;
import defpackage.ore;
import defpackage.p3c;
import defpackage.pbd;
import defpackage.pvk;
import defpackage.qee;
import defpackage.qr7;
import defpackage.qt4;
import defpackage.rb5;
import defpackage.ree;
import defpackage.rx8;
import defpackage.s7j;
import defpackage.see;
import defpackage.t3a;
import defpackage.tee;
import defpackage.v56;
import defpackage.v66;
import defpackage.vee;
import defpackage.vi9;
import defpackage.vyh;
import defpackage.w4;
import defpackage.wee;
import defpackage.xee;
import defpackage.xp3;
import defpackage.y6j;
import defpackage.yee;
import defpackage.zee;
import defpackage.zo5;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements dcb {
    public static boolean Z1;
    public static boolean a2;
    public static final int[] b2 = {R.attr.nestedScrollingEnabled};
    public static final float c2 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean d2 = true;
    public static final boolean e2 = true;
    public static final boolean f2 = true;
    public static final Class[] g2;
    public static final mee h2;
    public static final ife i2;
    public boolean A;
    public final float A1;
    public final AccessibilityManager B;
    public final float B1;
    public ArrayList C;
    public boolean C1;
    public boolean D;
    public final kfe D1;
    public boolean E;
    public ij7 E1;
    public int F;
    public final nk5 F1;
    public int G;
    public final hfe G1;
    public ree H;
    public afe H1;
    public EdgeEffect I;
    public ArrayList I1;
    public EdgeEffect J;
    public boolean J1;
    public EdgeEffect K;
    public boolean K1;
    public final w4 L1;
    public boolean M1;
    public nfe N1;
    public final int[] O1;
    public ecb P1;
    public final int[] Q1;
    public final int[] R1;
    public final int[] S1;
    public final ArrayList T1;
    public final lee U1;
    public boolean V1;
    public int W1;
    public int X1;
    public final t3a Y1;
    public final float a;
    public final v66 b;
    public final cfe c;
    public efe d;
    public final ma e;
    public final vyh f;
    public final fbc g;
    public boolean h;
    public final lee i;
    public final Rect j;
    public final Rect k;
    public final RectF l;
    public nee m;
    public vee n;
    public EdgeEffect n1;
    public final ArrayList o;
    public see o1;
    public final ArrayList p;
    public int p1;
    public final ArrayList q;
    public int q1;
    public zee r;
    public VelocityTracker r1;
    public boolean s;
    public int s1;
    public boolean t;
    public int t1;
    public boolean u;
    public int u1;
    public int v;
    public int v1;
    public boolean w;
    public int w1;
    public boolean x;
    public yee x1;
    public boolean y;
    public final int y1;
    public int z;
    public final int z1;

    static {
        Class cls = Integer.TYPE;
        g2 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        h2 = new mee();
        i2 = new ife();
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArray;
        int i3;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, i);
        this.b = new v66(3, this);
        this.c = new cfe(this);
        this.g = new fbc(23);
        this.i = new lee(this, 0);
        this.j = new Rect();
        this.k = new Rect();
        this.l = new RectF();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.v = 0;
        this.D = false;
        this.E = false;
        this.F = 0;
        this.G = 0;
        this.H = i2;
        this.o1 = new rb5();
        this.p1 = 0;
        this.q1 = -1;
        this.A1 = Float.MIN_VALUE;
        this.B1 = Float.MIN_VALUE;
        this.C1 = true;
        this.D1 = new kfe(this);
        this.F1 = f2 ? new nk5() : null;
        hfe hfeVar = new hfe();
        hfeVar.a = -1;
        hfeVar.c = 0;
        hfeVar.d = 0;
        hfeVar.e = 1;
        hfeVar.f = 0;
        hfeVar.g = false;
        hfeVar.h = false;
        hfeVar.i = false;
        hfeVar.j = false;
        hfeVar.k = false;
        hfeVar.l = false;
        this.G1 = hfeVar;
        this.J1 = false;
        this.K1 = false;
        w4 w4Var = new w4(this);
        this.L1 = w4Var;
        this.M1 = false;
        this.O1 = new int[2];
        this.Q1 = new int[2];
        this.R1 = new int[2];
        this.S1 = new int[2];
        this.T1 = new ArrayList();
        this.U1 = new lee(this, 1);
        this.W1 = 0;
        this.X1 = 0;
        this.Y1 = new t3a(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.w1 = viewConfiguration.getScaledTouchSlop();
        this.A1 = viewConfiguration.getScaledHorizontalScrollFactor();
        this.B1 = viewConfiguration.getScaledVerticalScrollFactor();
        this.y1 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.z1 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.o1.a = w4Var;
        this.e = new ma(new v56(16, this));
        this.f = new vyh(new p3c(17, this));
        WeakHashMap weakHashMap = i7j.a;
        if (b7j.a(this) == 0) {
            b7j.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.B = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new nfe(this));
        int[] iArr = i3e.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        i7j.k(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.h = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                ore.p("Trying to set fast scroller without both required drawables.".concat(D()));
                throw null;
            }
            Resources resources = getContext().getResources();
            typedArray = typedArrayObtainStyledAttributes;
            i3 = 4;
            new nl6(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(ru.oneme.app.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(ru.oneme.app.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(ru.oneme.app.R.dimen.fastscroll_margin));
        } else {
            typedArray = typedArrayObtainStyledAttributes;
            i3 = 4;
        }
        typedArray.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(vee.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(g2);
                        objArr = new Object[i3];
                        objArr[0] = context;
                        objArr[r11] = attributeSet;
                        objArr[2] = Integer.valueOf(i);
                        objArr[3] = 0;
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                            objArr = null;
                        } catch (NoSuchMethodException e3) {
                            e3.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e3);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((vee) constructor.newInstance(objArr));
                } catch (ClassCastException e4) {
                    qr7.h(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", str, e4);
                    throw null;
                } catch (ClassNotFoundException e5) {
                    qr7.h(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", str, e5);
                    throw null;
                } catch (IllegalAccessException e6) {
                    qr7.h(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", str, e6);
                    throw null;
                } catch (InstantiationException e7) {
                    qr7.h(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e7);
                    throw null;
                } catch (InvocationTargetException e8) {
                    qr7.h(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e8);
                    throw null;
                }
            }
        }
        int[] iArr2 = b2;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        i7j.k(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i, 0);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
        setTag(ru.oneme.app.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public static RecyclerView J(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewJ = J(viewGroup.getChildAt(i));
            if (recyclerViewJ != null) {
                return recyclerViewJ;
            }
        }
        return null;
    }

    public static int P(View view) {
        lfe lfeVarT = T(view);
        if (lfeVarT != null) {
            return lfeVarT.k();
        }
        return -1;
    }

    public static int R(View view) {
        lfe lfeVarT = T(view);
        if (lfeVarT != null) {
            return lfeVarT.m();
        }
        return -1;
    }

    public static lfe T(View view) {
        if (view == null) {
            return null;
        }
        return ((wee) view.getLayoutParams()).a;
    }

    public static void U(Rect rect, View view) {
        wee weeVar = (wee) view.getLayoutParams();
        Rect rect2 = weeVar.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) weeVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) weeVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) weeVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) weeVar).bottomMargin);
    }

    private ecb getScrollingChildHelper() {
        if (this.P1 == null) {
            this.P1 = new ecb(this);
        }
        return this.P1;
    }

    public static void m(lfe lfeVar) {
        WeakReference weakReference = lfeVar.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == lfeVar.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            lfeVar.b = null;
        }
    }

    public static int p(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i3) {
        if (i > 0 && edgeEffect != null && rx8.E(edgeEffect) != 0.0f) {
            int iRound = Math.round(rx8.V(edgeEffect, ((-i) * 4.0f) / i3, 0.5f) * ((-i3) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || rx8.E(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i3;
        int iRound2 = Math.round(rx8.V(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        Z1 = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        a2 = z;
    }

    public final void A() {
        if (this.I != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.H.a(this, 0);
        this.I = edgeEffectA;
        if (this.h) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void A0(int i) {
        if (this.x) {
            return;
        }
        vee veeVar = this.n;
        if (veeVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            veeVar.J0(this, i);
        }
    }

    public final void B() {
        if (this.K != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.H.a(this, 2);
        this.K = edgeEffectA;
        if (this.h) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void B0() {
        int i = this.v + 1;
        this.v = i;
        if (i != 1 || this.x) {
            return;
        }
        this.w = false;
    }

    public final void C() {
        if (this.J != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.H.a(this, 1);
        this.J = edgeEffectA;
        if (this.h) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void C0(boolean z) {
        if (this.v < 1) {
            if (Z1) {
                ore.k("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.".concat(D()));
                return;
            }
            this.v = 1;
        }
        if (!z && !this.x) {
            this.w = false;
        }
        if (this.v == 1) {
            if (z && this.w && !this.x && this.n != null && this.m != null) {
                t();
            }
            if (!this.x) {
                this.w = false;
            }
        }
        this.v--;
    }

    public final String D() {
        return " " + super.toString() + ", adapter:" + this.m + ", layout:" + this.n + ", context:" + getContext();
    }

    public final void D0(int i) {
        getScrollingChildHelper().g(i);
    }

    public final void E(hfe hfeVar) {
        if (getScrollState() != 2) {
            hfeVar.getClass();
            return;
        }
        OverScroller overScroller = this.D1.c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        hfeVar.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final void E0() {
        a29 a29Var;
        setScrollState(0);
        kfe kfeVar = this.D1;
        kfeVar.g.removeCallbacks(kfeVar);
        kfeVar.c.abortAnimation();
        vee veeVar = this.n;
        if (veeVar == null || (a29Var = veeVar.e) == null) {
            return;
        }
        a29Var.s();
    }

    public final View F(float f, float f3) {
        vyh vyhVar = this.f;
        for (int iU = vyhVar.u() - 1; iU >= 0; iU--) {
            View viewT = vyhVar.t(iU);
            float translationX = viewT.getTranslationX();
            float translationY = viewT.getTranslationY();
            if (f >= viewT.getLeft() + translationX && f <= viewT.getRight() + translationX && f3 >= viewT.getTop() + translationY && f3 <= viewT.getBottom() + translationY) {
                return viewT;
            }
        }
        return null;
    }

    public final View G(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean H(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zee zeeVar = (zee) arrayList.get(i);
            if (zeeVar.c(this, motionEvent) && action != 3) {
                this.r = zeeVar;
                return true;
            }
        }
        return false;
    }

    public final void I(int[] iArr) {
        vyh vyhVar = this.f;
        int iU = vyhVar.u();
        if (iU == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < iU; i4++) {
            lfe lfeVarT = T(vyhVar.t(i4));
            if (!lfeVarT.z()) {
                int iM = lfeVarT.m();
                if (iM < i) {
                    i = iM;
                }
                if (iM > i3) {
                    i3 = iM;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i3;
    }

    public final lfe K(int i) {
        lfe lfeVar = null;
        if (this.D) {
            return null;
        }
        vyh vyhVar = this.f;
        int iZ = vyhVar.z();
        for (int i3 = 0; i3 < iZ; i3++) {
            lfe lfeVarT = T(vyhVar.y(i3));
            if (lfeVarT != null && !lfeVarT.s() && N(lfeVarT) == i) {
                if (!((ArrayList) vyhVar.e).contains(lfeVarT.a)) {
                    return lfeVarT;
                }
                lfeVar = lfeVarT;
            }
        }
        return lfeVar;
    }

    public final lfe L(long j) {
        nee neeVar = this.m;
        lfe lfeVar = null;
        if (neeVar != null && neeVar.b) {
            vyh vyhVar = this.f;
            int iZ = vyhVar.z();
            for (int i = 0; i < iZ; i++) {
                lfe lfeVarT = T(vyhVar.y(i));
                if (lfeVarT != null && !lfeVarT.s() && lfeVarT.e == j) {
                    if (!((ArrayList) vyhVar.e).contains(lfeVarT.a)) {
                        return lfeVarT;
                    }
                    lfeVar = lfeVarT;
                }
            }
        }
        return lfeVar;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3 */
    public final boolean M(int i, int i3) {
        int iMax;
        int i4;
        vee veeVar = this.n;
        if (veeVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (!this.x) {
            int e = veeVar.getE();
            boolean zF = this.n.f();
            int i5 = this.y1;
            if (e == 0 || Math.abs(i) < i5) {
                i = 0;
            }
            if (!zF || Math.abs(i3) < i5) {
                i3 = 0;
            }
            if (i != 0 || i3 != 0) {
                if (i == 0) {
                    iMax = 0;
                } else {
                    EdgeEffect edgeEffect = this.I;
                    if (edgeEffect == null || rx8.E(edgeEffect) == 0.0f) {
                        EdgeEffect edgeEffect2 = this.K;
                        if (edgeEffect2 == null || rx8.E(edgeEffect2) == 0.0f) {
                            iMax = 0;
                        } else if (y0(this.K, i, getWidth())) {
                            this.K.onAbsorb(i);
                            i = 0;
                        }
                    } else {
                        int i6 = -i;
                        if (y0(this.I, i6, getWidth())) {
                            this.I.onAbsorb(i6);
                            i = 0;
                        }
                    }
                    iMax = i;
                    i = 0;
                }
                if (i3 == 0) {
                    i4 = i3;
                    i3 = 0;
                } else {
                    EdgeEffect edgeEffect3 = this.J;
                    if (edgeEffect3 == null || rx8.E(edgeEffect3) == 0.0f) {
                        EdgeEffect edgeEffect4 = this.n1;
                        if (edgeEffect4 == null || rx8.E(edgeEffect4) == 0.0f) {
                            i4 = i3;
                            i3 = 0;
                        } else if (y0(this.n1, i3, getHeight())) {
                            this.n1.onAbsorb(i3);
                            i3 = 0;
                        }
                    } else {
                        int i7 = -i3;
                        if (y0(this.J, i7, getHeight())) {
                            this.J.onAbsorb(i7);
                            i3 = 0;
                        }
                    }
                    i4 = 0;
                }
                kfe kfeVar = this.D1;
                int i8 = this.z1;
                if (iMax != 0 || i3 != 0) {
                    int i9 = -i8;
                    iMax = Math.max(i9, Math.min(iMax, i8));
                    i3 = Math.max(i9, Math.min(i3, i8));
                    kfeVar.a(iMax, i3);
                }
                if (i != 0 || i4 != 0) {
                    float f = i;
                    float f3 = i4;
                    if (!dispatchNestedPreFling(f, f3)) {
                        boolean z = e != 0 || zF;
                        dispatchNestedFling(f, f3, z);
                        yee yeeVar = this.x1;
                        if (yeeVar == null || !yeeVar.a(i, i4)) {
                            if (z) {
                                if (zF) {
                                    e = (e == true ? 1 : 0) | 2;
                                }
                                getScrollingChildHelper().f(e, 1);
                                int i10 = -i8;
                                kfeVar.a(Math.max(i10, Math.min(i, i8)), Math.max(i10, Math.min(i4, i8)));
                                return true;
                            }
                        }
                        return true;
                    }
                } else if (iMax != 0 || i3 != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int N(lfe lfeVar) {
        if ((lfeVar.j & 524) == 0 && lfeVar.p()) {
            int i = lfeVar.c;
            ArrayList arrayList = (ArrayList) this.e.c;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                la laVar = (la) arrayList.get(i3);
                int i4 = laVar.a;
                if (i4 != 1) {
                    if (i4 == 2) {
                        int i5 = laVar.b;
                        if (i5 <= i) {
                            int i6 = laVar.d;
                            if (i5 + i6 <= i) {
                                i -= i6;
                            }
                        } else {
                            continue;
                        }
                    } else if (i4 == 8) {
                        int i7 = laVar.b;
                        if (i7 == i) {
                            i = laVar.d;
                        } else {
                            if (i7 < i) {
                                i--;
                            }
                            if (laVar.d <= i) {
                                i++;
                            }
                        }
                    }
                } else if (laVar.b <= i) {
                    i += laVar.d;
                }
            }
            return i;
        }
        return -1;
    }

    public final long O(lfe lfeVar) {
        return this.m.b ? lfeVar.e : lfeVar.c;
    }

    public final long Q(View view) {
        lfe lfeVarT;
        nee neeVar = this.m;
        if (neeVar == null || !neeVar.b || (lfeVarT = T(view)) == null) {
            return -1L;
        }
        return lfeVarT.e;
    }

    public final lfe S(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return T(view);
        }
        c.v("View ", view, " is not a direct child of ", this);
        return null;
    }

    public final Rect V(View view) {
        wee weeVar = (wee) view.getLayoutParams();
        boolean z = weeVar.c;
        Rect rect = weeVar.b;
        if (z) {
            hfe hfeVar = this.G1;
            if (!hfeVar.h || (!weeVar.a.v() && !weeVar.a.q())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.p;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Rect rect2 = this.j;
                    rect2.set(0, 0, 0, 0);
                    ((tee) arrayList.get(i)).f(rect2, view, this, hfeVar);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                weeVar.c = false;
                return rect;
            }
        }
        return rect;
    }

    public final boolean W() {
        return !this.u || this.D || this.e.s();
    }

    public void X() {
        if (this.p.size() == 0) {
            return;
        }
        vee veeVar = this.n;
        if (veeVar != null) {
            veeVar.d("Cannot invalidate item decorations during a scroll or layout");
        }
        a0();
        requestLayout();
    }

    public final boolean Y() {
        return this.F > 0;
    }

    public final void Z(int i) {
        if (this.n == null) {
            return;
        }
        setScrollState(2);
        this.n.z0(i);
        awakenScrollBars();
    }

    public final void a0() {
        vyh vyhVar = this.f;
        int iZ = vyhVar.z();
        for (int i = 0; i < iZ; i++) {
            ((wee) vyhVar.y(i).getLayoutParams()).c = true;
        }
        cfe cfeVar = this.c;
        int size = cfeVar.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            wee weeVar = (wee) ((lfe) cfeVar.c.get(i3)).a.getLayoutParams();
            if (weeVar != null) {
                weeVar.c = true;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i3) {
        vee veeVar = this.n;
        if (veeVar != null) {
            veeVar.getClass();
        }
        super.addFocusables(arrayList, i, i3);
    }

    public final void b0(int i) {
        int iU = this.f.u();
        for (int i3 = 0; i3 < iU; i3++) {
            this.f.t(i3).offsetTopAndBottom(i);
        }
    }

    public final void c0(int i, int i3, boolean z) {
        int i4 = i + i3;
        vyh vyhVar = this.f;
        int iZ = vyhVar.z();
        for (int i5 = 0; i5 < iZ; i5++) {
            lfe lfeVarT = T(vyhVar.y(i5));
            if (lfeVarT != null && !lfeVarT.z()) {
                int i6 = lfeVarT.c;
                hfe hfeVar = this.G1;
                if (i6 >= i4) {
                    if (a2) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i5 + " holder " + lfeVarT + " now at position " + (lfeVarT.c - i3));
                    }
                    lfeVarT.w(-i3, z);
                    hfeVar.g = true;
                } else if (i6 >= i) {
                    if (a2) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i5 + " holder " + lfeVarT + " now REMOVED");
                    }
                    lfeVarT.j(8);
                    lfeVarT.w(-i3, z);
                    lfeVarT.c = i - 1;
                    hfeVar.g = true;
                }
            }
        }
        cfe cfeVar = this.c;
        for (int size = cfeVar.c.size() - 1; size >= 0; size--) {
            lfe lfeVar = (lfe) cfeVar.c.get(size);
            if (lfeVar != null) {
                int i7 = lfeVar.c;
                if (i7 >= i4) {
                    if (a2) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + lfeVar + " now at position " + (lfeVar.c - i3));
                    }
                    lfeVar.w(-i3, z);
                } else if (i7 >= i) {
                    lfeVar.j(8);
                    cfeVar.g(size);
                }
            }
        }
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof wee) && this.n.g((wee) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        vee veeVar = this.n;
        if (veeVar != null && veeVar.getE()) {
            return this.n.k(this.G1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        vee veeVar = this.n;
        if (veeVar != null && veeVar.getE()) {
            return this.n.l(this.G1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        vee veeVar = this.n;
        if (veeVar != null && veeVar.getE()) {
            return this.n.m(this.G1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        vee veeVar = this.n;
        if (veeVar != null && veeVar.f()) {
            return this.n.n(this.G1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        vee veeVar = this.n;
        if (veeVar != null && veeVar.f()) {
            return this.n.o(this.G1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        vee veeVar = this.n;
        if (veeVar != null && veeVar.f()) {
            return this.n.p(this.G1);
        }
        return 0;
    }

    public final void d0() {
        this.F++;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f3, boolean z) {
        ViewParent viewParentD;
        ecb scrollingChildHelper = getScrollingChildHelper();
        if (!scrollingChildHelper.d || (viewParentD = scrollingChildHelper.d(0)) == null) {
            return false;
        }
        return i4m.a(viewParentD, scrollingChildHelper.c, f, f3, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f3) {
        return getScrollingChildHelper().a(f, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().b(i, i3, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().c(i, i3, i4, i5, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((tee) arrayList.get(i)).h(canvas, this);
        }
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.I;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.J;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.K;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.K;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.n1;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.h) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.n1;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.o1 == null || arrayList.size() <= 0 || !this.o1.g()) ? z : true) {
            WeakHashMap weakHashMap = i7j.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e0(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i3 = this.F - 1;
        this.F = i3;
        if (i3 < 1) {
            if (Z1 && i3 < 0) {
                ore.k("layout or scroll counter cannot go below zero.Some calls are not matching".concat(D()));
                return;
            }
            this.F = 0;
            if (z) {
                int i4 = this.z;
                this.z = 0;
                if (i4 != 0 && (accessibilityManager = this.B) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(np0.q);
                    krk.c(accessibilityEventObtain, i4);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.T1;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    lfe lfeVar = (lfe) arrayList.get(size);
                    if (lfeVar.a.getParent() == this && !lfeVar.z() && (i = lfeVar.q) != -1) {
                        View view = lfeVar.a;
                        WeakHashMap weakHashMap = i7j.a;
                        view.setImportantForAccessibility(i);
                        lfeVar.q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void f0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.q1) {
            int i = actionIndex == 0 ? 1 : 0;
            this.q1 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.u1 = x;
            this.s1 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.v1 = y;
            this.t1 = y;
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0158 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x015a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x015c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x015e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0162  */
    /* JADX WARN: Code duplicated, block: B:116:0x0166 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0169  */
    /* JADX WARN: Code duplicated, block: B:120:0x0173 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x0176 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x0179 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x017c  */
    /* JADX WARN: Code duplicated, block: B:127:0x017e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0180  */
    /* JADX WARN: Code duplicated, block: B:131:0x0184  */
    /* JADX WARN: Code duplicated, block: B:132:0x0186  */
    /* JADX WARN: Code duplicated, block: B:133:0x0188  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0110  */
    /* JADX WARN: Code duplicated, block: B:81:0x0112  */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0166, code lost:
    
        if (r16 > 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0173, code lost:
    
        if (r5 > 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0176, code lost:
    
        if (r16 < 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0179, code lost:
    
        if (r5 < 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0181, code lost:
    
        if ((r5 * r6) <= 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0189, code lost:
    
        if ((r5 * r6) >= 0) goto L136;
     */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r19, int r20) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g(lfe lfeVar) {
        View view = lfeVar.a;
        boolean z = view.getParent() == this;
        this.c.l(S(view));
        boolean zU = lfeVar.u();
        vyh vyhVar = this.f;
        if (zU) {
            vyhVar.d(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            vyhVar.b(view, -1, true);
            return;
        }
        int iIndexOfChild = ((RecyclerView) ((p3c) vyhVar.c).b).indexOfChild(view);
        if (iIndexOfChild < 0) {
            qr7.y(view, "view is not a child, cannot hide ");
        } else {
            ((xp3) vyhVar.d).i(iIndexOfChild);
            vyhVar.A(view);
        }
    }

    public void g0() {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        vee veeVar = this.n;
        if (veeVar != null) {
            return veeVar.s();
        }
        ore.k("RecyclerView has no LayoutManager".concat(D()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        vee veeVar = this.n;
        if (veeVar != null) {
            return veeVar.t(getContext(), attributeSet);
        }
        ore.k("RecyclerView has no LayoutManager".concat(D()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public nee getAdapter() {
        return this.m;
    }

    @Override // android.view.View
    public int getBaseline() {
        vee veeVar = this.n;
        if (veeVar == null) {
            return super.getBaseline();
        }
        veeVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i3) {
        return super.getChildDrawingOrder(i, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.h;
    }

    public nfe getCompatAccessibilityDelegate() {
        return this.N1;
    }

    public ree getEdgeEffectFactory() {
        return this.H;
    }

    public see getItemAnimator() {
        return this.o1;
    }

    public int getItemDecorationCount() {
        return this.p.size();
    }

    public vee getLayoutManager() {
        return this.n;
    }

    public int getMaxFlingVelocity() {
        return this.z1;
    }

    public int getMinFlingVelocity() {
        return this.y1;
    }

    public long getNanoTime() {
        if (f2) {
            return System.nanoTime();
        }
        return 0L;
    }

    public yee getOnFlingListener() {
        return this.x1;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.C1;
    }

    public a getRecycledViewPool() {
        return this.c.c();
    }

    public int getScrollState() {
        return this.p1;
    }

    public final void h(tee teeVar, int i) {
        vee veeVar = this.n;
        if (veeVar != null) {
            veeVar.d("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.p;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            arrayList.add(teeVar);
        } else {
            arrayList.add(i, teeVar);
        }
        a0();
        requestLayout();
    }

    public final void h0() {
        if (this.M1 || !this.s) {
            return;
        }
        WeakHashMap weakHashMap = i7j.a;
        postOnAnimation(this.U1);
        this.M1 = true;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().e(0);
    }

    public final void i(xee xeeVar) {
        if (this.C == null) {
            this.C = new ArrayList();
        }
        this.C.add(xeeVar);
    }

    public final void i0() {
        boolean z;
        boolean z2 = this.D;
        ma maVar = this.e;
        boolean z3 = false;
        if (z2) {
            maVar.A((ArrayList) maVar.c);
            maVar.A((ArrayList) maVar.d);
            maVar.a = 0;
            if (this.E) {
                this.n.f0();
            }
        }
        if (this.o1 != null && this.n.L0()) {
            maVar.z();
        } else {
            maVar.l();
        }
        boolean z4 = this.J1 || this.K1;
        boolean z5 = this.u && this.o1 != null && ((z = this.D) || z4 || this.n.f) && (!z || this.m.b);
        hfe hfeVar = this.G1;
        hfeVar.k = z5;
        if (z5 && z4 && !this.D && this.o1 != null && this.n.L0()) {
            z3 = true;
        }
        hfeVar.l = z3;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.s;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.x;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j(zee zeeVar) {
        this.q.add(zeeVar);
    }

    public final void j0(boolean z) {
        this.E = z | this.E;
        this.D = true;
        vyh vyhVar = this.f;
        int iZ = vyhVar.z();
        for (int i = 0; i < iZ; i++) {
            lfe lfeVarT = T(vyhVar.y(i));
            if (lfeVarT != null && !lfeVarT.z()) {
                lfeVarT.j(6);
            }
        }
        a0();
        cfe cfeVar = this.c;
        int size = cfeVar.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            lfe lfeVar = (lfe) cfeVar.c.get(i3);
            if (lfeVar != null) {
                lfeVar.j(6);
                lfeVar.j(1024);
            }
        }
        nee neeVar = cfeVar.h.m;
        if (neeVar == null || !neeVar.b) {
            cfeVar.f();
        }
    }

    public void k(afe afeVar) {
        if (this.I1 == null) {
            this.I1 = new ArrayList();
        }
        this.I1.add(afeVar);
    }

    public final void k0(lfe lfeVar, bs0 bs0Var) {
        lfeVar.j &= -8193;
        boolean z = this.G1.i;
        fbc fbcVar = this.g;
        if (z && lfeVar.v() && !lfeVar.s() && !lfeVar.z()) {
            ((vi9) fbcVar.c).f(O(lfeVar), lfeVar);
        }
        h6g h6gVar = (h6g) fbcVar.b;
        s7j s7jVarA = (s7j) h6gVar.get(lfeVar);
        if (s7jVarA == null) {
            s7jVarA = s7j.a();
            h6gVar.put(lfeVar, s7jVarA);
        }
        s7jVarA.b = bs0Var;
        s7jVarA.a |= 4;
    }

    public final void l(String str) {
        if (!Y()) {
            if (this.G > 0) {
                Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(D()));
            }
        } else if (str == null) {
            ore.k("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(D()));
        } else {
            ore.k(str);
        }
    }

    public final int l0(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.I;
        float f3 = 0.0f;
        if (edgeEffect == null || rx8.E(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.K;
            if (edgeEffect2 != null && rx8.E(edgeEffect2) != 0.0f) {
                boolean zCanScrollHorizontally = canScrollHorizontally(1);
                EdgeEffect edgeEffect3 = this.K;
                if (zCanScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float fV = rx8.V(edgeEffect3, width, height);
                    if (rx8.E(this.K) == 0.0f) {
                        this.K.onRelease();
                    }
                    f3 = fV;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollHorizontally2 = canScrollHorizontally(-1);
            EdgeEffect edgeEffect4 = this.I;
            if (zCanScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f4 = -rx8.V(edgeEffect4, -width, 1.0f - height);
                if (rx8.E(this.I) == 0.0f) {
                    this.I.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getWidth());
    }

    public final int m0(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.J;
        float f3 = 0.0f;
        if (edgeEffect == null || rx8.E(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.n1;
            if (edgeEffect2 != null && rx8.E(edgeEffect2) != 0.0f) {
                boolean zCanScrollVertically = canScrollVertically(1);
                EdgeEffect edgeEffect3 = this.n1;
                if (zCanScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float fV = rx8.V(edgeEffect3, height, 1.0f - width);
                    if (rx8.E(this.n1) == 0.0f) {
                        this.n1.onRelease();
                    }
                    f3 = fV;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollVertically2 = canScrollVertically(-1);
            EdgeEffect edgeEffect4 = this.J;
            if (zCanScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f4 = -rx8.V(edgeEffect4, -height, width);
                if (rx8.E(this.J) == 0.0f) {
                    this.J.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getHeight());
    }

    public final void n() {
        vyh vyhVar = this.f;
        int iZ = vyhVar.z();
        for (int i = 0; i < iZ; i++) {
            lfe lfeVarT = T(vyhVar.y(i));
            if (!lfeVarT.z()) {
                lfeVarT.d = -1;
                lfeVarT.g = -1;
            }
        }
        cfe cfeVar = this.c;
        int size = cfeVar.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            lfe lfeVar = (lfe) cfeVar.c.get(i3);
            lfeVar.d = -1;
            lfeVar.g = -1;
        }
        int size2 = cfeVar.a.size();
        for (int i4 = 0; i4 < size2; i4++) {
            lfe lfeVar2 = (lfe) cfeVar.a.get(i4);
            lfeVar2.d = -1;
            lfeVar2.g = -1;
        }
        ArrayList arrayList = cfeVar.b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i5 = 0; i5 < size3; i5++) {
                lfe lfeVar3 = (lfe) cfeVar.b.get(i5);
                lfeVar3.d = -1;
                lfeVar3.g = -1;
            }
        }
    }

    public final void n0() {
        see seeVar = this.o1;
        if (seeVar != null) {
            seeVar.e();
        }
        vee veeVar = this.n;
        if (veeVar != null) {
            veeVar.r0(this.c);
            this.n.s0(this.c);
        }
        cfe cfeVar = this.c;
        cfeVar.a.clear();
        cfeVar.f();
    }

    public final void o(int i, int i3) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.I.onRelease();
            zIsFinished = this.I.isFinished();
        }
        EdgeEffect edgeEffect2 = this.K;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.K.onRelease();
            zIsFinished |= this.K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.J.onRelease();
            zIsFinished |= this.J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.n1;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.n1.onRelease();
            zIsFinished |= this.n1.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = i7j.a;
            postInvalidateOnAnimation();
        }
    }

    public final void o0(tee teeVar) {
        vee veeVar = this.n;
        if (veeVar != null) {
            veeVar.d("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.p;
        arrayList.remove(teeVar);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        a0();
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.F = 0;
        this.s = true;
        this.u = this.u && !isLayoutRequested();
        this.c.e();
        vee veeVar = this.n;
        if (veeVar != null) {
            veeVar.g = true;
            veeVar.X(this);
        }
        this.M1 = false;
        if (f2) {
            ThreadLocal threadLocal = ij7.e;
            ij7 ij7Var = (ij7) threadLocal.get();
            this.E1 = ij7Var;
            if (ij7Var == null) {
                ij7 ij7Var2 = new ij7();
                ij7Var2.a = new ArrayList();
                ij7Var2.d = new ArrayList();
                this.E1 = ij7Var2;
                WeakHashMap weakHashMap = i7j.a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                ij7 ij7Var3 = this.E1;
                ij7Var3.c = (long) (1.0E9f / refreshRate);
                threadLocal.set(ij7Var3);
            }
            ArrayList arrayList = this.E1.a;
            if (Z1 && arrayList.contains(this)) {
                ore.k("RecyclerView already present in worker list!");
            } else {
                arrayList.add(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ij7 ij7Var;
        super.onDetachedFromWindow();
        see seeVar = this.o1;
        if (seeVar != null) {
            seeVar.e();
        }
        E0();
        int i = 0;
        this.s = false;
        vee veeVar = this.n;
        if (veeVar != null) {
            veeVar.g = false;
            veeVar.Y(this);
        }
        this.T1.clear();
        removeCallbacks(this.U1);
        this.g.getClass();
        while (s7j.d.a() != null) {
        }
        cfe cfeVar = this.c;
        for (int i3 = 0; i3 < cfeVar.c.size(); i3++) {
            rx8.l(((lfe) cfeVar.c.get(i3)).a);
        }
        nee neeVar = cfeVar.h.m;
        a aVar = cfeVar.g;
        if (aVar != null) {
            aVar.detachForPoolingContainer(neeVar, false);
        }
        while (i < getChildCount()) {
            int i4 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                ore.i();
                return;
            }
            pbd pbdVar = (pbd) childAt.getTag(ru.oneme.app.R.id.pooling_container_listener_holder_tag);
            if (pbdVar == null) {
                pbdVar = new pbd();
                childAt.setTag(ru.oneme.app.R.id.pooling_container_listener_holder_tag, pbdVar);
            }
            pbdVar.a();
            i = i4;
        }
        if (!f2 || (ij7Var = this.E1) == null) {
            return;
        }
        boolean zRemove = ij7Var.a.remove(this);
        if (!Z1 || zRemove) {
            this.E1 = null;
        } else {
            ore.k("RecyclerView removal failed!");
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((tee) arrayList.get(i)).g(canvas, this, this.G1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float axisValue;
        if (this.n != null && !this.x && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.n.f() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.n.getE() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.n.f()) {
                    f = -axisValue2;
                } else if (this.n.getE()) {
                    axisValue = axisValue2;
                    f = 0.0f;
                } else {
                    f = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f = 0.0f;
                axisValue = 0.0f;
            }
            if (f != 0.0f || axisValue != 0.0f) {
                int i = (int) (axisValue * this.A1);
                int i3 = (int) (f * this.B1);
                vee veeVar = this.n;
                if (veeVar == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    return false;
                }
                if (!this.x) {
                    int[] iArr = this.S1;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean e = veeVar.getE();
                    boolean zF = this.n.f();
                    int i4 = zF ? (e ? 1 : 0) | 2 : e ? 1 : 0;
                    float y = motionEvent.getY();
                    float x = motionEvent.getX();
                    int iL0 = i - l0(i, y);
                    int iM0 = i3 - m0(i3, x);
                    getScrollingChildHelper().f(i4, 1);
                    if (w(e ? iL0 : 0, zF ? iM0 : 0, 1, this.S1, this.Q1)) {
                        iL0 -= iArr[0];
                        iM0 -= iArr[1];
                    }
                    u0(e ? iL0 : 0, zF ? iM0 : 0, motionEvent, 1);
                    ij7 ij7Var = this.E1;
                    if (ij7Var != null && (iL0 != 0 || iM0 != 0)) {
                        ij7Var.a(this, iL0, iM0);
                    }
                    D0(1);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.x) {
            this.r = null;
            if (H(motionEvent)) {
                t0();
                setScrollState(0);
                return true;
            }
            vee veeVar = this.n;
            if (veeVar != null) {
                boolean e = veeVar.getE();
                boolean zF = this.n.f();
                if (this.r1 == null) {
                    this.r1 = VelocityTracker.obtain();
                }
                this.r1.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.y) {
                        this.y = false;
                    }
                    this.q1 = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.u1 = x;
                    this.s1 = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.v1 = y;
                    this.t1 = y;
                    EdgeEffect edgeEffect = this.I;
                    if (edgeEffect == null || rx8.E(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z = false;
                    } else {
                        rx8.V(this.I, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z = true;
                    }
                    EdgeEffect edgeEffect2 = this.K;
                    boolean z3 = z;
                    if (edgeEffect2 != null && rx8.E(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        z3 = z;
                        z3 = z;
                        rx8.V(this.K, 0.0f, motionEvent.getY() / getHeight());
                        z3 = true;
                    }
                    z3 = z;
                    z3 = z;
                    z3 = z;
                    EdgeEffect edgeEffect3 = this.J;
                    boolean z4 = z3;
                    if (edgeEffect3 != null && rx8.E(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        z4 = z3;
                        z4 = z3;
                        rx8.V(this.J, 0.0f, motionEvent.getX() / getWidth());
                        z4 = true;
                    }
                    z4 = z3;
                    z4 = z3;
                    z4 = z3;
                    EdgeEffect edgeEffect4 = this.n1;
                    boolean z5 = z4;
                    if (edgeEffect4 != null && rx8.E(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        z5 = z4;
                        z5 = z4;
                        rx8.V(this.n1, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z5 = true;
                    }
                    if (z5 || this.p1 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        D0(1);
                    }
                    int[] iArr = this.R1;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i = e;
                    if (zF) {
                        i = (e ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().f(i, 0);
                } else if (actionMasked == 1) {
                    this.r1.clear();
                    D0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.q1);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.q1 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.p1 != 1) {
                        int i3 = x2 - this.s1;
                        int i4 = y2 - this.t1;
                        if (!e || Math.abs(i3) <= this.w1) {
                            z2 = false;
                        } else {
                            this.u1 = x2;
                            z2 = true;
                        }
                        if (zF && Math.abs(i4) > this.w1) {
                            this.v1 = y2;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    t0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.q1 = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.u1 = x3;
                    this.s1 = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.v1 = y3;
                    this.t1 = y3;
                } else if (actionMasked == 6) {
                    f0(motionEvent);
                }
                if (this.p1 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i3, int i4, int i5) {
        int i6 = mwh.a;
        Trace.beginSection("RV OnLayout");
        t();
        Trace.endSection();
        this.u = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i3) {
        vee veeVar = this.n;
        if (veeVar == null) {
            r(i, i3);
            return;
        }
        boolean zQ = veeVar.Q();
        boolean z = false;
        hfe hfeVar = this.G1;
        if (zQ) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.n.m0(hfeVar, i, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.V1 = z;
            if (z || this.m == null) {
                return;
            }
            if (hfeVar.e == 1) {
                u();
            }
            this.n.C0(i, i3);
            hfeVar.j = true;
            v();
            this.n.E0(i, i3);
            if (this.n.H0()) {
                this.n.C0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                hfeVar.j = true;
                v();
                this.n.E0(i, i3);
            }
            this.W1 = getMeasuredWidth();
            this.X1 = getMeasuredHeight();
            return;
        }
        if (this.t) {
            this.n.m0(hfeVar, i, i3);
            return;
        }
        if (this.A) {
            B0();
            d0();
            i0();
            e0(true);
            if (hfeVar.l) {
                hfeVar.h = true;
            } else {
                this.e.l();
                hfeVar.h = false;
            }
            this.A = false;
            C0(false);
        } else if (hfeVar.l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        nee neeVar = this.m;
        if (neeVar != null) {
            hfeVar.f = neeVar.l();
        } else {
            hfeVar.f = 0;
        }
        B0();
        this.n.m0(hfeVar, i, i3);
        C0(false);
        hfeVar.h = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (Y()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof efe)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        efe efeVar = (efe) parcelable;
        this.d = efeVar;
        super.onRestoreInstanceState(efeVar.a());
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        efe efeVar = new efe(super.onSaveInstanceState());
        efe efeVar2 = this.d;
        if (efeVar2 != null) {
            efeVar.b(efeVar2);
            return efeVar;
        }
        vee veeVar = this.n;
        if (veeVar != null) {
            efeVar.c = veeVar.o0();
            return efeVar;
        }
        efeVar.c = null;
        return efeVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i3, int i4, int i5) {
        super.onSizeChanged(i, i3, i4, i5);
        if (i == i4 && i3 == i5) {
            return;
        }
        this.n1 = null;
        this.J = null;
        this.K = null;
        this.I = null;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00fb A[PHI: r1
  0x00fb: PHI (r1v46 int) = (r1v30 int), (r1v50 int) binds: [B:50:0x00e6, B:55:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zH;
        int i;
        boolean z;
        if (!this.x && !this.y) {
            zee zeeVar = this.r;
            if (zeeVar == null) {
                zH = motionEvent.getAction() == 0 ? false : H(motionEvent);
            } else {
                zeeVar.a(motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.r = null;
                }
                zH = true;
            }
            if (zH) {
                t0();
                setScrollState(0);
                return true;
            }
            vee veeVar = this.n;
            if (veeVar != null) {
                boolean e = veeVar.getE();
                boolean zF = this.n.f();
                if (this.r1 == null) {
                    this.r1 = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr = this.R1;
                if (actionMasked == 0) {
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(iArr[0], iArr[1]);
                if (actionMasked != 0) {
                    if (actionMasked == 1) {
                        this.r1.addMovement(motionEventObtain);
                        this.r1.computeCurrentVelocity(1000, this.z1);
                        float f = e ? -this.r1.getXVelocity(this.q1) : 0.0f;
                        float f3 = zF ? -this.r1.getYVelocity(this.q1) : 0.0f;
                        if ((f == 0.0f && f3 == 0.0f) || !M((int) f, (int) f3)) {
                            setScrollState(0);
                        }
                        t0();
                    } else if (actionMasked == 2) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.q1);
                        if (iFindPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.q1 + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        int iMax = this.u1 - x;
                        int iMax2 = this.v1 - y;
                        if (this.p1 != 1) {
                            if (e) {
                                int i3 = this.w1;
                                iMax = iMax > 0 ? Math.max(0, iMax - i3) : Math.min(0, iMax + i3);
                                if (iMax != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            if (zF) {
                                int i4 = this.w1;
                                iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - i4) : Math.min(0, iMax2 + i4);
                                if (iMax2 != 0) {
                                    z = true;
                                }
                            }
                            if (z) {
                                setScrollState(1);
                            }
                        }
                        if (this.p1 == 1) {
                            int[] iArr2 = this.S1;
                            iArr2[0] = 0;
                            iArr2[1] = 0;
                            int iL0 = iMax - l0(iMax, motionEvent.getY());
                            int iM0 = iMax2 - m0(iMax2, motionEvent.getX());
                            boolean zW = w(e ? iL0 : 0, zF ? iM0 : 0, 0, this.S1, this.Q1);
                            int[] iArr3 = this.Q1;
                            if (zW) {
                                iL0 -= iArr2[0];
                                iM0 -= iArr2[1];
                                iArr[0] = iArr[0] + iArr3[0];
                                iArr[1] = iArr[1] + iArr3[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i5 = iL0;
                            int i6 = iM0;
                            this.u1 = x - iArr3[0];
                            this.v1 = y - iArr3[1];
                            if (u0(e ? i5 : 0, zF ? i6 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            ij7 ij7Var = this.E1;
                            if (ij7Var != null && (i5 != 0 || i6 != 0)) {
                                ij7Var.a(this, i5, i6);
                            }
                        }
                    } else if (actionMasked == 3) {
                        t0();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.q1 = motionEvent.getPointerId(actionIndex);
                        int x2 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.u1 = x2;
                        this.s1 = x2;
                        int y2 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.v1 = y2;
                        this.t1 = y2;
                    } else if (actionMasked == 6) {
                        f0(motionEvent);
                    }
                    motionEventObtain.recycle();
                    return true;
                }
                this.q1 = motionEvent.getPointerId(0);
                int x3 = (int) (motionEvent.getX() + 0.5f);
                this.u1 = x3;
                this.s1 = x3;
                int y3 = (int) (motionEvent.getY() + 0.5f);
                this.v1 = y3;
                this.t1 = y3;
                if (zF) {
                    i = e;
                    i = (e ? 1 : 0) | 2;
                }
                i = e;
                getScrollingChildHelper().f(i, 0);
                this.r1.addMovement(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final void p0(xee xeeVar) {
        ArrayList arrayList = this.C;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(xeeVar);
    }

    public final void q() {
        if (!this.u || this.D) {
            int i = mwh.a;
            Trace.beginSection("RV FullInvalidate");
            t();
            Trace.endSection();
            return;
        }
        ma maVar = this.e;
        if (maVar.s()) {
            int i3 = maVar.a;
            if ((i3 & 4) == 0 || (i3 & 11) != 0) {
                if (maVar.s()) {
                    int i4 = mwh.a;
                    Trace.beginSection("RV FullInvalidate");
                    t();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i5 = mwh.a;
            Trace.beginSection("RV PartialInvalidate");
            B0();
            d0();
            maVar.z();
            if (!this.w) {
                vyh vyhVar = this.f;
                int iU = vyhVar.u();
                for (int i6 = 0; i6 < iU; i6++) {
                    lfe lfeVarT = T(vyhVar.t(i6));
                    if (lfeVarT != null && !lfeVarT.z() && lfeVarT.v()) {
                        t();
                    }
                }
                maVar.k();
            }
            C0(true);
            e0(true);
            Trace.endSection();
        }
    }

    public final void q0(zee zeeVar) {
        this.q.remove(zeeVar);
        if (this.r == zeeVar) {
            this.r = null;
        }
    }

    public final void r(int i, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = i7j.a;
        setMeasuredDimension(vee.h(i, paddingRight, getMinimumWidth()), vee.h(i3, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void r0(afe afeVar) {
        ArrayList arrayList = this.I1;
        if (arrayList != null) {
            arrayList.remove(afeVar);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        lfe lfeVarT = T(view);
        if (lfeVarT != null) {
            if (lfeVarT.u()) {
                lfeVarT.j &= -257;
            } else if (!lfeVarT.z()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(lfeVarT);
                c.m(sb, D());
                return;
            }
        } else if (Z1) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            c.m(sb2, D());
            return;
        }
        view.clearAnimation();
        s(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        a29 a29Var = this.n.e;
        if ((a29Var == null || !a29Var.k()) && !Y() && view2 != null) {
            s0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.n.w0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zee) arrayList.get(i)).e(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.v != 0 || this.x) {
            this.w = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(View view) {
        lfe lfeVarT = T(view);
        nee neeVar = this.m;
        if (neeVar != null && lfeVarT != null) {
            neeVar.A(lfeVarT);
        }
        ArrayList arrayList = this.C;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((xee) this.C.get(size)).b(view);
            }
        }
    }

    public final void s0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.j;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof wee) {
            wee weeVar = (wee) layoutParams;
            if (!weeVar.c) {
                Rect rect2 = weeVar.b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.n.w0(this, view, this.j, !this.u, view2 == null);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i3) {
        vee veeVar = this.n;
        if (veeVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.x) {
            return;
        }
        boolean e = veeVar.getE();
        boolean zF = this.n.f();
        if (e || zF) {
            if (!e) {
                i = 0;
            }
            if (!zF) {
                i3 = 0;
            }
            u0(i, i3, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!Y()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int iB = accessibilityEvent != null ? krk.b(accessibilityEvent) : 0;
            this.z |= iB != 0 ? iB : 0;
        }
    }

    public void setAccessibilityDelegateCompat(nfe nfeVar) {
        this.N1 = nfeVar;
        i7j.l(this, nfeVar);
    }

    public void setAdapter(nee neeVar) {
        setLayoutFrozen(false);
        x0(neeVar, false, true);
        j0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(qee qeeVar) {
        if (qeeVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.h) {
            this.n1 = null;
            this.J = null;
            this.K = null;
            this.I = null;
        }
        this.h = z;
        super.setClipToPadding(z);
        if (this.u) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(ree reeVar) {
        reeVar.getClass();
        this.H = reeVar;
        this.n1 = null;
        this.J = null;
        this.K = null;
        this.I = null;
    }

    public void setHasFixedSize(boolean z) {
        this.t = z;
    }

    public void setItemAnimator(see seeVar) {
        see seeVar2 = this.o1;
        if (seeVar2 != null) {
            seeVar2.e();
            this.o1.a = null;
        }
        this.o1 = seeVar;
        if (seeVar != null) {
            seeVar.a = this.L1;
        }
    }

    public void setItemViewCacheSize(int i) {
        cfe cfeVar = this.c;
        cfeVar.e = i;
        cfeVar.m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(vee veeVar) {
        RecyclerView recyclerView;
        if (veeVar == this.n) {
            return;
        }
        E0();
        if (this.n != null) {
            see seeVar = this.o1;
            if (seeVar != null) {
                seeVar.e();
            }
            this.n.r0(this.c);
            this.n.s0(this.c);
            cfe cfeVar = this.c;
            cfeVar.a.clear();
            cfeVar.f();
            if (this.s) {
                vee veeVar2 = this.n;
                veeVar2.g = false;
                veeVar2.Y(this);
            }
            this.n.F0(null);
            this.n = null;
        } else {
            cfe cfeVar2 = this.c;
            cfeVar2.a.clear();
            cfeVar2.f();
        }
        vyh vyhVar = this.f;
        ((xp3) vyhVar.d).h();
        ArrayList arrayList = (ArrayList) vyhVar.e;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = (RecyclerView) ((p3c) vyhVar.c).b;
            if (size < 0) {
                break;
            }
            lfe lfeVarT = T((View) arrayList.get(size));
            if (lfeVarT != null) {
                int i = lfeVarT.p;
                if (recyclerView.Y()) {
                    lfeVarT.q = i;
                    recyclerView.T1.add(lfeVarT);
                } else {
                    View view = lfeVarT.a;
                    WeakHashMap weakHashMap = i7j.a;
                    view.setImportantForAccessibility(i);
                }
                lfeVarT.p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            recyclerView.s(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.n = veeVar;
        if (veeVar != null) {
            if (veeVar.b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(veeVar);
                String strD = veeVar.b.D();
                sb.append(" is already attached to a RecyclerView:");
                sb.append(strD);
                throw new IllegalArgumentException(sb.toString());
            }
            veeVar.F0(this);
            if (this.s) {
                vee veeVar3 = this.n;
                veeVar3.g = true;
                veeVar3.X(this);
            }
        }
        this.c.m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            ore.p("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        ecb scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.c;
            WeakHashMap weakHashMap = i7j.a;
            y6j.n(viewGroup);
        }
        scrollingChildHelper.d = z;
    }

    public void setOnFlingListener(yee yeeVar) {
        this.x1 = yeeVar;
    }

    @Deprecated
    public void setOnScrollListener(afe afeVar) {
        this.H1 = afeVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.C1 = z;
    }

    public void setRecycledViewPool(a aVar) {
        cfe cfeVar = this.c;
        RecyclerView recyclerView = cfeVar.h;
        nee neeVar = recyclerView.m;
        a aVar2 = cfeVar.g;
        if (aVar2 != null) {
            aVar2.detachForPoolingContainer(neeVar, false);
        }
        a aVar3 = cfeVar.g;
        if (aVar3 != null) {
            aVar3.detach();
        }
        cfeVar.g = aVar;
        if (aVar != null && recyclerView.getAdapter() != null) {
            cfeVar.g.attach();
        }
        cfeVar.e();
    }

    @Deprecated
    public void setRecyclerListener(dfe dfeVar) {
    }

    public void setScrollState(int i) {
        a29 a29Var;
        if (i == this.p1) {
            return;
        }
        if (a2) {
            StringBuilder sbY = zo5.y(i, "setting scroll state to ", " from ");
            sbY.append(this.p1);
            Log.d("RecyclerView", sbY.toString(), new Exception());
        }
        this.p1 = i;
        if (i != 2) {
            kfe kfeVar = this.D1;
            kfeVar.g.removeCallbacks(kfeVar);
            kfeVar.c.abortAnimation();
            vee veeVar = this.n;
            if (veeVar != null && (a29Var = veeVar.e) != null) {
                a29Var.s();
            }
        }
        vee veeVar2 = this.n;
        if (veeVar2 != null) {
            veeVar2.p0(i);
        }
        g0();
        afe afeVar = this.H1;
        if (afeVar != null) {
            afeVar.a(this, i);
        }
        ArrayList arrayList = this.I1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((afe) this.I1.get(size)).a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.w1 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.w1 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(jfe jfeVar) {
        this.c.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().f(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().g(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.x) {
            l("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.x = true;
                this.y = true;
                E0();
                return;
            }
            this.x = false;
            if (this.w && this.n != null && this.m != null) {
                requestLayout();
            }
            this.w = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:169:0x037b  */
    /* JADX WARN: Code duplicated, block: B:174:0x038c  */
    /* JADX WARN: Code duplicated, block: B:176:0x038f  */
    /* JADX WARN: Code duplicated, block: B:182:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:184:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:186:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:189:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:192:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:195:0x03c7 A[LOOP:3: B:188:0x03b4->B:195:0x03c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:198:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:201:0x03db  */
    /* JADX WARN: Code duplicated, block: B:204:0x03e5 A[LOOP:4: B:197:0x03d2->B:204:0x03e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:206:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:232:0x03c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x03ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x03ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x03e8 A[EDGE_INSN: B:236:0x03e8->B:205:0x03e8 BREAK  A[LOOP:4: B:197:0x03d2->B:204:0x03e5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x03e3 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void t() {
        boolean z;
        long j;
        lfe lfeVarL;
        int i;
        int iB;
        int i3;
        int iMin;
        lfe lfeVarK;
        View view;
        lfe lfeVarK2;
        View view2;
        int i4;
        View viewFindViewById;
        View view3;
        bs0 bs0Var;
        boolean zK;
        int i5;
        boolean z2;
        int i6;
        if (this.m == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.n == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        hfe hfeVar = this.G1;
        hfeVar.j = false;
        boolean z3 = true;
        byte b = this.V1 && !(this.W1 == getWidth() && this.X1 == getHeight());
        this.W1 = 0;
        this.X1 = 0;
        this.V1 = false;
        if (hfeVar.e == 1) {
            u();
            this.n.B0(this);
            v();
        } else {
            ma maVar = this.e;
            if ((((ArrayList) maVar.d).isEmpty() || ((ArrayList) maVar.c).isEmpty()) && !b == true && this.n.n == getWidth() && this.n.o == getHeight()) {
                this.n.B0(this);
            } else {
                this.n.B0(this);
                v();
            }
        }
        hfeVar.a(4);
        B0();
        d0();
        hfeVar.e = 1;
        boolean z4 = hfeVar.k;
        vyh vyhVar = this.f;
        fbc fbcVar = this.g;
        if (z4) {
            int iU = vyhVar.u() - 1;
            while (iU >= 0) {
                lfe lfeVarT = T(vyhVar.t(iU));
                if (lfeVarT.z()) {
                    z2 = z3;
                } else {
                    long jO = O(lfeVarT);
                    this.o1.getClass();
                    bs0 bs0Var2 = new bs0(22);
                    bs0Var2.m(lfeVarT);
                    vi9 vi9Var = (vi9) fbcVar.c;
                    h6g h6gVar = (h6g) fbcVar.b;
                    lfe lfeVar = (lfe) vi9Var.b(jO);
                    if (lfeVar == null || lfeVar.z()) {
                        z2 = z3;
                        fbcVar.b(lfeVarT, bs0Var2);
                    } else {
                        z2 = z3;
                        s7j s7jVar = (s7j) h6gVar.get(lfeVar);
                        boolean z5 = (s7jVar == null || (s7jVar.a & 1) == 0) ? false : z2;
                        s7j s7jVar2 = (s7j) h6gVar.get(lfeVarT);
                        boolean z6 = (s7jVar2 == null || (s7jVar2.a & 1) == 0) ? false : z2;
                        if (z5 && lfeVar == lfeVarT) {
                            fbcVar.b(lfeVarT, bs0Var2);
                        } else {
                            bs0 bs0VarT = fbcVar.t(lfeVar, 4);
                            fbcVar.b(lfeVarT, bs0Var2);
                            bs0 bs0VarT2 = fbcVar.t(lfeVarT, 8);
                            if (bs0VarT == null) {
                                int iU2 = vyhVar.u();
                                for (int i7 = 0; i7 < iU2; i7++) {
                                    lfe lfeVarT2 = T(vyhVar.t(i7));
                                    if (lfeVarT2 != lfeVarT && O(lfeVarT2) == jO) {
                                        nee neeVar = this.m;
                                        if (neeVar == null || !neeVar.b) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(lfeVarT2);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(lfeVarT);
                                            qr7.m(sb, D());
                                            return;
                                        }
                                        StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb2.append(lfeVarT2);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(lfeVarT);
                                        qr7.m(sb2, D());
                                        return;
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + lfeVar + " cannot be found but it is necessary for " + lfeVarT + D());
                            } else {
                                lfeVar.y(false);
                                if (z5) {
                                    g(lfeVar);
                                }
                                if (lfeVar != lfeVarT) {
                                    if (z6) {
                                        g(lfeVarT);
                                    }
                                    lfeVar.h = lfeVarT;
                                    g(lfeVar);
                                    this.c.l(lfeVar);
                                    lfeVarT.y(false);
                                    lfeVarT.i = lfeVar;
                                }
                                rb5 rb5Var = (rb5) this.o1;
                                rb5Var.getClass();
                                int i8 = bs0VarT.b;
                                int i9 = bs0VarT.c;
                                if (lfeVarT.z()) {
                                    i6 = bs0VarT.b;
                                } else {
                                    i6 = bs0VarT2.b;
                                    bs0VarT = bs0VarT2;
                                }
                                if (rb5Var.j(lfeVar, lfeVarT, i8, i9, i6, bs0VarT.c)) {
                                    h0();
                                }
                            }
                        }
                    }
                }
                iU--;
                z3 = z2;
            }
            z = z3;
            h6g h6gVar2 = (h6g) fbcVar.b;
            for (int i10 = h6gVar2.c - 1; i10 >= 0; i10--) {
                lfe lfeVar2 = (lfe) h6gVar2.f(i10);
                s7j s7jVar3 = (s7j) h6gVar2.g(i10);
                int i11 = s7jVar3.a;
                int i12 = i11 & 3;
                t3a t3aVar = this.Y1;
                if (i12 == 3) {
                    RecyclerView recyclerView = (RecyclerView) t3aVar.a;
                    recyclerView.n.t0(lfeVar2.a, recyclerView.c);
                } else if ((i11 & 1) != 0) {
                    bs0 bs0Var3 = s7jVar3.b;
                    if (bs0Var3 == null) {
                        RecyclerView recyclerView2 = (RecyclerView) t3aVar.a;
                        recyclerView2.n.t0(lfeVar2.a, recyclerView2.c);
                    } else {
                        t3aVar.r(lfeVar2, bs0Var3, s7jVar3.c);
                    }
                } else if ((i11 & 14) == 14) {
                    t3aVar.p(lfeVar2, s7jVar3.b, s7jVar3.c);
                } else {
                    if ((i11 & 12) == 12) {
                        bs0 bs0Var4 = s7jVar3.b;
                        bs0 bs0Var5 = s7jVar3.c;
                        t3aVar.getClass();
                        lfeVar2.y(false);
                        RecyclerView recyclerView3 = (RecyclerView) t3aVar.a;
                        boolean z7 = recyclerView3.D;
                        see seeVar = recyclerView3.o1;
                        if (z7) {
                            rb5 rb5Var2 = (rb5) seeVar;
                            rb5Var2.getClass();
                            int i13 = bs0Var4.b;
                            int i14 = bs0Var4.c;
                            if (lfeVar2.z()) {
                                i5 = bs0Var4.b;
                            } else {
                                i5 = bs0Var5.b;
                                bs0Var4 = bs0Var5;
                            }
                            if (rb5Var2.j(lfeVar2, lfeVar2, i13, i14, i5, bs0Var4.c)) {
                                recyclerView3.h0();
                            }
                        } else {
                            rb5 rb5Var3 = (rb5) seeVar;
                            rb5Var3.getClass();
                            int i15 = bs0Var4.b;
                            int i16 = bs0Var5.b;
                            if (i15 == i16 && bs0Var4.c == bs0Var5.c) {
                                rb5Var3.b(lfeVar2);
                                zK = false;
                            } else {
                                zK = rb5Var3.k(lfeVar2, i15, bs0Var4.c, i16, bs0Var5.c);
                            }
                            if (zK) {
                                recyclerView3.h0();
                            }
                        }
                    } else if ((i11 & 4) != 0) {
                        bs0Var = null;
                        t3aVar.r(lfeVar2, s7jVar3.b, null);
                    } else {
                        bs0Var = null;
                        if ((i11 & 8) != 0) {
                            t3aVar.p(lfeVar2, s7jVar3.b, s7jVar3.c);
                        }
                    }
                    s7jVar3.a = 0;
                    s7jVar3.b = bs0Var;
                    s7jVar3.c = bs0Var;
                    s7j.d.d(s7jVar3);
                }
                bs0Var = null;
                s7jVar3.a = 0;
                s7jVar3.b = bs0Var;
                s7jVar3.c = bs0Var;
                s7j.d.d(s7jVar3);
            }
        } else {
            z = true;
        }
        View view4 = null;
        this.n.s0(this.c);
        hfeVar.c = hfeVar.f;
        this.D = false;
        this.E = false;
        hfeVar.k = false;
        hfeVar.l = false;
        this.n.f = false;
        ArrayList arrayList = this.c.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        vee veeVar = this.n;
        if (veeVar.k) {
            veeVar.j = 0;
            veeVar.k = false;
            this.c.m();
        }
        this.n.l0(hfeVar);
        boolean z8 = z;
        e0(z8);
        C0(false);
        ((h6g) fbcVar.b).clear();
        ((vi9) fbcVar.c).a();
        int[] iArr = this.O1;
        int i17 = iArr[0];
        int i18 = iArr[z8 ? 1 : 0];
        I(iArr);
        if (iArr[0] != i17 || iArr[z8 ? 1 : 0] != i18) {
            y(0, 0);
        }
        if (this.C1 && this.m != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                j = hfeVar.n;
                if (j == -1) {
                    lfeVarL = null;
                } else {
                    lfeVarL = null;
                }
                if (lfeVarL != null) {
                    view3 = lfeVarL.a;
                    if (!((ArrayList) vyhVar.e).contains(view3)) {
                        if (vyhVar.u() > 0) {
                            int i19 = hfeVar.m;
                            if (i19 != -1) {
                            }
                            iB = hfeVar.b();
                            i3 = i;
                            while (true) {
                                if (i3 < iB) {
                                    lfeVarK2 = K(i3);
                                    if (lfeVarK2 != null) {
                                        view2 = lfeVarK2.a;
                                        if (view2.hasFocusable()) {
                                            view4 = view2;
                                        } else {
                                            i3++;
                                        }
                                    }
                                }
                                for (iMin = Math.min(iB, i) - 1; iMin >= 0; iMin--) {
                                    lfeVarK = K(iMin);
                                    if (lfeVarK == null) {
                                        break;
                                        break;
                                    }
                                    view = lfeVarK.a;
                                    if (view.hasFocusable()) {
                                        view4 = view;
                                        break;
                                    }
                                }
                            }
                        }
                    } else if (vyhVar.u() > 0) {
                        int i110 = hfeVar.m;
                        if (i110 != -1) {
                        }
                        iB = hfeVar.b();
                        i3 = i;
                        while (true) {
                            if (i3 < iB) {
                                lfeVarK2 = K(i3);
                                if (lfeVarK2 != null) {
                                    view2 = lfeVarK2.a;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                lfeVarK = K(iMin);
                                if (lfeVarK == null) {
                                    break;
                                    break;
                                }
                                view = lfeVarK.a;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (vyhVar.u() > 0) {
                    int i111 = hfeVar.m;
                    if (i111 != -1) {
                    }
                    iB = hfeVar.b();
                    i3 = i;
                    while (true) {
                        if (i3 < iB) {
                            lfeVarK2 = K(i3);
                            if (lfeVarK2 != null) {
                                view2 = lfeVarK2.a;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i3++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            lfeVarK = K(iMin);
                            if (lfeVarK == null) {
                                break;
                                break;
                            }
                            view = lfeVarK.a;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i4 = hfeVar.o;
                    if (i4 != -1) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            } else if (((ArrayList) vyhVar.e).contains(getFocusedChild())) {
                j = hfeVar.n;
                if (j == -1 && this.m.b) {
                    lfeVarL = L(j);
                } else {
                    lfeVarL = null;
                }
                if (lfeVarL != null) {
                    view3 = lfeVarL.a;
                    if (!((ArrayList) vyhVar.e).contains(view3) && view3.hasFocusable()) {
                        view4 = view3;
                    } else if (vyhVar.u() > 0) {
                        int i112 = hfeVar.m;
                        i = i112 != -1 ? i112 : 0;
                        iB = hfeVar.b();
                        i3 = i;
                        while (true) {
                            if (i3 < iB) {
                                lfeVarK2 = K(i3);
                                if (lfeVarK2 != null) {
                                    view2 = lfeVarK2.a;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                lfeVarK = K(iMin);
                                if (lfeVarK == null) {
                                    break;
                                }
                                view = lfeVarK.a;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (vyhVar.u() > 0) {
                    int i113 = hfeVar.m;
                    if (i113 != -1) {
                    }
                    iB = hfeVar.b();
                    i3 = i;
                    while (true) {
                        if (i3 < iB) {
                            lfeVarK2 = K(i3);
                            if (lfeVarK2 != null) {
                                view2 = lfeVarK2.a;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i3++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            lfeVarK = K(iMin);
                            if (lfeVarK == null) {
                                break;
                                break;
                            }
                            view = lfeVarK.a;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i4 = hfeVar.o;
                    if (i4 != -1 && (viewFindViewById = view4.findViewById(i4)) != null && viewFindViewById.isFocusable()) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            }
        }
        hfeVar.n = -1L;
        hfeVar.m = -1;
        hfeVar.o = -1;
    }

    public final void t0() {
        VelocityTracker velocityTracker = this.r1;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        D0(0);
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.I.isFinished();
        }
        EdgeEffect edgeEffect2 = this.J;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.K;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.n1;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.n1.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = i7j.a;
            postInvalidateOnAnimation();
        }
    }

    public final void u() {
        s7j s7jVar;
        View viewG;
        hfe hfeVar = this.G1;
        hfeVar.a(1);
        E(hfeVar);
        hfeVar.j = false;
        B0();
        fbc fbcVar = this.g;
        h6g h6gVar = (h6g) fbcVar.b;
        h6g h6gVar2 = (h6g) fbcVar.b;
        h6gVar.clear();
        vi9 vi9Var = (vi9) fbcVar.c;
        vi9Var.a();
        d0();
        i0();
        lfe lfeVarS = null;
        View focusedChild = (this.C1 && hasFocus() && this.m != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewG = G(focusedChild)) != null) {
            lfeVarS = S(viewG);
        }
        if (lfeVarS == null) {
            hfeVar.n = -1L;
            hfeVar.m = -1;
            hfeVar.o = -1;
        } else {
            hfeVar.n = this.m.b ? lfeVarS.e : -1L;
            hfeVar.m = this.D ? -1 : lfeVarS.s() ? lfeVarS.d : lfeVarS.k();
            View focusedChild2 = lfeVarS.a;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            hfeVar.o = id;
        }
        hfeVar.i = hfeVar.k && this.K1;
        this.K1 = false;
        this.J1 = false;
        hfeVar.h = hfeVar.l;
        hfeVar.f = this.m.l();
        I(this.O1);
        boolean z = hfeVar.k;
        vyh vyhVar = this.f;
        if (z) {
            int iU = vyhVar.u();
            for (int i = 0; i < iU; i++) {
                lfe lfeVarT = T(vyhVar.t(i));
                if (!lfeVarT.z() && (!lfeVarT.q() || this.m.b)) {
                    see seeVar = this.o1;
                    see.a(lfeVarT);
                    lfeVarT.n();
                    seeVar.getClass();
                    bs0 bs0Var = new bs0(22);
                    bs0Var.m(lfeVarT);
                    s7j s7jVarA = (s7j) h6gVar2.get(lfeVarT);
                    if (s7jVarA == null) {
                        s7jVarA = s7j.a();
                        h6gVar2.put(lfeVarT, s7jVarA);
                    }
                    s7jVarA.b = bs0Var;
                    s7jVarA.a |= 4;
                    if (hfeVar.i && lfeVarT.v() && !lfeVarT.s() && !lfeVarT.z() && !lfeVarT.q()) {
                        vi9Var.f(O(lfeVarT), lfeVarT);
                    }
                }
            }
        }
        if (hfeVar.l) {
            int iZ = vyhVar.z();
            for (int i3 = 0; i3 < iZ; i3++) {
                lfe lfeVarT2 = T(vyhVar.y(i3));
                if (Z1 && lfeVarT2.c == -1 && !lfeVarT2.s()) {
                    ore.k("view holder cannot have position -1 unless it is removed".concat(D()));
                    return;
                }
                if (!lfeVarT2.z() && lfeVarT2.d == -1) {
                    lfeVarT2.d = lfeVarT2.c;
                }
            }
            boolean z2 = hfeVar.g;
            hfeVar.g = false;
            this.n.k0(this.c, hfeVar);
            hfeVar.g = z2;
            for (int i4 = 0; i4 < vyhVar.u(); i4++) {
                lfe lfeVarT3 = T(vyhVar.t(i4));
                if (!lfeVarT3.z() && ((s7jVar = (s7j) h6gVar2.get(lfeVarT3)) == null || (s7jVar.a & 4) == 0)) {
                    see.a(lfeVarT3);
                    boolean z3 = (lfeVarT3.j & 8192) != 0;
                    see seeVar2 = this.o1;
                    lfeVarT3.n();
                    seeVar2.getClass();
                    bs0 bs0Var2 = new bs0(22);
                    bs0Var2.m(lfeVarT3);
                    if (z3) {
                        k0(lfeVarT3, bs0Var2);
                    } else {
                        s7j s7jVarA2 = (s7j) h6gVar2.get(lfeVarT3);
                        if (s7jVarA2 == null) {
                            s7jVarA2 = s7j.a();
                            h6gVar2.put(lfeVarT3, s7jVarA2);
                        }
                        s7jVarA2.a |= 2;
                        s7jVarA2.b = bs0Var2;
                    }
                }
            }
            n();
        } else {
            n();
        }
        e0(true);
        C0(false);
        hfeVar.e = 2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f7 A[DONT_INVERT, PHI: r7
  0x00f7: PHI (r7v9 boolean) = (r7v7 boolean), (r7v10 boolean) binds: [B:33:0x00de, B:31:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101  */
    public final boolean u0(int i, int i3, MotionEvent motionEvent, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        float f;
        boolean z;
        q();
        nee neeVar = this.m;
        int[] iArr = this.S1;
        if (neeVar != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            v0(i, i3, iArr);
            i5 = iArr[0];
            i6 = iArr[1];
            i7 = i - i5;
            i8 = i3 - i6;
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        if (!this.p.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        x(i5, i6, i7, i8, this.Q1, i4, iArr);
        int i9 = iArr[0];
        int i10 = i7 - i9;
        int i11 = iArr[1];
        int i12 = i8 - i11;
        boolean z2 = (i9 == 0 && i11 == 0) ? false : true;
        int i13 = this.u1;
        int[] iArr2 = this.Q1;
        int i14 = iArr2[0];
        this.u1 = i13 - i14;
        int i15 = this.v1;
        int i16 = iArr2[1];
        this.v1 = i15 - i16;
        int[] iArr3 = this.R1;
        iArr3[0] = iArr3[0] + i14;
        iArr3[1] = iArr3[1] + i16;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !pvk.b(motionEvent, 8194)) {
                float x = motionEvent.getX();
                float f3 = i10;
                float y = motionEvent.getY();
                float f4 = i12;
                if (f3 < 0.0f) {
                    A();
                    f = 0.0f;
                    rx8.V(this.I, (-f3) / getWidth(), 1.0f - (y / getHeight()));
                } else {
                    f = 0.0f;
                    if (f3 > 0.0f) {
                        B();
                        rx8.V(this.K, f3 / getWidth(), y / getHeight());
                    } else {
                        z = false;
                    }
                    if (f4 < f) {
                        C();
                        rx8.V(this.J, (-f4) / getHeight(), x / getWidth());
                    } else if (f4 > f) {
                        z();
                        rx8.V(this.n1, f4 / getHeight(), 1.0f - (x / getWidth()));
                    } else if (z || f3 != f || f4 != f) {
                        WeakHashMap weakHashMap = i7j.a;
                        postInvalidateOnAnimation();
                    }
                    z = true;
                    if (z) {
                        WeakHashMap weakHashMap2 = i7j.a;
                        postInvalidateOnAnimation();
                    } else {
                        WeakHashMap weakHashMap3 = i7j.a;
                        postInvalidateOnAnimation();
                    }
                }
                z = true;
                if (f4 < f) {
                    C();
                    rx8.V(this.J, (-f4) / getHeight(), x / getWidth());
                } else if (f4 > f) {
                    z();
                    rx8.V(this.n1, f4 / getHeight(), 1.0f - (x / getWidth()));
                } else if (z) {
                    WeakHashMap weakHashMap4 = i7j.a;
                    postInvalidateOnAnimation();
                } else {
                    WeakHashMap weakHashMap5 = i7j.a;
                    postInvalidateOnAnimation();
                }
                z = true;
                if (z) {
                    WeakHashMap weakHashMap6 = i7j.a;
                    postInvalidateOnAnimation();
                } else {
                    WeakHashMap weakHashMap7 = i7j.a;
                    postInvalidateOnAnimation();
                }
            }
            o(i, i3);
        }
        if (i5 != 0 || i6 != 0) {
            y(i5, i6);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i5 == 0 && i6 == 0) ? false : true;
    }

    public final void v() {
        B0();
        d0();
        hfe hfeVar = this.G1;
        hfeVar.a(6);
        this.e.l();
        hfeVar.f = this.m.l();
        hfeVar.d = 0;
        if (this.d != null) {
            nee neeVar = this.m;
            int iD = qt4.D(neeVar.c);
            if (iD == 1 ? neeVar.l() > 0 : iD != 2) {
                Parcelable parcelable = this.d.c;
                if (parcelable != null) {
                    this.n.n0(parcelable);
                }
                this.d = null;
            }
        }
        hfeVar.h = false;
        this.n.k0(this.c, hfeVar);
        hfeVar.g = false;
        hfeVar.k = hfeVar.k && this.o1 != null;
        hfeVar.e = 4;
        e0(true);
        C0(false);
    }

    public final void v0(int i, int i3, int[] iArr) {
        lfe lfeVar;
        B0();
        d0();
        int i4 = mwh.a;
        Trace.beginSection("RV Scroll");
        hfe hfeVar = this.G1;
        E(hfeVar);
        int iY0 = i != 0 ? this.n.y0(i, this.c, hfeVar) : 0;
        int iA0 = i3 != 0 ? this.n.A0(i3, this.c, hfeVar) : 0;
        Trace.endSection();
        vyh vyhVar = this.f;
        int iU = vyhVar.u();
        for (int i5 = 0; i5 < iU; i5++) {
            View viewT = vyhVar.t(i5);
            lfe lfeVarS = S(viewT);
            if (lfeVarS != null && (lfeVar = lfeVarS.i) != null) {
                View view = lfeVar.a;
                int left = viewT.getLeft();
                int top = viewT.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        e0(true);
        C0(false);
        if (iArr != null) {
            iArr[0] = iY0;
            iArr[1] = iA0;
        }
    }

    public final boolean w(int i, int i3, int i4, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().b(i, i3, i4, iArr, iArr2);
    }

    public final void w0(int i) {
        if (this.x) {
            return;
        }
        E0();
        vee veeVar = this.n;
        if (veeVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            veeVar.z0(i);
            awakenScrollBars();
        }
    }

    public final void x(int i, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().c(i, i3, i4, i5, iArr, i6, iArr2);
    }

    public final void x0(nee neeVar, boolean z, boolean z2) {
        nee neeVar2 = this.m;
        v66 v66Var = this.b;
        if (neeVar2 != null) {
            neeVar2.E(v66Var);
            this.m.x(this);
        }
        if (!z || z2) {
            n0();
        }
        ma maVar = this.e;
        maVar.A((ArrayList) maVar.c);
        maVar.A((ArrayList) maVar.d);
        maVar.a = 0;
        nee neeVar3 = this.m;
        this.m = neeVar;
        if (neeVar != null) {
            neeVar.C(v66Var);
            neeVar.t(this);
        }
        vee veeVar = this.n;
        if (veeVar != null) {
            veeVar.W();
        }
        cfe cfeVar = this.c;
        nee neeVar4 = this.m;
        cfeVar.a.clear();
        cfeVar.f();
        a aVar = cfeVar.g;
        if (aVar != null) {
            aVar.detachForPoolingContainer(neeVar3, true);
        }
        cfeVar.c().onAdapterChanged(neeVar3, neeVar4, z);
        cfeVar.e();
        this.G1.g = true;
    }

    public final void y(int i, int i3) {
        this.G++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i3);
        afe afeVar = this.H1;
        if (afeVar != null) {
            afeVar.b(this, i, i3);
        }
        ArrayList arrayList = this.I1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((afe) this.I1.get(size)).b(this, i, i3);
            }
        }
        this.G--;
    }

    public final boolean y0(EdgeEffect edgeEffect, int i, int i3) {
        if (i > 0) {
            return true;
        }
        float fE = rx8.E(edgeEffect) * i3;
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.a * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = c2;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fE;
    }

    public final void z() {
        if (this.n1 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.H.a(this, 3);
        this.n1 = edgeEffectA;
        if (this.h) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void z0(int i, int i3, boolean z) {
        vee veeVar = this.n;
        if (veeVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.x) {
            return;
        }
        if (!veeVar.getE()) {
            i = 0;
        }
        if (!this.n.f()) {
            i3 = 0;
        }
        if (i == 0 && i3 == 0) {
            return;
        }
        if (z) {
            int i4 = i != 0 ? 1 : 0;
            if (i3 != 0) {
                i4 |= 2;
            }
            getScrollingChildHelper().f(i4, 1);
        }
        this.D1.c(i, i3, Integer.MIN_VALUE, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        vee veeVar = this.n;
        if (veeVar != null) {
            return veeVar.u(layoutParams);
        }
        ore.k("RecyclerView has no LayoutManager".concat(D()));
        return null;
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ru.oneme.app.R.attr.recyclerViewStyle);
    }

    public RecyclerView(Context context) {
        this(context, null);
    }
}
