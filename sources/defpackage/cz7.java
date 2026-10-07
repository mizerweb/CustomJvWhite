package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class cz7 extends zvj {
    public static final int[] k = new int[2];

    public cz7(hg4 hg4Var) {
        super(hg4Var);
        this.h.e = 4;
        this.i.e = 5;
        this.f = 0;
    }

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0268  */
    /* JADX WARN: Code duplicated, block: B:118:0x0278  */
    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // defpackage.qh5
    public final void a(qh5 qh5Var) {
        float f;
        int iG;
        int i;
        int iG2;
        float f2;
        float f3;
        float f4;
        int i2;
        if (qt4.D(this.j) == 3) {
            hg4 hg4Var = this.b;
            l(hg4Var.H, hg4Var.J, 0);
            return;
        }
        xl5 xl5Var = this.e;
        boolean z = xl5Var.j;
        uh5 uh5Var = this.h;
        uh5 uh5Var2 = this.i;
        if (z || this.d != 3) {
            f = 0.5f;
        } else {
            hg4 hg4Var2 = this.b;
            int i3 = hg4Var2.r;
            if (i3 == 2) {
                f = 0.5f;
                hg4 hg4Var3 = hg4Var2.S;
                if (hg4Var3 != null) {
                    xl5 xl5Var2 = hg4Var3.d.e;
                    if (xl5Var2.j) {
                        xl5Var.d((int) ((xl5Var2.g * hg4Var2.w) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = hg4Var2.s;
                if (i4 == 0 || i4 == 3) {
                    bti btiVar = hg4Var2.e;
                    uh5 uh5Var3 = btiVar.h;
                    uh5 uh5Var4 = btiVar.i;
                    boolean z2 = hg4Var2.H.f != null;
                    boolean z3 = hg4Var2.I.f != null;
                    boolean z4 = hg4Var2.J.f != null;
                    boolean z5 = hg4Var2.K.f != null;
                    f = 0.5f;
                    int i5 = hg4Var2.W;
                    if (z2 && z3 && z4 && z5) {
                        float f5 = hg4Var2.V;
                        boolean z6 = uh5Var3.j;
                        ArrayList arrayList = uh5Var3.l;
                        int[] iArr = k;
                        if (z6 && uh5Var4.j) {
                            if (uh5Var.c && uh5Var2.c) {
                                m(iArr, ((uh5) uh5Var.l.get(0)).g + uh5Var.f, ((uh5) uh5Var2.l.get(0)).g - uh5Var2.f, uh5Var3.g + uh5Var3.f, uh5Var4.g - uh5Var4.f, f5, i5);
                                xl5Var.d(iArr[0]);
                                this.b.e.e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (uh5Var.j && uh5Var2.j) {
                            if (!uh5Var3.c || !uh5Var4.c) {
                                return;
                            }
                            m(iArr, uh5Var.g + uh5Var.f, uh5Var2.g - uh5Var2.f, ((uh5) arrayList.get(0)).g + uh5Var3.f, ((uh5) uh5Var4.l.get(0)).g - uh5Var4.f, f5, i5);
                            xl5Var.d(iArr[0]);
                            this.b.e.e.d(iArr[1]);
                        }
                        if (!uh5Var.c || !uh5Var2.c || !uh5Var3.c || !uh5Var4.c) {
                            return;
                        }
                        m(iArr, ((uh5) uh5Var.l.get(0)).g + uh5Var.f, ((uh5) uh5Var2.l.get(0)).g - uh5Var2.f, ((uh5) arrayList.get(0)).g + uh5Var3.f, ((uh5) uh5Var4.l.get(0)).g - uh5Var4.f, f5, i5);
                        xl5Var.d(iArr[0]);
                        this.b.e.e.d(iArr[1]);
                    } else if (z2 && z4) {
                        if (!uh5Var.c || !uh5Var2.c) {
                            return;
                        }
                        float f6 = hg4Var2.V;
                        int i6 = ((uh5) uh5Var.l.get(0)).g + uh5Var.f;
                        int i7 = ((uh5) uh5Var2.l.get(0)).g - uh5Var2.f;
                        if (i5 == -1 || i5 == 0) {
                            int iG3 = g(i7 - i6, 0);
                            int i8 = (int) ((iG3 * f6) + 0.5f);
                            int iG4 = g(i8, 1);
                            if (i8 != iG4) {
                                iG3 = (int) ((iG4 / f6) + 0.5f);
                            }
                            xl5Var.d(iG3);
                            this.b.e.e.d(iG4);
                        } else if (i5 == 1) {
                            int iG5 = g(i7 - i6, 0);
                            int i9 = (int) ((iG5 / f6) + 0.5f);
                            int iG6 = g(i9, 1);
                            if (i9 != iG6) {
                                iG5 = (int) ((iG6 * f6) + 0.5f);
                            }
                            xl5Var.d(iG5);
                            this.b.e.e.d(iG6);
                        }
                    } else if (z3 && z5) {
                        if (!uh5Var3.c || !uh5Var4.c) {
                            return;
                        }
                        float f7 = hg4Var2.V;
                        int i10 = ((uh5) uh5Var3.l.get(0)).g + uh5Var3.f;
                        int i11 = ((uh5) uh5Var4.l.get(0)).g - uh5Var4.f;
                        if (i5 == -1) {
                            iG = g(i11 - i10, 1);
                            i = (int) ((iG / f7) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * f7) + 0.5f);
                            }
                            xl5Var.d(iG2);
                            this.b.e.e.d(iG);
                        } else if (i5 == 0) {
                            int iG7 = g(i11 - i10, 1);
                            int i12 = (int) ((iG7 * f7) + 0.5f);
                            int iG8 = g(i12, 0);
                            if (i12 != iG8) {
                                iG7 = (int) ((iG8 / f7) + 0.5f);
                            }
                            xl5Var.d(iG8);
                            this.b.e.e.d(iG7);
                        } else if (i5 == 1) {
                            iG = g(i11 - i10, 1);
                            i = (int) ((iG / f7) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * f7) + 0.5f);
                            }
                            xl5Var.d(iG2);
                            this.b.e.e.d(iG);
                        }
                    }
                } else {
                    int i13 = hg4Var2.W;
                    if (i13 != -1) {
                        if (i13 == 0) {
                            f4 = hg4Var2.e.e.g / hg4Var2.V;
                            i2 = (int) (f4 + 0.5f);
                        } else if (i13 != 1) {
                            i2 = 0;
                        } else {
                            f2 = hg4Var2.e.e.g;
                            f3 = hg4Var2.V;
                        }
                        xl5Var.d(i2);
                        f = 0.5f;
                    } else {
                        f2 = hg4Var2.e.e.g;
                        f3 = hg4Var2.V;
                    }
                    f4 = f2 * f3;
                    i2 = (int) (f4 + 0.5f);
                    xl5Var.d(i2);
                    f = 0.5f;
                }
            } else {
                f = 0.5f;
            }
        }
        boolean z7 = uh5Var.c;
        ArrayList arrayList2 = uh5Var.l;
        if (z7) {
            boolean z8 = uh5Var2.c;
            ArrayList arrayList3 = uh5Var2.l;
            if (z8) {
                if (uh5Var.j && uh5Var2.j && xl5Var.j) {
                    return;
                }
                if (!xl5Var.j && this.d == 3) {
                    hg4 hg4Var4 = this.b;
                    if (hg4Var4.r == 0 && !hg4Var4.v()) {
                        uh5 uh5Var5 = (uh5) arrayList2.get(0);
                        uh5 uh5Var6 = (uh5) arrayList3.get(0);
                        int i14 = uh5Var5.g + uh5Var.f;
                        int i15 = uh5Var6.g + uh5Var2.f;
                        uh5Var.d(i14);
                        uh5Var2.d(i15);
                        xl5Var.d(i15 - i14);
                        return;
                    }
                }
                if (!xl5Var.j && this.d == 3 && this.a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((uh5) arrayList3.get(0)).g + uh5Var2.f) - (((uh5) arrayList2.get(0)).g + uh5Var.f), xl5Var.m);
                    hg4 hg4Var5 = this.b;
                    int i16 = hg4Var5.v;
                    int iMax = Math.max(hg4Var5.u, iMin);
                    if (i16 > 0) {
                        iMax = Math.min(i16, iMax);
                    }
                    xl5Var.d(iMax);
                }
                if (xl5Var.j) {
                    uh5 uh5Var7 = (uh5) arrayList2.get(0);
                    uh5 uh5Var8 = (uh5) arrayList3.get(0);
                    int i17 = uh5Var7.g;
                    int i18 = uh5Var.f + i17;
                    int i19 = uh5Var8.g;
                    int i20 = uh5Var2.f + i19;
                    float f8 = this.b.c0;
                    if (uh5Var7 == uh5Var8) {
                        f8 = f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    uh5Var.d((int) ((((i19 - i17) - xl5Var.g) * f8) + i17 + f));
                    uh5Var2.d(uh5Var.g + xl5Var.g);
                }
            }
        }
    }

    @Override // defpackage.zvj
    public final void d() {
        hg4 hg4Var;
        hg4 hg4Var2;
        int i;
        hg4 hg4Var3;
        hg4 hg4Var4;
        int i2;
        hg4 hg4Var5 = this.b;
        boolean z = hg4Var5.a;
        xl5 xl5Var = this.e;
        if (z) {
            xl5Var.d(hg4Var5.o());
        }
        boolean z2 = xl5Var.j;
        ArrayList arrayList = xl5Var.k;
        ArrayList arrayList2 = xl5Var.l;
        uh5 uh5Var = this.i;
        uh5 uh5Var2 = this.h;
        if (!z2) {
            hg4 hg4Var6 = this.b;
            int i3 = hg4Var6.o0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (hg4Var4 = hg4Var6.S) != null && ((i2 = hg4Var4.o0[0]) == 1 || i2 == 4)) {
                    int iO = (hg4Var4.o() - this.b.H.d()) - this.b.J.d();
                    zvj.b(uh5Var2, hg4Var4.d.h, this.b.H.d());
                    zvj.b(uh5Var, hg4Var4.d.i, -this.b.J.d());
                    xl5Var.d(iO);
                    return;
                }
                if (i3 == 1) {
                    xl5Var.d(hg4Var6.o());
                }
            }
        } else if (this.d == 4 && (hg4Var2 = (hg4Var = this.b).S) != null && ((i = hg4Var2.o0[0]) == 1 || i == 4)) {
            zvj.b(uh5Var2, hg4Var2.d.h, hg4Var.H.d());
            zvj.b(uh5Var, hg4Var2.d.i, -this.b.J.d());
            return;
        }
        if (xl5Var.j) {
            hg4 hg4Var7 = this.b;
            if (hg4Var7.a) {
                of4[] of4VarArr = hg4Var7.P;
                of4 of4Var = of4VarArr[0];
                of4 of4Var2 = of4Var.f;
                if (of4Var2 != null && of4VarArr[1].f != null) {
                    boolean zV = hg4Var7.v();
                    hg4 hg4Var8 = this.b;
                    if (zV) {
                        uh5Var2.f = hg4Var8.P[0].d();
                        uh5Var.f = -this.b.P[1].d();
                        return;
                    }
                    uh5 uh5VarH = zvj.h(hg4Var8.P[0]);
                    if (uh5VarH != null) {
                        zvj.b(uh5Var2, uh5VarH, this.b.P[0].d());
                    }
                    uh5 uh5VarH2 = zvj.h(this.b.P[1]);
                    if (uh5VarH2 != null) {
                        zvj.b(uh5Var, uh5VarH2, -this.b.P[1].d());
                    }
                    uh5Var2.b = true;
                    uh5Var.b = true;
                    return;
                }
                if (of4Var2 != null) {
                    uh5 uh5VarH3 = zvj.h(of4Var);
                    if (uh5VarH3 != null) {
                        zvj.b(uh5Var2, uh5VarH3, this.b.P[0].d());
                        zvj.b(uh5Var, uh5Var2, xl5Var.g);
                        return;
                    }
                    return;
                }
                of4 of4Var3 = of4VarArr[1];
                if (of4Var3.f != null) {
                    uh5 uh5VarH4 = zvj.h(of4Var3);
                    if (uh5VarH4 != null) {
                        zvj.b(uh5Var, uh5VarH4, -this.b.P[1].d());
                        zvj.b(uh5Var2, uh5Var, -xl5Var.g);
                        return;
                    }
                    return;
                }
                if ((hg4Var7 instanceof tp0) || hg4Var7.S == null || hg4Var7.g(7).f != null) {
                    return;
                }
                hg4 hg4Var9 = this.b;
                zvj.b(uh5Var2, hg4Var9.S.d.h, hg4Var9.p());
                zvj.b(uh5Var, uh5Var2, xl5Var.g);
                return;
            }
        }
        if (this.d == 3) {
            hg4 hg4Var10 = this.b;
            int i4 = hg4Var10.r;
            if (i4 == 2) {
                hg4 hg4Var11 = hg4Var10.S;
                if (hg4Var11 != null) {
                    xl5 xl5Var2 = hg4Var11.e.e;
                    arrayList2.add(xl5Var2);
                    xl5Var2.k.add(xl5Var);
                    xl5Var.b = true;
                    arrayList.add(uh5Var2);
                    arrayList.add(uh5Var);
                }
            } else if (i4 == 3) {
                if (hg4Var10.s == 3) {
                    uh5Var2.a = this;
                    uh5Var.a = this;
                    bti btiVar = hg4Var10.e;
                    btiVar.h.a = this;
                    btiVar.i.a = this;
                    xl5Var.a = this;
                    if (hg4Var10.w()) {
                        arrayList2.add(this.b.e.e);
                        this.b.e.e.k.add(xl5Var);
                        bti btiVar2 = this.b.e;
                        btiVar2.e.a = this;
                        arrayList2.add(btiVar2.h);
                        arrayList2.add(this.b.e.i);
                        this.b.e.h.k.add(xl5Var);
                        this.b.e.i.k.add(xl5Var);
                    } else {
                        boolean zV2 = this.b.v();
                        hg4 hg4Var12 = this.b;
                        if (zV2) {
                            hg4Var12.e.e.l.add(xl5Var);
                            arrayList.add(this.b.e.e);
                        } else {
                            hg4Var12.e.e.l.add(xl5Var);
                        }
                    }
                } else {
                    xl5 xl5Var3 = hg4Var10.e.e;
                    arrayList2.add(xl5Var3);
                    xl5Var3.k.add(xl5Var);
                    this.b.e.h.k.add(xl5Var);
                    this.b.e.i.k.add(xl5Var);
                    xl5Var.b = true;
                    arrayList.add(uh5Var2);
                    arrayList.add(uh5Var);
                    uh5Var2.l.add(xl5Var);
                    uh5Var.l.add(xl5Var);
                }
            }
        }
        hg4 hg4Var13 = this.b;
        of4[] of4VarArr2 = hg4Var13.P;
        of4 of4Var4 = of4VarArr2[0];
        of4 of4Var5 = of4Var4.f;
        if (of4Var5 != null && of4VarArr2[1].f != null) {
            boolean zV3 = hg4Var13.v();
            hg4 hg4Var14 = this.b;
            if (zV3) {
                uh5Var2.f = hg4Var14.P[0].d();
                uh5Var.f = -this.b.P[1].d();
                return;
            }
            uh5 uh5VarH5 = zvj.h(hg4Var14.P[0]);
            uh5 uh5VarH6 = zvj.h(this.b.P[1]);
            if (uh5VarH5 != null) {
                uh5VarH5.b(this);
            }
            if (uh5VarH6 != null) {
                uh5VarH6.b(this);
            }
            this.j = 4;
            return;
        }
        if (of4Var5 != null) {
            uh5 uh5VarH7 = zvj.h(of4Var4);
            if (uh5VarH7 != null) {
                zvj.b(uh5Var2, uh5VarH7, this.b.P[0].d());
                c(uh5Var, uh5Var2, 1, xl5Var);
                return;
            }
            return;
        }
        of4 of4Var6 = of4VarArr2[1];
        if (of4Var6.f != null) {
            uh5 uh5VarH8 = zvj.h(of4Var6);
            if (uh5VarH8 != null) {
                zvj.b(uh5Var, uh5VarH8, -this.b.P[1].d());
                c(uh5Var2, uh5Var, -1, xl5Var);
                return;
            }
            return;
        }
        if ((hg4Var13 instanceof tp0) || (hg4Var3 = hg4Var13.S) == null) {
            return;
        }
        zvj.b(uh5Var2, hg4Var3.d.h, hg4Var13.p());
        c(uh5Var, uh5Var2, 1, xl5Var);
    }

    @Override // defpackage.zvj
    public final void e() {
        uh5 uh5Var = this.h;
        if (uh5Var.j) {
            this.b.X = uh5Var.g;
        }
    }

    @Override // defpackage.zvj
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.zvj
    public final boolean k() {
        return this.d != 3 || this.b.r == 0;
    }

    public final void n() {
        this.g = false;
        uh5 uh5Var = this.h;
        uh5Var.c();
        uh5Var.j = false;
        uh5 uh5Var2 = this.i;
        uh5Var2.c();
        uh5Var2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.g0;
    }
}
