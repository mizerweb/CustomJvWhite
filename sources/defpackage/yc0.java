package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* JADX INFO: loaded from: classes3.dex */
public final class yc0 extends View implements eph {
    public final int[] a;
    public final float b;
    public final float c;
    public final float d;
    public float e;
    public ArrayList f;
    public boolean g;
    public final Paint h;
    public final Paint i;
    public final Paint j;
    public final Paint k;
    public final Path l;
    public final ValueAnimator m;
    public float n;
    public long o;
    public boolean p;
    public wc0 q;

    public yc0(Context context) {
        super(context, null, 0);
        this.a = new int[2];
        this.b = yl5.d().getDisplayMetrics().density * 2.0f;
        float f = yl5.d().getDisplayMetrics().density * 2.0f;
        this.c = f;
        float f2 = yl5.d().getDisplayMetrics().density * 2.0f;
        this.d = f2;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(f2);
        this.h = paint;
        this.i = new Paint(paint);
        Paint paint2 = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.j = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        this.k = paint3;
        this.l = new Path();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, -(f2 + f));
        valueAnimatorOfFloat.setDuration(75L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ak(4, this));
        this.m = valueAnimatorOfFloat;
        setLayerType(1, null);
        setLayoutDirection(mw7.d(getContext().getResources().getConfiguration().getLayoutDirection() == 1 ? 1 : 2));
        if (yab.g0(this)) {
            setScaleX(-1.0f);
        }
        onThemeChanged(pq3.j.h(this));
    }

    public final void a() {
        ArrayList arrayList = this.f;
        if (getMeasuredWidth() == 0 || arrayList == null || arrayList.isEmpty()) {
            return;
        }
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float width = getWidth();
        float f = this.d;
        float fK = (width - (f / 2.0f)) - gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            float fFloatValue = ((Number) arrayList.get(size)).floatValue() / 2.0f;
            Path path = this.l;
            path.moveTo(fK, measuredHeight - fFloatValue);
            path.lineTo(fK, fFloatValue + measuredHeight);
            fK = (fK - f) - this.c;
        }
    }

    public final float b(MotionEvent motionEvent) {
        int[] iArr = this.a;
        getLocationOnScreen(iArr);
        float rawX = motionEvent.getRawX();
        int i = iArr[0];
        int width = getWidth();
        if (width == 0) {
            return 0.0f;
        }
        if (rawX >= i + width) {
            return 1.0f;
        }
        float f = i;
        if (rawX <= f) {
            return 0.0f;
        }
        return (rawX - f) / width;
    }

    public final long getDuration() {
        return this.o;
    }

    public final int getPeaksCount() {
        float f = r5a.f(6.0f, yl5.d().getDisplayMetrics().density, 2, getMeasuredWidth());
        float f2 = this.c;
        return (int) ((f + f2) / (f2 + this.d));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f = this.d;
        Path path = this.l;
        if (path.isEmpty()) {
            return;
        }
        float f2 = this.e;
        Paint paint = this.h;
        if (f2 == 0.0f && !this.p) {
            if (this.g) {
                canvas.drawPath(path, paint);
                return;
            }
            int iSave = canvas.save();
            try {
                float f3 = f / 2.0f;
                canvas.clipRect(gm0.K(yl5.d().getDisplayMetrics().density * 6.0f) + f3, 0.0f, (canvas.getWidth() - gm0.K(6.0f * yl5.d().getDisplayMetrics().density)) - f3, canvas.getHeight());
                canvas.translate(this.n, 0.0f);
                canvas.drawPath(path, paint);
                return;
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float f4 = (this.e * r5a.f(6.0f, yl5.d().getDisplayMetrics().density, 2, getWidth())) + (yl5.d().getDisplayMetrics().density * 2.0f) + gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
        float f5 = yl5.d().getDisplayMetrics().density * 4.0f;
        if (this.p) {
            f5 += yl5.d().getDisplayMetrics().density * 2.0f;
        }
        float f6 = (yl5.d().getDisplayMetrics().density * 2.0f) + f5;
        float width = f4 > ((float) getWidth()) - f6 ? getWidth() - f6 : f4;
        int iSave2 = canvas.save();
        try {
            canvas.clipRect(0.0f, 0.0f, f4, canvas.getHeight());
            canvas.drawPath(path, this.i);
            canvas.restoreToCount(iSave2);
            int iSave3 = canvas.save();
            try {
                canvas.clipRect(f4, 0.0f, canvas.getWidth(), canvas.getHeight());
                canvas.drawPath(path, paint);
                canvas.restoreToCount(iSave3);
                canvas.drawCircle(width, measuredHeight, (yl5.d().getDisplayMetrics().density * 2.0f) + f5, this.k);
                canvas.drawCircle(width, measuredHeight, f5, this.j);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave3);
                throw th;
            }
        } catch (Throwable th2) {
            canvas.restoreToCount(iSave2);
            throw th2;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        wc0 wc0Var;
        int peaksCount = getPeaksCount();
        if (peaksCount <= 0 || i2 <= 0 || (wc0Var = this.q) == null) {
            return;
        }
        float f = i2;
        float f2 = this.b;
        xcj xcjVar = ((ycj) ((phf) wc0Var).c).c;
        if (xcjVar != null) {
            RecordControlsWidget recordControlsWidget = (RecordControlsWidget) ((ft0) xcjVar).a;
            zv8[] zv8VarArr = RecordControlsWidget.x1;
            vc0 vc0VarH = recordControlsWidget.I1().H();
            Integer num = vc0VarH.n;
            if (num != null && num.intValue() == peaksCount && cqk.c(vc0VarH.l, f) && cqk.c(vc0VarH.m, f2)) {
                gm0.n(vc0.class.getName(), "setPeaksConfiguration: has same peaks configuration");
            } else {
                yab.i0(vc0VarH.g, null, 0, new uc0(vc0VarH, peaksCount, f, f2, null), 3);
            }
        }
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.h.setColor(this.g ? tre.I0(-1, 0.5f) : tre.I0(kbcVar.getIcon().h, 0.5f));
        this.j.setColor(-1);
        this.k.setColor(kbcVar.getIcon().h);
        this.i.setColor(-1);
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
    
        if (r0 != 3) goto L34;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            float r0 = r5.e
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L11
            boolean r0 = r5.p
            if (r0 == 0) goto Lc
            goto L11
        Lc:
            boolean r5 = super.onTouchEvent(r6)
            return r5
        L11:
            int r0 = r6.getAction()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L96
            if (r0 == r2) goto L54
            r3 = 2
            if (r0 == r3) goto L23
            r3 = 3
            if (r0 == r3) goto L54
            goto L9a
        L23:
            boolean r0 = r5.p
            if (r0 != 0) goto L28
            goto L9a
        L28:
            float r0 = r5.b(r6)
            r5.e = r0
            wc0 r0 = r5.q
            if (r0 == 0) goto L50
            float r6 = r5.b(r6)
            phf r0 = (defpackage.phf) r0
            java.lang.Object r1 = r0.b
            yc0 r1 = (defpackage.yc0) r1
            long r3 = r1.getDuration()
            float r1 = (float) r3
            float r1 = r1 * r6
            long r3 = (long) r1
            java.lang.String r6 = defpackage.mxl.b(r3)
            java.lang.Object r0 = r0.c
            ycj r0 = (defpackage.ycj) r0
            android.widget.TextView r0 = r0.j
            r0.setText(r6)
        L50:
            r5.postInvalidate()
            return r2
        L54:
            r5.p = r1
            wc0 r0 = r5.q
            if (r0 == 0) goto L8e
            float r6 = r5.b(r6)
            phf r0 = (defpackage.phf) r0
            java.lang.Object r0 = r0.c
            ycj r0 = (defpackage.ycj) r0
            xcj r0 = r0.c
            if (r0 == 0) goto L8e
            ft0 r0 = (defpackage.ft0) r0
            java.lang.Object r0 = r0.a
            one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget r0 = (one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget) r0
            zv8[] r3 = one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget.x1
            jce r0 = r0.I1()
            gjg r3 = r0.I()
            mjg r3 = (defpackage.mjg) r3
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            d89 r0 = r0.J()
            float r3 = (float) r3
            float r6 = r6 * r3
            long r3 = (long) r6
            r0.seekTo(r3)
        L8e:
            android.view.ViewParent r5 = r5.getParent()
            r5.requestDisallowInterceptTouchEvent(r1)
            return r2
        L96:
            boolean r6 = r5.g
            if (r6 != 0) goto L9b
        L9a:
            return r1
        L9b:
            r5.p = r2
            android.view.ViewParent r5 = r5.getParent()
            r5.requestDisallowInterceptTouchEvent(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yc0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setLinesColor(int i) {
        this.h.setColor(i);
        invalidate();
    }

    public final void setListener(wc0 wc0Var) {
        this.q = wc0Var;
    }

    public final void setListeningData(float f) {
        if (this.p) {
            return;
        }
        this.e = f;
        postInvalidate();
    }

    public final void setShiftOffset(long j) {
        this.m.setDuration(j);
    }
}
