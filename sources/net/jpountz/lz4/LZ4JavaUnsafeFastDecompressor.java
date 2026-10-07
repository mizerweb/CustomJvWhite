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
final class LZ4JavaUnsafeFastDecompressor extends LZ4FastDecompressor {
    public static final LZ4FastDecompressor INSTANCE = new LZ4JavaUnsafeFastDecompressor();

    @Override // net.jpountz.lz4.LZ4FastDecompressor
    public int decompress(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3) {
        int i4;
        byte bE;
        int i5;
        byte bE2;
        if (byteBuffer.hasArray() && byteBuffer2.hasArray()) {
            return decompress(byteBuffer.array(), i + byteBuffer.arrayOffset(), byteBuffer2.array(), i2 + byteBuffer2.arrayOffset(), i3);
        }
        ByteBuffer byteBufferD = s61.d(byteBuffer);
        ByteBuffer byteBufferD2 = s61.d(byteBuffer2);
        s61.a(i, byteBufferD);
        s61.b(byteBufferD2, i2, i3);
        if (i3 == 0) {
            if (s61.e(i, byteBufferD) == 0) {
                return 1;
            }
            qr7.s(zo5.h(i, "Malformed input at "));
            return 0;
        }
        int i6 = i3 + i2;
        int i7 = i;
        int i8 = i2;
        while (true) {
            byte bE3 = s61.e(i7, byteBufferD);
            int i9 = i7 + 1;
            int i10 = (bE3 & 255) >>> 4;
            if (i10 == 15) {
                while (true) {
                    i5 = i9 + 1;
                    bE2 = s61.e(i9, byteBufferD);
                    if (bE2 != -1) {
                        break;
                    }
                    i10 += 255;
                    i9 = i5;
                }
                i10 += bE2 & 255;
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
            int i15 = bE3 & 15;
            if (i15 == 15) {
                while (true) {
                    i4 = i7 + 1;
                    bE = s61.e(i7, byteBufferD);
                    if (bE != -1) {
                        break;
                    }
                    i15 += 255;
                    i7 = i4;
                }
                i15 += bE & 255;
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
        byte bA;
        int i5;
        byte bA2;
        Unsafe unsafe = mdi.a;
        qye.a(i, bArr);
        qye.b(i2, bArr2, i3);
        int i6 = 0;
        if (i3 == 0) {
            if (mdi.a(i, bArr) == 0) {
                return 1;
            }
            qr7.s(zo5.h(i, "Malformed input at "));
            return 0;
        }
        int i7 = i3 + i2;
        int i8 = i;
        int i9 = i2;
        while (true) {
            byte bA3 = mdi.a(i8, bArr);
            int i10 = i8 + 1;
            int i11 = (bA3 & 255) >>> 4;
            if (i11 == 15) {
                while (true) {
                    i5 = i10 + 1;
                    bA2 = mdi.a(i10, bArr);
                    if (bA2 != -1) {
                        break;
                    }
                    i11 += 255;
                    i10 = i5;
                }
                i11 += bA2 & 255;
                i10 = i5;
            }
            int i12 = i9 + i11;
            int i13 = i7 - 8;
            if (i12 > i13) {
                if (i12 == i7) {
                    LZ4UnsafeUtils.safeArraycopy(bArr, i10, bArr2, i9, i11);
                    return (i10 + i11) - i;
                }
                qr7.s(zo5.h(i10, "Malformed input at "));
                return i6;
            }
            LZ4UnsafeUtils.wildArraycopy(bArr, i10, bArr2, i9, i11);
            int i14 = i10 + i11;
            short sG = mdi.g(i14, bArr);
            int i15 = i6;
            if (wqi.a == ByteOrder.BIG_ENDIAN) {
                sG = Short.reverseBytes(sG);
            }
            i8 = i14 + 2;
            int i16 = i12 - (65535 & sG);
            if (i16 < i2) {
                qr7.s(zo5.h(i8, "Malformed input at "));
                return i15;
            }
            int i17 = bA3 & 15;
            if (i17 == 15) {
                while (true) {
                    i4 = i8 + 1;
                    bA = mdi.a(i8, bArr);
                    if (bA != -1) {
                        break;
                    }
                    i17 += 255;
                    i8 = i4;
                }
                i17 += bA & 255;
                i8 = i4;
            }
            int i18 = i17 + 4;
            int i19 = i12 + i18;
            if (i19 <= i13) {
                LZ4UnsafeUtils.wildIncrementalCopy(bArr2, i16, i12, i19);
            } else if (i19 <= i7) {
                LZ4UnsafeUtils.safeIncrementalCopy(bArr2, i16, i12, i18);
            } else {
                qr7.s(zo5.h(i8, "Malformed input at "));
                return i15;
            }
            i6 = i15;
            i9 = i19;
        }
    }
}
