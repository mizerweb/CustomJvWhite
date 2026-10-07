package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class b25 extends Drawable {
    public static final /* synthetic */ zv8[] g = {new z8b(b25.class, "strokeColor", "getStrokeColor()I"), zo5.e(zfe.a, b25.class, "alphaValue", "getAlphaValue()I")};
    public final float a;
    public final Paint b;
    public final RectF c;
    public final Path d;
    public final a25 e;
    public final a25 f;

    public b25(float f, float f2, float f3, float f4) {
        this.a = f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f2);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setPathEffect(new DashPathEffect(new float[]{f3, f4}, 0.0f));
        this.b = paint;
        this.c = new RectF();
        this.d = new Path();
        this.e = new a25(this, 0);
        this.f = new a25(this, 1);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawPath(this.d, this.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float strokeWidth = this.b.getStrokeWidth() / 2.0f;
        RectF rectF = this.c;
        rectF.set(rect);
        rectF.inset(strokeWidth, strokeWidth);
        Path path = this.d;
        path.reset();
        float f = this.a;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f.B(this, g[1], Integer.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
}
