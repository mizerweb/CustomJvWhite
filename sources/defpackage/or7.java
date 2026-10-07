package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class or7 extends hg4 {
    public float p0 = -1.0f;
    public int q0 = -1;
    public int r0 = -1;
    public of4 s0 = this.I;
    public int t0 = 0;
    public boolean u0;

    public or7() {
        this.Q.clear();
        this.Q.add(this.s0);
        int length = this.P.length;
        for (int i = 0; i < length; i++) {
            this.P[i] = this.s0;
        }
    }

    @Override // defpackage.hg4
    public final void M(b29 b29Var, boolean z) {
        if (this.S == null) {
            return;
        }
        of4 of4Var = this.s0;
        b29Var.getClass();
        int iN = b29.n(of4Var);
        if (this.t0 == 1) {
            this.X = iN;
            this.Y = 0;
            H(this.S.i());
            K(0);
            return;
        }
        this.X = 0;
        this.Y = iN;
        K(this.S.o());
        H(0);
    }

    public final void N(int i) {
        this.s0.i(i);
        this.u0 = true;
    }

    public final void O(int i) {
        if (this.t0 == i) {
            return;
        }
        this.t0 = i;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        if (this.t0 == 1) {
            this.s0 = this.H;
        } else {
            this.s0 = this.I;
        }
        arrayList.add(this.s0);
        of4[] of4VarArr = this.P;
        int length = of4VarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            of4VarArr[i2] = this.s0;
        }
    }

    @Override // defpackage.hg4
    public final void b(b29 b29Var, boolean z) {
        ig4 ig4Var = (ig4) this.S;
        if (ig4Var == null) {
            return;
        }
        Object objG = ig4Var.g(2);
        Object objG2 = ig4Var.g(4);
        hg4 hg4Var = this.S;
        boolean z2 = hg4Var != null && hg4Var.o0[0] == 2;
        if (this.t0 == 0) {
            objG = ig4Var.g(3);
            objG2 = ig4Var.g(5);
            hg4 hg4Var2 = this.S;
            z2 = hg4Var2 != null && hg4Var2.o0[1] == 2;
        }
        if (this.u0) {
            of4 of4Var = this.s0;
            if (of4Var.c) {
                adg adgVarK = b29Var.k(of4Var);
                b29Var.d(adgVarK, this.s0.c());
                if (this.q0 != -1) {
                    if (z2) {
                        b29Var.f(b29Var.k(objG2), adgVarK, 0, 5);
                    }
                } else if (this.r0 != -1 && z2) {
                    adg adgVarK2 = b29Var.k(objG2);
                    b29Var.f(adgVarK, b29Var.k(objG), 0, 5);
                    b29Var.f(adgVarK2, adgVarK, 0, 5);
                }
                this.u0 = false;
                return;
            }
        }
        if (this.q0 != -1) {
            adg adgVarK3 = b29Var.k(this.s0);
            b29Var.e(adgVarK3, b29Var.k(objG), this.q0, 8);
            if (z2) {
                b29Var.f(b29Var.k(objG2), adgVarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.r0 != -1) {
            adg adgVarK4 = b29Var.k(this.s0);
            adg adgVarK5 = b29Var.k(objG2);
            b29Var.e(adgVarK4, adgVarK5, -this.r0, 8);
            if (z2) {
                b29Var.f(adgVarK4, b29Var.k(objG), 0, 5);
                b29Var.f(adgVarK5, adgVarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.p0 != -1.0f) {
            adg adgVarK6 = b29Var.k(this.s0);
            adg adgVarK7 = b29Var.k(objG2);
            float f = this.p0;
            ow owVarL = b29Var.l();
            owVarL.d.g(adgVarK6, -1.0f);
            owVarL.d.g(adgVarK7, f);
            b29Var.c(owVarL);
        }
    }

    @Override // defpackage.hg4
    public final boolean c() {
        return true;
    }

    @Override // defpackage.hg4
    public final of4 g(int i) {
        int iD = qt4.D(i);
        if (iD != 1) {
            if (iD != 2) {
                if (iD != 3) {
                    if (iD != 4) {
                        return null;
                    }
                }
            }
            if (this.t0 == 0) {
                return this.s0;
            }
            return null;
        }
        if (this.t0 == 1) {
            return this.s0;
        }
        return null;
    }

    @Override // defpackage.hg4
    public final boolean y() {
        return this.u0;
    }

    @Override // defpackage.hg4
    public final boolean z() {
        return this.u0;
    }
}
