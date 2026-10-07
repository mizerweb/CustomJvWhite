package defpackage;

import java.util.Arrays;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class l8b {
    public long[] a;
    public long[] b;
    public Object[] c;
    public int d;
    public int e;
    public int f;

    public l8b(int i) {
        this.a = q1f.a;
        this.b = ui9.b;
        this.c = rx8.d;
        if (i >= 0) {
            g(q1f.f(i));
        } else {
            gol.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.e = 0;
        long[] jArr = this.a;
        if (jArr != q1f.a) {
            a.W0(jArr);
            long[] jArr2 = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        Arrays.fill(this.c, 0, this.d, (Object) null);
        this.f = q1f.a(this.d) - this.e;
    }

    public final boolean b(long j) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.d;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j3 = (((long) i2) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final int c(long j) {
        long j2;
        long j3;
        int i;
        int i2;
        long j4;
        long[] jArr;
        long j5;
        Object[] objArr;
        long[] jArr2;
        int i3 = -862048943;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i4 = iHashCode ^ (iHashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.d;
        int i8 = i5 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            int i12 = 1;
            long j6 = ((jArr3[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr3[i10] >>> i11);
            long j7 = i6;
            int i13 = i9;
            int i14 = 0;
            long j8 = j6 ^ (j7 * 72340172838076673L);
            long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L);
            while (j9 != 0) {
                int iNumberOfTrailingZeros = (i8 + (Long.numberOfTrailingZeros(j9) >> 3)) & i7;
                int i15 = i3;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    return iNumberOfTrailingZeros;
                }
                j9 &= j9 - 1;
                i3 = i15;
            }
            int i16 = i3;
            if ((((~j6) << 6) & j6 & (-9187201950435737472L)) != 0) {
                int iD = d(i5);
                if (this.f != 0 || ((this.a[iD >> 3] >> ((iD & 7) << 3)) & 255) == 254) {
                    j2 = 255;
                    j3 = j7;
                    i = 0;
                    i2 = 1;
                    j4 = 128;
                } else {
                    int i17 = this.d;
                    if (i17 > 8) {
                        j4 = 128;
                        if (Long.compareUnsigned(((long) this.e) * 32, ((long) i17) * 25) <= 0) {
                            long[] jArr4 = this.a;
                            int i18 = this.d;
                            long[] jArr5 = this.b;
                            Object[] objArr2 = this.c;
                            int i19 = (i18 + 7) >> 3;
                            j2 = 255;
                            int i20 = 0;
                            while (i20 < i19) {
                                long j10 = jArr4[i20] & (-9187201950435737472L);
                                jArr4[i20] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i20++;
                                i12 = i12;
                                i14 = i14;
                                j7 = j7;
                            }
                            j3 = j7;
                            i = i14;
                            int i21 = i12;
                            char c = 7;
                            int length = jArr4.length;
                            int i22 = length - 1;
                            int i23 = length - 2;
                            long j11 = 72057594037927935L;
                            jArr4[i23] = (jArr4[i23] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[i22] = jArr4[i];
                            int i24 = i;
                            while (i24 != i18) {
                                int i25 = i24 >> 3;
                                int i26 = (i24 & 7) << 3;
                                long j12 = (jArr4[i25] >> i26) & 255;
                                if (j12 != 128 && j12 == 254) {
                                    int iHashCode2 = Long.hashCode(jArr5[i24]) * i16;
                                    int i27 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i28 = i27 >>> 7;
                                    int iD2 = d(i28);
                                    int i29 = i28 & i18;
                                    c = c;
                                    if (((iD2 - i29) & i18) / 8 == ((i24 - i29) & i18) / 8) {
                                        int i30 = i21;
                                        j5 = j11;
                                        jArr4[i25] = (((long) (i27 & 127)) << i26) | (jArr4[i25] & (~(255 << i26)));
                                        jArr4[jArr4.length - i30] = (jArr4[i] & j5) | Long.MIN_VALUE;
                                        i24++;
                                        i21 = i30;
                                    } else {
                                        int i31 = i21;
                                        j5 = j11;
                                        int i32 = iD2 >> 3;
                                        long j13 = jArr4[i32];
                                        int i33 = (iD2 & 7) << 3;
                                        if (((j13 >> i33) & 255) == 128) {
                                            jArr2 = jArr5;
                                            objArr = objArr2;
                                            jArr4[i32] = (j13 & (~(255 << i33))) | (((long) (i27 & 127)) << i33);
                                            jArr4[i25] = (jArr4[i25] & (~(255 << i26))) | (128 << i26);
                                            jArr2[iD2] = jArr2[i24];
                                            jArr2[i24] = 0;
                                            objArr[iD2] = objArr[i24];
                                            objArr[i24] = null;
                                        } else {
                                            objArr = objArr2;
                                            jArr2 = jArr5;
                                            jArr4[i32] = (((long) (i27 & 127)) << i33) | (j13 & (~(255 << i33)));
                                            long j14 = jArr2[iD2];
                                            jArr2[iD2] = jArr2[i24];
                                            jArr2[i24] = j14;
                                            Object obj = objArr[iD2];
                                            objArr[iD2] = objArr[i24];
                                            objArr[i24] = obj;
                                            i24--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i] & j5) | Long.MIN_VALUE;
                                        i24++;
                                        jArr5 = jArr2;
                                        i21 = i31;
                                        objArr2 = objArr;
                                    }
                                    j11 = j5;
                                } else {
                                    i24++;
                                }
                            }
                            i2 = i21;
                            this.f = q1f.a(this.d) - this.e;
                        }
                        iD = d(i5);
                    } else {
                        j4 = 128;
                    }
                    j2 = 255;
                    j3 = j7;
                    i = 0;
                    i2 = 1;
                    int iD3 = q1f.d(this.d);
                    long[] jArr6 = this.a;
                    long[] jArr7 = this.b;
                    Object[] objArr3 = this.c;
                    int i34 = this.d;
                    g(iD3);
                    long[] jArr8 = this.a;
                    long[] jArr9 = this.b;
                    Object[] objArr4 = this.c;
                    int i35 = this.d;
                    int i36 = 0;
                    while (i36 < i34) {
                        if (((jArr6[i36 >> 3] >> ((i36 & 7) << 3)) & 255) < j4) {
                            long j15 = jArr7[i36];
                            int iHashCode3 = Long.hashCode(j15) * i16;
                            int i37 = iHashCode3 ^ (iHashCode3 << 16);
                            int iD4 = d(i37 >>> 7);
                            jArr = jArr8;
                            long j16 = i37 & 127;
                            int i38 = iD4 >> 3;
                            int i39 = (iD4 & 7) << 3;
                            long j17 = (jArr[i38] & (~(255 << i39))) | (j16 << i39);
                            jArr[i38] = j17;
                            jArr[(((iD4 - 7) & i35) + (i35 & 7)) >> 3] = j17;
                            jArr9[iD4] = j15;
                            objArr4[iD4] = objArr3[i36];
                        } else {
                            jArr = jArr8;
                        }
                        i36++;
                        jArr6 = jArr6;
                        jArr8 = jArr;
                    }
                    iD = d(i5);
                }
                this.e++;
                int i40 = this.f;
                long[] jArr10 = this.a;
                int i41 = iD >> 3;
                long j18 = jArr10[i41];
                int i42 = (iD & 7) << 3;
                if (((j18 >> i42) & j2) != j4) {
                    i2 = i;
                }
                this.f = i40 - i2;
                int i43 = this.d;
                long j19 = (j18 & (~(j2 << i42))) | (j3 << i42);
                jArr10[i41] = j19;
                jArr10[(((iD - 7) & i43) + (i43 & 7)) >> 3] = j19;
                return iD;
            }
            i9 = i13 + 8;
            i8 = (i8 + i9) & i7;
            i3 = i16;
        }
    }

    public final int d(int i) {
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

    public final void e(qf7 qf7Var) {
        long[] jArr = this.b;
        Object[] objArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        qf7Var.invoke(Long.valueOf(jArr[i4]), objArr[i4]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0071 A[LOOP:0: B:14:0x0023->B:33:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0074 A[EDGE_INSN: B:35:0x0074->B:34:0x0074 BREAK  A[LOOP:0: B:14:0x0023->B:33:0x0071], SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l8b)) {
            return false;
        }
        l8b l8bVar = (l8b) obj;
        if (l8bVar.e != this.e) {
            return false;
        }
        long[] jArr = this.b;
        Object[] objArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            long j2 = jArr[i4];
                            Object obj2 = objArr[i4];
                            if (obj2 == null) {
                                if (l8bVar.f(j2) != null || !l8bVar.b(j2)) {
                                    return false;
                                }
                            } else if (!obj2.equals(l8bVar.f(j2))) {
                                return false;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    public final Object f(long j) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.d;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j3 = (((long) i2) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final void g(int i) {
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
        this.c = new Object[iMax];
    }

    public final boolean h() {
        return this.e == 0;
    }

    public final int hashCode() {
        long[] jArr = this.b;
        Object[] objArr = this.c;
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
                        long j2 = jArr[i4];
                        Object obj = objArr[i4];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j2);
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

    public final void i(long j, Object obj) {
        int iC = c(j);
        Object[] objArr = this.c;
        Object obj2 = objArr[iC];
        this.b[iC] = j;
        objArr[iC] = obj;
    }

    public final void j(l8b l8bVar) {
        long[] jArr = l8bVar.b;
        Object[] objArr = l8bVar.c;
        long[] jArr2 = l8bVar.a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        l(jArr[i4], objArr[i4]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void k(long j) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.d;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j3 = (((long) i2) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i5 += 8;
                i4 = (i4 + i5) & i3;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            this.e--;
            long[] jArr2 = this.a;
            int i8 = this.d;
            int i9 = iNumberOfTrailingZeros >> 3;
            int i10 = (iNumberOfTrailingZeros & 7) << 3;
            long j5 = (jArr2[i9] & (~(255 << i10))) | (254 << i10);
            jArr2[i9] = j5;
            jArr2[(((iNumberOfTrailingZeros - 7) & i8) + (i8 & 7)) >> 3] = j5;
            Object[] objArr = this.c;
            Object obj = objArr[iNumberOfTrailingZeros];
            objArr[iNumberOfTrailingZeros] = null;
        }
    }

    public final void l(long j, Object obj) {
        int iC = c(j);
        this.b[iC] = j;
        this.c[iC] = obj;
    }

    public final String toString() {
        int i;
        int i2;
        if (h()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.b;
        Object[] objArr = this.c;
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
                            i2 = i3;
                            long j2 = jArr[i7];
                            Object obj = objArr[i7];
                            sb.append(j2);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
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

    public /* synthetic */ l8b() {
        this(6);
    }
}
