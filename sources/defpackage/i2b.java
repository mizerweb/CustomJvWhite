package defpackage;

import java.io.EOFException;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class i2b implements jj6 {
    public final int a;
    public final long b;
    public final nmc c;
    public final a3b d;
    public final jj7 e;
    public final vn7 f;
    public final nm5 g;
    public lj6 h;
    public kyh i;
    public kyh j;
    public int k;
    public lwa l;
    public lwa m;
    public long n;
    public long o;
    public long p;
    public long q;
    public int r;
    public bcf s;
    public boolean t;
    public boolean u;
    public long v;

    public i2b(int i, long j) {
        this.a = i;
        this.b = j;
        this.c = new nmc(10);
        this.d = new a3b();
        this.e = new jj7();
        this.n = -9223372036854775807L;
        this.f = new vn7(18);
        nm5 nm5Var = new nm5();
        this.g = nm5Var;
        this.j = nm5Var;
        this.q = -1L;
    }

    @Override // defpackage.jj6
    public final void A(lj6 lj6Var) {
        this.h = lj6Var;
        kyh kyhVarG = lj6Var.G(0, 1);
        this.i = kyhVarG;
        this.j = kyhVarG;
        this.h.D();
    }

    public final jf4 a(kj6 kj6Var, boolean z) {
        nmc nmcVar = this.c;
        kj6Var.u(0, nmcVar.a, 4);
        nmcVar.N(0);
        int iM = nmcVar.m();
        a3b a3bVar = this.d;
        a3bVar.a(iM);
        return new jf4(kj6Var.getLength(), kj6Var.getPosition(), a3bVar.e, a3bVar.b, z, true);
    }

    @Override // defpackage.jj6
    public final boolean b(kj6 kj6Var) {
        return e(kj6Var, true);
    }

    public final void c() {
        Object obj = this.s;
        if ((obj instanceof jf4) && ((if4) obj).f()) {
            long j = this.q;
            if (j == -1 || j == this.s.e()) {
                return;
            }
            jf4 jf4Var = (jf4) this.s;
            this.s = new jf4(this.q, jf4Var.i, jf4Var.j, jf4Var.k, jf4Var.l, false);
            lj6 lj6Var = this.h;
            lj6Var.getClass();
            lj6Var.r(this.s);
            kyh kyhVar = this.i;
            kyhVar.getClass();
            kyhVar.e(this.s.h());
        }
    }

    public final boolean d(kj6 kj6Var) {
        bcf bcfVar = this.s;
        if (bcfVar != null) {
            long jE = bcfVar.e();
            if (jE == -1 || kj6Var.y() <= jE - 4) {
            }
            return true;
        }
        try {
            return !kj6Var.m(this.c.a, 0, 4, true);
        } catch (EOFException unused) {
        }
    }

    public final boolean e(kj6 kj6Var, boolean z) throws EOFException {
        int iY;
        int i;
        int iC;
        kj6Var.q();
        if (kj6Var.getPosition() == 0) {
            lwa lwaVarP = this.f.p(kj6Var, null, 131072);
            this.l = lwaVarP;
            if (lwaVarP != null) {
                this.e.b(lwaVarP);
            }
            iY = (int) kj6Var.y();
            if (!z) {
                kj6Var.E(iY);
            }
            i = 0;
        } else {
            iY = 0;
            i = 0;
        }
        int i2 = i;
        int i3 = i2;
        while (true) {
            if (d(kj6Var)) {
                if (i2 > 0) {
                    break;
                }
                c();
                c.n();
                return false;
            }
            nmc nmcVar = this.c;
            nmcVar.N(0);
            int iM = nmcVar.m();
            if ((i == 0 || ((-128000) & iM) == (((long) i) & (-128000))) && (iC = xjg.c(iM)) != -1) {
                i2++;
                if (i2 != 1) {
                    if (i2 == 4) {
                        break;
                    }
                } else {
                    this.d.a(iM);
                    i = iM;
                }
                kj6Var.z(iC - 4);
            } else {
                int i4 = i3 + 1;
                if (i3 == 131072) {
                    if (z) {
                        return false;
                    }
                    c();
                    c.n();
                    return false;
                }
                if (z) {
                    kj6Var.q();
                    kj6Var.z(iY + i4);
                } else {
                    kj6Var.E(1);
                }
                i2 = 0;
                i3 = i4;
                i = 0;
            }
        }
        if (z) {
            kj6Var.E(iY + i3);
        } else {
            kj6Var.q();
        }
        this.k = i;
        return true;
    }

    @Override // defpackage.jj6
    public final void g(long j, long j2) {
        this.k = 0;
        this.n = -9223372036854775807L;
        this.o = 0L;
        this.r = 0;
        this.q = -1L;
        this.v = j2;
        if (this.s instanceof bd8) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x023e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0249  */
    /* JADX WARN: Code duplicated, block: B:107:0x0259  */
    /* JADX WARN: Code duplicated, block: B:113:0x0293  */
    /* JADX WARN: Code duplicated, block: B:116:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:118:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:122:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:125:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:126:0x02be  */
    /* JADX WARN: Code duplicated, block: B:127:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:129:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:133:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:137:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:139:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:141:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:143:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:147:0x0330  */
    /* JADX WARN: Code duplicated, block: B:148:0x0334  */
    /* JADX WARN: Code duplicated, block: B:150:0x033b  */
    /* JADX WARN: Code duplicated, block: B:152:0x0349  */
    /* JADX WARN: Code duplicated, block: B:155:0x0358  */
    /* JADX WARN: Code duplicated, block: B:158:0x035d A[LOOP:0: B:149:0x0339->B:158:0x035d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:163:0x0367  */
    /* JADX WARN: Code duplicated, block: B:165:0x0370  */
    /* JADX WARN: Code duplicated, block: B:167:0x037e  */
    /* JADX WARN: Code duplicated, block: B:170:0x0392  */
    /* JADX WARN: Code duplicated, block: B:173:0x0397 A[LOOP:1: B:164:0x036e->B:173:0x0397, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:177:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:178:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:181:0x03c7 A[LOOP:2: B:180:0x03c5->B:181:0x03c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:185:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:186:0x03fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:187:0x0400  */
    /* JADX WARN: Code duplicated, block: B:188:0x0403 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:190:0x0406  */
    /* JADX WARN: Code duplicated, block: B:192:0x040a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0060  */
    /* JADX WARN: Code duplicated, block: B:215:0x0484  */
    /* JADX WARN: Code duplicated, block: B:217:0x048a  */
    /* JADX WARN: Code duplicated, block: B:225:0x04af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:226:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:230:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:262:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:263:0x05be  */
    /* JADX WARN: Code duplicated, block: B:266:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:278:0x0360 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x0362 A[EDGE_INSN: B:279:0x0362->B:160:0x0362 BREAK  A[LOOP:0: B:149:0x0339->B:158:0x035d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:280:0x039a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x039c A[EDGE_INSN: B:281:0x039c->B:175:0x039c BREAK  A[LOOP:1: B:164:0x036e->B:173:0x0397], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x007d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:42:0x0110  */
    /* JADX WARN: Code duplicated, block: B:44:0x0113  */
    /* JADX WARN: Code duplicated, block: B:46:0x0116  */
    /* JADX WARN: Code duplicated, block: B:49:0x011d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0122  */
    /* JADX WARN: Code duplicated, block: B:51:0x0127  */
    /* JADX WARN: Code duplicated, block: B:52:0x012c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0160  */
    /* JADX WARN: Code duplicated, block: B:66:0x0197  */
    /* JADX WARN: Code duplicated, block: B:67:0x019c  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01af  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b7 A[LOOP:4: B:75:0x01b5->B:76:0x01b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:85:0x01db  */
    /* JADX WARN: Code duplicated, block: B:87:0x01fd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x0205  */
    /* JADX WARN: Code duplicated, block: B:93:0x021b  */
    /* JADX WARN: Code duplicated, block: B:96:0x022f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0234 A[ADDED_TO_REGION] */
    @Override // defpackage.jj6
    public final int l(kj6 kj6Var, s8 s8Var) throws Throwable {
        Throwable th;
        int i;
        int i2;
        long j;
        long j2;
        int iC;
        int i3;
        int i4;
        int iM;
        jj7 jj7Var;
        int i5;
        long j3;
        int iM2;
        int iE;
        long jC;
        long[] jArr;
        nmc nmcVar;
        k2b k2bVar;
        int i6;
        int i7;
        long j4;
        int i8;
        int i9;
        jj7 jj7Var2;
        lwa lwaVar;
        long position;
        int i10;
        int i11;
        long length;
        long jG0;
        long j5;
        bcf jf4Var;
        long jG1;
        float fIntBitsToFloat;
        j2b j2bVarA;
        j2b j2bVarA2;
        long[] jArr2;
        int i12;
        lwa lwaVar2;
        long position2;
        jwa[] jwaVarArr;
        int length2;
        int i13;
        jwa jwaVar;
        m0b m0bVar;
        int[] iArr;
        jwa[] jwaVarArr2;
        int length3;
        int i14;
        jwa jwaVar2;
        smh smhVar;
        int i15;
        long jX;
        int length4;
        long[] jArr3;
        long[] jArr4;
        long j6;
        int i16;
        n0b n0bVar;
        jwa jwaVar3;
        jwa jwaVar4;
        bcf bcfVarA;
        boolean zF;
        lwa lwaVarB;
        lwa lwaVar3;
        a87 a87Var;
        long length5;
        long position3;
        long j7;
        long jMax;
        int iM3;
        long jG2;
        int iH;
        int iH2;
        int iH3;
        long j8;
        long[] jArr5;
        long[] jArr6;
        int i17;
        nmc nmcVar2;
        int iA;
        this.i.getClass();
        String str = vqi.a;
        int i18 = this.k;
        a3b a3bVar = this.d;
        if (i18 == 0) {
            try {
                e(kj6Var, false);
            } catch (EOFException unused) {
                th = null;
                i = -1;
                i2 = -1;
                j = 1000000;
            }
        }
        if (this.s == null) {
            nmc nmcVar3 = new nmc(a3bVar.b);
            kj6Var.u(0, nmcVar3.a, a3bVar.b);
            int i19 = a3bVar.a & 1;
            int i20 = a3bVar.d;
            int i21 = 21;
            th = null;
            if (i19 != 0) {
                if (i20 != 1) {
                    i4 = 36;
                }
                j = 1000000;
                j2 = 0;
                if (nmcVar3.c >= i4 + 4) {
                    nmcVar3.N(i4);
                    iM = nmcVar3.m();
                    if (iM != 1483304551 && iM != 1231971951) {
                        if (nmcVar3.c >= 40) {
                            nmcVar3.N(36);
                            if (nmcVar3.m() == 1447187017) {
                                iM = 1447187017;
                            } else {
                                iM = 0;
                            }
                        } else {
                            iM = 0;
                        }
                    }
                } else if (nmcVar3.c >= 40) {
                    nmcVar3.N(36);
                    if (nmcVar3.m() == 1447187017) {
                        iM = 1447187017;
                    } else {
                        iM = 0;
                    }
                } else {
                    iM = 0;
                }
                jj7Var = this.e;
                if (iM == 1231971951) {
                    i5 = 0;
                    j3 = -9223372036854775807L;
                    iM2 = nmcVar3.m();
                    if ((iM2 & 1) != 0) {
                        iE = nmcVar3.E();
                    } else {
                        iE = -1;
                    }
                    if ((iM2 & 2) != 0) {
                        jC = nmcVar3.C();
                    } else {
                        jC = -1;
                    }
                    if ((iM2 & 4) == 4) {
                        jArr2 = new long[100];
                        for (i12 = 0; i12 < 100; i12++) {
                            jArr2[i12] = nmcVar3.A();
                        }
                        jArr = jArr2;
                    } else {
                        jArr = null;
                    }
                    if ((iM2 & 8) != 0) {
                        nmcVar = nmcVar3;
                        nmcVar.O(4);
                    } else {
                        nmcVar = nmcVar3;
                    }
                    if (nmcVar.a() >= 24) {
                        nmcVar.O(11);
                        fIntBitsToFloat = Float.intBitsToFloat(nmcVar.m());
                        int iH4 = nmcVar.H();
                        int iH5 = nmcVar.H();
                        j2bVarA = j2b.a(iH4);
                        j2bVarA2 = j2b.a(iH5);
                        if (fIntBitsToFloat > 0.0f && j2bVarA == null && j2bVarA2 == null) {
                            k2bVar = null;
                        } else {
                            k2bVar = new k2b(fIntBitsToFloat, j2bVarA, j2bVarA2);
                        }
                        nmcVar.O(2);
                        int iD = nmcVar.D();
                        i7 = (16773120 & iD) >> 12;
                        i6 = iD & 4095;
                    } else {
                        k2bVar = null;
                        i6 = -1;
                        i7 = -1;
                    }
                    j4 = iE;
                    i8 = a3bVar.b;
                    int i22 = a3bVar.c;
                    i9 = a3bVar.e;
                    int i23 = a3bVar.f;
                    jj7Var2 = jj7Var;
                    if ((jj7Var2.a != -1 || jj7Var2.b == -1) && i7 != -1 && i6 != -1) {
                        jj7Var2.a = i7;
                        jj7Var2.b = i6;
                    }
                    if (k2bVar != null) {
                        lwaVar = new lwa(k2bVar);
                    } else {
                        lwaVar = null;
                    }
                    this.m = lwaVar;
                    position = kj6Var.getPosition();
                    if (kj6Var.getLength() != -1 || jC == -1) {
                        i10 = i8;
                    } else {
                        i10 = i8;
                        long j9 = position + jC;
                        if (kj6Var.getLength() != j9) {
                            lvb.r0("Mp3Extractor", "Data size mismatch between stream (" + kj6Var.getLength() + ") and Xing frame (" + j9 + "), using Xing value.");
                        }
                        kj6Var.E(a3bVar.b);
                        if (iM == 1483304551) {
                            if (j4 != -1 || j4 == 0) {
                                jG1 = -9223372036854775807L;
                            } else {
                                jG1 = vqi.g0(i22, (j4 * ((long) i23)) - 1);
                            }
                            if (jG1 == -9223372036854775807L) {
                                jf4Var = null;
                            } else {
                                jf4Var = new d1k(position, i10, jG1, i9, jC, jArr);
                            }
                        } else {
                            i11 = i10;
                            length = kj6Var.getLength();
                            if (j4 != -1 || j4 == 0) {
                                jG0 = -9223372036854775807L;
                            } else {
                                jG0 = vqi.g0(i22, (((long) i23) * j4) - 1);
                            }
                            if (jG0 != -9223372036854775807L) {
                                if (jC != -1) {
                                    length = position + jC;
                                    j5 = jC - ((long) i11);
                                } else if (length != -1) {
                                    j5 = (length - position) - ((long) i11);
                                } else {
                                    jf4Var = null;
                                }
                                long j10 = length;
                                long j11 = j5;
                                RoundingMode roundingMode = RoundingMode.HALF_UP;
                                jf4Var = new jf4(j10, position + ((long) i11), k4m.b(vqi.i0(j11, 8000000L, jG0, roundingMode)), k4m.b(yok.b(j11, j4, roundingMode)), false, true);
                            } else {
                                jf4Var = null;
                            }
                        }
                    }
                    kj6Var.E(a3bVar.b);
                    if (iM == 1483304551) {
                        if (j4 != -1) {
                            jG1 = -9223372036854775807L;
                        } else {
                            jG1 = -9223372036854775807L;
                        }
                        if (jG1 == -9223372036854775807L) {
                            jf4Var = null;
                        } else {
                            jf4Var = new d1k(position, i10, jG1, i9, jC, jArr);
                        }
                    } else {
                        i11 = i10;
                        length = kj6Var.getLength();
                        if (j4 != -1) {
                            jG0 = -9223372036854775807L;
                        } else {
                            jG0 = -9223372036854775807L;
                        }
                        if (jG0 != -9223372036854775807L) {
                            if (jC != -1) {
                                length = position + jC;
                                j5 = jC - ((long) i11);
                            } else if (length != -1) {
                                j5 = (length - position) - ((long) i11);
                            } else {
                                jf4Var = null;
                            }
                            long j12 = length;
                            long j13 = j5;
                            RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                            jf4Var = new jf4(j12, position + ((long) i11), k4m.b(vqi.i0(j13, 8000000L, jG0, roundingMode2)), k4m.b(yok.b(j13, j4, roundingMode2)), false, true);
                        } else {
                            jf4Var = null;
                        }
                    }
                } else if (iM != 1447187017) {
                    length5 = kj6Var.getLength();
                    position3 = kj6Var.getPosition();
                    j3 = -9223372036854775807L;
                    nmcVar3.O(6);
                    int iM4 = nmcVar3.m();
                    i5 = 0;
                    j7 = position3 + ((long) a3bVar.b);
                    jMax = j7 + ((long) iM4);
                    iM3 = nmcVar3.m();
                    if (iM3 <= 0) {
                        jG2 = vqi.g0(a3bVar.c, (((long) iM3) * ((long) a3bVar.f)) - 1);
                        iH = nmcVar3.H();
                        iH2 = nmcVar3.H();
                        iH3 = nmcVar3.H();
                        nmcVar3.O(2);
                        j8 = position3 + ((long) a3bVar.b);
                        jArr5 = new long[iH];
                        jArr6 = new long[iH];
                        i17 = 0;
                        while (true) {
                            if (i17 < iH) {
                                jj7Var2 = jj7Var;
                                if (length5 != -1 && length5 != jMax) {
                                    StringBuilder sbS = qt4.s(length5, "VBRI data size mismatch: ", ", ");
                                    sbS.append(jMax);
                                    lvb.G0("VbriSeeker", sbS.toString());
                                }
                                if (jMax != j8) {
                                    StringBuilder sbS2 = qt4.s(jMax, "VBRI bytes and ToC mismatch (using max): ", ", ");
                                    sbS2.append(j8);
                                    sbS2.append("\nSeeking will be inaccurate.");
                                    lvb.G0("VbriSeeker", sbS2.toString());
                                    jMax = Math.max(jMax, j8);
                                }
                                jf4Var = new mri(jArr5, jArr6, jG2, j7, jMax, a3bVar.e);
                                break;
                            }
                            nmcVar2 = nmcVar3;
                            jj7Var2 = jj7Var;
                            jArr5[i17] = (((long) i17) * jG2) / ((long) iH);
                            jArr6[i17] = j8;
                            if (iH3 != 1) {
                                iA = nmcVar2.A();
                            } else if (iH3 != 2) {
                                iA = nmcVar2.H();
                            } else if (iH3 != 3) {
                                iA = nmcVar2.D();
                            } else {
                                if (iH3 != 4) {
                                    jf4Var = null;
                                    break;
                                }
                                iA = nmcVar2.E();
                            }
                            j8 += ((long) iH2) * ((long) iA);
                            i17++;
                            nmcVar3 = nmcVar2;
                            jj7Var = jj7Var2;
                        }
                    } else {
                        jf4Var = null;
                        jj7Var2 = jj7Var;
                    }
                    kj6Var.E(a3bVar.b);
                } else if (iM != 1483304551) {
                    kj6Var.q();
                    jf4Var = null;
                    jj7Var2 = jj7Var;
                    i5 = 0;
                    j3 = -9223372036854775807L;
                } else {
                    i5 = 0;
                    j3 = -9223372036854775807L;
                    iM2 = nmcVar3.m();
                    if ((iM2 & 1) != 0) {
                        iE = nmcVar3.E();
                    } else {
                        iE = -1;
                    }
                    if ((iM2 & 2) != 0) {
                        jC = nmcVar3.C();
                    } else {
                        jC = -1;
                    }
                    if ((iM2 & 4) == 4) {
                        jArr2 = new long[100];
                        while (i12 < 100) {
                            jArr2[i12] = nmcVar3.A();
                        }
                        jArr = jArr2;
                    } else {
                        jArr = null;
                    }
                    if ((iM2 & 8) != 0) {
                        nmcVar = nmcVar3;
                        nmcVar.O(4);
                    } else {
                        nmcVar = nmcVar3;
                    }
                    if (nmcVar.a() >= 24) {
                        nmcVar.O(11);
                        fIntBitsToFloat = Float.intBitsToFloat(nmcVar.m());
                        int iH6 = nmcVar.H();
                        int iH7 = nmcVar.H();
                        j2bVarA = j2b.a(iH6);
                        j2bVarA2 = j2b.a(iH7);
                        if (fIntBitsToFloat > 0.0f) {
                            k2bVar = new k2b(fIntBitsToFloat, j2bVarA, j2bVarA2);
                        } else {
                            k2bVar = new k2b(fIntBitsToFloat, j2bVarA, j2bVarA2);
                        }
                        nmcVar.O(2);
                        int iD2 = nmcVar.D();
                        i7 = (16773120 & iD2) >> 12;
                        i6 = iD2 & 4095;
                    } else {
                        k2bVar = null;
                        i6 = -1;
                        i7 = -1;
                    }
                    j4 = iE;
                    i8 = a3bVar.b;
                    int i24 = a3bVar.c;
                    i9 = a3bVar.e;
                    int i25 = a3bVar.f;
                    jj7Var2 = jj7Var;
                    if (jj7Var2.a != -1) {
                        jj7Var2.a = i7;
                        jj7Var2.b = i6;
                    } else {
                        jj7Var2.a = i7;
                        jj7Var2.b = i6;
                    }
                    if (k2bVar != null) {
                        lwaVar = new lwa(k2bVar);
                    } else {
                        lwaVar = null;
                    }
                    this.m = lwaVar;
                    position = kj6Var.getPosition();
                    if (kj6Var.getLength() != -1) {
                        i10 = i8;
                    } else {
                        i10 = i8;
                    }
                    kj6Var.E(a3bVar.b);
                    if (iM == 1483304551) {
                        if (j4 != -1) {
                            jG1 = -9223372036854775807L;
                        } else {
                            jG1 = -9223372036854775807L;
                        }
                        if (jG1 == -9223372036854775807L) {
                            jf4Var = null;
                        } else {
                            jf4Var = new d1k(position, i10, jG1, i9, jC, jArr);
                        }
                    } else {
                        i11 = i10;
                        length = kj6Var.getLength();
                        if (j4 != -1) {
                            jG0 = -9223372036854775807L;
                        } else {
                            jG0 = -9223372036854775807L;
                        }
                        if (jG0 != -9223372036854775807L) {
                            if (jC != -1) {
                                length = position + jC;
                                j5 = jC - ((long) i11);
                            } else if (length != -1) {
                                j5 = (length - position) - ((long) i11);
                            } else {
                                jf4Var = null;
                            }
                            long j14 = length;
                            long j15 = j5;
                            RoundingMode roundingMode3 = RoundingMode.HALF_UP;
                            jf4Var = new jf4(j14, position + ((long) i11), k4m.b(vqi.i0(j15, 8000000L, jG0, roundingMode3)), k4m.b(yok.b(j15, j4, roundingMode3)), false, true);
                        } else {
                            jf4Var = null;
                        }
                    }
                }
                lwaVar2 = this.l;
                position2 = kj6Var.getPosition();
                if (lwaVar2 == null) {
                    n0bVar = null;
                } else {
                    jwaVarArr = lwaVar2.a;
                    length2 = jwaVarArr.length;
                    i13 = i5;
                    while (true) {
                        if (i13 < length2) {
                            jwaVar = null;
                            break;
                        }
                        jwaVar4 = jwaVarArr[i13];
                        if (m0b.class.isAssignableFrom(jwaVar4.getClass())) {
                            jwaVar = (jwa) m0b.class.cast(jwaVar4);
                            if (!mdd.a.apply(jwaVar)) {
                                jwaVar = null;
                            }
                        } else {
                            jwaVar = null;
                        }
                        if (jwaVar != null) {
                            break;
                        }
                        i13++;
                    }
                    m0bVar = (m0b) jwaVar;
                    if (m0bVar == null) {
                        n0bVar = null;
                    } else {
                        iArr = m0bVar.e;
                        jwaVarArr2 = lwaVar2.a;
                        length3 = jwaVarArr2.length;
                        i14 = i5;
                        while (true) {
                            if (i14 < length3) {
                                jwaVar2 = null;
                                break;
                            }
                            jwaVar3 = jwaVarArr2[i14];
                            if (smh.class.isAssignableFrom(jwaVar3.getClass())) {
                                jwaVar2 = (jwa) smh.class.cast(jwaVar3);
                                if (!((smh) jwaVar2).a.equals("TLEN")) {
                                    jwaVar2 = null;
                                }
                            } else {
                                jwaVar2 = null;
                            }
                            if (jwaVar2 != null) {
                                break;
                            }
                            i14++;
                        }
                        smhVar = (smh) jwaVar2;
                        if (smhVar == null) {
                            jX = j3;
                            i15 = i5;
                        } else {
                            i15 = i5;
                            jX = vqi.X(Long.parseLong((String) smhVar.c.get(i15)));
                        }
                        length4 = iArr.length;
                        int i26 = length4 + 1;
                        jArr3 = new long[i26];
                        jArr4 = new long[i26];
                        jArr3[i15] = position2;
                        jArr4[i15] = 0;
                        j6 = 0;
                        i16 = 1;
                        while (i16 <= length4) {
                            int i27 = i16 - 1;
                            long j16 = position2 + ((long) (m0bVar.c + iArr[i27]));
                            j6 += (long) (m0bVar.d + m0bVar.f[i27]);
                            jArr3[i16] = j16;
                            jArr4[i16] = j6;
                            i16++;
                            length4 = length4;
                            position2 = j16;
                        }
                        n0bVar = new n0b(jX, jArr3, jArr4);
                    }
                }
                if (this.t) {
                    bcfVarA = new acf(j3);
                } else {
                    if (n0bVar != null) {
                        jf4Var = n0bVar;
                    } else if (jf4Var == null) {
                        jf4Var = null;
                    }
                    if (jf4Var == null) {
                        jf4Var = a(kj6Var, false);
                    }
                    bcfVarA = jf4Var;
                    zF = bcfVarA.f();
                    int i28 = this.a;
                    if (zF && !(bcfVarA instanceof jf4) && (i28 & 1) != 0 && bcfVarA.h() != -9223372036854775807L && (bcfVarA.e() != -1 || kj6Var.getLength() != -1)) {
                        long jA = bcfVarA.a() != -1 ? bcfVarA.a() : 0L;
                        long jE = bcfVarA.e() != -1 ? bcfVarA.e() : kj6Var.getLength();
                        bcfVarA = new jf4(jE, jA, k4m.g(vqi.i0(jE - jA, 8000000L, bcfVarA.h(), RoundingMode.HALF_UP)), -1, false, true);
                    } else if (!bcfVarA.f() && !(bcfVarA instanceof jf4) && (i28 & 1) != 0) {
                        bcfVarA = a(kj6Var, false);
                    }
                    this.i.e(bcfVarA.h());
                }
                this.s = bcfVarA;
                this.h.r(bcfVarA);
                lwaVarB = this.l;
                lwaVar3 = this.m;
                if (lwaVarB != null) {
                    if (lwaVar3 != null) {
                        lwaVarB = lwaVarB.b(lwaVar3);
                    }
                    lwaVar3 = lwaVarB;
                }
                a87Var = new a87();
                a87Var.l = uya.n("audio/mpeg");
                a87Var.m = uya.n((String) a3bVar.g);
                a87Var.n = np0.r;
                a87Var.E = a3bVar.d;
                a87Var.F = a3bVar.c;
                jj7 jj7Var3 = jj7Var2;
                a87Var.H = jj7Var3.a;
                a87Var.I = jj7Var3.b;
                a87Var.k = lwaVar3;
                if (this.s.g() != -2147483647) {
                    a87Var.h = this.s.g();
                }
                this.j.g(new b87(a87Var));
                this.p = kj6Var.getPosition();
            } else if (i20 == 1) {
                i21 = 13;
            }
            i4 = i21;
            j = 1000000;
            j2 = 0;
            if (nmcVar3.c >= i4 + 4) {
                nmcVar3.N(i4);
                iM = nmcVar3.m();
                if (iM != 1483304551) {
                    if (nmcVar3.c >= 40) {
                        nmcVar3.N(36);
                        if (nmcVar3.m() == 1447187017) {
                            iM = 1447187017;
                        } else {
                            iM = 0;
                        }
                    } else {
                        iM = 0;
                    }
                }
            } else if (nmcVar3.c >= 40) {
                nmcVar3.N(36);
                if (nmcVar3.m() == 1447187017) {
                    iM = 1447187017;
                } else {
                    iM = 0;
                }
            } else {
                iM = 0;
            }
            jj7Var = this.e;
            if (iM == 1231971951) {
                i5 = 0;
                j3 = -9223372036854775807L;
                iM2 = nmcVar3.m();
                if ((iM2 & 1) != 0) {
                    iE = nmcVar3.E();
                } else {
                    iE = -1;
                }
                if ((iM2 & 2) != 0) {
                    jC = nmcVar3.C();
                } else {
                    jC = -1;
                }
                if ((iM2 & 4) == 4) {
                    jArr2 = new long[100];
                    while (i12 < 100) {
                        jArr2[i12] = nmcVar3.A();
                    }
                    jArr = jArr2;
                } else {
                    jArr = null;
                }
                if ((iM2 & 8) != 0) {
                    nmcVar = nmcVar3;
                    nmcVar.O(4);
                } else {
                    nmcVar = nmcVar3;
                }
                if (nmcVar.a() >= 24) {
                    nmcVar.O(11);
                    fIntBitsToFloat = Float.intBitsToFloat(nmcVar.m());
                    int iH8 = nmcVar.H();
                    int iH9 = nmcVar.H();
                    j2bVarA = j2b.a(iH8);
                    j2bVarA2 = j2b.a(iH9);
                    if (fIntBitsToFloat > 0.0f) {
                        k2bVar = new k2b(fIntBitsToFloat, j2bVarA, j2bVarA2);
                    } else {
                        k2bVar = new k2b(fIntBitsToFloat, j2bVarA, j2bVarA2);
                    }
                    nmcVar.O(2);
                    int iD3 = nmcVar.D();
                    i7 = (16773120 & iD3) >> 12;
                    i6 = iD3 & 4095;
                } else {
                    k2bVar = null;
                    i6 = -1;
                    i7 = -1;
                }
                j4 = iE;
                i8 = a3bVar.b;
                int i29 = a3bVar.c;
                i9 = a3bVar.e;
                int i210 = a3bVar.f;
                jj7Var2 = jj7Var;
                if (jj7Var2.a != -1) {
                    jj7Var2.a = i7;
                    jj7Var2.b = i6;
                } else {
                    jj7Var2.a = i7;
                    jj7Var2.b = i6;
                }
                if (k2bVar != null) {
                    lwaVar = new lwa(k2bVar);
                } else {
                    lwaVar = null;
                }
                this.m = lwaVar;
                position = kj6Var.getPosition();
                if (kj6Var.getLength() != -1) {
                    i10 = i8;
                } else {
                    i10 = i8;
                }
                kj6Var.E(a3bVar.b);
                if (iM == 1483304551) {
                    if (j4 != -1) {
                        jG1 = -9223372036854775807L;
                    } else {
                        jG1 = -9223372036854775807L;
                    }
                    if (jG1 == -9223372036854775807L) {
                        jf4Var = null;
                    } else {
                        jf4Var = new d1k(position, i10, jG1, i9, jC, jArr);
                    }
                } else {
                    i11 = i10;
                    length = kj6Var.getLength();
                    if (j4 != -1) {
                        jG0 = -9223372036854775807L;
                    } else {
                        jG0 = -9223372036854775807L;
                    }
                    if (jG0 != -9223372036854775807L) {
                        if (jC != -1) {
                            length = position + jC;
                            j5 = jC - ((long) i11);
                        } else if (length != -1) {
                            j5 = (length - position) - ((long) i11);
                        } else {
                            jf4Var = null;
                        }
                        long j17 = length;
                        long j18 = j5;
                        RoundingMode roundingMode4 = RoundingMode.HALF_UP;
                        jf4Var = new jf4(j17, position + ((long) i11), k4m.b(vqi.i0(j18, 8000000L, jG0, roundingMode4)), k4m.b(yok.b(j18, j4, roundingMode4)), false, true);
                    } else {
                        jf4Var = null;
                    }
                }
            } else if (iM != 1447187017) {
                length5 = kj6Var.getLength();
                position3 = kj6Var.getPosition();
                j3 = -9223372036854775807L;
                nmcVar3.O(6);
                int iM5 = nmcVar3.m();
                i5 = 0;
                j7 = position3 + ((long) a3bVar.b);
                jMax = j7 + ((long) iM5);
                iM3 = nmcVar3.m();
                if (iM3 <= 0) {
                    jG2 = vqi.g0(a3bVar.c, (((long) iM3) * ((long) a3bVar.f)) - 1);
                    iH = nmcVar3.H();
                    iH2 = nmcVar3.H();
                    iH3 = nmcVar3.H();
                    nmcVar3.O(2);
                    j8 = position3 + ((long) a3bVar.b);
                    jArr5 = new long[iH];
                    jArr6 = new long[iH];
                    i17 = 0;
                    while (true) {
                        if (i17 < iH) {
                            jj7Var2 = jj7Var;
                            if (length5 != -1) {
                                StringBuilder sbS3 = qt4.s(length5, "VBRI data size mismatch: ", ", ");
                                sbS3.append(jMax);
                                lvb.G0("VbriSeeker", sbS3.toString());
                            }
                            if (jMax != j8) {
                                StringBuilder sbS4 = qt4.s(jMax, "VBRI bytes and ToC mismatch (using max): ", ", ");
                                sbS4.append(j8);
                                sbS4.append("\nSeeking will be inaccurate.");
                                lvb.G0("VbriSeeker", sbS4.toString());
                                jMax = Math.max(jMax, j8);
                            }
                            jf4Var = new mri(jArr5, jArr6, jG2, j7, jMax, a3bVar.e);
                            break;
                        }
                        nmcVar2 = nmcVar3;
                        jj7Var2 = jj7Var;
                        jArr5[i17] = (((long) i17) * jG2) / ((long) iH);
                        jArr6[i17] = j8;
                        if (iH3 != 1) {
                            iA = nmcVar2.A();
                        } else if (iH3 != 2) {
                            iA = nmcVar2.H();
                        } else if (iH3 != 3) {
                            iA = nmcVar2.D();
                        } else {
                            if (iH3 != 4) {
                                jf4Var = null;
                                break;
                            }
                            iA = nmcVar2.E();
                        }
                        j8 += ((long) iH2) * ((long) iA);
                        i17++;
                        nmcVar3 = nmcVar2;
                        jj7Var = jj7Var2;
                    }
                } else {
                    jf4Var = null;
                    jj7Var2 = jj7Var;
                }
                kj6Var.E(a3bVar.b);
            } else if (iM != 1483304551) {
                kj6Var.q();
                jf4Var = null;
                jj7Var2 = jj7Var;
                i5 = 0;
                j3 = -9223372036854775807L;
            } else {
                i5 = 0;
                j3 = -9223372036854775807L;
                iM2 = nmcVar3.m();
                if ((iM2 & 1) != 0) {
                    iE = nmcVar3.E();
                } else {
                    iE = -1;
                }
                if ((iM2 & 2) != 0) {
                    jC = nmcVar3.C();
                } else {
                    jC = -1;
                }
                if ((iM2 & 4) == 4) {
                    jArr2 = new long[100];
                    while (i12 < 100) {
                        jArr2[i12] = nmcVar3.A();
                    }
                    jArr = jArr2;
                } else {
                    jArr = null;
                }
                if ((iM2 & 8) != 0) {
                    nmcVar = nmcVar3;
                    nmcVar.O(4);
                } else {
                    nmcVar = nmcVar3;
                }
                if (nmcVar.a() >= 24) {
                    nmcVar.O(11);
                    fIntBitsToFloat = Float.intBitsToFloat(nmcVar.m());
                    int iH10 = nmcVar.H();
                    int iH11 = nmcVar.H();
                    j2bVarA = j2b.a(iH10);
                    j2bVarA2 = j2b.a(iH11);
                    if (fIntBitsToFloat > 0.0f) {
                        k2bVar = new k2b(fIntBitsToFloat, j2bVarA, j2bVarA2);
                    } else {
                        k2bVar = new k2b(fIntBitsToFloat, j2bVarA, j2bVarA2);
                    }
                    nmcVar.O(2);
                    int iD4 = nmcVar.D();
                    i7 = (16773120 & iD4) >> 12;
                    i6 = iD4 & 4095;
                } else {
                    k2bVar = null;
                    i6 = -1;
                    i7 = -1;
                }
                j4 = iE;
                i8 = a3bVar.b;
                int i211 = a3bVar.c;
                i9 = a3bVar.e;
                int i212 = a3bVar.f;
                jj7Var2 = jj7Var;
                if (jj7Var2.a != -1) {
                    jj7Var2.a = i7;
                    jj7Var2.b = i6;
                } else {
                    jj7Var2.a = i7;
                    jj7Var2.b = i6;
                }
                if (k2bVar != null) {
                    lwaVar = new lwa(k2bVar);
                } else {
                    lwaVar = null;
                }
                this.m = lwaVar;
                position = kj6Var.getPosition();
                if (kj6Var.getLength() != -1) {
                    i10 = i8;
                } else {
                    i10 = i8;
                }
                kj6Var.E(a3bVar.b);
                if (iM == 1483304551) {
                    if (j4 != -1) {
                        jG1 = -9223372036854775807L;
                    } else {
                        jG1 = -9223372036854775807L;
                    }
                    if (jG1 == -9223372036854775807L) {
                        jf4Var = null;
                    } else {
                        jf4Var = new d1k(position, i10, jG1, i9, jC, jArr);
                    }
                } else {
                    i11 = i10;
                    length = kj6Var.getLength();
                    if (j4 != -1) {
                        jG0 = -9223372036854775807L;
                    } else {
                        jG0 = -9223372036854775807L;
                    }
                    if (jG0 != -9223372036854775807L) {
                        if (jC != -1) {
                            length = position + jC;
                            j5 = jC - ((long) i11);
                        } else if (length != -1) {
                            j5 = (length - position) - ((long) i11);
                        } else {
                            jf4Var = null;
                        }
                        long j19 = length;
                        long j110 = j5;
                        RoundingMode roundingMode5 = RoundingMode.HALF_UP;
                        jf4Var = new jf4(j19, position + ((long) i11), k4m.b(vqi.i0(j110, 8000000L, jG0, roundingMode5)), k4m.b(yok.b(j110, j4, roundingMode5)), false, true);
                    } else {
                        jf4Var = null;
                    }
                }
            }
            lwaVar2 = this.l;
            position2 = kj6Var.getPosition();
            if (lwaVar2 == null) {
                n0bVar = null;
            } else {
                jwaVarArr = lwaVar2.a;
                length2 = jwaVarArr.length;
                i13 = i5;
                while (true) {
                    if (i13 < length2) {
                        jwaVar = null;
                        break;
                    }
                    jwaVar4 = jwaVarArr[i13];
                    if (m0b.class.isAssignableFrom(jwaVar4.getClass())) {
                        jwaVar = (jwa) m0b.class.cast(jwaVar4);
                        if (!mdd.a.apply(jwaVar)) {
                            jwaVar = null;
                        }
                    } else {
                        jwaVar = null;
                    }
                    if (jwaVar != null) {
                        break;
                        break;
                    }
                    i13++;
                }
                m0bVar = (m0b) jwaVar;
                if (m0bVar == null) {
                    n0bVar = null;
                } else {
                    iArr = m0bVar.e;
                    jwaVarArr2 = lwaVar2.a;
                    length3 = jwaVarArr2.length;
                    i14 = i5;
                    while (true) {
                        if (i14 < length3) {
                            jwaVar2 = null;
                            break;
                        }
                        jwaVar3 = jwaVarArr2[i14];
                        if (smh.class.isAssignableFrom(jwaVar3.getClass())) {
                            jwaVar2 = (jwa) smh.class.cast(jwaVar3);
                            if (!((smh) jwaVar2).a.equals("TLEN")) {
                                jwaVar2 = null;
                            }
                        } else {
                            jwaVar2 = null;
                        }
                        if (jwaVar2 != null) {
                            break;
                            break;
                        }
                        i14++;
                    }
                    smhVar = (smh) jwaVar2;
                    if (smhVar == null) {
                        jX = j3;
                        i15 = i5;
                    } else {
                        i15 = i5;
                        jX = vqi.X(Long.parseLong((String) smhVar.c.get(i15)));
                    }
                    length4 = iArr.length;
                    int i213 = length4 + 1;
                    jArr3 = new long[i213];
                    jArr4 = new long[i213];
                    jArr3[i15] = position2;
                    jArr4[i15] = 0;
                    j6 = 0;
                    i16 = 1;
                    while (i16 <= length4) {
                        int i214 = i16 - 1;
                        long j111 = position2 + ((long) (m0bVar.c + iArr[i214]));
                        j6 += (long) (m0bVar.d + m0bVar.f[i214]);
                        jArr3[i16] = j111;
                        jArr4[i16] = j6;
                        i16++;
                        length4 = length4;
                        position2 = j111;
                    }
                    n0bVar = new n0b(jX, jArr3, jArr4);
                }
            }
            if (this.t) {
                bcfVarA = new acf(j3);
            } else {
                if (n0bVar != null) {
                    jf4Var = n0bVar;
                } else if (jf4Var == null) {
                    jf4Var = null;
                }
                if (jf4Var == null) {
                    jf4Var = a(kj6Var, false);
                }
                bcfVarA = jf4Var;
                zF = bcfVarA.f();
                int i215 = this.a;
                if (zF) {
                    if (!bcfVarA.f()) {
                        bcfVarA = a(kj6Var, false);
                    }
                } else if (!bcfVarA.f()) {
                    bcfVarA = a(kj6Var, false);
                }
                this.i.e(bcfVarA.h());
            }
            this.s = bcfVarA;
            this.h.r(bcfVarA);
            lwaVarB = this.l;
            lwaVar3 = this.m;
            if (lwaVarB != null) {
                if (lwaVar3 != null) {
                    lwaVarB = lwaVarB.b(lwaVar3);
                }
                lwaVar3 = lwaVarB;
            }
            a87Var = new a87();
            a87Var.l = uya.n("audio/mpeg");
            a87Var.m = uya.n((String) a3bVar.g);
            a87Var.n = np0.r;
            a87Var.E = a3bVar.d;
            a87Var.F = a3bVar.c;
            jj7 jj7Var4 = jj7Var2;
            a87Var.H = jj7Var4.a;
            a87Var.I = jj7Var4.b;
            a87Var.k = lwaVar3;
            if (this.s.g() != -2147483647) {
                a87Var.h = this.s.g();
            }
            this.j.g(new b87(a87Var));
            this.p = kj6Var.getPosition();
        } else {
            th = null;
            j = 1000000;
            j2 = 0;
            if (this.p != 0) {
                long position4 = kj6Var.getPosition();
                long j20 = this.p;
                if (position4 < j20) {
                    kj6Var.E((int) (j20 - position4));
                }
            }
        }
        if (this.r == 0) {
            kj6Var.q();
            if (d(kj6Var)) {
                i = -1;
            } else {
                nmc nmcVar4 = this.c;
                nmcVar4.N(0);
                int iM6 = nmcVar4.m();
                if (((-128000) & iM6) != (((long) this.k) & (-128000)) || xjg.c(iM6) == -1) {
                    kj6Var.E(1);
                    this.k = 0;
                } else {
                    a3bVar.a(iM6);
                    if (this.n == -9223372036854775807L) {
                        this.n = this.s.b(kj6Var.getPosition());
                        long j21 = this.b;
                        if (j21 != -9223372036854775807L) {
                            this.n = (j21 - this.s.b(j2)) + this.n;
                        }
                    }
                    this.r = a3bVar.b;
                    this.q = kj6Var.getPosition() + ((long) a3bVar.b);
                    if (this.s instanceof bd8) {
                        long j22 = ((this.o + ((long) a3bVar.f)) * j) / ((long) a3bVar.c);
                        throw th;
                    }
                    iC = this.j.c(kj6Var, this.r, true);
                    if (iC == -1) {
                        i = -1;
                    } else {
                        i3 = this.r - iC;
                        this.r = i3;
                        if (i3 <= 0) {
                            this.j.a(((this.o * j) / ((long) a3bVar.c)) + this.n, 1, a3bVar.b, 0, null);
                            this.o += (long) a3bVar.f;
                            this.r = 0;
                            i = 0;
                        }
                    }
                }
                i = 0;
            }
        } else {
            iC = this.j.c(kj6Var, this.r, true);
            if (iC == -1) {
                i = -1;
            } else {
                i3 = this.r - iC;
                this.r = i3;
                if (i3 <= 0) {
                    i = 0;
                } else {
                    this.j.a(((this.o * j) / ((long) a3bVar.c)) + this.n, 1, a3bVar.b, 0, null);
                    this.o += (long) a3bVar.f;
                    this.r = 0;
                    i = 0;
                }
            }
        }
        i2 = -1;
        if (i == i2) {
            bcf bcfVar = this.s;
            if (bcfVar instanceof bd8) {
                if (bcfVar.h() != ((this.o * j) / ((long) a3bVar.c)) + this.n) {
                    ((bd8) this.s).getClass();
                    throw th;
                }
            }
        }
        return i;
    }

    @Override // defpackage.jj6
    public final void release() {
    }

    public i2b(int i) {
        this(i, -9223372036854775807L);
    }
}
