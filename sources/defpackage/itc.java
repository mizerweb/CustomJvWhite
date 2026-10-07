package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class itc implements n5i {
    public final r36 a;
    public final mo2 b = new mo2(10, new byte[10]);
    public int c = 0;
    public int d;
    public dth e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public itc(r36 r36Var) {
        this.a = r36Var;
    }

    @Override // defpackage.n5i
    public final void a(int i, nmc nmcVar) {
        this.e.getClass();
        int i2 = i & 1;
        int i3 = -1;
        int i4 = 2;
        r36 r36Var = this.a;
        if (i2 != 0) {
            int i5 = this.c;
            if (i5 != 0 && i5 != 1) {
                if (i5 == 2) {
                    lvb.G0("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i5 != 3) {
                        c.t();
                        return;
                    }
                    if (this.j != -1) {
                        lvb.G0("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    r36Var.g(nmcVar.c == 0);
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i6 = i;
        while (nmcVar.a() > 0) {
            int i7 = this.c;
            if (i7 != 0) {
                mo2 mo2Var = this.b;
                if (i7 != 1) {
                    if (i7 == i4) {
                        if (b(nmcVar, mo2Var.b, Math.min(10, this.i)) && b(nmcVar, null, this.i)) {
                            mo2Var.q(0);
                            this.l = -9223372036854775807L;
                            if (this.f) {
                                mo2Var.t(4);
                                long jI = ((long) mo2Var.i(3)) << 30;
                                mo2Var.t(1);
                                long jI2 = ((long) (mo2Var.i(15) << 15)) | jI;
                                mo2Var.t(1);
                                long jI3 = jI2 | ((long) mo2Var.i(15));
                                mo2Var.t(1);
                                if (!this.h && this.g) {
                                    mo2Var.t(4);
                                    long jI4 = ((long) mo2Var.i(3)) << 30;
                                    mo2Var.t(1);
                                    long jI5 = jI4 | ((long) (mo2Var.i(15) << 15));
                                    mo2Var.t(1);
                                    long jI6 = jI5 | ((long) mo2Var.i(15));
                                    mo2Var.t(1);
                                    this.e.b(jI6);
                                    this.h = true;
                                }
                                this.l = this.e.b(jI3);
                            }
                            i6 |= this.k ? 4 : 0;
                            r36Var.i(i6, this.l);
                            this.c = 3;
                            this.d = 0;
                        }
                    } else {
                        if (i7 != 3) {
                            c.t();
                            return;
                        }
                        int iA = nmcVar.a();
                        int i8 = this.j;
                        int i9 = i8 == i3 ? 0 : iA - i8;
                        if (i9 > 0) {
                            iA -= i9;
                            nmcVar.M(nmcVar.b + iA);
                        }
                        r36Var.d(nmcVar);
                        int i10 = this.j;
                        if (i10 != i3) {
                            int i11 = i10 - iA;
                            this.j = i11;
                            if (i11 == 0) {
                                r36Var.g(false);
                                this.c = 1;
                                this.d = 0;
                            }
                        }
                    }
                } else if (b(nmcVar, mo2Var.b, 9)) {
                    this.c = c() ? 2 : 0;
                    this.d = 0;
                }
            } else {
                nmcVar.O(nmcVar.a());
            }
            i3 = -1;
            i4 = 2;
        }
    }

    public final boolean b(nmc nmcVar, byte[] bArr, int i) {
        int iMin = Math.min(nmcVar.a(), i - this.d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            nmcVar.O(iMin);
        } else {
            nmcVar.k(this.d, bArr, iMin);
        }
        int i2 = this.d + iMin;
        this.d = i2;
        return i2 == i;
    }

    public final boolean c() {
        mo2 mo2Var = this.b;
        mo2Var.q(0);
        int i = mo2Var.i(24);
        if (i != 1) {
            qt4.y(i, "Unexpected start code prefix: ", "PesReader");
            this.j = -1;
            return false;
        }
        mo2Var.t(8);
        int i2 = mo2Var.i(16);
        mo2Var.t(5);
        this.k = mo2Var.h();
        mo2Var.t(2);
        this.f = mo2Var.h();
        this.g = mo2Var.h();
        mo2Var.t(6);
        int i3 = mo2Var.i(8);
        this.i = i3;
        if (i2 == 0) {
            this.j = -1;
            return true;
        }
        int i4 = (i2 - 3) - i3;
        this.j = i4;
        if (i4 < 0) {
            lvb.G0("PesReader", "Found negative packet payload size: " + this.j);
            this.j = -1;
        }
        return true;
    }

    @Override // defpackage.n5i
    public final void e(dth dthVar, lj6 lj6Var, m5i m5iVar) {
        this.e = dthVar;
        this.a.h(lj6Var, m5iVar);
    }

    @Override // defpackage.n5i
    public final void f() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.f();
    }
}
