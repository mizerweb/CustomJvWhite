package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.util.Log;
import com.google.mlkit.common.MlKitException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class c68 {
    private static final c68 a = new c68();

    private c68() {
    }

    public static ByteBuffer a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return byteBuffer;
        }
        byteBuffer.rewind();
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        return ByteBuffer.wrap(bArr);
    }

    public static c68 g() {
        return a;
    }

    public static Bitmap k(ByteBuffer byteBuffer, int i, int i2, int i3) throws MlKitException {
        byte[] bArrN = n(l(byteBuffer, true).array(), i, i2);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrN, 0, bArrN.length);
        return m(bitmapDecodeByteArray, i3, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
    }

    public static ByteBuffer l(ByteBuffer byteBuffer, boolean z) {
        int i;
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit / 6;
        ByteBuffer byteBufferAllocate = z ? ByteBuffer.allocate(iLimit) : ByteBuffer.allocateDirect(iLimit);
        int i3 = 0;
        while (true) {
            i = i2 * 4;
            if (i3 >= i) {
                break;
            }
            byteBufferAllocate.put(i3, byteBuffer.get(i3));
            i3++;
        }
        for (int i4 = 0; i4 < i2 + i2; i4++) {
            byteBufferAllocate.put(i + i4, byteBuffer.get((i4 / 2) + ((i4 % 2) * i2) + i));
        }
        return byteBufferAllocate;
    }

    public static Bitmap m(Bitmap bitmap, int i, int i2, int i3) {
        if (i == 0) {
            return Bitmap.createBitmap(bitmap, 0, 0, i2, i3);
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        return Bitmap.createBitmap(bitmap, 0, 0, i2, i3, matrix, true);
    }

    private static byte[] n(byte[] bArr, int i, int i2) throws MlKitException {
        YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, null);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                yuvImage.compressToJpeg(new Rect(0, 0, i, i2), 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        throw th;
                    } catch (Exception unused) {
                        throw th;
                    }
                }
            }
        } catch (IOException e) {
            Log.w("ImageConvertUtils", "Error closing ByteArrayOutputStream");
            throw new MlKitException("Image conversion error from NV21 format", 13, e);
        }
    }

    private static final void o(Image.Plane plane, int i, int i2, byte[] bArr, int i3, int i4) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int rowStride = ((plane.getRowStride() + buffer.limit()) - 1) / plane.getRowStride();
        if (rowStride == 0) {
            return;
        }
        int i5 = i / (i2 / rowStride);
        int rowStride2 = 0;
        for (int i6 = 0; i6 < rowStride; i6++) {
            int pixelStride = rowStride2;
            for (int i7 = 0; i7 < i5; i7++) {
                bArr[i3] = buffer.get(pixelStride);
                i3 += i4;
                pixelStride += plane.getPixelStride();
            }
            rowStride2 += plane.getRowStride();
        }
    }

    public byte[] b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return byteBuffer.array();
        }
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit();
        byte[] bArr = new byte[iLimit];
        byteBuffer.get(bArr, 0, iLimit);
        return bArr;
    }

    public ByteBuffer c(ByteBuffer byteBuffer) {
        yab.s(byteBuffer);
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        ByteBuffer byteBufferAllocateDirect = byteBuffer.isDirect() ? ByteBuffer.allocateDirect(iCapacity) : ByteBuffer.allocate(iCapacity);
        byteBufferAllocateDirect.limit(byteBuffer.limit());
        byteBufferAllocateDirect.put((ByteBuffer) byteBuffer.rewind());
        byteBufferAllocateDirect.position(iPosition);
        byteBuffer.position(iPosition);
        return byteBufferAllocateDirect;
    }

    public Bitmap d(Image image, int i) {
        yab.n("Only JPEG is supported now", image.getFormat() == 256);
        Image.Plane[] planes = image.getPlanes();
        if (planes == null || planes.length != 1) {
            ore.p("Unexpected image format, JPEG should have exactly 1 image plane");
            return null;
        }
        ByteBuffer buffer = planes[0].getBuffer();
        buffer.rewind();
        int iRemaining = buffer.remaining();
        byte[] bArr = new byte[iRemaining];
        buffer.get(bArr);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iRemaining);
        return m(bitmapDecodeByteArray, i, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
    }

    public ByteBuffer e(vg8 vg8Var, boolean z) throws MlKitException {
        int iJ = vg8Var.j();
        if (iJ != -1) {
            if (iJ == 17) {
                if (z) {
                    ByteBuffer byteBufferH = vg8Var.h();
                    yab.s(byteBufferH);
                    return a(byteBufferH);
                }
                ByteBuffer byteBufferH2 = vg8Var.h();
                yab.s(byteBufferH2);
                return byteBufferH2;
            }
            if (iJ == 35) {
                Image.Plane[] planeArrM = vg8Var.m();
                yab.s(planeArrM);
                return j(planeArrM, vg8Var.o(), vg8Var.k());
            }
            if (iJ != 842094169) {
                throw new MlKitException("Unsupported image format", 13);
            }
            ByteBuffer byteBufferH3 = vg8Var.h();
            yab.s(byteBufferH3);
            return l(byteBufferH3, z);
        }
        Bitmap bitmapG = vg8Var.g();
        yab.s(bitmapG);
        if (bitmapG.getConfig() == Bitmap.Config.HARDWARE) {
            bitmapG = bitmapG.copy(Bitmap.Config.ARGB_8888, bitmapG.isMutable());
        }
        Bitmap bitmap = bitmapG;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = width * height;
        int[] iArr = new int[i];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int iCeil = (int) Math.ceil(((double) height) / 2.0d);
        int iCeil2 = ((iCeil + iCeil) * ((int) Math.ceil(((double) width) / 2.0d))) + i;
        ByteBuffer byteBufferAllocate = z ? ByteBuffer.allocate(iCeil2) : ByteBuffer.allocateDirect(iCeil2);
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < height; i4++) {
            int i5 = 0;
            while (i5 < width) {
                int i6 = iArr[i3];
                int i7 = i6 >> 16;
                int i8 = i6 >> 8;
                int i9 = i6 & 255;
                int i10 = i2 + 1;
                int i11 = i7 & 255;
                int i12 = i8 & 255;
                byteBufferAllocate.put(i2, (byte) Math.min(255, ((((i9 * 25) + ((i12 * 129) + (i11 * 66))) + np0.m) >> 8) + 16));
                if (i4 % 2 == 0 && i3 % 2 == 0) {
                    int i13 = ((((i11 * 112) - (i12 * 94)) - (i9 * 18)) + np0.m) >> 8;
                    int i14 = ((((i11 * (-38)) - (i12 * 74)) + (i9 * 112)) + np0.m) >> 8;
                    int i15 = i13 + np0.m;
                    int i16 = i14 + np0.m;
                    int i17 = i + 1;
                    byteBufferAllocate.put(i, (byte) Math.min(255, i15));
                    i += 2;
                    byteBufferAllocate.put(i17, (byte) Math.min(255, i16));
                }
                i3++;
                i5++;
                i2 = i10;
            }
        }
        return byteBufferAllocate;
    }

    public Bitmap f(vg8 vg8Var) throws MlKitException {
        int iJ = vg8Var.j();
        if (iJ == -1) {
            Bitmap bitmapG = vg8Var.g();
            yab.s(bitmapG);
            return m(bitmapG, vg8Var.n(), vg8Var.o(), vg8Var.k());
        }
        if (iJ == 17) {
            ByteBuffer byteBufferH = vg8Var.h();
            yab.s(byteBufferH);
            return i(byteBufferH, vg8Var.o(), vg8Var.k(), vg8Var.n());
        }
        if (iJ == 35) {
            Image.Plane[] planeArrM = vg8Var.m();
            yab.s(planeArrM);
            return i(j(planeArrM, vg8Var.o(), vg8Var.k()), vg8Var.o(), vg8Var.k(), vg8Var.n());
        }
        if (iJ != 842094169) {
            throw new MlKitException("Unsupported image format", 13);
        }
        ByteBuffer byteBufferH2 = vg8Var.h();
        yab.s(byteBufferH2);
        return k(byteBufferH2, vg8Var.o(), vg8Var.k(), vg8Var.n());
    }

    public Bitmap h(vg8 vg8Var) throws MlKitException {
        Bitmap bitmapG = vg8Var.g();
        return bitmapG != null ? m(bitmapG, vg8Var.n(), vg8Var.o(), vg8Var.k()) : f(vg8Var);
    }

    public Bitmap i(ByteBuffer byteBuffer, int i, int i2, int i3) throws MlKitException {
        byte[] bArrN = n(b(byteBuffer), i, i2);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrN, 0, bArrN.length);
        return m(bitmapDecodeByteArray, i3, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
    }

    public ByteBuffer j(Image.Plane[] planeArr, int i, int i2) {
        int i3 = i * i2;
        int i4 = i3 / 4;
        byte[] bArr = new byte[i4 + i4 + i3];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int iPosition = buffer2.position();
        int iLimit = buffer.limit();
        buffer2.position(iPosition + 1);
        buffer.limit(iLimit - 1);
        int i5 = (i3 + i3) / 4;
        boolean z = buffer2.remaining() == i5 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(iPosition);
        buffer.limit(iLimit);
        if (z) {
            planeArr[0].getBuffer().get(bArr, 0, i3);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i3, 1);
            buffer3.get(bArr, i3 + 1, i5 - 1);
        } else {
            o(planeArr[0], i, i2, bArr, 0, 1);
            o(planeArr[1], i, i2, bArr, i3 + 1, 2);
            o(planeArr[2], i, i2, bArr, i3, 2);
        }
        return ByteBuffer.wrap(bArr);
    }
}
