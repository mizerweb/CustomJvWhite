package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: loaded from: classes3.dex */
public final class vj0 extends cne {
    public vj0(int i, int i2) {
        super(i, i2);
    }

    @Override // defpackage.cne, defpackage.ds0, defpackage.qcd
    public final v71 b() {
        return new l6g(qt4.l("squircle|resize:", this.c, this.d, ","));
    }

    @Override // defpackage.ds0
    public final void c(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        bitmap.setPremultiplied(true);
        yx0 yx0Var = jxf.a;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Canvas canvas = new Canvas(bitmap);
        canvas.drawBitmap(bitmap, jxf.b, null);
        int iMin = Math.min(width, height) / 2;
        Path pathB = jxf.b(iMin, 2.8d);
        Matrix matrix = new Matrix();
        float f = iMin;
        matrix.postTranslate((width / 2.0f) - f, (height / 2.0f) - f);
        pathB.transform(matrix);
        pathB.setFillType(Path.FillType.INVERSE_WINDING);
        canvas.drawPath(pathB, jxf.c);
    }

    @Override // defpackage.cne, defpackage.ds0, defpackage.qcd
    public final String getName() {
        return nbh.u("AvatarAsSquirclePostProcessor(", this.c, ",", this.d, ")");
    }
}
