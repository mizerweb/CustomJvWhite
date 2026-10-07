package defpackage;

import java.util.Arrays;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class f8b {
    public long[] a;
    public int[] b;
    public int c;
    public int d;
    public int e;

    public f8b(int i) {
        this.a = q1f.a;
        this.b = jj8.b;
        if (i >= 0) {
            g(q1f.f(i));
        } else {
            gol.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a(int i) {
        this.b[e(i)] = i;
    }

    public final void b(f8b f8bVar) {
        int[] iArr = f8bVar.b;
        long[] jArr = f8bVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        h(iArr[(i << 3) + i3]);
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

    public final boolean d(int i) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.c;
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
        return iNumberOfTrailingZeros >= 0;
    }

    public final int e(int i) {
        long j;
        long j2;
        int i2;
        long j3;
        long[] jArr;
        int[] iArr;
        int i3;
        int i4 = -862048943;
        int iHashCode = Integer.hashCode(i) * (-862048943);
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
            long j4 = ((jArr2[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr2[i11] >>> i12);
            long j5 = i7;
            int i14 = i10;
            int i15 = 0;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j7) >> 3)) & i8;
                int i16 = i4;
                int i17 = i15;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i4 = i16;
                i15 = i17;
            }
            int i18 = i4;
            int i19 = i15;
            char c = '\b';
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iF = f(i6);
                long j8 = 255;
                if (this.e != 0 || ((this.a[iF >> 3] >> ((iF & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    j3 = 128;
                } else {
                    int i20 = this.c;
                    if (i20 > 8) {
                        j3 = 128;
                        if (Long.compareUnsigned(((long) this.d) * 32, ((long) i20) * 25) <= 0) {
                            long[] jArr3 = this.a;
                            int i21 = this.c;
                            int[] iArr2 = this.b;
                            int i22 = (i21 + 7) >> 3;
                            int i23 = i19;
                            while (i23 < i22) {
                                char c2 = c;
                                long j9 = jArr3[i23] & (-9187201950435737472L);
                                jArr3[i23] = (-72340172838076674L) & ((~j9) + (j9 >>> 7));
                                i23++;
                                j5 = j5;
                                c = c2;
                                j8 = j8;
                            }
                            j = j8;
                            j2 = j5;
                            int length = jArr3.length;
                            int i24 = length - 1;
                            int i25 = length - 2;
                            long j10 = 72057594037927935L;
                            jArr3[i25] = (jArr3[i25] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[i24] = jArr3[i19];
                            int i26 = i19;
                            while (i26 != i21) {
                                int i27 = i26 >> 3;
                                int i28 = (i26 & 7) << 3;
                                long j11 = (jArr3[i27] >> i28) & j;
                                if (j11 != 128 && j11 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i26]) * i18;
                                    int i29 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i30 = i29 >>> 7;
                                    int iF2 = f(i30);
                                    int i31 = i30 & i21;
                                    if (((iF2 - i31) & i21) / 8 == ((i26 - i31) & i21) / 8) {
                                        long j12 = j10;
                                        jArr3[i27] = (((long) (i29 & 127)) << i28) | ((~(j << i28)) & jArr3[i27]);
                                        jArr3[jArr3.length - i13] = (jArr3[i19] & j12) | Long.MIN_VALUE;
                                        i26++;
                                        j10 = j12;
                                    } else {
                                        long j13 = j10;
                                        int i32 = iF2 >> 3;
                                        long j14 = jArr3[i32];
                                        int i33 = (iF2 & 7) << 3;
                                        if (((j14 >> i33) & j) == 128) {
                                            iArr = iArr2;
                                            int i34 = i26;
                                            jArr3[i32] = ((~(j << i33)) & j14) | (((long) (i29 & 127)) << i33);
                                            jArr3[i27] = (jArr3[i27] & (~(j << i28))) | (128 << i28);
                                            iArr[iF2] = iArr[i34];
                                            iArr[i34] = i19;
                                            i3 = i34;
                                        } else {
                                            iArr = iArr2;
                                            int i35 = i26;
                                            jArr3[i32] = (((long) (i29 & 127)) << i33) | ((~(j << i33)) & j14);
                                            int i36 = iArr[iF2];
                                            iArr[iF2] = iArr[i35];
                                            iArr[i35] = i36;
                                            i3 = i35 - 1;
                                        }
                                        jArr3[jArr3.length - i13] = (jArr3[i19] & j13) | Long.MIN_VALUE;
                                        i26 = i3 + i13;
                                        i13 = i13;
                                        j10 = j13;
                                        iArr2 = iArr;
                                    }
                                } else {
                                    i26++;
                                }
                            }
                            i2 = i13;
                            this.e = q1f.a(this.c) - this.d;
                        }
                        iF = f(i6);
                    } else {
                        j3 = 128;
                    }
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    int iD = q1f.d(this.c);
                    long[] jArr4 = this.a;
                    int[] iArr3 = this.b;
                    int i37 = this.c;
                    g(iD);
                    long[] jArr5 = this.a;
                    int[] iArr4 = this.b;
                    int i38 = this.c;
                    int i39 = i19;
                    while (i39 < i37) {
                        if (((jArr4[i39 >> 3] >> ((i39 & 7) << 3)) & 255) < j3) {
                            int i40 = iArr3[i39];
                            int iHashCode3 = Integer.hashCode(i40) * i18;
                            int i41 = iHashCode3 ^ (iHashCode3 << 16);
                            int iF3 = f(i41 >>> 7);
                            long j15 = i41 & 127;
                            int i42 = iF3 >> 3;
                            int i43 = (iF3 & 7) << 3;
                            jArr = jArr5;
                            long j16 = (jArr5[i42] & (~(255 << i43))) | (j15 << i43);
                            jArr[i42] = j16;
                            jArr[(((iF3 - 7) & i38) + (i38 & 7)) >> 3] = j16;
                            iArr4[iF3] = i40;
                        } else {
                            jArr = jArr5;
                        }
                        i39++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iF = f(i6);
                }
                this.d += i2;
                int i44 = this.e;
                long[] jArr6 = this.a;
                int i45 = iF >> 3;
                long j17 = jArr6[i45];
                int i46 = (iF & 7) << 3;
                if (((j17 >> i46) & j) != j3) {
                    i2 = i19;
                }
                this.e = i44 - i2;
                int i47 = this.c;
                long j18 = (j17 & (~(j << i46))) | (j2 << i46);
                jArr6[i45] = j18;
                jArr6[(((iF - 7) & i47) + (i47 & 7)) >> 3] = j18;
                return iF;
            }
            i10 = i14 + 8;
            i9 = (i9 + i10) & i8;
            i4 = i18;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[LOOP:0: B:14:0x001d->B:26:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f8b)) {
            return false;
        }
        f8b f8bVar = (f8b) obj;
        if (f8bVar.d != this.d) {
            return false;
        }
        int[] iArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !f8bVar.d(iArr[(i << 3) + i3])) {
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

    public final void g(int i) {
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
        this.b = new int[iMax];
    }

    public final void h(int i) {
        this.b[e(i)] = i;
    }

    public final int hashCode() {
        int[] iArr = this.b;
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
                        iHashCode = Integer.hashCode(iArr[(i << 3) + i3]) + iHashCode;
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

    public final void i(int i) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.c;
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
            } else {
                i6 += 8;
                i5 = (i5 + i6) & i4;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            this.d--;
            long[] jArr2 = this.a;
            int i9 = this.c;
            int i10 = iNumberOfTrailingZeros >> 3;
            int i11 = (iNumberOfTrailingZeros & 7) << 3;
            long j4 = (jArr2[i10] & (~(255 << i11))) | (254 << i11);
            jArr2[i10] = j4;
            jArr2[(((iNumberOfTrailingZeros - 7) & i9) + (i9 & 7)) >> 3] = j4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005b A[DONT_INVERT, PHI: r5
  0x005b: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:6:0x0024, B:18:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x005d A[LOOP:0: B:5:0x0016->B:20:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0060 A[SYNTHETIC] */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb.append((CharSequence) "]");
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = iArr[(i << 3) + i4];
                        if (i2 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append(i5);
                        i2++;
                    }
                    j >>= 8;
                }
                if (i3 == 8) {
                    if (i == length) {
                        i++;
                    }
                }
                sb.append((CharSequence) "]");
                break;
            }
            if (i == length) {
                sb.append((CharSequence) "]");
                break;
            }
            i++;
        }
        return sb.toString();
    }

    public /* synthetic */ f8b() {
        this(6);
    }
}
