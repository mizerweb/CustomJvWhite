package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class zvj implements qh5 {
    public int a;
    public hg4 b;
    public rwe c;
    public int d;
    public final xl5 e = new xl5(this);
    public int f = 0;
    public boolean g = false;
    public final uh5 h = new uh5(this);
    public final uh5 i = new uh5(this);
    public int j = 1;

    public zvj(hg4 hg4Var) {
        this.b = hg4Var;
    }

    public static void b(uh5 uh5Var, uh5 uh5Var2, int i) {
        uh5Var.l.add(uh5Var2);
        uh5Var.f = i;
        uh5Var2.k.add(uh5Var);
    }

    public static uh5 h(of4 of4Var) {
        of4 of4Var2 = of4Var.f;
        if (of4Var2 == null) {
            return null;
        }
        hg4 hg4Var = of4Var2.d;
        int iD = qt4.D(of4Var2.e);
        if (iD == 1) {
            return hg4Var.d.h;
        }
        if (iD == 2) {
            return hg4Var.e.h;
        }
        if (iD == 3) {
            return hg4Var.d.i;
        }
        if (iD == 4) {
            return hg4Var.e.i;
        }
        if (iD != 5) {
            return null;
        }
        return hg4Var.e.k;
    }

    public static uh5 i(of4 of4Var, int i) {
        of4 of4Var2 = of4Var.f;
        if (of4Var2 == null) {
            return null;
        }
        hg4 hg4Var = of4Var2.d;
        zvj zvjVar = i == 0 ? hg4Var.d : hg4Var.e;
        int iD = qt4.D(of4Var2.e);
        if (iD == 1 || iD == 2) {
            return zvjVar.h;
        }
        if (iD == 3 || iD == 4) {
            return zvjVar.i;
        }
        return null;
    }

    public final void c(uh5 uh5Var, uh5 uh5Var2, int i, xl5 xl5Var) {
        uh5Var.l.add(uh5Var2);
        uh5Var.l.add(this.e);
        uh5Var.h = i;
        uh5Var.i = xl5Var;
        uh5Var2.k.add(uh5Var);
        xl5Var.k.add(uh5Var);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        hg4 hg4Var = this.b;
        if (i2 == 0) {
            int i3 = hg4Var.v;
            int iMax = Math.max(hg4Var.u, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            int i4 = hg4Var.y;
            int iMax2 = Math.max(hg4Var.x, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    public long j() {
        xl5 xl5Var = this.e;
        if (xl5Var.j) {
            return xl5Var.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    public final void l(of4 of4Var, of4 of4Var2, int i) {
        xl5 xl5Var;
        float f;
        int i2;
        int i3;
        uh5 uh5VarH = h(of4Var);
        uh5 uh5VarH2 = h(of4Var2);
        if (uh5VarH.j && uh5VarH2.j) {
            int iD = of4Var.d() + uh5VarH.g;
            int iD2 = uh5VarH2.g - of4Var2.d();
            int i4 = iD2 - iD;
            xl5 xl5Var2 = this.e;
            if (!xl5Var2.j && this.d == 3) {
                int i5 = this.a;
                if (i5 == 0) {
                    xl5Var2.d(g(i4, i));
                } else if (i5 == 1) {
                    xl5Var2.d(Math.min(g(xl5Var2.m, i), i4));
                } else if (i5 == 2) {
                    hg4 hg4Var = this.b;
                    hg4 hg4Var2 = hg4Var.S;
                    if (hg4Var2 != null) {
                        xl5 xl5Var3 = (i == 0 ? hg4Var2.d : hg4Var2.e).e;
                        if (xl5Var3.j) {
                            xl5Var2.d(g((int) ((xl5Var3.g * (i == 0 ? hg4Var.w : hg4Var.z)) + 0.5f), i));
                        }
                    }
                } else if (i5 == 3) {
                    hg4 hg4Var3 = this.b;
                    zvj zvjVar = hg4Var3.d;
                    if (zvjVar.d == 3 && zvjVar.a == 3) {
                        bti btiVar = hg4Var3.e;
                        if (btiVar.d != 3 || btiVar.a != 3) {
                            if (i == 0) {
                                zvjVar = hg4Var3.e;
                            }
                            xl5Var = zvjVar.e;
                            if (xl5Var.j) {
                                f = hg4Var3.V;
                                i2 = xl5Var.g;
                                if (i == 1) {
                                    i3 = (int) ((i2 / f) + 0.5f);
                                } else {
                                    i3 = (int) ((f * i2) + 0.5f);
                                }
                                xl5Var2.d(i3);
                            }
                        }
                    } else {
                        if (i == 0) {
                            zvjVar = hg4Var3.e;
                        }
                        xl5Var = zvjVar.e;
                        if (xl5Var.j) {
                            f = hg4Var3.V;
                            i2 = xl5Var.g;
                            if (i == 1) {
                                i3 = (int) ((i2 / f) + 0.5f);
                            } else {
                                i3 = (int) ((f * i2) + 0.5f);
                            }
                            xl5Var2.d(i3);
                        }
                    }
                }
            }
            if (xl5Var2.j) {
                int i6 = xl5Var2.g;
                uh5 uh5Var = this.i;
                uh5 uh5Var2 = this.h;
                if (i6 == i4) {
                    uh5Var2.d(iD);
                    uh5Var.d(iD2);
                    return;
                }
                hg4 hg4Var4 = this.b;
                float f2 = i == 0 ? hg4Var4.c0 : hg4Var4.d0;
                if (uh5VarH == uh5VarH2) {
                    iD = uh5VarH.g;
                    iD2 = uh5VarH2.g;
                    f2 = 0.5f;
                }
                uh5Var2.d((int) ((((iD2 - iD) - i6) * f2) + iD + 0.5f));
                uh5Var.d(uh5Var2.g + xl5Var2.g);
            }
        }
    }
}
