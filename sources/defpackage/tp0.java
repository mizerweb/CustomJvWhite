package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class tp0 extends hg4 {
    public hg4[] p0;
    public int q0;
    public int r0;
    public boolean s0;
    public int t0;
    public boolean u0;

    public final void N(int i, wvj wvjVar, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.q0; i2++) {
            wvjVar.a(this.p0[i2]);
        }
        for (int i3 = 0; i3 < this.q0; i3++) {
            f0m.e(this.p0[i3], i, arrayList, wvjVar);
        }
    }

    public final boolean O() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.q0;
            if (i4 >= i) {
                break;
            }
            hg4 hg4Var = this.p0[i4];
            if ((this.s0 || hg4Var.c()) && ((((i2 = this.r0) == 0 || i2 == 1) && !hg4Var.y()) || (((i3 = this.r0) == 2 || i3 == 3) && !hg4Var.z()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.q0; i5++) {
            hg4 hg4Var2 = this.p0[i5];
            if (this.s0 || hg4Var2.c()) {
                if (!z2) {
                    int i6 = this.r0;
                    if (i6 == 0) {
                        iMax = hg4Var2.g(2).c();
                    } else if (i6 == 1) {
                        iMax = hg4Var2.g(4).c();
                    } else if (i6 == 2) {
                        iMax = hg4Var2.g(3).c();
                    } else if (i6 == 3) {
                        iMax = hg4Var2.g(5).c();
                    }
                    z2 = true;
                }
                int i7 = this.r0;
                if (i7 == 0) {
                    iMax = Math.min(iMax, hg4Var2.g(2).c());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, hg4Var2.g(4).c());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, hg4Var2.g(3).c());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, hg4Var2.g(5).c());
                }
            }
        }
        int i8 = iMax + this.t0;
        int i9 = this.r0;
        if (i9 == 0 || i9 == 1) {
            F(i8, i8);
        } else {
            G(i8, i8);
        }
        this.u0 = true;
        return true;
    }

    public final int P() {
        int i = this.r0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // defpackage.hg4
    public final void b(b29 b29Var, boolean z) {
        boolean z2;
        int i;
        int i2;
        of4[] of4VarArr = this.P;
        of4 of4Var = this.H;
        of4VarArr[0] = of4Var;
        int i3 = 2;
        of4 of4Var2 = this.I;
        of4VarArr[2] = of4Var2;
        of4 of4Var3 = this.J;
        of4VarArr[1] = of4Var3;
        of4 of4Var4 = this.K;
        of4VarArr[3] = of4Var4;
        for (of4 of4Var5 : of4VarArr) {
            of4Var5.i = b29Var.k(of4Var5);
        }
        int i4 = this.r0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        of4 of4Var6 = of4VarArr[i4];
        if (!this.u0) {
            O();
        }
        if (this.u0) {
            this.u0 = false;
            int i5 = this.r0;
            if (i5 == 0 || i5 == 1) {
                b29Var.d(of4Var.i, this.X);
                b29Var.d(of4Var3.i, this.X);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    b29Var.d(of4Var2.i, this.Y);
                    b29Var.d(of4Var4.i, this.Y);
                    return;
                }
                return;
            }
        }
        int i6 = 0;
        while (true) {
            if (i6 >= this.q0) {
                z2 = false;
                break;
            }
            hg4 hg4Var = this.p0[i6];
            if ((this.s0 || hg4Var.c()) && ((((i2 = this.r0) == 0 || i2 == 1) && hg4Var.o0[0] == 3 && hg4Var.H.f != null && hg4Var.J.f != null) || ((i2 == 2 || i2 == 3) && hg4Var.o0[1] == 3 && hg4Var.I.f != null && hg4Var.K.f != null))) {
                z2 = true;
                break;
            }
            i6++;
        }
        boolean z3 = of4Var.e() || of4Var3.e();
        boolean z4 = of4Var2.e() || of4Var4.e();
        int i7 = !(!z2 && (((i = this.r0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.q0) {
            hg4 hg4Var2 = this.p0[i8];
            if (this.s0 || hg4Var2.c()) {
                adg adgVarK = b29Var.k(hg4Var2.P[this.r0]);
                of4[] of4VarArr2 = hg4Var2.P;
                int i9 = this.r0;
                of4 of4Var7 = of4VarArr2[i9];
                of4Var7.i = adgVarK;
                of4 of4Var8 = of4Var7.f;
                int i10 = (of4Var8 == null || of4Var8.d != this) ? 0 : of4Var7.g;
                if (i9 == 0 || i9 == i3) {
                    adg adgVar = of4Var6.i;
                    int i11 = this.t0 - i10;
                    ow owVarL = b29Var.l();
                    adg adgVarM = b29Var.m();
                    adgVarM.d = 0;
                    owVarL.c(adgVar, adgVarK, adgVarM, i11);
                    b29Var.c(owVarL);
                } else {
                    adg adgVar2 = of4Var6.i;
                    int i12 = this.t0 + i10;
                    ow owVarL2 = b29Var.l();
                    adg adgVarM2 = b29Var.m();
                    adgVarM2.d = 0;
                    owVarL2.b(adgVar2, adgVarK, adgVarM2, i12);
                    b29Var.c(owVarL2);
                }
                b29Var.e(of4Var6.i, adgVarK, this.t0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.r0;
        if (i13 == 0) {
            b29Var.e(of4Var3.i, of4Var.i, 0, 8);
            b29Var.e(of4Var.i, this.S.J.i, 0, 4);
            b29Var.e(of4Var.i, this.S.H.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            b29Var.e(of4Var.i, of4Var3.i, 0, 8);
            b29Var.e(of4Var.i, this.S.H.i, 0, 4);
            b29Var.e(of4Var.i, this.S.J.i, 0, 0);
        } else if (i13 == 2) {
            b29Var.e(of4Var4.i, of4Var2.i, 0, 8);
            b29Var.e(of4Var2.i, this.S.K.i, 0, 4);
            b29Var.e(of4Var2.i, this.S.I.i, 0, 0);
        } else if (i13 == 3) {
            b29Var.e(of4Var2.i, of4Var4.i, 0, 8);
            b29Var.e(of4Var2.i, this.S.I.i, 0, 4);
            b29Var.e(of4Var2.i, this.S.K.i, 0, 0);
        }
    }

    @Override // defpackage.hg4
    public final boolean c() {
        return true;
    }

    @Override // defpackage.hg4
    public final String toString() {
        String strW = zo5.w(new StringBuilder("[Barrier] "), this.g0, " {");
        for (int i = 0; i < this.q0; i++) {
            hg4 hg4Var = this.p0[i];
            if (i > 0) {
                strW = strW.concat(", ");
            }
            StringBuilder sbC = nbh.C(strW);
            sbC.append(hg4Var.g0);
            strW = sbC.toString();
        }
        return strW.concat("}");
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
