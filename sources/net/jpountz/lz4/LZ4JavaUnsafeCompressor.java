package net.jpountz.lz4;

import defpackage.mdi;
import defpackage.np0;
import defpackage.qr7;
import defpackage.qye;
import defpackage.s61;
import java.nio.ByteBuffer;
import java.util.Arrays;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class LZ4JavaUnsafeCompressor extends LZ4Compressor {
    public static final LZ4Compressor INSTANCE = new LZ4JavaUnsafeCompressor();

    public static int compress64k(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int i5;
        int i6;
        int iF;
        int i7 = i;
        int i8 = i7 + i2;
        int i9 = i8 - 5;
        int i10 = i8 - 12;
        if (i2 >= 13) {
            short[] sArr = new short[8192];
            int i11 = i7 + 1;
            int i12 = i3;
            int i13 = i7;
            loop0: while (true) {
                int i14 = 1;
                int i15 = 1 << LZ4Constants.SKIP_STRENGTH;
                while (true) {
                    int i16 = i14 + i11;
                    int i17 = i15 + 1;
                    int i18 = i15 >>> LZ4Constants.SKIP_STRENGTH;
                    if (i16 > i10) {
                        i5 = i8;
                        i7 = i13;
                        break loop0;
                    }
                    int iHash64k = LZ4Utils.hash64k(mdi.b(i11, bArr));
                    iF = mdi.f(sArr, iHash64k) + i7;
                    i5 = i8;
                    mdi.o(sArr, iHash64k, i11 - i7);
                    if (LZ4UnsafeUtils.readIntEquals(bArr, iF, i11)) {
                        break;
                    }
                    i11 = i16;
                    i8 = i5;
                    i14 = i18;
                    i15 = i17;
                }
                int iCommonBytesBackward = LZ4UnsafeUtils.commonBytesBackward(bArr, iF, i11, i7, i13);
                int i19 = i11 - iCommonBytesBackward;
                int iF2 = iF - iCommonBytesBackward;
                int i20 = i19 - i13;
                int iWriteLen = i12 + 1;
                if (iWriteLen + i20 + 8 + (i20 >>> 8) > i4) {
                    qr7.s("maxDestLen is too small");
                    return 0;
                }
                if (i20 >= 15) {
                    mdi.h(bArr2, i12, (byte) -16);
                    iWriteLen = LZ4UnsafeUtils.writeLen(i20 - 15, bArr2, iWriteLen);
                } else {
                    mdi.h(bArr2, i12, (byte) (i20 << 4));
                }
                LZ4UnsafeUtils.wildArraycopy(bArr, i13, bArr2, iWriteLen, i20);
                int i21 = iWriteLen + i20;
                while (true) {
                    short s = (short) (i19 - iF2);
                    mdi.h(bArr2, i21, (byte) s);
                    mdi.h(bArr2, i21 + 1, (byte) (s >>> 8));
                    int iWriteLen2 = i21 + 2;
                    int i22 = i19 + 4;
                    int iCommonBytes = LZ4UnsafeUtils.commonBytes(bArr, iF2 + 4, i22, i9);
                    if (i21 + 8 + (iCommonBytes >>> 8) > i4) {
                        qr7.s("maxDestLen is too small");
                        return 0;
                    }
                    i19 = i22 + iCommonBytes;
                    if (iCommonBytes >= 15) {
                        mdi.h(bArr2, i12, (byte) (mdi.a(i12, bArr2) | 15));
                        iWriteLen2 = LZ4UnsafeUtils.writeLen(iCommonBytes - 15, bArr2, iWriteLen2);
                    } else {
                        mdi.h(bArr2, i12, (byte) (iCommonBytes | mdi.a(i12, bArr2)));
                    }
                    i12 = iWriteLen2;
                    if (i19 > i10) {
                        i7 = i19;
                        break loop0;
                    }
                    int i23 = i19 - 2;
                    mdi.o(sArr, LZ4Utils.hash64k(mdi.b(i23, bArr)), i23 - i7);
                    int iHash64k2 = LZ4Utils.hash64k(mdi.b(i19, bArr));
                    iF2 = mdi.f(sArr, iHash64k2) + i7;
                    mdi.o(sArr, iHash64k2, i19 - i7);
                    if (!LZ4UnsafeUtils.readIntEquals(bArr, i19, iF2)) {
                        break;
                    }
                    i21 = i12 + 1;
                    mdi.h(bArr2, i12, (byte) 0);
                }
                i13 = i19;
                i11 = i19 + 1;
                i8 = i5;
            }
            i6 = i12;
        } else {
            i5 = i8;
            i6 = i3;
        }
        return LZ4UnsafeUtils.lastLiterals(bArr, i7, i5 - i7, bArr2, i6, i4) - i3;
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public int compress(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        int i5;
        int i6;
        int iD;
        int i7;
        if (byteBuffer.hasArray() && byteBuffer2.hasArray()) {
            return compress(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2, byteBuffer2.array(), byteBuffer2.arrayOffset() + i3, i4);
        }
        ByteBuffer byteBufferD = s61.d(byteBuffer);
        ByteBuffer byteBufferD2 = s61.d(byteBuffer2);
        s61.b(byteBufferD, i, i2);
        s61.b(byteBufferD2, i3, i4);
        int i8 = i3 + i4;
        if (i2 < 65547) {
            return compress64k(byteBufferD, i, i2, byteBufferD2, i3, i8);
        }
        int i9 = i + i2;
        int i10 = i9 - 5;
        int i11 = i9 - 12;
        int[] iArr = new int[np0.r];
        Arrays.fill(iArr, i);
        int i12 = i3;
        int i13 = i + 1;
        int i14 = i;
        loop0: while (true) {
            int i15 = 1;
            int i16 = 1 << LZ4Constants.SKIP_STRENGTH;
            while (true) {
                int i17 = i15 + i13;
                int i18 = i16 + 1;
                int i19 = i16 >>> LZ4Constants.SKIP_STRENGTH;
                if (i17 > i11) {
                    i5 = i9;
                    i6 = i14;
                    break loop0;
                }
                int iHash = LZ4Utils.hash(s61.f(i13, byteBufferD));
                iD = mdi.d(iHash, iArr);
                i5 = i9;
                i7 = i13 - iD;
                mdi.i(iHash, i13, iArr);
                if (i7 >= 65536 || !LZ4ByteBufferUtils.readIntEquals(byteBufferD, iD, i13)) {
                    i9 = i5;
                    i13 = i17;
                    i15 = i19;
                    i16 = i18;
                }
            }
            int iCommonBytesBackward = LZ4ByteBufferUtils.commonBytesBackward(byteBufferD, iD, i13, i, i14);
            int i20 = i13 - iCommonBytesBackward;
            int iD2 = iD - iCommonBytesBackward;
            int i21 = i20 - i14;
            int iWriteLen = i12 + 1;
            if (iWriteLen + i21 + 8 + (i21 >>> 8) > i8) {
                qr7.s("maxDestLen is too small");
                return 0;
            }
            if (i21 >= 15) {
                s61.h(byteBufferD2, i12, 240);
                iWriteLen = LZ4ByteBufferUtils.writeLen(i21 - 15, byteBufferD2, iWriteLen);
            } else {
                s61.h(byteBufferD2, i12, i21 << 4);
            }
            LZ4ByteBufferUtils.wildArraycopy(byteBufferD, i14, byteBufferD2, iWriteLen, i21);
            int i22 = iWriteLen + i21;
            while (true) {
                s61.i(byteBufferD2, i22, i7);
                int iWriteLen2 = i22 + 2;
                int i23 = i20 + 4;
                int iCommonBytes = LZ4ByteBufferUtils.commonBytes(byteBufferD, iD2 + 4, i23, i10);
                if (i22 + 8 + (iCommonBytes >>> 8) > i8) {
                    qr7.s("maxDestLen is too small");
                    return 0;
                }
                i20 = i23 + iCommonBytes;
                if (iCommonBytes >= 15) {
                    s61.h(byteBufferD2, i12, s61.e(i12, byteBufferD2) | 15);
                    iWriteLen2 = LZ4ByteBufferUtils.writeLen(iCommonBytes - 15, byteBufferD2, iWriteLen2);
                } else {
                    s61.h(byteBufferD2, i12, iCommonBytes | s61.e(i12, byteBufferD2));
                }
                i12 = iWriteLen2;
                if (i20 > i11) {
                    i6 = i20;
                    break loop0;
                }
                int i24 = i20 - 2;
                mdi.i(LZ4Utils.hash(s61.f(i24, byteBufferD)), i24, iArr);
                int iHash2 = LZ4Utils.hash(s61.f(i20, byteBufferD));
                iD2 = mdi.d(iHash2, iArr);
                mdi.i(iHash2, i20, iArr);
                i7 = i20 - iD2;
                if (i7 >= 65536 || !LZ4ByteBufferUtils.readIntEquals(byteBufferD, iD2, i20)) {
                    i14 = i20;
                    i13 = i20 + 1;
                    i9 = i5;
                } else {
                    i22 = i12 + 1;
                    s61.h(byteBufferD2, i12, 0);
                }
            }
        }
        return LZ4ByteBufferUtils.lastLiterals(byteBufferD, i6, i5 - i6, byteBufferD2, i12, i8) - i3;
    }

    public static int compress64k(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        int i5;
        int i6;
        int iF;
        int i7 = i;
        int i8 = i7 + i2;
        int i9 = i8 - 5;
        int i10 = i8 - 12;
        if (i2 >= 13) {
            short[] sArr = new short[8192];
            int i11 = i7 + 1;
            int i12 = i3;
            int i13 = i7;
            loop0: while (true) {
                int i14 = 1;
                int i15 = 1 << LZ4Constants.SKIP_STRENGTH;
                while (true) {
                    int i16 = i14 + i11;
                    int i17 = i15 + 1;
                    int i18 = i15 >>> LZ4Constants.SKIP_STRENGTH;
                    if (i16 > i10) {
                        i5 = i8;
                        i7 = i13;
                        break loop0;
                    }
                    int iHash64k = LZ4Utils.hash64k(s61.f(i11, byteBuffer));
                    iF = mdi.f(sArr, iHash64k) + i7;
                    i5 = i8;
                    mdi.o(sArr, iHash64k, i11 - i7);
                    if (LZ4ByteBufferUtils.readIntEquals(byteBuffer, iF, i11)) {
                        break;
                    }
                    i11 = i16;
                    i8 = i5;
                    i14 = i18;
                    i15 = i17;
                }
                int iCommonBytesBackward = LZ4ByteBufferUtils.commonBytesBackward(byteBuffer, iF, i11, i7, i13);
                int i19 = i11 - iCommonBytesBackward;
                int iF2 = iF - iCommonBytesBackward;
                int i20 = i19 - i13;
                int iWriteLen = i12 + 1;
                if (iWriteLen + i20 + 8 + (i20 >>> 8) <= i4) {
                    if (i20 >= 15) {
                        s61.h(byteBuffer2, i12, 240);
                        iWriteLen = LZ4ByteBufferUtils.writeLen(i20 - 15, byteBuffer2, iWriteLen);
                    } else {
                        s61.h(byteBuffer2, i12, i20 << 4);
                    }
                    LZ4ByteBufferUtils.wildArraycopy(byteBuffer, i13, byteBuffer2, iWriteLen, i20);
                    int i21 = iWriteLen + i20;
                    while (true) {
                        s61.i(byteBuffer2, i21, (short) (i19 - iF2));
                        int iWriteLen2 = i21 + 2;
                        int i22 = i19 + 4;
                        int iCommonBytes = LZ4ByteBufferUtils.commonBytes(byteBuffer, iF2 + 4, i22, i9);
                        if (i21 + 8 + (iCommonBytes >>> 8) > i4) {
                            qr7.s("maxDestLen is too small");
                            return 0;
                        }
                        i19 = i22 + iCommonBytes;
                        if (iCommonBytes >= 15) {
                            s61.h(byteBuffer2, i12, s61.e(i12, byteBuffer2) | 15);
                            iWriteLen2 = LZ4ByteBufferUtils.writeLen(iCommonBytes - 15, byteBuffer2, iWriteLen2);
                        } else {
                            s61.h(byteBuffer2, i12, iCommonBytes | s61.e(i12, byteBuffer2));
                        }
                        i12 = iWriteLen2;
                        if (i19 > i10) {
                            i7 = i19;
                            break loop0;
                        }
                        int i23 = i19 - 2;
                        mdi.o(sArr, LZ4Utils.hash64k(s61.f(i23, byteBuffer)), i23 - i7);
                        int iHash64k2 = LZ4Utils.hash64k(s61.f(i19, byteBuffer));
                        iF2 = mdi.f(sArr, iHash64k2) + i7;
                        mdi.o(sArr, iHash64k2, i19 - i7);
                        if (!LZ4ByteBufferUtils.readIntEquals(byteBuffer, i19, iF2)) {
                            break;
                        }
                        i21 = i12 + 1;
                        s61.h(byteBuffer2, i12, 0);
                    }
                    i13 = i19;
                    i11 = i19 + 1;
                    i8 = i5;
                } else {
                    qr7.s("maxDestLen is too small");
                    return 0;
                }
            }
            i6 = i12;
        } else {
            i5 = i8;
            i6 = i3;
        }
        return LZ4ByteBufferUtils.lastLiterals(byteBuffer, i7, i5 - i7, byteBuffer2, i6, i4) - i3;
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public int compress(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int i5;
        int i6;
        int iD;
        int i7;
        Unsafe unsafe = mdi.a;
        qye.b(i, bArr, i2);
        qye.b(i3, bArr2, i4);
        int i8 = i4 + i3;
        if (i2 < 65547) {
            return compress64k(bArr, i, i2, bArr2, i3, i8);
        }
        int i9 = i + i2;
        int i10 = i9 - 5;
        int i11 = i9 - 12;
        int[] iArr = new int[np0.r];
        Arrays.fill(iArr, i);
        int i12 = i3;
        int i13 = i + 1;
        int i14 = i;
        loop0: while (true) {
            int i15 = 1;
            int i16 = 1 << LZ4Constants.SKIP_STRENGTH;
            while (true) {
                int i17 = i15 + i13;
                int i18 = i16 + 1;
                int i19 = i16 >>> LZ4Constants.SKIP_STRENGTH;
                if (i17 > i11) {
                    i5 = i9;
                    i6 = i14;
                    break loop0;
                }
                int iHash = LZ4Utils.hash(mdi.b(i13, bArr));
                iD = mdi.d(iHash, iArr);
                i5 = i9;
                i7 = i13 - iD;
                mdi.i(iHash, i13, iArr);
                if (i7 >= 65536 || !LZ4UnsafeUtils.readIntEquals(bArr, iD, i13)) {
                    i9 = i5;
                    i13 = i17;
                    i15 = i19;
                    i16 = i18;
                }
            }
            int iCommonBytesBackward = LZ4UnsafeUtils.commonBytesBackward(bArr, iD, i13, i, i14);
            int i20 = i13 - iCommonBytesBackward;
            int iD2 = iD - iCommonBytesBackward;
            int i21 = i20 - i14;
            int iWriteLen = i12 + 1;
            if (iWriteLen + i21 + 8 + (i21 >>> 8) <= i8) {
                if (i21 >= 15) {
                    mdi.h(bArr2, i12, (byte) -16);
                    iWriteLen = LZ4UnsafeUtils.writeLen(i21 - 15, bArr2, iWriteLen);
                } else {
                    mdi.h(bArr2, i12, (byte) (i21 << 4));
                }
                LZ4UnsafeUtils.wildArraycopy(bArr, i14, bArr2, iWriteLen, i21);
                int i22 = iWriteLen + i21;
                while (true) {
                    mdi.h(bArr2, i22, (byte) i7);
                    mdi.h(bArr2, i22 + 1, (byte) (i7 >>> 8));
                    int iWriteLen2 = i22 + 2;
                    int i23 = i20 + 4;
                    int iCommonBytes = LZ4UnsafeUtils.commonBytes(bArr, iD2 + 4, i23, i10);
                    if (i22 + 8 + (iCommonBytes >>> 8) > i8) {
                        qr7.s("maxDestLen is too small");
                        return 0;
                    }
                    i20 = i23 + iCommonBytes;
                    if (iCommonBytes >= 15) {
                        mdi.h(bArr2, i12, (byte) (mdi.a(i12, bArr2) | 15));
                        iWriteLen2 = LZ4UnsafeUtils.writeLen(iCommonBytes - 15, bArr2, iWriteLen2);
                    } else {
                        mdi.h(bArr2, i12, (byte) (iCommonBytes | mdi.a(i12, bArr2)));
                    }
                    i12 = iWriteLen2;
                    if (i20 > i11) {
                        i6 = i20;
                        break loop0;
                    }
                    int i24 = i20 - 2;
                    mdi.i(LZ4Utils.hash(mdi.b(i24, bArr)), i24, iArr);
                    int iHash2 = LZ4Utils.hash(mdi.b(i20, bArr));
                    iD2 = mdi.d(iHash2, iArr);
                    mdi.i(iHash2, i20, iArr);
                    i7 = i20 - iD2;
                    if (i7 >= 65536 || !LZ4UnsafeUtils.readIntEquals(bArr, iD2, i20)) {
                        break;
                    }
                    i22 = i12 + 1;
                    mdi.h(bArr2, i12, (byte) 0);
                }
                i14 = i20;
                i13 = i20 + 1;
                i9 = i5;
            } else {
                qr7.s("maxDestLen is too small");
                return 0;
            }
        }
        return LZ4UnsafeUtils.lastLiterals(bArr, i6, i5 - i6, bArr2, i12, i8) - i3;
    }
}
