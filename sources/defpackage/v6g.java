package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public final class v6g implements x78, ogc {
    public boolean a;

    @Override // defpackage.x78
    public String a() {
        return "SimpleImageTranscoder";
    }

    @Override // defpackage.x78
    public boolean b(p76 p76Var, iue iueVar, bne bneVar) {
        if (iueVar == null) {
            iueVar = iue.c;
        }
        return this.a && gm0.p(iueVar, bneVar, p76Var, np0.q) > 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [iue] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v3 */
    @Override // defpackage.x78
    public ww6 c(p76 p76Var, dba dbaVar, iue iueVar, bne bneVar, ColorSpace colorSpace) throws Throwable {
        Bitmap bitmapCreateBitmap;
        Integer num = 85;
        Bitmap bitmap = iueVar == null ? iue.c : iueVar;
        int iP = !this.a ? 1 : gm0.p(bitmap, bneVar, p76Var, np0.q);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = iP;
        if (colorSpace != null) {
            options.inPreferredColorSpace = colorSpace;
        }
        int i = 10;
        byte b = 0;
        int i2 = 2;
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(p76Var.A(), null, options);
            if (bitmapDecodeStream == null) {
                if (pj6.a.h(6)) {
                    pj6.a.e("SimpleImageTranscoder", "Couldn't decode the EncodedImage InputStream ! ");
                }
                return new ww6(i2, i, b);
            }
            Matrix matrixD = as8.d(p76Var, bitmap);
            try {
                if (matrixD != null) {
                    try {
                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrixD, false);
                    } catch (OutOfMemoryError e) {
                        e = e;
                        bitmapCreateBitmap = bitmapDecodeStream;
                        pj6.c("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                        ww6 ww6Var = new ww6(i2, i, b);
                        bitmapCreateBitmap.recycle();
                        bitmapDecodeStream.recycle();
                        return ww6Var;
                    } catch (Throwable th) {
                        th = th;
                        bitmap = bitmapDecodeStream;
                        bitmap.recycle();
                        bitmapDecodeStream.recycle();
                        throw th;
                    }
                } else {
                    bitmapCreateBitmap = bitmapDecodeStream;
                }
                try {
                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, num.intValue(), dbaVar);
                    ww6 ww6Var2 = new ww6(iP > 1 ? 0 : 1, i, b);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return ww6Var2;
                } catch (OutOfMemoryError e2) {
                    e = e2;
                    pj6.c("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    ww6 ww6Var3 = new ww6(i2, i, b);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return ww6Var3;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (OutOfMemoryError e3) {
            pj6.c("SimpleImageTranscoder", "Out-Of-Memory during transcode", e3);
            return new ww6(i2, i, b);
        }
    }

    @Override // defpackage.x78
    public boolean d(i68 i68Var) {
        return i68Var == kb5.k || i68Var == kb5.a;
    }

    public void e(boolean z) {
        if (this.a == z) {
            return;
        }
        this.a = z;
    }
}
