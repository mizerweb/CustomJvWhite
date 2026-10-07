package defpackage;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.net.Uri;
import android.provider.MediaStore;
import com.google.mlkit.common.MlKitException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class z78 {
    private static final bo7 a = new bo7("MLKitImageUtils", "");
    private static final z78 b = new z78();

    private z78() {
    }

    public static z78 b() {
        return b;
    }

    public m38 a(vg8 vg8Var) throws MlKitException {
        int iJ = vg8Var.j();
        if (iJ == -1) {
            Bitmap bitmapG = vg8Var.g();
            yab.s(bitmapG);
            return new dqb(bitmapG);
        }
        if (iJ != 17) {
            if (iJ == 35) {
                return new dqb(vg8Var.l());
            }
            if (iJ != 842094169) {
                throw new MlKitException(zo5.h(vg8Var.j(), "Unsupported image format: "), 3);
            }
        }
        ByteBuffer byteBufferH = vg8Var.h();
        yab.s(byteBufferH);
        return new dqb(byteBufferH);
    }

    public int c(vg8 vg8Var) {
        return vg8Var.j();
    }

    public int d(vg8 vg8Var) {
        if (vg8Var.j() == -1) {
            Bitmap bitmapG = vg8Var.g();
            yab.s(bitmapG);
            return bitmapG.getAllocationByteCount();
        }
        if (vg8Var.j() == 17 || vg8Var.j() == 842094169) {
            ByteBuffer byteBufferH = vg8Var.h();
            yab.s(byteBufferH);
            return byteBufferH.limit();
        }
        if (vg8Var.j() != 35) {
            return 0;
        }
        Image.Plane[] planeArrM = vg8Var.m();
        yab.s(planeArrM);
        return (planeArrM[0].getBuffer().limit() * 3) / 2;
    }

    public Matrix e(int i, int i2, int i3) {
        if (i3 == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate((-i) / 2.0f, (-i2) / 2.0f);
        matrix.postRotate(i3 * 90);
        int i4 = i3 % 2;
        int i5 = i4 != 0 ? i2 : i;
        if (i4 == 0) {
            i = i2;
        }
        matrix.postTranslate(i5 / 2.0f, i / 2.0f);
        return matrix;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:62:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x008f A[PHI: r4
  0x008f: PHI (r4v3 android.graphics.Matrix) = (r4v0 android.graphics.Matrix), (r4v1 android.graphics.Matrix) binds: [B:38:0x008c, B:47:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x0091 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:62:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0095 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:62:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x009c A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:62:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:62:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a7 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:62:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:62:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b2 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:62:0x0004 }] */
    public final Bitmap f(ContentResolver contentResolver, Uri uri) throws IOException {
        IOException iOException;
        se6 se6Var;
        Matrix matrix;
        Matrix matrix2;
        Bitmap bitmapCreateBitmap;
        try {
            Bitmap bitmap = MediaStore.Images.Media.getBitmap(contentResolver, uri);
            if (bitmap == null) {
                throw new IOException("The image Uri could not be resolved.");
            }
            int iD = 0;
            Matrix matrix3 = null;
            if ("content".equals(uri.getScheme()) || "file".equals(uri.getScheme())) {
                try {
                    InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                    if (inputStreamOpenInputStream != null) {
                        try {
                            se6Var = new se6(inputStreamOpenInputStream);
                        } catch (Throwable th) {
                            try {
                                inputStreamOpenInputStream.close();
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
                    } else {
                        se6Var = null;
                    }
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (IOException e) {
                            iOException = e;
                            a.c("MLKitImageUtils", "failed to open file to read rotation meta data: ".concat(String.valueOf(uri)), iOException);
                        }
                    }
                } catch (IOException e2) {
                    iOException = e2;
                    se6Var = null;
                    a.c("MLKitImageUtils", "failed to open file to read rotation meta data: ".concat(String.valueOf(uri)), iOException);
                    if (se6Var == null) {
                        iD = se6Var.d(1, "Orientation");
                    }
                    matrix = new Matrix();
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    switch (iD) {
                        case 2:
                            matrix3 = new Matrix();
                            matrix3.postScale(-1.0f, 1.0f);
                            matrix2 = matrix3;
                            break;
                        case 3:
                            matrix.postRotate(180.0f);
                            matrix2 = matrix;
                            break;
                        case 4:
                            matrix.postScale(1.0f, -1.0f);
                            matrix2 = matrix;
                            break;
                        case 5:
                            matrix.postRotate(90.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            matrix2 = matrix;
                            break;
                        case 6:
                            matrix.postRotate(90.0f);
                            matrix2 = matrix;
                            break;
                        case 7:
                            matrix.postRotate(-90.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            matrix2 = matrix;
                            break;
                        case 8:
                            matrix.postRotate(-90.0f);
                            matrix2 = matrix;
                            break;
                        default:
                            matrix2 = matrix3;
                            break;
                    }
                    return matrix2 == null ? bitmap : bitmap;
                }
                if (se6Var == null) {
                    iD = se6Var.d(1, "Orientation");
                }
            }
            matrix = new Matrix();
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            switch (iD) {
                case 2:
                    matrix3 = new Matrix();
                    matrix3.postScale(-1.0f, 1.0f);
                    matrix2 = matrix3;
                    break;
                case 3:
                    matrix.postRotate(180.0f);
                    matrix2 = matrix;
                    break;
                case 4:
                    matrix.postScale(1.0f, -1.0f);
                    matrix2 = matrix;
                    break;
                case 5:
                    matrix.postRotate(90.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    matrix2 = matrix;
                    break;
                case 6:
                    matrix.postRotate(90.0f);
                    matrix2 = matrix;
                    break;
                case 7:
                    matrix.postRotate(-90.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    matrix2 = matrix;
                    break;
                case 8:
                    matrix.postRotate(-90.0f);
                    matrix2 = matrix;
                    break;
                default:
                    matrix2 = matrix3;
                    break;
            }
            if (matrix2 == null && bitmap != (bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width2, height2, matrix2, true))) {
                bitmap.recycle();
                return bitmapCreateBitmap;
            }
        } catch (FileNotFoundException e3) {
            a.c("MLKitImageUtils", "Could not open file: ".concat(String.valueOf(uri)), e3);
            throw e3;
        }
    }
}
