package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class kr3 extends Drawable {
    public final Paint a;
    public float b;

    public kr3() {
        Paint paint = new Paint();
        paint.setStrokeWidth(yl5.d().getDisplayMetrics().density * 2.0f);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.a = paint;
        this.b = 360.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawArc(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, -90.0f, this.b, false, this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        rect.inset(gm0.K(yl5.d().getDisplayMetrics().density * 2.0f), gm0.K(2.0f * yl5.d().getDisplayMetrics().density));
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
