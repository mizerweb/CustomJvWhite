package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class av7 {
    public static final int[] a;
    public static final int[] b;
    public static final long[] c;

    static {
        int[] iArr = new int[np0.n];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = "0123456789abcdef".charAt(i2 & 15) | ("0123456789abcdef".charAt(i2 >> 4) << '\b');
        }
        a = iArr;
        int[] iArr2 = new int[np0.n];
        for (int i3 = 0; i3 < 256; i3++) {
            iArr2[i3] = "0123456789ABCDEF".charAt(i3 & 15) | ("0123456789ABCDEF".charAt(i3 >> 4) << '\b');
        }
        int[] iArr3 = new int[np0.n];
        for (int i4 = 0; i4 < 256; i4++) {
            iArr3[i4] = -1;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < 16) {
            iArr3["0123456789abcdef".charAt(i5)] = i6;
            i5++;
            i6++;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < 16) {
            iArr3["0123456789ABCDEF".charAt(i7)] = i8;
            i7++;
            i8++;
        }
        b = iArr3;
        long[] jArr = new long[np0.n];
        for (int i9 = 0; i9 < 256; i9++) {
            jArr[i9] = -1;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < 16) {
            jArr["0123456789abcdef".charAt(i10)] = i11;
            i10++;
            i11++;
        }
        int i12 = 0;
        while (i < 16) {
            jArr["0123456789ABCDEF".charAt(i)] = i12;
            i++;
            i12++;
        }
        c = jArr;
    }

    public static final int a(long j) {
        if (0 <= j && j <= 2147483647L) {
            return (int) j;
        }
        qr7.j(p0m.c(10, j), "The resulting string length is too big: ");
        return 0;
    }

    public static final int b(byte[] bArr, int i, int[] iArr, char[] cArr, int i2) {
        int i3 = iArr[bArr[i] & 255];
        cArr[i2] = (char) (i3 >> 8);
        cArr[i2 + 1] = (char) (i3 & 255);
        return i2 + 2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    public static byte[] c(String str) {
        byte[] bArr;
        dv7 dv7Var = dv7.c;
        int length = str.length();
        e9i.s(0, length, str.length());
        if (length == 0) {
            return new byte[0];
        }
        bv7 bv7Var = dv7Var.a;
        if (bv7Var.a) {
            if (!bv7Var.b) {
                long j = length;
                int i = (int) (j / 2);
                if (((long) i) * 2 != j) {
                    bArr = null;
                } else {
                    bArr = new byte[i];
                    int i2 = i - 1;
                    int i3 = 0;
                    for (int i4 = 0; i4 < i2; i4++) {
                        bArr[i4] = d(i3, str);
                        i3 += 2;
                    }
                    bArr[i2] = d(i3, str);
                }
            } else if ((length & 1) != 0) {
                bArr = null;
            } else {
                int i5 = length >> 1;
                bArr = new byte[i5];
                int i6 = 0;
                for (int i7 = 0; i7 < i5; i7++) {
                    bArr[i7] = d(i6, str);
                    i6 += 2;
                }
            }
            if (bArr != null) {
                return bArr;
            }
        }
        boolean z = bv7Var.c;
        if (length <= 0) {
            ore.p("Failed requirement.");
            return null;
        }
        long j2 = length;
        long j3 = j(1, j2, 4294967294L);
        long j4 = j2 - (4294967295L * j3);
        long j5 = j(2, j4, 4294967294L);
        long j6 = j4 - (4294967296L * j5);
        long j7 = j(0, j6, 2L);
        int i8 = (int) ((j5 * 2147483647L) + (j3 * 2147483647L) + j7 + ((long) (j6 - (2 * j7) > 0 ? 1 : 0)));
        byte[] bArr2 = new byte[i8];
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i9 < length) {
            if (i11 == Integer.MAX_VALUE) {
                if (str.charAt(i9) == '\r') {
                    int i13 = i9 + 1;
                    i9 = (i13 >= length || str.charAt(i13) != '\n') ? i13 : i9 + 2;
                } else {
                    if (str.charAt(i9) != '\n') {
                        StringBuilder sbY = zo5.y(i9, "Expected a new line at index ", ", but was ");
                        sbY.append(str.charAt(i9));
                        throw new NumberFormatException(sbY.toString());
                    }
                    i9++;
                }
                i11 = 0;
                i12 = 0;
            } else if (i12 == Integer.MAX_VALUE) {
                for (int i14 = 0; i14 < 2; i14++) {
                    if (!tre.U("  ".charAt(i14), str.charAt(i9 + i14), z)) {
                        int i15 = 2 + i9;
                        if (i15 <= length) {
                            length = i15;
                        }
                        throw new NumberFormatException(zo5.i(i9, "Expected group separator \"  \" at index ", ", but was ", str.substring(i9, length)));
                    }
                }
                i9 += 2;
                i12 = 0;
            }
            i11++;
            i12++;
            if (length - 2 < i9) {
                StringBuilder sbA = nbh.A(i9, "Expected exactly 2 hexadecimal digits at index ", ", but was \"", str.substring(i9, length), "\" of length ");
                sbA.append(length - i9);
                throw new NumberFormatException(sbA.toString());
            }
            bArr2[i10] = d(i9, str);
            i9 += 2;
            i10++;
        }
        return i10 == i8 ? bArr2 : Arrays.copyOf(bArr2, i10);
    }

    public static final byte d(int i, String str) {
        int[] iArr;
        int i2;
        int i3;
        char cCharAt = str.charAt(i);
        if ((cCharAt >>> '\b') != 0 || (i2 = (iArr = b)[cCharAt]) < 0) {
            e(i, str);
            throw null;
        }
        int i4 = i + 1;
        char cCharAt2 = str.charAt(i4);
        if ((cCharAt2 >>> '\b') == 0 && (i3 = iArr[cCharAt2]) >= 0) {
            return (byte) ((i2 << 4) | i3);
        }
        e(i4, str);
        throw null;
    }

    public static final void e(int i, String str) {
        StringBuilder sbY = zo5.y(i, "Expected a hexadecimal digit at index ", ", but was ");
        sbY.append(str.charAt(i));
        throw new NumberFormatException(sbY.toString());
    }

    public static final int f(String str, char[] cArr, int i) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                str.getChars(0, str.length(), cArr, i);
            } else {
                cArr[i] = str.charAt(0);
            }
        }
        return str.length() + i;
    }

    public static String g(int i) {
        cv7 cv7Var = dv7.c.b;
        return cv7Var.a ? new String(new char[]{"0123456789abcdef".charAt((i >> 28) & 15), "0123456789abcdef".charAt((i >> 24) & 15), "0123456789abcdef".charAt((i >> 20) & 15), "0123456789abcdef".charAt((i >> 16) & 15), "0123456789abcdef".charAt((i >> 12) & 15), "0123456789abcdef".charAt((i >> 8) & 15), "0123456789abcdef".charAt((i >> 4) & 15), "0123456789abcdef".charAt(i & 15)}) : i(i, cv7Var, 32);
    }

    public static String h(byte[] bArr) {
        dv7 dv7Var = dv7.c;
        int length = bArr.length;
        e9i.s(0, length, bArr.length);
        if (length == 0) {
            return "";
        }
        bv7 bv7Var = dv7Var.a;
        boolean z = bv7Var.a;
        int[] iArr = a;
        if (z) {
            if (bv7Var.b) {
                char[] cArr = new char[a(((long) length) * 2)];
                int iB = 0;
                for (int i = 0; i < length; i++) {
                    iB = b(bArr, i, iArr, cArr, iB);
                }
                return new String(cArr);
            }
            if (length <= 0) {
                ore.p("Failed requirement.");
                return null;
            }
            char[] cArr2 = new char[a(((long) length) * 2)];
            int iF = f("", cArr2, b(bArr, 0, iArr, cArr2, f("", cArr2, 0)));
            for (int i2 = 1; i2 < length; i2++) {
                iF = f("", cArr2, b(bArr, i2, iArr, cArr2, f("", cArr2, f("", cArr2, iF))));
            }
            return new String(cArr2);
        }
        if (length <= 0) {
            ore.p("Failed requirement.");
            return null;
        }
        int i3 = (length - 1) / Integer.MAX_VALUE;
        int i4 = length % Integer.MAX_VALUE;
        if (i4 == 0) {
            i4 = Integer.MAX_VALUE;
        }
        int iA = a((2 * ((long) length)) + (((long) ((i4 - 1) / Integer.MAX_VALUE)) * 2) + ((long) i3));
        char[] cArr3 = new char[iA];
        int iF2 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            if (i5 == Integer.MAX_VALUE) {
                cArr3[iF2] = '\n';
                i6 = 0;
                iF2++;
                i5 = 0;
            } else if (i6 == Integer.MAX_VALUE) {
                iF2 = f("  ", cArr3, iF2);
                i6 = 0;
            }
            if (i6 != 0) {
                iF2 = f("", cArr3, iF2);
            }
            iF2 = f("", cArr3, b(bArr, i7, iArr, cArr3, f("", cArr3, iF2)));
            i6++;
            i5++;
        }
        if (iF2 == iA) {
            return new String(cArr3);
        }
        ore.k("Check failed.");
        return null;
    }

    public static final String i(long j, cv7 cv7Var, int i) {
        int i2 = i >> 2;
        cv7Var.getClass();
        int i3 = 1 - i2;
        if (i3 < 0) {
            i3 = 0;
        }
        int iA = a(((long) i3) + ((long) i2));
        char[] cArr = new char[iA];
        int iF = f("", cArr, 0);
        if (i3 > 0) {
            int i4 = i3 + iF;
            Arrays.fill(cArr, iF, i4, "0123456789abcdef".charAt(0));
            iF = i4;
        }
        int i5 = 0;
        while (i5 < i2) {
            i -= 4;
            cArr[iF] = "0123456789abcdef".charAt((int) ((j >> i) & 15));
            i5++;
            iF++;
        }
        int iF2 = f("", cArr, iF);
        if (iF2 == iA) {
            return new String(cArr);
        }
        e9i.s(0, iF2, iA);
        return new String(cArr, 0, iF2);
    }

    public static final long j(int i, long j, long j2) {
        if (j <= 0 || j2 <= 0) {
            return 0L;
        }
        long j3 = i;
        return (j + j3) / (j2 + j3);
    }
}
