package net.jpountz.lz4;

import defpackage.mdi;
import defpackage.qr7;
import defpackage.qye;
import defpackage.s61;
import defpackage.wqi;
import defpackage.zo5;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class LZ4JavaUnsafeSafeDecompressor extends LZ4SafeDecompressor {
    public static final LZ4SafeDecompressor INSTANCE = new LZ4JavaUnsafeSafeDecompressor();

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
            if (i2 == 1 && s61.e(i10, byteBufferD) == 0) {
                return 0;
            }
            qr7.s("Output buffer too small");
            return 0;
        }
        int i13 = i2 + i10;
        int i14 = i4 + i3;
        int i15 = i3;
        while (true) {
            byte bE = s61.e(i10, byteBufferD);
            i5 = i10 + i12;
            i6 = (bE & 255) >>> 4;
            if (i6 == 15) {
                byte b = -1;
                while (i5 < i13) {
                    int i16 = i5 + 1;
                    byte bE2 = s61.e(i5, byteBufferD);
                    if (bE2 != -1) {
                        b = bE2;
                        i5 = i16;
                        break;
                    }
                    i6 += 255;
                    b = bE2;
                    i5 = i16;
                }
                i6 += b & 255;
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
            int i20 = bE & 15;
            if (i20 == 15) {
                byte b2 = -1;
                while (i18 < i13) {
                    int i21 = i18 + 1;
                    byte bE3 = s61.e(i18, byteBufferD);
                    if (bE3 != -1) {
                        b2 = bE3;
                        i18 = i21;
                        break;
                    }
                    i20 += 255;
                    b2 = bE3;
                    i18 = i21;
                }
                i20 += b2 & 255;
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
        Unsafe unsafe = mdi.a;
        qye.b(i10, bArr, i2);
        qye.b(i3, bArr2, i4);
        int i11 = 0;
        int i12 = 1;
        if (i4 == 0) {
            if (i2 == 1 && mdi.a(i10, bArr) == 0) {
                return 0;
            }
            qr7.s("Output buffer too small");
            return 0;
        }
        int i13 = i2 + i10;
        int i14 = i4 + i3;
        int i15 = i3;
        while (true) {
            byte bA = mdi.a(i10, bArr);
            i5 = i10 + i12;
            i6 = (bA & 255) >>> 4;
            if (i6 == 15) {
                byte b = -1;
                while (i5 < i13) {
                    int i16 = i5 + 1;
                    byte bA2 = mdi.a(i5, bArr);
                    if (bA2 != -1) {
                        b = bA2;
                        i5 = i16;
                        break;
                    }
                    i6 += 255;
                    b = bA2;
                    i5 = i16;
                }
                i6 += b & 255;
            }
            i7 = i15 + i6;
            int i17 = i14 - 8;
            i8 = i11;
            if (i7 > i17 || (i9 = i5 + i6) > i13 - 8) {
                break;
            }
            LZ4UnsafeUtils.wildArraycopy(bArr, i5, bArr2, i15, i6);
            short sG = mdi.g(i9, bArr);
            if (wqi.a == ByteOrder.BIG_ENDIAN) {
                sG = Short.reverseBytes(sG);
            }
            int i18 = i9 + 2;
            int i19 = i7 - (sG & 65535);
            if (i19 < i3) {
                qr7.s(zo5.h(i18, "Malformed input at "));
                return i8;
            }
            int i20 = bA & 15;
            if (i20 == 15) {
                byte b2 = -1;
                while (i18 < i13) {
                    int i21 = i18 + 1;
                    byte bA3 = mdi.a(i18, bArr);
                    if (bA3 != -1) {
                        b2 = bA3;
                        i18 = i21;
                        break;
                    }
                    i20 += 255;
                    b2 = bA3;
                    i18 = i21;
                }
                i20 += b2 & 255;
            }
            int i22 = i20 + 4;
            i15 = i7 + i22;
            if (i15 <= i17) {
                LZ4UnsafeUtils.wildIncrementalCopy(bArr2, i19, i7, i15);
            } else if (i15 <= i14) {
                LZ4UnsafeUtils.safeIncrementalCopy(bArr2, i19, i7, i22);
            } else {
                qr7.s(zo5.h(i18, "Malformed input at "));
                return i8;
            }
            i12 = 1;
            i10 = i18;
            i11 = i8;
        }
        if (i7 > i14) {
            throw new LZ4Exception();
        }
        if (i5 + i6 == i13) {
            LZ4UnsafeUtils.safeArraycopy(bArr, i5, bArr2, i15, i6);
            return i7 - i3;
        }
        qr7.s(zo5.h(i5, "Malformed input at "));
        return i8;
    }
}
