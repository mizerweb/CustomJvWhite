package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class d0d extends FrameLayout {
    public final g58 a;
    public final t58 b;
    public final ScaleGestureDetector c;
    public float d;
    public int e;
    public float f;
    public float g;
    public float h;
    public float i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public iua p;

    public d0d(Context context, g58 g58Var, float[] fArr) {
        super(context);
        this.a = g58Var;
        t58 t58Var = new t58(context);
        t58Var.setRoundedCorners(fArr);
        t58Var.setClickable(true);
        t58Var.setPivotX(0.0f);
        t58Var.setPivotY(0.0f);
        this.b = t58Var;
        this.c = new ScaleGestureDetector(context, new c0d(this));
        this.d = 1.0f;
        this.e = -1;
    }

    public final void a(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(this.n, this.o);
        if (!this.j) {
            MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEventObtain.getDownTime(), motionEventObtain.getEventTime(), 0, motionEventObtain.getX(0), motionEventObtain.getY(0), motionEventObtain.getMetaState());
            onTouchEvent(motionEventObtain2);
            motionEventObtain2.recycle();
            this.e = motionEventObtain.getPointerId(0);
            b(motionEventObtain);
        }
        onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public final void b(MotionEvent motionEvent) {
        int iFindPointerIndex = motionEvent.findPointerIndex(this.e);
        Integer numValueOf = Integer.valueOf(iFindPointerIndex);
        if (iFindPointerIndex < 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        this.f = motionEvent.getX(iIntValue);
        this.g = motionEvent.getY(iIntValue);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.k) {
            ScaleGestureDetector scaleGestureDetector = this.c;
            scaleGestureDetector.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.j = true;
                this.e = motionEvent.getPointerId(0);
                b(motionEvent);
                return true;
            }
            t58 t58Var = this.b;
            if (actionMasked == 1) {
                if (this.j) {
                    this.k = true;
                    t58Var.animate().scaleX(1.0f).scaleY(1.0f).translationX(this.l).translationY(this.m).setDuration(220L).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new h7b(7, this)).start();
                }
                this.j = false;
                return true;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.e);
                if (iFindPointerIndex >= 0) {
                    if (!scaleGestureDetector.isInProgress() && this.d > 1.0f) {
                        t58Var.setTranslationX((motionEvent.getX(iFindPointerIndex) - this.f) + t58Var.getTranslationX());
                        t58Var.setTranslationY((motionEvent.getY(iFindPointerIndex) - this.g) + t58Var.getTranslationY());
                    }
                    b(motionEvent);
                    return true;
                }
            } else {
                if (actionMasked == 3) {
                    this.j = false;
                    return true;
                }
                if (actionMasked == 6) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) != this.e) {
                        b(motionEvent);
                        return true;
                    }
                    int i = actionIndex == 0 ? 1 : 0;
                    if (i >= motionEvent.getPointerCount()) {
                        this.e = -1;
                        return true;
                    }
                    this.e = motionEvent.getPointerId(i);
                    b(motionEvent);
                    return true;
                }
            }
        }
        return true;
    }
}
