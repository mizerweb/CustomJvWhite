package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class k70 extends Drawable {
    public final int a;
    public int b;
    public int c;
    public int f;
    public boolean g;
    public long h;
    public final Paint k;
    public final Paint l;
    public ValueAnimator n;
    public final int r;
    public int d = 0;
    public int e = 270;
    public long i = 0;
    public boolean j = true;
    public final RectF m = new RectF();
    public final j70 o = new j70(this, 0);
    public final j70 p = new j70(this, 1);
    public final c3 q = new c3(8, this);

    public k70(Context context) {
        int iB = yl5.b(2);
        this.a = iB;
        int iB2 = yl5.b(56);
        this.r = iB2;
        this.c = iB2;
        pq3 pq3VarE = pq3.j.e(context);
        Paint paint = new Paint();
        this.k = paint;
        paint.setColor(pq3VarE.j().b.b().g);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.l = paint2;
        pq3VarE.j();
        paint2.setColor(-1);
        paint2.setStrokeWidth(iB);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setAntiAlias(true);
    }

    public final boolean b() {
        return (this.b != 0 && this.f == this.d && this.e == 270) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00d9 A[DONT_INVERT, PHI: r12
  0x00d9: PHI (r12v9 boolean) = (r12v8 boolean), (r12v10 boolean) binds: [B:36:0x00ad, B:52:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fb  */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        float f2;
        int i;
        int i2;
        if (!this.j || this.b == 10000) {
            return;
        }
        if (System.currentTimeMillis() - this.i < 150) {
            invalidateSelf();
            return;
        }
        int iCenterX = getBounds().centerX();
        int iCenterY = getBounds().centerY();
        canvas.drawCircle(iCenterX, iCenterY, this.c / 2, this.k);
        boolean zB = b();
        Paint paint = this.l;
        int i3 = this.a;
        RectF rectF = this.m;
        if (zB) {
            if (this.j) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = jElapsedRealtime - this.h;
                this.h = jElapsedRealtime;
                int i4 = this.e;
                float f3 = j / 30.0f;
                int i5 = (int) ((10.0f * f3) + i4);
                if (Math.abs(i5 - i4) > 360) {
                    this.g = true;
                    this.e = 0;
                    this.d = 0;
                    f = 10000.0f;
                    f2 = 360.0f;
                } else {
                    boolean z = this.g;
                    f = 10000.0f;
                    int i6 = this.d;
                    if (z) {
                        f2 = 360.0f;
                        i = (int) ((f3 * 200.0f) + i6);
                    } else {
                        f2 = 360.0f;
                        i = (int) (i6 - (f3 * 200.0f));
                    }
                    int i7 = this.b;
                    boolean z2 = i7 != 0 && i6 == this.f;
                    boolean z3 = z2 && this.e == 270;
                    if (i7 == 0) {
                        if (!z2) {
                            this.d = i;
                        }
                        this.e = i5;
                        i2 = this.d;
                        if (i2 > 10000) {
                            this.d = 10000 - (i2 - 10000);
                            this.g = false;
                        } else if (i2 < 0) {
                            this.d = -i2;
                            this.g = true;
                        }
                        if (i5 >= 360) {
                            this.e = i5 - 360;
                        }
                    } else {
                        if (!z2) {
                            int i8 = this.f;
                            if (z) {
                                if (i6 < i8 && i >= i8) {
                                    this.d = i8;
                                    z2 = true;
                                }
                            } else if (i6 > i8 && i <= i8) {
                                this.d = i8;
                                z2 = true;
                            }
                        }
                        if (z2 && this.e < 270 && i5 >= 270) {
                            this.e = 270;
                            z3 = true;
                        }
                        if (z3) {
                            this.b = this.f;
                            onLevelChange(i7);
                        } else {
                            if (!z2) {
                                this.d = i;
                            }
                            this.e = i5;
                            i2 = this.d;
                            if (i2 > 10000) {
                                this.d = 10000 - (i2 - 10000);
                                this.g = false;
                            } else if (i2 < 0) {
                                this.d = -i2;
                                this.g = true;
                            }
                            if (i5 >= 360) {
                                this.e = i5 - 360;
                            }
                        }
                    }
                }
            } else {
                f = 10000.0f;
                f2 = 360.0f;
            }
            float f4 = (this.d / f) * f2;
            if (f4 >= f2) {
                f4 = 359.0f;
            }
            if (f4 == 0.0f) {
                f4 = 1.0f;
            }
            float f5 = f4;
            int i9 = this.c / 2;
            rectF.set((iCenterX - i9) + i3, (iCenterY - i9) + i3, (iCenterX + i9) - i3, (i9 + iCenterY) - i3);
            canvas.drawArc(rectF, this.e, f5, false, paint);
        } else {
            int i10 = this.c / 2;
            rectF.set((iCenterX - i10) + i3, (iCenterY - i10) + i3, (iCenterX + i10) - i3, (i10 + iCenterY) - i3);
            canvas.drawArc(rectF, 270.0f, (this.b / 10000.0f) * 360.0f, false, paint);
        }
        if (b()) {
            invalidateSelf();
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
    public final void invalidateSelf() {
        c3 c3Var = this.q;
        unscheduleSelf(c3Var);
        scheduleSelf(c3Var, 0L);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        if (this.b == 0 && i != 0) {
            this.f = i;
            if (this.e == 270) {
                this.d = i;
            }
        }
        float f = i / 10000.0f;
        if (f == -0.1f) {
            this.j = false;
        } else if (f == -0.2f) {
            this.j = true;
        } else {
            if (i == 0) {
                this.i = System.currentTimeMillis() + 150;
            }
            boolean zB = b();
            j70 j70Var = this.p;
            j70 j70Var2 = this.o;
            if (zB || i < this.b || i == 10000) {
                this.b = i;
                if (this.n != null) {
                    if (Looper.getMainLooper().isCurrentThread()) {
                        this.n.cancel();
                    } else {
                        unscheduleSelf(j70Var2);
                        unscheduleSelf(j70Var);
                        scheduleSelf(j70Var2, 0L);
                    }
                }
            } else {
                if (this.n == null) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    this.n = valueAnimator;
                    valueAnimator.addUpdateListener(new ak(2, this));
                    this.n.setDuration(200L);
                } else if (Looper.getMainLooper().isCurrentThread()) {
                    this.n.cancel();
                } else {
                    unscheduleSelf(j70Var2);
                    unscheduleSelf(j70Var);
                    scheduleSelf(j70Var2, 0L);
                }
                this.n.setIntValues(this.b, i);
                if (Looper.getMainLooper().isCurrentThread()) {
                    this.n.start();
                } else {
                    unscheduleSelf(j70Var2);
                    unscheduleSelf(j70Var);
                    scheduleSelf(j70Var, 0L);
                }
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
        if (getBounds().width() <= 0 || getBounds().width() >= this.r) {
            return;
        }
        this.c = getBounds().width();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        if (rect.width() <= 0 || rect.width() >= this.r) {
            return;
        }
        this.c = rect.width();
    }
}
