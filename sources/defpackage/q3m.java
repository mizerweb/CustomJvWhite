package defpackage;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q3m {
    public static final String a = "q3m";

    public static final void a(int i, int i2, int i3, String str, String str2) throws IOException {
        Bitmap bitmapCreateBitmap;
        String str3 = a;
        gm0.m(str3, "convertToJpeg: path=%s", str);
        ylc ylcVarC = c(i, i2, str);
        Bitmap bitmap = (Bitmap) ylcVarC.a;
        boolean zBooleanValue = ((Boolean) ylcVarC.b).booleanValue();
        try {
            if (bitmap.hasAlpha()) {
                gm0.n(str3, "convertToJpeg: flattening alpha channel");
                bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.drawColor(-1);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            } else {
                bitmapCreateBitmap = bitmap;
            }
            g(str2, bitmapCreateBitmap, i3, Bitmap.CompressFormat.JPEG);
            if (!zBooleanValue) {
                try {
                    int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 1);
                    ExifInterface exifInterface = new ExifInterface(str2);
                    exifInterface.setAttribute("Orientation", String.valueOf(attributeInt));
                    exifInterface.saveAttributes();
                } catch (IOException e) {
                    gm0.V(str3, "convertToJpeg: failed to copy orientation", e);
                }
            }
            gm0.n(str3, "convertToJpeg: successfully converted to JPEG");
            if (bitmapCreateBitmap != bitmap) {
                rel.b(bitmapCreateBitmap);
            }
            rel.b(bitmap);
        } catch (Throwable th) {
            rel.b(bitmap);
            throw th;
        }
    }

    public static Bitmap b(String str, Rect rect, int i) {
        String str2 = a;
        je9 je9Var = je9.g;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
        if (bitmapDecodeFile != null) {
            int i2 = rect.left;
            int i3 = rect.top;
            int iWidth = rect.width();
            int iHeight = rect.height();
            int width = bitmapDecodeFile.getWidth();
            int height = bitmapDecodeFile.getHeight();
            StringBuilder sbP = qv1.p("cropImage: sourceWidth=", width, ", sourceHeight=", height, ", x=");
            qt4.x(i2, i3, ", y=", ", width=", sbP);
            sbP.append(iWidth);
            sbP.append(", height=");
            sbP.append(iHeight);
            gm0.n(str2, sbP.toString());
            if (i2 + iWidth <= width && i3 + iHeight <= height) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, i2, i3, iWidth, iHeight);
                if (bitmapCreateBitmap != bitmapDecodeFile) {
                    rel.b(bitmapDecodeFile);
                }
                if (bitmapCreateBitmap.getWidth() >= i && bitmapCreateBitmap.getHeight() >= i) {
                    return bitmapCreateBitmap;
                }
                StringBuilder sbP2 = qv1.p("Crop width: ", bitmapCreateBitmap.getWidth(), " and height: ", bitmapCreateBitmap.getHeight(), " must be >= ");
                sbP2.append(i);
                sbP2.append(". Crop rect: ");
                sbP2.append(rect);
                String string = sbP2.toString();
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    a4c.f(a4cVar, je9Var, str2, string, null, null, 8);
                }
                double d = i;
                int iMax = Math.max((int) Math.ceil(d / ((double) bitmapCreateBitmap.getWidth())), (int) Math.ceil(d / ((double) bitmapCreateBitmap.getHeight())));
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, bitmapCreateBitmap.getWidth() * iMax, bitmapCreateBitmap.getHeight() * iMax, false);
                if (bitmapCreateScaledBitmap != bitmapCreateBitmap) {
                    rel.b(bitmapCreateBitmap);
                }
                return bitmapCreateScaledBitmap;
            }
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                a4c.f(a4cVar2, je9Var, str2, "wrong image crop params", null, null, 8);
                return null;
            }
        } else {
            String strConcat = "cropImage: failed, no file at path ".concat(str);
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null) {
                a4c.f(a4cVar3, je9Var, str2, strConcat, null, null, 8);
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [d88] */
    public static ylc c(final int i, final int i2, String str) throws IOException {
        Bitmap bitmapCreateScaledBitmap;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(new File(str)), new ImageDecoder.OnHeaderDecodedListener() { // from class: d88
                    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                        int i3 = i;
                        int i4 = i2;
                        float width = imageInfo.getSize().getWidth();
                        float height = imageInfo.getSize().getHeight();
                        float fMin = Math.min(i3 / width, Math.min(i4 / height, 1.0f));
                        if (fMin < 1.0f) {
                            imageDecoder.setTargetSize(gm0.K(width * fMin), gm0.K(height * fMin));
                        }
                        imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
                        imageDecoder.setAllocator(1);
                    }
                });
                gm0.n("q3m", "decodeScaled: decoded with ImageDecoder");
                return new ylc(bitmapDecodeBitmap, Boolean.TRUE);
            } catch (IOException e) {
                gm0.V("q3m", "decodeScaled: ImageDecoder failed, trying BitmapFactory", e);
            }
        }
        Point pointD = d(str, false);
        float fMin = Math.min(i / pointD.x, Math.min(i2 / pointD.y, 1.0f));
        if (fMin >= 1.0f) {
            bitmapCreateScaledBitmap = BitmapFactory.decodeFile(str, new BitmapFactory.Options());
            if (bitmapCreateScaledBitmap == null) {
                qr7.k("Cannot decode image: ".concat(str));
                return null;
            }
        } else {
            int iK = gm0.K(pointD.x * fMin);
            int iK2 = gm0.K(pointD.y * fMin);
            int i3 = 1;
            while (true) {
                int i4 = i3 * 2;
                if (pointD.x / i4 < iK || pointD.y / i4 < iK2) {
                    break;
                }
                i3 = i4;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = i3;
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
            if (bitmapDecodeFile == null) {
                qr7.k("Cannot decode image: ".concat(str));
                return null;
            }
            gm0.n("q3m", "decodeWithBitmapFactory: decoded with BitmapFactory");
            if (bitmapDecodeFile.getWidth() == iK && bitmapDecodeFile.getHeight() == iK2) {
                bitmapCreateScaledBitmap = bitmapDecodeFile;
            } else {
                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeFile, iK, iK2, true);
                if (bitmapCreateScaledBitmap != bitmapDecodeFile) {
                    rel.b(bitmapDecodeFile);
                }
            }
        }
        return new ylc(bitmapCreateScaledBitmap, Boolean.FALSE);
    }

    public static final Point d(String str, boolean z) {
        int attributeInt;
        if (z) {
            try {
                attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 1);
            } catch (IOException unused) {
                attributeInt = 1;
            }
        } else {
            attributeInt = 1;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        Point point = new Point(options.outWidth, options.outHeight);
        return (attributeInt == 6 || attributeInt == 8) ? new Point(point.y, point.x) : point;
    }

    public static final String e(kwi kwiVar) {
        String str = kwiVar.a;
        if (str != null) {
            return str;
        }
        return kwiVar.e + "x" + kwiVar.f;
    }

    public static final boolean f(ContentResolver contentResolver, Uri uri) {
        boolean zHasAlpha;
        try {
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = 4;
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                    if (bitmapDecodeStream == null) {
                        zHasAlpha = false;
                    } else {
                        zHasAlpha = bitmapDecodeStream.hasAlpha();
                        rel.b(bitmapDecodeStream);
                    }
                    inputStreamOpenInputStream.close();
                    return zHasAlpha;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        rx8.n(inputStreamOpenInputStream, th);
                        throw th2;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static final void g(String str, Bitmap bitmap, int i, Bitmap.CompressFormat compressFormat) {
        String str2 = a;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            try {
                bitmap.compress(compressFormat, i, fileOutputStream);
                gm0.m(str2, "save bitmap success! %s", str);
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    rx8.n(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (IOException e) {
            gm0.V(str2, "save bitmap failure!", e);
            throw e;
        }
    }
}
