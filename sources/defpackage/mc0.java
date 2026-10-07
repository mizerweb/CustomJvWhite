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
public final class mc0 extends Drawable implements Animatable, eph {
    public final Paint a;
    public float b;
    public final Path c;
    public final PathMeasure d;
    public final Path e;
    public final PathMeasure f;
    public final Path g;
    public final PathMeasure h;
    public final Path i;
    public final hw8 j;
    public float k;
    public final ValueAnimator l;

    public mc0() {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.a = paint;
        this.b = 1.0f;
        this.c = new Path();
        this.d = new PathMeasure();
        this.e = new Path();
        this.f = new PathMeasure();
        this.g = new Path();
        this.h = new PathMeasure();
        this.i = new Path();
        this.j = new hw8(0.0f, 0.0f, 0.0f, 0.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 2000.0f);
        valueAnimatorOfFloat.setDuration(2000L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ak(3, this));
        this.l = valueAnimatorOfFloat;
    }

    public final void a(Canvas canvas, List list, PathMeasure pathMeasure) {
        hw8 hw8Var;
        float f = this.k;
        int size = list.size() - 1;
        int i = 0;
        while (true) {
            if (i >= size) {
                hw8Var = (hw8) ww3.B1(list);
                break;
            }
            hw8 hw8Var2 = (hw8) list.get(i);
            i++;
            hw8 hw8Var3 = (hw8) list.get(i);
            float f2 = hw8Var2.a;
            float f3 = hw8Var3.a;
            if (f <= f3 && f2 <= f) {
                float fB = tqk.b(f2, f3, f);
                hw8Var = this.j;
                hw8Var.a = f;
                hw8Var.b = tqk.c(hw8Var2.b, hw8Var3.b, fB);
                hw8Var.c = tqk.c(hw8Var2.c, hw8Var3.c, fB);
                hw8Var.d = tqk.c(hw8Var2.d, hw8Var3.d, fB);
                break;
            }
        }
        float f4 = hw8Var.b;
        float f5 = this.b;
        if (f4 > f5) {
            f4 = f5;
        }
        Paint paint = this.a;
        paint.setAlpha((int) (f4 * 255.0f));
        Path path = this.i;
        path.reset();
        pathMeasure.getSegment(pathMeasure.getLength() * hw8Var.c, pathMeasure.getLength() * hw8Var.d, path, true);
        canvas.drawPath(path, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        a(canvas, nc0.a, this.d);
        a(canvas, nc0.b, this.f);
        a(canvas, nc0.c, this.h);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.l.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float fWidth = rect.width();
        float fHeight = rect.height();
        float f = 0.1875f * fWidth;
        this.a.setStrokeWidth(f);
        float f2 = 0.5625f * fHeight;
        float f3 = ((fHeight - f2) / 2.0f) + rect.top;
        float f4 = f2 + f3;
        float f5 = (fWidth - (3.0f * f)) / 4.0f;
        float f6 = (f / 2.0f) + rect.left + f5;
        float f7 = f6 + f5 + f;
        float f8 = f5 + f7 + f;
        Path path = this.c;
        path.reset();
        path.moveTo(f6, f3);
        path.lineTo(f6, f4);
        this.d.setPath(path, false);
        Path path2 = this.e;
        path2.reset();
        path2.moveTo(f7, f3);
        path2.lineTo(f7, f4);
        this.f.setPath(path2, false);
        Path path3 = this.g;
        path3.reset();
        path3.moveTo(f8, f3);
        path3.lineTo(f8, f4);
        this.h.setPath(path3, false);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        int i = kbcVar.getIcon().d;
        this.a.setColor(i);
        this.b = ((i >> 24) & 255) / 255.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.a;
        if (cqk.d(colorFilter, paint.getColorFilter())) {
            return;
        }
        paint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ValueAnimator valueAnimator = this.l;
        if (valueAnimator.isRunning()) {
            return;
        }
        valueAnimator.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.l.cancel();
    }
}
