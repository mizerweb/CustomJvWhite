package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class io8 {
    public static final ho8 a = new ho8();
    public static final ho8 b = new ho8();

    /* JADX WARN: Multi-variable type inference failed */
    public static BigDecimal a(String str) {
        int i;
        int i2;
        long j;
        int i3;
        long j2;
        int i4;
        long j3;
        int i5;
        String str2 = str;
        int length = str2.length();
        b.getClass();
        try {
            int iC = h0.c(str2.length(), 0, length);
            char c = ' ';
            int i6 = 1;
            if (length >= 32) {
                return ho8.f(length, str2);
            }
            char cA = h0.a(0, iC, str2);
            boolean z = cA == '-';
            if (z || cA == '+') {
                cA = h0.a(1, iC, str2);
                if (cA == 0) {
                    throw new NumberFormatException("illegal syntax");
                }
                i = 1;
            } else {
                i = 0;
            }
            int i7 = -1;
            int i8 = 0;
            int i9 = i;
            long j4 = 0;
            while (true) {
                char c2 = c;
                if (i9 >= iC) {
                    break;
                }
                cA = str2.charAt(i9);
                char c3 = (char) (cA - '0');
                if (c3 >= '\n') {
                    if (cA != '.') {
                        break;
                    }
                    i8 |= i7 >= 0 ? i6 : 0;
                    int i10 = i9;
                    while (true) {
                        if (i10 >= iC - 4) {
                            i5 = i6;
                            break;
                        }
                        i5 = i6;
                        int i11 = i10 + 4;
                        int i12 = kxl.i((((long) str2.charAt(i10 + 3)) << c2) | ((long) str2.charAt(i10 + 1)) | (((long) str2.charAt(i10 + 2)) << 16) | (((long) str2.charAt(i11)) << 48));
                        if (i12 < 0) {
                            break;
                        }
                        j4 = (j4 * 10000) + ((long) i12);
                        i10 = i11;
                        i6 = i5;
                    }
                    i7 = i9;
                    i9 = i10;
                } else {
                    j4 = (j4 * 10) + ((long) c3);
                    i5 = i6;
                }
                i9 += i5;
                i6 = i5;
                c = c2;
            }
            int i13 = i6;
            if (i7 < 0) {
                i2 = i9 - i;
                i7 = i9;
                j = 0;
            } else {
                i2 = (i9 - i) - i13;
                j = (i7 - i9) + i13;
            }
            int i14 = i2;
            if ((cA | ' ') == 101) {
                int i15 = i9 + 1;
                char cA2 = h0.a(i15, iC, str2);
                int i16 = cA2 == '-' ? i13 : 0;
                i3 = i13;
                if (i16 != 0 || cA2 == '+') {
                    i15 = i9 + 2;
                    cA2 = h0.a(i15, iC, str2);
                }
                char c4 = (char) (cA2 - '0');
                i8 |= c4 >= '\n' ? i3 : 0;
                long j5 = 0;
                while (true) {
                    if (j5 < 2147483647L) {
                        j5 = (j5 * 10) + ((long) c4);
                    }
                    j3 = j5;
                    i15++;
                    char cA3 = (char) (h0.a(i15, iC, str2) - '0');
                    if (cA3 >= '\n') {
                        break;
                    }
                    j5 = j3;
                    c4 = cA3;
                    str2 = str;
                }
                if (i16 != 0) {
                    j3 = -j3;
                }
                j2 = j + j3;
                i4 = i15;
            } else {
                i3 = i13;
                j2 = j;
                i4 = i9;
                i9 = iC;
            }
            h0.d(i8 | (i14 == 0 ? i3 : 0), i4, iC, i14, j2);
            if (i14 >= 19) {
                return ho8.h(str, i, i7, i7 + 1, i9, z, (int) j2);
            }
            if (z) {
                j4 = -j4;
            }
            return new BigDecimal(j4).scaleByPowerOfTen((int) j2);
        } catch (ArithmeticException e) {
            NumberFormatException numberFormatException = new NumberFormatException("value exceeds limits");
            numberFormatException.initCause(e);
            throw numberFormatException;
        }
    }

    public static BigDecimal b(char[] cArr, int i, int i2) {
        int i3;
        long j;
        int i4;
        int i5;
        long j2;
        int iH;
        char[] cArr2 = cArr;
        int i6 = i;
        a.getClass();
        try {
            int iC = h0.c(cArr2.length, i6, i2);
            char c = ' ';
            if (i2 >= 32) {
                return ho8.g(cArr, i, i2);
            }
            char cB = h0.b(cArr2, i6, iC);
            boolean z = cB == '-';
            if ((z || cB == '+') && (cB = h0.b(cArr2, (i6 = i6 + 1), iC)) == 0) {
                throw new NumberFormatException("illegal syntax");
            }
            int i7 = -1;
            int i8 = i6;
            long j3 = 0;
            boolean z2 = false;
            while (true) {
                char c2 = c;
                if (i8 >= iC) {
                    break;
                }
                cB = cArr2[i8];
                char c3 = (char) (cB - '0');
                if (c3 >= '\n') {
                    if (cB != '.') {
                        break;
                    }
                    z2 |= i7 >= 0;
                    int i9 = i8;
                    while (i9 < iC - 4 && (iH = kxl.h(i9 + 1, cArr2)) >= 0) {
                        j3 = (j3 * 10000) + ((long) iH);
                        i9 += 4;
                    }
                    i7 = i8;
                    i8 = i9;
                } else {
                    j3 = (j3 * 10) + ((long) c3);
                }
                i8++;
                c = c2;
            }
            if (i7 < 0) {
                i3 = i8 - i6;
                i4 = i8;
                j = 0;
            } else {
                i3 = (i8 - i6) - 1;
                j = (i7 - i8) + 1;
                i4 = i7;
            }
            boolean z3 = true;
            if ((cB | ' ') == 101) {
                i5 = i8 + 1;
                char cB2 = h0.b(cArr2, i5, iC);
                boolean z4 = cB2 == '-';
                if (z4 || cB2 == '+') {
                    i5 = i8 + 2;
                    cB2 = h0.b(cArr2, i5, iC);
                }
                char c4 = (char) (cB2 - '0');
                z2 |= c4 >= '\n';
                long j4 = 0;
                while (true) {
                    if (j4 < 2147483647L) {
                        j4 = (j4 * 10) + ((long) c4);
                    }
                    j2 = j4;
                    i5++;
                    char cB3 = (char) (h0.b(cArr2, i5, iC) - '0');
                    if (cB3 >= '\n') {
                        break;
                    }
                    j4 = j2;
                    c4 = cB3;
                    cArr2 = cArr;
                }
                if (z4) {
                    j2 = -j2;
                }
                j += j2;
            } else {
                i5 = i8;
                i8 = iC;
            }
            long j5 = j;
            if (i3 != 0) {
                z3 = false;
            }
            int i10 = i3;
            h0.d(z2 | z3, i5, iC, i10, j5);
            if (i10 >= 19) {
                return ho8.i(cArr, i6, i4, i4 + 1, i8, z, (int) j5);
            }
            if (z) {
                j3 = -j3;
            }
            return new BigDecimal(j3).scaleByPowerOfTen((int) j5);
        } catch (ArithmeticException e) {
            NumberFormatException numberFormatException = new NumberFormatException("value exceeds limits");
            numberFormatException.initCause(e);
            throw numberFormatException;
        }
    }
}
