package androidx.camera.core;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import defpackage.a58;
import defpackage.c;
import defpackage.h78;
import defpackage.j78;
import defpackage.l78;
import defpackage.ls9;
import defpackage.o78;
import defpackage.ore;
import defpackage.qyj;
import defpackage.tvj;
import defpackage.zo5;
import java.nio.ByteBuffer;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ImageProcessingUtil {
    public static int a;

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static void a(l78 l78Var) {
        if (!h(l78Var)) {
            tvj.c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return;
        }
        int width = l78Var.getWidth();
        int height = l78Var.getHeight();
        int iD = l78Var.e0()[0].D();
        int iD2 = l78Var.e0()[1].D();
        int iD3 = l78Var.e0()[2].D();
        int iP = l78Var.e0()[0].P();
        int iP2 = l78Var.e0()[1].P();
        if (nativeShiftPixel(l78Var.e0()[0].getBuffer(), iD, l78Var.e0()[1].getBuffer(), iD2, l78Var.e0()[2].getBuffer(), iD3, iP, iP2, width, height, iP, iP2, iP2) != 0) {
            tvj.c("ImageProcessingUtil", "One pixel shift for YUV failure");
        }
    }

    public static l78 b(ls9 ls9Var, byte[] bArr) {
        qyj.i(ls9Var.e() == 256);
        bArr.getClass();
        Surface surface = ls9Var.getSurface();
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            tvj.c("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        l78 l78VarD = ls9Var.d();
        if (l78VarD == null) {
            tvj.c("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return l78VarD;
    }

    public static Bitmap c(l78 l78Var) {
        if (l78Var.getFormat() != 35) {
            ore.p("Input image format must be YUV_420_888");
            return null;
        }
        int width = l78Var.getWidth();
        int height = l78Var.getHeight();
        int iD = l78Var.e0()[0].D();
        int iD2 = l78Var.e0()[1].D();
        int iD3 = l78Var.e0()[2].D();
        int iP = l78Var.e0()[0].P();
        int iP2 = l78Var.e0()[1].P();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(l78Var.getWidth(), l78Var.getHeight(), Bitmap.Config.ARGB_8888);
        if (nativeConvertAndroid420ToBitmap(l78Var.e0()[0].getBuffer(), iD, l78Var.e0()[1].getBuffer(), iD2, l78Var.e0()[2].getBuffer(), iD3, iP, iP2, bitmapCreateBitmap, bitmapCreateBitmap.getRowBytes(), width, height) == 0) {
            return bitmapCreateBitmap;
        }
        c.i("YUV to RGB conversion failed");
        return null;
    }

    public static a58 d(l78 l78Var, o78 o78Var, ByteBuffer byteBuffer, int i, boolean z) {
        if (!h(l78Var)) {
            tvj.c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!g(i)) {
            tvj.c("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        Surface surface = o78Var.getSurface();
        int width = l78Var.getWidth();
        int height = l78Var.getHeight();
        int iD = l78Var.e0()[0].D();
        int iD2 = l78Var.e0()[1].D();
        int iD3 = l78Var.e0()[2].D();
        int iP = l78Var.e0()[0].P();
        int iP2 = l78Var.e0()[1].P();
        if (nativeConvertAndroid420ToABGR(l78Var.e0()[0].getBuffer(), iD, l78Var.e0()[1].getBuffer(), iD2, l78Var.e0()[2].getBuffer(), iD3, iP, iP2, surface, byteBuffer, width, height, z ? iP : 0, z ? iP2 : 0, z ? iP2 : 0, i) != 0) {
            tvj.c("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Locale locale = Locale.US;
            tvj.a("ImageProcessingUtil", zo5.g(a, System.currentTimeMillis() - jCurrentTimeMillis, "Image processing performance profiling, duration: [", "], image count: "));
            a++;
        }
        l78 l78VarD = o78Var.d();
        if (l78VarD == null) {
            tvj.c("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        a58 a58Var = new a58(l78VarD);
        a58Var.b(new h78(l78VarD, l78Var, 0));
        return a58Var;
    }

    public static void e(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public static void f(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static boolean g(int i) {
        return i == 0 || i == 90 || i == 180 || i == 270;
    }

    public static boolean h(l78 l78Var) {
        return l78Var.getFormat() == 35 && l78Var.e0().length == 3;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    public static a58 i(l78 l78Var, o78 o78Var, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        a58 a58Var;
        if (!h(l78Var)) {
            tvj.c("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (!g(i)) {
            tvj.c("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        if (i > 0) {
            int width = l78Var.getWidth();
            int height = l78Var.getHeight();
            int iD = l78Var.e0()[0].D();
            int iD2 = l78Var.e0()[1].D();
            int iD3 = l78Var.e0()[2].D();
            int iP = l78Var.e0()[1].P();
            Image imageDequeueInputImage = imageWriter.dequeueInputImage();
            if (imageDequeueInputImage == null) {
                a58Var = null;
            } else {
                a58Var = null;
                if (nativeRotateYUV(l78Var.e0()[0].getBuffer(), iD, l78Var.e0()[1].getBuffer(), iD2, l78Var.e0()[2].getBuffer(), iD3, iP, imageDequeueInputImage.getPlanes()[0].getBuffer(), imageDequeueInputImage.getPlanes()[0].getRowStride(), imageDequeueInputImage.getPlanes()[0].getPixelStride(), imageDequeueInputImage.getPlanes()[1].getBuffer(), imageDequeueInputImage.getPlanes()[1].getRowStride(), imageDequeueInputImage.getPlanes()[1].getPixelStride(), imageDequeueInputImage.getPlanes()[2].getBuffer(), imageDequeueInputImage.getPlanes()[2].getRowStride(), imageDequeueInputImage.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i) == 0) {
                    imageWriter.queueInputImage(imageDequeueInputImage);
                    l78 l78VarD = o78Var.d();
                    if (l78VarD == null) {
                        tvj.c("ImageProcessingUtil", "YUV rotation acquireLatestImage failure");
                        return null;
                    }
                    a58 a58Var2 = new a58(l78VarD);
                    a58Var2.b(new h78(l78VarD, l78Var, 1));
                    return a58Var2;
                }
            }
        } else {
            a58Var = null;
        }
        tvj.c("ImageProcessingUtil", "rotate YUV failure");
        return a58Var;
    }

    public static a58 j(l78 l78Var, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, int i) {
        if (!h(l78Var)) {
            tvj.c("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (!g(i)) {
            tvj.c("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        if (i == 0 && l78Var.e0().length == 3 && l78Var.e0()[1].P() == 2 && nativeGetYUVImageVUOff(l78Var.e0()[2].getBuffer(), l78Var.e0()[1].getBuffer()) == -1) {
            return null;
        }
        int i2 = i % 180;
        int width = i2 == 0 ? l78Var.getWidth() : l78Var.getHeight();
        int height = i2 == 0 ? l78Var.getHeight() : l78Var.getWidth();
        ByteBuffer byteBufferNativeNewDirectByteBuffer = nativeNewDirectByteBuffer(byteBuffer5, 1, byteBuffer5.capacity());
        if (nativeRotateYUV(l78Var.e0()[0].getBuffer(), l78Var.e0()[0].D(), l78Var.e0()[1].getBuffer(), l78Var.e0()[1].D(), l78Var.e0()[2].getBuffer(), l78Var.e0()[2].D(), l78Var.e0()[2].P(), byteBuffer4, width, 1, byteBufferNativeNewDirectByteBuffer, width, 2, byteBuffer5, width, 2, byteBuffer, byteBuffer2, byteBuffer3, l78Var.getWidth(), l78Var.getHeight(), i) == 0) {
            return new a58(new j78(l78Var, byteBuffer4, byteBufferNativeNewDirectByteBuffer, byteBuffer5, width, height));
        }
        tvj.c("ImageProcessingUtil", "rotate YUV failure");
        return null;
    }

    public static void k(byte[] bArr, Surface surface) {
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            tvj.c("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        }
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Surface surface, ByteBuffer byteBuffer4, int i6, int i7, int i8, int i9, int i10, int i11);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Bitmap bitmap, int i6, int i7, int i8);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, boolean z);

    public static native int nativeGetYUVImageVUOff(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    public static native ByteBuffer nativeNewDirectByteBuffer(ByteBuffer byteBuffer, int i, int i2);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, ByteBuffer byteBuffer4, int i5, int i6, ByteBuffer byteBuffer5, int i7, int i8, ByteBuffer byteBuffer6, int i9, int i10, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i11, int i12, int i13);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);
}
