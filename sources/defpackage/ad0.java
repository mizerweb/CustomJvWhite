package defpackage;

import android.animation.IntEvaluator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class ad0 extends View implements eph {
    public final int[] a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public final Path f;
    public final Path g;
    public final byte[] h;
    public byte[] i;
    public byte[] j;
    public byte[] k;
    public long l;
    public long m;
    public boolean n;
    public int o;
    public boolean p;
    public boolean q;
    public float r;
    public boolean s;
    public boolean t;
    public boolean u;
    public zc0 v;
    public final RectF w;
    public final RectF x;

    public ad0(Context context) {
        super(context, null, 0);
        this.a = new int[2];
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(yl5.d().getDisplayMetrics().density * 2.0f);
        this.b = paint;
        this.c = new Paint(paint);
        Paint paint2 = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        this.e = paint3;
        this.f = new Path();
        this.g = new Path();
        this.h = new byte[0];
        this.w = new RectF();
        this.x = new RectF();
        setLayoutDirection(mw7.d(getContext().getResources().getConfiguration().getLayoutDirection() == 1 ? 1 : 2));
        if (yab.g0(this)) {
            setScaleX(-1.0f);
        }
    }

    public final void a(int i, boolean z) {
        int iIntValue;
        byte[] bArr = z ? this.k : this.j;
        Path path = z ? this.g : this.f;
        if (bArr == null || this.o != i) {
            int iD = (int) ((((yl5.d().getDisplayMetrics().density * 2.0f) + i) - c0a.d(6.0f, yl5.d().getDisplayMetrics().density, 2)) / ((yl5.d().getDisplayMetrics().density * 2.0f) + (yl5.d().getDisplayMetrics().density * 2.0f)));
            if (iD < 0) {
                gm0.Y("ad0", "Width is very small " + i);
                bArr = this.h;
            } else {
                byte[] bArr2 = this.i;
                if (bArr2 != 0) {
                    if (bArr2.length != 0) {
                        IntEvaluator intEvaluator = new IntEvaluator();
                        byte[] bArr3 = new byte[iD];
                        for (int i2 = 0; i2 < iD; i2++) {
                            if (i2 == 0 || bArr2.length == 1) {
                                iIntValue = bArr2[0];
                            } else if (i2 == iD - 1) {
                                iIntValue = bArr2[bArr2.length - 1];
                            } else {
                                float length = (i2 / iD) * (bArr2.length - 1);
                                int i3 = (int) length;
                                int i4 = i3 + 1;
                                iIntValue = (i3 >= bArr2.length - 1 || i4 >= bArr2.length - 1) ? 0 : intEvaluator.evaluate(length - i3, Integer.valueOf(bArr2[i3]), Integer.valueOf(bArr2[i4])).intValue();
                            }
                            bArr3[i2] = (byte) iIntValue;
                        }
                        bArr2 = bArr3;
                    }
                    bArr = bArr2;
                } else {
                    bArr = null;
                }
            }
            this.o = i;
        }
        float measuredHeight = getMeasuredHeight() / 2.0f;
        path.reset();
        if (bArr != 0 && bArr.length != 0) {
            float fK = ((yl5.d().getDisplayMetrics().density * 2.0f) / 2.0f) + gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
            for (int i5 : bArr) {
                float measuredHeight2 = (getMeasuredHeight() / 127.0f) * i5;
                if (measuredHeight2 < yl5.d().getDisplayMetrics().density * 5.0f) {
                    measuredHeight2 = yl5.d().getDisplayMetrics().density * 5.0f;
                }
                float f = measuredHeight2 / 2.0f;
                path.moveTo(fK, measuredHeight - f);
                path.lineTo(fK, f + measuredHeight);
                fK += (yl5.d().getDisplayMetrics().density * 2.0f) + (yl5.d().getDisplayMetrics().density * 2.0f);
            }
        }
        path.computeBounds(z ? this.x : this.w, true);
        if (z) {
            this.k = bArr;
        } else {
            this.j = bArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0015  */
    public final float b(MotionEvent motionEvent) {
        float f;
        int[] iArr = this.a;
        getLocationOnScreen(iArr);
        int i = iArr[0];
        float rawX = motionEvent.getRawX();
        int width = getWidth();
        if (width == 0) {
            f = 0.0f;
        } else if (rawX >= i + width) {
            f = 1.0f;
        } else {
            float f2 = i;
            if (rawX <= f2) {
                f = 0.0f;
            } else {
                f = (rawX - f2) / width;
            }
        }
        return f == 0.0f ? 1.0f / (this.l - 1) : f;
    }

    public final void c(Canvas canvas) {
        if (this.n || this.t) {
            float f = ((this.m / this.l) * r5a.f(6.0f, yl5.d().getDisplayMetrics().density, 2, getWidth())) + gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
            float f2 = yl5.d().getDisplayMetrics().density * 4.0f;
            if (this.t) {
                f2 += yl5.d().getDisplayMetrics().density * 2.0f;
            }
            float f3 = (yl5.d().getDisplayMetrics().density * 2.0f) + f2;
            float fU = oc9.u(f, f3, getWidth() - f3);
            canvas.drawCircle(fU, getHeight() / 2.0f, (yl5.d().getDisplayMetrics().density * 2.0f) + f2, this.e);
            canvas.drawCircle(fU, getHeight() / 2.0f, f2, this.d);
        }
    }

    public final void d(Canvas canvas, Path path, float f, float f2) {
        Paint paint = this.b;
        Paint paint2 = this.c;
        float height = getHeight() / 2.0f;
        float f3 = ((this.m / this.l) * r5a.f(6.0f, yl5.d().getDisplayMetrics().density, 2, getWidth())) + gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
        int iSave = canvas.save();
        canvas.scale(f, 1.0f, 0.0f, height);
        try {
            float height2 = canvas.getHeight();
            int iSave2 = canvas.save();
            canvas.clipRect(0.0f, 0.0f, f3, height2);
            try {
                int alpha = paint2.getAlpha();
                paint2.setAlpha(oc9.v((int) (alpha * f2), 0, 255));
                canvas.drawPath(path, paint2);
                paint2.setAlpha(alpha);
                canvas.restoreToCount(iSave2);
                float width = canvas.getWidth();
                float height3 = canvas.getHeight();
                iSave = canvas.save();
                canvas.clipRect(f3, 0.0f, width, height3);
                try {
                    int alpha2 = paint.getAlpha();
                    paint.setAlpha(oc9.v((int) (alpha2 * f2), 0, 255));
                    canvas.drawPath(path, paint);
                    paint.setAlpha(alpha2);
                    canvas.restoreToCount(iSave);
                } finally {
                    canvas.restoreToCount(iSave);
                }
            } catch (Throwable th) {
                canvas.restoreToCount(iSave2);
                throw th;
            }
        } catch (Throwable th2) {
            canvas.restoreToCount(iSave);
            throw th2;
        }
    }

    public final void e(long j, boolean z, byte[] bArr) {
        this.i = bArr;
        this.j = null;
        this.l = j;
        this.u = z;
        this.m = 0L;
        this.o = 0;
        onThemeChanged(pq3.j.h(this));
        Path path = this.f;
        if (!path.isEmpty()) {
            path.reset();
        }
        Path path2 = this.g;
        if (!path2.isEmpty()) {
            path2.reset();
        }
        requestLayout();
        postInvalidate();
    }

    public final void f(float f, boolean z, boolean z2) {
        long j = (long) (this.l * f);
        boolean z3 = (this.m == j && this.n == z) ? false : true;
        if (!this.t || z2) {
            if ((z2 || f < 1.0f) && z3) {
                this.m = j;
                this.n = z;
                if (!z) {
                    this.t = false;
                }
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z = this.q;
        Path path = this.f;
        Path path2 = this.g;
        if (!z) {
            if (this.u && !path2.isEmpty()) {
                path = path2;
            }
            d(canvas, path, 1.0f, 1.0f);
            c(canvas);
            return;
        }
        float fU = oc9.u(this.r / 1.0f, 0.0f, 1.0f);
        d(canvas, path, lk.a(1.0f, getMeasuredWidth() / this.w.width(), fU), 1.0f - fU);
        Integer num = 0;
        float fU2 = oc9.u((this.r - num.floatValue()) / 0.7f, 0.0f, 1.0f);
        d(canvas, path2, lk.a(getMeasuredWidth() / this.x.width(), 1.0f, fU2), fU2);
        c(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.i == null) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        setMeasuredDimension(size, View.MeasureSpec.getSize(i2));
        if (this.q || Math.abs(size - this.o) <= gm0.K(4.0f * yl5.d().getDisplayMetrics().density)) {
            return;
        }
        a(size, this.u);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        xac xacVarG = f55.g(pq3.j.h(this).f(), this.s);
        tac tacVar = xacVarG.a;
        this.b.setColor(tacVar.c);
        int i = tacVar.b;
        this.d.setColor(i);
        this.e.setColor(xacVarG.d.d);
        this.c.setColor(i);
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001c, code lost:
    
        if (r0 != 3) goto L36;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            boolean r0 = r4.n
            if (r0 != 0) goto Le
            boolean r0 = r4.t
            if (r0 == 0) goto L9
            goto Le
        L9:
            boolean r4 = super.onTouchEvent(r5)
            return r4
        Le:
            int r0 = r5.getAction()
            r1 = 1
            if (r0 == 0) goto L4d
            r2 = 0
            if (r0 == r1) goto L36
            r3 = 2
            if (r0 == r3) goto L1f
            r3 = 3
            if (r0 == r3) goto L36
            goto L5f
        L1f:
            boolean r0 = r4.t
            if (r0 != 0) goto L24
            goto L5f
        L24:
            boolean r0 = r4.p
            if (r0 == 0) goto L2a
            r4.p = r2
        L2a:
            zc0 r0 = r4.v
            if (r0 == 0) goto L5f
            float r4 = r4.b(r5)
            r0.j(r4)
            return r1
        L36:
            r4.p = r2
            r4.t = r2
            zc0 r0 = r4.v
            if (r0 == 0) goto L45
            float r5 = r4.b(r5)
            r0.f(r5)
        L45:
            android.view.ViewParent r4 = r4.getParent()
            r4.requestDisallowInterceptTouchEvent(r2)
            return r1
        L4d:
            r4.p = r1
            r4.t = r1
            android.view.ViewParent r0 = r4.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
            zc0 r0 = r4.v
            if (r0 == 0) goto L5f
            r4.b(r5)
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ad0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setExpanded(boolean z) {
        this.u = z;
    }

    public final void setInInput(boolean z) {
    }

    public final void setIncomingMessage(boolean z) {
        this.s = z;
    }

    public final void setListener(zc0 zc0Var) {
        this.v = zc0Var;
    }
}
