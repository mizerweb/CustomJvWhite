package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class c0h extends Drawable implements eph {
    public final Paint a;
    public final Paint b;
    public final Drawable c;
    public final RectF d;
    public float e;
    public ValueAnimator f;

    public c0h(Context context) {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.a = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(gm0.K(3.0f * yl5.d().getDisplayMetrics().density));
        this.b = paint2;
        this.c = wk8.p(context, R.drawable.icon_cross);
        this.d = new RectF();
        onThemeChanged(pq3.j.e(context).m());
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float fCenterX = getBounds().centerX();
        float fCenterY = getBounds().centerY();
        canvas.drawCircle(fCenterX, fCenterY, Math.min(getBounds().width(), getBounds().height()) / 2.0f, this.a);
        Paint paint = this.b;
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        float f = getBounds().left + strokeWidth;
        float f2 = getBounds().top + strokeWidth;
        float f3 = getBounds().right - strokeWidth;
        float f4 = getBounds().bottom - strokeWidth;
        RectF rectF = this.d;
        rectF.set(f, f2, f3, f4);
        float f5 = this.e;
        if (f5 > 0.0f) {
            canvas2 = canvas;
            canvas2.drawArc(rectF, -90.0f, f5, false, paint);
        } else {
            canvas2 = canvas;
        }
        int iK = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        float f6 = iK / 2.0f;
        int i = (int) (fCenterX - f6);
        int i2 = (int) (fCenterY - f6);
        Drawable drawable = this.c;
        drawable.setBounds(i, i2, i + iK, iK + i2);
        drawable.draw(canvas2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.a.setColor(kbcVar.h().i);
        this.b.setColor(-1);
        this.c.setTint(-1);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
        this.b.setAlpha(i);
        this.c.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        this.b.setColorFilter(colorFilter);
        this.c.setColorFilter(colorFilter);
    }
}
