package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class wq6 extends View {
    public xac a;
    public final ir6 b;
    public final ps6 c;
    public final jr6 d;

    public wq6(Context context) {
        super(context, null);
        a8g a8gVar = pq3.j;
        this.a = (xac) a8gVar.h(this).f().a;
        int i = ((xac) a8gVar.h(this).f().a).c.g;
        ir6 ir6Var = new ir6(context);
        ir6Var.setCallback(this);
        this.b = ir6Var;
        ps6 ps6Var = new ps6();
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 2.0f);
        int iK2 = (gm0.K(12.0f * yl5.d().getDisplayMetrics().density) - iK) - (gm0.K(2.0f * yl5.d().getDisplayMetrics().density) * 2);
        ps6Var.c(iK2, iK2, gm0.K(5.0f * yl5.d().getDisplayMetrics().density) - iK);
        ps6Var.d(i, i);
        ps6Var.setCallback(this);
        this.c = ps6Var;
        jr6 jr6Var = new jr6(context, ir6Var);
        jr6Var.setCallback(this);
        this.d = jr6Var;
        this.a = this.a;
        jr6Var.onThemeChanged(a8gVar.h(this));
        zp6 zp6Var = jr6Var.c;
        if (zp6Var == null) {
            return;
        }
        int iZ = oc9.Z(zp6Var.h().d, a8gVar.h(this));
        ps6Var.d(iZ, iZ);
    }

    public final void a(zp6 zp6Var, boolean z) {
        ps6 ps6Var = this.c;
        if (!sxl.c(ps6Var.f, 0.0f, 0.01f)) {
            ps6Var.f = 0.0f;
            if (!z) {
                ps6Var.e = 0.0f;
            }
            ps6Var.invalidateSelf();
        }
        jr6 jr6Var = this.d;
        jr6Var.a(zp6Var);
        zp6 zp6Var2 = jr6Var.c;
        if (zp6Var2 == null) {
            return;
        }
        int iZ = oc9.Z(zp6Var2.h().d, pq3.j.h(this));
        ps6Var.d(iZ, iZ);
    }

    public final void b(zp6 zp6Var, float f, boolean z) {
        float f2 = f / 100.0f;
        ps6 ps6Var = this.c;
        ns6 ns6Var = ps6Var.h;
        os6 os6Var = ps6Var.i;
        ls6 ls6Var = ps6Var.c;
        ls6 ls6Var2 = ls6.b;
        if (ls6Var != ls6Var2 || !sxl.c(os6Var.h, f2, 0.01f) || !sxl.c(ps6Var.f, 1.0f, 0.01f)) {
            if (!ps6Var.b()) {
                ps6Var.b = ls6Var2;
                ns6Var.h = 1.0f;
                ns6Var.i = 1.0f;
                ns6Var.j = 1.0f;
                os6Var.i = 1.0f;
                os6Var.k = 1.0f;
            }
            ps6Var.c = ls6Var2;
            ps6Var.f = 1.0f;
            os6Var.h = f2;
            ns6Var.j = 1.0f;
            if (!z) {
                ps6Var.b = ls6Var2;
                os6Var.g = f2;
                os6Var.i = 1.0f;
                os6Var.k = 1.0f;
                ns6Var.h = 1.0f;
                ns6Var.i = 1.0f;
                ns6Var.j = 1.0f;
                ps6Var.e = 1.0f;
            }
            ps6Var.invalidateSelf();
        }
        jr6 jr6Var = this.d;
        jr6Var.a(zp6Var);
        zp6 zp6Var2 = jr6Var.c;
        if (zp6Var2 == null) {
            return;
        }
        int iZ = oc9.Z(zp6Var2.h().d, pq3.j.h(this));
        ps6Var.d(iZ, iZ);
    }

    public final void c(zp6 zp6Var, boolean z) {
        ps6 ps6Var = this.c;
        os6 os6Var = ps6Var.i;
        ns6 ns6Var = ps6Var.h;
        ls6 ls6Var = ps6Var.c;
        ls6 ls6Var2 = ls6.a;
        if (ls6Var != ls6Var2 || !sxl.c(ns6Var.j, 0.0f, 0.01f) || !sxl.c(ps6Var.f, 1.0f, 0.01f)) {
            if (!ps6Var.b()) {
                ps6Var.b = ls6Var2;
                ns6Var.h = 1.0f;
                ns6Var.i = 0.0f;
                ns6Var.j = 0.0f;
                os6Var.i = 0.0f;
                os6Var.k = 0.0f;
            }
            ps6Var.c = ls6Var2;
            ns6Var.j = 0.0f;
            ps6Var.f = 1.0f;
            if (!z) {
                ps6Var.b = ls6Var2;
                ns6Var.h = 1.0f;
                ns6Var.i = 0.0f;
                ns6Var.j = 0.0f;
                os6Var.i = 0.0f;
                os6Var.k = 0.0f;
                ps6Var.e = 1.0f;
            }
            ps6Var.invalidateSelf();
        }
        jr6 jr6Var = this.d;
        jr6Var.a(zp6Var);
        zp6 zp6Var2 = jr6Var.c;
        if (zp6Var2 == null) {
            return;
        }
        int iZ = oc9.Z(zp6Var2.h().d, pq3.j.h(this));
        ps6Var.d(iZ, iZ);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        long drawingTime = getDrawingTime();
        ps6 ps6Var = this.c;
        ns6 ns6Var = ps6Var.h;
        os6 os6Var = ps6Var.i;
        if (ps6Var.b()) {
            long j = ps6Var.j;
            float fU = j == 0 ? 0.0f : oc9.u((drawingTime - j) / 1000.0f, 0.0f, 0.1f) * ps6Var.g;
            ps6Var.j = drawingTime;
            float f = 3.0f * fU;
            if (sxl.c(ps6Var.f, ps6Var.e, f)) {
                ps6Var.e = ps6Var.f;
            } else {
                float f2 = ps6Var.e;
                ps6Var.e = (Math.signum(ps6Var.f - f2) * f) + f2;
                ps6Var.invalidateSelf();
            }
            int iOrdinal = ps6Var.a().ordinal();
            if (iOrdinal != 0) {
                int i = 1;
                if (iOrdinal == 1) {
                    ps6Var.invalidateSelf();
                    float f3 = ns6Var.i + f;
                    ns6Var.i = f3;
                    if (f3 >= 1.0d) {
                        ns6Var.i = 1.0f;
                        ps6Var.b = ls6.b;
                        os6Var.i = 1.0f;
                        os6Var.f = 0.0f;
                        os6Var.g = 0.0f;
                    }
                } else if (iOrdinal == 2) {
                    ps6Var.invalidateSelf();
                    float f4 = fU * 2.0f;
                    float f5 = os6Var.g - f4;
                    os6Var.g = f5;
                    if (f5 <= 0.0f) {
                        os6Var.g = 0.0f;
                    } else {
                        i = 0;
                    }
                    float f6 = os6Var.k - f;
                    os6Var.k = f6;
                    if (f6 <= 0.0f) {
                        os6Var.k = 0.0f;
                        i++;
                    }
                    float f7 = os6Var.f + f4;
                    os6Var.f = f7;
                    if (f7 > 0.9900000002235174d) {
                        os6Var.f = 1.0f;
                        i++;
                    }
                    if (i == 3) {
                        os6Var.i = 0.0f;
                        os6Var.k = 0.0f;
                        ns6Var.j = 0.0f;
                        ns6Var.i = 1.0f;
                        ns6Var.h = 1.0f;
                        ps6Var.b = ls6.a;
                    }
                } else {
                    if (iOrdinal != 3) {
                        ore.o();
                        return;
                    }
                    ps6Var.invalidateSelf();
                    float f8 = 2.0f * fU;
                    os6Var.f = (os6Var.f + fU) % 1.0f;
                    os6Var.i = 1.0f;
                    os6Var.k = Math.min(1.0f, os6Var.k + f);
                    if (sxl.c(os6Var.g, os6Var.h, f8)) {
                        os6Var.g = os6Var.h;
                    } else {
                        float f9 = os6Var.g;
                        os6Var.g = (Math.signum(os6Var.h - f9) * f8) + f9;
                    }
                }
            } else if (sxl.c(ns6Var.j, ns6Var.i, f)) {
                ns6Var.i = ns6Var.j;
            } else {
                float f10 = ns6Var.i;
                ns6Var.i = (Math.signum(ns6Var.j - f10) * f) + f10;
                ps6Var.invalidateSelf();
            }
        }
        int iSqrt = (int) (((float) Math.sqrt(Math.max(1.0f - ps6Var.e, 1.0f - ps6Var.h.i))) * 255.0f);
        jr6 jr6Var = this.d;
        jr6Var.setAlpha(iSqrt);
        jr6Var.draw(canvas);
        float width = (getWidth() - ps6Var.getBounds().width()) * 0.5f;
        float height = (getHeight() - ps6Var.getBounds().height()) * 0.5f;
        int iSave = canvas.save();
        canvas.translate(width, height);
        try {
            ps6Var.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            size = gm0.K(yl5.d().getDisplayMetrics().density * 40.0f);
        }
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            size2 = gm0.K(40.0f * yl5.d().getDisplayMetrics().density);
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ir6 ir6Var = this.b;
        float intrinsicWidth = ir6Var.getIntrinsicWidth();
        float intrinsicHeight = ir6Var.getIntrinsicHeight();
        float fMin = Math.min(i / intrinsicWidth, i2 / intrinsicHeight);
        ir6Var.setBounds(0, 0, (int) (intrinsicWidth * fMin), (int) (intrinsicHeight * fMin));
        int iK = (int) (gm0.K(yl5.d().getDisplayMetrics().density * 2.0f) * fMin);
        int iK2 = (int) (gm0.K(2.0f * yl5.d().getDisplayMetrics().density) * fMin);
        int iK3 = ((int) (gm0.K(12.0f * yl5.d().getDisplayMetrics().density) * fMin)) - iK;
        int iK4 = ((int) (gm0.K(5.0f * yl5.d().getDisplayMetrics().density) * fMin)) - iK;
        int i5 = iK3 - (iK2 * 2);
        ps6 ps6Var = this.c;
        ps6Var.c(i5, i5, iK4);
        ps6Var.setBounds(0, 0, i / 2, i2 / 2);
        this.d.setBounds(0, 0, i, i2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(null);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.c) {
            return true;
        }
        jr6 jr6Var = this.d;
        if (jr6Var != drawable) {
            return jr6Var.b == drawable;
        }
        jr6Var.getClass();
        return true;
    }
}
