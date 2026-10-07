package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.SweepGradient;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class fsg extends ViewGroup implements eph {
    public final int a;
    public final float b;
    public int c;
    public final float d;
    public int e;
    public boolean f;
    public boolean g;
    public final Paint h;
    public final Paint i;
    public final int j;
    public final int k;
    public af7 l;
    public final Paint m;
    public final float n;
    public final float o;
    public int p;

    public fsg(Context context, int i) {
        super(context);
        int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        this.a = iK;
        float f = i;
        this.b = -(0.33333334f * f);
        this.c = iK;
        this.d = yl5.d().getDisplayMetrics().density * (-5.0f);
        Paint paint = new Paint(1);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.h = paint;
        Paint paint2 = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(yl5.d().getDisplayMetrics().density * 4.0f);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        float f2 = f / 2.0f;
        paint2.setShader(new SweepGradient(f2, f2, ycf.q, (float[]) null));
        this.i = paint2;
        this.j = gm0.K(yl5.d().getDisplayMetrics().density * 62.0f);
        this.k = gm0.K(88.0f * yl5.d().getDisplayMetrics().density);
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        paint3.setStrokeWidth(yl5.d().getDisplayMetrics().density * 4.0f);
        paint3.setStrokeCap(cap);
        this.m = paint3;
        float fK = gm0.K(62.0f * yl5.d().getDisplayMetrics().density) / 2.0f;
        this.n = fK;
        this.o = fK * fK;
        this.p = 3;
        setClipChildren(false);
        onThemeChanged(pq3.j.h(this));
    }

    public final int a(float f) {
        float fU = oc9.u((oc9.u(f, 0.0f, 1.0f) - 0.2f) / 0.8f, 0.0f, 1.0f);
        int i = this.a;
        return (int) c0a.c(this.b, i, fU, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        if (this.c > this.d) {
            for (int childCount = getChildCount() - 1; -1 < childCount; childCount--) {
                View childAt = getChildAt(childCount);
                esg esgVar = childAt instanceof esg ? (esg) childAt : null;
                if (esgVar != null && esgVar.getAlpha() > 0.0f) {
                    drawChild(canvas, esgVar, getDrawingTime());
                }
            }
            return;
        }
        int childCount2 = getChildCount();
        while (true) {
            childCount2--;
            f = this.n;
            if (-1 >= childCount2) {
                break;
            }
            View childAt2 = getChildAt(childCount2);
            esg esgVar2 = childAt2 instanceof esg ? (esg) childAt2 : null;
            if (esgVar2 != null && esgVar2.getAlpha() > 0.0f) {
                float translationX = esgVar2.getTranslationX() + (esgVar2.getWidth() / 2.0f) + esgVar2.getLeft();
                Paint paint = this.i;
                float strokeWidth = (paint.getStrokeWidth() / 2.0f) + f;
                if (esgVar2.e) {
                    paint = this.m;
                }
                canvas.drawCircle(translationX, f, strokeWidth, paint);
            }
        }
        for (int childCount3 = getChildCount() - 1; -1 < childCount3; childCount3--) {
            View childAt3 = getChildAt(childCount3);
            esg esgVar3 = childAt3 instanceof esg ? (esg) childAt3 : null;
            if (esgVar3 != null && esgVar3.getAlpha() > 0.0f) {
                canvas.drawCircle(esgVar3.getTranslationX() + (esgVar3.getWidth() / 2.0f) + esgVar3.getLeft(), f, f, this.h);
                drawChild(canvas, esgVar3, getDrawingTime());
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && this.c <= this.d) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int i = 0;
            for (int childCount = getChildCount() - 1; -1 < childCount; childCount--) {
                View childAt = getChildAt(childCount);
                esg esgVar = childAt instanceof esg ? (esg) childAt : null;
                if (esgVar != null) {
                    esg esgVar2 = esgVar.getAlpha() > 0.0f ? esgVar : null;
                    if (esgVar2 != null) {
                        if (i < this.p) {
                            float translationX = x - (esgVar2.getTranslationX() + ((esgVar2.getWidth() / 2.0f) + esgVar2.getLeft()));
                            float f = y - this.n;
                            if ((f * f) + (translationX * translationX) <= this.o) {
                                af7 af7Var = this.l;
                                if (af7Var != null) {
                                    af7Var.invoke();
                                }
                                return true;
                            }
                        }
                        i++;
                    } else {
                        continue;
                    }
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int measuredWidth = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            qyj.M(childAt, measuredWidth, 0, 0, 12);
            measuredWidth += childAt.getMeasuredWidth();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        int i3 = 0;
        int measuredWidth = 0;
        while (i3 < childCount) {
            View childAt = getChildAt(i3);
            childAt.measure(View.MeasureSpec.makeMeasureSpec(this.j, 1073741824), i2);
            measuredWidth += childAt.getMeasuredWidth() + (i3 > 0 ? this.a : 0);
            i3++;
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(this.k, 1073741824));
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        setBackgroundColor(0);
        this.h.setColor(kbcVar.b().c);
        this.m.setColor(((rac) kbcVar.d().a).b);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            eph ephVar = childAt instanceof eph ? (eph) childAt : null;
            if (ephVar != null) {
                ephVar.onThemeChanged(kbcVar);
            }
        }
    }

    public final void setCollapsedShiftEnabled(boolean z) {
        this.g = z;
    }

    public final void setFirstItemPartiallyVisible(boolean z) {
        this.f = z;
    }

    public final void setOffsetLeft(int i) {
        this.e = i;
        setTranslationX(i);
    }

    public final void setOnCollapsedClickListener(af7 af7Var) {
        this.l = af7Var;
    }

    public final void setProgress(float f) {
        int iA = a(f);
        this.c = iA;
        float f2 = iA;
        float f3 = this.a;
        float f4 = this.d;
        float f5 = f3 - f4;
        float fU = 0.0f;
        int iU = f5 == 0.0f ? 0 : (int) oc9.u(((f2 - f4) / f5) * 255.0f, 0.0f, 255.0f);
        float f6 = this.c;
        float f7 = this.b;
        float f8 = f7 - f4;
        int iU2 = f8 == 0.0f ? 0 : (int) oc9.u(((f6 - f4) / f8) * 255.0f, 0.0f, 255.0f);
        this.i.setAlpha(iU2);
        this.m.setAlpha(iU2);
        float fU2 = oc9.u(1.0f - (f / 0.2f), 0.0f, 1.0f);
        float f9 = f4 - f7;
        if (this.g && f9 != 0.0f) {
            fU = oc9.u((this.c - f7) / f9, 0.0f, 1.0f);
        }
        float f10 = (this.j + f4) * fU;
        int childCount = getChildCount();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            esg esgVar = childAt instanceof esg ? (esg) childAt : null;
            if (esgVar != null) {
                if (i3 > 0) {
                    f10 += this.c;
                }
                esgVar.setTranslationX(f10);
                esgVar.setStoriesStrokeAlpha(iU);
                esgVar.setStoriesBadgeAlpha(iU);
                if (!(this.f && i == 0) && (i2 = i2 + 1) <= this.p) {
                    esgVar.setAlpha(1.0f);
                    esgVar.setTitleAlpha(fU2);
                } else {
                    esgVar.setAlpha(fU2);
                    esgVar.setTitleAlpha(1.0f);
                }
                i++;
            }
        }
        setTranslationX((1.0f - f) * this.e);
        invalidate();
    }
}
