package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class vg8 implements ak9 {
    public static final int i = 17;
    public static final int j = 842094169;
    public static final int k = -1;
    public static final int l = 35;
    private volatile Bitmap a;
    private volatile ByteBuffer b;
    private volatile kqk c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final Matrix h;

    @Retention(RetentionPolicy.CLASS)
    public @interface a {
    }

    private vg8(ByteBuffer byteBuffer, int i2, int i3, int i4, int i5) {
        boolean z;
        if (i5 == 842094169) {
            z = true;
        } else if (i5 == 17) {
            i5 = 17;
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ore.a();
            throw null;
        }
        yab.s(byteBuffer);
        this.b = byteBuffer;
        yab.n("Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.", byteBuffer.limit() > i2 * i3);
        byteBuffer.rewind();
        this.d = i2;
        this.e = i3;
        p(i4);
        this.f = i4;
        this.g = i5;
        this.h = null;
    }

    public static vg8 a(Bitmap bitmap, int i2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        vg8 vg8Var = new vg8(bitmap, i2);
        r(-1, 1, jElapsedRealtime, bitmap.getHeight(), bitmap.getWidth(), bitmap.getAllocationByteCount(), i2);
        return vg8Var;
    }

    public static vg8 b(byte[] bArr, int i2, int i3, int i4, int i5) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        yab.s(bArr);
        vg8 vg8Var = new vg8(ByteBuffer.wrap(bArr), i2, i3, i4, i5);
        r(i5, 2, jElapsedRealtime, i3, i2, bArr.length, i4);
        return vg8Var;
    }

    public static vg8 c(ByteBuffer byteBuffer, int i2, int i3, int i4, int i5) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        vg8 vg8Var = new vg8(byteBuffer, i2, i3, i4, i5);
        r(i5, 3, jElapsedRealtime, i3, i2, byteBuffer.limit(), i4);
        return vg8Var;
    }

    public static vg8 d(Context context, Uri uri) throws IOException {
        yab.t(context, "Please provide a valid Context");
        yab.t(uri, "Please provide a valid imageUri");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap bitmapF = z78.b().f(context.getContentResolver(), uri);
        vg8 vg8Var = new vg8(bitmapF, 0);
        r(-1, 4, jElapsedRealtime, bitmapF.getHeight(), bitmapF.getWidth(), bitmapF.getAllocationByteCount(), 0);
        return vg8Var;
    }

    public static vg8 e(Image image, int i2) {
        return q(image, i2, null);
    }

    public static vg8 f(Image image, int i2, Matrix matrix) {
        yab.n("Only YUV_420_888 is supported now", image.getFormat() == 35);
        return q(image, i2, matrix);
    }

    private static int p(int i2) {
        boolean z = true;
        if (i2 != 0 && i2 != 90 && i2 != 180) {
            if (i2 == 270) {
                i2 = 270;
            } else {
                z = false;
            }
        }
        yab.n("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z);
        return i2;
    }

    private static vg8 q(Image image, int i2, Matrix matrix) {
        Image image2;
        int i3;
        int iLimit;
        vg8 vg8Var;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        yab.t(image, "Please provide a valid image");
        p(i2);
        boolean z = true;
        if (image.getFormat() != 256 && image.getFormat() != 35) {
            z = false;
        }
        yab.n("Only JPEG and YUV_420_888 are supported now", z);
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            iLimit = image.getPlanes()[0].getBuffer().limit();
            image2 = image;
            i3 = i2;
            vg8Var = new vg8(c68.g().d(image, i2), 0);
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            image2 = image;
            i3 = i2;
            vg8 vg8Var2 = new vg8(image2, image.getWidth(), image.getHeight(), i3, matrix);
            iLimit = (image2.getPlanes()[0].getBuffer().limit() * 3) / 2;
            vg8Var = vg8Var2;
        }
        r(image2.getFormat(), 5, jElapsedRealtime, image2.getHeight(), image2.getWidth(), iLimit, i3);
        return vg8Var;
    }

    private static void r(int i2, int i3, long j2, int i4, int i5, int i6, int i7) {
        stl.b().a(new vtl(i2, i3, SystemClock.elapsedRealtime() - j2, i6, i4, i5, i7), yhl.INPUT_IMAGE_CONSTRUCTION);
    }

    public Bitmap g() {
        return this.a;
    }

    public ByteBuffer h() {
        return this.b;
    }

    public Matrix i() {
        return this.h;
    }

    public int j() {
        return this.g;
    }

    public int k() {
        return this.e;
    }

    public Image l() {
        if (this.c == null) {
            return null;
        }
        return this.c.a();
    }

    public Image.Plane[] m() {
        if (this.c == null) {
            return null;
        }
        return this.c.b();
    }

    public int n() {
        return this.f;
    }

    public int o() {
        return this.d;
    }

    private vg8(Image image, int i2, int i3, int i4, Matrix matrix) {
        yab.s(image);
        this.c = new kqk(image);
        this.d = i2;
        this.e = i3;
        p(i4);
        this.f = i4;
        this.g = 35;
        this.h = matrix;
    }

    private vg8(Bitmap bitmap, int i2) {
        yab.s(bitmap);
        this.a = bitmap;
        this.d = bitmap.getWidth();
        this.e = bitmap.getHeight();
        p(i2);
        this.f = i2;
        this.g = -1;
        this.h = null;
    }
}
