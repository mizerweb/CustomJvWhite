package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class g0d extends FrameLayout implements ScaleGestureDetector.OnScaleGestureListener {
    public final ScaleGestureDetector a;
    public f0d b;
    public float c;
    public float d;
    public float e;
    public float f;
    public boolean g;
    public final Paint h;
    public final Rect i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public ValueAnimator p;
    public AnimatorSet q;
    public float r;
    public boolean s;
    public lwh t;
    public lwh u;

    public g0d(Context context) {
        super(context);
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(getContext(), this);
        this.a = scaleGestureDetector;
        this.b = f0d.b;
        this.d = 1.0f;
        Paint paint = new Paint();
        this.h = paint;
        this.i = new Rect();
        this.r = 0.9f;
        this.s = true;
        paint.setColor(-1);
        paint.setStrokeWidth(40.0f);
        paint.setStyle(Paint.Style.STROKE);
        scaleGestureDetector.setQuickScaleEnabled(false);
    }

    private final f0d getStateByScale() {
        f0d f0dVar = this.b;
        float f = this.d;
        f0d f0dVar2 = f0d.a;
        f0d f0dVar3 = f0d.b;
        if (f0dVar == f0dVar3) {
            return f > c0a.c(this.f, 1.0f, 0.25f, 1.0f) ? f0dVar2 : f0dVar3;
        }
        float f2 = this.f;
        return f < f2 - ((f2 - 1.0f) * 0.25f) ? f0dVar3 : f0dVar2;
    }

    private final View getVideoView() {
        Object next;
        y1 y1Var = new y1(2, this);
        while (y1Var.hasNext()) {
            next = y1Var.next();
            if (((View) next) instanceof x5j) {
                return (View) next;
            }
        }
        next = null;
        return (View) next;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.n, this.o);
        float f = this.d;
        canvas.scale(f, f, this.j, this.k);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.g) {
            canvas.drawRect(this.i, this.h);
        }
    }

    public final lwh getDoubleTapSeekEventDelegate() {
        return this.t;
    }

    public final lwh getLongPressRewindDelegate() {
        return this.u;
    }

    public final float getMinScale() {
        return this.r;
    }

    public final boolean getShowCoverRect() {
        return this.s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.q;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        lwh lwhVar = this.t;
        if (lwhVar != null) {
            lwhVar.clear();
        }
        lwh lwhVar2 = this.u;
        if (lwhVar2 != null) {
            lwhVar2.clear();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        lwh lwhVar;
        lwh lwhVar2;
        return isEnabled() || ((lwhVar = this.t) != null && lwhVar.b(motionEvent)) || ((lwhVar2 = this.u) != null && lwhVar2.b(motionEvent));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View videoView = getVideoView();
        if (videoView == null) {
            ore.p("Required value was null.");
            return;
        }
        int measuredHeight = videoView.getMeasuredHeight();
        int measuredWidth = videoView.getMeasuredWidth();
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        if (measuredWidth == 0 || measuredHeight == 0 || measuredWidth2 == 0 || measuredHeight2 == 0) {
            return;
        }
        float f = measuredWidth2;
        float f2 = measuredHeight2;
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = f3 / f4 > f / f2 ? f2 / f4 : f / f3;
        this.f = f5;
        this.e = f5 * 4.0f;
        this.i.set(0, 0, measuredWidth2, measuredHeight2);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor() * this.c;
        this.d = scaleFactor;
        this.d = (float) Math.min(this.e, Math.max(this.r, scaleFactor));
        if (this.s && getStateByScale() == f0d.a) {
            this.h.setAlpha(102);
            this.g = true;
        } else {
            this.g = false;
        }
        invalidate();
        this.n = scaleGestureDetector.getFocusX() - this.l;
        this.o = scaleGestureDetector.getFocusY() - this.m;
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.c = this.d;
        if (this.b == f0d.b) {
            this.j = scaleGestureDetector.getFocusX();
            this.k = scaleGestureDetector.getFocusY();
        }
        this.l = scaleGestureDetector.getFocusX();
        this.m = scaleGestureDetector.getFocusY();
        if (this.p != null) {
            this.p = null;
            this.g = false;
        }
        AnimatorSet animatorSet = this.q;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.q = null;
        invalidate();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        ValueAnimator valueAnimatorOfFloat;
        ArrayList arrayList = new ArrayList();
        boolean z = this.s;
        final int i = 3;
        final int i2 = 0;
        f0d f0dVar = f0d.a;
        if (z && getStateByScale() == f0dVar) {
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.4f, 1.0f, 0.0f);
            valueAnimatorOfFloat2.setDuration(600L);
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: e0d
                public final /* synthetic */ g0d b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i3 = i2;
                    g0d g0dVar = this.b;
                    switch (i3) {
                        case 0:
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            g0dVar.h.setAlpha((int) (255.0f * fFloatValue));
                            if (fFloatValue == 0.0f) {
                                g0dVar.g = false;
                            }
                            g0dVar.invalidate();
                            break;
                        case 1:
                            g0dVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            g0dVar.invalidate();
                            break;
                        case 2:
                            g0dVar.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            g0dVar.invalidate();
                            break;
                        case 3:
                            g0dVar.k = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            g0dVar.invalidate();
                            break;
                        case 4:
                            g0dVar.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            g0dVar.invalidate();
                            break;
                        default:
                            g0dVar.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            g0dVar.invalidate();
                            break;
                    }
                }
            });
            arrayList.add(valueAnimatorOfFloat2);
            this.p = valueAnimatorOfFloat2;
        }
        final int i3 = 1;
        final int i4 = 2;
        if (getStateByScale() == f0dVar) {
            this.b = f0dVar;
            valueAnimatorOfFloat = ValueAnimator.ofFloat(this.d, this.f);
        } else {
            this.b = f0d.b;
            valueAnimatorOfFloat = ValueAnimator.ofFloat(this.d, 1.0f);
        }
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: e0d
            public final /* synthetic */ g0d b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i5 = i3;
                g0d g0dVar = this.b;
                switch (i5) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        g0dVar.h.setAlpha((int) (255.0f * fFloatValue));
                        if (fFloatValue == 0.0f) {
                            g0dVar.g = false;
                        }
                        g0dVar.invalidate();
                        break;
                    case 1:
                        g0dVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        g0dVar.invalidate();
                        break;
                    case 2:
                        g0dVar.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        g0dVar.invalidate();
                        break;
                    case 3:
                        g0dVar.k = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        g0dVar.invalidate();
                        break;
                    case 4:
                        g0dVar.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        g0dVar.invalidate();
                        break;
                    default:
                        g0dVar.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        g0dVar.invalidate();
                        break;
                }
            }
        });
        arrayList.add(valueAnimatorOfFloat);
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(this.j, getWidth() / 2.0f);
        valueAnimatorOfFloat3.setDuration(300L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: e0d
            public final /* synthetic */ g0d b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i5 = i4;
                g0d g0dVar = this.b;
                switch (i5) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        g0dVar.h.setAlpha((int) (255.0f * fFloatValue));
                        if (fFloatValue == 0.0f) {
                            g0dVar.g = false;
                        }
                        g0dVar.invalidate();
                        break;
                    case 1:
                        g0dVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        g0dVar.invalidate();
                        break;
                    case 2:
                        g0dVar.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        g0dVar.invalidate();
                        break;
                    case 3:
                        g0dVar.k = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        g0dVar.invalidate();
                        break;
                    case 4:
                        g0dVar.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        g0dVar.invalidate();
                        break;
                    default:
                        g0dVar.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        g0dVar.invalidate();
                        break;
                }
            }
        });
        arrayList.add(valueAnimatorOfFloat3);
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(this.k, getHeight() / 2.0f);
        valueAnimatorOfFloat4.setDuration(300L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: e0d
            public final /* synthetic */ g0d b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i5 = i;
                g0d g0dVar = this.b;
                switch (i5) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        g0dVar.h.setAlpha((int) (255.0f * fFloatValue));
                        if (fFloatValue == 0.0f) {
                            g0dVar.g = false;
                        }
                        g0dVar.invalidate();
                        break;
                    case 1:
                        g0dVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        g0dVar.invalidate();
                        break;
                    case 2:
                        g0dVar.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        g0dVar.invalidate();
                        break;
                    case 3:
                        g0dVar.k = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        g0dVar.invalidate();
                        break;
                    case 4:
                        g0dVar.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        g0dVar.invalidate();
                        break;
                    default:
                        g0dVar.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        g0dVar.invalidate();
                        break;
                }
            }
        });
        arrayList.add(valueAnimatorOfFloat4);
        ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(this.n, 0.0f);
        valueAnimatorOfFloat5.setDuration(300L);
        final int i5 = 4;
        valueAnimatorOfFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: e0d
            public final /* synthetic */ g0d b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i6 = i5;
                g0d g0dVar = this.b;
                switch (i6) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        g0dVar.h.setAlpha((int) (255.0f * fFloatValue));
                        if (fFloatValue == 0.0f) {
                            g0dVar.g = false;
                        }
                        g0dVar.invalidate();
                        break;
                    case 1:
                        g0dVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        g0dVar.invalidate();
                        break;
                    case 2:
                        g0dVar.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        g0dVar.invalidate();
                        break;
                    case 3:
                        g0dVar.k = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        g0dVar.invalidate();
                        break;
                    case 4:
                        g0dVar.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        g0dVar.invalidate();
                        break;
                    default:
                        g0dVar.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        g0dVar.invalidate();
                        break;
                }
            }
        });
        arrayList.add(valueAnimatorOfFloat5);
        ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(this.o, 0.0f);
        valueAnimatorOfFloat6.setDuration(300L);
        final int i6 = 5;
        valueAnimatorOfFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: e0d
            public final /* synthetic */ g0d b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i7 = i6;
                g0d g0dVar = this.b;
                switch (i7) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        g0dVar.h.setAlpha((int) (255.0f * fFloatValue));
                        if (fFloatValue == 0.0f) {
                            g0dVar.g = false;
                        }
                        g0dVar.invalidate();
                        break;
                    case 1:
                        g0dVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        g0dVar.invalidate();
                        break;
                    case 2:
                        g0dVar.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        g0dVar.invalidate();
                        break;
                    case 3:
                        g0dVar.k = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        g0dVar.invalidate();
                        break;
                    case 4:
                        g0dVar.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        g0dVar.invalidate();
                        break;
                    default:
                        g0dVar.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        g0dVar.invalidate();
                        break;
                }
            }
        });
        arrayList.add(valueAnimatorOfFloat6);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.start();
        this.q = animatorSet;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        super.onTouchEvent(motionEvent);
        lwh lwhVar = this.t;
        if (lwhVar != null) {
            lwhVar.a(motionEvent);
        }
        lwh lwhVar2 = this.u;
        if (lwhVar2 != null) {
            lwhVar2.a(motionEvent);
        }
        ScaleGestureDetector scaleGestureDetector = this.a;
        scaleGestureDetector.onTouchEvent(motionEvent);
        if (scaleGestureDetector.isInProgress()) {
            getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        }
        View videoView = getVideoView();
        if (videoView != null) {
            videoView.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public final void setDoubleTapSeekEventDelegate(lwh lwhVar) {
        this.t = lwhVar;
    }

    public final void setLongPressRewindDelegate(lwh lwhVar) {
        this.u = lwhVar;
    }

    public final void setMinScale(float f) {
        this.r = f;
    }

    public final void setShowCoverRect(boolean z) {
        this.s = z;
    }
}
