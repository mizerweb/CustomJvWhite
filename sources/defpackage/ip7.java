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
public final class ip7 extends Drawable implements ff3 {
    public static final /* synthetic */ zv8[] g;
    public final zb b;
    public final Paint d;
    public final RectF e;
    public final float[] f;
    public final float a = yl5.d().getDisplayMetrics().density * 24.0f;
    public float[] c = {0.0f, 1.0f, 0.0f, 1.0f};

    static {
        z8b z8bVar = new z8b(ip7.class, "gradientBackground", "getGradientBackground()[I");
        zfe.a.getClass();
        g = new zv8[]{z8bVar};
    }

    public ip7(Context context) {
        this.b = new zb((int[]) ((t84) pq3.j.e(context).m().f().c).d, 15, this);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.d = paint;
        this.e = new RectF();
        this.f = new float[]{0.0f, 0.6f, 1.0f};
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f = this.a;
        canvas.drawRoundRect(this.e, f, f, this.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.ff3
    public final void h(kbc kbcVar) {
        RectF rectF = this.e;
        float f = rectF.right;
        float[] fArr = this.c;
        float f2 = fArr[0] * f;
        float f3 = rectF.top * fArr[1];
        float f4 = f * fArr[2];
        float f5 = rectF.bottom * fArr[3];
        zv8 zv8Var = g[0];
        this.d.setShader(new LinearGradient(f2, f3, f4, f5, (int[]) this.b.b, this.f, Shader.TileMode.CLAMP));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.e;
        rectF.set(rect);
        float f = rectF.right;
        float[] fArr = this.c;
        float f2 = fArr[0] * f;
        float f3 = rectF.top * fArr[1];
        float f4 = f * fArr[2];
        float f5 = rectF.bottom * fArr[3];
        zv8 zv8Var = g[0];
        this.d.setShader(new LinearGradient(f2, f3, f4, f5, (int[]) this.b.b, this.f, Shader.TileMode.CLAMP));
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
