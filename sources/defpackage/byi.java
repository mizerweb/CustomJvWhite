package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class byi extends ds0 {
    public final e8b c = new e8b(1);
    public final Paint d;
    public final Matrix e;

    public byi() {
        Paint paint = new Paint(1);
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.d = paint;
        this.e = new Matrix();
    }

    @Override // defpackage.ds0, defpackage.qcd
    public final au3 a(Bitmap bitmap, k2d k2dVar) throws IOException {
        int width = bitmap.getWidth() / 2;
        e8b e8bVar = this.c;
        Object objC = e8bVar.c(width);
        Object obj = objC;
        if (objC == null) {
            Path path = new Path();
            path.addCircle(bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f, width, Path.Direction.CW);
            path.setFillType(Path.FillType.INVERSE_WINDING);
            int iA = e8bVar.a(width);
            e8bVar.b[iA] = width;
            e8bVar.c[iA] = path;
            obj = path;
        }
        Path path2 = (Path) obj;
        au3 au3VarC = k2dVar.c(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas((Bitmap) au3VarC.K());
            canvas.drawBitmap(bitmap, this.e, null);
            canvas.drawPath(path2, this.d);
            au3 au3VarClone = au3VarC.clone();
            au3VarC.close();
            return au3VarClone;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                rx8.n(au3VarC, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.ds0, defpackage.qcd
    public final v71 b() {
        return new l6g("CropOutOfCirclePostProcessor");
    }
}
