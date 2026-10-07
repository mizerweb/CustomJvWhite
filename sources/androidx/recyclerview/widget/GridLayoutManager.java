package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import defpackage.c;
import defpackage.cfe;
import defpackage.hfe;
import defpackage.hg6;
import defpackage.i7j;
import defpackage.lq7;
import defpackage.mq7;
import defpackage.nk5;
import defpackage.ore;
import defpackage.pgg;
import defpackage.qv1;
import defpackage.sr;
import defpackage.v19;
import defpackage.vee;
import defpackage.w19;
import defpackage.wee;
import defpackage.x4;
import defpackage.zo5;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public sr K;
    public final Rect L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new lq7(5);
        this.L = new Rect();
        C1(vee.N(context, attributeSet, i, i2).b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.vee
    public final int A0(int i, cfe cfeVar, hfe hfeVar) {
        D1();
        w1();
        return super.A0(i, cfeVar, hfeVar);
    }

    public final int A1(int i, cfe cfeVar, hfe hfeVar) {
        if (!hfeVar.h) {
            return this.K.P(i);
        }
        int i2 = this.I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iB = cfeVar.b(i);
        if (iB != -1) {
            return this.K.P(iB);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    public final void B1(View view, int i, boolean z) {
        int iX;
        int iX2;
        mq7 mq7Var = (mq7) view.getLayoutParams();
        Rect rect = mq7Var.b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) mq7Var).topMargin + ((ViewGroup.MarginLayoutParams) mq7Var).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) mq7Var).leftMargin + ((ViewGroup.MarginLayoutParams) mq7Var).rightMargin;
        int iX1 = x1(mq7Var.e, mq7Var.f);
        if (this.p == 1) {
            iX2 = vee.x(false, iX1, i, i3, ((ViewGroup.MarginLayoutParams) mq7Var).width);
            iX = vee.x(true, this.r.n(), this.m, i2, ((ViewGroup.MarginLayoutParams) mq7Var).height);
        } else {
            int iX3 = vee.x(false, iX1, i, i2, ((ViewGroup.MarginLayoutParams) mq7Var).height);
            int iX4 = vee.x(true, this.r.n(), this.l, i3, ((ViewGroup.MarginLayoutParams) mq7Var).width);
            iX = iX3;
            iX2 = iX4;
        }
        wee weeVar = (wee) view.getLayoutParams();
        if (z ? I0(view, iX2, iX, weeVar) : G0(view, iX2, iX, weeVar)) {
            view.measure(iX2, iX);
        }
    }

    public final void C1(int i) {
        if (i == this.F) {
            return;
        }
        this.E = true;
        if (i < 1) {
            ore.p(zo5.h(i, "Span count should be at least 1. Provided "));
            return;
        }
        this.F = i;
        this.K.S();
        x0();
    }

    @Override // defpackage.vee
    public final void D0(int i, int i2, Rect rect) {
        int iH;
        int iH2;
        if (this.G == null) {
            super.D0(i, i2, rect);
        }
        int iK = K() + J();
        int I = I() + L();
        if (this.p == 1) {
            int iHeight = rect.height() + I;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = i7j.a;
            iH2 = vee.h(i2, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            iH = vee.h(i, iArr[iArr.length - 1] + iK, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iK;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = i7j.a;
            iH = vee.h(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            iH2 = vee.h(i2, iArr2[iArr2.length - 1] + I, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(iH, iH2);
    }

    public final void D1() {
        int I;
        int iL;
        if (this.p == 1) {
            I = this.n - K();
            iL = J();
        } else {
            I = this.o - I();
            iL = L();
        }
        v1(I - iL);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.vee
    public final boolean L0() {
        return this.z == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void N0(hfe hfeVar, w19 w19Var, nk5 nk5Var) {
        int i;
        int iP = this.F;
        for (int i2 = 0; i2 < this.F && (i = w19Var.d) >= 0 && i < hfeVar.b() && iP > 0; i2++) {
            int i3 = w19Var.d;
            nk5Var.a(i3, Math.max(0, w19Var.g));
            iP -= this.K.P(i3);
            w19Var.d += w19Var.e;
        }
    }

    @Override // defpackage.vee
    public final int O(cfe cfeVar, hfe hfeVar) {
        if (this.p == 0) {
            return this.F;
        }
        if (hfeVar.b() < 1) {
            return 0;
        }
        return y1(hfeVar.b() - 1, cfeVar, hfeVar) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.vee
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View Z(android.view.View r23, int r24, defpackage.cfe r25, defpackage.hfe r26) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.Z(android.view.View, int, cfe, hfe):android.view.View");
    }

    @Override // defpackage.vee
    public final void b0(cfe cfeVar, hfe hfeVar, x4 x4Var) {
        super.b0(cfeVar, hfeVar, x4Var);
        x4Var.h(GridView.class.getName());
    }

    @Override // defpackage.vee
    public final void c0(cfe cfeVar, hfe hfeVar, View view, x4 x4Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof mq7)) {
            d0(view, x4Var);
            return;
        }
        mq7 mq7Var = (mq7) layoutParams;
        int iY1 = y1(mq7Var.a.m(), cfeVar, hfeVar);
        int i = this.p;
        int i2 = mq7Var.e;
        int i3 = mq7Var.f;
        if (i == 0) {
            x4Var.i(pgg.u(false, i2, i3, iY1, 1));
        } else {
            x4Var.i(pgg.u(false, iY1, 1, i2, i3));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View c1(cfe cfeVar, hfe hfeVar, boolean z, boolean z2) {
        int i;
        int iW;
        int iW2 = w();
        int i2 = 1;
        if (z2) {
            iW = w() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iW2;
            iW = 0;
        }
        int iB = hfeVar.b();
        S0();
        int iM = this.r.m();
        int i3 = this.r.i();
        View view = null;
        View view2 = null;
        while (iW != i) {
            View viewV = v(iW);
            int iM2 = vee.M(viewV);
            if (iM2 >= 0 && iM2 < iB && z1(iM2, cfeVar, hfeVar) == 0) {
                if (((wee) viewV.getLayoutParams()).a.s()) {
                    if (view2 == null) {
                        view2 = viewV;
                    }
                } else {
                    if (this.r.g(viewV) < i3 && this.r.d(viewV) >= iM) {
                        return viewV;
                    }
                    if (view == null) {
                        view = viewV;
                    }
                }
            }
            iW += i2;
        }
        return view != null ? view : view2;
    }

    @Override // defpackage.vee
    public final void e0(int i, int i2) {
        this.K.S();
        ((SparseIntArray) this.K.b).clear();
    }

    @Override // defpackage.vee
    public final void f0() {
        this.K.S();
        ((SparseIntArray) this.K.b).clear();
    }

    @Override // defpackage.vee
    public final boolean g(wee weeVar) {
        return weeVar instanceof mq7;
    }

    @Override // defpackage.vee
    public final void g0(int i, int i2) {
        this.K.S();
        ((SparseIntArray) this.K.b).clear();
    }

    @Override // defpackage.vee
    public final void h0(int i, int i2) {
        this.K.S();
        ((SparseIntArray) this.K.b).clear();
    }

    /* JADX WARN: Code duplicated, block: B:115:0x024b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v35 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void i1(cfe cfeVar, hfe hfeVar, w19 w19Var, v19 v19Var) {
        int i;
        int i2;
        int i3;
        int iJ;
        int i4;
        int iL;
        int iF;
        int iJ2;
        int iX;
        int iX2;
        ?? r8;
        int i5;
        View viewB;
        GridLayoutManager gridLayoutManager = this;
        int iL2 = gridLayoutManager.r.l();
        boolean z = iL2 != 1073741824;
        int i6 = gridLayoutManager.w() > 0 ? gridLayoutManager.G[gridLayoutManager.F] : 0;
        if (z) {
            gridLayoutManager.D1();
        }
        boolean z2 = w19Var.e == 1;
        int iZ1 = gridLayoutManager.F;
        if (!z2) {
            iZ1 = gridLayoutManager.z1(w19Var.d, cfeVar, hfeVar) + gridLayoutManager.A1(w19Var.d, cfeVar, hfeVar);
        }
        int i7 = 0;
        while (i7 < gridLayoutManager.F && (i5 = w19Var.d) >= 0 && i5 < hfeVar.b() && iZ1 > 0) {
            int i8 = w19Var.d;
            int iA1 = gridLayoutManager.A1(i8, cfeVar, hfeVar);
            if (iA1 > gridLayoutManager.F) {
                ore.p(zo5.t(qv1.p("Item at position ", i8, " requires ", iA1, " spans but GridLayoutManager has only "), gridLayoutManager.F, " spans."));
                return;
            }
            iZ1 -= iA1;
            if (iZ1 < 0 || (viewB = w19Var.b(cfeVar)) == null) {
                break;
            }
            gridLayoutManager.H[i7] = viewB;
            i7++;
        }
        if (i7 == 0) {
            v19Var.b = true;
            return;
        }
        if (z2) {
            i3 = 1;
            i2 = i7;
            i = 0;
        } else {
            i = i7 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i9 = 0;
        while (i != i2) {
            View view = gridLayoutManager.H[i];
            mq7 mq7Var = (mq7) view.getLayoutParams();
            int iA2 = gridLayoutManager.A1(vee.M(view), cfeVar, hfeVar);
            mq7Var.f = iA2;
            mq7Var.e = i9;
            i9 += iA2;
            i += i3;
        }
        float f = 0.0f;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            View view2 = gridLayoutManager.H[i11];
            if (w19Var.k != null) {
                r8 = 0;
                r8 = 0;
                if (z2) {
                    gridLayoutManager.c(view2, -1, true);
                } else {
                    gridLayoutManager.c(view2, 0, true);
                }
            } else if (z2) {
                gridLayoutManager.b(view2);
                r8 = 0;
            } else {
                r8 = 0;
                gridLayoutManager.c(view2, 0, false);
            }
            RecyclerView recyclerView = gridLayoutManager.b;
            Rect rect = gridLayoutManager.L;
            if (recyclerView == null) {
                rect.set(r8, r8, r8, r8);
            } else {
                rect.set(recyclerView.V(view2));
            }
            gridLayoutManager.B1(view2, iL2, r8);
            int iE = gridLayoutManager.r.e(view2);
            if (iE > i10) {
                i10 = iE;
            }
            float f2 = (gridLayoutManager.r.f(view2) * 1.0f) / ((mq7) view2.getLayoutParams()).f;
            if (f2 > f) {
                f = f2;
            }
        }
        if (z) {
            gridLayoutManager.v1(Math.max(Math.round(f * gridLayoutManager.F), i6));
            i10 = 0;
            for (int i12 = 0; i12 < i7; i12++) {
                View view3 = gridLayoutManager.H[i12];
                gridLayoutManager.B1(view3, 1073741824, true);
                int iE2 = gridLayoutManager.r.e(view3);
                if (iE2 > i10) {
                    i10 = iE2;
                }
            }
        }
        for (int i13 = 0; i13 < i7; i13++) {
            View view4 = gridLayoutManager.H[i13];
            if (gridLayoutManager.r.e(view4) != i10) {
                mq7 mq7Var2 = (mq7) view4.getLayoutParams();
                Rect rect2 = mq7Var2.b;
                int i14 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) mq7Var2).topMargin + ((ViewGroup.MarginLayoutParams) mq7Var2).bottomMargin;
                int i15 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) mq7Var2).leftMargin + ((ViewGroup.MarginLayoutParams) mq7Var2).rightMargin;
                int iX1 = gridLayoutManager.x1(mq7Var2.e, mq7Var2.f);
                if (gridLayoutManager.p == 1) {
                    iX2 = vee.x(false, iX1, 1073741824, i15, ((ViewGroup.MarginLayoutParams) mq7Var2).width);
                    iX = View.MeasureSpec.makeMeasureSpec(i10 - i14, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - i15, 1073741824);
                    iX = vee.x(false, iX1, 1073741824, i14, ((ViewGroup.MarginLayoutParams) mq7Var2).height);
                    iX2 = iMakeMeasureSpec;
                }
                if (gridLayoutManager.I0(view4, iX2, iX, (wee) view4.getLayoutParams())) {
                    view4.measure(iX2, iX);
                }
            }
        }
        int i16 = 0;
        v19Var.a = i10;
        int i17 = gridLayoutManager.p;
        int i18 = w19Var.f;
        int iF2 = w19Var.b;
        if (i17 != 1) {
            if (i18 == -1) {
                i4 = iF2 - i10;
                iJ = iF2;
            } else {
                iJ = iF2 + i10;
                i4 = iF2;
            }
            iL = 0;
            iF2 = 0;
        } else if (i18 == -1) {
            iL = iF2 - i10;
            i4 = 0;
            iJ = 0;
        } else {
            iL = iF2;
            iJ = 0;
            iF2 += i10;
            i4 = 0;
        }
        while (true) {
            View[] viewArr = gridLayoutManager.H;
            if (i16 >= i7) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            int iF3 = i4;
            View view5 = viewArr[i16];
            mq7 mq7Var3 = (mq7) view5.getLayoutParams();
            if (gridLayoutManager.p == 1) {
                if (gridLayoutManager.h1()) {
                    iJ = gridLayoutManager.J() + gridLayoutManager.G[gridLayoutManager.F - mq7Var3.e];
                    iF3 = iJ - gridLayoutManager.r.f(view5);
                } else {
                    iJ2 = gridLayoutManager.J() + gridLayoutManager.G[mq7Var3.e];
                    iF = gridLayoutManager.r.f(view5) + iJ2;
                }
                int i19 = iF2;
                gridLayoutManager.S(view5, iJ2, iL, iF, i19);
                i4 = iJ2;
                iJ = iF;
                iF2 = i19;
                if (mq7Var3.a.s() || mq7Var3.a.v()) {
                    v19Var.c = true;
                }
                v19Var.d = view5.hasFocusable() | v19Var.d;
                i16++;
                gridLayoutManager = this;
            } else {
                iL = gridLayoutManager.L() + gridLayoutManager.G[mq7Var3.e];
                iF2 = gridLayoutManager.r.f(view5) + iL;
            }
            iF = iJ;
            iJ2 = iF3;
            int i110 = iF2;
            gridLayoutManager.S(view5, iJ2, iL, iF, i110);
            i4 = iJ2;
            iJ = iF;
            iF2 = i110;
            if (mq7Var3.a.s()) {
                v19Var.c = true;
            } else {
                v19Var.c = true;
            }
            v19Var.d = view5.hasFocusable() | v19Var.d;
            i16++;
            gridLayoutManager = this;
        }
    }

    @Override // defpackage.vee
    public final void j0(RecyclerView recyclerView, int i, int i2) {
        this.K.S();
        ((SparseIntArray) this.K.b).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void j1(cfe cfeVar, hfe hfeVar, hg6 hg6Var, int i) {
        D1();
        if (hfeVar.b() > 0 && !hfeVar.h) {
            boolean z = i == 1;
            int iZ1 = z1(hg6Var.b, cfeVar, hfeVar);
            if (z) {
                while (iZ1 > 0) {
                    int i2 = hg6Var.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    hg6Var.b = i3;
                    iZ1 = z1(i3, cfeVar, hfeVar);
                }
            } else {
                int iB = hfeVar.b() - 1;
                int i4 = hg6Var.b;
                while (i4 < iB) {
                    int i5 = i4 + 1;
                    int iZ2 = z1(i5, cfeVar, hfeVar);
                    if (iZ2 <= iZ1) {
                        break;
                    }
                    i4 = i5;
                    iZ1 = iZ2;
                }
                hg6Var.b = i4;
            }
        }
        w1();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.vee
    public final void k0(cfe cfeVar, hfe hfeVar) {
        boolean z = hfeVar.h;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z) {
            int iW = w();
            for (int i = 0; i < iW; i++) {
                mq7 mq7Var = (mq7) v(i).getLayoutParams();
                int iM = mq7Var.a.m();
                sparseIntArray2.put(iM, mq7Var.f);
                sparseIntArray.put(iM, mq7Var.e);
            }
        }
        super.k0(cfeVar, hfeVar);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.vee
    public final int l(hfe hfeVar) {
        return P0(hfeVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.vee
    public final void l0(hfe hfeVar) {
        super.l0(hfeVar);
        this.E = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.vee
    public final int m(hfe hfeVar) {
        return Q0(hfeVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.vee
    public final int o(hfe hfeVar) {
        return P0(hfeVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.vee
    public final int p(hfe hfeVar) {
        return Q0(hfeVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void r1(boolean z) {
        if (z) {
            c.i("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.r1(false);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.vee
    public final wee s() {
        return this.p == 0 ? new mq7(-2, -1) : new mq7(-1, -2);
    }

    @Override // defpackage.vee
    public final wee t(Context context, AttributeSet attributeSet) {
        mq7 mq7Var = new mq7(context, attributeSet);
        mq7Var.e = -1;
        mq7Var.f = 0;
        return mq7Var;
    }

    @Override // defpackage.vee
    public final wee u(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            mq7 mq7Var = new mq7((ViewGroup.MarginLayoutParams) layoutParams);
            mq7Var.e = -1;
            mq7Var.f = 0;
            return mq7Var;
        }
        mq7 mq7Var2 = new mq7(layoutParams);
        mq7Var2.e = -1;
        mq7Var2.f = 0;
        return mq7Var2;
    }

    public final void v1(int i) {
        int i2;
        int[] iArr = this.G;
        int i3 = this.F;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.G = iArr;
    }

    public final void w1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    public final int x1(int i, int i2) {
        if (this.p != 1 || !h1()) {
            int[] iArr = this.G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.G;
        int i3 = this.F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // defpackage.vee
    public final int y(cfe cfeVar, hfe hfeVar) {
        if (this.p == 1) {
            return this.F;
        }
        if (hfeVar.b() < 1) {
            return 0;
        }
        return y1(hfeVar.b() - 1, cfeVar, hfeVar) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.vee
    public final int y0(int i, cfe cfeVar, hfe hfeVar) {
        D1();
        w1();
        return super.y0(i, cfeVar, hfeVar);
    }

    public final int y1(int i, cfe cfeVar, hfe hfeVar) {
        if (!hfeVar.h) {
            return this.K.N(i, this.F);
        }
        int iB = cfeVar.b(i);
        if (iB != -1) {
            return this.K.N(iB, this.F);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int z1(int i, cfe cfeVar, hfe hfeVar) {
        if (!hfeVar.h) {
            return this.K.O(i, this.F);
        }
        int i2 = this.J.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iB = cfeVar.b(i);
        if (iB != -1) {
            return this.K.O(iB, this.F);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public GridLayoutManager(int i) {
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new lq7(5);
        this.L = new Rect();
        C1(i);
    }
}
