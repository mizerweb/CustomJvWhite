package net.jpountz.lz4;

import defpackage.qr7;
import defpackage.qye;
import defpackage.s61;
import defpackage.zo5;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
final class LZ4JavaSafeSafeDecompressor extends LZ4SafeDecompressor {
    public static final LZ4SafeDecompressor INSTANCE = new LZ4JavaSafeSafeDecompressor();

    @Override // net.jpountz.lz4.LZ4SafeDecompressor
    public int decompress(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i;
        if (byteBuffer.hasArray() && byteBuffer2.hasArray()) {
            return decompress(byteBuffer.array(), byteBuffer.arrayOffset() + i10, i2, byteBuffer2.array(), byteBuffer2.arrayOffset() + i3, i4);
        }
        ByteBuffer byteBufferD = s61.d(byteBuffer);
        ByteBuffer byteBufferD2 = s61.d(byteBuffer2);
        s61.b(byteBufferD, i10, i2);
        s61.b(byteBufferD2, i3, i4);
        int i11 = 0;
        int i12 = 1;
        if (i4 == 0) {
            if (i2 == 1 && byteBufferD.get(i10) == 0) {
                return 0;
            }
            qr7.s("Output buffer too small");
            return 0;
        }
        int i13 = i2 + i10;
        int i14 = i4 + i3;
        int i15 = i3;
        while (true) {
            byte b = byteBufferD.get(i10);
            i5 = i10 + i12;
            i6 = (b & 255) >>> 4;
            if (i6 == 15) {
                byte b2 = -1;
                while (i5 < i13) {
                    int i16 = i5 + 1;
                    byte b3 = byteBufferD.get(i5);
                    if (b3 != -1) {
                        b2 = b3;
                        i5 = i16;
                        break;
                    }
                    i6 += 255;
                    b2 = b3;
                    i5 = i16;
                }
                i6 += b2 & 255;
            }
            i7 = i15 + i6;
            int i17 = i14 - 8;
            i8 = i11;
            if (i7 > i17 || (i9 = i5 + i6) > i13 - 8) {
                break;
            }
            LZ4ByteBufferUtils.wildArraycopy(byteBufferD, i5, byteBufferD2, i15, i6);
            int iG = s61.g(i9, byteBufferD);
            int i18 = i9 + 2;
            int i19 = i7 - iG;
            if (i19 < i3) {
                qr7.s(zo5.h(i18, "Malformed input at "));
                return i8;
            }
            int i20 = b & 15;
            if (i20 == 15) {
                byte b4 = -1;
                while (i18 < i13) {
                    int i21 = i18 + 1;
                    byte b5 = byteBufferD.get(i18);
                    if (b5 != -1) {
                        b4 = b5;
                        i18 = i21;
                        break;
                    }
                    i20 += 255;
                    b4 = b5;
                    i18 = i21;
                }
                i20 += b4 & 255;
            }
            int i22 = i20 + 4;
            i15 = i7 + i22;
            if (i15 <= i17) {
                LZ4ByteBufferUtils.wildIncrementalCopy(byteBufferD2, i19, i7, i15);
            } else {
                if (i15 > i14) {
                    qr7.s(zo5.h(i18, "Malformed input at "));
                    return i8;
                }
                LZ4ByteBufferUtils.safeIncrementalCopy(byteBufferD2, i19, i7, i22);
            }
            i12 = 1;
            i10 = i18;
            i11 = i8;
        }
        if (i7 > i14) {
            throw new LZ4Exception();
        }
        if (i5 + i6 == i13) {
            LZ4ByteBufferUtils.safeArraycopy(byteBufferD, i5, byteBufferD2, i15, i6);
            return i7 - i3;
        }
        qr7.s(zo5.h(i5, "Malformed input at "));
        return i8;
    }

    @Override // net.jpountz.lz4.LZ4SafeDecompressor, net.jpountz.lz4.LZ4UnknownSizeDecompressor
    public int decompress(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i;
        qye.b(i10, bArr, i2);
        qye.b(i3, bArr2, i4);
        int i11 = 0;
        int i12 = 1;
        if (i4 == 0) {
            if (i2 == 1 && bArr[i10] == 0) {
                return 0;
            }
            qr7.s("Output buffer too small");
            return 0;
        }
        int i13 = i2 + i10;
        int i14 = i4 + i3;
        int i15 = i3;
        while (true) {
            int i16 = bArr[i10];
            i5 = i10 + i12;
            i6 = (i16 & 255) >>> 4;
            if (i6 == 15) {
                int i17 = -1;
                while (i5 < i13) {
                    int i18 = i5 + 1;
                    int i19 = bArr[i5];
                    if (i19 != -1) {
                        i17 = i19;
                        i5 = i18;
                        break;
                    }
                    i6 += 255;
                    i17 = i19;
                    i5 = i18;
                }
                i6 += i17 & 255;
            }
            i7 = i15 + i6;
            int i20 = i14 - 8;
            i8 = i11;
            if (i7 > i20 || (i9 = i5 + i6) > i13 - 8) {
                break;
            }
            LZ4SafeUtils.wildArraycopy(bArr, i5, bArr2, i15, i6);
            int i21 = (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8);
            int i22 = i9 + 2;
            int i23 = i7 - i21;
            if (i23 < i3) {
                qr7.s(zo5.h(i22, "Malformed input at "));
                return i8;
            }
            int i24 = i16 & 15;
            if (i24 == 15) {
                int i25 = -1;
                while (i22 < i13) {
                    int i26 = i22 + 1;
                    int i27 = bArr[i22];
                    if (i27 != -1) {
                        i25 = i27;
                        i22 = i26;
                        break;
                    }
                    i24 += 255;
                    i25 = i27;
                    i22 = i26;
                }
                i24 += i25 & 255;
            }
            int i28 = i24 + 4;
            i15 = i7 + i28;
            if (i15 <= i20) {
                LZ4SafeUtils.wildIncrementalCopy(bArr2, i23, i7, i15);
            } else if (i15 <= i14) {
                LZ4SafeUtils.safeIncrementalCopy(bArr2, i23, i7, i28);
            } else {
                qr7.s(zo5.h(i22, "Malformed input at "));
                return i8;
            }
            i12 = 1;
            i10 = i22;
            i11 = i8;
        }
        if (i7 > i14) {
            throw new LZ4Exception();
        }
        if (i5 + i6 == i13) {
            LZ4SafeUtils.safeArraycopy(bArr, i5, bArr2, i15, i6);
            return i7 - i3;
        }
        qr7.s(zo5.h(i5, "Malformed input at "));
        return i8;
    }
}
