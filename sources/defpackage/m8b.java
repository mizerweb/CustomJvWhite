package defpackage;

import java.util.Arrays;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class m8b {
    public long[] a;
    public long[] b;
    public int c;
    public int d;
    public int e;

    public m8b(int i) {
        this.a = q1f.a;
        this.b = ui9.b;
        if (i >= 0) {
            h(q1f.f(i));
        } else {
            gol.c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006f A[DONT_INVERT, PHI: r7
  0x006f: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:14:0x0038, B:26:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x0071 A[LOOP:0: B:13:0x002a->B:28:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0074 A[SYNTHETIC] */
    public static String k(m8b m8bVar, int i) {
        String str = (i & 2) != 0 ? "" : "[";
        String str2 = (i & 4) == 0 ? "]" : "";
        m8bVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str);
        long[] jArr = m8bVar.b;
        long[] jArr2 = m8bVar.a;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb.append((CharSequence) str2);
            break;
        }
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            long j = jArr2[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j) < 128) {
                        long j2 = jArr[(i2 << 3) + i5];
                        if (i3 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i3 != 0) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append(j2);
                        i3++;
                    }
                    j >>= 8;
                }
                if (i4 == 8) {
                    if (i2 == length) {
                        i2++;
                    }
                }
                sb.append((CharSequence) str2);
                break;
            }
            if (i2 == length) {
                sb.append((CharSequence) str2);
                break;
            }
            i2++;
        }
        return sb.toString();
    }

    public final boolean a(long j) {
        int i = this.d;
        this.b[e(j)] = j;
        return this.d != i;
    }

    public final void b(m8b m8bVar) {
        long[] jArr = m8bVar.b;
        long[] jArr2 = m8bVar.a;
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
                        m(jArr[(i << 3) + i3]);
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

    public final void c() {
        this.d = 0;
        long[] jArr = this.a;
        if (jArr != q1f.a) {
            a.W0(jArr);
            long[] jArr2 = this.a;
            int i = this.c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        this.e = q1f.a(this.c) - this.d;
    }

    public final boolean d(long j) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.c;
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

    public final int e(long j) {
        long j2;
        long j3;
        int i;
        int i2;
        long j4;
        long[] jArr;
        int i3;
        int i4 = -862048943;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i5 = iHashCode ^ (iHashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & 127;
        int i8 = this.c;
        int i9 = i6 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr2 = this.a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            int i13 = 1;
            long j5 = ((jArr2[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr2[i11] >>> i12);
            long j6 = i7;
            int i14 = i10;
            int i15 = 0;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L);
            while (j8 != 0) {
                int iNumberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j8) >> 3)) & i8;
                int i16 = i4;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    return iNumberOfTrailingZeros;
                }
                j8 &= j8 - 1;
                i4 = i16;
            }
            int i17 = i4;
            if ((((~j5) << 6) & j5 & (-9187201950435737472L)) != 0) {
                int iF = f(i6);
                long j9 = 255;
                if (this.e != 0 || ((this.a[iF >> 3] >> ((iF & 7) << 3)) & 255) == 254) {
                    j2 = 255;
                    j3 = j6;
                    i = 0;
                    i2 = 1;
                    j4 = 128;
                } else {
                    int i18 = this.c;
                    if (i18 > 8) {
                        j4 = 128;
                        if (Long.compareUnsigned(((long) this.d) * 32, ((long) i18) * 25) <= 0) {
                            long[] jArr3 = this.a;
                            int i19 = this.c;
                            long[] jArr4 = this.b;
                            int i20 = (i19 + 7) >> 3;
                            int i21 = 0;
                            while (i21 < i20) {
                                long j10 = j9;
                                long j11 = jArr3[i21] & (-9187201950435737472L);
                                jArr3[i21] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
                                i21++;
                                j6 = j6;
                                j9 = j10;
                            }
                            j2 = j9;
                            j3 = j6;
                            char c = 7;
                            int length = jArr3.length;
                            int i22 = length - 1;
                            int i23 = length - 2;
                            long j12 = 72057594037927935L;
                            jArr3[i23] = (jArr3[i23] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[i22] = jArr3[0];
                            int i24 = 0;
                            while (i24 != i19) {
                                int i25 = i24 >> 3;
                                int i26 = (i24 & 7) << 3;
                                long j13 = (jArr3[i25] >> i26) & j2;
                                if (j13 != 128 && j13 == 254) {
                                    int iHashCode2 = Long.hashCode(jArr4[i24]) * i17;
                                    int i27 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i28 = i27 >>> 7;
                                    int iF2 = f(i28);
                                    int i29 = i28 & i19;
                                    long j14 = j12;
                                    if (((iF2 - i29) & i19) / 8 == ((i24 - i29) & i19) / 8) {
                                        int i30 = i15;
                                        jArr3[i25] = (((long) (i27 & 127)) << i26) | (jArr3[i25] & (~(j2 << i26)));
                                        jArr3[jArr3.length - i13] = (jArr3[i30] & j14) | Long.MIN_VALUE;
                                        i24++;
                                        c = c;
                                        i15 = i30;
                                        j12 = j14;
                                    } else {
                                        char c2 = c;
                                        int i31 = i15;
                                        int i32 = iF2 >> 3;
                                        long j15 = jArr3[i32];
                                        int i33 = (iF2 & 7) << 3;
                                        if (((j15 >> i33) & j2) == 128) {
                                            i3 = i13;
                                            jArr3[i32] = (j15 & (~(j2 << i33))) | (((long) (i27 & 127)) << i33);
                                            jArr3[i25] = (jArr3[i25] & (~(j2 << i26))) | (128 << i26);
                                            jArr4[iF2] = jArr4[i24];
                                            jArr4[i24] = 0;
                                        } else {
                                            i3 = i13;
                                            jArr3[i32] = (((long) (i27 & 127)) << i33) | (j15 & (~(j2 << i33)));
                                            long j16 = jArr4[iF2];
                                            jArr4[iF2] = jArr4[i24];
                                            jArr4[i24] = j16;
                                            i24--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[i31] & j14) | Long.MIN_VALUE;
                                        i24++;
                                        c = c2;
                                        i15 = i31;
                                        j12 = j14;
                                        i13 = i3;
                                    }
                                } else {
                                    i24++;
                                }
                            }
                            i = i15;
                            i2 = i13;
                            this.e = q1f.a(this.c) - this.d;
                        }
                        iF = f(i6);
                    } else {
                        j4 = 128;
                    }
                    j2 = 255;
                    j3 = j6;
                    i = 0;
                    i2 = 1;
                    int iD = q1f.d(this.c);
                    long[] jArr5 = this.a;
                    long[] jArr6 = this.b;
                    int i34 = this.c;
                    h(iD);
                    long[] jArr7 = this.a;
                    long[] jArr8 = this.b;
                    int i35 = this.c;
                    int i36 = 0;
                    while (i36 < i34) {
                        if (((jArr5[i36 >> 3] >> ((i36 & 7) << 3)) & 255) < j4) {
                            long j17 = jArr6[i36];
                            int iHashCode3 = Long.hashCode(j17) * i17;
                            int i37 = iHashCode3 ^ (iHashCode3 << 16);
                            int iF3 = f(i37 >>> 7);
                            long j18 = i37 & 127;
                            int i38 = iF3 >> 3;
                            int i39 = (iF3 & 7) << 3;
                            jArr = jArr7;
                            long j19 = (jArr7[i38] & (~(255 << i39))) | (j18 << i39);
                            jArr[i38] = j19;
                            jArr[(((iF3 - 7) & i35) + (i35 & 7)) >> 3] = j19;
                            jArr8[iF3] = j17;
                        } else {
                            jArr = jArr7;
                        }
                        i36++;
                        jArr5 = jArr5;
                        jArr7 = jArr;
                    }
                    iF = f(i6);
                }
                this.d++;
                int i40 = this.e;
                long[] jArr9 = this.a;
                int i41 = iF >> 3;
                long j20 = jArr9[i41];
                int i42 = (iF & 7) << 3;
                if (((j20 >> i42) & j2) != j4) {
                    i2 = i;
                }
                this.e = i40 - i2;
                int i43 = this.c;
                long j21 = (j20 & (~(j2 << i42))) | (j3 << i42);
                jArr9[i41] = j21;
                jArr9[(((iF - 7) & i43) + (i43 & 7)) >> 3] = j21;
                return iF;
            }
            i10 = i14 + 8;
            i9 = (i9 + i10) & i8;
            i4 = i17;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[LOOP:0: B:14:0x001d->B:26:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m8b)) {
            return false;
        }
        m8b m8bVar = (m8b) obj;
        if (m8bVar.d != this.d) {
            return false;
        }
        long[] jArr = this.b;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !m8bVar.d(jArr[(i << 3) + i3])) {
                            return false;
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
        }
        return true;
    }

    public final int f(int i) {
        int i2 = this.c;
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

    /* JADX WARN: Code duplicated, block: B:15:0x003c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x003e A[LOOP:0: B:5:0x000b->B:16:0x003e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0041 A[SYNTHETIC] */
    public final long g() {
        long[] jArr = this.b;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            return jArr[(i << 3) + i3];
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
        }
        ore.f("The LongSet is empty");
        return 0L;
    }

    public final void h(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, q1f.e(i)) : 0;
        this.c = iMax;
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
        this.e = q1f.a(this.c) - this.d;
        this.b = new long[iMax];
    }

    public final int hashCode() {
        long[] jArr = this.b;
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
                        iHashCode = Long.hashCode(jArr[(i << 3) + i3]) + iHashCode;
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

    public final boolean i() {
        return this.d == 0;
    }

    public final boolean j() {
        return this.d != 0;
    }

    public final void l(long j) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.c;
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
            q(iNumberOfTrailingZeros);
        }
    }

    public final void m(long j) {
        this.b[e(j)] = j;
    }

    public final boolean n(long j) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.c;
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
        boolean z = iNumberOfTrailingZeros >= 0;
        if (z) {
            q(iNumberOfTrailingZeros);
        }
        return z;
    }

    public final void o(m8b m8bVar) {
        long[] jArr = m8bVar.b;
        long[] jArr2 = m8bVar.a;
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
                        l(jArr[(i << 3) + i3]);
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

    public final void p(long[] jArr) {
        for (long j : jArr) {
            l(j);
        }
    }

    public final void q(int i) {
        this.d--;
        long[] jArr = this.a;
        int i2 = this.c;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
    }

    public final String toString() {
        return k(this, 25);
    }

    public /* synthetic */ m8b() {
        this(6);
    }
}
