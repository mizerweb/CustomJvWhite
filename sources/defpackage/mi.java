package defpackage;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class mi extends View {
    public long a;
    public final int[] b;
    public final float[] c;
    public final float d;
    public float e;
    public RadialGradient f;
    public float g;
    public float h;
    public long i;
    public final Paint j;

    public mi(Context context) {
        super(context, null);
        this.a = qx6.a(0.0f, 0.0f);
        this.b = new int[]{0, -3635457, -69377, -69377, -4954625, 0};
        this.c = new float[6];
        this.d = yl5.d().getDisplayMetrics().density * 6.51172f;
        this.e = 0.2f;
        this.i = qx6.a(0.0f, 0.0f);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setShader(this.f);
        paint.setMaskFilter(new BlurMaskFilter(60.0f, BlurMaskFilter.Blur.NORMAL));
        this.j = paint;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        float f;
        Paint paint = this.j;
        float[] fArr = this.c;
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.a >> 32)) == 0.0f ? measuredWidth / 2.0f : Float.intBitsToFloat((int) (this.a >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.a & 4294967295L)) == 0.0f ? measuredHeight / 2.0f : Float.intBitsToFloat((int) (this.a & 4294967295L));
        float f2 = this.g;
        float f3 = this.d;
        float f4 = (f2 * f3) + 60.0f;
        float f5 = -f4;
        float f6 = measuredWidth + f4;
        float f7 = measuredHeight + f4;
        int iSave = canvas.save();
        canvas.clipRect(f5, f5, f6, f7);
        try {
            float f8 = this.h;
            float f9 = this.g;
            float f10 = f8 * f9;
            float f11 = f10 - ((f9 * f3) * 0.7f);
            if (f10 > 0.0f && f11 > 0.0f) {
                if (this.f != null) {
                    f = f3;
                    if (Float.intBitsToFloat((int) (this.i >> 32)) != f11 || Float.intBitsToFloat((int) (this.i & 4294967295L)) != f10) {
                    }
                    this.i = qx6.a(f11, f10);
                    paint.setShader(this.f);
                    paint.setAlpha(oc9.v((int) (this.e * 255.0f), 0, 255));
                    canvas.drawCircle(fIntBitsToFloat, fIntBitsToFloat2, f10, paint);
                }
                f = f3;
                float fU = oc9.u(f * this.g * 0.25f, 0.0f, 100.0f);
                float f12 = f11 - fU;
                if (f12 < 0.0f) {
                    f12 = 0.0f;
                }
                float f13 = f10 - fU;
                fArr[0] = 0.0f;
                fArr[1] = oc9.u(f12 / f10, 0.0f, 1.0f);
                fArr[2] = oc9.u(f11 / f10, 0.0f, 1.0f);
                fArr[3] = oc9.u((0.9f * f13) / f10, 0.0f, 1.0f);
                fArr[4] = oc9.u(f13 / f10, 0.0f, 1.0f);
                fArr[5] = 1.0f;
                this.f = new RadialGradient(fIntBitsToFloat, fIntBitsToFloat2, f10, this.b, this.c, Shader.TileMode.CLAMP);
                this.i = qx6.a(f11, f10);
                paint.setShader(this.f);
                paint.setAlpha(oc9.v((int) (this.e * 255.0f), 0, 255));
                canvas.drawCircle(fIntBitsToFloat, fIntBitsToFloat2, f10, paint);
            }
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public final void setBaseRadius(float f) {
        this.h = (f - this.d) / 2.0f;
    }
}
