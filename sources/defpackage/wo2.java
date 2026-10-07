package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class wo2 extends zvj {
    public final ArrayList k;
    public int l;

    public wo2(hg4 hg4Var, int i) {
        hg4 hg4Var2;
        super(hg4Var);
        ArrayList<zvj> arrayList = new ArrayList();
        this.k = arrayList;
        this.f = i;
        hg4 hg4Var3 = this.b;
        hg4 hg4VarK = hg4Var3.k(i);
        while (true) {
            hg4Var2 = hg4Var3;
            hg4Var3 = hg4VarK;
            if (hg4Var3 == null) {
                break;
            } else {
                hg4VarK = hg4Var3.k(this.f);
            }
        }
        this.b = hg4Var2;
        int i2 = this.f;
        arrayList.add(i2 == 0 ? hg4Var2.d : i2 == 1 ? hg4Var2.e : null);
        hg4 hg4VarJ = hg4Var2.j(this.f);
        while (hg4VarJ != null) {
            int i3 = this.f;
            arrayList.add(i3 == 0 ? hg4VarJ.d : i3 == 1 ? hg4VarJ.e : null);
            hg4VarJ = hg4VarJ.j(this.f);
        }
        for (zvj zvjVar : arrayList) {
            int i4 = this.f;
            if (i4 == 0) {
                zvjVar.b.b = this;
            } else if (i4 == 1) {
                zvjVar.b.c = this;
            }
        }
        if (this.f == 0 && ((ig4) this.b.S).u0 && arrayList.size() > 1) {
            this.b = ((zvj) qv1.f(1, arrayList)).b;
        }
        int i5 = this.f;
        hg4 hg4Var4 = this.b;
        this.l = i5 == 0 ? hg4Var4.h0 : hg4Var4.i0;
    }

    /* JADX WARN: Code duplicated, block: B:293:0x00e8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:64:0x00da  */
    /* JADX WARN: Code duplicated, block: B:65:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e0 A[ADDED_TO_REGION] */
    @Override // defpackage.qh5
    public final void a(qh5 qh5Var) {
        int i;
        int i2;
        boolean z;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f3;
        uh5 uh5Var = this.h;
        if (uh5Var.j) {
            uh5 uh5Var2 = this.i;
            if (uh5Var2.j) {
                hg4 hg4Var = this.b.S;
                boolean z2 = hg4Var instanceof ig4 ? ((ig4) hg4Var).u0 : false;
                int i13 = uh5Var2.g - uh5Var.g;
                ArrayList arrayList = this.k;
                int size = arrayList.size();
                int i14 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i14 >= size) {
                        i14 = -1;
                        break;
                    } else if (((zvj) arrayList.get(i14)).b.f0 != 8) {
                        break;
                    } else {
                        i14++;
                    }
                }
                int i15 = size - 1;
                for (int i16 = i15; i16 >= 0; i16--) {
                    if (((zvj) arrayList.get(i16)).b.f0 != 8) {
                        i = i16;
                        break;
                    }
                }
                int i17 = 0;
                while (true) {
                    if (i17 >= 2) {
                        z = z2;
                        f = 0.0f;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        break;
                    }
                    f = 0.0f;
                    int i18 = 0;
                    i5 = 0;
                    int i19 = 0;
                    int i20 = 0;
                    while (i18 < size) {
                        zvj zvjVar = (zvj) arrayList.get(i18);
                        hg4 hg4Var2 = zvjVar.b;
                        boolean z3 = z2;
                        if (hg4Var2.f0 == i2) {
                            i11 = i17;
                        } else {
                            i20++;
                            if (i18 > 0 && i18 >= i14) {
                                i5 += zvjVar.h.f;
                            }
                            xl5 xl5Var = zvjVar.e;
                            int i21 = xl5Var.g;
                            i11 = i17;
                            boolean z4 = zvjVar.d != 3;
                            if (z4) {
                                int i22 = this.f;
                                if (i22 == 0 && !hg4Var2.d.e.j) {
                                    return;
                                }
                                if (i22 == 1 && !hg4Var2.e.e.j) {
                                    return;
                                }
                            } else {
                                if (zvjVar.a == 1 && i11 == 0) {
                                    i12 = xl5Var.m;
                                    i19++;
                                } else {
                                    if (xl5Var.j) {
                                        i12 = i21;
                                    }
                                    if (z4) {
                                        i5 += i12;
                                    } else {
                                        i19++;
                                        f3 = hg4Var2.j0[this.f];
                                        if (f3 >= 0.0f) {
                                            f += f3;
                                        }
                                    }
                                    if (i18 >= i15 && i18 < i) {
                                        i5 += -zvjVar.i.f;
                                    }
                                }
                                z4 = true;
                                if (z4) {
                                    i19++;
                                    f3 = hg4Var2.j0[this.f];
                                    if (f3 >= 0.0f) {
                                        f += f3;
                                    }
                                } else {
                                    i5 += i12;
                                }
                                if (i18 >= i15) {
                                }
                            }
                            i12 = i21;
                            if (z4) {
                                i19++;
                                f3 = hg4Var2.j0[this.f];
                                if (f3 >= 0.0f) {
                                    f += f3;
                                }
                            } else {
                                i5 += i12;
                            }
                            if (i18 >= i15) {
                            }
                        }
                        i18++;
                        z2 = z3;
                        i17 = i11;
                        i2 = 8;
                    }
                    z = z2;
                    int i23 = i17;
                    if (i5 < i13 || i19 == 0) {
                        i3 = i19;
                        i4 = i20;
                        break;
                    } else {
                        i17 = i23 + 1;
                        z2 = z;
                        i2 = 8;
                    }
                }
                int i24 = uh5Var.g;
                if (z) {
                    i24 = uh5Var2.g;
                }
                float f4 = 0.5f;
                if (i5 > i13) {
                    i24 = z ? i24 + ((int) (((i5 - i13) / 2.0f) + 0.5f)) : i24 - ((int) (((i5 - i13) / 2.0f) + 0.5f));
                }
                if (i3 > 0) {
                    float f5 = i13 - i5;
                    int i25 = (int) ((f5 / i3) + 0.5f);
                    int i26 = 0;
                    int i27 = 0;
                    while (i26 < size) {
                        float f6 = f4;
                        zvj zvjVar2 = (zvj) arrayList.get(i26);
                        int i28 = i24;
                        hg4 hg4Var3 = zvjVar2.b;
                        int i29 = i3;
                        xl5 xl5Var2 = zvjVar2.e;
                        float f7 = f5;
                        int i30 = i25;
                        if (hg4Var3.f0 != 8 && zvjVar2.d == 3 && !xl5Var2.j) {
                            int i31 = f > 0.0f ? (int) (((hg4Var3.j0[this.f] * f7) / f) + f6) : i30;
                            if (this.f == 0) {
                                i9 = hg4Var3.v;
                                i10 = hg4Var3.u;
                            } else {
                                i9 = hg4Var3.y;
                                i10 = hg4Var3.x;
                            }
                            int iMax = Math.max(i10, zvjVar2.a == 1 ? Math.min(i31, xl5Var2.m) : i31);
                            if (i9 > 0) {
                                iMax = Math.min(i9, iMax);
                            }
                            if (iMax != i31) {
                                i27++;
                                i31 = iMax;
                            }
                            xl5Var2.d(i31);
                        }
                        i26++;
                        i24 = i28;
                        f4 = f6;
                        i3 = i29;
                        f5 = f7;
                        i25 = i30;
                    }
                    i6 = i24;
                    f2 = f4;
                    int i32 = i3;
                    if (i27 > 0) {
                        i3 = i32 - i27;
                        i5 = 0;
                        for (int i33 = 0; i33 < size; i33++) {
                            zvj zvjVar3 = (zvj) arrayList.get(i33);
                            if (zvjVar3.b.f0 != 8) {
                                if (i33 > 0 && i33 >= i14) {
                                    i5 += zvjVar3.h.f;
                                }
                                i5 += zvjVar3.e.g;
                                if (i33 < i15 && i33 < i) {
                                    i5 += -zvjVar3.i.f;
                                }
                            }
                        }
                    } else {
                        i3 = i32;
                    }
                    i8 = 2;
                    if (this.l == 2 && i27 == 0) {
                        i7 = 0;
                        this.l = 0;
                    } else {
                        i7 = 0;
                    }
                } else {
                    i6 = i24;
                    f2 = 0.5f;
                    i7 = 0;
                    i8 = 2;
                }
                if (i5 > i13) {
                    this.l = i8;
                }
                if (i4 > 0 && i3 == 0 && i14 == i) {
                    this.l = i8;
                }
                int i34 = this.l;
                if (i34 == 1) {
                    int i35 = i4 > 1 ? (i13 - i5) / (i4 - 1) : i4 == 1 ? (i13 - i5) / 2 : i7;
                    if (i3 > 0) {
                        i35 = i7;
                    }
                    int i36 = i6;
                    for (int i37 = i7; i37 < size; i37++) {
                        zvj zvjVar4 = (zvj) arrayList.get(z ? size - (i37 + 1) : i37);
                        hg4 hg4Var4 = zvjVar4.b;
                        uh5 uh5Var3 = zvjVar4.i;
                        uh5 uh5Var4 = zvjVar4.h;
                        if (hg4Var4.f0 == 8) {
                            uh5Var4.d(i36);
                            uh5Var3.d(i36);
                        } else {
                            if (i37 > 0) {
                                i36 = z ? i36 - i35 : i36 + i35;
                            }
                            if (i37 > 0 && i37 >= i14) {
                                i36 = z ? i36 - uh5Var4.f : i36 + uh5Var4.f;
                            }
                            if (z) {
                                uh5Var3.d(i36);
                            } else {
                                uh5Var4.d(i36);
                            }
                            xl5 xl5Var3 = zvjVar4.e;
                            int i38 = xl5Var3.g;
                            if (zvjVar4.d == 3 && zvjVar4.a == 1) {
                                i38 = xl5Var3.m;
                            }
                            i36 = z ? i36 - i38 : i36 + i38;
                            if (z) {
                                uh5Var4.d(i36);
                            } else {
                                uh5Var3.d(i36);
                            }
                            zvjVar4.g = true;
                            if (i37 < i15 && i37 < i) {
                                i36 = z ? i36 - (-uh5Var3.f) : i36 + (-uh5Var3.f);
                            }
                        }
                    }
                    return;
                }
                if (i34 == 0) {
                    int i39 = (i13 - i5) / (i4 + 1);
                    if (i3 > 0) {
                        i39 = i7;
                    }
                    int i40 = i6;
                    for (int i41 = i7; i41 < size; i41++) {
                        zvj zvjVar5 = (zvj) arrayList.get(z ? size - (i41 + 1) : i41);
                        hg4 hg4Var5 = zvjVar5.b;
                        uh5 uh5Var5 = zvjVar5.i;
                        uh5 uh5Var6 = zvjVar5.h;
                        if (hg4Var5.f0 == 8) {
                            uh5Var6.d(i40);
                            uh5Var5.d(i40);
                        } else {
                            int i42 = z ? i40 - i39 : i40 + i39;
                            if (i41 > 0 && i41 >= i14) {
                                i42 = z ? i42 - uh5Var6.f : i42 + uh5Var6.f;
                            }
                            if (z) {
                                uh5Var5.d(i42);
                            } else {
                                uh5Var6.d(i42);
                            }
                            xl5 xl5Var4 = zvjVar5.e;
                            int iMin = xl5Var4.g;
                            if (zvjVar5.d == 3 && zvjVar5.a == 1) {
                                iMin = Math.min(iMin, xl5Var4.m);
                            }
                            i40 = z ? i42 - iMin : i42 + iMin;
                            if (z) {
                                uh5Var6.d(i40);
                            } else {
                                uh5Var5.d(i40);
                            }
                            if (i41 < i15 && i41 < i) {
                                i40 = z ? i40 - (-uh5Var5.f) : i40 + (-uh5Var5.f);
                            }
                        }
                    }
                    return;
                }
                if (i34 == 2) {
                    int i43 = this.f;
                    hg4 hg4Var6 = this.b;
                    float f8 = i43 == 0 ? hg4Var6.c0 : hg4Var6.d0;
                    if (z) {
                        f8 = 1.0f - f8;
                    }
                    int i44 = (int) (((i13 - i5) * f8) + f2);
                    if (i44 < 0 || i3 > 0) {
                        i44 = i7;
                    }
                    int i45 = z ? i6 - i44 : i6 + i44;
                    for (int i46 = i7; i46 < size; i46++) {
                        zvj zvjVar6 = (zvj) arrayList.get(z ? size - (i46 + 1) : i46);
                        hg4 hg4Var7 = zvjVar6.b;
                        uh5 uh5Var7 = zvjVar6.i;
                        uh5 uh5Var8 = zvjVar6.h;
                        if (hg4Var7.f0 == 8) {
                            uh5Var8.d(i45);
                            uh5Var7.d(i45);
                        } else {
                            if (i46 > 0 && i46 >= i14) {
                                i45 = z ? i45 - uh5Var8.f : i45 + uh5Var8.f;
                            }
                            if (z) {
                                uh5Var7.d(i45);
                            } else {
                                uh5Var8.d(i45);
                            }
                            xl5 xl5Var5 = zvjVar6.e;
                            int i47 = xl5Var5.g;
                            if (zvjVar6.d == 3 && zvjVar6.a == 1) {
                                i47 = xl5Var5.m;
                            }
                            i45 = z ? i45 - i47 : i45 + i47;
                            if (z) {
                                uh5Var8.d(i45);
                            } else {
                                uh5Var7.d(i45);
                            }
                            if (i46 < i15 && i46 < i) {
                                i45 = z ? i45 - (-uh5Var7.f) : i45 + (-uh5Var7.f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.zvj
    public final void d() {
        ArrayList arrayList = this.k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((zvj) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        hg4 hg4Var = ((zvj) arrayList.get(0)).b;
        hg4 hg4Var2 = ((zvj) arrayList.get(size - 1)).b;
        int i = this.f;
        uh5 uh5Var = this.i;
        uh5 uh5Var2 = this.h;
        if (i == 0) {
            of4 of4Var = hg4Var.H;
            of4 of4Var2 = hg4Var2.J;
            uh5 uh5VarI = zvj.i(of4Var, 0);
            int iD = of4Var.d();
            hg4 hg4VarM = m();
            if (hg4VarM != null) {
                iD = hg4VarM.H.d();
            }
            if (uh5VarI != null) {
                zvj.b(uh5Var2, uh5VarI, iD);
            }
            uh5 uh5VarI2 = zvj.i(of4Var2, 0);
            int iD2 = of4Var2.d();
            hg4 hg4VarN = n();
            if (hg4VarN != null) {
                iD2 = hg4VarN.J.d();
            }
            if (uh5VarI2 != null) {
                zvj.b(uh5Var, uh5VarI2, -iD2);
            }
        } else {
            of4 of4Var3 = hg4Var.I;
            of4 of4Var4 = hg4Var2.K;
            uh5 uh5VarI3 = zvj.i(of4Var3, 1);
            int iD3 = of4Var3.d();
            hg4 hg4VarM2 = m();
            if (hg4VarM2 != null) {
                iD3 = hg4VarM2.I.d();
            }
            if (uh5VarI3 != null) {
                zvj.b(uh5Var2, uh5VarI3, iD3);
            }
            uh5 uh5VarI4 = zvj.i(of4Var4, 1);
            int iD4 = of4Var4.d();
            hg4 hg4VarN2 = n();
            if (hg4VarN2 != null) {
                iD4 = hg4VarN2.K.d();
            }
            if (uh5VarI4 != null) {
                zvj.b(uh5Var, uh5VarI4, -iD4);
            }
        }
        uh5Var2.a = this;
        uh5Var.a = this;
    }

    @Override // defpackage.zvj
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            ((zvj) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // defpackage.zvj
    public final void f() {
        this.c = null;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((zvj) it.next()).f();
        }
    }

    @Override // defpackage.zvj
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            zvj zvjVar = (zvj) arrayList.get(i);
            j = ((long) zvjVar.i.f) + zvjVar.j() + j + ((long) zvjVar.h.f);
        }
        return j;
    }

    @Override // defpackage.zvj
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((zvj) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final hg4 m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            hg4 hg4Var = ((zvj) arrayList.get(i)).b;
            if (hg4Var.f0 != 8) {
                return hg4Var;
            }
            i++;
        }
    }

    public final hg4 n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            hg4 hg4Var = ((zvj) arrayList.get(size)).b;
            if (hg4Var.f0 != 8) {
                return hg4Var;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        for (zvj zvjVar : this.k) {
            sb.append("<");
            sb.append(zvjVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
