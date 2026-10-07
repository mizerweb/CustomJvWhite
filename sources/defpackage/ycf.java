package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class ycf extends Drawable implements eph {
    public static final int[] q = {-3784469, -15109633, -16728348, -15109633, -3784469};
    public final float a;
    public final float b;
    public int c;
    public int d;
    public int e;
    public final float f;
    public float g;
    public float h;
    public SweepGradient i;
    public final Matrix j;
    public int k;
    public int l;
    public final Paint m;
    public final RectF n;
    public float o;
    public ValueAnimator p;

    public ycf(Context context) {
        float f = yl5.d().getDisplayMetrics().density * 2.5f;
        float f2 = yl5.d().getDisplayMetrics().density * 5.0f;
        this.a = f;
        this.b = f2;
        this.c = 1;
        this.f = f / 2.0f;
        this.j = new Matrix();
        this.k = ((rac) pq3.j.e(context).m().d().a).b;
        this.l = 255;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAlpha(this.l);
        this.m = paint;
        this.n = new RectF();
    }

    public final void a(boolean z) {
        Paint paint = this.m;
        if (!z) {
            paint.setColor(Color.argb(this.l, Color.red(-16777216), Color.green(-16777216), Color.blue(-16777216)));
            paint.setShader(this.i);
        } else {
            paint.setShader(null);
            int i = this.k;
            paint.setColor(Color.argb(this.l, Color.red(i), Color.green(i), Color.blue(i)));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iD = qt4.D(this.c);
        RectF rectF = this.n;
        Paint paint = this.m;
        if (iD != 0) {
            if (iD != 1) {
                ore.o();
                return;
            } else {
                if (this.o <= 0.0f) {
                    return;
                }
                paint.setColor(lvb.I0(-16777216, this.l / 255.0f));
                paint.setShader(this.i);
                canvas.drawArc(rectF, 270.0f, this.o, false, paint);
                return;
            }
        }
        int i = this.d;
        if (i <= 0) {
            return;
        }
        float f = this.h;
        float f2 = this.g;
        float f3 = f - f2;
        if (f3 <= 0.0f || i <= 1) {
            Rect bounds = getBounds();
            a(this.e > 0);
            canvas.drawCircle(bounds.centerX(), bounds.centerY(), (Math.min(bounds.width(), bounds.height()) / 2.0f) - (this.a / 2.0f), paint);
            return;
        }
        float f4 = f2 / 2.0f;
        int i2 = 0;
        while (i2 < i) {
            float f5 = (i2 * this.h) + 270.0f + f4;
            a(i2 < this.e);
            float f6 = f3;
            canvas.drawArc(rectF, f5, f6, false, paint);
            i2++;
            f3 = f6;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float f = rect.left;
        float f2 = this.f;
        float f3 = f + f2;
        float f4 = rect.top + f2;
        float f5 = rect.right - f2;
        float f6 = rect.bottom - f2;
        RectF rectF = this.n;
        rectF.set(f3, f4, f5, f6);
        this.g = (this.b / ((float) (((double) (Math.min(rectF.width(), rectF.height()) / 2.0f)) * 6.283185307179586d))) * 360.0f;
        float fCenterX = rect.centerX();
        float fCenterY = rect.centerY();
        SweepGradient sweepGradient = new SweepGradient(fCenterX, fCenterY, q, (float[]) null);
        Matrix matrix = this.j;
        matrix.preRotate(10.0f, fCenterX, fCenterY);
        sweepGradient.setLocalMatrix(matrix);
        this.i = sweepGradient;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.k = ((rac) kbcVar.d().a).b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.l = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.m.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
