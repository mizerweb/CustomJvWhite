package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ig4 extends hg4 {
    public vo2[] A0;
    public vo2[] B0;
    public int C0;
    public boolean D0;
    public boolean E0;
    public WeakReference F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public final HashSet J0;
    public final mt0 K0;
    public ArrayList p0 = new ArrayList();
    public final ks6 q0;
    public final th5 r0;
    public int s0;
    public vf4 t0;
    public boolean u0;
    public final b29 v0;
    public int w0;
    public int x0;
    public int y0;
    public int z0;

    public ig4() {
        ks6 ks6Var = new ks6();
        ks6Var.a = new ArrayList();
        ks6Var.b = new mt0();
        ks6Var.c = this;
        this.q0 = ks6Var;
        th5 th5Var = new th5();
        th5Var.a = true;
        th5Var.b = true;
        th5Var.e = new ArrayList();
        new ArrayList();
        th5Var.g = null;
        th5Var.h = new mt0();
        th5Var.f = new ArrayList();
        th5Var.c = this;
        th5Var.d = this;
        this.r0 = th5Var;
        this.t0 = null;
        this.u0 = false;
        this.v0 = new b29();
        this.y0 = 0;
        this.z0 = 0;
        this.A0 = new vo2[4];
        this.B0 = new vo2[4];
        this.C0 = 257;
        this.D0 = false;
        this.E0 = false;
        this.F0 = null;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = new HashSet();
        this.K0 = new mt0();
    }

    public static void R(hg4 hg4Var, vf4 vf4Var, mt0 mt0Var) {
        int i;
        int i2;
        if (vf4Var == null) {
            return;
        }
        int i3 = hg4Var.f0;
        int[] iArr = hg4Var.t;
        if (i3 == 8 || (hg4Var instanceof or7) || (hg4Var instanceof tp0)) {
            mt0Var.e = 0;
            mt0Var.f = 0;
            return;
        }
        int[] iArr2 = hg4Var.o0;
        mt0Var.a = iArr2[0];
        mt0Var.b = iArr2[1];
        mt0Var.c = hg4Var.o();
        mt0Var.d = hg4Var.i();
        mt0Var.i = false;
        mt0Var.j = 0;
        boolean z = mt0Var.a == 3;
        boolean z2 = mt0Var.b == 3;
        boolean z3 = z && hg4Var.V > 0.0f;
        boolean z4 = z2 && hg4Var.V > 0.0f;
        if (z && hg4Var.r(0) && hg4Var.r == 0 && !z3) {
            mt0Var.a = 2;
            if (z2 && hg4Var.s == 0) {
                mt0Var.a = 1;
            }
            z = false;
        }
        if (z2 && hg4Var.r(1) && hg4Var.s == 0 && !z4) {
            mt0Var.b = 2;
            if (z && hg4Var.r == 0) {
                mt0Var.b = 1;
            }
            z2 = false;
        }
        if (hg4Var.y()) {
            mt0Var.a = 1;
            z = false;
        }
        if (hg4Var.z()) {
            mt0Var.b = 1;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                mt0Var.a = 1;
            } else if (!z2) {
                if (mt0Var.b == 1) {
                    i2 = mt0Var.d;
                } else {
                    mt0Var.a = 2;
                    vf4Var.b(hg4Var, mt0Var);
                    i2 = mt0Var.f;
                }
                mt0Var.a = 1;
                mt0Var.c = (int) (hg4Var.V * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                mt0Var.b = 1;
            } else if (!z) {
                if (mt0Var.a == 1) {
                    i = mt0Var.c;
                } else {
                    mt0Var.b = 2;
                    vf4Var.b(hg4Var, mt0Var);
                    i = mt0Var.e;
                }
                mt0Var.b = 1;
                int i4 = hg4Var.W;
                float f = hg4Var.V;
                if (i4 == -1) {
                    mt0Var.d = (int) (i / f);
                } else {
                    mt0Var.d = (int) (f * i);
                }
            }
        }
        vf4Var.b(hg4Var, mt0Var);
        hg4Var.K(mt0Var.e);
        hg4Var.H(mt0Var.f);
        hg4Var.E = mt0Var.h;
        int i5 = mt0Var.g;
        hg4Var.Z = i5;
        hg4Var.E = i5 > 0;
        mt0Var.j = 0;
    }

    @Override // defpackage.hg4
    public final void A() {
        this.v0.t();
        this.w0 = 0;
        this.x0 = 0;
        this.p0.clear();
        super.A();
    }

    @Override // defpackage.hg4
    public final void C(vbf vbfVar) {
        super.C(vbfVar);
        int size = this.p0.size();
        for (int i = 0; i < size; i++) {
            ((hg4) this.p0.get(i)).C(vbfVar);
        }
    }

    @Override // defpackage.hg4
    public final void L(boolean z, boolean z2) {
        super.L(z, z2);
        int size = this.p0.size();
        for (int i = 0; i < size; i++) {
            ((hg4) this.p0.get(i)).L(z, z2);
        }
    }

    public final void N(hg4 hg4Var, int i) {
        if (i == 0) {
            int i2 = this.y0 + 1;
            vo2[] vo2VarArr = this.B0;
            if (i2 >= vo2VarArr.length) {
                this.B0 = (vo2[]) Arrays.copyOf(vo2VarArr, vo2VarArr.length * 2);
            }
            vo2[] vo2VarArr2 = this.B0;
            int i3 = this.y0;
            vo2VarArr2[i3] = new vo2(hg4Var, 0, this.u0);
            this.y0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.z0 + 1;
            vo2[] vo2VarArr3 = this.A0;
            if (i4 >= vo2VarArr3.length) {
                this.A0 = (vo2[]) Arrays.copyOf(vo2VarArr3, vo2VarArr3.length * 2);
            }
            vo2[] vo2VarArr4 = this.A0;
            int i5 = this.z0;
            vo2VarArr4[i5] = new vo2(hg4Var, 1, this.u0);
            this.z0 = i5 + 1;
        }
    }

    public final void O(b29 b29Var) {
        ig4 ig4Var;
        b29 b29Var2;
        boolean zS = S(64);
        b(b29Var, zS);
        int size = this.p0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            hg4 hg4Var = (hg4) this.p0.get(i);
            boolean[] zArr = hg4Var.R;
            zArr[0] = false;
            zArr[1] = false;
            if (hg4Var instanceof tp0) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                hg4 hg4Var2 = (hg4) this.p0.get(i2);
                if (hg4Var2 instanceof tp0) {
                    tp0 tp0Var = (tp0) hg4Var2;
                    for (int i3 = 0; i3 < tp0Var.q0; i3++) {
                        hg4 hg4Var3 = tp0Var.p0[i3];
                        if (tp0Var.s0 || hg4Var3.c()) {
                            int i4 = tp0Var.r0;
                            if (i4 == 0 || i4 == 1) {
                                hg4Var3.R[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                hg4Var3.R[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.J0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            hg4 hg4Var4 = (hg4) this.p0.get(i5);
            hg4Var4.getClass();
            if (hg4Var4 instanceof or7) {
                hg4Var4.b(b29Var, zS);
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            if (it.hasNext()) {
                ((hg4) it.next()).getClass();
                ore.m();
                return;
            } else if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((hg4) it2.next()).b(b29Var, zS);
                }
                hashSet.clear();
            }
        }
        if (b29.p) {
            HashSet<hg4> hashSet2 = new HashSet();
            for (int i6 = 0; i6 < size; i6++) {
                hg4 hg4Var5 = (hg4) this.p0.get(i6);
                hg4Var5.getClass();
                if (!(hg4Var5 instanceof or7)) {
                    hashSet2.add(hg4Var5);
                }
            }
            ig4Var = this;
            b29Var2 = b29Var;
            ig4Var.a(this, b29Var2, hashSet2, this.o0[0] == 2 ? 0 : 1, false);
            for (hg4 hg4Var6 : hashSet2) {
                sb8.i(ig4Var, b29Var2, hg4Var6);
                hg4Var6.b(b29Var2, zS);
            }
        } else {
            ig4Var = this;
            b29Var2 = b29Var;
            for (int i7 = 0; i7 < size; i7++) {
                hg4 hg4Var7 = (hg4) ig4Var.p0.get(i7);
                if (hg4Var7 instanceof ig4) {
                    int[] iArr = hg4Var7.o0;
                    int i8 = iArr[0];
                    int i9 = iArr[1];
                    if (i8 == 2) {
                        hg4Var7.I(1);
                    }
                    if (i9 == 2) {
                        hg4Var7.J(1);
                    }
                    hg4Var7.b(b29Var2, zS);
                    if (i8 == 2) {
                        hg4Var7.I(i8);
                    }
                    if (i9 == 2) {
                        hg4Var7.J(i9);
                    }
                } else {
                    sb8.i(ig4Var, b29Var2, hg4Var7);
                    if (!(hg4Var7 instanceof or7)) {
                        hg4Var7.b(b29Var2, zS);
                    }
                }
            }
        }
        if (ig4Var.y0 > 0) {
            rkl.a(ig4Var, b29Var2, null, 0);
        }
        if (ig4Var.z0 > 0) {
            rkl.a(ig4Var, b29Var2, null, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    public final boolean P(int i, boolean z) {
        boolean z2;
        th5 th5Var = this.r0;
        ArrayList<zvj> arrayList = (ArrayList) th5Var.e;
        ig4 ig4Var = (ig4) th5Var.c;
        boolean z3 = false;
        int iH = ig4Var.h(0);
        int iH2 = ig4Var.h(1);
        int iP = ig4Var.p();
        int iQ = ig4Var.q();
        if (z && (iH == 2 || iH2 == 2)) {
            for (zvj zvjVar : arrayList) {
                if (zvjVar.f == i && !zvjVar.k()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && iH == 2) {
                    ig4Var.I(1);
                    ig4Var.K(th5Var.e(ig4Var, 0));
                    ig4Var.d.e.d(ig4Var.o());
                }
            } else if (z && iH2 == 2) {
                ig4Var.J(1);
                ig4Var.H(th5Var.e(ig4Var, 1));
                ig4Var.e.e.d(ig4Var.i());
            }
        }
        int[] iArr = ig4Var.o0;
        if (i == 0) {
            int i2 = iArr[0];
            if (i2 == 1 || i2 == 4) {
                int iO = ig4Var.o() + iP;
                ig4Var.d.i.d(iO);
                ig4Var.d.e.d(iO - iP);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            int i3 = iArr[1];
            if (i3 == 1 || i3 == 4) {
                int i4 = ig4Var.i() + iQ;
                ig4Var.e.i.d(i4);
                ig4Var.e.e.d(i4 - iQ);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        th5Var.i();
        for (zvj zvjVar2 : arrayList) {
            if (zvjVar2.f == i && (zvjVar2.b != ig4Var || zvjVar2.g)) {
                zvjVar2.e();
            }
        }
        for (zvj zvjVar3 : arrayList) {
            if (zvjVar3.f == i && (z2 || zvjVar3.b != ig4Var)) {
                if (!zvjVar3.h.j || !zvjVar3.i.j || (!(zvjVar3 instanceof wo2) && !zvjVar3.e.j)) {
                    ig4Var.I(iH);
                    ig4Var.J(iH2);
                    return z3;
                }
            }
        }
        z3 = true;
        ig4Var.I(iH);
        ig4Var.J(iH2);
        return z3;
    }

    /* JADX WARN: Code duplicated, block: B:292:0x051c  */
    /* JADX WARN: Code duplicated, block: B:293:0x051e  */
    /* JADX WARN: Code duplicated, block: B:62:0x012c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v56 */
    /* JADX WARN: Type inference failed for: r14v57 */
    /* JADX WARN: Type inference failed for: r14v58 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r28v0, types: [hg4, ig4] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    public final void Q() {
        ?? r21;
        int i;
        boolean z;
        char c;
        of4 of4Var;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        ?? r2;
        ?? r17;
        boolean z7;
        ?? r0;
        boolean z8;
        int i2;
        boolean z9;
        ?? r1;
        ?? r14;
        boolean z10;
        int i3;
        boolean z11;
        boolean z12;
        ?? r3;
        ?? r4;
        int i4;
        boolean z13;
        boolean[] zArr = sb8.d;
        this.X = 0;
        this.Y = 0;
        this.D0 = false;
        this.E0 = false;
        int size = this.p0.size();
        int iMax = Math.max(0, o());
        int iMax2 = Math.max(0, i());
        int[] iArr = this.o0;
        int i5 = iArr[1];
        int i6 = iArr[0];
        int i7 = this.s0;
        of4 of4Var2 = this.I;
        of4 of4Var3 = this.H;
        if (i7 == 0 && sb8.q(this.C0, 1)) {
            vf4 vf4Var = this.t0;
            int i8 = iArr[0];
            int i9 = iArr[1];
            B();
            ArrayList arrayList = this.p0;
            int size2 = arrayList.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((hg4) arrayList.get(i10)).B();
            }
            boolean z14 = this.u0;
            if (i8 == 1) {
                F(0, o());
            } else {
                of4Var3.i(0);
                this.X = 0;
            }
            int i11 = 0;
            boolean z15 = false;
            boolean z16 = false;
            while (i11 < size2) {
                int i12 = i11;
                hg4 hg4Var = (hg4) arrayList.get(i11);
                int[] iArr2 = iArr;
                if (hg4Var instanceof or7) {
                    or7 or7Var = (or7) hg4Var;
                    z13 = z15;
                    if (or7Var.t0 == 1) {
                        int i13 = or7Var.q0;
                        if (i13 != -1) {
                            or7Var.N(i13);
                        } else if (or7Var.r0 != -1 && y()) {
                            or7Var.N(o() - or7Var.r0);
                        } else if (y()) {
                            or7Var.N((int) ((or7Var.p0 * o()) + 0.5f));
                        }
                        z13 = true;
                    }
                } else {
                    z13 = z15;
                    if ((hg4Var instanceof tp0) && ((tp0) hg4Var).P() == 0) {
                        z15 = z13;
                        z16 = true;
                    }
                    i11 = i12 + 1;
                    iArr = iArr2;
                }
                z15 = z13;
                i11 = i12 + 1;
                iArr = iArr2;
            }
            r21 = iArr;
            if (z15) {
                for (int i14 = 0; i14 < size2; i14 = i4 + 1) {
                    hg4 hg4Var2 = (hg4) arrayList.get(i14);
                    if (hg4Var2 instanceof or7) {
                        or7 or7Var2 = (or7) hg4Var2;
                        i4 = i14;
                        if (or7Var2.t0 == 1) {
                            n1g.I(0, vf4Var, or7Var2, z14);
                        }
                    } else {
                        i4 = i14;
                    }
                }
            }
            n1g.I(0, vf4Var, this, z14);
            if (z16) {
                for (int i15 = 0; i15 < size2; i15++) {
                    hg4 hg4Var3 = (hg4) arrayList.get(i15);
                    if (hg4Var3 instanceof tp0) {
                        tp0 tp0Var = (tp0) hg4Var3;
                        if (tp0Var.P() == 0 && tp0Var.O()) {
                            n1g.I(1, vf4Var, tp0Var, z14);
                        }
                    }
                }
            }
            if (i9 == 1) {
                G(0, i());
            } else {
                of4Var2.i(0);
                this.Y = 0;
            }
            int i16 = 0;
            boolean z17 = false;
            boolean z18 = false;
            while (i16 < size2) {
                hg4 hg4Var4 = (hg4) arrayList.get(i16);
                int i17 = i16;
                if (hg4Var4 instanceof or7) {
                    or7 or7Var3 = (or7) hg4Var4;
                    if (or7Var3.t0 == 0) {
                        int i18 = or7Var3.q0;
                        if (i18 != -1) {
                            or7Var3.N(i18);
                        } else if (or7Var3.r0 != -1 && z()) {
                            or7Var3.N(i() - or7Var3.r0);
                        } else if (z()) {
                            or7Var3.N((int) ((or7Var3.p0 * i()) + 0.5f));
                        }
                        z17 = true;
                    }
                } else if ((hg4Var4 instanceof tp0) && ((tp0) hg4Var4).P() == 1) {
                    z18 = true;
                }
                i16 = i17 + 1;
            }
            if (z17) {
                for (int i19 = 0; i19 < size2; i19++) {
                    hg4 hg4Var5 = (hg4) arrayList.get(i19);
                    if (hg4Var5 instanceof or7) {
                        or7 or7Var4 = (or7) hg4Var5;
                        if (or7Var4.t0 == 0) {
                            n1g.i0(1, vf4Var, or7Var4);
                        }
                    }
                }
            }
            n1g.i0(0, vf4Var, this);
            if (z18) {
                for (int i20 = 0; i20 < size2; i20++) {
                    hg4 hg4Var6 = (hg4) arrayList.get(i20);
                    if (hg4Var6 instanceof tp0) {
                        tp0 tp0Var2 = (tp0) hg4Var6;
                        if (tp0Var2.P() == 1 && tp0Var2.O()) {
                            n1g.i0(1, vf4Var, tp0Var2);
                        }
                    }
                }
            }
            for (int i21 = 0; i21 < size2; i21++) {
                hg4 hg4Var7 = (hg4) arrayList.get(i21);
                if (hg4Var7.x() && n1g.j(hg4Var7)) {
                    R(hg4Var7, vf4Var, n1g.c);
                    if (!(hg4Var7 instanceof or7)) {
                        n1g.I(0, vf4Var, hg4Var7, z14);
                        n1g.i0(0, vf4Var, hg4Var7);
                    } else if (((or7) hg4Var7).t0 == 0) {
                        n1g.i0(0, vf4Var, hg4Var7);
                    } else {
                        n1g.I(0, vf4Var, hg4Var7, z14);
                    }
                }
            }
            for (int i22 = 0; i22 < size; i22++) {
                hg4 hg4Var8 = (hg4) this.p0.get(i22);
                if (hg4Var8.x() && !(hg4Var8 instanceof or7) && !(hg4Var8 instanceof tp0)) {
                    int iH = hg4Var8.h(0);
                    int iH2 = hg4Var8.h(1);
                    if (iH != 3 || hg4Var8.r == 1 || iH2 != 3 || hg4Var8.s == 1) {
                        R(hg4Var8, this.t0, new mt0());
                    }
                }
            }
        } else {
            r21 = iArr;
        }
        int i23 = 2;
        if (size <= 2 || !((i6 == 2 || i5 == 2) && sb8.q(this.C0, 1024) && f0m.f(this, this.t0))) {
            i = iMax;
            z = false;
        } else {
            if (i6 == 2) {
                if (iMax >= o() || iMax <= 0) {
                    iMax = o();
                } else {
                    K(iMax);
                    this.D0 = true;
                }
            }
            if (i5 == 2) {
                if (iMax2 >= i() || iMax2 <= 0) {
                    iMax2 = i();
                } else {
                    H(iMax2);
                    this.E0 = true;
                }
            }
            i = iMax;
            z = true;
        }
        boolean z19 = S(64) || S(np0.m);
        b29 b29Var = this.v0;
        b29Var.getClass();
        b29Var.g = false;
        if (this.C0 == 0 || !z19) {
            c = 1;
        } else {
            c = 1;
            b29Var.g = true;
        }
        ArrayList arrayList2 = this.p0;
        boolean z20 = r21[0] == 2 || r21[c] == 2;
        this.y0 = 0;
        this.z0 = 0;
        int i24 = 0;
        while (i24 < size) {
            hg4 hg4Var9 = (hg4) this.p0.get(i24);
            int i25 = i23;
            if (hg4Var9 instanceof ig4) {
                ((ig4) hg4Var9).Q();
            }
            i24++;
            i23 = i25;
        }
        int i26 = i23;
        boolean zS = S(64);
        ?? r15 = z;
        int i27 = 0;
        boolean z21 = true;
        while (z21) {
            int i28 = i27 + 1;
            try {
                b29Var.t();
                z2 = z20;
                try {
                    this.y0 = 0;
                    this.z0 = 0;
                    e(b29Var);
                    for (int i29 = 0; i29 < size; i29++) {
                        ((hg4) this.p0.get(i29)).e(b29Var);
                    }
                    O(b29Var);
                    try {
                        WeakReference weakReference = this.F0;
                        if (weakReference == null || weakReference.get() == null) {
                            of4Var = of4Var2;
                        } else {
                            of4Var = of4Var2;
                            try {
                                b29Var.f(b29Var.k((of4) this.F0.get()), b29Var.k(of4Var2), 0, 5);
                                this.F0 = null;
                            } catch (Exception e) {
                                e = e;
                                z3 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                z4 = z3;
                            }
                        }
                        WeakReference weakReference2 = this.H0;
                        if (weakReference2 != null && weakReference2.get() != null) {
                            b29Var.f(b29Var.k(this.K), b29Var.k((of4) this.H0.get()), 0, 5);
                            this.H0 = null;
                        }
                        WeakReference weakReference3 = this.G0;
                        if (weakReference3 != null && weakReference3.get() != null) {
                            b29Var.f(b29Var.k((of4) this.G0.get()), b29Var.k(of4Var3), 0, 5);
                            this.G0 = null;
                        }
                        WeakReference weakReference4 = this.I0;
                        if (weakReference4 != null && weakReference4.get() != null) {
                            b29Var.f(b29Var.k(this.J), b29Var.k((of4) this.I0.get()), 0, 5);
                            this.I0 = null;
                        }
                        b29Var.p();
                        z4 = true;
                    } catch (Exception e2) {
                        e = e2;
                        of4Var = of4Var2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    of4Var = of4Var2;
                    z3 = z21;
                }
            } catch (Exception e4) {
                e = e4;
                of4Var = of4Var2;
                z2 = z20;
                z3 = z21;
            }
            if (z4) {
                zArr[i26] = false;
                boolean zS2 = S(64);
                M(b29Var, zS2);
                int size3 = this.p0.size();
                int i30 = 0;
                boolean z22 = false;
                while (i30 < size3) {
                    hg4 hg4Var10 = (hg4) this.p0.get(i30);
                    hg4Var10.M(b29Var, zS2);
                    boolean z23 = zS2;
                    int i31 = size3;
                    if (hg4Var10.h != -1 || hg4Var10.i != -1) {
                        z22 = true;
                    }
                    i30++;
                    zS2 = z23;
                    size3 = i31;
                    z22 = z22;
                }
                z5 = z22;
            } else {
                M(b29Var, zS);
                for (int i32 = 0; i32 < size; i32++) {
                    ((hg4) this.p0.get(i32)).M(b29Var, zS);
                }
                z5 = false;
            }
            if (z2 && i28 < 8 && zArr[i26]) {
                int i33 = 0;
                int iMax3 = 0;
                int iMax4 = 0;
                while (i33 < size) {
                    hg4 hg4Var11 = (hg4) this.p0.get(i33);
                    iMax4 = Math.max(iMax4, hg4Var11.o() + hg4Var11.X);
                    iMax3 = Math.max(iMax3, hg4Var11.i() + hg4Var11.Y);
                    i33++;
                    zS = zS;
                }
                z6 = zS;
                int iMax5 = Math.max(this.a0, iMax4);
                int iMax6 = Math.max(this.b0, iMax3);
                int i34 = i26;
                r15 = r15;
                z5 = z5;
                if (i6 == i34 && o() < iMax5) {
                    r15 = r15;
                    z5 = z5;
                    K(iMax5);
                    r21[0] = i34;
                    r15 = 1;
                    z5 = true;
                }
                if (i5 == i34 && i() < iMax6) {
                    H(iMax6);
                    r21[1] = i34;
                    r15 = 1;
                    z5 = true;
                }
            } else {
                z6 = zS;
            }
            int iMax7 = Math.max(this.a0, o());
            if (iMax7 > o()) {
                K(iMax7);
                r2 = 1;
                r21[0] = 1;
                z7 = true;
                r17 = 1;
            } else {
                r2 = 1;
                r17 = r15;
                z7 = z5;
            }
            int iMax8 = Math.max(this.b0, i());
            if (iMax8 > i()) {
                H(iMax8);
                r21[r2] = r2;
                r4 = r2;
                z8 = r4 == true ? 1 : 0;
            } else {
                r0 = r17;
            }
            if (r0 == 0) {
                z8 = z7;
                if (r21[0] == 2 && i > 0) {
                    r3 = r0;
                    z12 = z8;
                    if (o() > i) {
                        this.D0 = r2;
                        r21[0] = r2;
                        K(i);
                        ?? r5 = r2;
                        z12 = r5 == true ? 1 : 0;
                        r3 = r5;
                    }
                }
                r0 = r4;
                r3 = r0;
                r3 = r0;
                z12 = z8;
                z12 = z8;
                i2 = 2;
                r1 = r3;
                r1 = r3;
                z9 = z12;
                z9 = z12;
                if (r21[r2] == 2 && iMax2 > 0 && i() > iMax2) {
                    this.E0 = r2;
                    r21[r2] = r2;
                    H(iMax2);
                    i3 = 8;
                    z10 = true;
                    r14 = 1;
                }
                if (i28 > i3) {
                    r1 = r3;
                    z9 = z12;
                    z11 = false;
                } else {
                    r1 = r3;
                    z9 = z12;
                    z11 = z10;
                }
                i27 = i28;
                i26 = i2;
                z20 = z2;
                of4Var3 = of4Var3;
                of4Var2 = of4Var;
                zS = z6;
                r15 = r14;
                z21 = z11;
            } else {
                z8 = z7;
                r0 = r4;
                i2 = 2;
                r1 = r0;
                z9 = z8;
            }
            r1 = r3;
            z9 = z12;
            r14 = r1;
            z10 = z9;
            i3 = 8;
            if (i28 > i3) {
                r1 = r3;
                z9 = z12;
                z11 = false;
            } else {
                r1 = r3;
                z9 = z12;
                z11 = z10;
            }
            i27 = i28;
            i26 = i2;
            z20 = z2;
            of4Var3 = of4Var3;
            of4Var2 = of4Var;
            zS = z6;
            r15 = r14;
            z21 = z11;
        }
        this.p0 = arrayList2;
        if (r15 != 0) {
            r21[0] = i6;
            r21[1] = i5;
        }
        C(b29Var.l);
    }

    public final boolean S(int i) {
        return (this.C0 & i) == i;
    }

    @Override // defpackage.hg4
    public final void l(StringBuilder sb) {
        sb.append(this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.T);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.U);
        sb.append("\n");
        Iterator it = this.p0.iterator();
        while (it.hasNext()) {
            ((hg4) it.next()).l(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
