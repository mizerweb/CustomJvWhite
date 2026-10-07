package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class hkc extends ds0 {
    public final Uri c;
    public final Context d;

    public hkc(Context context, Uri uri) {
        this.c = uri;
        this.d = context;
    }

    @Override // defpackage.ds0, defpackage.qcd
    public final v71 b() {
        return new l6g(String.valueOf(this.c.hashCode()));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00df  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ds0
    public final void c(Bitmap bitmap) throws Throwable {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        Bitmap bitmapDecodeFile;
        Bitmap bitmapDecodeFileDescriptor;
        Uri uri = this.c;
        ContentResolver contentResolver = this.d.getContentResolver();
        ParcelFileDescriptor parcelFileDescriptor = null;
        try {
            try {
                parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                try {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        FileDescriptor fileDescriptor = parcelFileDescriptorOpenFileDescriptor.getFileDescriptor();
                        int i = sb8.j;
                        int iD = new se6(fileDescriptor).d(1, "Orientation");
                        Point pointB = sb8.B(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor(), iD);
                        parcelFileDescriptorOpenFileDescriptor.close();
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inSampleSize = sb8.F(pointB, np0.q, np0.q);
                        parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                        if (parcelFileDescriptorOpenFileDescriptor == null) {
                            gm0.W("o3m", "getBitmapFromPath: failed to open pfd for decode, uri=%s", hvi.a(uri));
                        } else {
                            bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor(), null, options);
                            parcelFileDescriptorOpenFileDescriptor.close();
                            int iJ = sb8.J(iD);
                            if (iJ == 0) {
                                oxl.c(parcelFileDescriptorOpenFileDescriptor);
                            } else {
                                Matrix matrix = new Matrix();
                                matrix.setRotate(iJ);
                                bitmapDecodeFile = Bitmap.createBitmap(bitmapDecodeFileDescriptor, 0, 0, bitmapDecodeFileDescriptor.getWidth(), bitmapDecodeFileDescriptor.getHeight(), matrix, true);
                                bitmapDecodeFileDescriptor.recycle();
                                oxl.c(parcelFileDescriptorOpenFileDescriptor);
                                bitmapDecodeFileDescriptor = bitmapDecodeFile;
                            }
                        }
                        if (bitmapDecodeFileDescriptor != null) {
                            Canvas canvas = new Canvas(bitmap);
                            float width = bitmap.getWidth() / bitmapDecodeFileDescriptor.getWidth();
                            canvas.scale(width, width);
                            canvas.drawBitmap(bitmapDecodeFileDescriptor, 0.0f, 0.0f, (Paint) null);
                        }
                    }
                    gm0.W("o3m", "getBitmapFromPath: failed to open pfd for orientation, uri=%s", hvi.a(uri));
                } catch (IOException e) {
                    e = e;
                    if (e instanceof FileNotFoundException) {
                        String string = uri.toString();
                        try {
                            if (new File(string).exists()) {
                                bitmapDecodeFile = BitmapFactory.decodeFile(string, new BitmapFactory.Options());
                            } else {
                                gm0.W("o3m", "file by path %s not exists", string);
                                bitmapDecodeFile = null;
                            }
                        } catch (Throwable th) {
                            gm0.V("o3m", "getBitmapFromExternalStorage fail", th);
                        }
                        oxl.c(parcelFileDescriptorOpenFileDescriptor);
                        bitmapDecodeFileDescriptor = bitmapDecodeFile;
                        if (bitmapDecodeFileDescriptor != null) {
                            Canvas canvas2 = new Canvas(bitmap);
                            float width2 = bitmap.getWidth() / bitmapDecodeFileDescriptor.getWidth();
                            canvas2.scale(width2, width2);
                            canvas2.drawBitmap(bitmapDecodeFileDescriptor, 0.0f, 0.0f, (Paint) null);
                        }
                    }
                    gm0.V("o3m", "getBitmapFromPath: failed to get bitmap", e);
                }
            } catch (IOException e2) {
                e = e2;
                parcelFileDescriptorOpenFileDescriptor = null;
            } catch (Throwable th2) {
                th = th2;
                oxl.c(parcelFileDescriptor);
                throw th;
            }
            oxl.c(parcelFileDescriptorOpenFileDescriptor);
            bitmapDecodeFileDescriptor = null;
            if (bitmapDecodeFileDescriptor != null) {
                Canvas canvas3 = new Canvas(bitmap);
                float width3 = bitmap.getWidth() / bitmapDecodeFileDescriptor.getWidth();
                canvas3.scale(width3, width3);
                canvas3.drawBitmap(bitmapDecodeFileDescriptor, 0.0f, 0.0f, (Paint) null);
            }
        } catch (Throwable th3) {
            th = th3;
            parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
            oxl.c(parcelFileDescriptor);
            throw th;
        }
    }
}
