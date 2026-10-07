package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class d48 extends nql {
    public static final eu6 b = new eu6(21);
    public final b48 a;

    public d48(b48 b48Var) {
        this.a = b48Var;
    }

    public static hq f(nmc nmcVar, int i, int i2) {
        int iX;
        String strConcat;
        int iA = nmcVar.A();
        Charset charsetU = u(iA);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        nmcVar.k(0, bArr, i3);
        if (i2 == 2) {
            strConcat = "image/" + n1g.b0(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iX = 2;
        } else {
            iX = x(0, bArr);
            String strB0 = n1g.b0(new String(bArr, 0, iX, StandardCharsets.ISO_8859_1));
            strConcat = strB0.indexOf(47) == -1 ? "image/".concat(strB0) : strB0;
        }
        int i4 = bArr[iX + 1] & 255;
        int i5 = iX + 2;
        int iW = w(i5, bArr, iA);
        String str = new String(bArr, i5, iW - i5, charsetU);
        int iT = t(iA) + iW;
        return new hq(strConcat, str, i4, i3 <= iT ? vqi.b : Arrays.copyOfRange(bArr, iT, i3));
    }

    public static ts2 g(nmc nmcVar, int i, int i2, boolean z, int i3, b48 b48Var) throws Throwable {
        int i4 = nmcVar.b;
        int iX = x(i4, nmcVar.a);
        String str = new String(nmcVar.a, i4, iX - i4, StandardCharsets.ISO_8859_1);
        nmcVar.N(iX + 1);
        int iM = nmcVar.m();
        int iM2 = nmcVar.m();
        long jC = nmcVar.C();
        if (jC == 4294967295L) {
            jC = -1;
        }
        long jC2 = nmcVar.C();
        long j = jC2 == 4294967295L ? -1L : jC2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (nmcVar.b < i5) {
            e48 e48VarJ = j(i2, nmcVar, z, i3, b48Var);
            if (e48VarJ != null) {
                arrayList.add(e48VarJ);
            }
        }
        return new ts2(str, iM, iM2, jC, j, (e48[]) arrayList.toArray(new e48[0]));
    }

    public static us2 h(nmc nmcVar, int i, int i2, boolean z, int i3, b48 b48Var) throws Throwable {
        int i4 = nmcVar.b;
        int iX = x(i4, nmcVar.a);
        String str = new String(nmcVar.a, i4, iX - i4, StandardCharsets.ISO_8859_1);
        nmcVar.N(iX + 1);
        int iA = nmcVar.A();
        boolean z2 = (iA & 2) != 0;
        boolean z3 = (iA & 1) != 0;
        int iA2 = nmcVar.A();
        String[] strArr = new String[iA2];
        for (int i5 = 0; i5 < iA2; i5++) {
            int i6 = nmcVar.b;
            int iX2 = x(i6, nmcVar.a);
            strArr[i5] = new String(nmcVar.a, i6, iX2 - i6, StandardCharsets.ISO_8859_1);
            nmcVar.N(iX2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (nmcVar.b < i7) {
            e48 e48VarJ = j(i2, nmcVar, z, i3, b48Var);
            if (e48VarJ != null) {
                arrayList.add(e48VarJ);
            }
        }
        return new us2(str, z2, z3, strArr, (e48[]) arrayList.toArray(new e48[0]));
    }

    public static cz3 i(int i, nmc nmcVar) {
        if (i < 4) {
            return null;
        }
        int iA = nmcVar.A();
        Charset charsetU = u(iA);
        byte[] bArr = new byte[3];
        nmcVar.k(0, bArr, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        nmcVar.k(0, bArr2, i2);
        int iW = w(0, bArr2, iA);
        String str2 = new String(bArr2, 0, iW, charsetU);
        int iT = t(iA) + iW;
        return new cz3(str, str2, n(bArr2, iT, w(iT, bArr2, iA), charsetU));
    }

    /* JADX WARN: Code duplicated, block: B:143:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:165:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:167:0x0201 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:178:0x021c  */
    /* JADX WARN: Code duplicated, block: B:180:0x0222  */
    /* JADX WARN: Code duplicated, block: B:185:0x022f A[Catch: all -> 0x0216, Exception -> 0x0218, OutOfMemoryError -> 0x021a, TRY_LEAVE, TryCatch #8 {Exception -> 0x0218, OutOfMemoryError -> 0x021a, all -> 0x0216, blocks: (B:171:0x0211, B:184:0x022a, B:185:0x022f), top: B:199:0x01ff }] */
    /* JADX WARN: Code duplicated, block: B:192:0x0251  */
    /* JADX WARN: Instruction removed from duplicated block: B:192:0x0251, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [e48] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [nmc] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [nmc] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [nmc] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static e48 j(int i, nmc nmcVar, boolean z, int i2, b48 b48Var) throws Throwable {
        int iE;
        int i3;
        ?? r1;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        ?? r9;
        int i4;
        int i5;
        ?? r2;
        Throwable th;
        ?? r3;
        ?? r12;
        ?? r10;
        ?? r11;
        nmc nmcVar2;
        Object gw0Var;
        int i6 = i;
        int iA = nmcVar.A();
        int iA2 = nmcVar.A();
        int iA3 = nmcVar.A();
        int iA4 = i6 >= 3 ? nmcVar.A() : 0;
        if (i6 == 4) {
            iE = nmcVar.E();
            if (!z) {
                iE = (((iE >> 24) & 255) << 21) | (iE & 255) | (((iE >> 8) & 255) << 7) | (((iE >> 16) & 255) << 14);
            }
        } else {
            iE = i6 == 3 ? nmcVar.E() : nmcVar.D();
        }
        int iY = iE;
        int iH = i6 >= 3 ? nmcVar.H() : 0;
        if (iA == 0 && iA2 == 0 && iA3 == 0 && iA4 == 0 && iY == 0 && iH == 0) {
            nmcVar.N(nmcVar.c);
            return null;
        }
        int i7 = nmcVar.b + iY;
        if (i7 > nmcVar.c) {
            lvb.G0("Id3Decoder", "Frame size exceeds remaining tag data");
            nmcVar.N(nmcVar.c);
            return null;
        }
        if (b48Var != null) {
            boolean zC = b48Var.c(i6, iA, iA2, iA3, iA4);
            r1 = iA;
            i3 = iA2;
            if (!zC) {
                i6 = i6;
                nmcVar.N(i7);
                return null;
            }
        } else {
            i3 = iA2;
            r1 = iA;
        }
        i6 = i6;
        if (i6 == 3) {
            z2 = (iH & np0.m) != 0;
            z5 = (iH & 64) != 0;
            z6 = false;
            z4 = (iH & 32) != 0;
            z3 = z2;
        } else if (i6 == 4) {
            boolean z7 = (iH & 64) != 0;
            boolean z8 = (iH & 8) != 0;
            z5 = (iH & 4) != 0;
            z6 = (iH & 2) != 0;
            z3 = (iH & 1) != 0;
            boolean z9 = z8;
            z4 = z7;
            z2 = z9;
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
        }
        if (z2 || z5) {
            lvb.G0("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            nmcVar.N(i7);
            return null;
        }
        if (z4) {
            iY--;
            nmcVar.O(1);
        }
        if (z3) {
            iY -= 4;
            nmcVar.O(4);
        }
        if (z6) {
            iY = y(iY, nmcVar);
        }
        try {
            try {
                if (r1 == 84 && i3 == 88 && iA3 == 88 && (i6 == 2 || iA4 == 88)) {
                    gw0Var = q(iY, nmcVar);
                } else if (r1 == 84) {
                    gw0Var = o(iY, nmcVar, v(i6, r1, i3, iA3, iA4));
                } else if (r1 == 87 && i3 == 88 && iA3 == 88 && (i6 == 2 || iA4 == 88)) {
                    gw0Var = s(iY, nmcVar);
                } else {
                    if (r1 != 87) {
                        if (r1 == 80 && i3 == 82 && iA3 == 73 && iA4 == 86) {
                            gw0Var = m(iY, nmcVar);
                        } else {
                            th = null;
                            try {
                                if (r1 != 71 || i3 != 69 || iA3 != 79 || (iA4 != 66 && i6 != 2)) {
                                    if (i6 == 2) {
                                        if (r1 == 80 && i3 == 73 && iA3 == 67) {
                                            gw0Var = f(nmcVar, iY, i6);
                                        } else if (r1 != 67 && i3 == 79 && iA3 == 77 && (iA4 == 77 || i6 == 2)) {
                                            gw0Var = i(iY, nmcVar);
                                        } else if (r1 != 67 && i3 == 72 && iA3 == 65 && iA4 == 80) {
                                            int i8 = iY;
                                            iY = i3;
                                            i3 = i8;
                                            r11 = r1;
                                            i4 = iA3;
                                            i5 = iA4;
                                            try {
                                                gw0Var = g(nmcVar, i3, i6, z, i2, b48Var);
                                                i6 = i;
                                                r1 = nmcVar;
                                            } catch (Exception e) {
                                                e = e;
                                                i6 = i;
                                                r2 = nmcVar;
                                                r9 = r11;
                                                r2.N(i7);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (OutOfMemoryError e2) {
                                                e = e2;
                                                i6 = i;
                                                r2 = nmcVar;
                                                r9 = r11;
                                                r2.N(i7);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                r3 = nmcVar;
                                                r3.N(i7);
                                                throw th;
                                            }
                                        } else {
                                            int i9 = iY;
                                            iY = i3;
                                            i3 = i9;
                                            r11 = r1;
                                            i4 = iA3;
                                            i5 = iA4;
                                            try {
                                                if (r11 != 67 && iY == 84 && i4 == 79 && i5 == 67) {
                                                    i6 = i;
                                                    nmc nmcVar3 = nmcVar;
                                                    gw0Var = h(nmcVar3, i3, i6, z, i2, b48Var);
                                                    r1 = nmcVar3;
                                                } else {
                                                    i6 = i;
                                                    nmcVar2 = nmcVar;
                                                    if (r11 != 77 && iY == 76 && i4 == 76 && i5 == 84) {
                                                        gw0Var = l(i3, nmcVar2);
                                                        r1 = nmcVar2;
                                                    } else {
                                                        String strV = v(i6, r11 == true ? 1 : 0, iY, i4, i5);
                                                        byte[] bArr = new byte[i3];
                                                        nmcVar2.k(0, bArr, i3);
                                                        gw0Var = new gw0(bArr, strV);
                                                        r1 = nmcVar2;
                                                    }
                                                }
                                            } catch (Exception e3) {
                                                e = e3;
                                                r2 = r1;
                                                r9 = r11;
                                                r2.N(i7);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (OutOfMemoryError e4) {
                                                e = e4;
                                                r2 = r1;
                                                r9 = r11;
                                                r2.N(i7);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                r3 = r1;
                                                r3.N(i7);
                                                throw th;
                                            }
                                        }
                                    } else if (r1 == 65 && i3 == 80 && iA3 == 73 && iA4 == 67) {
                                        gw0Var = f(nmcVar, iY, i6);
                                    } else {
                                        if (r1 != 67) {
                                        }
                                        if (r1 != 67) {
                                            int i10 = iY;
                                            iY = i3;
                                            i3 = i10;
                                            r11 = r1;
                                            i4 = iA3;
                                            i5 = iA4;
                                            if (r11 != 67) {
                                                i6 = i;
                                                nmcVar2 = nmcVar;
                                                if (r11 != 77) {
                                                    String strV2 = v(i6, r11 == true ? 1 : 0, iY, i4, i5);
                                                    byte[] bArr2 = new byte[i3];
                                                    nmcVar2.k(0, bArr2, i3);
                                                    gw0Var = new gw0(bArr2, strV2);
                                                    r1 = nmcVar2;
                                                } else {
                                                    String strV3 = v(i6, r11 == true ? 1 : 0, iY, i4, i5);
                                                    byte[] bArr3 = new byte[i3];
                                                    nmcVar2.k(0, bArr3, i3);
                                                    gw0Var = new gw0(bArr3, strV3);
                                                    r1 = nmcVar2;
                                                }
                                            } else {
                                                i6 = i;
                                                nmcVar2 = nmcVar;
                                                if (r11 != 77) {
                                                    String strV4 = v(i6, r11 == true ? 1 : 0, iY, i4, i5);
                                                    byte[] bArr4 = new byte[i3];
                                                    nmcVar2.k(0, bArr4, i3);
                                                    gw0Var = new gw0(bArr4, strV4);
                                                    r1 = nmcVar2;
                                                } else {
                                                    String strV5 = v(i6, r11 == true ? 1 : 0, iY, i4, i5);
                                                    byte[] bArr5 = new byte[i3];
                                                    nmcVar2.k(0, bArr5, i3);
                                                    gw0Var = new gw0(bArr5, strV5);
                                                    r1 = nmcVar2;
                                                }
                                            }
                                        } else {
                                            int i11 = iY;
                                            iY = i3;
                                            i3 = i11;
                                            r11 = r1;
                                            i4 = iA3;
                                            i5 = iA4;
                                            if (r11 != 67) {
                                                i6 = i;
                                                nmcVar2 = nmcVar;
                                                if (r11 != 77) {
                                                    String strV6 = v(i6, r11 == true ? 1 : 0, iY, i4, i5);
                                                    byte[] bArr6 = new byte[i3];
                                                    nmcVar2.k(0, bArr6, i3);
                                                    gw0Var = new gw0(bArr6, strV6);
                                                    r1 = nmcVar2;
                                                } else {
                                                    String strV7 = v(i6, r11 == true ? 1 : 0, iY, i4, i5);
                                                    byte[] bArr7 = new byte[i3];
                                                    nmcVar2.k(0, bArr7, i3);
                                                    gw0Var = new gw0(bArr7, strV7);
                                                    r1 = nmcVar2;
                                                }
                                            } else {
                                                i6 = i;
                                                nmcVar2 = nmcVar;
                                                if (r11 != 77) {
                                                    String strV8 = v(i6, r11 == true ? 1 : 0, iY, i4, i5);
                                                    byte[] bArr8 = new byte[i3];
                                                    nmcVar2.k(0, bArr8, i3);
                                                    gw0Var = new gw0(bArr8, strV8);
                                                    r1 = nmcVar2;
                                                } else {
                                                    String strV9 = v(i6, r11 == true ? 1 : 0, iY, i4, i5);
                                                    byte[] bArr9 = new byte[i3];
                                                    nmcVar2.k(0, bArr9, i3);
                                                    gw0Var = new gw0(bArr9, strV9);
                                                    r1 = nmcVar2;
                                                }
                                            }
                                        }
                                    }
                                    if (r12 == 0) {
                                        lvb.H0("Id3Decoder", "Failed to decode frame: id=" + v(i6, r10, iY, i4, i5) + ", frameSize=" + i3, e);
                                    }
                                    return r12;
                                }
                                gw0Var = k(iY, nmcVar);
                                int i12 = iY;
                                iY = i3;
                                i3 = i12;
                                r11 = r1;
                                i4 = iA3;
                                i5 = iA4;
                                r1 = nmcVar;
                            } catch (Exception e5) {
                                e = e5;
                                int i13 = iY;
                                iY = i3;
                                i3 = i13;
                                r9 = r1;
                                i4 = iA3;
                                i5 = iA4;
                                r2 = nmcVar;
                                r2.N(i7);
                                r12 = th;
                                r10 = r9;
                                if (r12 == 0) {
                                    lvb.H0("Id3Decoder", "Failed to decode frame: id=" + v(i6, r10, iY, i4, i5) + ", frameSize=" + i3, e);
                                }
                                return r12;
                            } catch (OutOfMemoryError e6) {
                                e = e6;
                                int i14 = iY;
                                iY = i3;
                                i3 = i14;
                                r9 = r1;
                                i4 = iA3;
                                i5 = iA4;
                                r2 = nmcVar;
                                r2.N(i7);
                                r12 = th;
                                r10 = r9;
                                if (r12 == 0) {
                                    lvb.H0("Id3Decoder", "Failed to decode frame: id=" + v(i6, r10, iY, i4, i5) + ", frameSize=" + i3, e);
                                }
                                return r12;
                            }
                        }
                        r1.N(i7);
                        r12 = gw0Var;
                        e = th;
                        r10 = r11;
                        if (r12 == 0) {
                            lvb.H0("Id3Decoder", "Failed to decode frame: id=" + v(i6, r10, iY, i4, i5) + ", frameSize=" + i3, e);
                        }
                        return r12;
                    }
                    gw0Var = r(iY, nmcVar, v(i6, r1, i3, iA3, iA4));
                }
                int i15 = iY;
                iY = i3;
                i3 = i15;
                r11 = r1;
                i4 = iA3;
                i5 = iA4;
                r1 = nmcVar;
                th = null;
                r1.N(i7);
                r12 = gw0Var;
                e = th;
                r10 = r11;
            } catch (Exception e7) {
                e = e7;
                int i16 = iY;
                iY = i3;
                i3 = i16;
                r9 = r1;
                i4 = iA3;
                i5 = iA4;
                r2 = nmcVar;
                th = null;
                r2.N(i7);
                r12 = th;
                r10 = r9;
                if (r12 == 0) {
                    lvb.H0("Id3Decoder", "Failed to decode frame: id=" + v(i6, r10, iY, i4, i5) + ", frameSize=" + i3, e);
                }
                return r12;
            } catch (OutOfMemoryError e8) {
                e = e8;
                int i17 = iY;
                iY = i3;
                i3 = i17;
                r9 = r1;
                i4 = iA3;
                i5 = iA4;
                r2 = nmcVar;
                th = null;
                r2.N(i7);
                r12 = th;
                r10 = r9;
                if (r12 == 0) {
                    lvb.H0("Id3Decoder", "Failed to decode frame: id=" + v(i6, r10, iY, i4, i5) + ", frameSize=" + i3, e);
                }
                return r12;
            }
            if (r12 == 0) {
                lvb.H0("Id3Decoder", "Failed to decode frame: id=" + v(i6, r10, iY, i4, i5) + ", frameSize=" + i3, e);
            }
            return r12;
        } catch (Throwable th4) {
            th = th4;
            r3 = nmcVar;
        }
    }

    public static ck7 k(int i, nmc nmcVar) {
        int iA = nmcVar.A();
        Charset charsetU = u(iA);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        nmcVar.k(0, bArr, i2);
        int iX = x(0, bArr);
        String strN = uya.n(new String(bArr, 0, iX, StandardCharsets.ISO_8859_1));
        int i3 = iX + 1;
        int iW = w(i3, bArr, iA);
        String strN2 = n(bArr, i3, iW, charsetU);
        int iT = t(iA) + iW;
        int iW2 = w(iT, bArr, iA);
        String strN3 = n(bArr, iT, iW2, charsetU);
        int iT2 = t(iA) + iW2;
        return new ck7(strN, i2 <= iT2 ? vqi.b : Arrays.copyOfRange(bArr, iT2, i2), strN2, strN3);
    }

    public static m0b l(int i, nmc nmcVar) {
        int iH = nmcVar.H();
        int iD = nmcVar.D();
        int iD2 = nmcVar.D();
        int iA = nmcVar.A();
        int iA2 = nmcVar.A();
        mo2 mo2Var = new mo2();
        mo2Var.p(nmcVar);
        int i2 = ((i - 10) * 8) / (iA + iA2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = mo2Var.i(iA);
            int i5 = mo2Var.i(iA2);
            iArr[i3] = i4;
            iArr2[i3] = i5;
        }
        return new m0b(iH, iD, iD2, iArr, iArr2);
    }

    public static bid m(int i, nmc nmcVar) {
        byte[] bArr = new byte[i];
        nmcVar.k(0, bArr, i);
        int iX = x(0, bArr);
        String str = new String(bArr, 0, iX, StandardCharsets.ISO_8859_1);
        int i2 = iX + 1;
        return new bid(i <= i2 ? vqi.b : Arrays.copyOfRange(bArr, i2, i), str);
    }

    public static String n(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    public static smh o(int i, nmc nmcVar, String str) {
        if (i < 1) {
            return null;
        }
        int iA = nmcVar.A();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        nmcVar.k(0, bArr, i2);
        return new smh(str, null, p(iA, bArr, 0));
    }

    public static ghe p(int i, byte[] bArr, int i2) {
        if (i2 >= bArr.length) {
            return c98.r("");
        }
        z88 z88VarL = c98.l();
        int iW = w(i2, bArr, i);
        while (i2 < iW) {
            z88VarL.c(new String(bArr, i2, iW - i2, u(i)));
            i2 = t(i) + iW;
            iW = w(i2, bArr, i);
        }
        ghe gheVarH = z88VarL.h();
        return gheVarH.isEmpty() ? c98.r("") : gheVarH;
    }

    public static smh q(int i, nmc nmcVar) {
        if (i < 1) {
            return null;
        }
        int iA = nmcVar.A();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        nmcVar.k(0, bArr, i2);
        int iW = w(0, bArr, iA);
        return new smh("TXXX", new String(bArr, 0, iW, u(iA)), p(iA, bArr, t(iA) + iW));
    }

    public static xki r(int i, nmc nmcVar, String str) {
        byte[] bArr = new byte[i];
        nmcVar.k(0, bArr, i);
        return new xki(str, null, new String(bArr, 0, x(0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static xki s(int i, nmc nmcVar) {
        if (i < 1) {
            return null;
        }
        int iA = nmcVar.A();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        nmcVar.k(0, bArr, i2);
        int iW = w(0, bArr, iA);
        String str = new String(bArr, 0, iW, u(iA));
        int iT = t(iA) + iW;
        return new xki("WXXX", str, n(bArr, iT, x(iT, bArr), StandardCharsets.ISO_8859_1));
    }

    public static int t(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static Charset u(int i) {
        if (i == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i != 2) {
            return i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    public static String v(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int w(int i, byte[] bArr, int i2) {
        int iX = x(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return iX;
        }
        while (iX < bArr.length - 1) {
            if ((iX - i) % 2 == 0 && bArr[iX + 1] == 0) {
                return iX;
            }
            iX = x(iX + 1, bArr);
        }
        return bArr.length;
    }

    public static int x(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int y(int i, nmc nmcVar) {
        byte[] bArr = nmcVar.a;
        int i2 = nmcVar.b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007a A[PHI: r3
  0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean z(nmc nmcVar, int i, int i2, boolean z) {
        int iD;
        long jD;
        int iH;
        int i3;
        int i4 = nmcVar.b;
        while (true) {
            try {
                boolean z2 = true;
                if (nmcVar.a() < i2) {
                    nmcVar.N(i4);
                    return true;
                }
                if (i >= 3) {
                    iD = nmcVar.m();
                    jD = nmcVar.C();
                    iH = nmcVar.H();
                } else {
                    iD = nmcVar.D();
                    jD = nmcVar.D();
                    iH = 0;
                }
                if (iD == 0 && jD == 0 && iH == 0) {
                    nmcVar.N(i4);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jD) != 0) {
                        nmcVar.N(i4);
                        return false;
                    }
                    jD = (((jD >> 24) & 255) << 21) | (jD & 255) | (((jD >> 8) & 255) << 7) | (((jD >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i3 = (iH & 64) != 0 ? 1 : 0;
                    if ((iH & 1) == 0) {
                        z2 = false;
                    }
                } else if (i == 3) {
                    i3 = (iH & 32) != 0 ? 1 : 0;
                    if ((iH & np0.m) == 0) {
                        z2 = false;
                    }
                } else {
                    i3 = 0;
                    z2 = false;
                }
                if (z2) {
                    i3 += 4;
                }
                if (jD < i3) {
                    nmcVar.N(i4);
                    return false;
                }
                if (nmcVar.a() < jD) {
                    nmcVar.N(i4);
                    return false;
                }
                nmcVar.O((int) jD);
            } catch (Throwable th) {
                nmcVar.N(i4);
                throw th;
            }
        }
    }

    @Override // defpackage.nql
    public final lwa b(rwa rwaVar, ByteBuffer byteBuffer) {
        return e(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00be  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ce A[SYNTHETIC] */
    public final lwa e(int i, byte[] bArr) {
        boolean z;
        c48 c48Var;
        int i2;
        int i3;
        int iY;
        e48 e48VarJ;
        ArrayList arrayList = new ArrayList();
        nmc nmcVar = new nmc(i, bArr);
        boolean z2 = false;
        if (nmcVar.a() < 10) {
            lvb.G0("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iD = nmcVar.D();
            if (iD == 4801587) {
                int iA = nmcVar.A();
                nmcVar.O(1);
                int iA2 = nmcVar.A();
                int iZ = nmcVar.z();
                if (iA != 2) {
                    if (iA == 3) {
                        if ((iA2 & 64) != 0) {
                            int iM = nmcVar.m();
                            nmcVar.O(iM);
                            iZ -= iM + 4;
                        }
                    } else if (iA == 4) {
                        if ((iA2 & 64) != 0) {
                            int iZ2 = nmcVar.z();
                            nmcVar.O(iZ2 - 4);
                            iZ -= iZ2;
                        }
                        if ((iA2 & 16) != 0) {
                            iZ -= 10;
                        }
                    } else {
                        qt4.y(iA, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                    }
                    if (iA < 4) {
                        z = false;
                    } else {
                        z = false;
                    }
                    c48Var = new c48();
                    c48Var.b = iA;
                    c48Var.a = z;
                    c48Var.c = iZ;
                } else if ((iA2 & 64) != 0) {
                    lvb.G0("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iA < 4 || (iA2 & np0.m) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    c48Var = new c48();
                    c48Var.b = iA;
                    c48Var.a = z;
                    c48Var.c = iZ;
                }
                if (c48Var == null) {
                    return null;
                }
                i2 = c48Var.b;
                int i4 = nmcVar.b;
                i3 = i2 == 2 ? 6 : 10;
                iY = c48Var.c;
                if (c48Var.a) {
                    iY = y(iY, nmcVar);
                }
                nmcVar.M(i4 + iY);
                if (!z(nmcVar, i2, i3, false)) {
                    if (i2 == 4 || !z(nmcVar, 4, i3, true)) {
                        qt4.y(i2, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
                        return null;
                    }
                    z2 = true;
                }
                while (nmcVar.a() >= i3) {
                    e48VarJ = j(i2, nmcVar, z2, i3, this.a);
                    if (e48VarJ != null) {
                        arrayList.add(e48VarJ);
                    }
                }
                return new lwa(arrayList);
            }
            lvb.G0("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iD))));
        }
        c48Var = null;
        if (c48Var == null) {
            return null;
        }
        i2 = c48Var.b;
        int i5 = nmcVar.b;
        if (i2 == 2) {
        }
        iY = c48Var.c;
        if (c48Var.a) {
            iY = y(iY, nmcVar);
        }
        nmcVar.M(i5 + iY);
        if (!z(nmcVar, i2, i3, false)) {
            if (i2 == 4) {
            }
            qt4.y(i2, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
            return null;
        }
        while (nmcVar.a() >= i3) {
            e48VarJ = j(i2, nmcVar, z2, i3, this.a);
            if (e48VarJ != null) {
                arrayList.add(e48VarJ);
            }
        }
        return new lwa(arrayList);
    }

    public d48() {
        this(null);
    }
}
