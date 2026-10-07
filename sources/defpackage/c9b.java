package defpackage;

import java.util.Arrays;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class c9b {
    public long[] a;
    public Object[] b;
    public int c;
    public int d;
    public int e;

    public c9b(int i) {
        this.a = q1f.a;
        this.b = rx8.d;
        if (i >= 0) {
            f(q1f.f(i));
        } else {
            gol.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a(Object obj) {
        this.b[d(obj)] = obj;
    }

    public final void b() {
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
        Arrays.fill(this.b, 0, this.c, (Object) null);
        this.e = q1f.a(this.c) - this.d;
    }

    public final boolean c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.c;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) i2) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (cqk.d(this.b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final int d(Object obj) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        Object[] objArr;
        int i = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = this.c;
        int i6 = i3 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr2 = this.a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j4 = ((jArr2[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr2[i8] >>> i9);
            long j5 = i4;
            int i10 = i4;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = (i6 + (Long.numberOfTrailingZeros(j7) >> 3)) & i5;
                int i11 = i;
                if (cqk.d(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i = i11;
            }
            int i12 = i;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iE = e(i3);
                long j8 = 255;
                if (this.e != 0 || ((this.a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i13 = this.c;
                    if (i13 > 8) {
                        int i14 = 8;
                        if (Long.compareUnsigned(((long) this.d) * 32, ((long) i13) * 25) <= 0) {
                            long[] jArr3 = this.a;
                            int i15 = this.c;
                            Object[] objArr2 = this.b;
                            int i16 = (i15 + 7) >> 3;
                            int i17 = 0;
                            j3 = 128;
                            while (i17 < i16) {
                                long j9 = j8;
                                long j10 = jArr3[i17] & (-9187201950435737472L);
                                jArr3[i17] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i17++;
                                i14 = i14;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int i18 = i14;
                            int length = jArr3.length;
                            int i19 = length - 1;
                            int i20 = length - 2;
                            long j11 = 72057594037927935L;
                            jArr3[i20] = (jArr3[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[i19] = jArr3[0];
                            int i21 = 0;
                            while (i21 != i15) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j12 = (jArr3[i22] >> i23) & j;
                                if (j12 != 128 && j12 == 254) {
                                    Object obj2 = objArr2[i21];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i12;
                                    int i24 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i25 = i24 >>> 7;
                                    int iE2 = e(i25);
                                    int i26 = i25 & i15;
                                    if (((iE2 - i26) & i15) / i18 == ((i21 - i26) & i15) / i18) {
                                        long j13 = j11;
                                        jArr3[i22] = (((long) (i24 & 127)) << i23) | ((~(j << i23)) & jArr3[i22]);
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j13) | Long.MIN_VALUE;
                                        i21++;
                                        j11 = j13;
                                    } else {
                                        long j14 = j11;
                                        int i27 = iE2 >> 3;
                                        long j15 = jArr3[i27];
                                        int i28 = (iE2 & 7) << 3;
                                        if (((j15 >> i28) & j) == 128) {
                                            objArr = objArr2;
                                            jArr3[i27] = ((~(j << i28)) & j15) | (((long) (i24 & 127)) << i28);
                                            jArr3[i22] = (jArr3[i22] & (~(j << i23))) | (128 << i23);
                                            objArr[iE2] = objArr[i21];
                                            objArr[i21] = null;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i27] = (((long) (i24 & 127)) << i28) | ((~(j << i28)) & j15);
                                            Object obj3 = objArr[iE2];
                                            objArr[iE2] = objArr[i21];
                                            objArr[i21] = obj3;
                                            i21--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j14) | Long.MIN_VALUE;
                                        i21++;
                                        j11 = j14;
                                        i18 = i18;
                                        i15 = i15;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i21++;
                                }
                            }
                            this.e = q1f.a(this.c) - this.d;
                        }
                        iE = e(i3);
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int iD = q1f.d(this.c);
                    long[] jArr4 = this.a;
                    Object[] objArr3 = this.b;
                    int i29 = this.c;
                    f(iD);
                    long[] jArr5 = this.a;
                    Object[] objArr4 = this.b;
                    int i30 = this.c;
                    int i31 = 0;
                    while (i31 < i29) {
                        if (((jArr4[i31 >> 3] >> ((i31 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i31];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i12;
                            int i32 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i32 >>> 7);
                            long j16 = i32 & 127;
                            int i33 = iE3 >> 3;
                            int i34 = (iE3 & 7) << 3;
                            jArr = jArr5;
                            long j17 = (jArr5[i33] & (~(255 << i34))) | (j16 << i34);
                            jArr[i33] = j17;
                            jArr[(((iE3 - 7) & i30) + (i30 & 7)) >> 3] = j17;
                            objArr4[iE3] = obj4;
                        } else {
                            jArr = jArr5;
                        }
                        i31++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iE = e(i3);
                }
                this.d++;
                int i35 = this.e;
                long[] jArr6 = this.a;
                int i36 = iE >> 3;
                long j18 = jArr6[i36];
                int i37 = (iE & 7) << 3;
                this.e = i35 - (((j18 >> i37) & j) == j3 ? 1 : 0);
                int i38 = this.c;
                long j19 = (j18 & (~(j << i37))) | (j2 << i37);
                jArr6[i36] = j19;
                jArr6[(((iE - 7) & i38) + (i38 & 7)) >> 3] = j19;
                return iE;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
            i4 = i10;
            i = i12;
        }
    }

    public final int e(int i) {
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

    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[LOOP:0: B:14:0x001d->B:26:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c9b)) {
            return false;
        }
        c9b c9bVar = (c9b) obj;
        if (c9bVar.d != this.d) {
            return false;
        }
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !c9bVar.c(objArr[(i << 3) + i3])) {
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

    public final void f(int i) {
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
        this.b = iMax == 0 ? rx8.d : new Object[iMax];
    }

    public final void g(Object obj) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.c;
        int i5 = i2 >>> 7;
        loop0: while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (cqk.d(this.b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i += 8;
                i5 = i6 + i;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            h(iNumberOfTrailingZeros);
        }
    }

    public final void h(int i) {
        this.d--;
        long[] jArr = this.a;
        int i2 = this.c;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
    }

    public final int hashCode() {
        int iHashCode = (this.c * 31) + this.d;
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (!cqk.d(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return iHashCode;
                    }
                }
                if (i != length) {
                    i++;
                }
            }
        }
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0066 A[DONT_INVERT, PHI: r7
  0x0066: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x0029, B:18:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0068 A[LOOP:0: B:5:0x001b->B:20:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x006b A[SYNTHETIC] */
    public final String toString() {
        bqb bqbVar = new bqb(1, this);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.b;
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
                        Object obj = objArr[(i << 3) + i4];
                        if (i2 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append((CharSequence) bqbVar.invoke(obj));
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

    public /* synthetic */ c9b() {
        this(6);
    }
}
