package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class v8b {
    public long[] a = q1f.a;
    public Object[] b = rx8.d;
    public long[] c = ui9.b;
    public int d;
    public int e;
    public int f;

    public v8b() {
        d(q1f.f(6));
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

    public final int b(Object obj) {
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (cqk.d(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
        }
    }

    public final long c(long j, Object obj) {
        int iB = b(obj);
        return iB >= 0 ? this.c[iB] : j;
    }

    public final void d(int i) {
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
        this.b = new Object[iMax];
        this.c = new long[iMax];
    }

    public final boolean e() {
        return this.e == 0;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0066 A[LOOP:0: B:14:0x0023->B:28:0x0066, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x0069 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v8b)) {
            return false;
        }
        v8b v8bVar = (v8b) obj;
        if (v8bVar.e != this.e) {
            return false;
        }
        Object[] objArr = this.b;
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
                            Object obj2 = objArr[i4];
                            long j2 = jArr[i4];
                            int iB = v8bVar.b(obj2);
                            if (iB < 0 || j2 != v8bVar.c[iB]) {
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

    public final void f(Object obj) {
        int iB = b(obj);
        if (iB >= 0) {
            this.e--;
            long[] jArr = this.a;
            int i = this.d;
            int i2 = iB >> 3;
            int i3 = (iB & 7) << 3;
            long j = (jArr[i2] & (~(255 << i3))) | (254 << i3);
            jArr[i2] = j;
            jArr[(((iB - 7) & i) + (i & 7)) >> 3] = j;
            this.b[iB] = null;
        }
    }

    public final void g(long j, Object obj) {
        long j2;
        long j3;
        long j4;
        int i;
        long[] jArr;
        long j5;
        Object[] objArr;
        Object obj2 = obj;
        int i2 = -862048943;
        int iHashCode = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.d;
        int i7 = i4 & i6;
        int i8 = 0;
        loop0: while (true) {
            long[] jArr2 = this.a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j6 = ((jArr2[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr2[i9] >>> i10);
            long j7 = i5;
            int i11 = i5;
            long j8 = j6 ^ (j7 * 72340172838076673L);
            long j9 = -9187201950435737472L;
            long j10 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L);
            while (j10 != 0) {
                int iNumberOfTrailingZeros = (i7 + (Long.numberOfTrailingZeros(j10) >> 3)) & i6;
                int i12 = i2;
                if (cqk.d(this.b[iNumberOfTrailingZeros], obj2)) {
                    i = iNumberOfTrailingZeros;
                    break loop0;
                } else {
                    j10 &= j10 - 1;
                    i2 = i12;
                }
            }
            int i13 = i2;
            if ((((~j6) << 6) & j6 & (-9187201950435737472L)) != 0) {
                int iA = a(i4);
                if (this.f != 0 || ((this.a[iA >> 3] >> ((iA & 7) << 3)) & 255) == 254) {
                    j2 = 255;
                    j3 = j7;
                    j4 = 128;
                } else {
                    int i14 = this.d;
                    if (i14 > 8) {
                        j4 = 128;
                        if (Long.compareUnsigned(((long) this.e) * 32, ((long) i14) * 25) <= 0) {
                            long[] jArr3 = this.a;
                            int i15 = this.d;
                            Object[] objArr2 = this.b;
                            long[] jArr4 = this.c;
                            int i16 = (i15 + 7) >> 3;
                            j2 = 255;
                            int i17 = 0;
                            while (i17 < i16) {
                                long j11 = jArr3[i17] & j9;
                                jArr3[i17] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
                                i17++;
                                j7 = j7;
                                j9 = -9187201950435737472L;
                            }
                            j3 = j7;
                            char c = 7;
                            int length = jArr3.length;
                            int i18 = length - 1;
                            int i19 = length - 2;
                            long j12 = 72057594037927935L;
                            jArr3[i19] = (jArr3[i19] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[i18] = jArr3[0];
                            int i20 = 0;
                            while (i20 != i15) {
                                int i21 = i20 >> 3;
                                int i22 = (i20 & 7) << 3;
                                long j13 = (jArr3[i21] >> i22) & 255;
                                if (j13 != 128 && j13 == 254) {
                                    Object obj3 = objArr2[i20];
                                    int iHashCode2 = (obj3 != null ? obj3.hashCode() : 0) * i13;
                                    int i23 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i24 = i23 >>> 7;
                                    int iA2 = a(i24);
                                    int i25 = i24 & i15;
                                    c = c;
                                    if (((iA2 - i25) & i15) / 8 == ((i20 - i25) & i15) / 8) {
                                        j5 = j12;
                                        jArr3[i21] = (((long) (i23 & 127)) << i22) | (jArr3[i21] & (~(255 << i22)));
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j5) | Long.MIN_VALUE;
                                        i20++;
                                    } else {
                                        j5 = j12;
                                        int i26 = iA2 >> 3;
                                        long j14 = jArr3[i26];
                                        int i27 = (iA2 & 7) << 3;
                                        if (((j14 >> i27) & 255) == 128) {
                                            objArr = objArr2;
                                            jArr3[i26] = ((~(255 << i27)) & j14) | (((long) (i23 & 127)) << i27);
                                            jArr3[i21] = (jArr3[i21] & (~(255 << i22))) | (128 << i22);
                                            objArr[iA2] = objArr[i20];
                                            objArr[i20] = null;
                                            jArr4[iA2] = jArr4[i20];
                                            jArr4[i20] = 0;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i26] = ((~(255 << i27)) & j14) | (((long) (i23 & 127)) << i27);
                                            Object obj4 = objArr[iA2];
                                            objArr[iA2] = objArr[i20];
                                            objArr[i20] = obj4;
                                            long j15 = jArr4[iA2];
                                            jArr4[iA2] = jArr4[i20];
                                            jArr4[i20] = j15;
                                            i20--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j5) | Long.MIN_VALUE;
                                        i20++;
                                        i15 = i15;
                                        objArr2 = objArr;
                                    }
                                    j12 = j5;
                                } else {
                                    i20++;
                                }
                            }
                            this.f = q1f.a(this.d) - this.e;
                        }
                        iA = a(i4);
                    } else {
                        j4 = 128;
                    }
                    j2 = 255;
                    j3 = j7;
                    int iD = q1f.d(this.d);
                    long[] jArr5 = this.a;
                    Object[] objArr3 = this.b;
                    long[] jArr6 = this.c;
                    int i28 = this.d;
                    d(iD);
                    long[] jArr7 = this.a;
                    Object[] objArr4 = this.b;
                    long[] jArr8 = this.c;
                    int i29 = this.d;
                    int i30 = 0;
                    while (i30 < i28) {
                        if (((jArr5[i30 >> 3] >> ((i30 & 7) << 3)) & 255) < j4) {
                            Object obj5 = objArr3[i30];
                            int iHashCode3 = (obj5 != null ? obj5.hashCode() : 0) * i13;
                            int i31 = iHashCode3 ^ (iHashCode3 << 16);
                            int iA3 = a(i31 >>> 7);
                            jArr = jArr7;
                            long j16 = i31 & 127;
                            int i32 = iA3 >> 3;
                            int i33 = (iA3 & 7) << 3;
                            long j17 = (jArr[i32] & (~(255 << i33))) | (j16 << i33);
                            jArr[i32] = j17;
                            jArr[(((iA3 - 7) & i29) + (i29 & 7)) >> 3] = j17;
                            objArr4[iA3] = obj5;
                            jArr8[iA3] = jArr6[i30];
                        } else {
                            jArr = jArr7;
                        }
                        i30++;
                        jArr7 = jArr;
                    }
                    iA = a(i4);
                }
                this.e++;
                int i34 = this.f;
                long[] jArr9 = this.a;
                int i35 = iA >> 3;
                long j18 = jArr9[i35];
                int i36 = (iA & 7) << 3;
                this.f = i34 - (((j18 >> i36) & j2) == j4 ? 1 : 0);
                int i37 = this.d;
                long j19 = (j18 & (~(j2 << i36))) | (j3 << i36);
                jArr9[i35] = j19;
                jArr9[(((iA - 7) & i37) + (i37 & 7)) >> 3] = j19;
                i = ~iA;
                break;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            obj2 = obj;
            i5 = i11;
            i2 = i13;
        }
        if (i < 0) {
            i = ~i;
        }
        this.b[i] = obj;
        this.c[i] = j;
    }

    public final int hashCode() {
        Object[] objArr = this.b;
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
                        Object obj = objArr[i4];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(jArr[i4]);
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
        if (e()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.b;
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
                            Object obj = objArr[i7];
                            i2 = i3;
                            long j2 = jArr[i7];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
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
                    int i8 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i = i8;
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
