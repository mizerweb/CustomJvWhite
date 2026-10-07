package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes4.dex */
public final class v50 extends Drawable {
    public static Paint s;
    public Drawable a;
    public boolean b;
    public int c = gm0.K(56.0f * yl5.d().getDisplayMetrics().density);
    public boolean d = true;
    public boolean e = true;
    public int f;
    public final float g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public long l;
    public final RectF m;
    public ValueAnimator n;
    public long o;
    public final Paint p;
    public Integer q;
    public int r;

    public v50() {
        float f = yl5.d().getDisplayMetrics().density * 2.0f;
        this.g = f;
        this.i = 270;
        this.m = new RectF();
        if (s == null) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            s = paint;
        }
        Paint paint2 = s;
        paint2.setStrokeWidth(f);
        this.p = paint2;
        this.r = 1;
    }

    public final boolean a() {
        return (this.f != 0 && this.j == this.h && this.i == 270) ? false : true;
    }

    public final void b() {
        this.e = true;
        invalidateSelf();
    }

    public final void c(int i) {
        this.p.setColor(i);
        invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:102:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:104:0x01de  */
    /* JADX WARN: Code duplicated, block: B:108:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x010e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0114  */
    /* JADX WARN: Code duplicated, block: B:64:0x0131 A[DONT_INVERT, PHI: r14
  0x0131: PHI (r14v2 boolean) = (r14v1 boolean), (r14v1 boolean), (r14v3 boolean) binds: [B:45:0x00fd, B:46:0x00ff, B:62:0x0126] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0133  */
    /* JADX WARN: Code duplicated, block: B:68:0x013d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0146  */
    /* JADX WARN: Code duplicated, block: B:71:0x0149  */
    /* JADX WARN: Code duplicated, block: B:74:0x0153  */
    /* JADX WARN: Code duplicated, block: B:84:0x016d  */
    /* JADX WARN: Code duplicated, block: B:87:0x017a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0180  */
    /* JADX WARN: Code duplicated, block: B:91:0x0187  */
    /* JADX WARN: Code duplicated, block: B:92:0x018a  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:97:0x01bd  */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iK;
        int i;
        float f;
        boolean z;
        float f2;
        int i2;
        float fU;
        float f3;
        Drawable drawable;
        boolean zA;
        int intrinsicWidth;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.d) {
            if (this.f != 10000 || this.e) {
                if (System.currentTimeMillis() - this.o < 150) {
                    invalidateSelf();
                    return;
                }
                int iCenterX = getBounds().centerX();
                int iCenterY = getBounds().centerY();
                int i7 = this.c / 2;
                float f4 = this.g * 4.0f;
                float f5 = f4 + (iCenterX - i7);
                float f6 = f4 + (iCenterY - i7);
                float f7 = (i7 + iCenterX) - f4;
                float f8 = (i7 + iCenterY) - f4;
                Paint paint = this.p;
                Paint.Style style = paint.getStyle();
                int color = paint.getColor();
                Integer num = this.q;
                if (num != null) {
                    int iIntValue = num.intValue();
                    paint.setStyle(Paint.Style.FILL);
                    paint.setColor(iIntValue);
                    canvas.drawOval(f5, f6, f7, f8, this.p);
                    iK = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
                } else {
                    iK = 0;
                }
                paint.setStyle(style);
                paint.setColor(color);
                if ((this.r == 1 ? a() : true) && this.d) {
                    i = iCenterY;
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    long j = jElapsedRealtime - this.l;
                    this.l = jElapsedRealtime;
                    int i8 = this.i;
                    float f9 = j / 30.0f;
                    int i9 = (int) ((10.0f * f9) + i8);
                    f = f5;
                    if (Math.abs(i9 - i8) > 360.0d) {
                        this.k = true;
                        this.i = 0;
                        this.h = 0;
                    } else {
                        boolean z2 = this.k;
                        int i10 = this.h;
                        if (z2) {
                            i4 = (int) ((f9 * 200.0f) + i10);
                        } else {
                            i4 = (int) (i10 - (f9 * 200.0f));
                        }
                        int i11 = this.f;
                        boolean z3 = i11 != 0 && i10 == this.j;
                        boolean z4 = z3 && this.i == 270;
                        iCenterX = iCenterX;
                        if (this.r != 1 || i11 == 0) {
                            if (!z3) {
                                this.h = i4;
                            }
                            this.i = i9;
                            i5 = this.h;
                            if (i5 > 10000) {
                                this.h = 10000 - (i5 - 10000);
                                z = false;
                                this.k = false;
                            } else {
                                z = false;
                                if (i5 < 0) {
                                    this.h = -i5;
                                    this.k = true;
                                }
                            }
                            if (i9 >= 360) {
                                this.i = i9 - 360;
                            }
                        } else {
                            if (!z3) {
                                if (z2) {
                                    int i12 = i10 + 1;
                                    int i13 = this.j;
                                    if (i12 > i13 || i13 > i4) {
                                        i6 = this.j;
                                        if (i4 <= i6 && i6 < i10) {
                                            this.h = this.j;
                                            z3 = true;
                                        }
                                    } else {
                                        this.h = this.j;
                                        z3 = true;
                                    }
                                } else {
                                    i6 = this.j;
                                    if (i4 <= i6) {
                                        this.h = this.j;
                                        z3 = true;
                                    }
                                }
                            }
                            if (z3 && this.i < 270 && i9 >= 270) {
                                this.i = 270;
                                z4 = true;
                            }
                            if (z4) {
                                this.f = this.j;
                                onLevelChange(i11);
                                z = false;
                            } else {
                                if (!z3) {
                                    this.h = i4;
                                }
                                this.i = i9;
                                i5 = this.h;
                                if (i5 > 10000) {
                                    this.h = 10000 - (i5 - 10000);
                                    z = false;
                                    this.k = false;
                                } else {
                                    z = false;
                                    if (i5 < 0) {
                                        this.h = -i5;
                                        this.k = true;
                                    }
                                }
                                if (i9 >= 360) {
                                    this.i = i9 - 360;
                                }
                            }
                        }
                    }
                    if (this.r == 1 || a()) {
                        f2 = this.i;
                    } else {
                        f2 = 270.0f;
                    }
                    float f10 = f2;
                    i2 = this.f;
                    if (i2 > 0) {
                        if (this.r == 2) {
                            f3 = 1.0f;
                        } else {
                            fU = oc9.u((this.h / 10000.0f) * 360.0f, 1.0f, 359.0f);
                        }
                        float f11 = iK;
                        float f12 = f + f11;
                        float f13 = f6 + f11;
                        float f14 = f7 - f11;
                        float f15 = f8 - f11;
                        RectF rectF = this.m;
                        rectF.set(f12, f13, f14, f15);
                        canvas.drawArc(rectF, f10, f3, false, this.p);
                        drawable = this.a;
                        if (drawable != null) {
                            intrinsicWidth = drawable.getIntrinsicWidth();
                            i3 = this.c / 2;
                            if (intrinsicWidth > i3) {
                                intrinsicWidth = i3;
                            }
                            int i14 = intrinsicWidth / 2;
                            drawable.setBounds(iCenterX - i14, i - i14, iCenterX + i14, i14 + i);
                            drawable.draw(canvas);
                        }
                        if (this.r == 1) {
                            zA = a();
                        } else if (!a() || this.f < 10000) {
                            zA = true;
                        } else {
                            zA = z;
                        }
                        if (zA) {
                            invalidateSelf();
                        }
                    }
                    fU = (i2 / 10000.0f) * 360.0f;
                    f3 = fU;
                    float f16 = iK;
                    float f17 = f + f16;
                    float f18 = f6 + f16;
                    float f19 = f7 - f16;
                    float f110 = f8 - f16;
                    RectF rectF2 = this.m;
                    rectF2.set(f17, f18, f19, f110);
                    canvas.drawArc(rectF2, f10, f3, false, this.p);
                    drawable = this.a;
                    if (drawable != null) {
                        intrinsicWidth = drawable.getIntrinsicWidth();
                        i3 = this.c / 2;
                        if (intrinsicWidth > i3) {
                            intrinsicWidth = i3;
                        }
                        int i15 = intrinsicWidth / 2;
                        drawable.setBounds(iCenterX - i15, i - i15, iCenterX + i15, i15 + i);
                        drawable.draw(canvas);
                    }
                    if (this.r == 1) {
                        zA = a();
                    } else if (a()) {
                        zA = true;
                    } else {
                        zA = true;
                    }
                    if (zA) {
                        invalidateSelf();
                    }
                }
                i = iCenterY;
                f = f5;
                z = false;
                if (this.r == 1) {
                    f2 = this.i;
                } else {
                    f2 = this.i;
                }
                float f111 = f2;
                i2 = this.f;
                if (i2 > 0) {
                    if (this.r == 2) {
                        f3 = 1.0f;
                    } else {
                        fU = oc9.u((this.h / 10000.0f) * 360.0f, 1.0f, 359.0f);
                    }
                    float f112 = iK;
                    float f113 = f + f112;
                    float f114 = f6 + f112;
                    float f115 = f7 - f112;
                    float f116 = f8 - f112;
                    RectF rectF3 = this.m;
                    rectF3.set(f113, f114, f115, f116);
                    canvas.drawArc(rectF3, f111, f3, false, this.p);
                    drawable = this.a;
                    if (drawable != null) {
                        intrinsicWidth = drawable.getIntrinsicWidth();
                        i3 = this.c / 2;
                        if (intrinsicWidth > i3) {
                            intrinsicWidth = i3;
                        }
                        int i16 = intrinsicWidth / 2;
                        drawable.setBounds(iCenterX - i16, i - i16, iCenterX + i16, i16 + i);
                        drawable.draw(canvas);
                    }
                    if (this.r == 1) {
                        zA = a();
                    } else if (a()) {
                        zA = true;
                    } else {
                        zA = true;
                    }
                    if (zA) {
                        invalidateSelf();
                    }
                }
                fU = (i2 / 10000.0f) * 360.0f;
                f3 = fU;
                float f117 = iK;
                float f118 = f + f117;
                float f119 = f6 + f117;
                float f1110 = f7 - f117;
                float f1111 = f8 - f117;
                RectF rectF4 = this.m;
                rectF4.set(f118, f119, f1110, f1111);
                canvas.drawArc(rectF4, f111, f3, false, this.p);
                drawable = this.a;
                if (drawable != null) {
                    intrinsicWidth = drawable.getIntrinsicWidth();
                    i3 = this.c / 2;
                    if (intrinsicWidth > i3) {
                        intrinsicWidth = i3;
                    }
                    int i17 = intrinsicWidth / 2;
                    drawable.setBounds(iCenterX - i17, i - i17, iCenterX + i17, i17 + i);
                    drawable.draw(canvas);
                }
                if (this.r == 1) {
                    zA = a();
                } else if (a()) {
                    zA = true;
                } else {
                    zA = true;
                }
                if (zA) {
                    invalidateSelf();
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        if (this.f == 0 && i != 0) {
            this.j = i;
            this.h = i;
        }
        float f = i / 10000.0f;
        if (f == -0.1f) {
            this.d = false;
            ValueAnimator valueAnimator = this.n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
        } else if (f == -0.2f) {
            this.d = true;
        } else {
            int iV = oc9.v(i, 0, 10000);
            if (iV == 0) {
                this.o = System.currentTimeMillis() + 150;
            }
            if (this.r == 1) {
                this.f = iV;
                ValueAnimator valueAnimator2 = this.n;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
            } else if (iV == 10000 || iV == 0) {
                this.f = iV;
                ValueAnimator valueAnimator3 = this.n;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
            } else if (iV != this.f) {
                ValueAnimator valueAnimator4 = this.n;
                if (valueAnimator4 != null) {
                    valueAnimator4.cancel();
                }
                ValueAnimator valueAnimator5 = this.n;
                if (valueAnimator5 == null) {
                    valueAnimator5 = new ValueAnimator();
                    valueAnimator5.setDuration(200L);
                    valueAnimator5.setInterpolator(new LinearInterpolator());
                    valueAnimator5.addUpdateListener(new ak(1, this));
                    this.n = valueAnimator5;
                }
                valueAnimator5.setIntValues(this.f, iV);
                valueAnimator5.start();
            }
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        if (this.b || getBounds().width() <= 0 || getBounds().width() >= gm0.K(56.0f * yl5.d().getDisplayMetrics().density)) {
            return;
        }
        this.c = getBounds().width();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        super.setTint(i);
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setTint(i);
        }
        c(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        ValueAnimator valueAnimator;
        if (!z && (valueAnimator = this.n) != null) {
            valueAnimator.cancel();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        if (this.b || rect.width() <= 0 || rect.width() >= gm0.K(56.0f * yl5.d().getDisplayMetrics().density)) {
            return;
        }
        this.c = rect.width();
    }
}
