package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class oy0 {
    public static final ifh a = new ifh(new b6(18));

    public static final qg7 a(InputStream inputStream) {
        if (inputStream == null) {
            ore.k("Required value was null.");
            return null;
        }
        ifh ifhVar = a;
        ByteBuffer byteBufferAllocate = (ByteBuffer) ((sbd) ifhVar.getValue()).a();
        if (byteBufferAllocate == null) {
            int i = k55.a;
            byteBufferAllocate = ByteBuffer.allocate(16384);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = byteBufferAllocate.array();
            BitmapFactory.decodeStream(inputStream, null, options);
            return new qg7(options.outWidth, options.outHeight, options.outColorSpace);
        } finally {
            ((sbd) ifhVar.getValue()).d(byteBufferAllocate);
        }
    }

    public static final int b(Bitmap.Config config) {
        switch (config == null ? -1 : ny0.$EnumSwitchMapping$0[config.ordinal()]) {
            case 1:
                return 4;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 8;
            case 6:
            case 7:
                return 4;
            default:
                c.i("The provided Bitmap.Config is not supported");
                return 0;
        }
    }

    public static final int c(int i, int i2, Bitmap.Config config) {
        if (i <= 0) {
            c.o(zo5.h(i, "width must be > 0, width is: "));
            return 0;
        }
        if (i2 <= 0) {
            c.o(zo5.h(i2, "height must be > 0, height is: "));
            return 0;
        }
        int iB = b(config);
        int i3 = i * i2 * iB;
        if (i3 > 0) {
            return i3;
        }
        StringBuilder sbP = qv1.p("size must be > 0: size: ", i3, ", width: ", i, ", height: ");
        sbP.append(i2);
        sbP.append(", pixelSize: ");
        sbP.append(iB);
        throw new IllegalStateException(sbP.toString().toString());
    }

    public static final int d(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getByteCount();
        }
    }
}
