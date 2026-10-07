package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Build;
import android.util.Rational;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.internal.utils.ImageUtil$CodecFailedException;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f3m {
    public static Bitmap a(l78 l78Var) {
        int format = l78Var.getFormat();
        if (format == 1) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(l78Var.getWidth(), l78Var.getHeight(), Bitmap.Config.ARGB_8888);
            l78Var.e0()[0].getBuffer().rewind();
            ImageProcessingUtil.f(bitmapCreateBitmap, l78Var.e0()[0].getBuffer(), l78Var.e0()[0].D());
            return bitmapCreateBitmap;
        }
        if (format == 35) {
            return ImageProcessingUtil.c(l78Var);
        }
        if (format != 256 && format != 4101) {
            c.d(l78Var.getFormat(), ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported", "Incorrect image format of the input image proxy: ");
            return null;
        }
        if (!d(l78Var.getFormat())) {
            qr7.p(l78Var.getFormat(), "Incorrect image format of the input image proxy: ");
            return null;
        }
        ByteBuffer buffer = l78Var.e0()[0].getBuffer();
        int iCapacity = buffer.capacity();
        byte[] bArr = new byte[iCapacity];
        buffer.rewind();
        buffer.get(bArr);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iCapacity, null);
        if (bitmapDecodeByteArray != null) {
            return bitmapDecodeByteArray;
        }
        c.i("Decode jpeg byte array failed");
        return null;
    }

    public static Rational b(int i, Rational rational) {
        if (i == 90 || i == 270) {
            return rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator());
        }
        return new Rational(rational.getNumerator(), rational.getDenominator());
    }

    public static long c(int i) {
        return ((long) i) & 4294967295L;
    }

    public static boolean d(int i) {
        return i == 256 || i == 4101;
    }

    public static byte[] e(l78 l78Var, Rect rect, int i, int i2) {
        if (l78Var.getFormat() != 35) {
            qr7.p(l78Var.getFormat(), "Incorrect image format of the input image proxy: ");
            return null;
        }
        k78 k78Var = l78Var.e0()[0];
        k78 k78Var2 = l78Var.e0()[1];
        int i3 = 2;
        k78 k78Var3 = l78Var.e0()[2];
        ByteBuffer buffer = k78Var.getBuffer();
        ByteBuffer buffer2 = k78Var2.getBuffer();
        ByteBuffer buffer3 = k78Var3.getBuffer();
        buffer.rewind();
        buffer2.rewind();
        buffer3.rewind();
        int iRemaining = buffer.remaining();
        byte[] bArr = new byte[((l78Var.getHeight() * l78Var.getWidth()) / 2) + iRemaining];
        int width = 0;
        for (int i4 = 0; i4 < l78Var.getHeight(); i4++) {
            buffer.get(bArr, width, l78Var.getWidth());
            width += l78Var.getWidth();
            buffer.position(Math.min(iRemaining, k78Var.D() + (buffer.position() - l78Var.getWidth())));
        }
        int height = l78Var.getHeight() / 2;
        int width2 = l78Var.getWidth() / 2;
        int iD = k78Var3.D();
        int iD2 = k78Var2.D();
        int iP = k78Var3.P();
        int iP2 = k78Var2.P();
        byte[] bArr2 = new byte[iD];
        byte[] bArr3 = new byte[iD2];
        int i5 = 0;
        while (i5 < height) {
            int i6 = i3;
            buffer3.get(bArr2, 0, Math.min(iD, buffer3.remaining()));
            buffer2.get(bArr3, 0, Math.min(iD2, buffer2.remaining()));
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < width2; i9++) {
                int i10 = width + 1;
                bArr[width] = bArr2[i7];
                width += 2;
                bArr[i10] = bArr3[i8];
                i7 += iP;
                i8 += iP2;
            }
            i5++;
            i3 = i6;
        }
        int i11 = i3;
        YuvImage yuvImage = new YuvImage(bArr, 17, l78Var.getWidth(), l78Var.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ue6[] ue6VarArr = le6.c;
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        ke6 ke6Var = new ke6();
        String strValueOf = String.valueOf(1);
        ArrayList arrayList = ke6Var.a;
        ke6Var.c("Orientation", strValueOf, arrayList);
        ke6Var.c("XResolution", "72/1", arrayList);
        ke6Var.c("YResolution", "72/1", arrayList);
        ke6Var.c("ResolutionUnit", String.valueOf(i11), arrayList);
        ke6Var.c("YCbCrPositioning", String.valueOf(1), arrayList);
        ke6Var.c("Make", Build.MANUFACTURER, arrayList);
        ke6Var.c("Model", Build.MODEL, arrayList);
        if (l78Var.getImageInfo() != null) {
            l78Var.getImageInfo().a(ke6Var);
        }
        ke6Var.d(i2);
        ke6Var.c("ImageWidth", String.valueOf(l78Var.getWidth()), arrayList);
        ke6Var.c("ImageLength", String.valueOf(l78Var.getHeight()), arrayList);
        ArrayList list = Collections.list(new je6(ke6Var));
        if (!((Map) list.get(1)).isEmpty()) {
            ke6Var.b("ExposureProgram", String.valueOf(0), list);
            ke6Var.b("ExifVersion", "0230", list);
            ke6Var.b("ComponentsConfiguration", le6.f, list);
            ke6Var.b("MeteringMode", String.valueOf(0), list);
            ke6Var.b("LightSource", String.valueOf(0), list);
            ke6Var.b("FlashpixVersion", "0100", list);
            ke6Var.b("FocalPlaneResolutionUnit", String.valueOf(i11), list);
            ke6Var.b("FileSource", String.valueOf(3), list);
            ke6Var.b("SceneType", String.valueOf(1), list);
            ke6Var.b("CustomRendered", String.valueOf(0), list);
            ke6Var.b("SceneCaptureType", String.valueOf(0), list);
            ke6Var.b("Contrast", String.valueOf(0), list);
            ke6Var.b("Saturation", String.valueOf(0), list);
            ke6Var.b("Sharpness", String.valueOf(0), list);
        }
        if (!((Map) list.get(i11)).isEmpty()) {
            ke6Var.b("GPSVersionID", "2300", list);
            ke6Var.b("GPSSpeedRef", "K", list);
            ke6Var.b("GPSTrackRef", "T", list);
            ke6Var.b("GPSImgDirectionRef", "T", list);
            ke6Var.b("GPSDestBearingRef", "T", list);
            ke6Var.b("GPSDestDistanceRef", "K", list);
        }
        if (yuvImage.compressToJpeg(rect == null ? new Rect(0, 0, l78Var.getWidth(), l78Var.getHeight()) : rect, i, new te6(byteArrayOutputStream, new le6(ke6Var.b, list)))) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new ImageUtil$CodecFailedException("YuvImage failed to encode jpeg.");
    }
}
