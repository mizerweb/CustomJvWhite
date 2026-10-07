package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class g4 implements r36 {
    public final /* synthetic */ int a;
    public final mo2 b;
    public final nmc c;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public kyh h;
    public int i;
    public int j;
    public boolean k;
    public long l;
    public b87 m;
    public int n;
    public long o;

    public g4(String str, int i, int i2, String str2) {
        this.a = i2;
        switch (i2) {
            case 1:
                mo2 mo2Var = new mo2(16, new byte[16]);
                this.b = mo2Var;
                this.c = new nmc(mo2Var.b);
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                break;
            default:
                mo2 mo2Var2 = new mo2(np0.m, new byte[np0.m]);
                this.b = mo2Var2;
                this.c = new nmc(mo2Var2.b);
                this.i = 0;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                break;
        }
    }

    private final void a(boolean z) {
    }

    private final void b(boolean z) {
    }

    /* JADX WARN: Code duplicated, block: B:183:0x0363  */
    /* JADX WARN: Code duplicated, block: B:186:0x0371  */
    /* JADX WARN: Code duplicated, block: B:188:0x0379  */
    /* JADX WARN: Code duplicated, block: B:195:0x038d  */
    /* JADX WARN: Code duplicated, block: B:197:0x0391  */
    /* JADX WARN: Code duplicated, block: B:198:0x0396  */
    /* JADX WARN: Code duplicated, block: B:200:0x0399  */
    /* JADX WARN: Code duplicated, block: B:202:0x039f  */
    /* JADX WARN: Code duplicated, block: B:204:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:332:0x03a3 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.r36
    public final void d(nmc nmcVar) {
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        long j;
        nmcVar = nmcVar;
        int i20 = this.a;
        int i21 = this.e;
        String str2 = this.d;
        String str3 = this.f;
        mo2 mo2Var = this.b;
        long j2 = -9223372036854775807L;
        int i22 = 0;
        int i23 = 1;
        int i24 = 2;
        nmc nmcVar2 = this.c;
        int i25 = 16;
        switch (i20) {
            case 0:
                this.h.getClass();
                while (nmcVar.a() > 0) {
                    int i26 = this.i;
                    if (i26 == 0) {
                        while (true) {
                            if (nmcVar.a() <= 0) {
                                i22 = 0;
                                i23 = 1;
                                i24 = 2;
                            } else if (this.k) {
                                int iA = nmcVar.A();
                                if (iA == 119) {
                                    this.k = false;
                                    this.i = 1;
                                    byte[] bArr = nmcVar2.a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.j = 2;
                                    i24 = 2;
                                    i22 = 0;
                                    i23 = 1;
                                } else {
                                    this.k = iA == 11;
                                }
                            } else {
                                this.k = nmcVar.A() == 11;
                            }
                        }
                    } else if (i26 == i23) {
                        byte[] bArr2 = nmcVar2.a;
                        int iMin = Math.min(nmcVar.a(), 128 - this.j);
                        nmcVar.k(this.j, bArr2, iMin);
                        int i27 = this.j + iMin;
                        this.j = i27;
                        if (i27 == 128) {
                            mo2Var.q(i22);
                            int iG = mo2Var.g();
                            mo2Var.t(40);
                            int i28 = mo2Var.i(5) > 10 ? i23 : i22;
                            mo2Var.q(iG);
                            int[] iArr = t01.d;
                            int[] iArr2 = t01.b;
                            if (i28 != 0) {
                                mo2Var.t(i25);
                                int i29 = mo2Var.i(i24);
                                if (i29 == 0) {
                                    i7 = 0;
                                } else if (i29 != i23) {
                                    i7 = i29 != i24 ? -1 : i24;
                                } else {
                                    i7 = i23;
                                }
                                mo2Var.t(3);
                                i4 = (mo2Var.i(11) + i23) * i24;
                                int i30 = mo2Var.i(i24);
                                if (i30 == 3) {
                                    i8 = t01.c[mo2Var.i(i24)];
                                    i9 = 3;
                                    i10 = 6;
                                } else {
                                    int i31 = mo2Var.i(i24);
                                    int i32 = t01.a[i31];
                                    i8 = iArr2[i30];
                                    i9 = i31;
                                    i10 = i32;
                                }
                                i3 = i10 * np0.n;
                                int i33 = (i4 * i8) / (i10 * 32);
                                int i34 = mo2Var.i(3);
                                boolean zH = mo2Var.h();
                                i2 = iArr[i34] + (zH ? 1 : 0);
                                mo2Var.t(10);
                                if (mo2Var.h()) {
                                    i11 = 8;
                                    mo2Var.t(8);
                                } else {
                                    i11 = 8;
                                }
                                if (i34 == 0) {
                                    mo2Var.t(5);
                                    if (mo2Var.h()) {
                                        mo2Var.t(i11);
                                    }
                                }
                                if (i7 == 1 && mo2Var.h()) {
                                    mo2Var.t(16);
                                }
                                if (mo2Var.h()) {
                                    if (i34 > 2) {
                                        mo2Var.t(2);
                                    }
                                    if ((i34 & 1) == 0 || i34 <= 2) {
                                        i15 = 6;
                                    } else {
                                        i15 = 6;
                                        mo2Var.t(6);
                                    }
                                    if ((i34 & 4) != 0) {
                                        mo2Var.t(i15);
                                    }
                                    if (zH && mo2Var.h()) {
                                        mo2Var.t(5);
                                    }
                                    if (i7 != 0) {
                                        i12 = i9;
                                    } else {
                                        if (mo2Var.h()) {
                                            i16 = 6;
                                            mo2Var.t(6);
                                        } else {
                                            i16 = 6;
                                        }
                                        if (i34 == 0 && mo2Var.h()) {
                                            mo2Var.t(i16);
                                        }
                                        if (mo2Var.h()) {
                                            mo2Var.t(i16);
                                        }
                                        int i35 = mo2Var.i(2);
                                        if (i35 == 1) {
                                            mo2Var.t(5);
                                        } else if (i35 == 2) {
                                            mo2Var.t(12);
                                        } else {
                                            if (i35 == 3) {
                                                int i36 = mo2Var.i(5);
                                                if (mo2Var.h()) {
                                                    mo2Var.t(5);
                                                    if (mo2Var.h()) {
                                                        i18 = 4;
                                                        mo2Var.t(4);
                                                    } else {
                                                        i18 = 4;
                                                    }
                                                    if (mo2Var.h()) {
                                                        mo2Var.t(i18);
                                                    }
                                                    if (mo2Var.h()) {
                                                        mo2Var.t(i18);
                                                    }
                                                    if (mo2Var.h()) {
                                                        mo2Var.t(i18);
                                                    }
                                                    if (mo2Var.h()) {
                                                        mo2Var.t(i18);
                                                    }
                                                    if (mo2Var.h()) {
                                                        mo2Var.t(i18);
                                                    }
                                                    if (mo2Var.h()) {
                                                        mo2Var.t(i18);
                                                    }
                                                    if (mo2Var.h()) {
                                                        if (mo2Var.h()) {
                                                            mo2Var.t(i18);
                                                        }
                                                        if (mo2Var.h()) {
                                                            mo2Var.t(i18);
                                                        }
                                                    }
                                                }
                                                if (mo2Var.h()) {
                                                    mo2Var.t(5);
                                                    if (mo2Var.h()) {
                                                        mo2Var.t(7);
                                                        if (mo2Var.h()) {
                                                            mo2Var.t(8);
                                                            i17 = 2;
                                                        } else {
                                                            i17 = 2;
                                                        }
                                                    } else {
                                                        i17 = 2;
                                                    }
                                                } else {
                                                    i17 = 2;
                                                }
                                                mo2Var.t((i36 + i17) * 8);
                                                mo2Var.c();
                                            }
                                            if (i34 < i17) {
                                                if (mo2Var.h()) {
                                                    mo2Var.t(14);
                                                }
                                                if (i34 == 0 && mo2Var.h()) {
                                                    mo2Var.t(14);
                                                }
                                            }
                                            if (mo2Var.h()) {
                                                i12 = i9;
                                                if (i12 == 0) {
                                                    mo2Var.t(5);
                                                } else {
                                                    for (i19 = 0; i19 < i10; i19++) {
                                                        if (mo2Var.h()) {
                                                            mo2Var.t(5);
                                                        }
                                                    }
                                                }
                                            } else {
                                                i12 = i9;
                                            }
                                        }
                                        i17 = 2;
                                        if (i34 < i17) {
                                            if (mo2Var.h()) {
                                                mo2Var.t(14);
                                            }
                                            if (i34 == 0) {
                                                mo2Var.t(14);
                                            }
                                        }
                                        if (mo2Var.h()) {
                                            i12 = i9;
                                            if (i12 == 0) {
                                                mo2Var.t(5);
                                            } else {
                                                while (i19 < i10) {
                                                    if (mo2Var.h()) {
                                                        mo2Var.t(5);
                                                    }
                                                }
                                            }
                                        } else {
                                            i12 = i9;
                                        }
                                    }
                                } else {
                                    i12 = i9;
                                }
                                if (mo2Var.h()) {
                                    mo2Var.t(5);
                                    if (i34 == 2) {
                                        mo2Var.t(4);
                                    }
                                    if (i34 >= 6) {
                                        mo2Var.t(2);
                                    }
                                    if (mo2Var.h()) {
                                        mo2Var.t(8);
                                    }
                                    if (i34 == 0 && mo2Var.h()) {
                                        mo2Var.t(8);
                                    }
                                    i13 = 3;
                                    if (i30 < 3) {
                                        mo2Var.s();
                                    }
                                } else {
                                    i13 = 3;
                                }
                                if (i7 == 0 && i12 != i13) {
                                    mo2Var.s();
                                }
                                if (i7 == 2 && (i12 == i13 || mo2Var.h())) {
                                    i14 = 6;
                                    mo2Var.t(6);
                                } else {
                                    i14 = 6;
                                }
                                str = (mo2Var.h() && mo2Var.i(i14) == 1 && mo2Var.i(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                                i6 = i8;
                                i5 = i33;
                            } else {
                                mo2Var.t(32);
                                int i37 = mo2Var.i(2);
                                String str4 = i37 == 3 ? null : "audio/ac3";
                                int i38 = mo2Var.i(6);
                                int i39 = t01.e[i38 / 2] * 1000;
                                int iC = t01.c(i37, i38);
                                mo2Var.t(8);
                                int i40 = mo2Var.i(3);
                                if ((i40 & 1) == 0 || i40 == 1) {
                                    i = 2;
                                } else {
                                    i = 2;
                                    mo2Var.t(2);
                                }
                                if ((i40 & 4) != 0) {
                                    mo2Var.t(i);
                                }
                                if (i40 == i) {
                                    mo2Var.t(i);
                                }
                                int i41 = i37 < 3 ? iArr2[i37] : -1;
                                i2 = iArr[i40] + (mo2Var.h() ? 1 : 0);
                                i3 = 1536;
                                str = str4;
                                i4 = iC;
                                i5 = i39;
                                i6 = i41;
                            }
                            int i42 = i2;
                            b87 b87Var = this.m;
                            if (b87Var == null || i42 != b87Var.F || i6 != b87Var.G || !Objects.equals(str, b87Var.n)) {
                                a87 a87Var = new a87();
                                a87Var.a = this.g;
                                a87Var.l = uya.n(str3);
                                a87Var.m = uya.n(str);
                                a87Var.E = i42;
                                a87Var.F = i6;
                                a87Var.d = str2;
                                a87Var.f = i21;
                                a87Var.i = i5;
                                if ("audio/ac3".equals(str)) {
                                    a87Var.h = i5;
                                }
                                b87 b87Var2 = new b87(a87Var);
                                this.m = b87Var2;
                                this.h.g(b87Var2);
                            }
                            this.n = i4;
                            this.l = (((long) i3) * 1000000) / ((long) this.m.G);
                            nmcVar2.N(0);
                            this.h.f(np0.m, nmcVar2);
                            this.i = 2;
                            i24 = 2;
                            i22 = 0;
                            i23 = 1;
                        } else {
                            nmcVar = nmcVar;
                        }
                    } else if (i26 == i24) {
                        int iMin2 = Math.min(nmcVar.a(), this.n - this.j);
                        this.h.f(iMin2, nmcVar);
                        int i43 = this.j + iMin2;
                        this.j = i43;
                        if (i43 == this.n) {
                            lvb.b0(this.o != -9223372036854775807L ? i23 : i22);
                            this.h.a(this.o, 1, this.n, 0, null);
                            this.o += this.l;
                            this.i = i22;
                        }
                    }
                    i25 = 16;
                }
                break;
            default:
                this.h.getClass();
                while (nmcVar.a() > 0) {
                    int i44 = this.i;
                    if (i44 == 0) {
                        j = j2;
                        while (nmcVar.a() > 0) {
                            if (this.k) {
                                int iA2 = nmcVar.A();
                                this.k = iA2 == 172;
                                if (iA2 == 64 || iA2 == 65) {
                                    byte b = iA2 == 65;
                                    this.i = 1;
                                    byte[] bArr3 = nmcVar2.a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (b == true ? 65 : 64);
                                    this.j = 2;
                                }
                            } else {
                                this.k = nmcVar.A() == 172;
                            }
                        }
                    } else if (i44 == 1) {
                        j = j2;
                        byte[] bArr4 = nmcVar2.a;
                        int iMin3 = Math.min(nmcVar.a(), 16 - this.j);
                        nmcVar.k(this.j, bArr4, iMin3);
                        int i45 = this.j + iMin3;
                        this.j = i45;
                        if (i45 == 16) {
                            mo2Var.q(0);
                            td0 td0VarG = h21.g(mo2Var);
                            int i46 = td0VarG.b;
                            b87 b87Var3 = this.m;
                            if (b87Var3 == null || 2 != b87Var3.F || i46 != b87Var3.G || !"audio/ac4".equals(b87Var3.n)) {
                                a87 a87Var2 = new a87();
                                a87Var2.a = this.g;
                                a87Var2.l = uya.n(str3);
                                a87Var2.m = uya.n("audio/ac4");
                                a87Var2.E = 2;
                                a87Var2.F = i46;
                                a87Var2.d = str2;
                                a87Var2.f = i21;
                                b87 b87Var4 = new b87(a87Var2);
                                this.m = b87Var4;
                                this.h.g(b87Var4);
                            }
                            this.n = td0VarG.c;
                            this.l = (((long) td0VarG.d) * 1000000) / ((long) this.m.G);
                            nmcVar2.N(0);
                            this.h.f(16, nmcVar2);
                            this.i = 2;
                        }
                    } else if (i44 == 2) {
                        int iMin4 = Math.min(nmcVar.a(), this.n - this.j);
                        this.h.f(iMin4, nmcVar);
                        int i47 = this.j + iMin4;
                        this.j = i47;
                        if (i47 == this.n) {
                            lvb.b0(this.o != j2);
                            j = j2;
                            this.h.a(this.o, 1, this.n, 0, null);
                            this.o += this.l;
                            this.i = 0;
                        }
                    }
                    j2 = j;
                }
                break;
        }
    }

    @Override // defpackage.r36
    public final void f() {
        switch (this.a) {
            case 0:
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                break;
            default:
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                break;
        }
    }

    @Override // defpackage.r36
    public final void g(boolean z) {
        int i = this.a;
    }

    @Override // defpackage.r36
    public final void h(lj6 lj6Var, m5i m5iVar) {
        switch (this.a) {
            case 0:
                m5iVar.a();
                m5iVar.b();
                this.g = m5iVar.e;
                m5iVar.b();
                this.h = lj6Var.G(m5iVar.d, 1);
                break;
            default:
                m5iVar.a();
                m5iVar.b();
                this.g = m5iVar.e;
                m5iVar.b();
                this.h = lj6Var.G(m5iVar.d, 1);
                break;
        }
    }

    @Override // defpackage.r36
    public final void i(int i, long j) {
        switch (this.a) {
            case 0:
                this.o = j;
                break;
            default:
                this.o = j;
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g4(String str) {
        this(null, 0, 0, str);
        this.a = 0;
    }
}
