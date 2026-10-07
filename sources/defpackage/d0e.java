package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes2.dex */
public final class d0e extends View {
    public final Paint a;
    public float b;
    public final ValueAnimator c;
    public final RectF d;
    public RectF e;
    public final RectF f;
    public final RectF g;
    public ValueAnimator h;
    public ValueAnimator i;
    public final int j;
    public final int k;
    public boolean l;
    public af7 m;

    public d0e(Context context) {
        super(context, null);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(yl5.d().getDisplayMetrics().density * 4.0f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        a8g a8gVar = pq3.j;
        a8gVar.h(this);
        paint.setColor(-1);
        this.a = paint;
        float f = yl5.d().getDisplayMetrics().density * 182.0f;
        float f2 = yl5.d().getDisplayMetrics().density * 232.0f;
        this.b = f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(1160L);
        valueAnimatorOfFloat.setRepeatMode(2);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setInterpolator(new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f));
        valueAnimatorOfFloat.addUpdateListener(new c0e(this, 0));
        this.c = valueAnimatorOfFloat;
        this.d = new RectF();
        this.f = new RectF();
        this.g = new RectF();
        this.j = -14032810;
        a8gVar.h(this);
        this.k = -1;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.cancel();
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.i;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z = this.l;
        RectF rectF = this.d;
        if (!z || this.e == null) {
            rectF.set((getWidth() - this.b) / 2.0f, (getHeight() - this.b) / 2.0f, (getWidth() + this.b) / 2.0f, (getHeight() + this.b) / 2.0f);
        }
        float fWidth = (((rectF.width() * 0.15f) * 2.0f) / 3.1415927f) * 2.0f;
        RectF rectF2 = this.f;
        rectF2.setEmpty();
        float f = rectF.left;
        float f2 = rectF.top;
        rectF2.set(f, f2, f + fWidth, f2 + fWidth);
        Paint paint = this.a;
        canvas.drawArc(rectF2, 180.0f, 90.0f, false, paint);
        float f3 = rectF.right;
        float f4 = rectF.top;
        rectF2.set(f3 - fWidth, f4, f3, f4 + fWidth);
        canvas.drawArc(rectF2, 270.0f, 90.0f, false, paint);
        float f5 = rectF.right;
        float f6 = rectF.bottom;
        rectF2.set(f5 - fWidth, f6 - fWidth, f5, f6);
        canvas.drawArc(rectF2, 0.0f, 90.0f, false, paint);
        float f7 = rectF.left;
        float f8 = rectF.bottom;
        rectF2.set(f7, f8 - fWidth, fWidth + f7, f8);
        canvas.drawArc(rectF2, 90.0f, 90.0f, false, paint);
    }

    public final void setOnQrAnimationCompleteListener(af7 af7Var) {
        this.m = af7Var;
    }
}
