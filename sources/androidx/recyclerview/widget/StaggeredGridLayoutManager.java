package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.a29;
import defpackage.cfe;
import defpackage.gfe;
import defpackage.h6f;
import defpackage.hfe;
import defpackage.i7j;
import defpackage.lgg;
import defpackage.ly8;
import defpackage.mgg;
import defpackage.ngg;
import defpackage.nk5;
import defpackage.ogg;
import defpackage.ore;
import defpackage.ou9;
import defpackage.pic;
import defpackage.qv1;
import defpackage.rda;
import defpackage.uee;
import defpackage.vd7;
import defpackage.vee;
import defpackage.wee;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class StaggeredGridLayoutManager extends vee implements gfe {
    public final h6f B;
    public final int C;
    public boolean D;
    public boolean E;
    public ogg F;
    public final Rect G;
    public final lgg H;
    public final boolean I;
    public int[] J;
    public final rda K;
    public final int p;
    public final ou9[] q;
    public final pic r;
    public final pic s;
    public final int t;
    public int u;
    public final ly8 v;
    public boolean w;
    public final BitSet y;
    public boolean x = false;
    public int z = -1;
    public int A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = -1;
        this.w = false;
        h6f h6fVar = new h6f(3);
        this.B = h6fVar;
        this.C = 2;
        this.G = new Rect();
        this.H = new lgg(this);
        this.I = true;
        this.K = new rda(14, this);
        uee ueeVarN = vee.N(context, attributeSet, i, i2);
        int i3 = ueeVarN.a;
        if (i3 != 0 && i3 != 1) {
            ore.p("invalid orientation.");
            throw null;
        }
        d(null);
        if (i3 != this.t) {
            this.t = i3;
            pic picVar = this.r;
            this.r = this.s;
            this.s = picVar;
            x0();
        }
        int i4 = ueeVarN.b;
        d(null);
        if (i4 != this.p) {
            h6fVar.g();
            x0();
            this.p = i4;
            this.y = new BitSet(this.p);
            this.q = new ou9[this.p];
            for (int i5 = 0; i5 < this.p; i5++) {
                this.q[i5] = new ou9(this, i5);
            }
            x0();
        }
        boolean z = ueeVarN.c;
        d(null);
        ogg oggVar = this.F;
        if (oggVar != null && oggVar.h != z) {
            oggVar.h = z;
        }
        this.w = z;
        x0();
        ly8 ly8Var = new ly8();
        ly8Var.a = true;
        ly8Var.f = 0;
        ly8Var.g = 0;
        this.v = ly8Var;
        this.r = pic.b(this, this.t);
        this.s = pic.b(this, 1 - this.t);
    }

    public static int m1(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // defpackage.vee
    public final int A0(int i, cfe cfeVar, hfe hfeVar) {
        return i1(i, cfeVar, hfeVar);
    }

    @Override // defpackage.vee
    public final void D0(int i, int i2, Rect rect) {
        int iH;
        int iH2;
        int iK = K() + J();
        int I = I() + L();
        int i3 = this.t;
        int i4 = this.p;
        if (i3 == 1) {
            int iHeight = rect.height() + I;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = i7j.a;
            iH2 = vee.h(i2, iHeight, recyclerView.getMinimumHeight());
            iH = vee.h(i, (this.u * i4) + iK, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iK;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = i7j.a;
            iH = vee.h(i, iWidth, recyclerView2.getMinimumWidth());
            iH2 = vee.h(i2, (this.u * i4) + I, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(iH, iH2);
    }

    @Override // defpackage.vee
    public final void J0(RecyclerView recyclerView, int i) {
        a29 a29Var = new a29(recyclerView.getContext());
        a29Var.a = i;
        K0(a29Var);
    }

    @Override // defpackage.vee
    public final boolean L0() {
        return this.F == null;
    }

    public final boolean M0() {
        int iT0;
        if (w() != 0 && this.C != 0 && this.g) {
            if (this.x) {
                iT0 = U0();
                T0();
            } else {
                iT0 = T0();
                U0();
            }
            if (iT0 == 0 && Y0() != null) {
                this.B.g();
                this.f = true;
                x0();
                return true;
            }
        }
        return false;
    }

    public final int N0(hfe hfeVar) {
        if (w() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return vd7.k(hfeVar, this.r, Q0(z), P0(z), this, this.I, this.x);
    }

    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [boolean, int] */
    public final int O0(cfe cfeVar, ly8 ly8Var, hfe hfeVar) {
        int i;
        ou9[] ou9VarArr;
        int iV0;
        ou9[] ou9VarArr2;
        BitSet bitSet;
        ou9 ou9Var;
        ?? r3;
        int iK;
        int iE;
        int iE2;
        int i2;
        View view;
        BitSet bitSet2;
        int i3;
        int i4;
        int i5;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        cfe cfeVar2 = cfeVar;
        BitSet bitSet3 = staggeredGridLayoutManager.y;
        int i6 = staggeredGridLayoutManager.p;
        bitSet3.set(0, i6, true);
        ly8 ly8Var2 = staggeredGridLayoutManager.v;
        if (ly8Var2.i) {
            i = ly8Var.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = ly8Var.e == 1 ? ly8Var.g + ly8Var.b : ly8Var.f - ly8Var.b;
        }
        int i7 = ly8Var.e;
        int i8 = 0;
        while (true) {
            ou9VarArr = staggeredGridLayoutManager.q;
            if (i8 >= i6) {
                break;
            }
            if (!((ArrayList) ou9VarArr[i8].e).isEmpty()) {
                staggeredGridLayoutManager.l1(ou9VarArr[i8], i7, i);
            }
            i8++;
        }
        boolean z = staggeredGridLayoutManager.x;
        pic picVar = staggeredGridLayoutManager.r;
        int i9 = z ? picVar.i() : picVar.m();
        boolean z2 = false;
        while (true) {
            int i10 = ly8Var.c;
            if (i10 < 0 || i10 >= hfeVar.b() || (!ly8Var2.i && bitSet3.isEmpty())) {
                break;
            }
            View viewD = cfeVar2.d(ly8Var.c);
            ly8Var.c += ly8Var.d;
            mgg mggVar = (mgg) viewD.getLayoutParams();
            int iM = mggVar.a.m();
            h6f h6fVar = staggeredGridLayoutManager.B;
            int[] iArr = (int[]) h6fVar.b;
            int i11 = (iArr == null || iM >= iArr.length) ? -1 : iArr[iM];
            if (i11 == -1) {
                if (staggeredGridLayoutManager.c1(ly8Var.e)) {
                    i4 = i6 - 1;
                    i3 = -1;
                    i5 = -1;
                } else {
                    i3 = i6;
                    i4 = 0;
                    i5 = 1;
                }
                ou9VarArr2 = ou9VarArr;
                ou9 ou9Var2 = null;
                if (ly8Var.e == 1) {
                    int iM2 = picVar.m();
                    int i12 = Integer.MAX_VALUE;
                    while (i4 != i3) {
                        int i13 = i4;
                        ou9 ou9Var3 = ou9VarArr2[i13];
                        BitSet bitSet4 = bitSet3;
                        int i14 = ou9Var3.i(iM2);
                        if (i14 < i12) {
                            i12 = i14;
                            ou9Var2 = ou9Var3;
                        }
                        i4 = i13 + i5;
                        bitSet3 = bitSet4;
                    }
                    bitSet = bitSet3;
                } else {
                    bitSet = bitSet3;
                    int i15 = picVar.i();
                    int i16 = Integer.MIN_VALUE;
                    while (i4 != i3) {
                        ou9 ou9Var4 = ou9VarArr2[i4];
                        int i17 = i4;
                        int iK2 = ou9Var4.k(i15);
                        if (iK2 > i16) {
                            ou9Var2 = ou9Var4;
                            i16 = iK2;
                        }
                        i4 = i17 + i5;
                    }
                }
                ou9Var = ou9Var2;
                h6fVar.i(iM);
                ((int[]) h6fVar.b)[iM] = ou9Var.d;
            } else {
                ou9VarArr2 = ou9VarArr;
                bitSet = bitSet3;
                ou9Var = ou9VarArr2[i11];
            }
            ou9 ou9Var5 = ou9Var;
            mggVar.e = ou9Var5;
            if (ly8Var.e == 1) {
                staggeredGridLayoutManager.b(viewD);
                r3 = 0;
            } else {
                r3 = 0;
                staggeredGridLayoutManager.c(viewD, 0, false);
            }
            int i18 = staggeredGridLayoutManager.t;
            if (i18 == 1) {
                staggeredGridLayoutManager.a1(viewD, vee.x(r3, staggeredGridLayoutManager.u, staggeredGridLayoutManager.l, r3, ((ViewGroup.MarginLayoutParams) mggVar).width), vee.x(true, staggeredGridLayoutManager.o, staggeredGridLayoutManager.m, staggeredGridLayoutManager.I() + staggeredGridLayoutManager.L(), ((ViewGroup.MarginLayoutParams) mggVar).height));
            } else {
                staggeredGridLayoutManager.a1(viewD, vee.x(true, staggeredGridLayoutManager.n, staggeredGridLayoutManager.l, staggeredGridLayoutManager.K() + staggeredGridLayoutManager.J(), ((ViewGroup.MarginLayoutParams) mggVar).width), vee.x(false, staggeredGridLayoutManager.u, staggeredGridLayoutManager.m, 0, ((ViewGroup.MarginLayoutParams) mggVar).height));
            }
            if (ly8Var.e == 1) {
                iE = ou9Var5.i(i9);
                iK = picVar.e(viewD) + iE;
            } else {
                iK = ou9Var5.k(i9);
                iE = iK - picVar.e(viewD);
            }
            int i19 = ly8Var.e;
            ou9 ou9Var6 = mggVar.e;
            if (i19 == 1) {
                ou9Var6.getClass();
                mgg mggVar2 = (mgg) viewD.getLayoutParams();
                mggVar2.e = ou9Var6;
                ArrayList arrayList = (ArrayList) ou9Var6.e;
                arrayList.add(viewD);
                ou9Var6.b = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    ou9Var6.a = Integer.MIN_VALUE;
                }
                if (mggVar2.a.s() || mggVar2.a.v()) {
                    ou9Var6.c = ((StaggeredGridLayoutManager) ou9Var6.f).r.e(viewD) + ou9Var6.c;
                }
            } else {
                ou9Var6.getClass();
                mgg mggVar3 = (mgg) viewD.getLayoutParams();
                mggVar3.e = ou9Var6;
                ArrayList arrayList2 = (ArrayList) ou9Var6.e;
                arrayList2.add(0, viewD);
                ou9Var6.a = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    ou9Var6.b = Integer.MIN_VALUE;
                }
                if (mggVar3.a.s() || mggVar3.a.v()) {
                    ou9Var6.c = ((StaggeredGridLayoutManager) ou9Var6.f).r.e(viewD) + ou9Var6.c;
                }
            }
            boolean zZ0 = staggeredGridLayoutManager.Z0();
            pic picVar2 = staggeredGridLayoutManager.s;
            if (zZ0 && i18 == 1) {
                i2 = picVar2.i() - (((i6 - 1) - ou9Var5.d) * staggeredGridLayoutManager.u);
                iE2 = i2 - picVar2.e(viewD);
            } else {
                int iM3 = (ou9Var5.d * staggeredGridLayoutManager.u) + picVar2.m();
                int iE3 = picVar2.e(viewD) + iM3;
                iE2 = iM3;
                i2 = iE3;
            }
            if (i18 == 1) {
                view = viewD;
                staggeredGridLayoutManager.S(view, iE2, iE, i2, iK);
                staggeredGridLayoutManager = this;
            } else {
                view = viewD;
                staggeredGridLayoutManager.S(view, iE, iE2, iK, i2);
            }
            staggeredGridLayoutManager.l1(ou9Var5, ly8Var2.e, i);
            staggeredGridLayoutManager.e1(cfeVar, ly8Var2);
            if (ly8Var2.h && view.hasFocusable()) {
                bitSet2 = bitSet;
                bitSet2.set(ou9Var5.d, false);
            } else {
                bitSet2 = bitSet;
            }
            bitSet3 = bitSet2;
            i9 = i9;
            z2 = true;
            ou9VarArr = ou9VarArr2;
            i6 = i6;
            cfeVar2 = cfeVar;
            picVar = picVar;
        }
        pic picVar3 = picVar;
        cfe cfeVar3 = cfeVar2;
        if (!z2) {
            staggeredGridLayoutManager.e1(cfeVar3, ly8Var2);
        }
        if (ly8Var2.e == -1) {
            iV0 = picVar3.m() - staggeredGridLayoutManager.W0(picVar3.m());
        } else {
            iV0 = staggeredGridLayoutManager.V0(picVar3.i()) - picVar3.i();
        }
        if (iV0 > 0) {
            return Math.min(ly8Var.b, iV0);
        }
        return 0;
    }

    public final View P0(boolean z) {
        pic picVar = this.r;
        int iM = picVar.m();
        int i = picVar.i();
        View view = null;
        for (int iW = w() - 1; iW >= 0; iW--) {
            View viewV = v(iW);
            int iG = picVar.g(viewV);
            int iD = picVar.d(viewV);
            if (iD > iM && iG < i) {
                if (iD <= i || !z) {
                    return viewV;
                }
                if (view == null) {
                    view = viewV;
                }
            }
        }
        return view;
    }

    @Override // defpackage.vee
    public final boolean Q() {
        return this.C != 0;
    }

    public final View Q0(boolean z) {
        pic picVar = this.r;
        int iM = picVar.m();
        int i = picVar.i();
        int iW = w();
        View view = null;
        for (int i2 = 0; i2 < iW; i2++) {
            View viewV = v(i2);
            int iG = picVar.g(viewV);
            if (picVar.d(viewV) > iM && iG < i) {
                if (iG >= iM || !z) {
                    return viewV;
                }
                if (view == null) {
                    view = viewV;
                }
            }
        }
        return view;
    }

    public final void R0(cfe cfeVar, hfe hfeVar, boolean z) {
        int i;
        int iV0 = V0(Integer.MIN_VALUE);
        if (iV0 != Integer.MIN_VALUE && (i = this.r.i() - iV0) > 0) {
            int i2 = i - (-i1(-i, cfeVar, hfeVar));
            if (!z || i2 <= 0) {
                return;
            }
            this.r.q(i2);
        }
    }

    public final void S0(cfe cfeVar, hfe hfeVar, boolean z) {
        int iM;
        int iW0 = W0(Integer.MAX_VALUE);
        if (iW0 != Integer.MAX_VALUE && (iM = iW0 - this.r.m()) > 0) {
            int iI1 = iM - i1(iM, cfeVar, hfeVar);
            if (!z || iI1 <= 0) {
                return;
            }
            this.r.q(-iI1);
        }
    }

    public final int T0() {
        if (w() == 0) {
            return 0;
        }
        return vee.M(v(0));
    }

    @Override // defpackage.vee
    public final void U(int i) {
        super.U(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            ou9 ou9Var = this.q[i2];
            int i3 = ou9Var.a;
            if (i3 != Integer.MIN_VALUE) {
                ou9Var.a = i3 + i;
            }
            int i4 = ou9Var.b;
            if (i4 != Integer.MIN_VALUE) {
                ou9Var.b = i4 + i;
            }
        }
    }

    public final int U0() {
        int iW = w();
        if (iW == 0) {
            return 0;
        }
        return vee.M(v(iW - 1));
    }

    @Override // defpackage.vee
    public final void V(int i) {
        super.V(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            ou9 ou9Var = this.q[i2];
            int i3 = ou9Var.a;
            if (i3 != Integer.MIN_VALUE) {
                ou9Var.a = i3 + i;
            }
            int i4 = ou9Var.b;
            if (i4 != Integer.MIN_VALUE) {
                ou9Var.b = i4 + i;
            }
        }
    }

    public final int V0(int i) {
        int i2 = this.q[0].i(i);
        for (int i3 = 1; i3 < this.p; i3++) {
            int i4 = this.q[i3].i(i);
            if (i4 > i2) {
                i2 = i4;
            }
        }
        return i2;
    }

    @Override // defpackage.vee
    public final void W() {
        this.B.g();
        for (int i = 0; i < this.p; i++) {
            this.q[i].d();
        }
    }

    public final int W0(int i) {
        int iK = this.q[0].k(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int iK2 = this.q[i2].k(i);
            if (iK2 < iK) {
                iK = iK2;
            }
        }
        return iK;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0035  */
    /* JADX WARN: Code duplicated, block: B:22:0x0037  */
    /* JADX WARN: Code duplicated, block: B:24:0x003e  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d A[LOOP:0: B:23:0x003c->B:27:0x004d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0074 A[LOOP:1: B:32:0x0063->B:36:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:43:0x009d  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:61:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0051 A[EDGE_INSN: B:62:0x0051->B:29:0x0051 BREAK  A[LOOP:0: B:23:0x003c->B:27:0x004d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0078 A[EDGE_INSN: B:64:0x0078->B:38:0x0078 BREAK  A[LOOP:1: B:32:0x0063->B:36:0x0074], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public final void X0(int i, int i2, int i3) {
        int i4;
        int i5;
        h6f h6fVar;
        int[] iArr;
        int iU0;
        ArrayList arrayList;
        int size;
        ngg nggVar;
        int size2;
        int i6;
        int i7;
        int[] iArr2;
        int iU1 = this.x ? U0() : T0();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            h6fVar = this.B;
            iArr = (int[]) h6fVar.b;
            if (iArr != null && i5 < iArr.length) {
                arrayList = (ArrayList) h6fVar.c;
                if (arrayList == null) {
                    i7 = -1;
                } else {
                    size = arrayList.size() - 1;
                    while (true) {
                        if (size >= 0) {
                            nggVar = null;
                            break;
                        }
                        nggVar = (ngg) ((ArrayList) h6fVar.c).get(size);
                        if (nggVar.a == i5) {
                            break;
                        } else {
                            size--;
                        }
                    }
                    if (nggVar != null) {
                        ((ArrayList) h6fVar.c).remove(nggVar);
                    }
                    size2 = ((ArrayList) h6fVar.c).size();
                    i6 = 0;
                    while (true) {
                        if (i6 < size2) {
                            i6 = -1;
                            break;
                        } else if (((ngg) ((ArrayList) h6fVar.c).get(i6)).a >= i5) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    if (i6 != -1) {
                        ngg nggVar2 = (ngg) ((ArrayList) h6fVar.c).get(i6);
                        ((ArrayList) h6fVar.c).remove(i6);
                        i7 = nggVar2.a;
                    } else {
                        i7 = -1;
                    }
                }
                iArr2 = (int[]) h6fVar.b;
                if (i7 == -1) {
                    Arrays.fill(iArr2, i5, iArr2.length, -1);
                    int length = ((int[]) h6fVar.b).length;
                } else {
                    Arrays.fill((int[]) h6fVar.b, i5, Math.min(i7 + 1, iArr2.length), -1);
                }
            }
            if (i3 != 1) {
                h6fVar.m(i, i2);
            } else if (i3 != 2) {
                h6fVar.n(i, i2);
            } else if (i3 == 8) {
                h6fVar.n(i, 1);
                h6fVar.m(i2, 1);
            }
            if (i4 <= iU1) {
                return;
            }
            if (this.x) {
                iU0 = T0();
            } else {
                iU0 = U0();
            }
            if (i5 <= iU0) {
                x0();
            }
        }
        i4 = i + i2;
        i5 = i;
        h6fVar = this.B;
        iArr = (int[]) h6fVar.b;
        if (iArr != null) {
            arrayList = (ArrayList) h6fVar.c;
            if (arrayList == null) {
                i7 = -1;
            } else {
                size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        nggVar = null;
                        break;
                    }
                    nggVar = (ngg) ((ArrayList) h6fVar.c).get(size);
                    if (nggVar.a == i5) {
                        break;
                        break;
                    }
                    size--;
                }
                if (nggVar != null) {
                    ((ArrayList) h6fVar.c).remove(nggVar);
                }
                size2 = ((ArrayList) h6fVar.c).size();
                i6 = 0;
                while (true) {
                    if (i6 < size2) {
                        i6 = -1;
                        break;
                    } else {
                        if (((ngg) ((ArrayList) h6fVar.c).get(i6)).a >= i5) {
                            break;
                            break;
                        }
                        i6++;
                    }
                }
                if (i6 != -1) {
                    ngg nggVar3 = (ngg) ((ArrayList) h6fVar.c).get(i6);
                    ((ArrayList) h6fVar.c).remove(i6);
                    i7 = nggVar3.a;
                } else {
                    i7 = -1;
                }
            }
            iArr2 = (int[]) h6fVar.b;
            if (i7 == -1) {
                Arrays.fill(iArr2, i5, iArr2.length, -1);
                int length2 = ((int[]) h6fVar.b).length;
            } else {
                Arrays.fill((int[]) h6fVar.b, i5, Math.min(i7 + 1, iArr2.length), -1);
            }
        }
        if (i3 != 1) {
            h6fVar.m(i, i2);
        } else if (i3 != 2) {
            h6fVar.n(i, i2);
        } else if (i3 == 8) {
            h6fVar.n(i, 1);
            h6fVar.m(i2, 1);
        }
        if (i4 <= iU1) {
            return;
        }
        if (this.x) {
            iU0 = T0();
        } else {
            iU0 = U0();
        }
        if (i5 <= iU0) {
            x0();
        }
    }

    @Override // defpackage.vee
    public final void Y(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i = 0; i < this.p; i++) {
            this.q[i].d();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x002a A[SYNTHETIC] */
    public final View Y0() {
        boolean z;
        boolean z2;
        int iW = w();
        int i = iW - 1;
        int i2 = this.p;
        BitSet bitSet = new BitSet(i2);
        bitSet.set(0, i2, true);
        byte b = (this.t == 1 && Z0()) ? (byte) 1 : (byte) -1;
        if (this.x) {
            iW = -1;
        } else {
            i = 0;
        }
        int i3 = i < iW ? 1 : -1;
        while (i != iW) {
            View viewV = v(i);
            mgg mggVar = (mgg) viewV.getLayoutParams();
            boolean z3 = bitSet.get(mggVar.e.d);
            pic picVar = this.r;
            if (z3) {
                ou9 ou9Var = mggVar.e;
                if (this.x) {
                    int i4 = ou9Var.b;
                    if (i4 == Integer.MIN_VALUE) {
                        ou9Var.c();
                        i4 = ou9Var.b;
                    }
                    if (i4 < picVar.i()) {
                        ((mgg) ((View) qv1.f(1, (ArrayList) ou9Var.e)).getLayoutParams()).getClass();
                        return viewV;
                    }
                } else {
                    int i5 = ou9Var.a;
                    ArrayList arrayList = (ArrayList) ou9Var.e;
                    if (i5 == Integer.MIN_VALUE) {
                        View view = (View) arrayList.get(0);
                        mgg mggVar2 = (mgg) view.getLayoutParams();
                        ou9Var.a = ((StaggeredGridLayoutManager) ou9Var.f).r.g(view);
                        mggVar2.getClass();
                        i5 = ou9Var.a;
                    }
                    if (i5 > picVar.m()) {
                        ((mgg) ((View) arrayList.get(0)).getLayoutParams()).getClass();
                        return viewV;
                    }
                }
                bitSet.clear(mggVar.e.d);
            }
            i += i3;
            if (i != iW) {
                View viewV2 = v(i);
                if (this.x) {
                    int iD = picVar.d(viewV);
                    int iD2 = picVar.d(viewV2);
                    if (iD >= iD2) {
                        if (iD == iD2) {
                            if (mggVar.e.d - ((mgg) viewV2.getLayoutParams()).e.d < 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (b < 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z != z2) {
                            }
                        } else {
                            continue;
                        }
                    }
                    return viewV;
                }
                int iG = picVar.g(viewV);
                int iG2 = picVar.g(viewV2);
                if (iG <= iG2) {
                    if (iG == iG2) {
                        if (mggVar.e.d - ((mgg) viewV2.getLayoutParams()).e.d < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b < 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z != z2) {
                        }
                    } else {
                        continue;
                    }
                }
                return viewV;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0048  */
    /* JADX WARN: Code duplicated, block: B:34:0x004f  */
    @Override // defpackage.vee
    public final View Z(View view, int i, cfe cfeVar, hfe hfeVar) {
        View viewG;
        int i2;
        if (w() != 0) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (viewG = recyclerView.G(view)) == null || ((ArrayList) this.a.e).contains(viewG)) {
                viewG = null;
            }
            if (viewG != null) {
                h1();
                int i3 = this.t;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i == 66 ? i3 == 0 : !(i != 130 || i3 != 1)) {
                                    i2 = 1;
                                }
                            } else if (i3 == 1) {
                                i2 = -1;
                            }
                            i2 = Integer.MIN_VALUE;
                        } else if (i3 == 0) {
                            i2 = -1;
                        } else {
                            i2 = Integer.MIN_VALUE;
                        }
                    } else if (i3 != 1 && Z0()) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                } else if (i3 != 1 && Z0()) {
                    i2 = 1;
                } else {
                    i2 = -1;
                }
                if (i2 != Integer.MIN_VALUE) {
                    mgg mggVar = (mgg) viewG.getLayoutParams();
                    mggVar.getClass();
                    ou9 ou9Var = mggVar.e;
                    int iU0 = i2 == 1 ? U0() : T0();
                    k1(iU0, hfeVar);
                    j1(i2);
                    ly8 ly8Var = this.v;
                    ly8Var.c = ly8Var.d + iU0;
                    ly8Var.b = (int) (this.r.n() * 0.33333334f);
                    ly8Var.h = true;
                    ly8Var.a = false;
                    O0(cfeVar, ly8Var, hfeVar);
                    this.D = this.x;
                    View viewJ = ou9Var.j(iU0, i2);
                    if (viewJ != null && viewJ != viewG) {
                        return viewJ;
                    }
                    boolean zC1 = c1(i2);
                    ou9[] ou9VarArr = this.q;
                    int i4 = this.p;
                    if (zC1) {
                        for (int i5 = i4 - 1; i5 >= 0; i5--) {
                            View viewJ2 = ou9VarArr[i5].j(iU0, i2);
                            if (viewJ2 != null && viewJ2 != viewG) {
                                return viewJ2;
                            }
                        }
                    } else {
                        for (int i6 = 0; i6 < i4; i6++) {
                            View viewJ3 = ou9VarArr[i6].j(iU0, i2);
                            if (viewJ3 != null && viewJ3 != viewG) {
                                return viewJ3;
                            }
                        }
                    }
                    boolean z = (this.w ^ true) == (i2 == -1);
                    View viewR = r(z ? ou9Var.e() : ou9Var.f());
                    if (viewR != null && viewR != viewG) {
                        return viewR;
                    }
                    if (c1(i2)) {
                        for (int i7 = i4 - 1; i7 >= 0; i7--) {
                            if (i7 != ou9Var.d) {
                                View viewR2 = r(z ? ou9VarArr[i7].e() : ou9VarArr[i7].f());
                                if (viewR2 != null && viewR2 != viewG) {
                                    return viewR2;
                                }
                            }
                        }
                    } else {
                        for (int i8 = 0; i8 < i4; i8++) {
                            View viewR3 = r(z ? ou9VarArr[i8].e() : ou9VarArr[i8].f());
                            if (viewR3 != null && viewR3 != viewG) {
                                return viewR3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final boolean Z0() {
        return H() == 1;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    @Override // defpackage.gfe
    public final PointF a(int i) {
        int i2 = -1;
        if (w() != 0) {
            if ((i < T0()) == this.x) {
                i2 = 1;
            }
        } else if (this.x) {
            i2 = 1;
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.t == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }

    @Override // defpackage.vee
    public final void a0(AccessibilityEvent accessibilityEvent) {
        super.a0(accessibilityEvent);
        if (w() > 0) {
            View viewQ0 = Q0(false);
            View viewP0 = P0(false);
            if (viewQ0 == null || viewP0 == null) {
                return;
            }
            int iM = vee.M(viewQ0);
            int iM2 = vee.M(viewP0);
            if (iM < iM2) {
                accessibilityEvent.setFromIndex(iM);
                accessibilityEvent.setToIndex(iM2);
            } else {
                accessibilityEvent.setFromIndex(iM2);
                accessibilityEvent.setToIndex(iM);
            }
        }
    }

    public final void a1(View view, int i, int i2) {
        RecyclerView recyclerView = this.b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.V(view));
        }
        mgg mggVar = (mgg) view.getLayoutParams();
        int iM1 = m1(i, ((ViewGroup.MarginLayoutParams) mggVar).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) mggVar).rightMargin + rect.right);
        int iM2 = m1(i2, ((ViewGroup.MarginLayoutParams) mggVar).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) mggVar).bottomMargin + rect.bottom);
        if (G0(view, iM1, iM2, mggVar)) {
            view.measure(iM1, iM2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0189  */
    /* JADX WARN: Code duplicated, block: B:108:0x018b  */
    /* JADX WARN: Code duplicated, block: B:123:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:131:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:133:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:254:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:265:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x01de A[SYNTHETIC] */
    public final void b1(cfe cfeVar, hfe hfeVar, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        ogg oggVar;
        int iW;
        int i2;
        int iM;
        int iM2;
        int iW2;
        boolean z4;
        int i3;
        boolean z5;
        ogg oggVar2 = this.F;
        lgg lggVar = this.H;
        if (!(oggVar2 == null && this.z == -1) && hfeVar.b() == 0) {
            r0(cfeVar);
            lggVar.a();
            return;
        }
        boolean z6 = lggVar.e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = lggVar.g;
        boolean z7 = (z6 && this.z == -1 && this.F == null) ? false : true;
        ou9[] ou9VarArr = this.q;
        int i4 = this.p;
        h6f h6fVar = this.B;
        if (z7) {
            lggVar.a();
            ogg oggVar3 = this.F;
            pic picVar = this.r;
            if (oggVar3 != null) {
                int i5 = oggVar3.c;
                if (i5 > 0) {
                    if (i5 == i4) {
                        for (int i6 = 0; i6 < i4; i6++) {
                            ou9VarArr[i6].d();
                            ogg oggVar4 = this.F;
                            int i7 = oggVar4.d[i6];
                            if (i7 != Integer.MIN_VALUE) {
                                i7 += oggVar4.i ? picVar.i() : picVar.m();
                            }
                            ou9 ou9Var = ou9VarArr[i6];
                            ou9Var.a = i7;
                            ou9Var.b = i7;
                        }
                    } else {
                        oggVar3.d = null;
                        oggVar3.c = 0;
                        oggVar3.e = 0;
                        oggVar3.f = null;
                        oggVar3.g = null;
                        oggVar3.a = oggVar3.b;
                    }
                }
                ogg oggVar5 = this.F;
                this.E = oggVar5.j;
                boolean z8 = oggVar5.h;
                d(null);
                ogg oggVar6 = this.F;
                if (oggVar6 != null && oggVar6.h != z8) {
                    oggVar6.h = z8;
                }
                this.w = z8;
                x0();
                h1();
                ogg oggVar7 = this.F;
                int i8 = oggVar7.a;
                if (i8 != -1) {
                    this.z = i8;
                    lggVar.c = oggVar7.i;
                } else {
                    lggVar.c = this.x;
                }
                if (oggVar7.e > 1) {
                    h6fVar.b = oggVar7.f;
                    h6fVar.c = oggVar7.g;
                }
            } else {
                h1();
                lggVar.c = this.x;
            }
            if (hfeVar.h || (i3 = this.z) == -1) {
                if (this.D) {
                    int iB = hfeVar.b();
                    iW2 = w() - 1;
                    while (true) {
                        if (iW2 < 0) {
                            iM2 = 0;
                            break;
                        }
                        iM2 = vee.M(v(iW2));
                        if (iM2 < 0 && iM2 < iB) {
                            break;
                        } else {
                            iW2--;
                        }
                    }
                } else {
                    int iB2 = hfeVar.b();
                    iW = w();
                    i2 = 0;
                    while (true) {
                        if (i2 >= iW) {
                            iM2 = 0;
                            break;
                        }
                        iM = vee.M(v(i2));
                        if (iM < 0 && iM < iB2) {
                            iM2 = iM;
                            break;
                        }
                        i2++;
                    }
                }
                lggVar.a = iM2;
                lggVar.b = Integer.MIN_VALUE;
                z4 = true;
            } else if (i3 < 0 || i3 >= hfeVar.b()) {
                this.z = -1;
                this.A = Integer.MIN_VALUE;
                if (this.D) {
                    int iB3 = hfeVar.b();
                    iW2 = w() - 1;
                    while (true) {
                        if (iW2 < 0) {
                            iM2 = 0;
                            break;
                        } else {
                            iM2 = vee.M(v(iW2));
                            if (iM2 < 0) {
                            }
                            iW2--;
                        }
                    }
                } else {
                    int iB4 = hfeVar.b();
                    iW = w();
                    i2 = 0;
                    while (true) {
                        if (i2 >= iW) {
                            iM2 = 0;
                            break;
                        } else {
                            iM = vee.M(v(i2));
                            if (iM < 0) {
                            }
                            i2++;
                        }
                    }
                }
                lggVar.a = iM2;
                lggVar.b = Integer.MIN_VALUE;
                z4 = true;
            } else {
                ogg oggVar8 = this.F;
                if (oggVar8 == null || oggVar8.a == -1 || oggVar8.c < 1) {
                    View viewR = r(this.z);
                    if (viewR != null) {
                        lggVar.a = this.x ? U0() : T0();
                        if (this.A != Integer.MIN_VALUE) {
                            if (lggVar.c) {
                                lggVar.b = (picVar.i() - this.A) - picVar.d(viewR);
                            } else {
                                lggVar.b = (picVar.m() + this.A) - picVar.g(viewR);
                            }
                        } else if (picVar.e(viewR) > picVar.n()) {
                            lggVar.b = lggVar.c ? picVar.i() : picVar.m();
                        } else {
                            int iG = picVar.g(viewR) - picVar.m();
                            if (iG < 0) {
                                lggVar.b = -iG;
                            } else {
                                int i9 = picVar.i() - picVar.d(viewR);
                                if (i9 < 0) {
                                    lggVar.b = i9;
                                } else {
                                    lggVar.b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i10 = this.z;
                        lggVar.a = i10;
                        int i11 = this.A;
                        if (i11 == Integer.MIN_VALUE) {
                            if (w() != 0) {
                                if ((i10 < T0()) != this.x) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                            } else if (this.x) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            lggVar.c = z5;
                            pic picVar2 = staggeredGridLayoutManager.r;
                            lggVar.b = z5 ? picVar2.i() : picVar2.m();
                        } else {
                            boolean z9 = lggVar.c;
                            pic picVar3 = staggeredGridLayoutManager.r;
                            if (z9) {
                                lggVar.b = picVar3.i() - i11;
                            } else {
                                lggVar.b = picVar3.m() + i11;
                            }
                        }
                        z4 = true;
                        lggVar.d = true;
                    }
                } else {
                    lggVar.b = Integer.MIN_VALUE;
                    lggVar.a = this.z;
                }
                z4 = true;
            }
            lggVar.e = z4;
        }
        if (this.F == null && this.z == -1 && !(lggVar.c == this.D && Z0() == this.E)) {
            h6fVar.g();
            i = 1;
            lggVar.d = true;
        } else {
            i = 1;
        }
        if (w() > 0 && ((oggVar = this.F) == null || oggVar.c < i)) {
            if (lggVar.d) {
                for (int i12 = 0; i12 < i4; i12++) {
                    ou9VarArr[i12].d();
                    int i13 = lggVar.b;
                    if (i13 != Integer.MIN_VALUE) {
                        ou9 ou9Var2 = ou9VarArr[i12];
                        ou9Var2.a = i13;
                        ou9Var2.b = i13;
                    }
                }
            } else if (z7 || lggVar.f == null) {
                for (int i14 = 0; i14 < i4; i14++) {
                    ou9 ou9Var3 = ou9VarArr[i14];
                    boolean z10 = this.x;
                    int i15 = lggVar.b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) ou9Var3.f;
                    int i16 = z10 ? ou9Var3.i(Integer.MIN_VALUE) : ou9Var3.k(Integer.MIN_VALUE);
                    ou9Var3.d();
                    if (i16 != Integer.MIN_VALUE && ((!z10 || i16 >= staggeredGridLayoutManager2.r.i()) && (z10 || i16 <= staggeredGridLayoutManager2.r.m()))) {
                        if (i15 != Integer.MIN_VALUE) {
                            i16 += i15;
                        }
                        ou9Var3.b = i16;
                        ou9Var3.a = i16;
                    }
                }
                int length = ou9VarArr.length;
                int[] iArr = lggVar.f;
                if (iArr == null || iArr.length < length) {
                    lggVar.f = new int[staggeredGridLayoutManager.q.length];
                }
                for (int i17 = 0; i17 < length; i17++) {
                    lggVar.f[i17] = ou9VarArr[i17].k(Integer.MIN_VALUE);
                }
            } else {
                for (int i18 = 0; i18 < i4; i18++) {
                    ou9 ou9Var4 = ou9VarArr[i18];
                    ou9Var4.d();
                    int i19 = lggVar.f[i18];
                    ou9Var4.a = i19;
                    ou9Var4.b = i19;
                }
            }
        }
        q(cfeVar);
        ly8 ly8Var = this.v;
        ly8Var.a = false;
        pic picVar4 = this.s;
        int iN = picVar4.n();
        this.u = iN / i4;
        View.MeasureSpec.makeMeasureSpec(iN, picVar4.k());
        k1(lggVar.a, hfeVar);
        if (lggVar.c) {
            j1(-1);
            O0(cfeVar, ly8Var, hfeVar);
            j1(1);
            ly8Var.c = lggVar.a + ly8Var.d;
            O0(cfeVar, ly8Var, hfeVar);
        } else {
            j1(1);
            O0(cfeVar, ly8Var, hfeVar);
            j1(-1);
            ly8Var.c = lggVar.a + ly8Var.d;
            O0(cfeVar, ly8Var, hfeVar);
        }
        if (picVar4.k() != 1073741824) {
            int iW3 = w();
            float fMax = 0.0f;
            for (int i20 = 0; i20 < iW3; i20++) {
                View viewV = v(i20);
                float fE = picVar4.e(viewV);
                if (fE >= fMax) {
                    ((mgg) viewV.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fE);
                }
            }
            int i21 = this.u;
            int iRound = Math.round(fMax * i4);
            if (picVar4.k() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, picVar4.n());
            }
            this.u = iRound / i4;
            View.MeasureSpec.makeMeasureSpec(iRound, picVar4.k());
            if (this.u != i21) {
                for (int i22 = 0; i22 < iW3; i22++) {
                    View viewV2 = v(i22);
                    mgg mggVar = (mgg) viewV2.getLayoutParams();
                    mggVar.getClass();
                    boolean zZ0 = Z0();
                    int i23 = this.t;
                    if (zZ0 && i23 == 1) {
                        int i24 = -((i4 - 1) - mggVar.e.d);
                        viewV2.offsetLeftAndRight((this.u * i24) - (i24 * i21));
                    } else {
                        int i25 = mggVar.e.d;
                        int i26 = this.u * i25;
                        int i27 = i25 * i21;
                        if (i23 == 1) {
                            viewV2.offsetLeftAndRight(i26 - i27);
                        } else {
                            viewV2.offsetTopAndBottom(i26 - i27);
                        }
                    }
                }
            }
        }
        if (w() <= 0) {
            z2 = true;
        } else if (this.x) {
            z2 = true;
            R0(cfeVar, hfeVar, true);
            S0(cfeVar, hfeVar, false);
        } else {
            z2 = true;
            S0(cfeVar, hfeVar, true);
            R0(cfeVar, hfeVar, false);
        }
        if (!z || hfeVar.h || this.C == 0 || w() <= 0 || Y0() == null) {
            z3 = false;
        } else {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.K);
            }
            if (M0()) {
                z3 = z2;
            } else {
                z3 = false;
            }
        }
        if (hfeVar.h) {
            lggVar.a();
        }
        this.D = lggVar.c;
        this.E = Z0();
        if (z3) {
            lggVar.a();
            b1(cfeVar, hfeVar, false);
        }
    }

    public final boolean c1(int i) {
        if (this.t == 0) {
            return (i == -1) != this.x;
        }
        return ((i == -1) == this.x) == Z0();
    }

    @Override // defpackage.vee
    public final void d(String str) {
        if (this.F == null) {
            super.d(str);
        }
    }

    public final void d1(int i, hfe hfeVar) {
        int iT0;
        int i2;
        if (i > 0) {
            iT0 = U0();
            i2 = 1;
        } else {
            iT0 = T0();
            i2 = -1;
        }
        ly8 ly8Var = this.v;
        ly8Var.a = true;
        k1(iT0, hfeVar);
        j1(i2);
        ly8Var.c = iT0 + ly8Var.d;
        ly8Var.b = Math.abs(i);
    }

    @Override // defpackage.vee
    /* JADX INFO: renamed from: e */
    public final boolean getE() {
        return this.t == 0;
    }

    @Override // defpackage.vee
    public final void e0(int i, int i2) {
        X0(i, i2, 1);
    }

    public final void e1(cfe cfeVar, ly8 ly8Var) {
        if (!ly8Var.a || ly8Var.i) {
            return;
        }
        int i = ly8Var.b;
        int i2 = ly8Var.e;
        if (i == 0) {
            if (i2 == -1) {
                f1(ly8Var.g, cfeVar);
                return;
            } else {
                g1(ly8Var.f, cfeVar);
                return;
            }
        }
        int i3 = this.p;
        ou9[] ou9VarArr = this.q;
        int i4 = 1;
        if (i2 == -1) {
            int i5 = ly8Var.f;
            int iK = ou9VarArr[0].k(i5);
            while (i4 < i3) {
                int iK2 = ou9VarArr[i4].k(i5);
                if (iK2 > iK) {
                    iK = iK2;
                }
                i4++;
            }
            int i6 = i5 - iK;
            int iMin = ly8Var.g;
            if (i6 >= 0) {
                iMin -= Math.min(i6, ly8Var.b);
            }
            f1(iMin, cfeVar);
            return;
        }
        int i7 = ly8Var.g;
        int i8 = ou9VarArr[0].i(i7);
        while (i4 < i3) {
            int i9 = ou9VarArr[i4].i(i7);
            if (i9 < i8) {
                i8 = i9;
            }
            i4++;
        }
        int i10 = i8 - ly8Var.g;
        int iMin2 = ly8Var.f;
        if (i10 >= 0) {
            iMin2 += Math.min(i10, ly8Var.b);
        }
        g1(iMin2, cfeVar);
    }

    @Override // defpackage.vee
    public final boolean f() {
        return this.t == 1;
    }

    @Override // defpackage.vee
    public final void f0() {
        this.B.g();
        x0();
    }

    public final void f1(int i, cfe cfeVar) {
        for (int iW = w() - 1; iW >= 0; iW--) {
            View viewV = v(iW);
            pic picVar = this.r;
            if (picVar.g(viewV) < i || picVar.p(viewV) < i) {
                return;
            }
            mgg mggVar = (mgg) viewV.getLayoutParams();
            mggVar.getClass();
            if (((ArrayList) mggVar.e.e).size() == 1) {
                return;
            }
            ou9 ou9Var = mggVar.e;
            ArrayList arrayList = (ArrayList) ou9Var.e;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            mgg mggVar2 = (mgg) view.getLayoutParams();
            mggVar2.e = null;
            if (mggVar2.a.s() || mggVar2.a.v()) {
                ou9Var.c -= ((StaggeredGridLayoutManager) ou9Var.f).r.e(view);
            }
            if (size == 1) {
                ou9Var.a = Integer.MIN_VALUE;
            }
            ou9Var.b = Integer.MIN_VALUE;
            t0(viewV, cfeVar);
        }
    }

    @Override // defpackage.vee
    public final boolean g(wee weeVar) {
        return weeVar instanceof mgg;
    }

    @Override // defpackage.vee
    public final void g0(int i, int i2) {
        X0(i, i2, 8);
    }

    public final void g1(int i, cfe cfeVar) {
        while (w() > 0) {
            View viewV = v(0);
            pic picVar = this.r;
            if (picVar.d(viewV) > i || picVar.o(viewV) > i) {
                return;
            }
            mgg mggVar = (mgg) viewV.getLayoutParams();
            mggVar.getClass();
            if (((ArrayList) mggVar.e.e).size() == 1) {
                return;
            }
            ou9 ou9Var = mggVar.e;
            ArrayList arrayList = (ArrayList) ou9Var.e;
            View view = (View) arrayList.remove(0);
            mgg mggVar2 = (mgg) view.getLayoutParams();
            mggVar2.e = null;
            if (arrayList.size() == 0) {
                ou9Var.b = Integer.MIN_VALUE;
            }
            if (mggVar2.a.s() || mggVar2.a.v()) {
                ou9Var.c -= ((StaggeredGridLayoutManager) ou9Var.f).r.e(view);
            }
            ou9Var.a = Integer.MIN_VALUE;
            t0(viewV, cfeVar);
        }
    }

    @Override // defpackage.vee
    public final void h0(int i, int i2) {
        X0(i, i2, 2);
    }

    public final void h1() {
        if (this.t == 1 || !Z0()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    @Override // defpackage.vee
    public final void i(int i, int i2, hfe hfeVar, nk5 nk5Var) {
        ly8 ly8Var;
        int i3;
        if (this.t != 0) {
            i = i2;
        }
        if (w() == 0 || i == 0) {
            return;
        }
        d1(i, hfeVar);
        int[] iArr = this.J;
        int i4 = this.p;
        if (iArr == null || iArr.length < i4) {
            this.J = new int[i4];
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            ly8Var = this.v;
            if (i5 >= i4) {
                break;
            }
            int i7 = ly8Var.d;
            ou9[] ou9VarArr = this.q;
            if (i7 == -1) {
                int i8 = ly8Var.f;
                i3 = i8 - ou9VarArr[i5].k(i8);
            } else {
                i3 = ou9VarArr[i5].i(ly8Var.g) - ly8Var.g;
            }
            if (i3 >= 0) {
                this.J[i6] = i3;
                i6++;
            }
            i5++;
        }
        Arrays.sort(this.J, 0, i6);
        for (int i9 = 0; i9 < i6; i9++) {
            int i10 = ly8Var.c;
            if (i10 < 0 || i10 >= hfeVar.b()) {
                return;
            }
            nk5Var.a(ly8Var.c, this.J[i9]);
            ly8Var.c += ly8Var.d;
        }
    }

    public final int i1(int i, cfe cfeVar, hfe hfeVar) {
        if (w() == 0 || i == 0) {
            return 0;
        }
        d1(i, hfeVar);
        ly8 ly8Var = this.v;
        int iO0 = O0(cfeVar, ly8Var, hfeVar);
        if (ly8Var.b >= iO0) {
            i = i < 0 ? -iO0 : iO0;
        }
        this.r.q(-i);
        this.D = this.x;
        ly8Var.b = 0;
        e1(cfeVar, ly8Var);
        return i;
    }

    @Override // defpackage.vee
    public final void j0(RecyclerView recyclerView, int i, int i2) {
        X0(i, i2, 4);
    }

    public final void j1(int i) {
        ly8 ly8Var = this.v;
        ly8Var.e = i;
        ly8Var.d = this.x != (i == -1) ? -1 : 1;
    }

    @Override // defpackage.vee
    public final int k(hfe hfeVar) {
        if (w() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return vd7.j(hfeVar, this.r, Q0(z), P0(z), this, this.I);
    }

    @Override // defpackage.vee
    public final void k0(cfe cfeVar, hfe hfeVar) {
        b1(cfeVar, hfeVar, true);
    }

    public final void k1(int i, hfe hfeVar) {
        int iN;
        int iN2;
        int i2;
        ly8 ly8Var = this.v;
        boolean z = false;
        ly8Var.b = 0;
        ly8Var.c = i;
        a29 a29Var = this.e;
        pic picVar = this.r;
        if (a29Var == null || !a29Var.k() || (i2 = hfeVar.a) == -1) {
            iN = 0;
            iN2 = 0;
        } else {
            if (this.x == (i2 < i)) {
                iN = picVar.n();
                iN2 = 0;
            } else {
                iN2 = picVar.n();
                iN = 0;
            }
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || !recyclerView.h) {
            ly8Var.g = picVar.h() + iN;
            ly8Var.f = -iN2;
        } else {
            ly8Var.f = picVar.m() - iN2;
            ly8Var.g = picVar.i() + iN;
        }
        ly8Var.h = false;
        ly8Var.a = true;
        if (picVar.k() == 0 && picVar.h() == 0) {
            z = true;
        }
        ly8Var.i = z;
    }

    @Override // defpackage.vee
    public final int l(hfe hfeVar) {
        return N0(hfeVar);
    }

    @Override // defpackage.vee
    public final void l0(hfe hfeVar) {
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    public final void l1(ou9 ou9Var, int i, int i2) {
        int i3 = ou9Var.c;
        int i4 = ou9Var.d;
        BitSet bitSet = this.y;
        if (i != -1) {
            int i5 = ou9Var.b;
            if (i5 == Integer.MIN_VALUE) {
                ou9Var.c();
                i5 = ou9Var.b;
            }
            if (i5 - i3 >= i2) {
                bitSet.set(i4, false);
                return;
            }
            return;
        }
        int i6 = ou9Var.a;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) ou9Var.e).get(0);
            mgg mggVar = (mgg) view.getLayoutParams();
            ou9Var.a = ((StaggeredGridLayoutManager) ou9Var.f).r.g(view);
            mggVar.getClass();
            i6 = ou9Var.a;
        }
        if (i6 + i3 <= i2) {
            bitSet.set(i4, false);
        }
    }

    @Override // defpackage.vee
    public final int m(hfe hfeVar) {
        if (w() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return vd7.l(hfeVar, this.r, Q0(z), P0(z), this, this.I);
    }

    @Override // defpackage.vee
    public final int n(hfe hfeVar) {
        if (w() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return vd7.j(hfeVar, this.r, Q0(z), P0(z), this, this.I);
    }

    @Override // defpackage.vee
    public final void n0(Parcelable parcelable) {
        if (parcelable instanceof ogg) {
            ogg oggVar = (ogg) parcelable;
            this.F = oggVar;
            if (this.z != -1) {
                oggVar.a = -1;
                oggVar.b = -1;
                oggVar.d = null;
                oggVar.c = 0;
                oggVar.e = 0;
                oggVar.f = null;
                oggVar.g = null;
            }
            x0();
        }
    }

    @Override // defpackage.vee
    public final int o(hfe hfeVar) {
        return N0(hfeVar);
    }

    @Override // defpackage.vee
    public final Parcelable o0() {
        int iK;
        int iM;
        int[] iArr;
        ogg oggVar = this.F;
        if (oggVar != null) {
            ogg oggVar2 = new ogg();
            oggVar2.c = oggVar.c;
            oggVar2.a = oggVar.a;
            oggVar2.b = oggVar.b;
            oggVar2.d = oggVar.d;
            oggVar2.e = oggVar.e;
            oggVar2.f = oggVar.f;
            oggVar2.h = oggVar.h;
            oggVar2.i = oggVar.i;
            oggVar2.j = oggVar.j;
            oggVar2.g = oggVar.g;
            return oggVar2;
        }
        ogg oggVar3 = new ogg();
        oggVar3.h = this.w;
        oggVar3.i = this.D;
        oggVar3.j = this.E;
        h6f h6fVar = this.B;
        if (h6fVar == null || (iArr = (int[]) h6fVar.b) == null) {
            oggVar3.e = 0;
        } else {
            oggVar3.f = iArr;
            oggVar3.e = iArr.length;
            oggVar3.g = (ArrayList) h6fVar.c;
        }
        if (w() <= 0) {
            oggVar3.a = -1;
            oggVar3.b = -1;
            oggVar3.c = 0;
            return oggVar3;
        }
        oggVar3.a = this.D ? U0() : T0();
        View viewP0 = this.x ? P0(true) : Q0(true);
        oggVar3.b = viewP0 != null ? vee.M(viewP0) : -1;
        int i = this.p;
        oggVar3.c = i;
        oggVar3.d = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            boolean z = this.D;
            pic picVar = this.r;
            ou9[] ou9VarArr = this.q;
            if (z) {
                iK = ou9VarArr[i2].i(Integer.MIN_VALUE);
                if (iK != Integer.MIN_VALUE) {
                    iM = picVar.i();
                    iK -= iM;
                }
            } else {
                iK = ou9VarArr[i2].k(Integer.MIN_VALUE);
                if (iK != Integer.MIN_VALUE) {
                    iM = picVar.m();
                    iK -= iM;
                }
            }
            oggVar3.d[i2] = iK;
        }
        return oggVar3;
    }

    @Override // defpackage.vee
    public final int p(hfe hfeVar) {
        if (w() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return vd7.l(hfeVar, this.r, Q0(z), P0(z), this, this.I);
    }

    @Override // defpackage.vee
    public final void p0(int i) {
        if (i == 0) {
            M0();
        }
    }

    @Override // defpackage.vee
    public final wee s() {
        return this.t == 0 ? new mgg(-2, -1) : new mgg(-1, -2);
    }

    @Override // defpackage.vee
    public final wee t(Context context, AttributeSet attributeSet) {
        return new mgg(context, attributeSet);
    }

    @Override // defpackage.vee
    public final wee u(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new mgg((ViewGroup.MarginLayoutParams) layoutParams) : new mgg(layoutParams);
    }

    @Override // defpackage.vee
    public final int y0(int i, cfe cfeVar, hfe hfeVar) {
        return i1(i, cfeVar, hfeVar);
    }

    @Override // defpackage.vee
    public final void z0(int i) {
        ogg oggVar = this.F;
        if (oggVar != null && oggVar.a != i) {
            oggVar.d = null;
            oggVar.c = 0;
            oggVar.a = -1;
            oggVar.b = -1;
        }
        this.z = i;
        this.A = Integer.MIN_VALUE;
        x0();
    }
}
