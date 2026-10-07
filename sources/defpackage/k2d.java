package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public abstract class k2d {
    public static void a(int i, int i2) {
        oc9.j("width must be > 0", i > 0);
        oc9.j("height must be > 0", i2 > 0);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    public final au3 b(Bitmap bitmap, int i, int i2, int i3, int i4, Matrix matrix, boolean z) {
        Bitmap.Config config;
        au3 au3VarC;
        Canvas canvas;
        Paint paint;
        oc9.q(bitmap, "Source bitmap cannot be null");
        oc9.j("x must be >= 0", i >= 0);
        oc9.j("y must be >= 0", i2 >= 0);
        a(i3, i4);
        int i5 = i + i3;
        oc9.j("x + width must be <= bitmap.width()", i5 <= bitmap.getWidth());
        int i6 = i2 + i4;
        oc9.j("y + height must be <= bitmap.height()", i6 <= bitmap.getHeight());
        Rect rect = new Rect(i, i2, i5, i6);
        RectF rectF = new RectF(0.0f, 0.0f, i3, i4);
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        Bitmap.Config config3 = bitmap.getConfig();
        if (config3 == null) {
            config = config2;
        } else {
            int i7 = j2d.a[config3.ordinal()];
            if (i7 == 1) {
                config = Bitmap.Config.RGB_565;
            } else if (i7 != 2) {
                config = config2;
            } else {
                config = Bitmap.Config.ALPHA_8;
            }
        }
        if (matrix == null || matrix.isIdentity()) {
            boolean zHasAlpha = bitmap.hasAlpha();
            a(i3, i4);
            au3VarC = c(i3, i4, config);
            Bitmap bitmap2 = (Bitmap) au3VarC.K();
            bitmap2.setHasAlpha(zHasAlpha);
            if (config == config2 && !zHasAlpha) {
                bitmap2.eraseColor(-16777216);
            }
            Bitmap bitmap3 = (Bitmap) au3VarC.K();
            bitmap3.setDensity(bitmap.getDensity());
            bitmap3.setHasAlpha(bitmap.hasAlpha());
            bitmap3.setPremultiplied(bitmap.isPremultiplied());
            canvas = new Canvas((Bitmap) au3VarC.K());
            paint = null;
        } else {
            boolean zRectStaysRect = matrix.rectStaysRect();
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            int iRound = Math.round(rectF2.width());
            int iRound2 = Math.round(rectF2.height());
            if (!zRectStaysRect) {
                config = config2;
            }
            boolean z2 = !zRectStaysRect || bitmap.hasAlpha();
            a(iRound, iRound2);
            au3VarC = c(iRound, iRound2, config);
            Bitmap bitmap4 = (Bitmap) au3VarC.K();
            bitmap4.setHasAlpha(z2);
            if (config == config2 && !z2) {
                bitmap4.eraseColor(-16777216);
            }
            Bitmap bitmap5 = (Bitmap) au3VarC.K();
            bitmap5.setDensity(bitmap.getDensity());
            bitmap5.setHasAlpha(bitmap.hasAlpha());
            bitmap5.setPremultiplied(bitmap.isPremultiplied());
            canvas = new Canvas((Bitmap) au3VarC.K());
            canvas.translate(-rectF2.left, -rectF2.top);
            canvas.concat(matrix);
            paint = new Paint();
            paint.setFilterBitmap(z);
            if (!zRectStaysRect) {
                paint.setAntiAlias(true);
            }
        }
        canvas.drawBitmap(bitmap, rect, rectF, paint);
        canvas.setBitmap(null);
        return au3VarC;
    }

    public abstract au3 c(int i, int i2, Bitmap.Config config);

    public final au3 d(Bitmap bitmap, int i, int i2, boolean z) {
        a(i, i2);
        Matrix matrix = new Matrix();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        matrix.setScale(i / width, i2 / height);
        return b(bitmap, 0, 0, width, height, matrix, z);
    }
}
