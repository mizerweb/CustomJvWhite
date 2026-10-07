package defpackage;

import androidx.media3.common.ParserException;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes2.dex */
public final class b3b implements r36 {
    public String e;
    public kyh f;
    public boolean i;
    public int k;
    public int l;
    public int n;
    public int o;
    public int s;
    public boolean u;
    public int d = 0;
    public final nmc a = new nmc(2, new byte[15]);
    public final mo2 b = new mo2();
    public final nmc c = new nmc();
    public final a40 p = new a40();
    public int q = -2147483647;
    public int r = -1;
    public long t = -1;
    public boolean j = true;
    public boolean m = true;
    public double g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:155:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:157:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:159:0x02db  */
    /* JADX WARN: Code duplicated, block: B:162:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:189:0x03b7  */
    /* JADX WARN: Instruction removed from duplicated block: B:155:0x02c0, please report this as an issue */
    @Override // defpackage.r36
    public final void d(nmc nmcVar) throws ParserException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        char c;
        byte[] bArr;
        long j;
        long j2;
        ghe gheVarS;
        int i6;
        long j3;
        boolean z;
        int i7;
        this.f.getClass();
        while (nmcVar.a() > 0) {
            int i8 = this.d;
            int i9 = 8;
            int i10 = 3;
            int i11 = 1;
            if (i8 != 0) {
                nmc nmcVar2 = this.c;
                a40 a40Var = this.p;
                if (i8 == 1) {
                    int iA = nmcVar.a();
                    nmc nmcVar3 = this.a;
                    int iMin = Math.min(iA, nmcVar3.a());
                    nmcVar.k(nmcVar3.b, nmcVar3.a, iMin);
                    nmcVar3.O(iMin);
                    if (nmcVar3.a() == 0) {
                        int i12 = nmcVar3.c;
                        byte[] bArr2 = nmcVar3.a;
                        mo2 mo2Var = this.b;
                        mo2Var.o(i12, bArr2);
                        mo2Var.f();
                        int iA2 = vvk.a(mo2Var, 3, 8, 8);
                        a40Var.b = iA2;
                        if (iA2 != -1) {
                            lvb.R(Math.max(Math.max(2, 8), 32) <= 63);
                            yok.a(yok.a(3L, 255L), 4294967296L);
                            if (mo2Var.b() < 2) {
                                j3 = -1;
                            } else {
                                long jK = mo2Var.k(2);
                                if (jK == 3) {
                                    if (mo2Var.b() >= 8) {
                                        long jK2 = mo2Var.k(8);
                                        jK += jK2;
                                        if (jK2 == 255) {
                                            if (mo2Var.b() >= 32) {
                                                jK = mo2Var.k(32) + jK;
                                            }
                                        }
                                    }
                                    j3 = -1;
                                }
                                j3 = jK;
                            }
                            a40Var.c = j3;
                            if (j3 == -1) {
                                z = false;
                            } else {
                                if (j3 > 16) {
                                    throw ParserException.c("Contains sub-stream with an invalid packet label " + a40Var.c);
                                }
                                if (j3 == 0) {
                                    int i13 = a40Var.b;
                                    if (i13 == 1) {
                                        throw ParserException.a(null, "Mpegh3daConfig packet with invalid packet label 0");
                                    }
                                    if (i13 == 2) {
                                        throw ParserException.a(null, "Mpegh3daFrame packet with invalid packet label 0");
                                    }
                                    if (i13 == 17) {
                                        throw ParserException.a(null, "AudioTruncation packet with invalid packet label 0");
                                    }
                                }
                                int iA3 = vvk.a(mo2Var, 11, 24, 24);
                                a40Var.d = iA3;
                                if (iA3 != -1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                        } else {
                            z = false;
                        }
                        if (z) {
                            i7 = 0;
                            this.n = 0;
                            this.o = a40Var.d + i12 + this.o;
                        } else {
                            i7 = 0;
                        }
                        if (z) {
                            nmcVar3.N(i7);
                            this.f.f(nmcVar3.c, nmcVar3);
                            nmcVar3.K(2);
                            nmcVar2.K(a40Var.d);
                            this.m = true;
                            this.d = 2;
                        } else {
                            int i14 = nmcVar3.c;
                            if (i14 < 15) {
                                nmcVar3.M(i14 + 1);
                                this.m = false;
                            }
                        }
                    } else {
                        this.m = false;
                    }
                } else {
                    if (i8 != 2) {
                        c.t();
                        return;
                    }
                    int i15 = a40Var.b;
                    if (i15 == 1 || i15 == 17) {
                        int i16 = nmcVar.b;
                        int iMin2 = Math.min(nmcVar.a(), nmcVar2.a());
                        nmcVar.k(nmcVar2.b, nmcVar2.a, iMin2);
                        nmcVar2.O(iMin2);
                        nmcVar.N(i16);
                    }
                    int iMin3 = Math.min(nmcVar.a(), a40Var.d - this.n);
                    this.f.f(iMin3, nmcVar);
                    int i17 = this.n + iMin3;
                    this.n = i17;
                    if (i17 != a40Var.d) {
                        continue;
                    } else {
                        int i18 = a40Var.b;
                        if (i18 == 1) {
                            byte[] bArr3 = nmcVar2.a;
                            mo2 mo2Var2 = new mo2(bArr3.length, bArr3);
                            int i19 = mo2Var2.i(8);
                            int i20 = mo2Var2.i(5);
                            if (i20 != 31) {
                                switch (i20) {
                                    case 0:
                                        i4 = 96000;
                                        break;
                                    case 1:
                                        i4 = 88200;
                                        break;
                                    case 2:
                                        i4 = 64000;
                                        break;
                                    case 3:
                                        i4 = 48000;
                                        break;
                                    case 4:
                                        i4 = 44100;
                                        break;
                                    case 5:
                                        i4 = 32000;
                                        break;
                                    case 6:
                                        i4 = 24000;
                                        break;
                                    case 7:
                                        i4 = 22050;
                                        break;
                                    case 8:
                                        i4 = 16000;
                                        break;
                                    case 9:
                                        i4 = 12000;
                                        break;
                                    case 10:
                                        i4 = 11025;
                                        break;
                                    case 11:
                                        i4 = 8000;
                                        break;
                                    case 12:
                                        i4 = 7350;
                                        break;
                                    case 13:
                                    case 14:
                                    default:
                                        throw ParserException.c("Unsupported sampling rate index " + i20);
                                    case 15:
                                        i4 = 57600;
                                        break;
                                    case 16:
                                        i4 = 51200;
                                        break;
                                    case 17:
                                        i4 = 40000;
                                        break;
                                    case 18:
                                        i4 = 38400;
                                        break;
                                    case 19:
                                        i4 = 34150;
                                        break;
                                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                                        i4 = 28800;
                                        break;
                                    case 21:
                                        i4 = 25600;
                                        break;
                                    case 22:
                                        i4 = 20000;
                                        break;
                                    case 23:
                                        i4 = 19200;
                                        break;
                                    case 24:
                                        i4 = 17075;
                                        break;
                                    case 25:
                                        i4 = 14400;
                                        break;
                                    case 26:
                                        i4 = 12800;
                                        break;
                                    case 27:
                                        i4 = 9600;
                                        break;
                                }
                            } else {
                                i4 = mo2Var2.i(24);
                            }
                            int i21 = mo2Var2.i(3);
                            if (i21 == 0) {
                                i5 = 768;
                            } else if (i21 == 1) {
                                i5 = 1024;
                            } else if (i21 == 2 || i21 == 3) {
                                i5 = np0.q;
                            } else {
                                if (i21 != 4) {
                                    throw ParserException.c("Unsupported coreSbrFrameLengthIndex " + i21);
                                }
                                i5 = np0.r;
                            }
                            int i22 = i5;
                            if (i21 == 0 || i21 == 1) {
                                c = 0;
                            } else if (i21 == 2) {
                                c = 2;
                            } else if (i21 == 3) {
                                c = 3;
                            } else {
                                if (i21 != 4) {
                                    throw ParserException.c("Unsupported coreSbrFrameLengthIndex " + i21);
                                }
                                c = 1;
                            }
                            mo2Var2.t(2);
                            vvk.d(mo2Var2);
                            int i23 = mo2Var2.i(5);
                            int i24 = 0;
                            int iA4 = 0;
                            while (true) {
                                int i25 = i11;
                                int i26 = 16;
                                if (i24 < i23 + 1) {
                                    int i27 = mo2Var2.i(3);
                                    iA4 = vvk.a(mo2Var2, 5, 8, 16) + 1 + iA4;
                                    if ((i27 == 0 || i27 == 2) && mo2Var2.h()) {
                                        vvk.d(mo2Var2);
                                    }
                                    i24++;
                                    i11 = i25;
                                } else {
                                    int iA5 = vvk.a(mo2Var2, 4, 8, 16) + 1;
                                    mo2Var2.s();
                                    int i28 = 0;
                                    while (true) {
                                        double d = 2.0d;
                                        if (i28 < iA5) {
                                            int i29 = mo2Var2.i(2);
                                            if (i29 == 0) {
                                                mo2Var2.t(i10);
                                                if (mo2Var2.h()) {
                                                    mo2Var2.t(13);
                                                }
                                                if (c > 0) {
                                                    vvk.c(mo2Var2);
                                                }
                                            } else if (i29 == i25) {
                                                mo2Var2.t(i10);
                                                boolean zH = mo2Var2.h();
                                                if (zH) {
                                                    mo2Var2.t(13);
                                                }
                                                if (zH) {
                                                    mo2Var2.s();
                                                }
                                                if (c > 0) {
                                                    vvk.c(mo2Var2);
                                                    i6 = mo2Var2.i(2);
                                                } else {
                                                    i6 = 0;
                                                }
                                                if (i6 > 0) {
                                                    mo2Var2.t(6);
                                                    int i30 = mo2Var2.i(2);
                                                    mo2Var2.t(4);
                                                    if (mo2Var2.h()) {
                                                        mo2Var2.t(5);
                                                    }
                                                    if (i6 == 2 || i6 == i10) {
                                                        mo2Var2.t(6);
                                                    }
                                                    if (i30 == 2) {
                                                        mo2Var2.s();
                                                    }
                                                }
                                                int iFloor = ((int) Math.floor(Math.log(iA4 - 1) / Math.log(2.0d))) + 1;
                                                int i31 = mo2Var2.i(2);
                                                if (i31 > 0 && mo2Var2.h()) {
                                                    mo2Var2.t(iFloor);
                                                }
                                                if (mo2Var2.h()) {
                                                    mo2Var2.t(iFloor);
                                                }
                                                if (c == 0 && i31 == 0) {
                                                    mo2Var2.s();
                                                }
                                            } else if (i29 == i10) {
                                                vvk.a(mo2Var2, 4, i9, i26);
                                                int iA6 = vvk.a(mo2Var2, 4, i9, i26);
                                                if (mo2Var2.h()) {
                                                    vvk.a(mo2Var2, i9, i26, 0);
                                                }
                                                mo2Var2.s();
                                                if (iA6 > 0) {
                                                    mo2Var2.t(iA6 * 8);
                                                }
                                            }
                                            i28++;
                                            i9 = 8;
                                            i10 = 3;
                                            i26 = 16;
                                            i25 = 1;
                                        } else {
                                            if (mo2Var2.h()) {
                                                int i32 = 8;
                                                int iA7 = vvk.a(mo2Var2, 2, 4, 8) + 1;
                                                int i33 = 0;
                                                bArr = null;
                                                while (i33 < iA7) {
                                                    int iA8 = vvk.a(mo2Var2, 4, i32, 16);
                                                    int iA9 = vvk.a(mo2Var2, 4, i32, 16);
                                                    if (iA8 == 7) {
                                                        int i34 = mo2Var2.i(4) + 1;
                                                        mo2Var2.t(4);
                                                        byte[] bArr4 = new byte[i34];
                                                        for (int i35 = 0; i35 < i34; i35++) {
                                                            bArr4[i35] = (byte) mo2Var2.i(i32);
                                                        }
                                                        bArr = bArr4;
                                                    } else {
                                                        mo2Var2.t(iA9 * i32);
                                                    }
                                                    i33++;
                                                    i32 = 8;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (i4) {
                                                case 14700:
                                                case 16000:
                                                    d = 3.0d;
                                                    this.q = (int) (((double) i4) * d);
                                                    this.r = (int) (((double) i22) * d);
                                                    j = this.t;
                                                    j2 = a40Var.c;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        String strConcat = i19 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(i19))) : "mhm1";
                                                        if (bArr != null || bArr.length <= 0) {
                                                            gheVarS = null;
                                                        } else {
                                                            gheVarS = c98.s(vqi.b, bArr);
                                                        }
                                                        a87 a87Var = new a87();
                                                        a87Var.a = this.e;
                                                        a87Var.l = uya.n("video/mp2t");
                                                        a87Var.m = uya.n("audio/mhm1");
                                                        a87Var.F = this.q;
                                                        a87Var.j = strConcat;
                                                        a87Var.p = gheVarS;
                                                        this.f.g(new b87(a87Var));
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.q = (int) (((double) i4) * d);
                                                    this.r = (int) (((double) i22) * d);
                                                    j = this.t;
                                                    j2 = a40Var.c;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        if (i19 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            gheVarS = null;
                                                        } else {
                                                            gheVarS = null;
                                                        }
                                                        a87 a87Var2 = new a87();
                                                        a87Var2.a = this.e;
                                                        a87Var2.l = uya.n("video/mp2t");
                                                        a87Var2.m = uya.n("audio/mhm1");
                                                        a87Var2.F = this.q;
                                                        a87Var2.j = strConcat;
                                                        a87Var2.p = gheVarS;
                                                        this.f.g(new b87(a87Var2));
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                case 29400:
                                                case 32000:
                                                case 58800:
                                                case 64000:
                                                    d = 1.5d;
                                                    this.q = (int) (((double) i4) * d);
                                                    this.r = (int) (((double) i22) * d);
                                                    j = this.t;
                                                    j2 = a40Var.c;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        if (i19 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            gheVarS = null;
                                                        } else {
                                                            gheVarS = null;
                                                        }
                                                        a87 a87Var3 = new a87();
                                                        a87Var3.a = this.e;
                                                        a87Var3.l = uya.n("video/mp2t");
                                                        a87Var3.m = uya.n("audio/mhm1");
                                                        a87Var3.F = this.q;
                                                        a87Var3.j = strConcat;
                                                        a87Var3.p = gheVarS;
                                                        this.f.g(new b87(a87Var3));
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                case 44100:
                                                case 48000:
                                                case 88200:
                                                case 96000:
                                                    d = 1.0d;
                                                    this.q = (int) (((double) i4) * d);
                                                    this.r = (int) (((double) i22) * d);
                                                    j = this.t;
                                                    j2 = a40Var.c;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        if (i19 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            gheVarS = null;
                                                        } else {
                                                            gheVarS = null;
                                                        }
                                                        a87 a87Var4 = new a87();
                                                        a87Var4.a = this.e;
                                                        a87Var4.l = uya.n("video/mp2t");
                                                        a87Var4.m = uya.n("audio/mhm1");
                                                        a87Var4.F = this.q;
                                                        a87Var4.j = strConcat;
                                                        a87Var4.p = gheVarS;
                                                        this.f.g(new b87(a87Var4));
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                default:
                                                    throw ParserException.c("Unsupported sampling rate " + i4);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i18 == 17) {
                                byte[] bArr5 = nmcVar2.a;
                                mo2 mo2Var3 = new mo2(bArr5.length, bArr5);
                                if (mo2Var3.h()) {
                                    mo2Var3.t(2);
                                    i3 = mo2Var3.i(13);
                                } else {
                                    i3 = 0;
                                }
                                this.s = i3;
                            } else if (i18 == 2) {
                                if (this.u) {
                                    this.j = false;
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                double d2 = (((double) (this.r - this.s)) * 1000000.0d) / ((double) this.q);
                                long jRound = Math.round(this.g);
                                if (this.i) {
                                    this.i = false;
                                    this.g = this.h;
                                } else {
                                    this.g += d2;
                                }
                                this.f.a(jRound, i, this.o, 0, null);
                                this.u = false;
                                this.s = 0;
                                this.o = 0;
                            }
                            i2 = 1;
                        }
                        this.d = i2;
                    }
                }
            } else {
                int i36 = this.k;
                if ((i36 & 2) == 0) {
                    nmcVar.N(nmcVar.c);
                } else {
                    if ((i36 & 4) == 0) {
                        while (true) {
                            if (nmcVar.a() > 0) {
                                int i37 = this.l << 8;
                                this.l = i37;
                                int iA10 = i37 | nmcVar.A();
                                this.l = iA10;
                                if ((iA10 & 16777215) == 12583333) {
                                    nmcVar.N(nmcVar.b - 3);
                                    this.l = 0;
                                }
                            }
                        }
                    }
                    this.d = 1;
                }
            }
        }
    }

    @Override // defpackage.r36
    public final void f() {
        this.d = 0;
        this.l = 0;
        this.a.K(2);
        this.n = 0;
        this.o = 0;
        this.q = -2147483647;
        this.r = -1;
        this.s = 0;
        this.t = -1L;
        this.u = false;
        this.i = false;
        this.m = true;
        this.j = true;
        this.g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override // defpackage.r36
    public final void g(boolean z) {
    }

    @Override // defpackage.r36
    public final void h(lj6 lj6Var, m5i m5iVar) {
        m5iVar.a();
        m5iVar.b();
        this.e = m5iVar.e;
        m5iVar.b();
        this.f = lj6Var.G(m5iVar.d, 1);
    }

    @Override // defpackage.r36
    public final void i(int i, long j) {
        this.k = i;
        if (!this.j && (this.o != 0 || !this.m)) {
            this.i = true;
        }
        if (j != -9223372036854775807L) {
            if (this.i) {
                this.h = j;
            } else {
                this.g = j;
            }
        }
    }
}
