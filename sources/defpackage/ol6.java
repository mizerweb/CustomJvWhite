package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes2.dex */
public final class ol6 extends Drawable implements Animatable, eph {
    public final n52 a;
    public final Paint b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public final PathInterpolator l;
    public final ValueAnimator m;

    public ol6(n52 n52Var) {
        this.a = n52Var;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(((Number) n52Var.invoke()).intValue());
        this.b = paint;
        this.c = rx8.P(3, new s35(17));
        this.d = rx8.P(3, new s35(18));
        this.e = rx8.P(3, new s35(19));
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 18.354f;
        this.i = 7.606f;
        this.l = new PathInterpolator(qyj.r("M 0.0,0.0 c0.396,0 0,1 1.0,1.0"));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(517L);
        valueAnimatorOfFloat.addUpdateListener(new ak(14, this));
        valueAnimatorOfFloat.setRepeatCount(-1);
        this.m = valueAnimatorOfFloat;
    }

    public final void a(Canvas canvas, Path path, float f, float f2, float f3, float f4) {
        if (f3 <= 0.0f || f2 <= 0.0f) {
            return;
        }
        Paint paint = this.b;
        paint.setAlpha((int) (255.0f * f3));
        canvas.save();
        canvas.translate(f, 12.0f);
        canvas.translate(f4, 0.0f);
        canvas.scale(f2, f2);
        canvas.translate(-f4, 0.0f);
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.width() <= 1 || bounds.height() <= 1) {
            return;
        }
        canvas.save();
        float fMin = Math.min(bounds.width() / 24, bounds.height() / 24);
        canvas.translate(bounds.exactCenterX(), bounds.exactCenterY());
        canvas.scale(fMin, fMin);
        canvas.translate(-12.0f, -12.0f);
        a(canvas, (Path) this.d.getValue(), this.i, 0.33333f, 1.0f, 0.0f);
        a(canvas, (Path) this.c.getValue(), this.h, this.f * 0.33333f, this.g, 0.0f);
        a(canvas, (Path) this.e.getValue(), 17.107f, this.j * 0.33333f, this.k, -14.251f);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.m.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        invalidateSelf();
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.b.setColor(((Number) this.a.invoke()).intValue());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ValueAnimator valueAnimator = this.m;
        if (valueAnimator.isRunning()) {
            return;
        }
        valueAnimator.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.m.cancel();
    }
}
