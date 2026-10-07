package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g36 extends View implements ScaleGestureDetector.OnScaleGestureListener {
    public final ArrayList a;
    public final ScaleGestureDetector b;
    public f36 c;
    public final Matrix d;
    public final Matrix e;
    public Float f;
    public Float g;
    public final float[] h;
    public final float i;
    public boolean j;
    public Rect k;
    public final RectF l;
    public final Rect m;
    public final RectF n;
    public final Path o;
    public boolean p;
    public final float q;
    public boolean r;
    public e36 s;

    public g36(Context context) {
        super(context);
        this.a = new ArrayList();
        this.d = new Matrix();
        this.e = new Matrix();
        this.h = new float[9];
        this.i = 3.0f;
        this.j = true;
        this.l = new RectF();
        this.m = new Rect();
        this.n = new RectF();
        this.o = new Path();
        this.p = false;
        this.q = yl5.b(12);
        this.r = false;
        this.b = new ScaleGestureDetector(getContext(), this);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0067 A[PHI: r1 r2
  0x0067: PHI (r1v11 float) = (r1v4 float), (r1v5 float) binds: [B:19:0x0065, B:22:0x0071] A[DONT_GENERATE, DONT_INLINE]
  0x0067: PHI (r2v5 int) = (r2v1 int), (r2v2 int) binds: [B:19:0x0065, B:22:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    private Matrix getCorrectionMatrix() {
        Matrix matrix;
        float f;
        float f2;
        Matrix matrix2 = this.d;
        float[] fArr = this.h;
        matrix2.getValues(fArr);
        float f3 = fArr[0];
        if (f3 < 1.0f) {
            Matrix matrix3 = new Matrix();
            matrix3.setScale(1.0f, 1.0f, 0.5f, 0.5f);
            return matrix3;
        }
        float f4 = this.i;
        if (f3 > f4) {
            matrix = new Matrix(matrix2);
            float f5 = f4 / f3;
            matrix.postScale(f5, f5, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        } else {
            matrix = null;
        }
        Rect rect = this.k;
        Rect rect2 = this.m;
        if (rect != null) {
            rect2.set(rect);
        } else {
            rect2.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
        RectF rectF = this.n;
        rectF.set(rect2);
        if (matrix != null) {
            matrix.mapRect(rectF);
        } else {
            matrix2.mapRect(rectF);
        }
        float f6 = rectF.left;
        int i = rect2.left;
        if (f6 > i) {
            f = i - f6;
        } else {
            f6 = rectF.right;
            i = rect2.right;
            if (f6 < i) {
                f = i - f6;
            } else {
                f = 0.0f;
            }
        }
        float f7 = rectF.top;
        int i2 = rect2.top;
        if (f7 > i2) {
            f2 = i2 - f7;
        } else {
            float f8 = rectF.bottom;
            int i3 = rect2.bottom;
            f2 = f8 < ((float) i3) ? i3 - f8 : 0.0f;
        }
        if (f == 0.0f && f2 == 0.0f) {
            return matrix;
        }
        if (matrix == null) {
            matrix = new Matrix(matrix2);
        }
        matrix.postTranslate(f, f2);
        return matrix;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        canvas.save();
        canvas.concat(this.d);
        Rect rect = this.k;
        if (rect != null) {
            RectF rectF = this.l;
            rectF.set(rect);
            Path path = this.o;
            path.reset();
            float f = this.q;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
            canvas.clipPath(path);
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((x26) it.next()).draw(canvas);
        }
        canvas.restore();
    }

    public Rect getBounds() {
        Rect rect = this.k;
        return rect != null ? rect : new Rect(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public List<x26> getLayers() {
        return Collections.unmodifiableList(this.a);
    }

    public Rect getResultBounds() {
        e36 e36Var;
        Rect rect = this.k;
        if (rect == null) {
            rect = new Rect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.p && (e36Var = this.s) != null) {
            b36 b36Var = (b36) e36Var;
            b36Var.getClass();
            int i = rect.right;
            int i2 = rect.left;
            int i3 = i - i2;
            int i4 = rect.bottom;
            int i5 = rect.top;
            int i6 = i4 - i5;
            View view = b36Var.a;
            if (i6 >= i3) {
                rect.top = view.getHeight() + i5;
                rect.bottom -= b36Var.b.getHeight();
                return rect;
            }
            rect.left = view.getWidth() + i2;
            rect.right -= b36Var.b.getWidth();
        }
        return rect;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float focusX = scaleGestureDetector.getFocusX();
        float focusY = scaleGestureDetector.getFocusY();
        Matrix matrix = this.d;
        matrix.postScale(scaleFactor, scaleFactor, focusX, focusY);
        Float f = this.f;
        if (f != null && this.g != null) {
            matrix.postTranslate(focusX - f.floatValue(), focusY - this.g.floatValue());
        }
        matrix.invert(this.e);
        this.f = Float.valueOf(focusX);
        this.g = Float.valueOf(focusY);
        invalidate();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        f36 f36Var = this.c;
        if (f36Var == null) {
            return true;
        }
        c36 c36Var = (c36) f36Var;
        h36 h36Var = c36Var.c;
        if (h36Var != null) {
            h36Var.f().a(c36Var.a);
        }
        c36Var.c = null;
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.f = null;
        this.g = null;
        Matrix correctionMatrix = getCorrectionMatrix();
        if (correctionMatrix != null) {
            Matrix matrix = this.d;
            final float[] fArr = this.h;
            matrix.getValues(fArr);
            final float[] fArr2 = new float[9];
            correctionMatrix.getValues(fArr2);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            final float[] fArr3 = new float[9];
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: d36
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Float f = (Float) valueAnimator.getAnimatedValue();
                    int i = 0;
                    while (true) {
                        float[] fArr4 = fArr3;
                        if (i >= 9) {
                            g36 g36Var = this.a;
                            g36Var.d.setValues(fArr4);
                            g36Var.invalidate();
                            return;
                        } else {
                            fArr4[i] = (f.floatValue() * fArr2[i]) + ((1.0f - f.floatValue()) * fArr[i]);
                            i++;
                        }
                    }
                }
            });
            valueAnimatorOfFloat.addListener(new al(this, fArr2, false, 1));
            valueAnimatorOfFloat.setDuration(150L);
            valueAnimatorOfFloat.start();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a9  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        ScaleGestureDetector scaleGestureDetector;
        e36 e36Var;
        f36 f36Var;
        f36 f36Var2 = this.c;
        if (f36Var2 != null && !((c36) f36Var2).m) {
            return false;
        }
        if (!this.p || (e36Var = this.s) == null) {
            z = this.j;
            scaleGestureDetector = this.b;
            if (z) {
                scaleGestureDetector.onTouchEvent(motionEvent);
            }
            int pointerCount = motionEvent.getPointerCount();
            if (this.c == null && (!this.j || !scaleGestureDetector.isInProgress())) {
                Matrix matrix = this.e;
                if (pointerCount == 1) {
                    motionEvent.transform(matrix);
                    ((c36) this.c).d(motionEvent);
                    this.r = true;
                    return true;
                }
                if (this.r) {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 3, 0.0f, 0.0f, 0);
                    motionEventObtain.transform(matrix);
                    ((c36) this.c).d(motionEventObtain);
                    motionEventObtain.recycle();
                    this.r = false;
                    return true;
                }
            } else if (scaleGestureDetector.isInProgress()) {
                this.r = false;
            }
        } else {
            b36 b36Var = (b36) e36Var;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            View view = b36Var.a;
            Rect rect = b36Var.e;
            view.getHitRect(rect);
            View view2 = b36Var.b;
            Rect rect2 = b36Var.f;
            view2.getHitRect(rect2);
            if (!rect.contains(x, y) && !rect2.contains(x, y)) {
                z = this.j;
                scaleGestureDetector = this.b;
                if (z) {
                    scaleGestureDetector.onTouchEvent(motionEvent);
                }
                int pointerCount2 = motionEvent.getPointerCount();
                if (this.c == null) {
                    if (scaleGestureDetector.isInProgress()) {
                        this.r = false;
                    }
                } else if (scaleGestureDetector.isInProgress()) {
                    this.r = false;
                }
            } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (f36Var = this.c) != null) {
                ((c36) f36Var).d(motionEvent);
                return true;
            }
        }
        return true;
    }

    public void setBoundingListener(e36 e36Var) {
        this.s = e36Var;
    }

    public void setBounds(Rect rect) {
        this.k = rect;
        invalidate();
    }

    public void setDrawStickerEnabled(boolean z) {
        if (z == this.p) {
            return;
        }
        this.p = z;
        e36 e36Var = this.s;
        if (e36Var != null) {
            ((b36) e36Var).setDrawStickerEnabled(z);
        }
    }

    public void setListener(f36 f36Var) {
        this.c = f36Var;
    }

    public void setZoomEnabled(boolean z) {
        this.j = z;
    }
}
