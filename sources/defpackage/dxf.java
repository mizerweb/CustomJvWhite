package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes2.dex */
public final class dxf extends hxf {
    public final fxf c;
    public final float d;
    public final float e;

    public dxf(fxf fxfVar, float f, float f2) {
        this.c = fxfVar;
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.hxf
    public final void a(Matrix matrix, swf swfVar, int i, Canvas canvas) {
        fxf fxfVar = this.c;
        float f = fxfVar.c;
        float f2 = this.e;
        float f3 = fxfVar.b;
        float f4 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        swfVar.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = swfVar.f;
        int[] iArr = swf.i;
        iArr[0] = i2;
        iArr[1] = swfVar.e;
        iArr[2] = swfVar.d;
        Paint paint = swfVar.c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, swf.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        fxf fxfVar = this.c;
        return (float) Math.toDegrees(Math.atan((fxfVar.c - this.e) / (fxfVar.b - this.d)));
    }
}
