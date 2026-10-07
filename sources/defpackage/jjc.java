package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class jjc extends Drawable {
    public static final /* synthetic */ zv8[] f = {new z8b(jjc.class, "ratio", "getRatio()F"), zo5.e(zfe.a, jjc.class, "strokeWidth", "getStrokeWidth()F"), new z8b(jjc.class, "strokeColor", "getStrokeColor()I"), new z8b(jjc.class, "cornerRadius", "getCornerRadius()F"), new z8b(jjc.class, "maxSize", "getMaxSize()F")};
    public final Paint a;
    public final float b;
    public final float c;
    public final RectF d;
    public final zb e;

    public jjc(int i, float f2) {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(i);
        paint.setStrokeWidth(1.5f * yl5.d().getDisplayMetrics().density);
        this.a = paint;
        this.b = 2.0f * yl5.d().getDisplayMetrics().density;
        this.c = 18.0f * yl5.d().getDisplayMetrics().density;
        this.d = new RectF();
        this.e = new zb(Float.valueOf(f2), 29, this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (getBounds().isEmpty()) {
            return;
        }
        float fWidth = getBounds().width();
        float f2 = this.c;
        float fMin = Math.min(fWidth, f2);
        float fMin2 = Math.min(getBounds().height(), f2);
        zv8 zv8Var = f[0];
        float fFloatValue = ((Number) this.e.b).floatValue();
        float f3 = fMin / fFloatValue;
        long jA = f3 <= fMin2 ? qx6.a(fMin, f3) : qx6.a(fFloatValue * fMin2, fMin2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jA >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jA & 4294967295L));
        float fExactCenterX = getBounds().exactCenterX();
        float fExactCenterY = getBounds().exactCenterY();
        Paint paint = this.a;
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        float f4 = fIntBitsToFloat / 2.0f;
        float f5 = fIntBitsToFloat2 / 2.0f;
        float f6 = (fExactCenterY + f5) - strokeWidth;
        RectF rectF = this.d;
        rectF.set((fExactCenterX - f4) + strokeWidth, (fExactCenterY - f5) + strokeWidth, (fExactCenterX + f4) - strokeWidth, f6);
        if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
            return;
        }
        float fMin3 = Math.min(this.b, Math.min(rectF.width(), rectF.height()) / 2.0f);
        canvas.drawRoundRect(rectF, fMin3, fMin3, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
