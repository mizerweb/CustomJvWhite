package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
public final class u6a {
    public float a;
    public float c;
    public float b = 1.0f;
    public final RectF d = new RectF();
    public final RectF e = new RectF();
    public final float f = yl5.d().getDisplayMetrics().density * 4.0f;
    public final RectF g = new RectF();
    public final float h = yl5.d().getDisplayMetrics().density * 16.0f;
    public final RectF i = new RectF();
    public final float j = yl5.d().getDisplayMetrics().density * 4.0f;
    public final float k = yl5.d().getDisplayMetrics().density * 4.0f;
    public final float l = yl5.d().getDisplayMetrics().density * 16.0f;
    public final RectF m = new RectF();
    public final float n = yl5.d().getDisplayMetrics().density * 16.0f;
    public final RectF o = new RectF();
    public final Rect p = new Rect();
    public final RectF q = new RectF();
    public final Rect r = new Rect();
    public final float s = yl5.d().getDisplayMetrics().density * 60.0f;
    public final float t = yl5.d().getDisplayMetrics().density * 3.0f;
    public final float u = yl5.d().getDisplayMetrics().density * 24.0f;
    public final RectF v = new RectF();
    public final RectF w = new RectF();
    public final RectF x = new RectF();
    public final float y = yl5.d().getDisplayMetrics().density * 2.0f;
    public final RectF z = new RectF();
    public final float A = yl5.d().getDisplayMetrics().density * 3.0f;
    public final float B = yl5.d().getDisplayMetrics().density * 3.0f;

    public final float a(float f) {
        RectF rectF = this.e;
        return (rectF.width() * f) + rectF.left;
    }

    public final void b() {
        float fA = a(this.a);
        float fA2 = a(this.b);
        RectF rectF = this.e;
        float f = rectF.top;
        float f2 = rectF.bottom;
        RectF rectF2 = this.g;
        rectF2.set(fA, f, fA2, f2);
        float f3 = rectF2.left;
        float f4 = this.l;
        float f5 = rectF2.top;
        float f6 = this.k;
        float f7 = f5 + f6;
        float f8 = rectF2.right - f4;
        float f9 = rectF2.bottom - f6;
        RectF rectF3 = this.i;
        rectF3.set(f3 + f4, f7, f8, f9);
        float fA3 = a(this.a);
        float fA4 = a(this.b);
        float f10 = rectF.bottom;
        RectF rectF4 = this.o;
        rectF4.set(fA3, rectF.top, fA3 + f4, f10);
        float f11 = rectF.top;
        float f12 = rectF.bottom;
        RectF rectF5 = this.q;
        rectF5.set(fA4 - f4, f11, fA4, f12);
        float f13 = (this.s - f4) / 2.0f;
        this.p.set(gm0.K(rectF4.left - f13), gm0.K(rectF4.top), gm0.K(rectF4.right + f13), gm0.K(rectF4.bottom));
        this.r.set(gm0.K(rectF5.left - f13), gm0.K(rectF5.top), gm0.K(rectF5.right + f13), gm0.K(rectF5.bottom));
        RectF rectF6 = this.m;
        this.v.set(rectF6.left, rectF6.top, rectF4.right, rectF6.bottom);
        this.w.set(rectF5.left, rectF6.top, rectF6.right, rectF6.bottom);
        float f14 = rectF4.right;
        float f15 = this.B;
        float f16 = f14 + f15;
        float f17 = rectF5.left - f15;
        if (f17 < f16) {
            f17 = f16;
        }
        float fU = oc9.u(a(this.c), f16, f17);
        float f18 = this.A / 2.0f;
        RectF rectF7 = this.d;
        this.x.set(fU - f18, (rectF7.top + rectF.top) / 2.0f, fU + f18, (rectF7.bottom + rectF.bottom) / 2.0f);
        this.z.set(rectF3);
    }

    public final float c(float f) {
        RectF rectF = this.e;
        if (rectF.width() <= 0.0f) {
            return 0.0f;
        }
        return oc9.u((f - rectF.left) / rectF.width(), 0.0f, 1.0f);
    }
}
