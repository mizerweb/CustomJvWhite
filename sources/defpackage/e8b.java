package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class e8b {
    public long[] a;
    public int[] b;
    public Object[] c;
    public int d;
    public int e;
    public int f;

    public e8b(int i) {
        this.a = q1f.a;
        this.b = jj8.b;
        this.c = rx8.d;
        if (i >= 0) {
            e(q1f.f(i));
        } else {
            gol.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i) {
        long j;
        long j2;
        int i2;
        long j3;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        int i3 = -862048943;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i4 = iHashCode ^ (iHashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.d;
        int i8 = i5 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr2 = this.a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            int i12 = 1;
            long j4 = ((jArr2[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr2[i10] >>> i11);
            long j5 = i6;
            int i13 = i9;
            int i14 = 0;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = (i8 + (Long.numberOfTrailingZeros(j7) >> 3)) & i7;
                int i15 = i3;
                int i16 = i14;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i3 = i15;
                i14 = i16;
            }
            int i17 = i3;
            int i18 = i14;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iB = b(i5);
                long j8 = 255;
                if (this.f != 0 || ((this.a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    j3 = 128;
                } else {
                    int i19 = this.d;
                    if (i19 > 8) {
                        j3 = 128;
                        if (Long.compareUnsigned(((long) this.e) * 32, ((long) i19) * 25) <= 0) {
                            long[] jArr3 = this.a;
                            int i20 = this.d;
                            int[] iArr2 = this.b;
                            Object[] objArr2 = this.c;
                            int i21 = (i20 + 7) >> 3;
                            int i22 = i18;
                            while (i22 < i21) {
                                long j9 = j8;
                                long j10 = jArr3[i22] & (-9187201950435737472L);
                                jArr3[i22] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i22++;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int length = jArr3.length;
                            int i23 = length - 1;
                            int i24 = length - 2;
                            long j11 = 72057594037927935L;
                            jArr3[i24] = (jArr3[i24] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[i23] = jArr3[i18];
                            int i25 = i18;
                            while (i25 != i20) {
                                int i26 = i25 >> 3;
                                int i27 = (i25 & 7) << 3;
                                long j12 = (jArr3[i26] >> i27) & j;
                                if (j12 != 128 && j12 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i25]) * i17;
                                    int i28 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i29 = i28 >>> 7;
                                    int iB2 = b(i29);
                                    int i30 = i29 & i20;
                                    if (((iB2 - i30) & i20) / 8 == ((i25 - i30) & i20) / 8) {
                                        long j13 = j11;
                                        jArr3[i26] = (((long) (i28 & 127)) << i27) | ((~(j << i27)) & jArr3[i26]);
                                        jArr3[jArr3.length - i12] = (jArr3[i18] & j13) | Long.MIN_VALUE;
                                        i25++;
                                        j11 = j13;
                                    } else {
                                        long j14 = j11;
                                        int i31 = iB2 >> 3;
                                        long j15 = jArr3[i31];
                                        int i32 = (iB2 & 7) << 3;
                                        if (((j15 >> i32) & j) == 128) {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr3[i31] = ((~(j << i32)) & j15) | (((long) (i28 & 127)) << i32);
                                            jArr3[i26] = (jArr3[i26] & (~(j << i27))) | (128 << i27);
                                            iArr[iB2] = iArr[i25];
                                            iArr[i25] = i18;
                                            objArr[iB2] = objArr[i25];
                                            objArr[i25] = null;
                                        } else {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr3[i31] = (((long) (i28 & 127)) << i32) | ((~(j << i32)) & j15);
                                            int i33 = iArr[iB2];
                                            iArr[iB2] = iArr[i25];
                                            iArr[i25] = i33;
                                            Object obj = objArr[iB2];
                                            objArr[iB2] = objArr[i25];
                                            objArr[i25] = obj;
                                            i25--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[i18] & j14) | Long.MIN_VALUE;
                                        i25++;
                                        j11 = j14;
                                        i12 = i12;
                                        iArr2 = iArr;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i25++;
                                }
                            }
                            i2 = i12;
                            this.f = q1f.a(this.d) - this.e;
                        }
                        iB = b(i5);
                    } else {
                        j3 = 128;
                    }
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    int iD = q1f.d(this.d);
                    long[] jArr4 = this.a;
                    int[] iArr3 = this.b;
                    Object[] objArr3 = this.c;
                    int i34 = this.d;
                    e(iD);
                    long[] jArr5 = this.a;
                    int[] iArr4 = this.b;
                    Object[] objArr4 = this.c;
                    int i35 = this.d;
                    int i36 = i18;
                    while (i36 < i34) {
                        if (((jArr4[i36 >> 3] >> ((i36 & 7) << 3)) & 255) < j3) {
                            int i37 = iArr3[i36];
                            int iHashCode3 = Integer.hashCode(i37) * i17;
                            int i38 = iHashCode3 ^ (iHashCode3 << 16);
                            int iB3 = b(i38 >>> 7);
                            long j16 = i38 & 127;
                            int i39 = iB3 >> 3;
                            int i40 = (iB3 & 7) << 3;
                            jArr = jArr5;
                            long j17 = (jArr5[i39] & (~(255 << i40))) | (j16 << i40);
                            jArr[i39] = j17;
                            jArr[(((iB3 - 7) & i35) + (i35 & 7)) >> 3] = j17;
                            iArr4[iB3] = i37;
                            objArr4[iB3] = objArr3[i36];
                        } else {
                            jArr = jArr5;
                        }
                        i36++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iB = b(i5);
                }
                this.e++;
                int i41 = this.f;
                long[] jArr6 = this.a;
                int i42 = iB >> 3;
                long j18 = jArr6[i42];
                int i43 = (iB & 7) << 3;
                if (((j18 >> i43) & j) != j3) {
                    i2 = i18;
                }
                this.f = i41 - i2;
                int i44 = this.d;
                long j19 = (j18 & (~(j << i43))) | (j2 << i43);
                jArr6[i42] = j19;
                jArr6[(((iB - 7) & i44) + (i44 & 7)) >> 3] = j19;
                return iB;
            }
            i9 = i13 + 8;
            i8 = (i8 + i9) & i7;
            i3 = i17;
        }
    }

    public final int b(int i) {
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

    public final Object c(int i) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final Object d(int i, bj8 bj8Var) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        return iNumberOfTrailingZeros >= 0 ? this.c[iNumberOfTrailingZeros] : bj8Var;
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
        this.b = new int[iMax];
        this.c = new Object[iMax];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r16v4, types: [int] */
    public final boolean equals(Object obj) {
        long[] jArr;
        boolean z;
        int[] iArr;
        boolean z2;
        long[] jArr2;
        boolean z3;
        boolean z4;
        long j;
        long j2;
        int[] iArr2;
        int i;
        boolean z5 = true;
        if (obj == this) {
            return true;
        }
        boolean z6 = false;
        if (!(obj instanceof e8b)) {
            return false;
        }
        e8b e8bVar = (e8b) obj;
        if (e8bVar.e != this.e) {
            return false;
        }
        int[] iArr3 = this.b;
        Object[] objArr = this.c;
        long[] jArr3 = this.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return true;
        }
        int i2 = 0;
        loop0: while (true) {
            long j3 = jArr3[i2];
            char c = 7;
            long j4 = -9187201950435737472L;
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                for (?? r15 = z6; r15 < i4; r15++) {
                    if ((j3 & 255) < 128) {
                        ?? r16 = (i2 << 3) + r15;
                        z3 = z5;
                        int i5 = iArr3[r16];
                        z4 = z6;
                        Object obj2 = objArr[r16];
                        if (obj2 == null) {
                            if (e8bVar.c(i5) != null) {
                                break loop0;
                            }
                            int iHashCode = Integer.hashCode(i5) * (-862048943);
                            int i6 = iHashCode ^ (iHashCode << 16);
                            int i7 = i6 & 127;
                            j2 = j4;
                            int i8 = e8bVar.d;
                            int i9 = (i6 >>> 7) & i8;
                            ?? r14 = z4;
                            while (true) {
                                long[] jArr4 = e8bVar.a;
                                int i10 = i9 >> 3;
                                jArr2 = jArr3;
                                int i11 = (i9 & 7) << 3;
                                long j5 = jArr4[i10] >>> i11;
                                long j6 = jArr4[i10 + 1] << (64 - i11);
                                iArr2 = iArr3;
                                int i12 = i9;
                                long j7 = j5 | (j6 & ((-i11) >> 63));
                                j = j3;
                                long j8 = (((long) i7) * 72340172838076673L) ^ j7;
                                for (long j9 = (j8 - 72340172838076673L) & (~j8) & j2; j9 != 0; j9 &= j9 - 1) {
                                    int iNumberOfTrailingZeros = (i12 + (Long.numberOfTrailingZeros(j9) >> 3)) & i8;
                                    if (e8bVar.b[iNumberOfTrailingZeros] == i5) {
                                        i = iNumberOfTrailingZeros;
                                        break;
                                    }
                                }
                                if ((j7 & ((~j7) << 6) & j2) != 0) {
                                    i = -1;
                                    break;
                                }
                                int i13 = r14 + 8;
                                i9 = (i12 + i13) & i8;
                                iArr3 = iArr2;
                                jArr3 = jArr2;
                                j3 = j;
                                r14 = i13;
                            }
                            if (i < 0) {
                                break loop0;
                            }
                        } else {
                            jArr2 = jArr3;
                            j = j3;
                            j2 = j4;
                            iArr2 = iArr3;
                            if (!obj2.equals(e8bVar.c(i5))) {
                                return z4;
                            }
                        }
                    } else {
                        jArr2 = jArr3;
                        z3 = z5;
                        z4 = z6;
                        j = j3;
                        j2 = j4;
                        iArr2 = iArr3;
                    }
                    j3 = j >> i3;
                    c = c;
                    iArr3 = iArr2;
                    z5 = z3;
                    z6 = z4;
                    j4 = j2;
                    jArr3 = jArr2;
                    i3 = i3;
                }
                jArr = jArr3;
                z = z5;
                z2 = z6;
                int i14 = i3;
                iArr = iArr3;
                if (i4 != i14) {
                    return z;
                }
            } else {
                jArr = jArr3;
                z = z5;
                iArr = iArr3;
                z2 = z6;
            }
            if (i2 == length) {
                return z;
            }
            i2++;
            iArr3 = iArr;
            z5 = z;
            z6 = z2;
            jArr3 = jArr;
        }
        return z4;
    }

    public final Object f(int i, Object obj) {
        int iA = a(i);
        Object[] objArr = this.c;
        Object obj2 = objArr[iA];
        this.b[iA] = i;
        objArr[iA] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.b;
        Object[] objArr = this.c;
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
                        int i5 = iArr[i4];
                        Object obj = objArr[i4];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Integer.hashCode(i5);
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
        int[] iArr = this.b;
        Object[] objArr = this.c;
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
                            int i6 = iArr[i5];
                            Object obj = objArr[i5];
                            sb.append(i6);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
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

    public /* synthetic */ e8b() {
        this(6);
    }
}
