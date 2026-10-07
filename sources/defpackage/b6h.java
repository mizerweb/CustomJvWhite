package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class b6h extends Drawable implements ff3 {
    public static final /* synthetic */ zv8[] f;
    public final float a;
    public final float b;
    public final t5d c;
    public final Paint d;
    public final RectF e;

    static {
        z8b z8bVar = new z8b(b6h.class, "gradientStrokeColors", "getGradientStrokeColors()[I");
        zfe.a.getClass();
        f = new zv8[]{z8bVar};
    }

    public b6h(Context context) {
        float f2 = yl5.d().getDisplayMetrics().density * 24.0f;
        this.a = 0.0f;
        this.b = f2;
        this.c = new t5d((int[]) ((t84) pq3.j.e(context).m().f().c).h, 12, this);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(0.0f);
        this.d = paint;
        this.e = new RectF();
    }

    public final void b(int[] iArr) {
        this.c.B(this, f[0], iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f2 = this.b;
        canvas.drawRoundRect(this.e, f2, f2, this.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.ff3
    public final void h(kbc kbcVar) {
        RectF rectF = this.e;
        float f2 = rectF.left;
        float f3 = rectF.top;
        float f4 = rectF.right;
        float f5 = rectF.bottom;
        zv8 zv8Var = f[0];
        this.d.setShader(new LinearGradient(f2, f3, f4, f5, (int[]) this.c.b, (float[]) null, Shader.TileMode.CLAMP));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float f2 = this.a / 2.0f;
        float f3 = rect.left + f2;
        float f4 = rect.top + f2;
        float f5 = rect.right - f2;
        float f6 = rect.bottom - f2;
        RectF rectF = this.e;
        rectF.set(f3, f4, f5, f6);
        float f7 = rectF.top;
        float f8 = rectF.bottom;
        zv8 zv8Var = f[0];
        this.d.setShader(new LinearGradient(0.0f, f7, 0.0f, f8, (int[]) this.c.b, (float[]) null, Shader.TileMode.CLAMP));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
