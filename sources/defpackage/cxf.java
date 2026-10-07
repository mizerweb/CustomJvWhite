package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes2.dex */
public final class cxf extends hxf {
    public final exf c;

    public cxf(exf exfVar) {
        this.c = exfVar;
    }

    @Override // defpackage.hxf
    public final void a(Matrix matrix, swf swfVar, int i, Canvas canvas) {
        exf exfVar = this.c;
        float f = exfVar.f;
        float f2 = exfVar.g;
        RectF rectF = new RectF(exfVar.b, exfVar.c, exfVar.d, exfVar.e);
        Paint paint = swfVar.b;
        boolean z = f2 < 0.0f;
        Path path = swfVar.g;
        int[] iArr = swf.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = swfVar.f;
            iArr[2] = swfVar.e;
            iArr[3] = swfVar.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = swfVar.d;
            iArr[2] = swfVar.e;
            iArr[3] = swfVar.f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = swf.l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, swfVar.h);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
