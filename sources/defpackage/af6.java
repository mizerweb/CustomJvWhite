package defpackage;

import androidx.media3.transformer.ExportException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class af6 extends ks0 {
    public final u55 A;
    public boolean B;
    public boolean C;
    public boolean D;
    public long s;
    public rye t;
    public i95 u;
    public boolean v;
    public b87 w;
    public b87 x;
    public final gj2 y;
    public final dy z;

    public af6(int i, gj2 gj2Var, dy dyVar) {
        super(i);
        this.y = gj2Var;
        this.z = dyVar;
        this.A = new u55(0);
    }

    @Override // defpackage.ks0
    public final int D(b87 b87Var) {
        return ks0.b(uya.h(b87Var.n) == this.b ? 4 : 0, 0, 0, 0);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    public final boolean G() throws ExportException {
        rye ryeVarF;
        if (this.t != null) {
            return true;
        }
        if (this.x != null) {
            ryeVarF = this.z.f(this.x);
            if (ryeVarF != null) {
                this.t = ryeVarF;
                return true;
            }
        } else {
            if (this.u == null || izl.k(this.w.n) != 1) {
                this.x = M(this.w);
            } else {
                i95 i95Var = this.u;
                i95Var.g(false);
                b87 b87Var = i95Var.j;
                if (b87Var != null) {
                    this.x = M(b87Var);
                }
            }
            ryeVarF = this.z.f(this.x);
            if (ryeVarF != null) {
                this.t = ryeVarF;
                return true;
            }
        }
        return false;
    }

    public abstract boolean H();

    public abstract void I(b87 b87Var);

    public void J(u55 u55Var) {
    }

    public void K(b87 b87Var) {
    }

    public b87 L(b87 b87Var) {
        return b87Var;
    }

    public b87 M(b87 b87Var) {
        return b87Var;
    }

    public final boolean N(u55 u55Var) {
        v2a v2aVar = this.c;
        v2aVar.k();
        int iW = w(v2aVar, u55Var, 0);
        if (iW == -5) {
            ore.k("Format changes are not supported.");
            return false;
        }
        if (iW != -4) {
            return false;
        }
        u55Var.t();
        if (u55Var.d(4)) {
            return true;
        }
        this.y.N(this.b, u55Var.f);
        return true;
    }

    public final boolean O() {
        b87 b87Var = this.w;
        if (b87Var == null || this.C) {
            if (b87Var == null) {
                v2a v2aVar = this.c;
                v2aVar.k();
                if (w(v2aVar, this.A, 2) == -5) {
                    b87 b87Var2 = (b87) v2aVar.c;
                    b87Var2.getClass();
                    b87 b87VarL = L(b87Var2);
                    this.w = b87VarL;
                    K(b87VarL);
                    this.C = this.z.e(3, this.w);
                }
                return false;
            }
            if (this.C) {
                if (izl.k(this.w.n) != 2 || G()) {
                    I(this.w);
                    this.C = false;
                }
                return false;
            }
        }
        return true;
    }

    public abstract boolean P(u55 u55Var);

    @Override // defpackage.ks0
    public final it9 g() {
        return this.y;
    }

    @Override // defpackage.ks0
    public final boolean j() {
        return this.v;
    }

    @Override // defpackage.ks0
    public final boolean l() {
        return true;
    }

    @Override // defpackage.ks0
    public final void n(boolean z, boolean z2) {
        this.y.N(this.b, 0L);
    }

    @Override // defpackage.ks0
    public final void r() {
        i95 i95Var = this.u;
        if (i95Var != null) {
            i95Var.i();
        }
    }

    @Override // defpackage.ks0
    public final void s() {
        this.B = true;
    }

    @Override // defpackage.ks0
    public final void t() {
        this.B = false;
    }

    @Override // defpackage.ks0
    public final void u(b87[] b87VarArr, long j, long j2, x4a x4aVar) {
        this.s = j;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080 A[Catch: ExportException -> 0x0021, TRY_LEAVE, TryCatch #0 {ExportException -> 0x0021, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0009, B:10:0x0011, B:12:0x0016, B:14:0x001c, B:18:0x0025, B:28:0x0049, B:21:0x0031, B:24:0x0038, B:27:0x0040, B:31:0x004d, B:33:0x0053, B:36:0x005d, B:38:0x0061, B:41:0x0068, B:44:0x0070, B:45:0x0072, B:48:0x0080), top: B:55:0x0001 }] */
    @Override // defpackage.ks0
    public final void y(long j, long j2) {
        boolean zD;
        boolean z;
        boolean zH;
        boolean z2;
        try {
            if (this.B && !this.v && O()) {
                if (this.u != null) {
                    do {
                        zH = G() ? H() : false;
                        i95 i95Var = this.u;
                        u55 u55Var = this.A;
                        if (i95Var.f(u55Var) && N(u55Var)) {
                            if (!P(u55Var)) {
                                J(u55Var);
                                this.u.h(u55Var);
                            }
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } while (zH | z2);
                    return;
                }
                if (G()) {
                    do {
                        u55 u55VarA = this.t.a();
                        if (u55VarA == null) {
                            z = false;
                        } else if (this.D) {
                            zD = u55VarA.d(4);
                            if (this.t.c()) {
                                this.D = false;
                                this.v = zD;
                                z = !zD;
                            } else {
                                z = false;
                            }
                        } else if (!N(u55VarA)) {
                            z = false;
                        } else if (P(u55VarA)) {
                            z = true;
                        } else {
                            this.D = true;
                            zD = u55VarA.d(4);
                            if (this.t.c()) {
                                z = false;
                            } else {
                                this.D = false;
                                this.v = zD;
                                z = !zD;
                            }
                        }
                    } while (z);
                }
            }
        } catch (ExportException e) {
            this.B = false;
            this.z.b(e);
        }
    }
}
