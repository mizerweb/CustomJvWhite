package net.jpountz.lz4;

import defpackage.np0;
import defpackage.qr7;
import defpackage.qye;
import defpackage.s61;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class LZ4JavaSafeCompressor extends LZ4Compressor {
    public static final LZ4Compressor INSTANCE = new LZ4JavaSafeCompressor();

    public static int compress64k(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int i5;
        int i6;
        short[] sArr;
        byte b;
        int i7 = i;
        int i8 = i7 + i2;
        int i9 = i8 - 5;
        int i10 = i8 - 12;
        if (i2 >= 13) {
            short[] sArr2 = new short[8192];
            int i11 = i7 + 1;
            i5 = i3;
            int i12 = i7;
            loop0: while (true) {
                int i13 = 1;
                int i14 = 1 << LZ4Constants.SKIP_STRENGTH;
                while (true) {
                    int i15 = i13 + i11;
                    int i16 = i14 + 1;
                    int i17 = i14 >>> LZ4Constants.SKIP_STRENGTH;
                    if (i15 > i10) {
                        i7 = i12;
                        break loop0;
                    }
                    int iHash64k = LZ4Utils.hash64k(qye.d(i11, bArr));
                    i6 = (sArr2[iHash64k] & 65535) + i7;
                    sArr = sArr2;
                    sArr[iHash64k] = (short) (i11 - i7);
                    if (LZ4SafeUtils.readIntEquals(bArr, i6, i11)) {
                        break;
                    }
                    sArr2 = sArr;
                    i11 = i15;
                    i13 = i17;
                    i14 = i16;
                }
                int iCommonBytesBackward = LZ4SafeUtils.commonBytesBackward(bArr, i6, i11, i7, i12);
                int i18 = i11 - iCommonBytesBackward;
                int i19 = i6 - iCommonBytesBackward;
                int i20 = i18 - i12;
                int iWriteLen = i5 + 1;
                if (iWriteLen + i20 + 8 + (i20 >>> 8) > i4) {
                    qr7.s("maxDestLen is too small");
                    return 0;
                }
                if (i20 >= 15) {
                    bArr2[i5] = -16;
                    b = 0;
                    iWriteLen = LZ4SafeUtils.writeLen(i20 - 15, bArr2, iWriteLen);
                } else {
                    b = 0;
                    bArr2[i5] = (byte) (i20 << 4);
                }
                LZ4SafeUtils.wildArraycopy(bArr, i12, bArr2, iWriteLen, i20);
                int i21 = iWriteLen + i20;
                while (true) {
                    short s = (short) (i18 - i19);
                    bArr2[i21] = (byte) s;
                    bArr2[i21 + 1] = (byte) (s >>> 8);
                    int iWriteLen2 = i21 + 2;
                    int i22 = i18 + 4;
                    int iCommonBytes = LZ4SafeUtils.commonBytes(bArr, i19 + 4, i22, i9);
                    if (i21 + 8 + (iCommonBytes >>> 8) > i4) {
                        qr7.s("maxDestLen is too small");
                        return b;
                    }
                    i18 = i22 + iCommonBytes;
                    if (iCommonBytes >= 15) {
                        bArr2[i5] = (byte) (bArr2[i5] | 15);
                        iWriteLen2 = LZ4SafeUtils.writeLen(iCommonBytes - 15, bArr2, iWriteLen2);
                    } else {
                        bArr2[i5] = (byte) (iCommonBytes | bArr2[i5]);
                    }
                    i5 = iWriteLen2;
                    if (i18 > i10) {
                        i7 = i18;
                        break loop0;
                    }
                    int i23 = i18 - 2;
                    sArr[LZ4Utils.hash64k(qye.d(i23, bArr))] = (short) (i23 - i7);
                    int iHash64k2 = LZ4Utils.hash64k(qye.d(i18, bArr));
                    i19 = i7 + (sArr[iHash64k2] & 65535);
                    sArr[iHash64k2] = (short) (i18 - i7);
                    if (!LZ4SafeUtils.readIntEquals(bArr, i18, i19)) {
                        break;
                    }
                    i21 = i5 + 1;
                    bArr2[i5] = b;
                }
                i12 = i18;
                i11 = i18 + 1;
                sArr2 = sArr;
            }
        } else {
            i5 = i3;
        }
        return LZ4SafeUtils.lastLiterals(bArr, i7, i8 - i7, bArr2, i5, i4) - i3;
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public int compress(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (byteBuffer.hasArray() && byteBuffer2.hasArray()) {
            return compress(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2, byteBuffer2.array(), byteBuffer2.arrayOffset() + i3, i4);
        }
        ByteBuffer byteBufferD = s61.d(byteBuffer);
        ByteBuffer byteBufferD2 = s61.d(byteBuffer2);
        s61.b(byteBufferD, i, i2);
        s61.b(byteBufferD2, i3, i4);
        int i9 = i3 + i4;
        if (i2 < 65547) {
            return compress64k(byteBufferD, i, i2, byteBufferD2, i3, i9);
        }
        int i10 = i + i2;
        int i11 = i10 - 5;
        int i12 = i10 - 12;
        int[] iArr = new int[np0.r];
        Arrays.fill(iArr, i);
        int i13 = i3;
        int i14 = i + 1;
        int i15 = i;
        loop0: while (true) {
            int i16 = 1;
            int i17 = 1 << LZ4Constants.SKIP_STRENGTH;
            while (true) {
                int i18 = i16 + i14;
                int i19 = i17 + 1;
                int i20 = i17 >>> LZ4Constants.SKIP_STRENGTH;
                if (i18 > i12) {
                    i5 = i10;
                    i6 = i15;
                    break loop0;
                }
                int iHash = LZ4Utils.hash(byteBufferD.getInt(i14));
                i7 = iArr[iHash];
                i5 = i10;
                i8 = i14 - i7;
                iArr[iHash] = i14;
                if (i8 >= 65536 || !LZ4ByteBufferUtils.readIntEquals(byteBufferD, i7, i14)) {
                    i10 = i5;
                    i14 = i18;
                    i16 = i20;
                    i17 = i19;
                }
            }
            int iCommonBytesBackward = LZ4ByteBufferUtils.commonBytesBackward(byteBufferD, i7, i14, i, i15);
            int i21 = i14 - iCommonBytesBackward;
            int i22 = i7 - iCommonBytesBackward;
            int i23 = i21 - i15;
            int iWriteLen = i13 + 1;
            if (iWriteLen + i23 + 8 + (i23 >>> 8) > i9) {
                qr7.s("maxDestLen is too small");
                return 0;
            }
            if (i23 >= 15) {
                byteBufferD2.put(i13, (byte) -16);
                iWriteLen = LZ4ByteBufferUtils.writeLen(i23 - 15, byteBufferD2, iWriteLen);
            } else {
                byteBufferD2.put(i13, (byte) (i23 << 4));
            }
            LZ4ByteBufferUtils.wildArraycopy(byteBufferD, i15, byteBufferD2, iWriteLen, i23);
            int i24 = iWriteLen + i23;
            while (true) {
                s61.i(byteBufferD2, i24, i8);
                int iWriteLen2 = i24 + 2;
                int i25 = i21 + 4;
                int iCommonBytes = LZ4ByteBufferUtils.commonBytes(byteBufferD, i22 + 4, i25, i11);
                if (i24 + 8 + (iCommonBytes >>> 8) > i9) {
                    qr7.s("maxDestLen is too small");
                    return 0;
                }
                i21 = i25 + iCommonBytes;
                if (iCommonBytes >= 15) {
                    byteBufferD2.put(i13, (byte) (byteBufferD2.get(i13) | 15));
                    iWriteLen2 = LZ4ByteBufferUtils.writeLen(iCommonBytes - 15, byteBufferD2, iWriteLen2);
                } else {
                    byteBufferD2.put(i13, (byte) (iCommonBytes | byteBufferD2.get(i13)));
                }
                i13 = iWriteLen2;
                if (i21 > i12) {
                    i6 = i21;
                    break loop0;
                }
                int i26 = i21 - 2;
                iArr[LZ4Utils.hash(byteBufferD.getInt(i26))] = i26;
                int iHash2 = LZ4Utils.hash(byteBufferD.getInt(i21));
                i22 = iArr[iHash2];
                iArr[iHash2] = i21;
                i8 = i21 - i22;
                if (i8 >= 65536 || !LZ4ByteBufferUtils.readIntEquals(byteBufferD, i22, i21)) {
                    i15 = i21;
                    i14 = i21 + 1;
                    i10 = i5;
                } else {
                    i24 = i13 + 1;
                    byteBufferD2.put(i13, (byte) 0);
                }
            }
        }
        return LZ4ByteBufferUtils.lastLiterals(byteBufferD, i6, i5 - i6, byteBufferD2, i13, i9) - i3;
    }

    public static int compress64k(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        int i5;
        int i6;
        short[] sArr;
        int i7 = i;
        int i8 = i7 + i2;
        int i9 = i8 - 5;
        int i10 = i8 - 12;
        if (i2 >= 13) {
            short[] sArr2 = new short[8192];
            int i11 = i7 + 1;
            i5 = i3;
            int i12 = i7;
            loop0: while (true) {
                int i13 = 1;
                int i14 = 1 << LZ4Constants.SKIP_STRENGTH;
                while (true) {
                    int i15 = i13 + i11;
                    int i16 = i14 + 1;
                    int i17 = i14 >>> LZ4Constants.SKIP_STRENGTH;
                    if (i15 > i10) {
                        i7 = i12;
                        break loop0;
                    }
                    int iHash64k = LZ4Utils.hash64k(byteBuffer.getInt(i11));
                    i6 = (sArr2[iHash64k] & 65535) + i7;
                    sArr = sArr2;
                    sArr[iHash64k] = (short) (i11 - i7);
                    if (LZ4ByteBufferUtils.readIntEquals(byteBuffer, i6, i11)) {
                        break;
                    }
                    sArr2 = sArr;
                    i11 = i15;
                    i13 = i17;
                    i14 = i16;
                }
                int iCommonBytesBackward = LZ4ByteBufferUtils.commonBytesBackward(byteBuffer, i6, i11, i7, i12);
                int i18 = i11 - iCommonBytesBackward;
                int i19 = i6 - iCommonBytesBackward;
                int i20 = i18 - i12;
                int iWriteLen = i5 + 1;
                if (iWriteLen + i20 + 8 + (i20 >>> 8) <= i4) {
                    if (i20 >= 15) {
                        byteBuffer2.put(i5, (byte) -16);
                        iWriteLen = LZ4ByteBufferUtils.writeLen(i20 - 15, byteBuffer2, iWriteLen);
                    } else {
                        byteBuffer2.put(i5, (byte) (i20 << 4));
                    }
                    LZ4ByteBufferUtils.wildArraycopy(byteBuffer, i12, byteBuffer2, iWriteLen, i20);
                    int i21 = iWriteLen + i20;
                    while (true) {
                        s61.i(byteBuffer2, i21, (short) (i18 - i19));
                        int iWriteLen2 = i21 + 2;
                        int i22 = i18 + 4;
                        int iCommonBytes = LZ4ByteBufferUtils.commonBytes(byteBuffer, i19 + 4, i22, i9);
                        if (i21 + 8 + (iCommonBytes >>> 8) > i4) {
                            qr7.s("maxDestLen is too small");
                            return 0;
                        }
                        i18 = i22 + iCommonBytes;
                        if (iCommonBytes >= 15) {
                            byteBuffer2.put(i5, (byte) (byteBuffer2.get(i5) | 15));
                            iWriteLen2 = LZ4ByteBufferUtils.writeLen(iCommonBytes - 15, byteBuffer2, iWriteLen2);
                        } else {
                            byteBuffer2.put(i5, (byte) (iCommonBytes | byteBuffer2.get(i5)));
                        }
                        i5 = iWriteLen2;
                        if (i18 > i10) {
                            i7 = i18;
                            break loop0;
                        }
                        int i23 = i18 - 2;
                        sArr[LZ4Utils.hash64k(byteBuffer.getInt(i23))] = (short) (i23 - i7);
                        int iHash64k2 = LZ4Utils.hash64k(byteBuffer.getInt(i18));
                        i19 = i7 + (sArr[iHash64k2] & 65535);
                        sArr[iHash64k2] = (short) (i18 - i7);
                        if (!LZ4ByteBufferUtils.readIntEquals(byteBuffer, i18, i19)) {
                            break;
                        }
                        i21 = i5 + 1;
                        byteBuffer2.put(i5, (byte) 0);
                    }
                    i12 = i18;
                    i11 = i18 + 1;
                    sArr2 = sArr;
                } else {
                    qr7.s("maxDestLen is too small");
                    return 0;
                }
            }
        } else {
            i5 = i3;
        }
        return LZ4ByteBufferUtils.lastLiterals(byteBuffer, i7, i8 - i7, byteBuffer2, i5, i4) - i3;
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public int compress(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        byte[] bArr3 = bArr2;
        qye.b(i, bArr, i2);
        qye.b(i3, bArr3, i4);
        int i9 = i4 + i3;
        if (i2 < 65547) {
            return compress64k(bArr, i, i2, bArr3, i3, i9);
        }
        int i10 = i + i2;
        int i11 = i10 - 5;
        int i12 = i10 - 12;
        int[] iArr = new int[np0.r];
        Arrays.fill(iArr, i);
        int i13 = i3;
        int i14 = i + 1;
        int i15 = i;
        loop0: while (true) {
            int i16 = 1;
            int i17 = 1 << LZ4Constants.SKIP_STRENGTH;
            while (true) {
                int i18 = i16 + i14;
                int i19 = i17 + 1;
                int i20 = i17 >>> LZ4Constants.SKIP_STRENGTH;
                if (i18 > i12) {
                    i5 = i10;
                    i6 = i15;
                    break loop0;
                }
                int iHash = LZ4Utils.hash(qye.d(i14, bArr));
                i7 = iArr[iHash];
                i5 = i10;
                i8 = i14 - i7;
                iArr[iHash] = i14;
                if (i8 >= 65536 || !LZ4SafeUtils.readIntEquals(bArr, i7, i14)) {
                    i10 = i5;
                    bArr3 = bArr2;
                    i14 = i18;
                    i16 = i20;
                    i17 = i19;
                }
            }
            int iCommonBytesBackward = LZ4SafeUtils.commonBytesBackward(bArr, i7, i14, i, i15);
            int i21 = i14 - iCommonBytesBackward;
            int i22 = i7 - iCommonBytesBackward;
            int i23 = i21 - i15;
            int iWriteLen = i13 + 1;
            if (iWriteLen + i23 + 8 + (i23 >>> 8) <= i9) {
                if (i23 >= 15) {
                    bArr3[i13] = -16;
                    iWriteLen = LZ4SafeUtils.writeLen(i23 - 15, bArr3, iWriteLen);
                } else {
                    bArr3[i13] = (byte) (i23 << 4);
                }
                LZ4SafeUtils.wildArraycopy(bArr, i15, bArr3, iWriteLen, i23);
                int i24 = iWriteLen + i23;
                while (true) {
                    bArr3[i24] = (byte) i8;
                    bArr3[i24 + 1] = (byte) (i8 >>> 8);
                    int iWriteLen2 = i24 + 2;
                    int i25 = i21 + 4;
                    int iCommonBytes = LZ4SafeUtils.commonBytes(bArr, i22 + 4, i25, i11);
                    if (i24 + 8 + (iCommonBytes >>> 8) > i9) {
                        qr7.s("maxDestLen is too small");
                        return 0;
                    }
                    i21 = i25 + iCommonBytes;
                    if (iCommonBytes >= 15) {
                        bArr3[i13] = (byte) (bArr3[i13] | 15);
                        iWriteLen2 = LZ4SafeUtils.writeLen(iCommonBytes - 15, bArr3, iWriteLen2);
                    } else {
                        bArr3[i13] = (byte) (iCommonBytes | bArr3[i13]);
                    }
                    i13 = iWriteLen2;
                    if (i21 > i12) {
                        i6 = i21;
                        break loop0;
                    }
                    int i26 = i21 - 2;
                    iArr[LZ4Utils.hash(qye.d(i26, bArr))] = i26;
                    int iHash2 = LZ4Utils.hash(qye.d(i21, bArr));
                    i22 = iArr[iHash2];
                    iArr[iHash2] = i21;
                    i8 = i21 - i22;
                    if (i8 >= 65536 || !LZ4SafeUtils.readIntEquals(bArr, i22, i21)) {
                        break;
                    }
                    i24 = i13 + 1;
                    bArr2[i13] = 0;
                    bArr3 = bArr2;
                }
                bArr3 = bArr2;
                i15 = i21;
                i14 = i21 + 1;
                i10 = i5;
            } else {
                qr7.s("maxDestLen is too small");
                return 0;
            }
        }
        return LZ4SafeUtils.lastLiterals(bArr, i6, i5 - i6, bArr3, i13, i9) - i3;
    }
}
