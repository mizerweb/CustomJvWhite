package defpackage;

import java.util.Arrays;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class b9b extends p1f {
    public int f;

    public b9b(int i) {
        this.a = q1f.a;
        Object[] objArr = rx8.d;
        this.b = objArr;
        this.c = objArr;
        if (i >= 0) {
            j(q1f.f(i));
        } else {
            gol.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void g() {
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
        Arrays.fill(this.b, 0, this.d, (Object) null);
        this.f = q1f.a(this.d) - this.e;
    }

    public final int h(int i) {
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

    public final int i(Object obj) {
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
        int i5 = this.d;
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
                int iH = h(i3);
                long j8 = 255;
                if (this.f != 0 || ((this.a[iH >> 3] >> ((iH & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i13 = this.d;
                    if (i13 > 8) {
                        int i14 = 8;
                        if (Long.compareUnsigned(((long) this.e) * 32, ((long) i13) * 25) <= 0) {
                            long[] jArr3 = this.a;
                            int i15 = this.d;
                            Object[] objArr2 = this.b;
                            Object[] objArr3 = this.c;
                            j3 = 128;
                            int i16 = (i15 + 7) >> 3;
                            int i17 = 0;
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
                            jArr3[i20] = (jArr3[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[i19] = jArr3[0];
                            int i21 = 0;
                            while (i21 != i15) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j11 = (jArr3[i22] >> i23) & j;
                                if (j11 != 128 && j11 == 254) {
                                    Object obj2 = objArr2[i21];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i12;
                                    int i24 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i25 = i24 >>> 7;
                                    int iH2 = h(i25);
                                    int i26 = i25 & i15;
                                    if (((iH2 - i26) & i15) / i18 == ((i21 - i26) & i15) / i18) {
                                        jArr3[i22] = (((long) (i24 & 127)) << i23) | (jArr3[i22] & (~(j << i23)));
                                        jArr3[jArr3.length - 1] = jArr3[0];
                                        i21++;
                                        i18 = i18;
                                    } else {
                                        int i27 = i18;
                                        int i28 = iH2 >> 3;
                                        long j12 = jArr3[i28];
                                        int i29 = (iH2 & 7) << 3;
                                        if (((j12 >> i29) & j) == 128) {
                                            objArr = objArr2;
                                            jArr3[i28] = ((~(j << i29)) & j12) | (((long) (i24 & 127)) << i29);
                                            jArr3[i22] = (jArr3[i22] & (~(j << i23))) | (128 << i23);
                                            objArr[iH2] = objArr[i21];
                                            objArr[i21] = null;
                                            objArr3[iH2] = objArr3[i21];
                                            objArr3[i21] = null;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i28] = (((long) (i24 & 127)) << i29) | ((~(j << i29)) & j12);
                                            Object obj3 = objArr[iH2];
                                            objArr[iH2] = objArr[i21];
                                            objArr[i21] = obj3;
                                            Object obj4 = objArr3[iH2];
                                            objArr3[iH2] = objArr3[i21];
                                            objArr3[i21] = obj4;
                                            i21--;
                                        }
                                        jArr3[jArr3.length - 1] = jArr3[0];
                                        i21++;
                                        i18 = i27;
                                        i15 = i15;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i21++;
                                }
                            }
                            this.f = q1f.a(this.d) - this.e;
                        }
                        iH = h(i3);
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int iD = q1f.d(this.d);
                    long[] jArr4 = this.a;
                    Object[] objArr4 = this.b;
                    Object[] objArr5 = this.c;
                    int i30 = this.d;
                    j(iD);
                    long[] jArr5 = this.a;
                    Object[] objArr6 = this.b;
                    Object[] objArr7 = this.c;
                    int i31 = this.d;
                    int i32 = 0;
                    while (i32 < i30) {
                        if (((jArr4[i32 >> 3] >> ((i32 & 7) << 3)) & 255) < 128) {
                            Object obj5 = objArr4[i32];
                            int iHashCode3 = (obj5 != null ? obj5.hashCode() : 0) * i12;
                            int i33 = iHashCode3 ^ (iHashCode3 << 16);
                            int iH3 = h(i33 >>> 7);
                            jArr = jArr5;
                            long j13 = i33 & 127;
                            int i34 = iH3 >> 3;
                            int i35 = (iH3 & 7) << 3;
                            long j14 = (jArr[i34] & (~(255 << i35))) | (j13 << i35);
                            jArr[i34] = j14;
                            jArr[(((iH3 - 7) & i31) + (i31 & 7)) >> 3] = j14;
                            objArr6[iH3] = obj5;
                            objArr7[iH3] = objArr5[i32];
                        } else {
                            jArr = jArr5;
                        }
                        i32++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iH = h(i3);
                }
                this.e++;
                int i36 = this.f;
                long[] jArr6 = this.a;
                int i37 = iH >> 3;
                long j15 = jArr6[i37];
                int i38 = (iH & 7) << 3;
                this.f = i36 - (((j15 >> i38) & j) == j3 ? 1 : 0);
                int i39 = this.d;
                long j16 = (j15 & (~(j << i38))) | (j2 << i38);
                jArr6[i37] = j16;
                jArr6[(((iH - 7) & i39) + (i39 & 7)) >> 3] = j16;
                return ~iH;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
            i4 = i10;
            i = i12;
        }
    }

    public final void j(int i) {
        long[] jArr;
        Object[] objArr = rx8.d;
        int iMax = i > 0 ? Math.max(7, q1f.e(i)) : 0;
        this.d = iMax;
        if (iMax == 0) {
            jArr = q1f.a;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            int i3 = iMax >> 3;
            long j = 255 << ((iMax & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j)) | j;
            jArr = jArr2;
        }
        this.a = jArr;
        this.f = q1f.a(this.d) - this.e;
        this.b = iMax == 0 ? objArr : new Object[iMax];
        if (iMax != 0) {
            objArr = new Object[iMax];
        }
        this.c = objArr;
    }

    public final void k(Object obj, Object obj2) {
        int i = i(obj);
        if (i < 0) {
            i = ~i;
        }
        Object[] objArr = this.c;
        Object obj3 = objArr[i];
        this.b[i] = obj;
        objArr[i] = obj2;
    }

    public final void l(p1f p1fVar) {
        Object[] objArr = p1fVar.b;
        Object[] objArr2 = p1fVar.c;
        long[] jArr = p1fVar.a;
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
                        int i4 = (i << 3) + i3;
                        o(objArr[i4], objArr2[i4]);
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

    public final Object m(Object obj) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
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
            }
            i += 8;
            i5 = i6 + i;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return n(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final Object n(int i) {
        this.e--;
        long[] jArr = this.a;
        int i2 = this.d;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
        Object[] objArr = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void o(Object obj, Object obj2) {
        int i = i(obj);
        if (i < 0) {
            i = ~i;
        }
        this.b[i] = obj;
        this.c[i] = obj2;
    }

    public /* synthetic */ b9b() {
        this(6);
    }
}
