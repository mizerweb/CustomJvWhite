package defpackage;

import android.util.Base64;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class lrh {
    public static final ifh a = new ifh(new a5d(28));

    public static String a(byte[] bArr) {
        byte[] bArr2 = (byte[]) a.getValue();
        int length = bArr2.length;
        int length2 = bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr2, length + length2);
        System.arraycopy(bArr, 0, bArrCopyOf, length, length2);
        return "data:mime/type;param=thumbhash;base64,".concat(Base64.encodeToString(bArrCopyOf, 2));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:101:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:105:0x0202 A[LOOP:7: B:103:0x01fc->B:105:0x0202, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x0220  */
    /* JADX WARN: Code duplicated, block: B:112:0x0226  */
    /* JADX WARN: Code duplicated, block: B:114:0x022c  */
    /* JADX WARN: Code duplicated, block: B:115:0x022f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0239 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x023b A[LOOP:9: B:117:0x0233->B:120:0x023b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:129:0x024b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0256 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0127  */
    /* JADX WARN: Code duplicated, block: B:61:0x0129  */
    /* JADX WARN: Code duplicated, block: B:64:0x0131  */
    /* JADX WARN: Code duplicated, block: B:67:0x013e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0140  */
    /* JADX WARN: Code duplicated, block: B:71:0x0148  */
    /* JADX WARN: Code duplicated, block: B:72:0x014a  */
    /* JADX WARN: Code duplicated, block: B:75:0x015f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0164  */
    /* JADX WARN: Code duplicated, block: B:80:0x0170 A[LOOP:2: B:78:0x0167->B:80:0x0170, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x0195 A[LOOP:3: B:82:0x0193->B:83:0x0195, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d0 A[LOOP:5: B:92:0x01c6->B:94:0x01d0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x01ef  */
    public static krh b(byte[] bArr) {
        char c;
        int i;
        ks9 ks9Var;
        int i2;
        float f;
        float f2;
        int iK;
        int iK2;
        byte[] bArr2;
        int i3;
        int iMax;
        int i4;
        int iMax2;
        float[] fArr;
        float[] fArr2;
        int i5;
        int i6;
        float[] fArr3;
        int i7;
        float[] fArr4;
        int i8;
        int i9;
        float[] fArr5;
        int i10;
        float f3;
        int i11;
        int i12;
        float f4;
        int i13;
        int i14;
        int i15;
        float f5;
        float f6;
        int i16;
        int i17;
        float f7;
        int i18;
        int i19;
        float f8;
        float f9;
        int i20;
        int i21;
        int i22;
        float f10;
        int i23;
        int i24;
        float f11;
        int i25 = (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
        int i26 = (bArr[3] & 255) | ((bArr[4] & 255) << 8);
        float f12 = (i25 & 63) / 63.0f;
        float f13 = 1.0f;
        float f14 = (((i25 >> 6) & 63) / 31.5f) - 1.0f;
        float f15 = (((i25 >> 12) & 63) / 31.5f) - 1.0f;
        float f16 = ((i25 >> 18) & 31) / 31.0f;
        boolean z = (i25 >> 23) != 0;
        float f17 = ((i26 >> 3) & 63) / 63.0f;
        float f18 = ((i26 >> 9) & 63) / 63.0f;
        boolean z2 = (i26 >> 15) != 0;
        int i27 = 7;
        if (z2) {
            c = 2;
            i = z ? 5 : 7;
        } else {
            c = 2;
            i = i26 & 7;
        }
        int iMax3 = Math.max(3, i);
        int iMax4 = Math.max(3, z2 ? i26 & 7 : z ? 5 : 7);
        float f19 = z ? (bArr[5] & 15) / 15.0f : 1.0f;
        float f20 = ((bArr[5] >> 4) & 15) / 15.0f;
        int i28 = z ? 6 : 5;
        ks9 ks9Var2 = new ks9(iMax3, iMax4);
        ks9 ks9Var3 = new ks9(3, 3);
        boolean z3 = z;
        ks9 ks9Var4 = new ks9(3, 3);
        int i29 = 3;
        int iY = ks9Var4.y(bArr, i28, ks9Var3.y(bArr, i28, ks9Var2.y(bArr, i28, 0, f16), f17 * 1.25f), f18 * 1.25f);
        if (z3) {
            ks9Var = new ks9(5, 5);
            ks9Var.y(bArr, i28, iY, f20);
        } else {
            ks9Var = null;
        }
        float[] fArrZ = ks9Var2.z();
        float[] fArrZ2 = ks9Var3.z();
        float[] fArrZ3 = ks9Var4.z();
        float[] fArrZ4 = (!z3 || ks9Var == null) ? null : ks9Var.z();
        byte b = bArr[3];
        boolean z4 = (bArr[c] & 128) != 0;
        boolean z5 = (bArr[4] & 128) != 0;
        int i30 = z5 ? z4 ? 5 : 7 : b & 7;
        if (!z5) {
            if (z4) {
                i2 = 5;
            }
            f = i30 / i2;
            if (f > f13) {
                f2 = 32.0f;
            } else {
                f2 = f * 32.0f;
            }
            iK = gm0.K(f2);
            iK2 = gm0.K(f > f13 ? 32.0f / f : 32.0f);
            bArr2 = new byte[iK * iK2 * 4];
            if (z3) {
                i3 = 5;
            } else {
                i3 = 3;
            }
            iMax = Math.max(iMax3, i3);
            if (z3) {
                i4 = 5;
            } else {
                i4 = 3;
            }
            iMax2 = Math.max(iMax4, i4);
            fArr = new float[iMax];
            fArr2 = new float[iMax2];
            i5 = 0;
            i6 = 0;
            while (i5 < iK2) {
                fArr3 = fArrZ3;
                i7 = 0;
                while (i7 < iK) {
                    fArr4 = fArrZ;
                    i8 = 0;
                    while (i8 < iMax) {
                        fArr[i8] = (float) Math.cos((3.141592653589793d / ((double) iK)) * ((double) (i7 + 0.5f)) * ((double) i8));
                        i8++;
                        iMax3 = iMax3;
                        fArrZ4 = fArrZ4;
                    }
                    i9 = iMax3;
                    fArr5 = fArrZ4;
                    i10 = 0;
                    while (i10 < iMax2) {
                        fArr2[i10] = (float) Math.cos((3.141592653589793d / ((double) iK2)) * ((double) (i5 + 0.5f)) * ((double) i10));
                        i10++;
                        i7 = i7;
                        i5 = i5;
                    }
                    int i31 = i5;
                    int i32 = i7;
                    f3 = f12;
                    i11 = 0;
                    i12 = 0;
                    while (i12 < iMax4) {
                        f10 = fArr2[i12] * 2.0f;
                        if (i12 > 0) {
                            i23 = 0;
                        } else {
                            i23 = 1;
                        }
                        i24 = i11;
                        while (true) {
                            f11 = f3;
                            if (i23 * iMax4 < (iMax4 - i12) * i9) {
                                f3 = (fArr4[i24] * fArr[i23] * f10) + f11;
                                i23++;
                                i24++;
                            }
                        }
                        i12++;
                        i11 = i24;
                        f3 = f11;
                    }
                    f4 = f14;
                    i14 = 0;
                    i15 = 0;
                    f5 = f15;
                    for (i13 = i29; i15 < i13; i13 = 3) {
                        f9 = fArr2[i15] * 2.0f;
                        if (i15 > 0) {
                            i20 = 0;
                        } else {
                            i20 = 1;
                        }
                        i21 = i20;
                        while (true) {
                            i22 = i14;
                            if (i21 < 3 - i15) {
                                float f21 = fArr[i21] * f9;
                                f4 = (fArrZ2[i22] * f21) + f4;
                                f5 = (fArr3[i22] * f21) + f5;
                                i21++;
                                i14 = i22 + 1;
                            }
                        }
                        i15++;
                        i14 = i22;
                    }
                    f6 = f19;
                    if (z3) {
                        i16 = 0;
                        i17 = 0;
                        while (i16 < 5) {
                            f7 = fArr2[i16] * 2.0f;
                            if (i16 > 0) {
                                i18 = 0;
                            } else {
                                i18 = 1;
                            }
                            i19 = i18;
                            while (true) {
                                f8 = f3;
                                if (i19 < 5 - i16) {
                                    if (fArr5 != null) {
                                        ore.p("Required value was null.");
                                        return null;
                                    }
                                    f6 += fArr5[i17] * fArr[i19] * f7;
                                    i19++;
                                    i17++;
                                    f3 = f8;
                                }
                            }
                            i16++;
                            f3 = f8;
                        }
                    }
                    float f22 = f3;
                    float f23 = f22 - (f4 * 0.6666667f);
                    float f24 = (((3.0f * f22) - f23) + f5) / 2.0f;
                    bArr2[i6] = (byte) Math.max(0, gm0.K(Math.min(f13, f24) * 255.0f));
                    bArr2[i6 + 1] = (byte) Math.max(0, gm0.K(Math.min(1.0f, f24 - f5) * 255.0f));
                    bArr2[i6 + 2] = (byte) Math.max(0, gm0.K(Math.min(1.0f, f23) * 255.0f));
                    bArr2[i6 + 3] = (byte) Math.max(0, gm0.K(Math.min(1.0f, f6) * 255.0f));
                    i7 = i32 + 1;
                    i6 += 4;
                    f13 = 1.0f;
                    fArrZ = fArr4;
                    iMax3 = i9;
                    fArrZ4 = fArr5;
                    i5 = i31;
                    i29 = 3;
                }
                i5++;
                fArrZ3 = fArr3;
                iMax3 = iMax3;
                fArrZ4 = fArrZ4;
                i29 = 3;
            }
            return new krh(iK, bArr2, iK2);
        }
        i27 = b & 7;
        i2 = i27;
        f = i30 / i2;
        if (f > f13) {
            f2 = 32.0f;
        } else {
            f2 = f * 32.0f;
        }
        iK = gm0.K(f2);
        iK2 = gm0.K(f > f13 ? 32.0f / f : 32.0f);
        bArr2 = new byte[iK * iK2 * 4];
        if (z3) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        iMax = Math.max(iMax3, i3);
        if (z3) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        iMax2 = Math.max(iMax4, i4);
        fArr = new float[iMax];
        fArr2 = new float[iMax2];
        i5 = 0;
        i6 = 0;
        while (i5 < iK2) {
            fArr3 = fArrZ3;
            i7 = 0;
            while (i7 < iK) {
                fArr4 = fArrZ;
                i8 = 0;
                while (i8 < iMax) {
                    fArr[i8] = (float) Math.cos((3.141592653589793d / ((double) iK)) * ((double) (i7 + 0.5f)) * ((double) i8));
                    i8++;
                    iMax3 = iMax3;
                    fArrZ4 = fArrZ4;
                }
                i9 = iMax3;
                fArr5 = fArrZ4;
                i10 = 0;
                while (i10 < iMax2) {
                    fArr2[i10] = (float) Math.cos((3.141592653589793d / ((double) iK2)) * ((double) (i5 + 0.5f)) * ((double) i10));
                    i10++;
                    i7 = i7;
                    i5 = i5;
                }
                int i33 = i5;
                int i34 = i7;
                f3 = f12;
                i11 = 0;
                i12 = 0;
                while (i12 < iMax4) {
                    f10 = fArr2[i12] * 2.0f;
                    if (i12 > 0) {
                        i23 = 0;
                    } else {
                        i23 = 1;
                    }
                    i24 = i11;
                    while (true) {
                        f11 = f3;
                        if (i23 * iMax4 < (iMax4 - i12) * i9) {
                            f3 = (fArr4[i24] * fArr[i23] * f10) + f11;
                            i23++;
                            i24++;
                        }
                    }
                    i12++;
                    i11 = i24;
                    f3 = f11;
                }
                f4 = f14;
                i14 = 0;
                i15 = 0;
                f5 = f15;
                while (i15 < i13) {
                    f9 = fArr2[i15] * 2.0f;
                    if (i15 > 0) {
                        i20 = 0;
                    } else {
                        i20 = 1;
                    }
                    i21 = i20;
                    while (true) {
                        i22 = i14;
                        if (i21 < 3 - i15) {
                            float f25 = fArr[i21] * f9;
                            f4 = (fArrZ2[i22] * f25) + f4;
                            f5 = (fArr3[i22] * f25) + f5;
                            i21++;
                            i14 = i22 + 1;
                        }
                    }
                    i15++;
                    i14 = i22;
                }
                f6 = f19;
                if (z3) {
                    i16 = 0;
                    i17 = 0;
                    while (i16 < 5) {
                        f7 = fArr2[i16] * 2.0f;
                        if (i16 > 0) {
                            i18 = 0;
                        } else {
                            i18 = 1;
                        }
                        i19 = i18;
                        while (true) {
                            f8 = f3;
                            if (i19 < 5 - i16) {
                                if (fArr5 != null) {
                                    ore.p("Required value was null.");
                                    return null;
                                }
                                f6 += fArr5[i17] * fArr[i19] * f7;
                                i19++;
                                i17++;
                                f3 = f8;
                            }
                        }
                        i16++;
                        f3 = f8;
                    }
                }
                float f26 = f3;
                float f27 = f26 - (f4 * 0.6666667f);
                float f28 = (((3.0f * f26) - f27) + f5) / 2.0f;
                bArr2[i6] = (byte) Math.max(0, gm0.K(Math.min(f13, f28) * 255.0f));
                bArr2[i6 + 1] = (byte) Math.max(0, gm0.K(Math.min(1.0f, f28 - f5) * 255.0f));
                bArr2[i6 + 2] = (byte) Math.max(0, gm0.K(Math.min(1.0f, f27) * 255.0f));
                bArr2[i6 + 3] = (byte) Math.max(0, gm0.K(Math.min(1.0f, f6) * 255.0f));
                i7 = i34 + 1;
                i6 += 4;
                f13 = 1.0f;
                fArrZ = fArr4;
                iMax3 = i9;
                fArrZ4 = fArr5;
                i5 = i33;
                i29 = 3;
            }
            i5++;
            fArrZ3 = fArr3;
            iMax3 = iMax3;
            fArrZ4 = fArrZ4;
            i29 = 3;
        }
        return new krh(iK, bArr2, iK2);
    }
}
