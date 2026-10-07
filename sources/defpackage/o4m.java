package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o4m implements e9j {
    public static void d(Bitmap bitmap, int i) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i2 = i + 1;
        int i3 = i2 + i;
        int[] iArr2 = new int[i3 * np0.n];
        int i4 = 1;
        for (int i5 = 1; i5 < 256; i5++) {
            for (int i6 = 0; i6 < i3; i6++) {
                iArr2[i2] = i5;
                i2++;
            }
        }
        int[] iArr3 = new int[Math.max(width, height)];
        int i7 = 0;
        while (i7 < 3) {
            int i8 = 0;
            while (i8 < height) {
                int i9 = width * i8;
                i8++;
                int i10 = (i8 * width) - i4;
                int i11 = i3 >> 1;
                int i12 = width + i11;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                for (int i17 = -i11; i17 < i12; i17++) {
                    int i18 = i9 + i17;
                    if (i18 < i9) {
                        i18 = i9;
                    } else if (i18 > i10) {
                        i18 = i10;
                    }
                    int i19 = iArr[i18];
                    i13 += (i19 >> 16) & 255;
                    i14 += (i19 >> 8) & 255;
                    i15 += i19 & 255;
                    i16 += i19 >>> 24;
                    if (i17 >= i11) {
                        iArr3[i17 - i11] = (iArr2[i16] << 24) | (iArr2[i13] << 16) | (iArr2[i14] << 8) | iArr2[i15];
                        int i20 = (i17 - (i3 - 1)) + i9;
                        if (i20 < i9) {
                            i20 = i9;
                        } else if (i20 > i10) {
                            i20 = i10;
                        }
                        int i21 = iArr[i20];
                        i13 -= (i21 >> 16) & 255;
                        i14 -= (i21 >> 8) & 255;
                        i15 -= i21 & 255;
                        i16 -= i21 >>> 24;
                    }
                }
                System.arraycopy(iArr3, 0, iArr, i9, width);
                i4 = 1;
            }
            int i22 = 0;
            int i23 = 0;
            while (i23 < width) {
                int i24 = ((height - 1) * width) + i23;
                int i25 = (i3 >> 1) * width;
                int i26 = (i3 - 1) * width;
                int i27 = i23 - i25;
                int i28 = i22;
                int i29 = i28;
                int i30 = i29;
                int i31 = i30;
                int i32 = i31;
                while (i27 <= i24 + i25) {
                    int i33 = iArr[i27 < i23 ? i23 : i27 > i24 ? i24 : i27];
                    int[] iArr4 = iArr3;
                    i28 += (i33 >> 16) & 255;
                    i29 += (i33 >> 8) & 255;
                    i30 += i33 & 255;
                    i31 += i33 >>> 24;
                    if (i27 - i25 >= i23) {
                        iArr4[i32] = (iArr2[i31] << 24) | (iArr2[i28] << 16) | (iArr2[i29] << 8) | iArr2[i30];
                        i32++;
                        int i34 = i27 - i26;
                        if (i34 < i23) {
                            i34 = i23;
                        } else if (i34 > i24) {
                            i34 = i24;
                        }
                        int i35 = iArr[i34];
                        i28 -= (i35 >> 16) & 255;
                        i29 -= (i35 >> 8) & 255;
                        i30 -= i35 & 255;
                        i31 -= i35 >>> 24;
                    }
                    i27 += width;
                    iArr3 = iArr4;
                }
                int[] iArr5 = iArr3;
                int i36 = i23;
                for (int i37 = 0; i37 < height; i37++) {
                    iArr[i36] = iArr5[i37];
                    i36 += width;
                }
                i23++;
                iArr3 = iArr5;
                i22 = 0;
            }
            i7++;
            i4 = 1;
        }
        bitmap.setPixels(iArr, 0, width, 0, 0, width, height);
    }

    @Override // defpackage.e9j
    public void a() {
    }

    @Override // defpackage.e9j
    public void b() {
    }
}
