package net.jpountz.lz4;

import defpackage.qr7;
import defpackage.qye;
import defpackage.s61;
import defpackage.zo5;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
final class LZ4JavaSafeFastDecompressor extends LZ4FastDecompressor {
    public static final LZ4FastDecompressor INSTANCE = new LZ4JavaSafeFastDecompressor();

    @Override // net.jpountz.lz4.LZ4FastDecompressor
    public int decompress(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3) {
        int i4;
        byte b;
        int i5;
        byte b2;
        if (byteBuffer.hasArray() && byteBuffer2.hasArray()) {
            return decompress(byteBuffer.array(), i + byteBuffer.arrayOffset(), byteBuffer2.array(), i2 + byteBuffer2.arrayOffset(), i3);
        }
        ByteBuffer byteBufferD = s61.d(byteBuffer);
        ByteBuffer byteBufferD2 = s61.d(byteBuffer2);
        s61.a(i, byteBufferD);
        s61.b(byteBufferD2, i2, i3);
        if (i3 == 0) {
            if (byteBufferD.get(i) == 0) {
                return 1;
            }
            qr7.s(zo5.h(i, "Malformed input at "));
            return 0;
        }
        int i6 = i3 + i2;
        int i7 = i;
        int i8 = i2;
        while (true) {
            byte b3 = byteBufferD.get(i7);
            int i9 = i7 + 1;
            int i10 = (b3 & 255) >>> 4;
            if (i10 == 15) {
                while (true) {
                    i5 = i9 + 1;
                    b2 = byteBufferD.get(i9);
                    if (b2 != -1) {
                        break;
                    }
                    i10 += 255;
                    i9 = i5;
                }
                i10 += b2 & 255;
                i9 = i5;
            }
            int i11 = i8 + i10;
            int i12 = i6 - 8;
            if (i11 > i12) {
                if (i11 == i6) {
                    LZ4ByteBufferUtils.safeArraycopy(byteBufferD, i9, byteBufferD2, i8, i10);
                    return (i9 + i10) - i;
                }
                qr7.s(zo5.h(i9, "Malformed input at "));
                return 0;
            }
            LZ4ByteBufferUtils.wildArraycopy(byteBufferD, i9, byteBufferD2, i8, i10);
            int i13 = i9 + i10;
            int iG = s61.g(i13, byteBufferD);
            i7 = i13 + 2;
            int i14 = i11 - iG;
            if (i14 < i2) {
                qr7.s(zo5.h(i7, "Malformed input at "));
                return 0;
            }
            int i15 = b3 & 15;
            if (i15 == 15) {
                while (true) {
                    i4 = i7 + 1;
                    b = byteBufferD.get(i7);
                    if (b != -1) {
                        break;
                    }
                    i15 += 255;
                    i7 = i4;
                }
                i15 += b & 255;
                i7 = i4;
            }
            int i16 = i15 + 4;
            int i17 = i11 + i16;
            if (i17 <= i12) {
                LZ4ByteBufferUtils.wildIncrementalCopy(byteBufferD2, i14, i11, i17);
            } else {
                if (i17 > i6) {
                    qr7.s(zo5.h(i7, "Malformed input at "));
                    return 0;
                }
                LZ4ByteBufferUtils.safeIncrementalCopy(byteBufferD2, i14, i11, i16);
            }
            i8 = i17;
        }
    }

    @Override // net.jpountz.lz4.LZ4FastDecompressor, net.jpountz.lz4.LZ4Decompressor
    public int decompress(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        qye.a(i, bArr);
        qye.b(i2, bArr2, i3);
        if (i3 == 0) {
            if (bArr[i] == 0) {
                return 1;
            }
            qr7.s(zo5.h(i, "Malformed input at "));
            return 0;
        }
        int i8 = i3 + i2;
        int i9 = i;
        int i10 = i2;
        while (true) {
            int i11 = bArr[i9];
            int i12 = i9 + 1;
            int i13 = (i11 & 255) >>> 4;
            if (i13 == 15) {
                while (true) {
                    i6 = i12 + 1;
                    i7 = bArr[i12];
                    if (i7 != -1) {
                        break;
                    }
                    i13 += 255;
                    i12 = i6;
                }
                i13 += i7 & 255;
                i12 = i6;
            }
            int i14 = i10 + i13;
            int i15 = i8 - 8;
            if (i14 > i15) {
                if (i14 == i8) {
                    LZ4SafeUtils.safeArraycopy(bArr, i12, bArr2, i10, i13);
                    return (i12 + i13) - i;
                }
                qr7.s(zo5.h(i12, "Malformed input at "));
                return 0;
            }
            LZ4SafeUtils.wildArraycopy(bArr, i12, bArr2, i10, i13);
            int i16 = i12 + i13;
            int i17 = (bArr[i16] & 255) | ((bArr[i16 + 1] & 255) << 8);
            i9 = i16 + 2;
            int i18 = i14 - i17;
            if (i18 < i2) {
                qr7.s(zo5.h(i9, "Malformed input at "));
                return 0;
            }
            int i19 = i11 & 15;
            if (i19 == 15) {
                while (true) {
                    i4 = i9 + 1;
                    i5 = bArr[i9];
                    if (i5 != -1) {
                        break;
                    }
                    i19 += 255;
                    i9 = i4;
                }
                i19 += i5 & 255;
                i9 = i4;
            }
            int i20 = i19 + 4;
            int i21 = i14 + i20;
            if (i21 <= i15) {
                LZ4SafeUtils.wildIncrementalCopy(bArr2, i18, i14, i21);
            } else if (i21 <= i8) {
                LZ4SafeUtils.safeIncrementalCopy(bArr2, i18, i14, i20);
            } else {
                qr7.s(zo5.h(i9, "Malformed input at "));
                return 0;
            }
            i10 = i21;
        }
    }
}
