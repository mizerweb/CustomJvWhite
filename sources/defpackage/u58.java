package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.renderscript.Type;
import java.lang.reflect.Array;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class u58 {
    public static final AtomicInteger b = new AtomicInteger();
    public static volatile boolean c = false;
    public final ifh a;

    public u58(Context context) {
        this.a = new ifh(new n52(context, 12));
    }

    public static Bitmap c(Bitmap bitmap, int i, boolean z) {
        int i2;
        int i3 = i;
        Bitmap bitmapCopy = z ? bitmap : bitmap.copy(bitmap.getConfig(), true);
        if (i3 < 1) {
            return null;
        }
        int width = bitmapCopy.getWidth();
        int height = bitmapCopy.getHeight();
        int i4 = width * height;
        int[] iArr = new int[i4];
        bitmapCopy.getPixels(iArr, 0, width, 0, 0, width, height);
        int i5 = width - 1;
        int i6 = height - 1;
        int i7 = i3 + i3;
        int i8 = i7 + 1;
        int[] iArr2 = new int[i4];
        int[] iArr3 = new int[i4];
        int[] iArr4 = new int[i4];
        int[] iArr5 = new int[Math.max(width, height)];
        int i9 = (i7 + 2) >> 1;
        int i10 = i9 * i9;
        int i11 = i10 * np0.n;
        int[] iArr6 = new int[i11];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            iArr6[i13] = i13 / i10;
        }
        int[][] iArr7 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i8, 3);
        int i14 = i3 + 1;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i17 < height) {
            int i18 = i17;
            int i19 = -i3;
            int i20 = i12;
            int i21 = i20;
            int i22 = i21;
            int i23 = i22;
            int i24 = i23;
            int i25 = i24;
            int i26 = i25;
            int i27 = i26;
            int i28 = i27;
            while (i19 <= i3) {
                int[] iArr8 = iArr4;
                Bitmap bitmap2 = bitmapCopy;
                int i29 = i12;
                int i30 = iArr[Math.min(i5, Math.max(i19, i29)) + i15];
                int[] iArr9 = iArr7[i19 + i3];
                iArr9[i29] = (i30 & 16711680) >> 16;
                iArr9[1] = (i30 & 65280) >> 8;
                iArr9[2] = i30 & 255;
                int iAbs = i14 - Math.abs(i19);
                int i31 = iArr9[i29];
                int i32 = (i31 * iAbs) + i28;
                i28 = i32 >= i11 ? i11 : i32;
                int i33 = iArr9[1];
                int i34 = i19;
                int i35 = (i33 * iAbs) + i20;
                i20 = i35 >= i11 ? i11 : i35;
                int i36 = iArr9[2];
                int i37 = (iAbs * i36) + i21;
                i21 = i37 >= i11 ? i11 : i37;
                if (i34 > 0) {
                    i25 += i31;
                    i26 += i33;
                    i27 += i36;
                } else {
                    i22 += i31;
                    i23 += i33;
                    i24 += i36;
                }
                i19 = i34 + 1;
                iArr4 = iArr8;
                bitmapCopy = bitmap2;
                i12 = 0;
            }
            int[] iArr10 = iArr4;
            Bitmap bitmap3 = bitmapCopy;
            int i38 = i3;
            int i39 = 0;
            while (i39 < width) {
                iArr2[i15] = iArr6[i28];
                iArr3[i15] = iArr6[i20];
                iArr10[i15] = iArr6[i21];
                int i40 = i28 - i22;
                int i41 = i20 - i23;
                int i42 = i21 - i24;
                int[] iArr11 = iArr7[((i38 - i3) + i8) % i8];
                int i43 = i22 - iArr11[0];
                int i44 = i23 - iArr11[1];
                int i45 = i24 - iArr11[2];
                if (i18 == 0) {
                    i2 = i39;
                    iArr5[i2] = Math.min(i39 + i3 + 1, i5);
                } else {
                    i2 = i39;
                }
                int i46 = iArr[i16 + iArr5[i2]];
                int i47 = (i46 & 16711680) >> 16;
                iArr11[0] = i47;
                int i48 = (i46 & 65280) >> 8;
                iArr11[1] = i48;
                int i49 = i46 & 255;
                iArr11[2] = i49;
                int i50 = i25 + i47;
                int i51 = i26 + i48;
                int i52 = i27 + i49;
                i28 = i40 + i50;
                i20 = i41 + i51;
                i21 = i42 + i52;
                i38 = (i38 + 1) % i8;
                int[] iArr12 = iArr7[i38 % i8];
                int i53 = iArr12[0];
                i22 = i43 + i53;
                int i54 = iArr12[1];
                i23 = i44 + i54;
                int i55 = iArr12[2];
                i24 = i45 + i55;
                i25 = i50 - i53;
                i26 = i51 - i54;
                i27 = i52 - i55;
                i15++;
                i39 = i2 + 1;
            }
            i16 += width;
            i17 = i18 + 1;
            iArr4 = iArr10;
            bitmapCopy = bitmap3;
            i12 = 0;
        }
        int[] iArr13 = iArr4;
        Bitmap bitmap4 = bitmapCopy;
        int i56 = 0;
        while (i56 < width) {
            int i57 = -i3;
            int i58 = i56;
            int i59 = i57 * width;
            int i60 = 0;
            int i61 = 0;
            int i62 = 0;
            int i63 = 0;
            int i64 = 0;
            int i65 = 0;
            int i66 = 0;
            int i67 = 0;
            int i68 = 0;
            while (i57 <= i3) {
                int iMax = Math.max(0, i59) + i58;
                int[] iArr14 = iArr7[i57 + i];
                iArr14[0] = iArr2[iMax];
                iArr14[1] = iArr3[iMax];
                iArr14[2] = iArr13[iMax];
                int iAbs2 = i14 - Math.abs(i57);
                i68 = (iArr2[iMax] * iAbs2) + i68;
                i60 = (iArr3[iMax] * iAbs2) + i60;
                i61 = (iArr13[iMax] * iAbs2) + i61;
                if (i57 > 0) {
                    i65 += iArr14[0];
                    i66 += iArr14[1];
                    i67 += iArr14[2];
                } else {
                    i62 += iArr14[0];
                    i63 += iArr14[1];
                    i64 += iArr14[2];
                }
                if (i57 < i6) {
                    i59 += width;
                }
                i57++;
                i3 = i;
            }
            int i69 = i68;
            int i70 = i58;
            int i71 = i;
            for (int i72 = 0; i72 < height; i72++) {
                iArr[i70] = (iArr[i70] & (-16777216)) | (iArr6[i69] << 16) | (iArr6[i60] << 8) | iArr6[i61];
                int i73 = i69 - i62;
                int i74 = i60 - i63;
                int i75 = i61 - i64;
                int[] iArr15 = iArr7[((i71 - i) + i8) % i8];
                int i76 = i62 - iArr15[0];
                int i77 = i63 - iArr15[1];
                int i78 = i64 - iArr15[2];
                int i79 = i70;
                if (i58 == 0) {
                    iArr5[i72] = Math.min(i72 + i14, i6) * width;
                }
                int i80 = i58 + iArr5[i72];
                int i81 = iArr2[i80];
                iArr15[0] = i81;
                int i82 = iArr3[i80];
                iArr15[1] = i82;
                int i83 = iArr13[i80];
                iArr15[2] = i83;
                int i84 = i65 + i81;
                int i85 = i66 + i82;
                int i86 = i67 + i83;
                i69 = i73 + i84;
                i60 = i74 + i85;
                i61 = i75 + i86;
                i71 = (i71 + 1) % i8;
                int[] iArr16 = iArr7[i71];
                int i87 = iArr16[0];
                i62 = i76 + i87;
                int i88 = iArr16[1];
                i63 = i77 + i88;
                int i89 = iArr16[2];
                i64 = i78 + i89;
                i65 = i84 - i87;
                i66 = i85 - i88;
                i67 = i86 - i89;
                i70 = i79 + width;
            }
            i56 = i58 + 1;
            i3 = i;
        }
        bitmap4.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmap4;
    }

    public final Bitmap a(Bitmap bitmap, int i, boolean z) {
        int iMin = Math.min(25, Math.max(1, i));
        if (c) {
            return c(bitmap, iMin, z);
        }
        try {
            return b.incrementAndGet() == 2 ? b(bitmap, iMin, z) : d(bitmap, iMin, z);
        } catch (Throwable th) {
            gm0.V("u58", "blur: failed to blur image with renderscript, try with old blur", th);
            if (th instanceof OutOfMemoryError) {
                throw th;
            }
            return c(bitmap, iMin, z);
        }
    }

    public final Bitmap b(Bitmap bitmap, int i, boolean z) throws Throwable {
        long jNanoTime = System.nanoTime();
        Bitmap bitmapC = c(bitmap, i, z);
        long jAbs = Math.abs(System.nanoTime() - jNanoTime);
        gm0.m("u58", "checkRsSpeedAndForceOldBlur: time for old blur %d, tempWidth=%d", Long.valueOf(jAbs), Integer.valueOf(bitmapC.getWidth()));
        long jNanoTime2 = System.nanoTime();
        Bitmap bitmapD = d(bitmap, i, z);
        long jAbs2 = Math.abs(System.nanoTime() - jNanoTime2);
        gm0.m("u58", "checkRsSpeedAndForceOldBlur: time for rs blur %d", Long.valueOf(jAbs2));
        if (jAbs2 > jAbs * 3) {
            c = true;
        }
        return bitmapD;
    }

    public final Bitmap d(Bitmap bitmap, int i, boolean z) throws Throwable {
        ScriptIntrinsicBlur scriptIntrinsicBlur;
        Type type;
        Allocation allocationCreateTyped;
        if (!z) {
            bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        }
        Allocation allocation = null;
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = null;
        try {
            RenderScript renderScript = (RenderScript) this.a.getValue();
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScript, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
            try {
                type = allocationCreateFromBitmap.getType();
                try {
                    allocationCreateTyped = Allocation.createTyped(renderScript, type);
                    try {
                        scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
                        scriptIntrinsicBlurCreate.setRadius(i);
                        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                        scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
                        allocationCreateTyped.copyTo(bitmap);
                        try {
                            allocationCreateFromBitmap.destroy();
                        } catch (Exception unused) {
                        }
                        try {
                            allocationCreateTyped.destroy();
                        } catch (Exception unused2) {
                        }
                        try {
                            scriptIntrinsicBlurCreate.destroy();
                        } catch (Exception unused3) {
                        }
                        if (type != null) {
                            try {
                                type.destroy();
                            } catch (Exception unused4) {
                            }
                        }
                        return bitmap;
                    } catch (Throwable th) {
                        th = th;
                        scriptIntrinsicBlur = scriptIntrinsicBlurCreate;
                        allocation = allocationCreateFromBitmap;
                        if (allocation != null) {
                            try {
                                allocation.destroy();
                            } catch (Exception unused5) {
                            }
                        }
                        if (allocationCreateTyped != null) {
                            try {
                                allocationCreateTyped.destroy();
                            } catch (Exception unused6) {
                            }
                        }
                        if (scriptIntrinsicBlur != null) {
                            try {
                                scriptIntrinsicBlur.destroy();
                            } catch (Exception unused7) {
                            }
                        }
                        if (type == null) {
                            throw th;
                        }
                        try {
                            type.destroy();
                            throw th;
                        } catch (Exception unused8) {
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    scriptIntrinsicBlur = null;
                    allocationCreateTyped = null;
                }
            } catch (Throwable th3) {
                th = th3;
                scriptIntrinsicBlur = null;
                type = null;
                allocationCreateTyped = null;
            }
        } catch (Throwable th4) {
            th = th4;
            scriptIntrinsicBlur = null;
            type = null;
            allocationCreateTyped = null;
        }
    }
}
