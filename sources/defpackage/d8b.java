package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class d8b {
    public long[] a = q1f.a;
    public int[] b = jj8.b;
    public long[] c = ui9.b;
    public int d;
    public int e;
    public int f;

    public d8b(int i) {
        if (i >= 0) {
            c(q1f.f(i));
        } else {
            gol.c("Capacity must be a positive value.");
            throw null;
        }
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

    public final int b(int i) {
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }

    public final void c(int i) {
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
        this.b = new int[iMax];
        this.c = new long[iMax];
    }

    public final void d(int i, long j) {
        long j2;
        long j3;
        int i2;
        int i3;
        long j4;
        int iNumberOfTrailingZeros;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int i4 = i;
        int i5 = -862048943;
        int iHashCode = Integer.hashCode(i4) * (-862048943);
        int i6 = iHashCode ^ (iHashCode << 16);
        int i7 = i6 >>> 7;
        int i8 = i6 & 127;
        int i9 = this.d;
        int i10 = i7 & i9;
        int i11 = 0;
        loop0: while (true) {
            long[] jArr3 = this.a;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            int i14 = 1;
            int i15 = i11;
            int i16 = 0;
            long j5 = (((-i13) >> 63) & (jArr3[i12 + 1] << (64 - i13))) | (jArr3[i12] >>> i13);
            long j6 = i8;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            long j8 = (j7 - 72340172838076673L) & (~j7) & (-9187201950435737472L);
            while (j8 != 0) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j8) >> 3) + i10) & i9;
                int i17 = i5;
                if (this.b[iNumberOfTrailingZeros] == i4) {
                    break loop0;
                }
                j8 &= j8 - 1;
                i5 = i17;
            }
            int i18 = i5;
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                int iA = a(i7);
                long j9 = 255;
                if (this.f != 0 || ((this.a[iA >> 3] >> ((iA & 7) << 3)) & 255) == 254) {
                    j2 = j6;
                    j3 = 255;
                    i2 = 1;
                    i3 = 0;
                    j4 = 128;
                } else {
                    int i19 = this.d;
                    if (i19 > 8) {
                        j4 = 128;
                        if (Long.compareUnsigned(((long) this.e) * 32, ((long) i19) * 25) <= 0) {
                            long[] jArr4 = this.a;
                            int i20 = this.d;
                            int[] iArr2 = this.b;
                            long[] jArr5 = this.c;
                            int i21 = (i20 + 7) >> 3;
                            int i22 = 0;
                            while (i22 < i21) {
                                long j10 = jArr4[i22] & (-9187201950435737472L);
                                jArr4[i22] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i22++;
                                j9 = j9;
                                j6 = j6;
                            }
                            j2 = j6;
                            j3 = j9;
                            char c = 7;
                            int length = jArr4.length;
                            int i23 = length - 1;
                            int i24 = length - 2;
                            jArr4[i24] = (jArr4[i24] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[i23] = jArr4[0];
                            int i25 = 0;
                            while (i25 != i20) {
                                int i26 = i25 >> 3;
                                int i27 = (i25 & 7) << 3;
                                long j11 = (jArr4[i26] >> i27) & j3;
                                if (j11 != 128 && j11 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i25]) * i18;
                                    int i28 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i29 = i28 >>> 7;
                                    int iA2 = a(i29);
                                    int i30 = i29 & i20;
                                    char c2 = c;
                                    if (((iA2 - i30) & i20) / 8 == ((i25 - i30) & i20) / 8) {
                                        int i31 = i16;
                                        jArr4[i26] = (((long) (i28 & 127)) << i27) | (jArr4[i26] & (~(j3 << i27)));
                                        jArr4[jArr4.length - 1] = (jArr4[i31] & 72057594037927935L) | Long.MIN_VALUE;
                                        i25++;
                                        i14 = i14;
                                        c = c2;
                                        i16 = i31;
                                    } else {
                                        int i32 = i14;
                                        int i33 = i16;
                                        int i34 = iA2 >> 3;
                                        long j12 = jArr4[i34];
                                        int i35 = (iA2 & 7) << 3;
                                        if (((j12 >> i35) & j3) == 128) {
                                            iArr = iArr2;
                                            jArr2 = jArr5;
                                            jArr4[i34] = ((~(j3 << i35)) & j12) | (((long) (i28 & 127)) << i35);
                                            jArr4[i26] = (jArr4[i26] & (~(j3 << i27))) | (128 << i27);
                                            iArr[iA2] = iArr[i25];
                                            iArr[i25] = i33;
                                            jArr2[iA2] = jArr2[i25];
                                            jArr2[i25] = 0;
                                        } else {
                                            iArr = iArr2;
                                            jArr2 = jArr5;
                                            jArr4[i34] = (((long) (i28 & 127)) << i35) | ((~(j3 << i35)) & j12);
                                            int i36 = iArr[iA2];
                                            iArr[iA2] = iArr[i25];
                                            iArr[i25] = i36;
                                            long j13 = jArr2[iA2];
                                            jArr2[iA2] = jArr2[i25];
                                            jArr2[i25] = j13;
                                            i25--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i33] & 72057594037927935L) | Long.MIN_VALUE;
                                        i25++;
                                        i14 = i32;
                                        c = c2;
                                        i16 = i33;
                                        iArr2 = iArr;
                                        jArr5 = jArr2;
                                    }
                                } else {
                                    i25++;
                                }
                            }
                            i2 = i14;
                            i3 = i16;
                            this.f = q1f.a(this.d) - this.e;
                        }
                        iA = a(i7);
                    } else {
                        j4 = 128;
                    }
                    j2 = j6;
                    j3 = 255;
                    i2 = 1;
                    i3 = 0;
                    int iD = q1f.d(this.d);
                    long[] jArr6 = this.a;
                    int[] iArr3 = this.b;
                    long[] jArr7 = this.c;
                    int i37 = this.d;
                    c(iD);
                    long[] jArr8 = this.a;
                    int[] iArr4 = this.b;
                    long[] jArr9 = this.c;
                    int i38 = this.d;
                    int i39 = 0;
                    while (i39 < i37) {
                        if (((jArr6[i39 >> 3] >> ((i39 & 7) << 3)) & 255) < j4) {
                            int i40 = iArr3[i39];
                            int iHashCode3 = Integer.hashCode(i40) * i18;
                            int i41 = iHashCode3 ^ (iHashCode3 << 16);
                            int iA3 = a(i41 >>> 7);
                            jArr = jArr8;
                            long j14 = i41 & 127;
                            int i42 = iA3 >> 3;
                            int i43 = (iA3 & 7) << 3;
                            long j15 = (jArr[i42] & (~(255 << i43))) | (j14 << i43);
                            jArr[i42] = j15;
                            jArr[(((iA3 - 7) & i38) + (i38 & 7)) >> 3] = j15;
                            iArr4[iA3] = i40;
                            jArr9[iA3] = jArr7[i39];
                        } else {
                            jArr = jArr8;
                        }
                        i39++;
                        jArr8 = jArr;
                    }
                    iA = a(i7);
                }
                this.e++;
                int i44 = this.f;
                long[] jArr10 = this.a;
                int i45 = iA >> 3;
                long j16 = jArr10[i45];
                int i46 = (iA & 7) << 3;
                if (((j16 >> i46) & j3) != j4) {
                    i2 = i3;
                }
                this.f = i44 - i2;
                int i47 = this.d;
                long j17 = (j16 & (~(j3 << i46))) | (j2 << i46);
                jArr10[i45] = j17;
                jArr10[(((iA - 7) & i47) + (i47 & 7)) >> 3] = j17;
                iNumberOfTrailingZeros = ~iA;
                break;
            }
            i11 = i15 + 8;
            i10 = (i10 + i11) & i9;
            i4 = i;
            i5 = i18;
        }
        if (iNumberOfTrailingZeros < 0) {
            iNumberOfTrailingZeros = ~iNumberOfTrailingZeros;
        }
        this.b[iNumberOfTrailingZeros] = i;
        this.c[iNumberOfTrailingZeros] = j;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0066 A[LOOP:0: B:14:0x0023->B:28:0x0066, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x0069 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d8b)) {
            return false;
        }
        d8b d8bVar = (d8b) obj;
        if (d8bVar.e != this.e) {
            return false;
        }
        int[] iArr = this.b;
        long[] jArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            int i5 = iArr[i4];
                            long j2 = jArr[i4];
                            int iB = d8bVar.b(i5);
                            if (iB < 0 || j2 != d8bVar.c[iB]) {
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

    public final int hashCode() {
        int[] iArr = this.b;
        long[] jArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        iHashCode += Integer.hashCode(iArr[i4]) ^ Long.hashCode(jArr[i4]);
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
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.b;
        long[] jArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            int i8 = iArr[i7];
                            i2 = i3;
                            long j2 = jArr[i7];
                            sb.append(i8);
                            sb.append("=");
                            sb.append(j2);
                            i4++;
                            if (i4 < this.e) {
                                sb.append(", ");
                            }
                        } else {
                            i2 = i3;
                        }
                        j >>= 8;
                        i6++;
                        i3 = i2;
                    }
                    int i9 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i = i9;
                } else {
                    i = i3;
                }
                if (i == length) {
                    break;
                }
                i3 = i + 1;
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
