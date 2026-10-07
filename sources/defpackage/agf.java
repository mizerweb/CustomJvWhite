package defpackage;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
public final class agf {
    public final bgf a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Path e;
    public final Path f;
    public final Path g;
    public DashPathEffect h;
    public float i;
    public float j;
    public final RectF k;

    public agf(bgf bgfVar) {
        this.a = bgfVar;
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        int i = bgfVar.i;
        paint.setColor(i);
        paint.setShadowLayer(bgfVar.h, 0.0f, 0.0f, bgfVar.j);
        this.b = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(i);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        this.c = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        paint3.setStrokeCap(cap);
        paint3.setColor(i);
        this.d = paint3;
        this.e = new Path();
        this.f = new Path();
        this.g = new Path();
        this.h = new DashPathEffect(new float[]{bgfVar.e, bgfVar.f}, 0.0f);
        this.k = new RectF();
    }

    public final void a(Canvas canvas, RectF rectF, float f) {
        Path path;
        bgf bgfVar = this.a;
        float f2 = bgfVar.b;
        if (f <= 0.0f) {
            return;
        }
        float f3 = 1.0f / f;
        float f4 = bgfVar.d * f3;
        float fMin = Math.min(bgfVar.g * f3, Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
        float f5 = 2.0f * fMin;
        float f6 = this.j;
        Paint paint = this.c;
        Paint paint2 = this.b;
        Path path2 = this.g;
        Path path3 = this.f;
        RectF rectF2 = this.k;
        Paint paint3 = this.d;
        Path path4 = this.e;
        if (f == f6 && rectF.equals(rectF2)) {
            path = path3;
        } else {
            this.j = f;
            rectF2.set(rectF);
            path4.reset();
            path4.addRoundRect(rectF, fMin, fMin, Path.Direction.CW);
            path3.reset();
            path3.moveTo(rectF.left, rectF.top + f4);
            path3.lineTo(rectF.left, rectF.top + fMin);
            float f7 = rectF.left;
            float f8 = rectF.top;
            path3.arcTo(f7, f8, f7 + f5, f8 + f5, 180.0f, 90.0f, false);
            path = path3;
            path.lineTo(rectF.left + f4, rectF.top);
            path2.reset();
            path2.moveTo(rectF.right, rectF.bottom - f4);
            path2.lineTo(rectF.right, rectF.bottom - fMin);
            float f9 = rectF.right;
            float f10 = rectF.bottom;
            path2.arcTo(f9 - f5, f10 - f5, f9, f10, 0.0f, 90.0f, false);
            path2.lineTo(rectF.right - f4, rectF.bottom);
            paint2.setStrokeWidth(f2 * f3);
            paint2.setShadowLayer(bgfVar.h * f3, 0.0f, 0.0f, bgfVar.j);
            paint.setStrokeWidth(f2 * f3);
            paint3.setStrokeWidth(bgfVar.c * f3);
            if (this.i != f3) {
                this.i = f3;
                this.h = new DashPathEffect(new float[]{bgfVar.e * f3, bgfVar.f * f3}, 0.0f);
            }
            paint2.setPathEffect(this.h);
            paint.setPathEffect(this.h);
        }
        canvas.drawPath(path4, paint2);
        canvas.drawPath(path4, paint);
        canvas.drawPath(path, paint3);
        canvas.drawPath(path2, paint3);
    }
}
