package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class vee {
    public vyh a;
    public RecyclerView b;
    public final fbc c;
    public final fbc d;
    public a29 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;

    public vee() {
        pgg pggVar = new pgg(this);
        t3a t3aVar = new t3a(this);
        this.c = new fbc(pggVar);
        this.d = new fbc(t3aVar);
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = true;
    }

    public static int B(View view) {
        return view.getLeft() - ((wee) view.getLayoutParams()).b.left;
    }

    public static int C(View view) {
        Rect rect = ((wee) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static int D(View view) {
        Rect rect = ((wee) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int E(View view) {
        return view.getRight() + ((wee) view.getLayoutParams()).b.right;
    }

    public static int F(View view) {
        return view.getTop() - ((wee) view.getLayoutParams()).b.top;
    }

    public static int M(View view) {
        return ((wee) view.getLayoutParams()).a.m();
    }

    public static uee N(Context context, AttributeSet attributeSet, int i, int i2) {
        uee ueeVar = new uee();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i3e.a, i, i2);
        ueeVar.a = typedArrayObtainStyledAttributes.getInt(0, 1);
        ueeVar.b = typedArrayObtainStyledAttributes.getInt(10, 1);
        ueeVar.c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        ueeVar.d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return ueeVar;
    }

    public static boolean R(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static int h(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i2, i3) : size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:5:0x0010  */
    public static int x(boolean z, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, i - i3);
        if (z) {
            if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                i2 = 0;
                i4 = 0;
            } else {
                i4 = iMax;
            }
        } else if (i4 >= 0) {
            i2 = 1073741824;
        } else if (i4 == -1) {
            i4 = iMax;
        } else if (i4 != -2) {
            i2 = 0;
            i4 = 0;
        } else if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
            i4 = iMax;
            i2 = Integer.MIN_VALUE;
        } else {
            i4 = iMax;
            i2 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    public static int z(View view) {
        return view.getBottom() + ((wee) view.getLayoutParams()).b.bottom;
    }

    public void A(Rect rect, View view) {
        RecyclerView.U(rect, view);
    }

    public int A0(int i, cfe cfeVar, hfe hfeVar) {
        return 0;
    }

    public final void B0(RecyclerView recyclerView) {
        C0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void C0(int i, int i2) {
        this.n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.l = mode;
        if (mode == 0 && !RecyclerView.d2) {
            this.n = 0;
        }
        this.o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.m = mode2;
        if (mode2 != 0 || RecyclerView.d2) {
            return;
        }
        this.o = 0;
    }

    public void D0(int i, int i2, Rect rect) {
        int iK = K() + J() + rect.width();
        int I = I() + L() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = i7j.a;
        this.b.setMeasuredDimension(h(i, iK, recyclerView.getMinimumWidth()), h(i2, I, this.b.getMinimumHeight()));
    }

    public final void E0(int i, int i2) {
        int iW = w();
        if (iW == 0) {
            this.b.r(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iW; i7++) {
            View viewV = v(i7);
            Rect rect = this.b.j;
            A(rect, viewV);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.b.j.set(i6, i4, i3, i5);
        D0(i, i2, this.b.j);
    }

    public final void F0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.a = null;
            this.n = 0;
            this.o = 0;
        } else {
            this.b = recyclerView;
            this.a = recyclerView.f;
            this.n = recyclerView.getWidth();
            this.o = recyclerView.getHeight();
        }
        this.l = 1073741824;
        this.m = 1073741824;
    }

    public final int G() {
        RecyclerView recyclerView = this.b;
        nee adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.l();
        }
        return 0;
    }

    public final boolean G0(View view, int i, int i2, wee weeVar) {
        return (!view.isLayoutRequested() && this.h && R(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) weeVar).width) && R(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) weeVar).height)) ? false : true;
    }

    public final int H() {
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = i7j.a;
        return recyclerView.getLayoutDirection();
    }

    public boolean H0() {
        return false;
    }

    public final int I() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final boolean I0(View view, int i, int i2, wee weeVar) {
        return (this.h && R(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) weeVar).width) && R(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) weeVar).height)) ? false : true;
    }

    public final int J() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public void J0(RecyclerView recyclerView, int i) {
        Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
    }

    public final int K() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final void K0(a29 a29Var) {
        a29 a29Var2 = this.e;
        if (a29Var2 != null && a29Var != a29Var2 && a29Var2.k()) {
            this.e.s();
        }
        this.e = a29Var;
        a29Var.r(this.b, this);
    }

    public final int L() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public boolean L0() {
        return false;
    }

    public int O(cfe cfeVar, hfe hfeVar) {
        return -1;
    }

    public final void P(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((wee) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.b.l;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean Q();

    public void S(View view, int i, int i2, int i3, int i4) {
        wee weeVar = (wee) view.getLayoutParams();
        Rect rect = weeVar.b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) weeVar).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) weeVar).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) weeVar).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) weeVar).bottomMargin);
    }

    public void T(View view, int i, int i2) {
        wee weeVar = (wee) view.getLayoutParams();
        Rect rectV = this.b.V(view);
        int i3 = rectV.left + rectV.right + i;
        int i4 = rectV.top + rectV.bottom + i2;
        int iX = x(getE(), this.n, this.l, K() + J() + ((ViewGroup.MarginLayoutParams) weeVar).leftMargin + ((ViewGroup.MarginLayoutParams) weeVar).rightMargin + i3, ((ViewGroup.MarginLayoutParams) weeVar).width);
        int iX2 = x(f(), this.o, this.m, I() + L() + ((ViewGroup.MarginLayoutParams) weeVar).topMargin + ((ViewGroup.MarginLayoutParams) weeVar).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) weeVar).height);
        if (G0(view, iX, iX2, weeVar)) {
            view.measure(iX, iX2);
        }
    }

    public void U(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int iU = recyclerView.f.u();
            for (int i2 = 0; i2 < iU; i2++) {
                recyclerView.f.t(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void V(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.b0(i);
        }
    }

    public void W() {
    }

    public void X(RecyclerView recyclerView) {
    }

    public void Y(RecyclerView recyclerView) {
    }

    public View Z(View view, int i, cfe cfeVar, hfe hfeVar) {
        return null;
    }

    public void a0(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        cfe cfeVar = recyclerView.c;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        nee neeVar = this.b.m;
        if (neeVar != null) {
            accessibilityEvent.setItemCount(neeVar.l());
        }
    }

    public final void b(View view) {
        c(view, -1, false);
    }

    public void b0(cfe cfeVar, hfe hfeVar, x4 x4Var) {
        if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
            x4Var.a(8192);
            x4Var.j(true);
        }
        if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
            x4Var.a(np0.r);
            x4Var.j(true);
        }
        x4Var.a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) w4.m(O(cfeVar, hfeVar), y(cfeVar, hfeVar), 0).a);
    }

    public final void c(View view, int i, boolean z) {
        lfe lfeVarT = RecyclerView.T(view);
        if (z || lfeVarT.s()) {
            h6g h6gVar = (h6g) this.b.g.b;
            s7j s7jVarA = (s7j) h6gVar.get(lfeVarT);
            if (s7jVarA == null) {
                s7jVarA = s7j.a();
                h6gVar.put(lfeVarT, s7jVarA);
            }
            s7jVarA.a |= 1;
        } else {
            this.b.g.w(lfeVarT);
        }
        wee weeVar = (wee) view.getLayoutParams();
        if (lfeVarT.A() || lfeVarT.t()) {
            if (lfeVarT.t()) {
                lfeVarT.n.l(lfeVarT);
            } else {
                lfeVarT.j &= -33;
            }
            this.a.d(view, i, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.b;
            vyh vyhVar = this.a;
            if (parent == recyclerView) {
                xp3 xp3Var = (xp3) vyhVar.d;
                int iIndexOfChild = ((RecyclerView) ((p3c) vyhVar.c).b).indexOfChild(view);
                int iB = (iIndexOfChild == -1 || xp3Var.d(iIndexOfChild)) ? -1 : iIndexOfChild - xp3Var.b(iIndexOfChild);
                if (i == -1) {
                    i = this.a.u();
                }
                if (iB == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.D());
                }
                if (iB != i) {
                    vee veeVar = this.b.n;
                    View viewV = veeVar.v(iB);
                    if (viewV == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iB + veeVar.b.toString());
                    }
                    veeVar.v(iB);
                    veeVar.a.o(iB);
                    wee weeVar2 = (wee) viewV.getLayoutParams();
                    lfe lfeVarT2 = RecyclerView.T(viewV);
                    boolean zS = lfeVarT2.s();
                    RecyclerView recyclerView2 = veeVar.b;
                    if (zS) {
                        h6g h6gVar2 = (h6g) recyclerView2.g.b;
                        s7j s7jVarA2 = (s7j) h6gVar2.get(lfeVarT2);
                        if (s7jVarA2 == null) {
                            s7jVarA2 = s7j.a();
                            h6gVar2.put(lfeVarT2, s7jVarA2);
                        }
                        s7jVarA2.a = 1 | s7jVarA2.a;
                    } else {
                        recyclerView2.g.w(lfeVarT2);
                    }
                    veeVar.a.d(viewV, i, weeVar2, lfeVarT2.s());
                }
            } else {
                vyhVar.b(view, i, false);
                weeVar.c = true;
                a29 a29Var = this.e;
                if (a29Var != null && a29Var.k()) {
                    this.e.m(view);
                }
            }
        }
        if (weeVar.d) {
            if (RecyclerView.a2) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + weeVar.a);
            }
            lfeVarT.a.invalidate();
            weeVar.d = false;
        }
    }

    public void c0(cfe cfeVar, hfe hfeVar, View view, x4 x4Var) {
    }

    public void d(String str) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.l(str);
        }
    }

    public final void d0(View view, x4 x4Var) {
        lfe lfeVarT = RecyclerView.T(view);
        if (lfeVarT == null || lfeVarT.s()) {
            return;
        }
        vyh vyhVar = this.a;
        if (((ArrayList) vyhVar.e).contains(lfeVarT.a)) {
            return;
        }
        RecyclerView recyclerView = this.b;
        c0(recyclerView.c, recyclerView.G1, view, x4Var);
    }

    /* JADX INFO: renamed from: e */
    public boolean getE() {
        return false;
    }

    public void e0(int i, int i2) {
    }

    public boolean f() {
        return false;
    }

    public void f0() {
    }

    public boolean g(wee weeVar) {
        return weeVar != null;
    }

    public void g0(int i, int i2) {
    }

    public void h0(int i, int i2) {
    }

    public void i(int i, int i2, hfe hfeVar, nk5 nk5Var) {
    }

    public void i0() {
    }

    public void j(int i, nk5 nk5Var) {
    }

    public void j0(RecyclerView recyclerView, int i, int i2) {
        i0();
    }

    public int k(hfe hfeVar) {
        return 0;
    }

    public abstract void k0(cfe cfeVar, hfe hfeVar);

    public int l(hfe hfeVar) {
        return 0;
    }

    public void l0(hfe hfeVar) {
    }

    public int m(hfe hfeVar) {
        return 0;
    }

    public void m0(hfe hfeVar, int i, int i2) {
        this.b.r(i, i2);
    }

    public int n(hfe hfeVar) {
        return 0;
    }

    public void n0(Parcelable parcelable) {
    }

    public int o(hfe hfeVar) {
        return 0;
    }

    public Parcelable o0() {
        return null;
    }

    public int p(hfe hfeVar) {
        return 0;
    }

    public void p0(int i) {
    }

    public final void q(cfe cfeVar) {
        for (int iW = w() - 1; iW >= 0; iW--) {
            View viewV = v(iW);
            lfe lfeVarT = RecyclerView.T(viewV);
            if (lfeVarT.z()) {
                if (RecyclerView.a2) {
                    Log.d("RecyclerView", "ignoring view " + lfeVarT);
                }
            } else if (!lfeVarT.q() || lfeVarT.s() || this.b.m.b) {
                v(iW);
                this.a.o(iW);
                cfeVar.j(viewV);
                this.b.g.w(lfeVarT);
            } else {
                v0(iW);
                cfeVar.i(lfeVarT);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0062 A[PHI: r3
  0x0062: PHI (r3v8 int) = (r3v5 int), (r3v11 int) binds: [B:28:0x007e, B:20:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    public boolean q0(cfe cfeVar, hfe hfeVar, int i, Bundle bundle) {
        int iL;
        int iJ;
        if (this.b != null) {
            int iHeight = this.o;
            int iWidth = this.n;
            Rect rect = new Rect();
            if (this.b.getMatrix().isIdentity() && this.b.getGlobalVisibleRect(rect)) {
                iHeight = rect.height();
                iWidth = rect.width();
            }
            if (i == 4096) {
                iL = this.b.canScrollVertically(1) ? (iHeight - L()) - I() : 0;
                if (this.b.canScrollHorizontally(1)) {
                    iJ = (iWidth - J()) - K();
                } else {
                    iJ = 0;
                }
            } else if (i != 8192) {
                iL = 0;
                iJ = 0;
            } else {
                iL = this.b.canScrollVertically(-1) ? -((iHeight - L()) - I()) : 0;
                if (this.b.canScrollHorizontally(-1)) {
                    iJ = -((iWidth - J()) - K());
                } else {
                    iJ = 0;
                }
            }
            if (iL != 0 || iJ != 0) {
                this.b.z0(iJ, iL, true);
                return true;
            }
        }
        return false;
    }

    public View r(int i) {
        int iW = w();
        for (int i2 = 0; i2 < iW; i2++) {
            View viewV = v(i2);
            lfe lfeVarT = RecyclerView.T(viewV);
            if (lfeVarT != null && lfeVarT.m() == i && !lfeVarT.z() && (this.b.G1.h || !lfeVarT.s())) {
                return viewV;
            }
        }
        return null;
    }

    public final void r0(cfe cfeVar) {
        for (int iW = w() - 1; iW >= 0; iW--) {
            if (!RecyclerView.T(v(iW)).z()) {
                u0(iW, cfeVar);
            }
        }
    }

    public abstract wee s();

    public final void s0(cfe cfeVar) {
        ArrayList arrayList;
        int size = cfeVar.a.size();
        int i = size - 1;
        while (true) {
            arrayList = cfeVar.a;
            if (i < 0) {
                break;
            }
            View view = ((lfe) arrayList.get(i)).a;
            lfe lfeVarT = RecyclerView.T(view);
            if (!lfeVarT.z()) {
                lfeVarT.y(false);
                if (lfeVarT.u()) {
                    this.b.removeDetachedView(view, false);
                }
                see seeVar = this.b.o1;
                if (seeVar != null) {
                    seeVar.d(lfeVarT);
                }
                lfeVarT.y(true);
                lfe lfeVarT2 = RecyclerView.T(view);
                lfeVarT2.n = null;
                lfeVarT2.o = false;
                lfeVarT2.j &= -33;
                cfeVar.i(lfeVarT2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = cfeVar.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public wee t(Context context, AttributeSet attributeSet) {
        return new wee(context, attributeSet);
    }

    public final void t0(View view, cfe cfeVar) {
        vyh vyhVar = this.a;
        p3c p3cVar = (p3c) vyhVar.c;
        int i = vyhVar.b;
        if (i == 1) {
            ore.k("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (i == 2) {
            ore.k("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        try {
            vyhVar.b = 1;
            vyhVar.f = view;
            int iIndexOfChild = ((RecyclerView) p3cVar.b).indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (((xp3) vyhVar.d).g(iIndexOfChild)) {
                    vyhVar.L(view);
                }
                p3cVar.q(iIndexOfChild);
            }
            vyhVar.b = 0;
            vyhVar.f = null;
            cfeVar.h(view);
        } catch (Throwable th) {
            vyhVar.b = 0;
            vyhVar.f = null;
            throw th;
        }
    }

    public wee u(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof wee) {
            return new wee((wee) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new wee((ViewGroup.MarginLayoutParams) layoutParams) : new wee(layoutParams);
    }

    public final void u0(int i, cfe cfeVar) {
        View viewV = v(i);
        v0(i);
        cfeVar.h(viewV);
    }

    public final View v(int i) {
        vyh vyhVar = this.a;
        if (vyhVar != null) {
            return vyhVar.t(i);
        }
        return null;
    }

    public final void v0(int i) {
        if (v(i) != null) {
            vyh vyhVar = this.a;
            p3c p3cVar = (p3c) vyhVar.c;
            int i2 = vyhVar.b;
            if (i2 == 1) {
                ore.k("Cannot call removeView(At) within removeView(At)");
                return;
            }
            if (i2 == 2) {
                ore.k("Cannot call removeView(At) within removeViewIfHidden");
                return;
            }
            try {
                int iW = vyhVar.w(i);
                View childAt = ((RecyclerView) p3cVar.b).getChildAt(iW);
                if (childAt == null) {
                    return;
                }
                vyhVar.b = 1;
                vyhVar.f = childAt;
                if (((xp3) vyhVar.d).g(iW)) {
                    vyhVar.L(childAt);
                }
                p3cVar.q(iW);
            } finally {
                vyhVar.b = 0;
                vyhVar.f = null;
            }
        }
    }

    public final int w() {
        vyh vyhVar = this.a;
        if (vyhVar != null) {
            return vyhVar.u();
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
    public boolean w0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int iJ = J();
        int iL = L();
        int iK = this.n - K();
        int I = this.o - I();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i = left - iJ;
        int iMin = Math.min(0, i);
        int i2 = top - iL;
        int iMin2 = Math.min(0, i2);
        int i3 = iWidth - iK;
        int iMax = Math.max(0, i3);
        int iMax2 = Math.max(0, iHeight - I);
        if (H() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i3);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i2, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i4 = iArr[0];
        int i5 = iArr[1];
        if (z2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int iJ2 = J();
                int iL2 = L();
                int iK2 = this.n - K();
                int I2 = this.o - I();
                Rect rect2 = this.b.j;
                A(rect2, focusedChild);
                if (rect2.left - i4 < iK2 && rect2.right - i4 > iJ2 && rect2.top - i5 < I2 && rect2.bottom - i5 > iL2) {
                    if (i4 == 0) {
                    }
                    if (z) {
                        recyclerView.scrollBy(i4, i5);
                        return true;
                    }
                    recyclerView.z0(i4, i5, false);
                    return true;
                }
            }
        } else if (i4 == 0 || i5 != 0) {
            if (z) {
                recyclerView.scrollBy(i4, i5);
                return true;
            }
            recyclerView.z0(i4, i5, false);
            return true;
        }
        return false;
    }

    public final void x0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public int y(cfe cfeVar, hfe hfeVar) {
        return -1;
    }

    public int y0(int i, cfe cfeVar, hfe hfeVar) {
        return 0;
    }

    public void z0(int i) {
        if (RecyclerView.a2) {
            Log.e("RecyclerView", "You MUST implement scrollToPosition. It will soon become abstract");
        }
    }
}
