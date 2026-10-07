package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ji9 {
    public int a;
    public int b;
    public long[] c;
    public long[] d;
    public Object[] e;
    public int f;

    public final int a(int i) {
        int i2 = this.a;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.c;
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
        int iHashCode = Long.valueOf(j).hashCode() * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.a;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.c;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j3 = (((long) i2) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.d[iNumberOfTrailingZeros] == j) {
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

    public final void c(int i) {
        int iMax;
        long[] jArr;
        if (i > 0) {
            iMax = Math.max(7, i > 0 ? (-1) >>> Integer.numberOfLeadingZeros(i) : 0);
        } else {
            iMax = 0;
        }
        this.a = iMax;
        if (iMax == 0) {
            jArr = e9i.c;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.c = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        int i4 = this.a;
        this.f = (i4 == 7 ? 6 : i4 - (i4 / 8)) - this.b;
        this.d = new long[iMax];
        this.e = new Object[iMax];
    }

    public final boolean d() {
        return this.b != 0;
    }

    public final void e(int i) {
        ji9 ji9Var = this;
        long[] jArr = ji9Var.c;
        long[] jArr2 = ji9Var.d;
        Object[] objArr = ji9Var.e;
        int i2 = ji9Var.a;
        c(i);
        long[] jArr3 = ji9Var.d;
        Object[] objArr2 = ji9Var.e;
        int i3 = 0;
        while (i3 < i2) {
            if (((jArr[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                long j = jArr2[i3];
                int iHashCode = Long.valueOf(j).hashCode() * (-862048943);
                int i4 = iHashCode ^ (iHashCode << 16);
                int iA = ji9Var.a(i4 >>> 7);
                long j2 = i4 & 127;
                long[] jArr4 = ji9Var.c;
                int i5 = iA >> 3;
                int i6 = (iA & 7) << 3;
                jArr4[i5] = (jArr4[i5] & (~(255 << i6))) | (j2 << i6);
                int i7 = ji9Var.a;
                int i8 = ((iA - 7) & i7) + (i7 & 7);
                int i9 = i8 >> 3;
                int i10 = (i8 & 7) << 3;
                jArr4[i9] = (jArr4[i9] & (~(255 << i10))) | (j2 << i10);
                jArr3[iA] = j;
                objArr2[iA] = objArr[i3];
            }
            i3++;
            ji9Var = this;
            jArr = jArr;
        }
    }

    public final void f(long j, ncj ncjVar) {
        long j2;
        long j3;
        int i;
        int i2;
        long j4;
        int iNumberOfTrailingZeros;
        int i3;
        int i4 = -862048943;
        int iHashCode = Long.valueOf(j).hashCode() * (-862048943);
        int i5 = iHashCode ^ (iHashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & 127;
        int i8 = this.a;
        int i9 = i6 & i8;
        int i10 = 0;
        loop0: while (true) {
            long[] jArr = this.c;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            int i13 = 1;
            long j5 = ((jArr[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr[i11] >>> i12);
            long j6 = i7;
            int i14 = i10;
            int i15 = 0;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L);
            while (j8 != 0) {
                iNumberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j8) >> 3)) & i8;
                int i16 = i4;
                if (this.d[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
                j8 &= j8 - 1;
                i4 = i16;
            }
            int i17 = i4;
            if ((((~j5) << 6) & j5 & (-9187201950435737472L)) != 0) {
                int iA = a(i6);
                if (this.f != 0 || ((this.c[iA >> 3] >> ((iA & 7) << 3)) & 255) == 254) {
                    j2 = 255;
                    j3 = j6;
                    i = 0;
                    i2 = 1;
                    j4 = 128;
                } else {
                    int i18 = this.a;
                    if (i18 > 8) {
                        j4 = 128;
                        j2 = 255;
                        if (Long.compareUnsigned(((long) this.b) * 32, ((long) i18) * 25) <= 0) {
                            long[] jArr2 = this.c;
                            int i19 = this.a;
                            long[] jArr3 = this.d;
                            Object[] objArr = this.e;
                            int i20 = (i19 + 7) >> 3;
                            int i21 = 0;
                            while (i21 < i20) {
                                int i22 = i15;
                                long j9 = jArr2[i21] & (-9187201950435737472L);
                                jArr2[i21] = ((~j9) + (j9 >>> 7)) & (-72340172838076674L);
                                i21++;
                                i13 = i13;
                                j6 = j6;
                                i15 = i22;
                            }
                            j3 = j6;
                            i = i15;
                            int i23 = i13;
                            int length = jArr2.length;
                            int i24 = length - 1;
                            int i25 = length - 2;
                            long j10 = 72057594037927935L;
                            jArr2[i25] = (jArr2[i25] & 72057594037927935L) | (-72057594037927936L);
                            jArr2[i24] = jArr2[i];
                            int i26 = i;
                            while (i26 != i19) {
                                int i27 = i26 >> 3;
                                int i28 = (i26 & 7) << 3;
                                long j11 = (jArr2[i27] >> i28) & 255;
                                if (j11 != 128 && j11 == 254) {
                                    int iHashCode2 = Long.valueOf(jArr3[i26]).hashCode() * i17;
                                    int i29 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i30 = i29 >>> 7;
                                    int iA2 = a(i30);
                                    int i31 = i30 & i19;
                                    int i32 = i23;
                                    if (((iA2 - i31) & i19) / 8 == ((i26 - i31) & i19) / 8) {
                                        long j12 = j10;
                                        jArr2[i27] = (((long) (i29 & 127)) << i28) | (jArr2[i27] & (~(255 << i28)));
                                        jArr2[jArr2.length - 1] = (jArr2[i] & j12) | Long.MIN_VALUE;
                                        i26++;
                                        i23 = i32;
                                        j10 = j12;
                                    } else {
                                        long j13 = j10;
                                        int i33 = iA2 >> 3;
                                        long j14 = jArr2[i33];
                                        int i34 = (iA2 & 7) << 3;
                                        if (((j14 >> i34) & 255) == 128) {
                                            jArr2[i33] = ((~(255 << i34)) & j14) | (((long) (i29 & 127)) << i34);
                                            jArr2[i27] = (jArr2[i27] & (~(255 << i28))) | (128 << i28);
                                            jArr3[iA2] = jArr3[i26];
                                            jArr3[i26] = 0;
                                            objArr[iA2] = objArr[i26];
                                            objArr[i26] = null;
                                        } else {
                                            jArr2[i33] = (((long) (i29 & 127)) << i34) | ((~(255 << i34)) & j14);
                                            long j15 = jArr3[iA2];
                                            jArr3[iA2] = jArr3[i26];
                                            jArr3[i26] = j15;
                                            Object obj = objArr[iA2];
                                            objArr[iA2] = objArr[i26];
                                            objArr[i26] = obj;
                                            i26--;
                                        }
                                        jArr2[jArr2.length - 1] = (jArr2[i] & j13) | Long.MIN_VALUE;
                                        i26++;
                                        i23 = i32;
                                        i6 = i6;
                                        j10 = j13;
                                    }
                                } else {
                                    i26++;
                                }
                            }
                            i3 = i6;
                            i2 = i23;
                            int i35 = this.a;
                            this.f = (i35 == 7 ? 6 : i35 - (i35 / 8)) - this.b;
                        }
                        iA = a(i3);
                    } else {
                        j2 = 255;
                        j4 = 128;
                    }
                    i3 = i6;
                    j3 = j6;
                    i = 0;
                    i2 = 1;
                    int i36 = this.a;
                    e(i36 == 0 ? 6 : (i36 * 2) + 1);
                    iA = a(i3);
                }
                iNumberOfTrailingZeros = iA;
                this.b++;
                int i37 = this.f;
                long[] jArr4 = this.c;
                int i38 = iNumberOfTrailingZeros >> 3;
                long j16 = jArr4[i38];
                int i39 = (iNumberOfTrailingZeros & 7) << 3;
                if (((j16 >> i39) & j2) == j4) {
                    i = i2;
                }
                this.f = i37 - i;
                jArr4[i38] = (j16 & (~(j2 << i39))) | (j3 << i39);
                int i40 = this.a;
                int i41 = ((iNumberOfTrailingZeros - 7) & i40) + (i40 & 7);
                int i42 = i41 >> 3;
                int i43 = (i41 & 7) << 3;
                jArr4[i42] = (jArr4[i42] & (~(j2 << i43))) | (j3 << i43);
                break;
            }
            i10 = i14 + 8;
            i9 = (i9 + i10) & i8;
            i4 = i17;
        }
        this.d[iNumberOfTrailingZeros] = j;
        this.e[iNumberOfTrailingZeros] = ncjVar;
    }

    public final String toString() {
        int i;
        if (this.b == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.c;
        long[] jArr2 = this.d;
        Object[] objArr = this.e;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    for (int i4 = 0; i4 < 8; i4++) {
                        if ((255 & j) < 128 && (i = (i2 << 3) + i4) < this.a) {
                            long j2 = jArr2[i];
                            Object obj = objArr[i];
                            sb.append(j2);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i3++;
                            if (i3 < this.b) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
