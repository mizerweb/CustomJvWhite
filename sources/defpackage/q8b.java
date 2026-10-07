package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class q8b {
    public long[] a;
    public Object[] b;
    public int[] c;
    public int d;
    public int e;
    public int f;

    public q8b(int i) {
        this.a = q1f.a;
        this.b = rx8.d;
        this.c = jj8.b;
        if (i >= 0) {
            d(q1f.f(i));
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

    public final int c(int i, Object obj) {
        int iB = b(obj);
        return iB >= 0 ? this.c[iB] : i;
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
        this.c = new int[iMax];
    }

    public final void e(int i, Object obj) {
        long j;
        long j2;
        long j3;
        int i2;
        long[] jArr;
        Object[] objArr;
        Object obj2 = obj;
        int i3 = -862048943;
        int iHashCode = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
        int i4 = iHashCode ^ (iHashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.d;
        int i8 = i5 & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr2 = this.a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j4 = ((jArr2[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr2[i10] >>> i11);
            long j5 = i6;
            int i12 = i6;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = -9187201950435737472L;
            long j8 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j8 != 0) {
                int iNumberOfTrailingZeros = (i8 + (Long.numberOfTrailingZeros(j8) >> 3)) & i7;
                int i13 = i3;
                if (cqk.d(this.b[iNumberOfTrailingZeros], obj2)) {
                    i2 = iNumberOfTrailingZeros;
                    break loop0;
                } else {
                    j8 &= j8 - 1;
                    i3 = i13;
                }
            }
            int i14 = i3;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iA = a(i5);
                if (this.f != 0 || ((this.a[iA >> 3] >> ((iA & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i15 = this.d;
                    if (i15 > 8) {
                        j3 = 128;
                        if (Long.compareUnsigned(((long) this.e) * 32, ((long) i15) * 25) <= 0) {
                            long[] jArr3 = this.a;
                            int i16 = this.d;
                            Object[] objArr2 = this.b;
                            int[] iArr = this.c;
                            int i17 = (i16 + 7) >> 3;
                            j = 255;
                            int i18 = 0;
                            while (i18 < i17) {
                                long j9 = jArr3[i18] & j7;
                                jArr3[i18] = (-72340172838076674L) & ((~j9) + (j9 >>> 7));
                                i18++;
                                j5 = j5;
                                j7 = -9187201950435737472L;
                            }
                            j2 = j5;
                            char c = 7;
                            int length = jArr3.length;
                            int i19 = length - 1;
                            int i20 = length - 2;
                            long j10 = 72057594037927935L;
                            jArr3[i20] = (jArr3[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[i19] = jArr3[0];
                            int i21 = 0;
                            while (i21 != i16) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j11 = (jArr3[i22] >> i23) & 255;
                                if (j11 != 128 && j11 == 254) {
                                    Object obj3 = objArr2[i21];
                                    int iHashCode2 = (obj3 != null ? obj3.hashCode() : 0) * i14;
                                    int i24 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i25 = i24 >>> 7;
                                    int iA2 = a(i25);
                                    int i26 = i25 & i16;
                                    char c2 = c;
                                    if (((iA2 - i26) & i16) / 8 == ((i21 - i26) & i16) / 8) {
                                        long j12 = j10;
                                        jArr3[i22] = (((long) (i24 & 127)) << i23) | (jArr3[i22] & (~(255 << i23)));
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j12) | Long.MIN_VALUE;
                                        i21++;
                                        c = c2;
                                        j10 = j12;
                                    } else {
                                        long j13 = j10;
                                        int i27 = iA2 >> 3;
                                        long j14 = jArr3[i27];
                                        int i28 = (iA2 & 7) << 3;
                                        if (((j14 >> i28) & 255) == 128) {
                                            objArr = objArr2;
                                            jArr3[i27] = ((~(255 << i28)) & j14) | (((long) (i24 & 127)) << i28);
                                            jArr3[i22] = (jArr3[i22] & (~(255 << i23))) | (128 << i23);
                                            objArr[iA2] = objArr[i21];
                                            objArr[i21] = null;
                                            iArr[iA2] = iArr[i21];
                                            iArr[i21] = 0;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i27] = ((~(255 << i28)) & j14) | (((long) (i24 & 127)) << i28);
                                            Object obj4 = objArr[iA2];
                                            objArr[iA2] = objArr[i21];
                                            objArr[i21] = obj4;
                                            int i29 = iArr[iA2];
                                            iArr[iA2] = iArr[i21];
                                            iArr[i21] = i29;
                                            i21--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j13) | Long.MIN_VALUE;
                                        i21++;
                                        i16 = i16;
                                        c = c2;
                                        j10 = j13;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i21++;
                                }
                            }
                            this.f = q1f.a(this.d) - this.e;
                        }
                        iA = a(i5);
                    } else {
                        j3 = 128;
                    }
                    j = 255;
                    j2 = j5;
                    int iD = q1f.d(this.d);
                    long[] jArr4 = this.a;
                    Object[] objArr3 = this.b;
                    int[] iArr2 = this.c;
                    int i30 = this.d;
                    d(iD);
                    long[] jArr5 = this.a;
                    Object[] objArr4 = this.b;
                    int[] iArr3 = this.c;
                    int i31 = this.d;
                    int i32 = 0;
                    while (i32 < i30) {
                        if (((jArr4[i32 >> 3] >> ((i32 & 7) << 3)) & 255) < j3) {
                            Object obj5 = objArr3[i32];
                            int iHashCode3 = (obj5 != null ? obj5.hashCode() : 0) * i14;
                            int i33 = iHashCode3 ^ (iHashCode3 << 16);
                            int iA3 = a(i33 >>> 7);
                            jArr = jArr5;
                            long j15 = i33 & 127;
                            int i34 = iA3 >> 3;
                            int i35 = (iA3 & 7) << 3;
                            long j16 = (jArr[i34] & (~(255 << i35))) | (j15 << i35);
                            jArr[i34] = j16;
                            jArr[(((iA3 - 7) & i31) + (i31 & 7)) >> 3] = j16;
                            objArr4[iA3] = obj5;
                            iArr3[iA3] = iArr2[i32];
                        } else {
                            jArr = jArr5;
                        }
                        i32++;
                        jArr5 = jArr;
                    }
                    iA = a(i5);
                }
                this.e++;
                int i36 = this.f;
                long[] jArr6 = this.a;
                int i37 = iA >> 3;
                long j17 = jArr6[i37];
                int i38 = (iA & 7) << 3;
                this.f = i36 - (((j17 >> i38) & j) == j3 ? 1 : 0);
                int i39 = this.d;
                long j18 = (j17 & (~(j << i38))) | (j2 << i38);
                jArr6[i37] = j18;
                jArr6[(((iA - 7) & i39) + (i39 & 7)) >> 3] = j18;
                i2 = ~iA;
                break;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
            obj2 = obj;
            i6 = i12;
            i3 = i14;
        }
        if (i2 < 0) {
            i2 = ~i2;
        }
        this.b[i2] = obj;
        this.c[i2] = i;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0064 A[LOOP:0: B:14:0x0023->B:28:0x0064, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x0067 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q8b)) {
            return false;
        }
        q8b q8bVar = (q8b) obj;
        if (q8bVar.e != this.e) {
            return false;
        }
        Object[] objArr = this.b;
        int[] iArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = objArr[i4];
                            int i5 = iArr[i4];
                            int iB = q8bVar.b(obj2);
                            if (iB < 0 || i5 != q8bVar.c[iB]) {
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
        Object[] objArr = this.b;
        int[] iArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        iHashCode += Integer.hashCode(iArr[i4]) ^ (obj != null ? obj.hashCode() : 0);
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

    /* JADX WARN: Code duplicated, block: B:23:0x006a A[DONT_INVERT, PHI: r8
  0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x006c A[LOOP:0: B:9:0x001e->B:24:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[EDGE_INSN: B:28:0x006f->B:25:0x006f BREAK  A[LOOP:0: B:9:0x001e->B:24:0x006c], SYNTHETIC] */
    public final String toString() {
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.b;
        int[] iArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            Object obj = objArr[i5];
                            int i6 = iArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i6);
                            i2++;
                            if (i2 < this.e) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ q8b() {
        this(6);
    }
}
