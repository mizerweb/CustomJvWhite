package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r1j extends Drawable implements Animatable, eph {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public float d;
    public final Path e;
    public final PathMeasure f;
    public final Path g;
    public final rv h;
    public float i;
    public final ValueAnimator j;

    public r1j() {
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        this.a = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        this.b = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(Paint.Style.FILL);
        this.c = paint3;
        this.d = 1.0f;
        this.e = new Path();
        this.f = new PathMeasure();
        this.g = new Path();
        this.h = new rv(0.0f, 0.0f, 0.0f, 0.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 2000.0f);
        valueAnimatorOfFloat.setDuration(2000L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new xcf(8, this));
        this.j = valueAnimatorOfFloat;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        rv rvVar;
        long jA;
        canvas.drawPath(this.e, this.a);
        float f = this.i;
        int size = s1j.b.size() - 1;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                rvVar = (rv) ww3.B1(s1j.b);
                break;
            }
            List list = s1j.b;
            rv rvVar2 = (rv) list.get(i2);
            i2++;
            rv rvVar3 = (rv) list.get(i2);
            float f2 = rvVar2.a;
            float f3 = rvVar3.a;
            if (f <= f3 && f2 <= f) {
                float fB = tqk.b(f2, f3, f);
                rvVar = this.h;
                rvVar.a = f;
                rvVar.b = tqk.c(rvVar2.b, rvVar3.b, fB);
                rvVar.c = tqk.c(rvVar2.c, rvVar3.c, fB);
                rvVar.d = tqk.c(rvVar2.d, rvVar3.d, fB);
                break;
            }
        }
        Path path = this.g;
        path.reset();
        PathMeasure pathMeasure = this.f;
        pathMeasure.getSegment(pathMeasure.getLength() * rvVar.b, pathMeasure.getLength() * rvVar.c, path, true);
        float f4 = rvVar.d - 90.0f;
        float fCenterX = getBounds().centerX();
        float fCenterY = getBounds().centerY();
        int iSave = canvas.save();
        canvas.rotate(f4, fCenterX, fCenterY);
        try {
            canvas.drawPath(path, this.b);
            canvas.restoreToCount(iSave);
            float f5 = this.i;
            int size2 = s1j.a.size() - 1;
            while (true) {
                if (i >= size2) {
                    jA = ((qx6) ww3.B1(s1j.a)).a;
                    break;
                }
                List list2 = s1j.a;
                long j = ((qx6) list2.get(i)).a;
                i++;
                long j2 = ((qx6) list2.get(i)).a;
                int i3 = (int) (j >> 32);
                float fIntBitsToFloat = Float.intBitsToFloat(i3);
                int i4 = (int) (j2 >> 32);
                if (f5 <= Float.intBitsToFloat(i4) && fIntBitsToFloat <= f5) {
                    jA = qx6.a(f5, tqk.c(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), tqk.b(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4), f5)));
                    break;
                }
            }
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jA & 4294967295L));
            float f6 = this.d;
            if (fIntBitsToFloat2 > f6) {
                fIntBitsToFloat2 = f6;
            }
            Paint paint = this.c;
            paint.setAlpha((int) (fIntBitsToFloat2 * 255.0f));
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), (Math.min(getBounds().width(), getBounds().height()) * 0.3125f) / 2.0f, paint);
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.j.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float fMin = Math.min(rect.width(), rect.height());
        float f = 0.125f * fMin;
        this.a.setStrokeWidth(f);
        this.b.setStrokeWidth(f);
        Path path = this.e;
        path.reset();
        path.addCircle(rect.centerX(), rect.centerY(), (fMin - f) / 2.0f, Path.Direction.CW);
        this.f.setPath(path, false);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        int i = kbcVar.getIcon().d;
        this.d = ((i >> 24) & 255) / 255.0f;
        this.a.setColor(tre.I0(i, 0.3f));
        this.b.setColor(i);
        this.c.setColor(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        this.b.setColorFilter(colorFilter);
        this.c.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ValueAnimator valueAnimator = this.j;
        if (valueAnimator.isRunning()) {
            return;
        }
        valueAnimator.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.j.cancel();
    }
}
