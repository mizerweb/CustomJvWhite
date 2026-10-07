package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class bti extends zvj {
    public final uh5 k;
    public gt0 l;

    public bti(hg4 hg4Var) {
        super(hg4Var);
        uh5 uh5Var = new uh5(this);
        this.k = uh5Var;
        this.l = null;
        this.h.e = 6;
        this.i.e = 7;
        uh5Var.e = 8;
        this.f = 1;
    }

    @Override // defpackage.qh5
    public final void a(qh5 qh5Var) {
        float f;
        float f2;
        float f3;
        int i;
        if (qt4.D(this.j) == 3) {
            hg4 hg4Var = this.b;
            l(hg4Var.I, hg4Var.K, 1);
            return;
        }
        xl5 xl5Var = this.e;
        if (xl5Var.c && !xl5Var.j && this.d == 3) {
            hg4 hg4Var2 = this.b;
            int i2 = hg4Var2.s;
            if (i2 == 2) {
                hg4 hg4Var3 = hg4Var2.S;
                if (hg4Var3 != null) {
                    xl5 xl5Var2 = hg4Var3.e.e;
                    if (xl5Var2.j) {
                        xl5Var.d((int) ((xl5Var2.g * hg4Var2.z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                xl5 xl5Var3 = hg4Var2.d.e;
                if (xl5Var3.j) {
                    int i3 = hg4Var2.W;
                    if (i3 != -1) {
                        if (i3 == 0) {
                            f3 = xl5Var3.g * hg4Var2.V;
                            i = (int) (f3 + 0.5f);
                        } else if (i3 != 1) {
                            i = 0;
                        } else {
                            f = xl5Var3.g;
                            f2 = hg4Var2.V;
                        }
                        xl5Var.d(i);
                    } else {
                        f = xl5Var3.g;
                        f2 = hg4Var2.V;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    xl5Var.d(i);
                }
            }
        }
        uh5 uh5Var = this.h;
        boolean z = uh5Var.c;
        ArrayList arrayList = uh5Var.l;
        if (z) {
            uh5 uh5Var2 = this.i;
            boolean z2 = uh5Var2.c;
            ArrayList arrayList2 = uh5Var2.l;
            if (z2) {
                if (uh5Var.j && uh5Var2.j && xl5Var.j) {
                    return;
                }
                if (!xl5Var.j && this.d == 3) {
                    hg4 hg4Var4 = this.b;
                    if (hg4Var4.r == 0 && !hg4Var4.w()) {
                        uh5 uh5Var3 = (uh5) arrayList.get(0);
                        uh5 uh5Var4 = (uh5) arrayList2.get(0);
                        int i4 = uh5Var3.g + uh5Var.f;
                        int i5 = uh5Var4.g + uh5Var2.f;
                        uh5Var.d(i4);
                        uh5Var2.d(i5);
                        xl5Var.d(i5 - i4);
                        return;
                    }
                }
                if (!xl5Var.j && this.d == 3 && this.a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    uh5 uh5Var5 = (uh5) arrayList.get(0);
                    int i6 = (((uh5) arrayList2.get(0)).g + uh5Var2.f) - (uh5Var5.g + uh5Var.f);
                    int i7 = xl5Var.m;
                    if (i6 < i7) {
                        xl5Var.d(i6);
                    } else {
                        xl5Var.d(i7);
                    }
                }
                if (xl5Var.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    uh5 uh5Var6 = (uh5) arrayList.get(0);
                    uh5 uh5Var7 = (uh5) arrayList2.get(0);
                    int i8 = uh5Var6.g;
                    int i9 = uh5Var.f + i8;
                    int i10 = uh5Var7.g;
                    int i11 = uh5Var2.f + i10;
                    float f4 = this.b.d0;
                    if (uh5Var6 == uh5Var7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    uh5Var.d((int) ((((i10 - i8) - xl5Var.g) * f4) + i8 + 0.5f));
                    uh5Var2.d(uh5Var.g + xl5Var.g);
                }
            }
        }
    }

    @Override // defpackage.zvj
    public final void d() {
        hg4 hg4Var;
        hg4 hg4Var2;
        hg4 hg4Var3;
        hg4 hg4Var4;
        hg4 hg4Var5 = this.b;
        boolean z = hg4Var5.a;
        xl5 xl5Var = this.e;
        if (z) {
            xl5Var.d(hg4Var5.i());
        }
        boolean z2 = xl5Var.j;
        ArrayList arrayList = xl5Var.k;
        ArrayList arrayList2 = xl5Var.l;
        uh5 uh5Var = this.i;
        uh5 uh5Var2 = this.h;
        if (!z2) {
            hg4 hg4Var6 = this.b;
            this.d = hg4Var6.o0[1];
            if (hg4Var6.E) {
                this.l = new gt0(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (hg4Var4 = this.b.S) != null && hg4Var4.o0[1] == 1) {
                    int i2 = (hg4Var4.i() - this.b.I.d()) - this.b.K.d();
                    zvj.b(uh5Var2, hg4Var4.e.h, this.b.I.d());
                    zvj.b(uh5Var, hg4Var4.e.i, -this.b.K.d());
                    xl5Var.d(i2);
                    return;
                }
                if (i == 1) {
                    xl5Var.d(this.b.i());
                }
            }
        } else if (this.d == 4 && (hg4Var2 = (hg4Var = this.b).S) != null && hg4Var2.o0[1] == 1) {
            zvj.b(uh5Var2, hg4Var2.e.h, hg4Var.I.d());
            zvj.b(uh5Var, hg4Var2.e.i, -this.b.K.d());
            return;
        }
        boolean z3 = xl5Var.j;
        uh5 uh5Var3 = this.k;
        if (z3) {
            hg4 hg4Var7 = this.b;
            if (hg4Var7.a) {
                of4[] of4VarArr = hg4Var7.P;
                of4 of4Var = of4VarArr[2];
                of4 of4Var2 = of4Var.f;
                if (of4Var2 != null && of4VarArr[3].f != null) {
                    boolean zW = hg4Var7.w();
                    hg4 hg4Var8 = this.b;
                    if (zW) {
                        uh5Var2.f = hg4Var8.P[2].d();
                        uh5Var.f = -this.b.P[3].d();
                    } else {
                        uh5 uh5VarH = zvj.h(hg4Var8.P[2]);
                        if (uh5VarH != null) {
                            zvj.b(uh5Var2, uh5VarH, this.b.P[2].d());
                        }
                        uh5 uh5VarH2 = zvj.h(this.b.P[3]);
                        if (uh5VarH2 != null) {
                            zvj.b(uh5Var, uh5VarH2, -this.b.P[3].d());
                        }
                        uh5Var2.b = true;
                        uh5Var.b = true;
                    }
                    hg4 hg4Var9 = this.b;
                    if (hg4Var9.E) {
                        zvj.b(uh5Var3, uh5Var2, hg4Var9.Z);
                        return;
                    }
                    return;
                }
                if (of4Var2 != null) {
                    uh5 uh5VarH3 = zvj.h(of4Var);
                    if (uh5VarH3 != null) {
                        zvj.b(uh5Var2, uh5VarH3, this.b.P[2].d());
                        zvj.b(uh5Var, uh5Var2, xl5Var.g);
                        hg4 hg4Var10 = this.b;
                        if (hg4Var10.E) {
                            zvj.b(uh5Var3, uh5Var2, hg4Var10.Z);
                            return;
                        }
                        return;
                    }
                    return;
                }
                of4 of4Var3 = of4VarArr[3];
                if (of4Var3.f != null) {
                    uh5 uh5VarH4 = zvj.h(of4Var3);
                    if (uh5VarH4 != null) {
                        zvj.b(uh5Var, uh5VarH4, -this.b.P[3].d());
                        zvj.b(uh5Var2, uh5Var, -xl5Var.g);
                    }
                    hg4 hg4Var11 = this.b;
                    if (hg4Var11.E) {
                        zvj.b(uh5Var3, uh5Var2, hg4Var11.Z);
                        return;
                    }
                    return;
                }
                of4 of4Var4 = of4VarArr[4];
                if (of4Var4.f != null) {
                    uh5 uh5VarH5 = zvj.h(of4Var4);
                    if (uh5VarH5 != null) {
                        zvj.b(uh5Var3, uh5VarH5, 0);
                        zvj.b(uh5Var2, uh5Var3, -this.b.Z);
                        zvj.b(uh5Var, uh5Var2, xl5Var.g);
                        return;
                    }
                    return;
                }
                if ((hg4Var7 instanceof tp0) || hg4Var7.S == null || hg4Var7.g(7).f != null) {
                    return;
                }
                hg4 hg4Var12 = this.b;
                zvj.b(uh5Var2, hg4Var12.S.e.h, hg4Var12.q());
                zvj.b(uh5Var, uh5Var2, xl5Var.g);
                hg4 hg4Var13 = this.b;
                if (hg4Var13.E) {
                    zvj.b(uh5Var3, uh5Var2, hg4Var13.Z);
                    return;
                }
                return;
            }
        }
        if (z3 || this.d != 3) {
            xl5Var.b(this);
        } else {
            hg4 hg4Var14 = this.b;
            int i3 = hg4Var14.s;
            if (i3 == 2) {
                hg4 hg4Var15 = hg4Var14.S;
                if (hg4Var15 != null) {
                    xl5 xl5Var2 = hg4Var15.e.e;
                    arrayList2.add(xl5Var2);
                    xl5Var2.k.add(xl5Var);
                    xl5Var.b = true;
                    arrayList.add(uh5Var2);
                    arrayList.add(uh5Var);
                }
            } else if (i3 == 3 && !hg4Var14.w()) {
                hg4 hg4Var16 = this.b;
                if (hg4Var16.r != 3) {
                    xl5 xl5Var3 = hg4Var16.d.e;
                    arrayList2.add(xl5Var3);
                    xl5Var3.k.add(xl5Var);
                    xl5Var.b = true;
                    arrayList.add(uh5Var2);
                    arrayList.add(uh5Var);
                }
            }
        }
        hg4 hg4Var17 = this.b;
        of4[] of4VarArr2 = hg4Var17.P;
        of4 of4Var5 = of4VarArr2[2];
        of4 of4Var6 = of4Var5.f;
        if (of4Var6 != null && of4VarArr2[3].f != null) {
            boolean zW2 = hg4Var17.w();
            hg4 hg4Var18 = this.b;
            if (zW2) {
                uh5Var2.f = hg4Var18.P[2].d();
                uh5Var.f = -this.b.P[3].d();
            } else {
                uh5 uh5VarH6 = zvj.h(hg4Var18.P[2]);
                uh5 uh5VarH7 = zvj.h(this.b.P[3]);
                if (uh5VarH6 != null) {
                    uh5VarH6.b(this);
                }
                if (uh5VarH7 != null) {
                    uh5VarH7.b(this);
                }
                this.j = 4;
            }
            if (this.b.E) {
                c(uh5Var3, uh5Var2, 1, this.l);
            }
        } else if (of4Var6 != null) {
            uh5 uh5VarH8 = zvj.h(of4Var5);
            if (uh5VarH8 != null) {
                zvj.b(uh5Var2, uh5VarH8, this.b.P[2].d());
                c(uh5Var, uh5Var2, 1, xl5Var);
                if (this.b.E) {
                    c(uh5Var3, uh5Var2, 1, this.l);
                }
                if (this.d == 3) {
                    hg4 hg4Var19 = this.b;
                    if (hg4Var19.V > 0.0f) {
                        cz7 cz7Var = hg4Var19.d;
                        if (cz7Var.d == 3) {
                            cz7Var.e.k.add(xl5Var);
                            arrayList2.add(this.b.d.e);
                            xl5Var.a = this;
                        }
                    }
                }
            }
        } else {
            of4 of4Var7 = of4VarArr2[3];
            if (of4Var7.f != null) {
                uh5 uh5VarH9 = zvj.h(of4Var7);
                if (uh5VarH9 != null) {
                    zvj.b(uh5Var, uh5VarH9, -this.b.P[3].d());
                    c(uh5Var2, uh5Var, -1, xl5Var);
                    if (this.b.E) {
                        c(uh5Var3, uh5Var2, 1, this.l);
                    }
                }
            } else {
                of4 of4Var8 = of4VarArr2[4];
                if (of4Var8.f != null) {
                    uh5 uh5VarH10 = zvj.h(of4Var8);
                    if (uh5VarH10 != null) {
                        zvj.b(uh5Var3, uh5VarH10, 0);
                        c(uh5Var2, uh5Var3, -1, this.l);
                        c(uh5Var, uh5Var2, 1, xl5Var);
                    }
                } else if (!(hg4Var17 instanceof tp0) && (hg4Var3 = hg4Var17.S) != null) {
                    zvj.b(uh5Var2, hg4Var3.e.h, hg4Var17.q());
                    c(uh5Var, uh5Var2, 1, xl5Var);
                    if (this.b.E) {
                        c(uh5Var3, uh5Var2, 1, this.l);
                    }
                    if (this.d == 3) {
                        hg4 hg4Var20 = this.b;
                        if (hg4Var20.V > 0.0f) {
                            cz7 cz7Var2 = hg4Var20.d;
                            if (cz7Var2.d == 3) {
                                cz7Var2.e.k.add(xl5Var);
                                arrayList2.add(this.b.d.e);
                                xl5Var.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            xl5Var.c = true;
        }
    }

    @Override // defpackage.zvj
    public final void e() {
        uh5 uh5Var = this.h;
        if (uh5Var.j) {
            this.b.Y = uh5Var.g;
        }
    }

    @Override // defpackage.zvj
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.zvj
    public final boolean k() {
        return this.d != 3 || this.b.s == 0;
    }

    public final void m() {
        this.g = false;
        uh5 uh5Var = this.h;
        uh5Var.c();
        uh5Var.j = false;
        uh5 uh5Var2 = this.i;
        uh5Var2.c();
        uh5Var2.j = false;
        uh5 uh5Var3 = this.k;
        uh5Var3.c();
        uh5Var3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.g0;
    }
}
