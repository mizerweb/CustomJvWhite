package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes2.dex */
public final class sk0 extends zt5 {
    public boolean b;
    public int c;
    public float d;
    public float e;
    public final float f;
    public final Paint g;
    public final RectF h;
    public ValueAnimator i;

    public sk0(tvb tvbVar) {
        super(tvbVar);
        float fK = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
        this.f = fK;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(fK);
        this.g = paint;
        this.h = new RectF();
    }

    public final void a(int i) {
        if (this.c != i) {
            this.c = i;
            invalidateSelf();
        }
    }

    public final void b(boolean z) {
        if (this.b != z) {
            this.b = z;
            float f = z ? 1.0f : 0.0f;
            ValueAnimator valueAnimator = this.i;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.d, f);
            valueAnimatorOfFloat.setDuration(250L);
            valueAnimatorOfFloat.setInterpolator(new PathInterpolator(0.42f, 0.0f, 0.1f, 1.0f));
            valueAnimatorOfFloat.addUpdateListener(new ak(5, this));
            valueAnimatorOfFloat.start();
            this.i = valueAnimatorOfFloat;
        }
    }

    @Override // defpackage.zt5, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fCenterX = getBounds().centerX();
        float fCenterY = getBounds().centerY();
        if (this.d > 0.0f) {
            int i = this.c;
            Paint paint = this.g;
            paint.setColor(i);
            float f = getBounds().left;
            float f2 = this.f;
            float f3 = (f2 / 2.0f) + f;
            float f4 = (f2 / 2.0f) + getBounds().top;
            float f5 = getBounds().right - (f2 / 2.0f);
            float f6 = getBounds().bottom - (f2 / 2.0f);
            RectF rectF = this.h;
            rectF.set(f3, f4, f5, f6);
            float fWidth = rectF.width() / 2.0f;
            canvas.save();
            float f7 = this.d;
            canvas.scale(f7, f7, fCenterX, fCenterY);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), fWidth, paint);
            canvas.restore();
        }
        float f8 = 1.0f - (this.d * 0.11538464f);
        float f9 = (yl5.d().getDisplayMetrics().density * 26.0f) / 2.0f;
        canvas.save();
        float f10 = this.e;
        canvas.translate(f10, f10);
        canvas.scale(f8, f8, f9, f9);
        super.draw(canvas);
        canvas.restore();
    }

    @Override // defpackage.zt5, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float f = yl5.d().getDisplayMetrics().density * 26.0f;
        this.e = (rect.width() - f) / 2.0f;
        Drawable drawable = this.a;
        if (drawable != null) {
            int i = (int) f;
            drawable.setBounds(new Rect(0, 0, i, i));
        }
    }
}
