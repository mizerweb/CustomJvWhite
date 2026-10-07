package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.a29;
import defpackage.cfe;
import defpackage.gfe;
import defpackage.hfe;
import defpackage.hg6;
import defpackage.lfe;
import defpackage.nk5;
import defpackage.ore;
import defpackage.pic;
import defpackage.uee;
import defpackage.v19;
import defpackage.vd7;
import defpackage.vee;
import defpackage.w19;
import defpackage.wee;
import defpackage.x19;
import defpackage.zo5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends vee implements gfe {
    public final hg6 A;
    public final v19 B;
    public int C;
    public final int[] D;
    public int p;
    public w19 q;
    public pic r;
    public boolean s;
    public final boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public int x;
    public int y;
    public x19 z;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new hg6();
        this.B = new v19();
        this.C = 2;
        this.D = new int[2];
        uee ueeVarN = vee.N(context, attributeSet, i, i2);
        q1(ueeVarN.a);
        boolean z = ueeVarN.c;
        d(null);
        if (z != this.t) {
            this.t = z;
            x0();
        }
        r1(ueeVarN.d);
    }

    @Override // defpackage.vee
    public int A0(int i, cfe cfeVar, hfe hfeVar) {
        if (this.p == 0) {
            return 0;
        }
        return o1(i, cfeVar, hfeVar);
    }

    @Override // defpackage.vee
    public final boolean H0() {
        if (this.m != 1073741824 && this.l != 1073741824) {
            int iW = w();
            for (int i = 0; i < iW; i++) {
                ViewGroup.LayoutParams layoutParams = v(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.vee
    public void J0(RecyclerView recyclerView, int i) {
        a29 a29Var = new a29(recyclerView.getContext());
        a29Var.q(i);
        K0(a29Var);
    }

    @Override // defpackage.vee
    public boolean L0() {
        return this.z == null && this.s == this.v;
    }

    public void M0(hfe hfeVar, int[] iArr) {
        int i;
        int iN = hfeVar.a != -1 ? this.r.n() : 0;
        if (this.q.f == -1) {
            i = 0;
        } else {
            i = iN;
            iN = 0;
        }
        iArr[0] = iN;
        iArr[1] = i;
    }

    public void N0(hfe hfeVar, w19 w19Var, nk5 nk5Var) {
        int i = w19Var.d;
        if (i < 0 || i >= hfeVar.b()) {
            return;
        }
        nk5Var.a(i, Math.max(0, w19Var.g));
    }

    public final int O0(hfe hfeVar) {
        if (w() == 0) {
            return 0;
        }
        S0();
        pic picVar = this.r;
        boolean z = !this.w;
        return vd7.j(hfeVar, picVar, W0(z), V0(z), this, this.w);
    }

    public final int P0(hfe hfeVar) {
        if (w() == 0) {
            return 0;
        }
        S0();
        pic picVar = this.r;
        boolean z = !this.w;
        return vd7.k(hfeVar, picVar, W0(z), V0(z), this, this.w, this.u);
    }

    @Override // defpackage.vee
    public final boolean Q() {
        return true;
    }

    public final int Q0(hfe hfeVar) {
        if (w() == 0) {
            return 0;
        }
        S0();
        pic picVar = this.r;
        boolean z = !this.w;
        return vd7.l(hfeVar, picVar, W0(z), V0(z), this, this.w);
    }

    public final int R0(int i) {
        if (i == 1) {
            return (this.p != 1 && h1()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.p != 1 && h1()) ? -1 : 1;
        }
        if (i == 17) {
            return this.p == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.p == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && this.p == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.p == 0 ? 1 : Integer.MIN_VALUE;
    }

    public final void S0() {
        if (this.q == null) {
            w19 w19Var = new w19();
            w19Var.a = true;
            w19Var.h = 0;
            w19Var.i = 0;
            w19Var.k = null;
            this.q = w19Var;
        }
    }

    public final int T0(cfe cfeVar, w19 w19Var, hfe hfeVar, boolean z) {
        int i;
        int i2 = w19Var.c;
        int i3 = w19Var.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                w19Var.g = i3 + i2;
            }
            l1(cfeVar, w19Var);
        }
        int i4 = w19Var.c + w19Var.h;
        while (true) {
            if ((!w19Var.l && i4 <= 0) || (i = w19Var.d) < 0 || i >= hfeVar.b()) {
                break;
            }
            v19 v19Var = this.B;
            v19Var.a = 0;
            v19Var.b = false;
            v19Var.c = false;
            v19Var.d = false;
            i1(cfeVar, hfeVar, w19Var, v19Var);
            if (!v19Var.b) {
                int i5 = w19Var.b;
                int i6 = v19Var.a;
                w19Var.b = (w19Var.f * i6) + i5;
                if (!v19Var.c || w19Var.k != null || !hfeVar.h) {
                    w19Var.c -= i6;
                    i4 -= i6;
                }
                int i7 = w19Var.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    w19Var.g = i8;
                    int i9 = w19Var.c;
                    if (i9 < 0) {
                        w19Var.g = i8 + i9;
                    }
                    l1(cfeVar, w19Var);
                }
                if (z && v19Var.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - w19Var.c;
    }

    public final int U0() {
        View viewB1 = b1(0, w(), true, false);
        if (viewB1 == null) {
            return -1;
        }
        return vee.M(viewB1);
    }

    public final View V0(boolean z) {
        return this.u ? b1(0, w(), z, true) : b1(w() - 1, -1, z, true);
    }

    public final View W0(boolean z) {
        return this.u ? b1(w() - 1, -1, z, true) : b1(0, w(), z, true);
    }

    public final int X0() {
        View viewB1 = b1(0, w(), false, true);
        if (viewB1 == null) {
            return -1;
        }
        return vee.M(viewB1);
    }

    @Override // defpackage.vee
    public void Y(RecyclerView recyclerView) {
    }

    public final int Y0() {
        View viewB1 = b1(w() - 1, -1, true, false);
        if (viewB1 == null) {
            return -1;
        }
        return vee.M(viewB1);
    }

    @Override // defpackage.vee
    public View Z(View view, int i, cfe cfeVar, hfe hfeVar) {
        int iR0;
        View viewA1;
        n1();
        if (w() != 0 && (iR0 = R0(i)) != Integer.MIN_VALUE) {
            S0();
            s1(iR0, (int) (this.r.n() * 0.33333334f), false, hfeVar);
            w19 w19Var = this.q;
            w19Var.g = Integer.MIN_VALUE;
            w19Var.a = false;
            T0(cfeVar, w19Var, hfeVar, true);
            boolean z = this.u;
            if (iR0 == -1) {
                viewA1 = z ? a1(w() - 1, -1) : a1(0, w());
            } else {
                viewA1 = z ? a1(0, w()) : a1(w() - 1, -1);
            }
            View viewG1 = iR0 == -1 ? g1() : f1();
            if (!viewG1.hasFocusable()) {
                return viewA1;
            }
            if (viewA1 != null) {
                return viewG1;
            }
        }
        return null;
    }

    public final int Z0() {
        View viewB1 = b1(w() - 1, -1, false, true);
        if (viewB1 == null) {
            return -1;
        }
        return vee.M(viewB1);
    }

    @Override // defpackage.gfe
    public final PointF a(int i) {
        if (w() == 0) {
            return null;
        }
        int i2 = (i < vee.M(v(0))) != this.u ? -1 : 1;
        return this.p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // defpackage.vee
    public final void a0(AccessibilityEvent accessibilityEvent) {
        super.a0(accessibilityEvent);
        if (w() > 0) {
            accessibilityEvent.setFromIndex(X0());
            accessibilityEvent.setToIndex(Z0());
        }
    }

    public final View a1(int i, int i2) {
        int i3;
        int i4;
        S0();
        if (i2 <= i && i2 >= i) {
            return v(i);
        }
        if (this.r.g(v(i)) < this.r.m()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.p == 0 ? this.c.i(i, i2, i3, i4) : this.d.i(i, i2, i3, i4);
    }

    public final View b1(int i, int i2, boolean z, boolean z2) {
        S0();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        return this.p == 0 ? this.c.i(i, i2, i3, i4) : this.d.i(i, i2, i3, i4);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    public View c1(cfe cfeVar, hfe hfeVar, boolean z, boolean z2) {
        int i;
        int iW;
        int i2;
        S0();
        int iW2 = w();
        if (z2) {
            iW = w() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iW2;
            iW = 0;
            i2 = 1;
        }
        int iB = hfeVar.b();
        int iM = this.r.m();
        int i3 = this.r.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iW != i) {
            View viewV = v(iW);
            int iM2 = vee.M(viewV);
            int iG = this.r.g(viewV);
            int iD = this.r.d(viewV);
            if (iM2 >= 0 && iM2 < iB) {
                if (!((wee) viewV.getLayoutParams()).a.s()) {
                    boolean z3 = iD <= iM && iG < iM;
                    boolean z4 = iG >= i3 && iD > i3;
                    if (!z3 && !z4) {
                        return viewV;
                    }
                    if (z) {
                        if (z4) {
                            view2 = viewV;
                        } else if (view == null) {
                            view = viewV;
                        }
                    } else if (z3) {
                        view2 = viewV;
                    } else if (view == null) {
                        view = viewV;
                    }
                } else if (view3 == null) {
                    view3 = viewV;
                }
            }
            iW += i2;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    @Override // defpackage.vee
    public final void d(String str) {
        if (this.z == null) {
            super.d(str);
        }
    }

    public final int d1(int i, cfe cfeVar, hfe hfeVar, boolean z) {
        int i2;
        int i3 = this.r.i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -o1(-i3, cfeVar, hfeVar);
        int i5 = i + i4;
        if (!z || (i2 = this.r.i() - i5) <= 0) {
            return i4;
        }
        this.r.q(i2);
        return i2 + i4;
    }

    @Override // defpackage.vee
    /* JADX INFO: renamed from: e */
    public boolean getE() {
        return this.p == 0;
    }

    public final int e1(int i, cfe cfeVar, hfe hfeVar, boolean z) {
        int iM;
        int iM2 = i - this.r.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i2 = -o1(iM2, cfeVar, hfeVar);
        int i3 = i + i2;
        if (!z || (iM = i3 - this.r.m()) <= 0) {
            return i2;
        }
        this.r.q(-iM);
        return i2 - iM;
    }

    @Override // defpackage.vee
    public final boolean f() {
        return this.p == 1;
    }

    public final View f1() {
        return v(this.u ? 0 : w() - 1);
    }

    public final View g1() {
        return v(this.u ? w() - 1 : 0);
    }

    public final boolean h1() {
        return H() == 1;
    }

    @Override // defpackage.vee
    public final void i(int i, int i2, hfe hfeVar, nk5 nk5Var) {
        if (this.p != 0) {
            i = i2;
        }
        if (w() == 0 || i == 0) {
            return;
        }
        S0();
        s1(i > 0 ? 1 : -1, Math.abs(i), true, hfeVar);
        N0(hfeVar, this.q, nk5Var);
    }

    public void i1(cfe cfeVar, hfe hfeVar, w19 w19Var, v19 v19Var) {
        int iF;
        int i;
        int iJ;
        int i2;
        int iF2;
        View viewB = w19Var.b(cfeVar);
        if (viewB == null) {
            v19Var.b = true;
            return;
        }
        wee weeVar = (wee) viewB.getLayoutParams();
        List list = w19Var.k;
        boolean z = this.u;
        int i3 = w19Var.f;
        if (list == null) {
            if (z == (i3 == -1)) {
                b(viewB);
            } else {
                c(viewB, 0, false);
            }
        } else {
            if (z == (i3 == -1)) {
                c(viewB, -1, true);
            } else {
                c(viewB, 0, true);
            }
        }
        T(viewB, 0, 0);
        v19Var.a = this.r.e(viewB);
        if (this.p == 1) {
            if (h1()) {
                iF2 = this.n - K();
                iJ = iF2 - this.r.f(viewB);
            } else {
                iJ = J();
                iF2 = this.r.f(viewB) + iJ;
            }
            int i4 = w19Var.f;
            int i5 = w19Var.b;
            int i6 = v19Var.a;
            if (i4 == -1) {
                i2 = i5 - i6;
                iF = i5;
            } else {
                iF = i6 + i5;
                i2 = i5;
            }
            i = iF2;
        } else {
            int iL = L();
            iF = this.r.f(viewB) + iL;
            int i7 = w19Var.f;
            int i8 = w19Var.b;
            int i9 = v19Var.a;
            if (i7 == -1) {
                i = i8;
                iJ = i8 - i9;
            } else {
                i = i8 + i9;
                iJ = i8;
            }
            i2 = iL;
        }
        S(viewB, iJ, i2, i, iF);
        if (weeVar.a.s() || weeVar.a.v()) {
            v19Var.c = true;
        }
        v19Var.d = viewB.hasFocusable();
    }

    @Override // defpackage.vee
    public final void j(int i, nk5 nk5Var) {
        boolean z;
        int i2;
        x19 x19Var = this.z;
        if (x19Var == null || !x19Var.a()) {
            n1();
            z = this.u;
            i2 = this.x;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            x19 x19Var2 = this.z;
            z = x19Var2.c;
            i2 = x19Var2.a;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.C && i2 >= 0 && i2 < i; i4++) {
            nk5Var.a(i2, 0);
            i2 += i3;
        }
    }

    public void j1(cfe cfeVar, hfe hfeVar, hg6 hg6Var, int i) {
    }

    @Override // defpackage.vee
    public final int k(hfe hfeVar) {
        return O0(hfeVar);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01af  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:111:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:114:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:120:0x0205  */
    /* JADX WARN: Code duplicated, block: B:121:0x0207  */
    /* JADX WARN: Code duplicated, block: B:123:0x0212  */
    /* JADX WARN: Code duplicated, block: B:126:0x021e  */
    /* JADX WARN: Code duplicated, block: B:130:0x023e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x0242  */
    /* JADX WARN: Code duplicated, block: B:134:0x0245 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:136:0x0249  */
    /* JADX WARN: Code duplicated, block: B:138:0x024c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x024e  */
    /* JADX WARN: Code duplicated, block: B:141:0x0252  */
    /* JADX WARN: Code duplicated, block: B:143:0x0256  */
    /* JADX WARN: Code duplicated, block: B:145:0x025d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0263  */
    /* JADX WARN: Code duplicated, block: B:95:0x0198  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // defpackage.vee
    public void k0(cfe cfeVar, hfe hfeVar) {
        View focusedChild;
        int iB;
        RecyclerView recyclerView;
        View focusedChild2;
        boolean z;
        boolean z2;
        View viewC1;
        boolean z3;
        pic picVar;
        int iG;
        int iD;
        int iM;
        int i;
        boolean z4;
        boolean z5;
        pic picVar2;
        int iN;
        wee weeVar;
        int i2;
        int iG2;
        int i3;
        int i4;
        ?? r4;
        List list;
        int i5;
        int i6;
        int iD1;
        int i7;
        View viewR;
        int iG3;
        int i8;
        int i9 = -1;
        if (!(this.z == null && this.x == -1) && hfeVar.b() == 0) {
            r0(cfeVar);
            return;
        }
        x19 x19Var = this.z;
        if (x19Var != null && x19Var.a()) {
            this.x = this.z.a;
        }
        S0();
        boolean z6 = false;
        this.q.a = false;
        n1();
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 == null || (focusedChild = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.a.e).contains(focusedChild)) {
            focusedChild = null;
        }
        hg6 hg6Var = this.A;
        if (!hg6Var.e || this.x != -1 || this.z != null) {
            hg6Var.d();
            hg6Var.d = this.u ^ this.v;
            if (hfeVar.h || (i2 = this.x) == -1) {
                if (w() != 0) {
                    recyclerView = this.b;
                    if (recyclerView != null || (focusedChild2 = recyclerView.getFocusedChild()) == null || ((ArrayList) this.a.e).contains(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        weeVar = (wee) focusedChild2.getLayoutParams();
                        if (!weeVar.a.s() || weeVar.a.m() < 0 || weeVar.a.m() >= hfeVar.b()) {
                            z = this.s;
                            z2 = this.v;
                            if (z == z2 || (viewC1 = c1(cfeVar, hfeVar, hg6Var.d, z2)) == null) {
                                hg6Var.a();
                                if (this.v) {
                                    iB = hfeVar.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                hg6Var.b = iB;
                            } else {
                                int iM2 = vee.M(viewC1);
                                z3 = hg6Var.d;
                                picVar = (pic) hg6Var.f;
                                if (z3) {
                                    int iD2 = picVar.d(viewC1);
                                    picVar2 = (pic) hg6Var.f;
                                    if (Integer.MIN_VALUE == picVar2.a) {
                                        iN = 0;
                                    } else {
                                        iN = picVar2.n() - picVar2.a;
                                    }
                                    hg6Var.c = iN + iD2;
                                } else {
                                    hg6Var.c = picVar.g(viewC1);
                                }
                                hg6Var.b = iM2;
                                if (!hfeVar.h && L0()) {
                                    iG = this.r.g(viewC1);
                                    iD = this.r.d(viewC1);
                                    iM = this.r.m();
                                    i = this.r.i();
                                    if (iD <= iM || iG >= iM) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    if (iG >= i || iD <= i) {
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    if (z4 || z5) {
                                        if (hg6Var.d) {
                                            iM = i;
                                        }
                                        hg6Var.c = iM;
                                    }
                                }
                            }
                        } else {
                            hg6Var.b(focusedChild2, vee.M(focusedChild2));
                        }
                    } else {
                        z = this.s;
                        z2 = this.v;
                        if (z == z2) {
                            hg6Var.a();
                            if (this.v) {
                                iB = hfeVar.b() - 1;
                            } else {
                                iB = 0;
                            }
                            hg6Var.b = iB;
                        } else {
                            int iM3 = vee.M(viewC1);
                            z3 = hg6Var.d;
                            picVar = (pic) hg6Var.f;
                            if (z3) {
                                int iD3 = picVar.d(viewC1);
                                picVar2 = (pic) hg6Var.f;
                                if (Integer.MIN_VALUE == picVar2.a) {
                                    iN = 0;
                                } else {
                                    iN = picVar2.n() - picVar2.a;
                                }
                                hg6Var.c = iN + iD3;
                            } else {
                                hg6Var.c = picVar.g(viewC1);
                            }
                            hg6Var.b = iM3;
                            if (!hfeVar.h) {
                                iG = this.r.g(viewC1);
                                iD = this.r.d(viewC1);
                                iM = this.r.m();
                                i = this.r.i();
                                if (iD <= iM) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (iG >= i) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (hg6Var.d) {
                                        iM = i;
                                    }
                                    hg6Var.c = iM;
                                } else {
                                    if (hg6Var.d) {
                                        iM = i;
                                    }
                                    hg6Var.c = iM;
                                }
                            }
                        }
                    }
                } else {
                    hg6Var.a();
                    if (this.v) {
                        iB = hfeVar.b() - 1;
                    } else {
                        iB = 0;
                    }
                    hg6Var.b = iB;
                }
            } else if (i2 < 0 || i2 >= hfeVar.b()) {
                this.x = -1;
                this.y = Integer.MIN_VALUE;
                if (w() != 0) {
                    recyclerView = this.b;
                    if (recyclerView != null) {
                        focusedChild2 = null;
                    } else {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        weeVar = (wee) focusedChild2.getLayoutParams();
                        if (weeVar.a.s()) {
                            z = this.s;
                            z2 = this.v;
                            if (z == z2) {
                                hg6Var.a();
                                if (this.v) {
                                    iB = hfeVar.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                hg6Var.b = iB;
                            } else {
                                int iM4 = vee.M(viewC1);
                                z3 = hg6Var.d;
                                picVar = (pic) hg6Var.f;
                                if (z3) {
                                    int iD4 = picVar.d(viewC1);
                                    picVar2 = (pic) hg6Var.f;
                                    if (Integer.MIN_VALUE == picVar2.a) {
                                        iN = 0;
                                    } else {
                                        iN = picVar2.n() - picVar2.a;
                                    }
                                    hg6Var.c = iN + iD4;
                                } else {
                                    hg6Var.c = picVar.g(viewC1);
                                }
                                hg6Var.b = iM4;
                                if (!hfeVar.h) {
                                    iG = this.r.g(viewC1);
                                    iD = this.r.d(viewC1);
                                    iM = this.r.m();
                                    i = this.r.i();
                                    if (iD <= iM) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (iG >= i) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z4) {
                                        if (hg6Var.d) {
                                            iM = i;
                                        }
                                        hg6Var.c = iM;
                                    } else {
                                        if (hg6Var.d) {
                                            iM = i;
                                        }
                                        hg6Var.c = iM;
                                    }
                                }
                            }
                        } else {
                            z = this.s;
                            z2 = this.v;
                            if (z == z2) {
                                hg6Var.a();
                                if (this.v) {
                                    iB = hfeVar.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                hg6Var.b = iB;
                            } else {
                                int iM5 = vee.M(viewC1);
                                z3 = hg6Var.d;
                                picVar = (pic) hg6Var.f;
                                if (z3) {
                                    int iD5 = picVar.d(viewC1);
                                    picVar2 = (pic) hg6Var.f;
                                    if (Integer.MIN_VALUE == picVar2.a) {
                                        iN = 0;
                                    } else {
                                        iN = picVar2.n() - picVar2.a;
                                    }
                                    hg6Var.c = iN + iD5;
                                } else {
                                    hg6Var.c = picVar.g(viewC1);
                                }
                                hg6Var.b = iM5;
                                if (!hfeVar.h) {
                                    iG = this.r.g(viewC1);
                                    iD = this.r.d(viewC1);
                                    iM = this.r.m();
                                    i = this.r.i();
                                    if (iD <= iM) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (iG >= i) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z4) {
                                        if (hg6Var.d) {
                                            iM = i;
                                        }
                                        hg6Var.c = iM;
                                    } else {
                                        if (hg6Var.d) {
                                            iM = i;
                                        }
                                        hg6Var.c = iM;
                                    }
                                }
                            }
                        }
                    } else {
                        z = this.s;
                        z2 = this.v;
                        if (z == z2) {
                            hg6Var.a();
                            if (this.v) {
                                iB = hfeVar.b() - 1;
                            } else {
                                iB = 0;
                            }
                            hg6Var.b = iB;
                        } else {
                            int iM6 = vee.M(viewC1);
                            z3 = hg6Var.d;
                            picVar = (pic) hg6Var.f;
                            if (z3) {
                                int iD6 = picVar.d(viewC1);
                                picVar2 = (pic) hg6Var.f;
                                if (Integer.MIN_VALUE == picVar2.a) {
                                    iN = 0;
                                } else {
                                    iN = picVar2.n() - picVar2.a;
                                }
                                hg6Var.c = iN + iD6;
                            } else {
                                hg6Var.c = picVar.g(viewC1);
                            }
                            hg6Var.b = iM6;
                            if (!hfeVar.h) {
                                iG = this.r.g(viewC1);
                                iD = this.r.d(viewC1);
                                iM = this.r.m();
                                i = this.r.i();
                                if (iD <= iM) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (iG >= i) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (hg6Var.d) {
                                        iM = i;
                                    }
                                    hg6Var.c = iM;
                                } else {
                                    if (hg6Var.d) {
                                        iM = i;
                                    }
                                    hg6Var.c = iM;
                                }
                            }
                        }
                    }
                } else {
                    hg6Var.a();
                    if (this.v) {
                        iB = hfeVar.b() - 1;
                    } else {
                        iB = 0;
                    }
                    hg6Var.b = iB;
                }
            } else {
                hg6Var.b = this.x;
                x19 x19Var2 = this.z;
                if (x19Var2 != null && x19Var2.a()) {
                    boolean z7 = this.z.c;
                    hg6Var.d = z7;
                    pic picVar3 = this.r;
                    if (z7) {
                        hg6Var.c = picVar3.i() - this.z.b;
                    } else {
                        hg6Var.c = picVar3.m() + this.z.b;
                    }
                } else if (this.y == Integer.MIN_VALUE) {
                    View viewR2 = r(this.x);
                    if (viewR2 == null) {
                        if (w() > 0) {
                            hg6Var.d = (this.x < vee.M(v(0))) == this.u;
                        }
                        hg6Var.a();
                    } else if (this.r.e(viewR2) > this.r.n()) {
                        hg6Var.a();
                    } else {
                        int iG4 = this.r.g(viewR2) - this.r.m();
                        pic picVar4 = this.r;
                        if (iG4 < 0) {
                            hg6Var.c = picVar4.m();
                            hg6Var.d = false;
                        } else if (picVar4.i() - this.r.d(viewR2) < 0) {
                            hg6Var.c = this.r.i();
                            hg6Var.d = true;
                        } else {
                            boolean z8 = hg6Var.d;
                            pic picVar5 = this.r;
                            if (z8) {
                                int iD7 = picVar5.d(viewR2);
                                pic picVar6 = this.r;
                                iG2 = (Integer.MIN_VALUE == picVar6.a ? 0 : picVar6.n() - picVar6.a) + iD7;
                            } else {
                                iG2 = picVar5.g(viewR2);
                            }
                            hg6Var.c = iG2;
                        }
                    }
                } else {
                    boolean z9 = this.u;
                    hg6Var.d = z9;
                    pic picVar7 = this.r;
                    if (z9) {
                        hg6Var.c = picVar7.i() - this.y;
                    } else {
                        hg6Var.c = picVar7.m() + this.y;
                    }
                }
            }
            hg6Var.e = true;
        } else if (focusedChild != null && (this.r.g(focusedChild) >= this.r.i() || this.r.d(focusedChild) <= this.r.m())) {
            hg6Var.b(focusedChild, vee.M(focusedChild));
        }
        w19 w19Var = this.q;
        w19Var.f = w19Var.j >= 0 ? 1 : -1;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        M0(hfeVar, iArr);
        int iM7 = this.r.m() + Math.max(0, iArr[0]);
        int iJ = this.r.j() + Math.max(0, iArr[1]);
        if (hfeVar.h && (i7 = this.x) != -1 && this.y != Integer.MIN_VALUE && (viewR = r(i7)) != null) {
            boolean z10 = this.u;
            pic picVar8 = this.r;
            if (z10) {
                i8 = picVar8.i() - this.r.d(viewR);
                iG3 = this.y;
            } else {
                iG3 = picVar8.g(viewR) - this.r.m();
                i8 = this.y;
            }
            int i10 = i8 - iG3;
            if (i10 > 0) {
                iM7 += i10;
            } else {
                iJ -= i10;
            }
        }
        boolean z11 = hg6Var.d;
        boolean z12 = this.u;
        if (!z11 ? !z12 : z12) {
            i9 = 1;
        }
        j1(cfeVar, hfeVar, hg6Var, i9);
        q(cfeVar);
        this.q.l = this.r.k() == 0 && this.r.h() == 0;
        this.q.getClass();
        this.q.i = 0;
        boolean z13 = hg6Var.d;
        int i11 = hg6Var.b;
        if (z13) {
            u1(i11, hg6Var.c);
            w19 w19Var2 = this.q;
            w19Var2.h = iM7;
            T0(cfeVar, w19Var2, hfeVar, false);
            w19 w19Var3 = this.q;
            i4 = w19Var3.b;
            int i12 = w19Var3.d;
            int i13 = w19Var3.c;
            if (i13 > 0) {
                iJ += i13;
            }
            t1(hg6Var.b, hg6Var.c);
            w19 w19Var4 = this.q;
            w19Var4.h = iJ;
            w19Var4.d += w19Var4.e;
            T0(cfeVar, w19Var4, hfeVar, false);
            w19 w19Var5 = this.q;
            i3 = w19Var5.b;
            int i14 = w19Var5.c;
            if (i14 > 0) {
                u1(i12, i4);
                w19 w19Var6 = this.q;
                w19Var6.h = i14;
                T0(cfeVar, w19Var6, hfeVar, false);
                i4 = this.q.b;
            }
        } else {
            t1(i11, hg6Var.c);
            w19 w19Var7 = this.q;
            w19Var7.h = iJ;
            T0(cfeVar, w19Var7, hfeVar, false);
            w19 w19Var8 = this.q;
            i3 = w19Var8.b;
            int i15 = w19Var8.d;
            int i16 = w19Var8.c;
            if (i16 > 0) {
                iM7 += i16;
            }
            u1(hg6Var.b, hg6Var.c);
            w19 w19Var9 = this.q;
            w19Var9.h = iM7;
            w19Var9.d += w19Var9.e;
            T0(cfeVar, w19Var9, hfeVar, false);
            w19 w19Var10 = this.q;
            int i17 = w19Var10.b;
            int i18 = w19Var10.c;
            if (i18 > 0) {
                t1(i15, i3);
                w19 w19Var11 = this.q;
                w19Var11.h = i18;
                T0(cfeVar, w19Var11, hfeVar, false);
                i3 = this.q.b;
            }
            i4 = i17;
        }
        if (w() > 0) {
            if (this.u ^ this.v) {
                int iD8 = d1(i3, cfeVar, hfeVar, true);
                i5 = i4 + iD8;
                i6 = i3 + iD8;
                iD1 = e1(i5, cfeVar, hfeVar, false);
            } else {
                int iE1 = e1(i4, cfeVar, hfeVar, true);
                i5 = i4 + iE1;
                i6 = i3 + iE1;
                iD1 = d1(i6, cfeVar, hfeVar, false);
            }
            i4 = i5 + iD1;
            i3 = i6 + iD1;
        }
        if (hfeVar.l && w() != 0 && !hfeVar.h && L0()) {
            List list2 = cfeVar.d;
            int size = list2.size();
            int iM8 = vee.M(v(0));
            int i19 = 0;
            int iE = 0;
            int iE2 = 0;
            while (i19 < size) {
                lfe lfeVar = (lfe) list2.get(i19);
                boolean zS = lfeVar.s();
                View view = lfeVar.a;
                if (!zS) {
                    boolean z14 = lfeVar.m() < iM8 ? true : z6;
                    boolean z15 = this.u;
                    pic picVar9 = this.r;
                    if (z14 != z15) {
                        iE += picVar9.e(view);
                    } else {
                        iE2 += picVar9.e(view);
                    }
                }
                i19++;
                z6 = false;
            }
            this.q.k = list2;
            if (iE > 0) {
                u1(vee.M(g1()), i4);
                w19 w19Var12 = this.q;
                w19Var12.h = iE;
                r4 = 0;
                w19Var12.c = 0;
                w19Var12.a(null);
                T0(cfeVar, this.q, hfeVar, false);
            } else {
                r4 = 0;
            }
            if (iE2 > 0) {
                t1(vee.M(f1()), i3);
                w19 w19Var13 = this.q;
                w19Var13.h = iE2;
                w19Var13.c = r4;
                list = null;
                w19Var13.a(null);
                T0(cfeVar, this.q, hfeVar, r4);
            } else {
                list = null;
            }
            this.q.k = list;
        }
        if (hfeVar.h) {
            hg6Var.d();
        } else {
            pic picVar10 = this.r;
            picVar10.a = picVar10.n();
        }
        this.s = this.v;
    }

    public void k1(View view, View view2) {
        d("Cannot drop a view during a scroll or layout calculation");
        S0();
        n1();
        int iM = vee.M(view);
        int iM2 = vee.M(view2);
        byte b = iM < iM2 ? (byte) 1 : (byte) -1;
        boolean z = this.u;
        pic picVar = this.r;
        if (z) {
            if (b == 1) {
                p1(iM2, picVar.i() - (this.r.e(view) + this.r.g(view2)));
                return;
            } else {
                p1(iM2, picVar.i() - this.r.d(view2));
                return;
            }
        }
        if (b == -1) {
            p1(iM2, picVar.g(view2));
        } else {
            p1(iM2, picVar.d(view2) - this.r.e(view));
        }
    }

    @Override // defpackage.vee
    public int l(hfe hfeVar) {
        return P0(hfeVar);
    }

    @Override // defpackage.vee
    public void l0(hfe hfeVar) {
        this.z = null;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.A.d();
    }

    public final void l1(cfe cfeVar, w19 w19Var) {
        if (!w19Var.a || w19Var.l) {
            return;
        }
        int i = w19Var.g;
        int i2 = w19Var.i;
        if (w19Var.f == -1) {
            int iW = w();
            if (i < 0) {
                return;
            }
            int iH = (this.r.h() - i) + i2;
            if (this.u) {
                for (int i3 = 0; i3 < iW; i3++) {
                    View viewV = v(i3);
                    if (this.r.g(viewV) < iH || this.r.p(viewV) < iH) {
                        m1(cfeVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iW - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewV2 = v(i5);
                if (this.r.g(viewV2) < iH || this.r.p(viewV2) < iH) {
                    m1(cfeVar, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iW2 = w();
        if (!this.u) {
            for (int i7 = 0; i7 < iW2; i7++) {
                View viewV3 = v(i7);
                if (this.r.d(viewV3) > i6 || this.r.o(viewV3) > i6) {
                    m1(cfeVar, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iW2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewV4 = v(i9);
            if (this.r.d(viewV4) > i6 || this.r.o(viewV4) > i6) {
                m1(cfeVar, i8, i9);
                return;
            }
        }
    }

    @Override // defpackage.vee
    public int m(hfe hfeVar) {
        return Q0(hfeVar);
    }

    public final void m1(cfe cfeVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                u0(i, cfeVar);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                u0(i3, cfeVar);
            }
        }
    }

    @Override // defpackage.vee
    public final int n(hfe hfeVar) {
        return O0(hfeVar);
    }

    @Override // defpackage.vee
    public final void n0(Parcelable parcelable) {
        if (parcelable instanceof x19) {
            x19 x19Var = (x19) parcelable;
            this.z = x19Var;
            if (this.x != -1) {
                x19Var.b();
            }
            x0();
        }
    }

    public final void n1() {
        if (this.p == 1 || !h1()) {
            this.u = this.t;
        } else {
            this.u = !this.t;
        }
    }

    @Override // defpackage.vee
    public int o(hfe hfeVar) {
        return P0(hfeVar);
    }

    @Override // defpackage.vee
    public final Parcelable o0() {
        x19 x19Var = this.z;
        if (x19Var != null) {
            return new x19(x19Var);
        }
        x19 x19Var2 = new x19();
        if (w() <= 0) {
            x19Var2.b();
            return x19Var2;
        }
        S0();
        boolean z = this.s ^ this.u;
        x19Var2.c = z;
        if (z) {
            View viewF1 = f1();
            x19Var2.b = this.r.i() - this.r.d(viewF1);
            x19Var2.a = vee.M(viewF1);
            return x19Var2;
        }
        View viewG1 = g1();
        x19Var2.a = vee.M(viewG1);
        x19Var2.b = this.r.g(viewG1) - this.r.m();
        return x19Var2;
    }

    public final int o1(int i, cfe cfeVar, hfe hfeVar) {
        if (w() != 0 && i != 0) {
            S0();
            this.q.a = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            s1(i2, iAbs, true, hfeVar);
            w19 w19Var = this.q;
            int iT0 = T0(cfeVar, w19Var, hfeVar, false) + w19Var.g;
            if (iT0 >= 0) {
                if (iAbs > iT0) {
                    i = i2 * iT0;
                }
                this.r.q(-i);
                this.q.j = i;
                return i;
            }
        }
        return 0;
    }

    @Override // defpackage.vee
    public int p(hfe hfeVar) {
        return Q0(hfeVar);
    }

    public final void p1(int i, int i2) {
        this.x = i;
        this.y = i2;
        x19 x19Var = this.z;
        if (x19Var != null) {
            x19Var.b();
        }
        x0();
    }

    public final void q1(int i) {
        if (i != 0 && i != 1) {
            ore.p(zo5.h(i, "invalid orientation:"));
            return;
        }
        d(null);
        if (i != this.p || this.r == null) {
            pic picVarB = pic.b(this, i);
            this.r = picVarB;
            this.A.f = picVarB;
            this.p = i;
            x0();
        }
    }

    @Override // defpackage.vee
    public final View r(int i) {
        int iW = w();
        if (iW == 0) {
            return null;
        }
        int iM = i - vee.M(v(0));
        if (iM >= 0 && iM < iW) {
            View viewV = v(iM);
            if (vee.M(viewV) == i) {
                return viewV;
            }
        }
        return super.r(i);
    }

    public void r1(boolean z) {
        d(null);
        if (this.v == z) {
            return;
        }
        this.v = z;
        x0();
    }

    @Override // defpackage.vee
    public wee s() {
        return new wee(-2, -2);
    }

    public final void s1(int i, int i2, boolean z, hfe hfeVar) {
        int iM;
        this.q.l = this.r.k() == 0 && this.r.h() == 0;
        this.q.f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        M0(hfeVar, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        w19 w19Var = this.q;
        int i3 = z2 ? iMax2 : iMax;
        w19Var.h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        w19Var.i = iMax;
        if (z2) {
            w19Var.h = this.r.j() + i3;
            View viewF1 = f1();
            w19 w19Var2 = this.q;
            w19Var2.e = this.u ? -1 : 1;
            int iM2 = vee.M(viewF1);
            w19 w19Var3 = this.q;
            w19Var2.d = iM2 + w19Var3.e;
            w19Var3.b = this.r.d(viewF1);
            iM = this.r.d(viewF1) - this.r.i();
        } else {
            View viewG1 = g1();
            w19 w19Var4 = this.q;
            w19Var4.h = this.r.m() + w19Var4.h;
            w19 w19Var5 = this.q;
            w19Var5.e = this.u ? 1 : -1;
            int iM3 = vee.M(viewG1);
            w19 w19Var6 = this.q;
            w19Var5.d = iM3 + w19Var6.e;
            w19Var6.b = this.r.g(viewG1);
            iM = (-this.r.g(viewG1)) + this.r.m();
        }
        w19 w19Var7 = this.q;
        w19Var7.c = i2;
        if (z) {
            w19Var7.c = i2 - iM;
        }
        w19Var7.g = iM;
    }

    public final void t1(int i, int i2) {
        this.q.c = this.r.i() - i2;
        w19 w19Var = this.q;
        w19Var.e = this.u ? -1 : 1;
        w19Var.d = i;
        w19Var.f = 1;
        w19Var.b = i2;
        w19Var.g = Integer.MIN_VALUE;
    }

    public final void u1(int i, int i2) {
        this.q.c = i2 - this.r.m();
        w19 w19Var = this.q;
        w19Var.d = i;
        w19Var.e = this.u ? 1 : -1;
        w19Var.f = -1;
        w19Var.b = i2;
        w19Var.g = Integer.MIN_VALUE;
    }

    @Override // defpackage.vee
    public int y0(int i, cfe cfeVar, hfe hfeVar) {
        if (this.p == 1) {
            return 0;
        }
        return o1(i, cfeVar, hfeVar);
    }

    @Override // defpackage.vee
    public void z0(int i) {
        this.x = i;
        this.y = Integer.MIN_VALUE;
        x19 x19Var = this.z;
        if (x19Var != null) {
            x19Var.b();
        }
        x0();
    }

    public LinearLayoutManager(int i, boolean z) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new hg6();
        this.B = new v19();
        this.C = 2;
        this.D = new int[2];
        q1(i);
        d(null);
        if (z == this.t) {
            return;
        }
        this.t = z;
        x0();
    }

    public LinearLayoutManager() {
        this(1, false);
    }
}
