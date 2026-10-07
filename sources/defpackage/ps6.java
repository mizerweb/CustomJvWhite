package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public final class ps6 extends Drawable {
    public final Paint a;
    public ls6 b;
    public ls6 c;
    public float d;
    public float e;
    public float f;
    public final float g;
    public final ns6 h;
    public final os6 i;
    public long j;

    public ps6() {
        Paint paint = new Paint();
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        this.a = paint;
        ls6 ls6Var = ls6.a;
        this.b = ls6Var;
        this.c = ls6Var;
        this.d = 1.0f;
        this.g = 1.0f;
        this.h = new ns6(this);
        this.i = new os6(this);
    }

    public final ms6 a() {
        ls6 ls6Var = this.b;
        ls6 ls6Var2 = this.c;
        int iOrdinal = ls6Var.ordinal();
        if (iOrdinal == 0) {
            int iOrdinal2 = ls6Var2.ordinal();
            if (iOrdinal2 == 0) {
                return ms6.a;
            }
            if (iOrdinal2 == 1) {
                return ms6.b;
            }
            ore.o();
            return null;
        }
        if (iOrdinal != 1) {
            ore.o();
            return null;
        }
        int iOrdinal3 = ls6Var2.ordinal();
        if (iOrdinal3 == 0) {
            return ms6.c;
        }
        if (iOrdinal3 == 1) {
            return ms6.d;
        }
        ore.o();
        return null;
    }

    public final boolean b() {
        return this.f > 0.01f || this.e > 0.01f;
    }

    public final void c(int i, int i2, int i3) {
        ns6 ns6Var = this.h;
        ns6Var.c = sxl.b(ns6Var.c, i, 0.0f, 2);
        ns6Var.d = sxl.b(ns6Var.d, i2, 0.0f, 2);
        ns6Var.b = sxl.b(ns6Var.b, i3, 0.0f, 2);
    }

    public final void d(int i, int i2) {
        ns6 ns6Var = this.h;
        long j = ns6Var.f;
        int i3 = (int) (j >> 32);
        os6 os6Var = this.i;
        if (i3 != i || ((int) (j >> 32)) != i2 || os6Var.j != i2) {
            invalidateSelf();
        }
        ns6Var.f = bj8.a(i, i2);
        os6Var.j = i2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (b()) {
            ns6 ns6Var = this.h;
            ps6 ps6Var = ns6Var.k;
            Paint paint = ps6Var.a;
            if (ns6Var.h >= 0.01f) {
                float f = ns6Var.i;
                if (f < 0.99f) {
                    float interpolation = ns6Var.g.getInterpolation(f);
                    float fA = sxl.a(interpolation, ns6Var.d);
                    float fA2 = sxl.a(interpolation, ns6Var.c) / 2.0f;
                    float fA3 = sxl.a(interpolation, ns6Var.a);
                    float fA4 = sxl.a(interpolation, ns6Var.b);
                    long j = ns6Var.f;
                    paint.setColor(tre.I0(mx3.b((int) (j >> 32), interpolation, (int) (j & 4294967295L)), ns6Var.h * ps6Var.e * ps6Var.d));
                    paint.setStrokeWidth(ns6Var.e);
                    canvas.drawLine(fA3, fA4, fA3, fA4 - fA, paint);
                    float f2 = fA4 - fA2;
                    canvas.drawLine(fA3, fA4, fA3 - fA2, f2, paint);
                    canvas.drawLine(fA3, fA4, fA3 + fA2, f2, paint);
                }
            }
            os6 os6Var = this.i;
            ps6 ps6Var2 = os6Var.m;
            if (os6Var.i < 0.01f) {
                return;
            }
            float f3 = os6Var.c;
            float f4 = os6Var.d;
            float f5 = ((os6Var.f * 360.0f) + 90.0f) % 360.0f;
            float fU = oc9.u(os6Var.g * 360.0f, 3.0f, 360.0f);
            Paint paint2 = ps6Var2.a;
            paint2.setColor(tre.I0(os6Var.j, os6Var.i * ps6Var2.e * ps6Var2.d));
            paint2.setStrokeWidth(os6Var.e);
            canvas.drawArc(0.0f, 0.0f, f3, f4, f5, fU, false, paint2);
            float f6 = os6Var.k;
            if (f6 > 0.01f) {
                float interpolation2 = os6Var.l.getInterpolation(f6);
                float f7 = (interpolation2 * 1.5707964f) - 0.7853982f;
                float f8 = f3 / 2.0f;
                float f9 = f4 / 2.0f;
                float f10 = os6Var.a;
                float f11 = os6Var.b;
                float f12 = (f8 * f10) - f11;
                float f13 = (f10 * f9) - f11;
                double d = f7;
                float fCos = (float) Math.cos(d);
                float fSin = (float) Math.sin(d);
                double d2 = f7 + 1.5707964f;
                float fCos2 = (float) Math.cos(d2);
                float fSin2 = (float) Math.sin(d2);
                paint2.setColor(tre.I0(paint2.getColor(), os6Var.i * interpolation2 * ps6Var2.e * ps6Var2.d));
                float f14 = fCos * f12;
                float f15 = fSin * f13;
                canvas.drawLine(f8 - f14, f9 - f15, f8 + f14, f9 + f15, paint2);
                float f16 = f12 * fCos2;
                float f17 = f13 * fSin2;
                canvas.drawLine(f8 - f16, f9 - f17, f8 + f16, f9 + f17, paint2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d = i / 255.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        int iAbs = Math.abs(i3 - i);
        int iAbs2 = Math.abs(i4 - i2);
        float f = iAbs;
        float f2 = f / 2.0f;
        long jA = qx6.a(f2, f2);
        ns6 ns6Var = this.h;
        ns6Var.a = jA;
        float f3 = iAbs2;
        ns6Var.b = sxl.b(ns6Var.b, 0.0f, f3, 1);
        os6 os6Var = this.i;
        os6Var.c = f;
        os6Var.d = f3;
        super.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final String toString() {
        return uqi.i("(%s(%s), %.1f -> %.1f, %s, %s)", this.b, a(), Float.valueOf(this.e), Float.valueOf(this.f), this.h.toString(), this.i.toString());
    }
}
