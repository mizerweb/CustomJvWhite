package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class k8b {
    public long[] a;
    public long[] b;
    public long[] c;
    public int d;
    public int e;
    public int f;

    public k8b(int i) {
        this.a = q1f.a;
        long[] jArr = ui9.b;
        this.b = jArr;
        this.c = jArr;
        if (i >= 0) {
            e(q1f.f(i));
        } else {
            gol.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public static String f(k8b k8bVar) {
        int i;
        k8bVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        long[] jArr = k8bVar.b;
        long[] jArr2 = k8bVar.c;
        long[] jArr3 = k8bVar.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            sb.append((CharSequence) "");
            break;
        }
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            long j = jArr3[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i2 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((255 & j) < 128) {
                        int i7 = (i2 << 3) + i6;
                        long j2 = jArr[i7];
                        long j3 = jArr2[i7];
                        if (i3 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i3 != 0) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append(j2);
                        sb.append('=');
                        sb.append(j3);
                        i3++;
                    }
                    j >>= i4;
                    i6++;
                    i2 = i2;
                    i4 = i4;
                }
                i = i2;
                if (i5 == i4) {
                }
                sb.append((CharSequence) "");
                break;
            }
            i = i2;
            if (i == length) {
                sb.append((CharSequence) "");
                break;
            }
            i2 = i + 1;
        }
        return sb.toString();
    }

    public final int a(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final int b(long j) {
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.d;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j3 = (((long) i2) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
    }

    public final long c(long j) {
        int iB = b(j);
        if (iB >= 0) {
            return this.c[iB];
        }
        gol.f("Cannot find value for key " + j);
        throw null;
    }

    public final long d(long j, long j2) {
        int iB = b(j);
        return iB >= 0 ? this.c[iB] : j2;
    }

    public final void e(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, q1f.e(i)) : 0;
        this.d = iMax;
        if (iMax == 0) {
            jArr = q1f.a;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.a = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f = q1f.a(this.d) - this.e;
        this.b = new long[iMax];
        this.c = new long[iMax];
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0066 A[LOOP:0: B:14:0x0023->B:28:0x0066, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x0069 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k8b)) {
            return false;
        }
        k8b k8bVar = (k8b) obj;
        if (k8bVar.e != this.e) {
            return false;
        }
        long[] jArr = this.b;
        long[] jArr2 = this.c;
        long[] jArr3 = this.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr3[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            long j2 = jArr[i4];
                            long j3 = jArr2[i4];
                            int iB = k8bVar.b(j2);
                            if (iB < 0 || j3 != k8bVar.c[iB]) {
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 == 8) {
                        if (i != length) {
                            i++;
                        }
                    }
                } else if (i != length) {
                    i++;
                }
            }
            return false;
        }
        return true;
    }

    public final void g(long j, long j2) {
        long j3;
        long j4;
        int i;
        int i2;
        long j5;
        int i3;
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        int i4 = -862048943;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i5 = iHashCode ^ (iHashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & 127;
        int i8 = this.d;
        int i9 = i6 & i8;
        int i10 = 0;
        loop0: while (true) {
            long[] jArr4 = this.a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            int i13 = 1;
            long j6 = ((jArr4[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr4[i11] >>> i12);
            long j7 = i7;
            int i14 = i10;
            int i15 = 0;
            long j8 = j6 ^ (j7 * 72340172838076673L);
            long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L);
            while (j9 != 0) {
                int iNumberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j9) >> 3)) & i8;
                int i16 = i4;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    i3 = iNumberOfTrailingZeros;
                    break loop0;
                } else {
                    j9 &= j9 - 1;
                    i4 = i16;
                }
            }
            int i17 = i4;
            if ((((~j6) << 6) & j6 & (-9187201950435737472L)) != 0) {
                int iA = a(i6);
                if (this.f != 0 || ((this.a[iA >> 3] >> ((iA & 7) << 3)) & 255) == 254) {
                    j3 = 255;
                    j4 = j7;
                    i = 0;
                    i2 = 1;
                    j5 = 128;
                } else {
                    int i18 = this.d;
                    if (i18 > 8) {
                        j5 = 128;
                        if (Long.compareUnsigned(((long) this.e) * 32, ((long) i18) * 25) <= 0) {
                            long[] jArr5 = this.a;
                            int i19 = this.d;
                            long[] jArr6 = this.b;
                            long[] jArr7 = this.c;
                            int i20 = (i19 + 7) >> 3;
                            j3 = 255;
                            int i21 = 0;
                            while (i21 < i20) {
                                long j10 = jArr5[i21] & (-9187201950435737472L);
                                jArr5[i21] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i21++;
                                i13 = i13;
                                i15 = i15;
                                j7 = j7;
                            }
                            j4 = j7;
                            i = i15;
                            int i22 = i13;
                            char c = 7;
                            int length = jArr5.length;
                            int i23 = length - 1;
                            int i24 = length - 2;
                            long j11 = 72057594037927935L;
                            jArr5[i24] = (jArr5[i24] & 72057594037927935L) | (-72057594037927936L);
                            jArr5[i23] = jArr5[i];
                            int i25 = i;
                            while (i25 != i19) {
                                int i26 = i25 >> 3;
                                int i27 = (i25 & 7) << 3;
                                long j12 = (jArr5[i26] >> i27) & 255;
                                if (j12 != 128 && j12 == 254) {
                                    int iHashCode2 = Long.hashCode(jArr6[i25]) * i17;
                                    int i28 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i29 = i28 >>> 7;
                                    int iA2 = a(i29);
                                    int i30 = i29 & i19;
                                    char c2 = c;
                                    if (((iA2 - i30) & i19) / 8 == ((i25 - i30) & i19) / 8) {
                                        int i31 = i22;
                                        long j13 = j11;
                                        jArr5[i26] = (((long) (i28 & 127)) << i27) | (jArr5[i26] & (~(255 << i27)));
                                        jArr5[jArr5.length - i31] = (jArr5[i] & j13) | Long.MIN_VALUE;
                                        i25++;
                                        i22 = i31;
                                        c = c2;
                                        j11 = j13;
                                    } else {
                                        int i32 = i22;
                                        long j14 = j11;
                                        int i33 = iA2 >> 3;
                                        long j15 = jArr5[i33];
                                        int i34 = (iA2 & 7) << 3;
                                        if (((j15 >> i34) & 255) == 128) {
                                            jArr3 = jArr6;
                                            jArr2 = jArr7;
                                            jArr5[i33] = (j15 & (~(255 << i34))) | (((long) (i28 & 127)) << i34);
                                            jArr5[i26] = (jArr5[i26] & (~(255 << i27))) | (128 << i27);
                                            jArr3[iA2] = jArr3[i25];
                                            jArr3[i25] = 0;
                                            jArr2[iA2] = jArr2[i25];
                                            jArr2[i25] = 0;
                                        } else {
                                            jArr2 = jArr7;
                                            jArr3 = jArr6;
                                            jArr5[i33] = (((long) (i28 & 127)) << i34) | (j15 & (~(255 << i34)));
                                            long j16 = jArr3[iA2];
                                            jArr3[iA2] = jArr3[i25];
                                            jArr3[i25] = j16;
                                            long j17 = jArr2[iA2];
                                            jArr2[iA2] = jArr2[i25];
                                            jArr2[i25] = j17;
                                            i25--;
                                        }
                                        jArr5[jArr5.length - 1] = (jArr5[i] & j14) | Long.MIN_VALUE;
                                        i25++;
                                        jArr6 = jArr3;
                                        i22 = i32;
                                        c = c2;
                                        j11 = j14;
                                        jArr7 = jArr2;
                                    }
                                } else {
                                    i25++;
                                }
                            }
                            i2 = i22;
                            this.f = q1f.a(this.d) - this.e;
                        }
                        iA = a(i6);
                    } else {
                        j5 = 128;
                    }
                    j3 = 255;
                    j4 = j7;
                    i = 0;
                    i2 = 1;
                    int iD = q1f.d(this.d);
                    long[] jArr8 = this.a;
                    long[] jArr9 = this.b;
                    long[] jArr10 = this.c;
                    int i35 = this.d;
                    e(iD);
                    long[] jArr11 = this.a;
                    long[] jArr12 = this.b;
                    long[] jArr13 = this.c;
                    int i36 = this.d;
                    int i37 = 0;
                    while (i37 < i35) {
                        if (((jArr8[i37 >> 3] >> ((i37 & 7) << 3)) & 255) < j5) {
                            long j18 = jArr9[i37];
                            int iHashCode3 = Long.hashCode(j18) * i17;
                            int i38 = iHashCode3 ^ (iHashCode3 << 16);
                            int iA3 = a(i38 >>> 7);
                            jArr = jArr11;
                            long j19 = i38 & 127;
                            int i39 = iA3 >> 3;
                            int i40 = (iA3 & 7) << 3;
                            long j20 = (jArr[i39] & (~(255 << i40))) | (j19 << i40);
                            jArr[i39] = j20;
                            jArr[(((iA3 - 7) & i36) + (i36 & 7)) >> 3] = j20;
                            jArr12[iA3] = j18;
                            jArr13[iA3] = jArr10[i37];
                        } else {
                            jArr = jArr11;
                        }
                        i37++;
                        jArr8 = jArr8;
                        jArr11 = jArr;
                    }
                    iA = a(i6);
                }
                this.e++;
                int i41 = this.f;
                long[] jArr14 = this.a;
                int i42 = iA >> 3;
                long j21 = jArr14[i42];
                int i43 = (iA & 7) << 3;
                if (((j21 >> i43) & j3) == j5) {
                    i = i2;
                }
                this.f = i41 - i;
                int i44 = this.d;
                long j22 = (j21 & (~(j3 << i43))) | (j4 << i43);
                jArr14[i42] = j22;
                jArr14[(((iA - 7) & i44) + (i44 & 7)) >> 3] = j22;
                i3 = ~iA;
                break;
            }
            i10 = i14 + 8;
            i9 = (i9 + i10) & i8;
            i4 = i17;
        }
        if (i3 < 0) {
            i3 = ~i3;
        }
        this.b[i3] = j;
        this.c[i3] = j2;
    }

    public final int hashCode() {
        long[] jArr = this.b;
        long[] jArr2 = this.c;
        long[] jArr3 = this.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr3[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        iHashCode += Long.hashCode(jArr[i4]) ^ Long.hashCode(jArr2[i4]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    public final String toString() {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.b;
        long[] jArr2 = this.c;
        long[] jArr3 = this.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                long j = jArr3[i5];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8;
                    int i8 = 8 - ((~(i5 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((255 & j) < 128) {
                            int i10 = (i5 << 3) + i9;
                            i2 = i5;
                            long j2 = jArr[i10];
                            i3 = i7;
                            i4 = i9;
                            long j3 = jArr2[i10];
                            sb.append(j2);
                            sb.append("=");
                            sb.append(j3);
                            i6++;
                            if (i6 < this.e) {
                                sb.append(", ");
                            }
                        } else {
                            i2 = i5;
                            i3 = i7;
                            i4 = i9;
                        }
                        j >>= i3;
                        i9 = i4 + 1;
                        i5 = i2;
                        i7 = i3;
                    }
                    int i11 = i5;
                    if (i8 != i7) {
                        break;
                    }
                    i = i11;
                } else {
                    i = i5;
                }
                if (i == length) {
                    break;
                }
                i5 = i + 1;
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ k8b() {
        this(6);
    }
}
