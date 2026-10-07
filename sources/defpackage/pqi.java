package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class pqi {
    public final /* synthetic */ int a;

    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void b(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static int e(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            pqi pqiVar = rqi.a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return rqi.c(i, ldi.f(j, bArr));
        }
        if (i2 == 2) {
            return rqi.d(i, ldi.f(j, bArr), ldi.f(j + 1, bArr));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0184  */
    /* JADX WARN: Code duplicated, block: B:73:0x0188  */
    /* JADX WARN: Code duplicated, block: B:75:0x018b  */
    /* JADX WARN: Code duplicated, block: B:79:0x019d  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:86:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c1  */
    public final int c(byte[] bArr, int i, int i2, String str) {
        int i3;
        char cCharAt;
        int i4;
        char cCharAt2;
        int i5;
        int i6;
        int i7;
        char cCharAt3;
        char c = 2048;
        char c2 = 55296;
        switch (this.a) {
            case 0:
                int length = str.length();
                int i8 = i2 + i;
                int i9 = 0;
                while (i9 < length) {
                    int i10 = i9 + i;
                    if (i10 >= i8 || (cCharAt2 = str.charAt(i9)) >= 128) {
                        if (i9 == length) {
                            return i + length;
                        }
                        i3 = i + i9;
                        while (i9 < length) {
                            cCharAt = str.charAt(i9);
                            if (cCharAt >= 128 && i3 < i8) {
                                bArr[i3] = (byte) cCharAt;
                                i3++;
                            } else if (cCharAt >= 2048 && i3 <= i8 - 2) {
                                int i11 = i3 + 1;
                                bArr[i3] = (byte) ((cCharAt >>> 6) | 960);
                                i3 += 2;
                                bArr[i11] = (byte) ((cCharAt & '?') | np0.m);
                            } else {
                                if ((cCharAt < 55296 && 57343 >= cCharAt) || i3 > i8 - 3) {
                                    if (i3 > i8 - 4) {
                                        if (55296 <= cCharAt && cCharAt <= 57343 && ((i4 = i9 + 1) == str.length() || !Character.isSurrogatePair(cCharAt, str.charAt(i4)))) {
                                            throw new qqi(i9, length);
                                        }
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt + " at index " + i3);
                                    }
                                    int i12 = i9 + 1;
                                    if (i12 != str.length()) {
                                        char cCharAt4 = str.charAt(i12);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt4)) {
                                            int codePoint = Character.toCodePoint(cCharAt, cCharAt4);
                                            bArr[i3] = (byte) ((codePoint >>> 18) | 240);
                                            bArr[i3 + 1] = (byte) (((codePoint >>> 12) & 63) | np0.m);
                                            int i13 = i3 + 3;
                                            bArr[i3 + 2] = (byte) (((codePoint >>> 6) & 63) | np0.m);
                                            i3 += 4;
                                            bArr[i13] = (byte) ((codePoint & 63) | np0.m);
                                            i9 = i12;
                                        } else {
                                            i9 = i12;
                                        }
                                    }
                                    throw new qqi(i9 - 1, length);
                                }
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i14 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | np0.m);
                                i3 += 3;
                                bArr[i14] = (byte) ((cCharAt & '?') | np0.m);
                            }
                            i9++;
                        }
                        return i3;
                    }
                    bArr[i10] = (byte) cCharAt2;
                    i9++;
                }
                if (i9 == length) {
                    return i + length;
                }
                i3 = i + i9;
                while (i9 < length) {
                    cCharAt = str.charAt(i9);
                    if (cCharAt >= 128) {
                        if (cCharAt >= 2048) {
                            if (cCharAt < 55296) {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i15 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | np0.m);
                                i3 += 3;
                                bArr[i15] = (byte) ((cCharAt & '?') | np0.m);
                            } else {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i16 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | np0.m);
                                i3 += 3;
                                bArr[i16] = (byte) ((cCharAt & '?') | np0.m);
                            }
                        } else if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i17 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | np0.m);
                            i3 += 3;
                            bArr[i17] = (byte) ((cCharAt & '?') | np0.m);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i18 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | np0.m);
                            i3 += 3;
                            bArr[i18] = (byte) ((cCharAt & '?') | np0.m);
                        }
                    } else if (cCharAt >= 2048) {
                        if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i19 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | np0.m);
                            i3 += 3;
                            bArr[i19] = (byte) ((cCharAt & '?') | np0.m);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i110 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | np0.m);
                            i3 += 3;
                            bArr[i110] = (byte) ((cCharAt & '?') | np0.m);
                        }
                    } else if (cCharAt < 55296) {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                        int i111 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | np0.m);
                        i3 += 3;
                        bArr[i111] = (byte) ((cCharAt & '?') | np0.m);
                    } else {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                        int i112 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | np0.m);
                        i3 += 3;
                        bArr[i112] = (byte) ((cCharAt & '?') | np0.m);
                    }
                    i9++;
                }
                return i3;
            default:
                long j = i;
                long j2 = ((long) i2) + j;
                int length2 = str.length();
                if (length2 > i2 || bArr.length - i2 < i) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i + i2));
                }
                int i20 = 0;
                while (i20 < length2 && (cCharAt3 = str.charAt(i20)) < 128) {
                    ldi.j(bArr, j, (byte) cCharAt3);
                    i20++;
                    j++;
                }
                if (i20 != length2) {
                    while (i20 < length2) {
                        char cCharAt5 = str.charAt(i20);
                        if (cCharAt5 >= 128 || j >= j2) {
                            if (cCharAt5 >= c || j > j2 - 2) {
                                int i21 = i20;
                                if ((cCharAt5 >= c2 && 57343 >= cCharAt5) || j > j2 - 3) {
                                    if (j > j2 - 4) {
                                        if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i5 = i21 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i5)))) {
                                            throw new qqi(i21, length2);
                                        }
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j);
                                    }
                                    i6 = i21 + 1;
                                    if (i6 != length2) {
                                        char cCharAt6 = str.charAt(i6);
                                        if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                            int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                            ldi.j(bArr, j, (byte) ((codePoint2 >>> 18) | 240));
                                            ldi.j(bArr, j + 1, (byte) (((codePoint2 >>> 12) & 63) | np0.m));
                                            long j3 = j + 3;
                                            ldi.j(bArr, j + 2, (byte) (((codePoint2 >>> 6) & 63) | np0.m));
                                            j += 4;
                                            ldi.j(bArr, j3, (byte) ((codePoint2 & 63) | np0.m));
                                        } else {
                                            i7 = i6;
                                        }
                                    } else {
                                        i7 = i21;
                                    }
                                    throw new qqi(i7 - 1, length2);
                                }
                                ldi.j(bArr, j, (byte) ((cCharAt5 >>> '\f') | 480));
                                long j4 = j + 2;
                                ldi.j(bArr, j + 1, (byte) (((cCharAt5 >>> 6) & 63) | np0.m));
                                j += 3;
                                ldi.j(bArr, j4, (byte) ((cCharAt5 & '?') | np0.m));
                                i20 = i21;
                            } else {
                                i6 = i20;
                                long j5 = j + 1;
                                ldi.j(bArr, j, (byte) ((cCharAt5 >>> 6) | 960));
                                j += 2;
                                ldi.j(bArr, j5, (byte) ((cCharAt5 & '?') | np0.m));
                            }
                            i20 = i6;
                        } else {
                            ldi.j(bArr, j, (byte) cCharAt5);
                            j++;
                        }
                        i20++;
                        c = 2048;
                        c2 = 55296;
                    }
                }
                return (int) j;
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x005d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:27:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0077  */
    /* JADX WARN: Code duplicated, block: B:35:0x007b  */
    /* JADX WARN: Code duplicated, block: B:37:0x007f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0087  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c9  */
    public final int d(int i, byte[] bArr, int i2) {
        long j;
        int i3;
        int i4;
        long j2;
        long j3;
        byte bF;
        long j4;
        long j5;
        byte bF2;
        long j6;
        int i5 = i;
        switch (this.a) {
            case 0:
                break;
            default:
                if ((i5 | i2 | (bArr.length - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i5), Integer.valueOf(i2)));
                }
                long j7 = i5;
                int i6 = (int) (((long) i2) - j7);
                long j8 = 1;
                if (i6 < 16) {
                    j = j7;
                    i3 = 0;
                } else {
                    j = j7;
                    i3 = 0;
                    long j9 = j;
                    while (true) {
                        if (i3 < i6) {
                            long j10 = j9 + 1;
                            if (ldi.f(j9, bArr) >= 0) {
                                i3++;
                                j9 = j10;
                            }
                        } else {
                            i3 = i6;
                        }
                    }
                }
                int i7 = i6 - i3;
                long j11 = j + ((long) i3);
                while (true) {
                    byte b = 0;
                    while (i7 > 0) {
                        long j12 = j11 + j8;
                        byte bF3 = ldi.f(j11, bArr);
                        if (bF3 >= 0) {
                            i7--;
                            j11 = j12;
                            b = bF3;
                        } else {
                            j11 = j12;
                            b = bF3;
                            if (i7 == 0) {
                                return 0;
                            }
                            i4 = i7 - 1;
                            if (b < -32) {
                                if (i4 == 0) {
                                    return b;
                                }
                                i7 -= 2;
                                if (b >= -62) {
                                    return -1;
                                }
                                j6 = j11 + j8;
                                if (ldi.f(j11, bArr) > -65) {
                                    return -1;
                                }
                                j11 = j6;
                                j2 = j8;
                            } else if (b < -16) {
                                j2 = j8;
                                if (i4 < 3) {
                                    return e(j11, bArr, b, i4);
                                }
                                i7 -= 4;
                                j3 = j11 + j2;
                                bF = ldi.f(j11, bArr);
                                if (bF <= -65) {
                                    return -1;
                                }
                                if ((((bF + 112) + (b << 28)) >> 30) == 0) {
                                    return -1;
                                }
                                j4 = j11 + 2;
                                if (ldi.f(j3, bArr) <= -65) {
                                    return -1;
                                }
                                j11 += 3;
                                if (ldi.f(j4, bArr) > -65) {
                                    return -1;
                                }
                            } else {
                                if (i4 < 2) {
                                    return e(j11, bArr, b, i4);
                                }
                                i7 -= 3;
                                j2 = j8;
                                j5 = j11 + j2;
                                bF2 = ldi.f(j11, bArr);
                                if (bF2 <= -65) {
                                    return -1;
                                }
                                if (b != -32 && bF2 < -96) {
                                    return -1;
                                }
                                if (b != -19 && bF2 >= -96) {
                                    return -1;
                                }
                                j11 += 2;
                                if (ldi.f(j5, bArr) > -65) {
                                    return -1;
                                }
                            }
                            j8 = j2;
                        }
                    }
                    if (i7 == 0) {
                        return 0;
                    }
                    i4 = i7 - 1;
                    if (b < -32) {
                        if (i4 == 0) {
                            return b;
                        }
                        i7 -= 2;
                        if (b >= -62) {
                            return -1;
                        }
                        j6 = j11 + j8;
                        if (ldi.f(j11, bArr) > -65) {
                            return -1;
                        }
                        j11 = j6;
                        j2 = j8;
                    } else if (b < -16) {
                        j2 = j8;
                        if (i4 < 3) {
                            return e(j11, bArr, b, i4);
                        }
                        i7 -= 4;
                        j3 = j11 + j2;
                        bF = ldi.f(j11, bArr);
                        if (bF <= -65) {
                            return -1;
                        }
                        if ((((bF + 112) + (b << 28)) >> 30) == 0) {
                            return -1;
                        }
                        j4 = j11 + 2;
                        if (ldi.f(j3, bArr) <= -65) {
                            return -1;
                        }
                        j11 += 3;
                        if (ldi.f(j4, bArr) > -65) {
                            return -1;
                        }
                    } else {
                        if (i4 < 2) {
                            return e(j11, bArr, b, i4);
                        }
                        i7 -= 3;
                        j2 = j8;
                        j5 = j11 + j2;
                        bF2 = ldi.f(j11, bArr);
                        if (bF2 <= -65) {
                            return -1;
                        }
                        if (b != -32) {
                        }
                        if (b != -19) {
                        }
                        j11 += 2;
                        if (ldi.f(j5, bArr) > -65) {
                            return -1;
                        }
                    }
                    j8 = j2;
                }
                break;
        }
        while (i5 < i2 && bArr[i5] >= 0) {
            i5++;
        }
        if (i5 < i2) {
            while (i5 < i2) {
                int i8 = i5 + 1;
                byte b2 = bArr[i5];
                if (b2 >= 0) {
                    i5 = i8;
                } else if (b2 < -32) {
                    if (i8 >= i2) {
                        return b2;
                    }
                    if (b2 < -62) {
                        return -1;
                    }
                    i5 += 2;
                    if (bArr[i8] > -65) {
                        return -1;
                    }
                } else if (b2 < -16) {
                    if (i8 >= i2 - 1) {
                        return rqi.a(i8, bArr, i2);
                    }
                    int i9 = i5 + 2;
                    byte b3 = bArr[i8];
                    if (b3 > -65) {
                        return -1;
                    }
                    if (b2 == -32 && b3 < -96) {
                        return -1;
                    }
                    if (b2 == -19 && b3 >= -96) {
                        return -1;
                    }
                    i5 += 3;
                    if (bArr[i9] > -65) {
                        return -1;
                    }
                } else {
                    if (i8 >= i2 - 2) {
                        return rqi.a(i8, bArr, i2);
                    }
                    int i10 = i5 + 2;
                    byte b4 = bArr[i8];
                    if (b4 > -65) {
                        return -1;
                    }
                    if ((((b4 + 112) + (b2 << 28)) >> 30) != 0) {
                        return -1;
                    }
                    int i11 = i5 + 3;
                    if (bArr[i10] > -65) {
                        return -1;
                    }
                    i5 += 4;
                    if (bArr[i11] > -65) {
                        return -1;
                    }
                }
            }
        }
        return 0;
    }
}
