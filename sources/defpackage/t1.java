package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t1 extends h0 {
    public static int k(int i, int i2, CharSequence charSequence) {
        while (i < i2 && charSequence.charAt(i) <= ' ') {
            i++;
        }
        return i;
    }

    public static int l(char[] cArr, int i, int i2) {
        while (i < i2 && cArr[i] <= ' ') {
            i++;
        }
        return i;
    }

    public abstract long f();

    public abstract long g();

    public long h(int i, String str) {
        int i2;
        char cA;
        long j;
        long j2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j3;
        boolean z;
        int i7;
        char cA2;
        char c;
        int i8;
        int i9;
        int iMin;
        int i10;
        int i11;
        int i12;
        long j4;
        int i13;
        boolean z2;
        char cA3;
        int i14;
        boolean z3;
        char c2;
        int iC = h0.c(str.length(), 0, i);
        int iK = k(0, iC, str);
        if (iK == iC) {
            throw new NumberFormatException("illegal syntax");
        }
        char cCharAt = str.charAt(iK);
        boolean z4 = cCharAt == '-';
        if (z4 || cCharAt == '+') {
            i2 = iK + 1;
            cA = h0.a(i2, iC, str);
            if (cA == 0) {
                throw new NumberFormatException("illegal syntax");
            }
        } else {
            cA = cCharAt;
            i2 = iK;
        }
        if (cA >= 'I') {
            if (str.charAt(i2) == 'N') {
                int i15 = i2 + 2;
                if (i15 < iC && str.charAt(i2 + 1) == 'a' && str.charAt(i15) == 'N' && k(i2 + 3, iC, str) == iC) {
                    return f();
                }
            } else {
                int i16 = i2 + 7;
                if (i16 < iC && str.charAt(i2) == 'I' && str.charAt(i2 + 1) == 'n' && str.charAt(i2 + 2) == 'f' && str.charAt(i2 + 3) == 'i' && str.charAt(i2 + 4) == 'n' && str.charAt(i2 + 5) == 'i' && str.charAt(i2 + 6) == 't' && str.charAt(i16) == 'y' && k(i2 + 8, iC, str) == iC) {
                    return z4 ? g() : j();
                }
            }
            throw new NumberFormatException("illegal syntax");
        }
        boolean z5 = cA == '0';
        int i17 = 1024;
        if (z5) {
            int i18 = i2 + 1;
            j = 0;
            if ((h0.a(i18, iC, str) | ' ') == 120) {
                int i19 = i2 + 2;
                int i20 = i19;
                long j5 = 0;
                char cCharAt2 = 0;
                int i21 = -1;
                boolean z6 = false;
                while (true) {
                    if (i20 >= iC) {
                        c = 4;
                        i8 = 16;
                        break;
                    }
                    cCharAt2 = str.charAt(i20);
                    c = 4;
                    int iE = h0.e(cCharAt2);
                    if (iE < 0) {
                        i8 = 16;
                        if (iE != -4) {
                            break;
                        }
                        z6 |= i21 >= 0;
                        int i22 = i20;
                        while (true) {
                            if (i22 >= iC - 8) {
                                z3 = z4;
                                c2 = cCharAt2;
                                break;
                            }
                            z3 = z4;
                            c2 = cCharAt2;
                            long jG = kxl.g((((long) str.charAt(i22 + 2)) << 32) | (((long) str.charAt(i22 + 1)) << 48) | (((long) str.charAt(i22 + 3)) << 16) | ((long) str.charAt(i22 + 4)), (((long) str.charAt(i22 + 6)) << 32) | (((long) str.charAt(i22 + 5)) << 48) | (((long) str.charAt(i22 + 7)) << 16) | ((long) str.charAt(i22 + 8)));
                            if (jG < 0) {
                                break;
                            }
                            j5 = (j5 << 32) + jG;
                            i22 += 8;
                            z4 = z3;
                            cCharAt2 = c2;
                        }
                        i21 = i20;
                        i20 = i22;
                    } else {
                        z3 = z4;
                        c2 = cCharAt2;
                        j5 = ((long) iE) | (j5 << 4);
                    }
                    i20++;
                    z4 = z3;
                    cCharAt2 = c2;
                }
                boolean z7 = z4;
                if (i21 < 0) {
                    i9 = i20 - i19;
                    i21 = i20;
                    iMin = 0;
                } else {
                    i9 = (i20 - i19) - 1;
                    iMin = Math.min((i21 - i20) + 1, 1024) * 4;
                }
                boolean z8 = (cCharAt2 | ' ') == 112;
                if (z8) {
                    int i23 = i20 + 1;
                    char cA4 = h0.a(i23, iC, str);
                    boolean z9 = cA4 == '-';
                    if (z9 || cA4 == '+') {
                        i23 = i20 + 2;
                        cA4 = h0.a(i23, iC, str);
                    }
                    char c3 = (char) (cA4 - '0');
                    boolean z10 = z6 | (c3 >= '\n');
                    i12 = 0;
                    while (true) {
                        if (i12 < i17) {
                            i12 = (i12 * 10) + c3;
                        }
                        i23++;
                        cA3 = h0.a(i23, iC, str);
                        char c4 = (char) (cA3 - '0');
                        i14 = iMin;
                        if (c4 >= '\n') {
                            break;
                        }
                        c3 = c4;
                        iMin = i14;
                        i17 = 1024;
                    }
                    if (z9) {
                        i12 = -i12;
                    }
                    i11 = i14 + i12;
                    i10 = i23;
                    cCharAt2 = cA3;
                    z6 = z10;
                } else {
                    int i24 = iMin;
                    i10 = i20;
                    i11 = i24;
                    i12 = 0;
                }
                if ((cCharAt2 | '\"') == 102) {
                    i10++;
                }
                int iK2 = k(i10, iC, str);
                if (z6 || iK2 < iC || i9 == 0 || !z8) {
                    throw new NumberFormatException("illegal syntax");
                }
                if (i9 > i8) {
                    long j6 = 0;
                    int i25 = 0;
                    while (i19 < i20) {
                        int iE2 = h0.e(str.charAt(i19));
                        if (iE2 < 0) {
                            i25++;
                        } else {
                            if (Long.compareUnsigned(j6, 1000000000000000000L) >= 0) {
                                break;
                            }
                            j6 = (j6 << c) | ((long) iE2);
                        }
                        i19++;
                    }
                    z2 = i19 < i20;
                    long j7 = j6;
                    i13 = i25;
                    iK2 = i19;
                    j4 = j7;
                } else {
                    j4 = j5;
                    i13 = 0;
                    z2 = false;
                }
                return o(str, iC, z7, j4, i11, z2, (((i21 - iK2) + i13) * 4) + i12);
            }
            i2 = i18;
        } else {
            j = 0;
        }
        int i26 = i2;
        long j8 = j;
        char cCharAt3 = 0;
        boolean z11 = false;
        int i27 = -1;
        while (true) {
            if (i26 >= iC) {
                j2 = 10;
                break;
            }
            cCharAt3 = str.charAt(i26);
            char c5 = (char) (cCharAt3 - '0');
            j2 = 10;
            if (c5 >= '\n') {
                if (cCharAt3 != '.') {
                    break;
                }
                z11 |= i27 >= 0;
                i27 = i26;
            } else {
                j8 = (j8 * 10) + ((long) c5);
            }
            i26++;
        }
        if (i27 < 0) {
            i3 = i26 - i2;
            i27 = i26;
            i4 = 0;
        } else {
            i3 = (i26 - i2) - 1;
            i4 = (i27 - i26) + 1;
        }
        if ((cCharAt3 | ' ') == 101) {
            i5 = i26 + 1;
            char cA5 = h0.a(i5, iC, str);
            boolean z12 = cA5 == '-';
            if (z12 || cA5 == '+') {
                i5 = i26 + 2;
                cA5 = h0.a(i5, iC, str);
            }
            char c6 = (char) (cA5 - '0');
            boolean z13 = z11 | (c6 >= '\n');
            int i28 = 0;
            while (true) {
                if (i28 < 1024) {
                    i28 = (i28 * 10) + c6;
                }
                i5++;
                cA2 = h0.a(i5, iC, str);
                char c7 = (char) (cA2 - '0');
                if (c7 >= '\n') {
                    break;
                }
                c6 = c7;
            }
            if (z12) {
                i28 = -i28;
            }
            i4 += i28;
            i6 = i28;
            z11 = z13;
            cCharAt3 = cA2;
        } else {
            i5 = i26;
            i6 = 0;
        }
        if ((cCharAt3 | '\"') == 102) {
            i5++;
        }
        int iK3 = k(i5, iC, str);
        if (z11 || iK3 < iC || (!z5 && i3 == 0)) {
            throw new NumberFormatException("illegal syntax");
        }
        if (i3 > 19) {
            long j9 = j;
            int i29 = 0;
            while (i2 < i26) {
                char cCharAt4 = str.charAt(i2);
                if (cCharAt4 != '.') {
                    if (Long.compareUnsigned(j9, 1000000000000000000L) >= 0) {
                        break;
                    }
                    j9 = ((j9 * j2) + ((long) cCharAt4)) - 48;
                } else {
                    i29++;
                }
                i2++;
            }
            i7 = (i27 - i2) + i29 + i6;
            j3 = j9;
            z = i2 < i26;
        } else {
            j3 = j8;
            z = false;
            i7 = 0;
        }
        return m(str, iC, z4, j3, i4, z, i7);
    }

    public long i(char[] cArr, int i, int i2) {
        long j;
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        long j2;
        boolean z2;
        int i7;
        int i8;
        char cB;
        int i9;
        int i10;
        int iMin;
        int i11;
        int i12;
        int i13;
        boolean z3;
        char cB2;
        char c;
        boolean z4;
        int iC = h0.c(cArr.length, i, i2);
        int iL = l(cArr, i, iC);
        if (iL == iC) {
            throw new NumberFormatException("illegal syntax");
        }
        char cB3 = cArr[iL];
        boolean z5 = cB3 == '-';
        if ((z5 || cB3 == '+') && (cB3 = h0.b(cArr, (iL = iL + 1), iC)) == 0) {
            throw new NumberFormatException("illegal syntax");
        }
        if (cB3 >= 'I') {
            char c2 = cArr[iL];
            if (c2 == 'N') {
                int i14 = iL + 2;
                if (i14 < iC && cArr[iL + 1] == 'a' && cArr[i14] == 'N' && l(cArr, iL + 3, iC) == iC) {
                    return f();
                }
            } else {
                int i15 = iL + 7;
                if (i15 < iC && c2 == 'I' && cArr[iL + 1] == 'n' && cArr[iL + 2] == 'f' && cArr[iL + 3] == 'i' && cArr[iL + 4] == 'n' && cArr[iL + 5] == 'i' && cArr[iL + 6] == 't' && cArr[i15] == 'y' && l(cArr, iL + 8, iC) == iC) {
                    return z5 ? g() : j();
                }
            }
            throw new NumberFormatException("illegal syntax");
        }
        boolean z6 = cB3 == '0';
        boolean z7 = true;
        if (z6) {
            int i16 = iL + 1;
            if ((h0.b(cArr, i16, iC) | ' ') == 120) {
                int i17 = iL + 2;
                int i18 = i17;
                long j3 = 0;
                char c3 = 0;
                int i19 = -1;
                boolean z8 = false;
                while (true) {
                    if (i18 >= iC) {
                        i9 = 16;
                        break;
                    }
                    char c4 = cArr[i18];
                    i9 = 16;
                    int iE = h0.e(c4);
                    if (iE < 0) {
                        c = c4;
                        if (iE != -4) {
                            c3 = c;
                            break;
                        }
                        z8 |= i19 >= 0;
                        int i20 = i18;
                        while (true) {
                            if (i20 >= iC - 8) {
                                z4 = z5;
                                break;
                            }
                            z4 = z5;
                            int i21 = i20 + 8;
                            long jG = kxl.g((((long) cArr[i20 + 2]) << 32) | (((long) cArr[i20 + 1]) << 48) | (((long) cArr[i20 + 3]) << 16) | ((long) cArr[i20 + 4]), (((long) cArr[i20 + 6]) << 32) | (((long) cArr[i20 + 5]) << 48) | (((long) cArr[i20 + 7]) << 16) | ((long) cArr[i21]));
                            if (jG < 0) {
                                break;
                            }
                            j3 = (j3 << 32) + jG;
                            i20 = i21;
                            z5 = z4;
                        }
                        i19 = i18;
                        i18 = i20;
                    } else {
                        c = c4;
                        z4 = z5;
                        j3 = ((long) iE) | (j3 << 4);
                    }
                    i18++;
                    c3 = c;
                    z5 = z4;
                }
                boolean z9 = z5;
                if (i19 < 0) {
                    i10 = i18 - i17;
                    i19 = i18;
                    iMin = 0;
                } else {
                    i10 = (i18 - i17) - 1;
                    iMin = Math.min((i19 - i18) + 1, 1024) * 4;
                }
                boolean z10 = (c3 | ' ') == 112;
                if (z10) {
                    i11 = i18 + 1;
                    char cB4 = h0.b(cArr, i11, iC);
                    boolean z11 = cB4 == '-';
                    if (z11 || cB4 == '+') {
                        i11 = i18 + 2;
                        cB4 = h0.b(cArr, i11, iC);
                    }
                    char c5 = (char) (cB4 - '0');
                    boolean z12 = z8 | (c5 >= '\n');
                    int i22 = 0;
                    do {
                        if (i22 < 1024) {
                            i22 = (i22 * 10) + c5;
                        }
                        i11++;
                        cB2 = h0.b(cArr, i11, iC);
                        c5 = (char) (cB2 - '0');
                    } while (c5 < '\n');
                    if (z11) {
                        i22 = -i22;
                    }
                    iMin += i22;
                    i12 = i22;
                    c3 = cB2;
                    z8 = z12;
                } else {
                    i11 = i18;
                    i12 = 0;
                }
                if ((c3 | '\"') == 102) {
                    i11++;
                }
                int iL2 = l(cArr, i11, iC);
                if (z8 || iL2 < iC || i10 == 0 || !z10) {
                    throw new NumberFormatException("illegal syntax");
                }
                if (i10 > i9) {
                    long j4 = 0;
                    int i23 = i17;
                    i13 = 0;
                    while (i23 < i18) {
                        int iE2 = h0.e(cArr[i23]);
                        if (iE2 < 0) {
                            i13++;
                        } else {
                            if (Long.compareUnsigned(j4, 1000000000000000000L) >= 0) {
                                break;
                            }
                            j4 = (j4 << 4) | ((long) iE2);
                        }
                        i23++;
                    }
                    j3 = j4;
                    z3 = i23 < i18;
                    iL2 = i23;
                } else {
                    i13 = 0;
                    z3 = false;
                }
                return p(cArr, i, iC, z9, j3, iMin, z3, (((i19 - iL2) + i13) * 4) + i12);
            }
            iL = i16;
        }
        boolean z13 = z5;
        int iMin2 = Math.min(iC - 4, 1073741824);
        int i24 = iL;
        long j5 = 0;
        char c6 = 0;
        boolean z14 = false;
        int i25 = -1;
        while (true) {
            if (i24 >= iC) {
                j = 10;
                break;
            }
            c6 = cArr[i24];
            char c7 = (char) (c6 - '0');
            j = 10;
            if (c7 >= '\n') {
                if (c6 != '.') {
                    break;
                }
                z14 |= i25 >= 0;
                int i26 = i24;
                while (i26 < iMin2) {
                    int iH = kxl.h(i26 + 1, cArr);
                    if (iH < 0) {
                        break;
                    }
                    j5 = (j5 * 10000) + ((long) iH);
                    i26 += 4;
                }
                i25 = i24;
                i24 = i26;
            } else {
                j5 = (j5 * 10) + ((long) c7);
            }
            i24++;
        }
        if (i25 < 0) {
            i3 = i24 - iL;
            i25 = i24;
            i4 = 0;
        } else {
            i3 = (i24 - iL) - 1;
            i4 = (i25 - i24) + 1;
        }
        if ((c6 | ' ') == 101) {
            int i27 = i24 + 1;
            char cB5 = h0.b(cArr, i27, iC);
            boolean z15 = cB5 == '-';
            if (z15 || cB5 == '+') {
                i27 = i24 + 2;
                cB5 = h0.b(cArr, i27, iC);
            }
            char c8 = (char) (cB5 - '0');
            boolean z16 = (c8 >= '\n') | z14;
            int i28 = 0;
            while (true) {
                if (i28 < 1024) {
                    i28 = (i28 * 10) + c8;
                }
                i27++;
                cB = h0.b(cArr, i27, iC);
                char c9 = (char) (cB - '0');
                z = z6;
                if (c9 >= '\n') {
                    break;
                }
                c8 = c9;
                z6 = z;
            }
            if (z15) {
                i28 = -i28;
            }
            i4 += i28;
            i5 = i27;
            i6 = i28;
            c6 = cB;
            z14 = z16;
        } else {
            z = z6;
            i5 = i24;
            i6 = 0;
        }
        if ((c6 | '\"') == 102) {
            i5++;
        }
        int iL3 = l(cArr, i5, iC);
        if (z14 || iL3 < iC || (!z && i3 == 0)) {
            throw new NumberFormatException("illegal syntax");
        }
        if (i3 > 19) {
            long j6 = 0;
            int i29 = 0;
            while (i8 < i24) {
                char c10 = cArr[i8];
                if (c10 != '.') {
                    if (Long.compareUnsigned(j6, 1000000000000000000L) >= 0) {
                        break;
                    }
                    i8 = iL;
                    j6 = ((j6 * j) + ((long) c10)) - 48;
                } else {
                    i8 = iL;
                    i29++;
                }
                i8++;
            }
            if (i8 >= i24) {
                i8 = iL;
                i8 = iL;
                z7 = false;
            }
            i8 = iL;
            i8 = iL;
            i7 = (i25 - i8) + i29 + i6;
            j2 = j6;
            z2 = z7;
        } else {
            j2 = j5;
            z2 = false;
            i7 = 0;
        }
        return n(cArr, i, iC, z13, j2, i4, z2, i7);
    }

    public abstract long j();

    public abstract long m(CharSequence charSequence, int i, boolean z, long j, int i2, boolean z2, int i3);

    public abstract long n(char[] cArr, int i, int i2, boolean z, long j, int i3, boolean z2, int i4);

    public abstract long o(CharSequence charSequence, int i, boolean z, long j, int i2, boolean z2, int i3);

    public abstract long p(char[] cArr, int i, int i2, boolean z, long j, int i3, boolean z2, int i4);
}
