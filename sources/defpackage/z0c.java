package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewParent;
import android.widget.OverScroller;
import one.me.mediapicker.crop.CropPhotoScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class z0c extends View {
    public static final /* synthetic */ zv8[] z;
    public final Paint a;
    public final TextPaint b;
    public final int c;
    public final int d;
    public float e;
    public final float f;
    public final int g;
    public final int h;
    public final float i;
    public final int j;
    public final float k;
    public final int l;
    public final int m;
    public final int n;
    public final float o;
    public String p;
    public float q;
    public final zb r;
    public float s;
    public final RectF t;
    public y0c u;
    public final OverScroller v;
    public VelocityTracker w;
    public boolean x;
    public int y;

    static {
        z8b z8bVar = new z8b(z0c.class, "intAngle", "getIntAngle()I");
        zfe.a.getClass();
        z = new zv8[]{z8bVar};
    }

    public z0c(Context context) {
        super(context);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        this.a = paint;
        TextPaint textPaint = new TextPaint(1);
        p90.Q(this, textPaint, q9i.i);
        textPaint.setColor(-1);
        this.b = textPaint;
        this.c = gm0.K(312.0f * yl5.d().getDisplayMetrics().density);
        this.d = gm0.K(36.0f * yl5.d().getDisplayMetrics().density);
        this.f = textPaint.measureText("-");
        this.g = gm0.K(32.0f * yl5.d().getDisplayMetrics().density);
        this.h = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        this.i = yl5.d().getDisplayMetrics().density * 2.0f;
        this.j = gm0.K(yl5.d().getDisplayMetrics().density * 1.0f);
        this.k = yl5.d().getDisplayMetrics().density * 2.0f;
        int iK = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        this.l = iK;
        this.m = iK;
        this.n = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        this.o = 1.0f / getResources().getDisplayMetrics().density;
        this.p = "";
        this.r = new zb(this);
        this.t = new RectF();
        this.v = new OverScroller(context);
        setWillNotDraw(false);
        this.q = 0.0f;
        setIntAngle(0);
        invalidate();
    }

    private final float getDegPerPx() {
        return this.o * 0.11111111f;
    }

    private final int getIntAngle() {
        zv8 zv8Var = z[0];
        return ((Number) this.r.b).intValue();
    }

    private final void setAngleFromScroll(int i) {
        float fU = oc9.u(i * getDegPerPx(), -45.0f, 45.0f);
        if (Math.abs(fU) < 0.05f) {
            fU = 0.0f;
        }
        if (Math.abs(fU - this.q) > 0.001f) {
            this.q = fU;
            setIntAngle((int) fU);
            invalidate();
            y0c y0cVar = this.u;
            if (y0cVar != null) {
                float f = this.q;
                rx4 rx4VarV1 = ((CropPhotoScreen) y0cVar).v1();
                rx4VarV1.x = f;
                a8j.x(rx4VarV1.j, new ew4(f));
            }
        }
    }

    private final void setIntAngle(int i) {
        this.r.B(this, z[0], Integer.valueOf(i));
    }

    public final int a(float f) {
        return gm0.K(f / getDegPerPx());
    }

    public final void b() {
        Float fValueOf;
        if (Math.abs(this.q - 45.0f) <= 0.25f) {
            fValueOf = Float.valueOf(45.0f);
        } else {
            fValueOf = Math.abs(this.q + 45.0f) <= 0.25f ? Float.valueOf(-45.0f) : null;
        }
        if (fValueOf != null) {
            float fFloatValue = fValueOf.floatValue();
            if (fFloatValue == this.q) {
                return;
            }
            this.q = fFloatValue;
            setIntAngle((int) fFloatValue);
            invalidate();
            this.y = a(fFloatValue);
            y0c y0cVar = this.u;
            if (y0cVar != null) {
                float f = this.q;
                rx4 rx4VarV1 = ((CropPhotoScreen) y0cVar).v1();
                rx4VarV1.x = f;
                a8j.x(rx4VarV1.j, new ew4(f));
            }
        }
    }

    public final void c(float f) {
        this.q = f;
        setIntAngle((int) f);
        invalidate();
        this.y = a(f);
        y0c y0cVar = this.u;
        if (y0cVar != null) {
            float f2 = this.q;
            rx4 rx4VarV1 = ((CropPhotoScreen) y0cVar).v1();
            rx4VarV1.x = f2;
            a8j.x(rx4VarV1.j, new ew4(f2));
        }
    }

    @Override // android.view.View
    public final void computeScroll() {
        super.computeScroll();
        OverScroller overScroller = this.v;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            this.y = currX;
            setAngleFromScroll(currX);
            postInvalidateOnAnimation();
            return;
        }
        if (this.x) {
            this.x = false;
            b();
            y0c y0cVar = this.u;
            if (y0cVar != null) {
                a8j.x(((CropPhotoScreen) y0cVar).v1().j, fw4.a);
            }
        }
    }

    public final float getAngle() {
        return this.q;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        Paint paint;
        RectF rectF;
        super.onDraw(canvas);
        float f2 = 2.0f;
        float width = getWidth() / 2.0f;
        float f3 = (-this.q) * this.m;
        int height = getHeight();
        int i = this.n;
        int i2 = height - i;
        int i3 = this.d;
        int i4 = i2 - i3;
        int i5 = (i2 + i4) / 2;
        int i6 = -45;
        while (true) {
            f = this.k;
            paint = this.a;
            rectF = this.t;
            if (i6 >= 46) {
                break;
            }
            int i7 = this.l;
            float f4 = f2;
            float f5 = (i6 * i7) + width + f3;
            boolean z2 = i6 % 5 == 0;
            if (f5 >= 0.0f && f5 <= getWidth()) {
                float f6 = z2 ? 1.0f : 0.5f;
                float fMin = Math.min(f5, getWidth() - f5);
                float f7 = i7 * 4;
                paint.setAlpha(oc9.v((int) (255.0f * f6 * (fMin < f7 ? (oc9.u(fMin / f7, 0.0f, 1.0f) * 0.9f) + 0.1f : 1.0f)), 0, 255));
                int i8 = z2 ? this.g : this.h;
                float f8 = this.j / f4;
                float f9 = i5;
                float f10 = i8 / f4;
                rectF.set(f5 - f8, f9 - f10, f8 + f5, f9 + f10);
                canvas.drawRoundRect(rectF, f, f, paint);
            }
            i6++;
            f2 = f4;
            width = width;
        }
        float f11 = f2;
        float width2 = getWidth();
        float f12 = this.i;
        float f13 = i5;
        rectF.set((width2 - f12) / f11, f13 - (i3 / f11), (getWidth() + f12) / f11, (i3 / f11) + f13);
        paint.setAlpha(255);
        canvas.drawRoundRect(rectF, f, f, paint);
        canvas.drawText(this.p, ((getWidth() - this.e) / f11) - (getIntAngle() < 0 ? Float.valueOf(this.f) : 0).floatValue(), i4 - (i * 2), this.b);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Paint.FontMetrics fontMetrics = this.b.getFontMetrics();
        setMeasuredDimension(this.c, (this.n * 2) + this.d + ((int) (fontMetrics.descent - fontMetrics.ascent)));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x0081  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b8  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        VelocityTracker velocityTracker3;
        float xVelocity;
        VelocityTracker velocityTracker4;
        fw4 fw4Var;
        int iK;
        y0c y0cVar;
        float f;
        y0c y0cVar2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        OverScroller overScroller = this.v;
        if (actionMasked == 0) {
            overScroller.forceFinished(true);
            this.x = false;
            this.y = a(this.q);
            this.s = x;
            y0c y0cVar3 = this.u;
            if (y0cVar3 != null) {
                CropPhotoScreen cropPhotoScreen = (CropPhotoScreen) y0cVar3;
                rx4 rx4VarV1 = cropPhotoScreen.v1();
                rx4VarV1.I(cropPhotoScreen.t1().z());
                a8j.x(rx4VarV1.j, pw4.a);
            }
            VelocityTracker velocityTracker5 = this.w;
            if (velocityTracker5 != null) {
                velocityTracker5.recycle();
            }
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.w = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            }
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        } else if (actionMasked == 1) {
            velocityTracker = this.w;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            velocityTracker2 = this.w;
            if (velocityTracker2 != null) {
                velocityTracker2.computeCurrentVelocity(1000);
            }
            velocityTracker3 = this.w;
            if (velocityTracker3 != null) {
                xVelocity = velocityTracker3.getXVelocity();
            } else {
                xVelocity = 0.0f;
            }
            velocityTracker4 = this.w;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
            }
            this.w = null;
            fw4Var = fw4.a;
            if (actionMasked == 3) {
                y0cVar2 = this.u;
                if (y0cVar2 != null) {
                    a8j.x(((CropPhotoScreen) y0cVar2).v1().j, fw4Var);
                    return true;
                }
            } else {
                iK = gm0.K(oc9.u((-xVelocity) * 0.3f, -4000.0f, 4000.0f));
                if (Math.abs(iK) > 200) {
                    f = this.q;
                    if (Math.abs(f - 45.0f) > 0.25f && Math.abs(f + 45.0f) > 0.25f) {
                        int iA = a(-45.0f);
                        int iA2 = a(45.0f);
                        this.x = true;
                        overScroller.fling(this.y, 0, iK, 0, iA, iA2, 0, 0);
                        postInvalidateOnAnimation();
                        return true;
                    }
                }
                y0cVar = this.u;
                if (y0cVar != null) {
                    a8j.x(((CropPhotoScreen) y0cVar).v1().j, fw4Var);
                    return true;
                }
            }
        } else {
            if (actionMasked == 2) {
                VelocityTracker velocityTracker6 = this.w;
                if (velocityTracker6 != null) {
                    velocityTracker6.addMovement(motionEvent);
                }
                float f2 = this.s - x;
                int iK2 = gm0.K(f2) + this.y;
                this.y = iK2;
                setAngleFromScroll(iK2);
                this.s = x;
                return true;
            }
            if (actionMasked == 3) {
                velocityTracker = this.w;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                velocityTracker2 = this.w;
                if (velocityTracker2 != null) {
                    velocityTracker2.computeCurrentVelocity(1000);
                }
                velocityTracker3 = this.w;
                if (velocityTracker3 != null) {
                    xVelocity = velocityTracker3.getXVelocity();
                } else {
                    xVelocity = 0.0f;
                }
                velocityTracker4 = this.w;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                }
                this.w = null;
                fw4Var = fw4.a;
                if (actionMasked == 3) {
                    y0cVar2 = this.u;
                    if (y0cVar2 != null) {
                        a8j.x(((CropPhotoScreen) y0cVar2).v1().j, fw4Var);
                        return true;
                    }
                } else {
                    iK = gm0.K(oc9.u((-xVelocity) * 0.3f, -4000.0f, 4000.0f));
                    if (Math.abs(iK) > 200) {
                        f = this.q;
                        if (Math.abs(f - 45.0f) > 0.25f) {
                            int iA3 = a(-45.0f);
                            int iA4 = a(45.0f);
                            this.x = true;
                            overScroller.fling(this.y, 0, iK, 0, iA3, iA4, 0, 0);
                            postInvalidateOnAnimation();
                            return true;
                        }
                    }
                    y0cVar = this.u;
                    if (y0cVar != null) {
                        a8j.x(((CropPhotoScreen) y0cVar).v1().j, fw4Var);
                        return true;
                    }
                }
            }
        }
        return true;
    }

    public final void setAngle(float f) {
        this.v.forceFinished(true);
        this.x = false;
        float fU = oc9.u(f, -45.0f, 45.0f);
        this.q = fU;
        setIntAngle((int) fU);
        invalidate();
        this.y = a(fU);
    }

    public final void setListener(y0c y0cVar) {
        this.u = y0cVar;
    }
}
