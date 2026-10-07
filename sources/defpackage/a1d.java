package defpackage;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public final class a1d implements o1d {
    public final View a;
    public final vn7 b;
    public final qn1 c;
    public int d;
    public int e;
    public float f;
    public float g;
    public ValueAnimator h;
    public m1d i = m1d.e;

    public a1d(View view, vn7 vn7Var, qn1 qn1Var) {
        this.a = view;
        this.b = vn7Var;
        this.c = qn1Var;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0010 A[PHI: r3
  0x0010: PHI (r3v6 float) = (r3v0 float), (r3v1 float) binds: [B:3:0x000e, B:6:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    public final void a() {
        final PointF pointFG = this.b.g();
        final float f = pointFG.x;
        m1d m1dVar = this.i;
        float f2 = m1dVar.a;
        if (f < f2) {
            f = f2;
        } else {
            f2 = m1dVar.b;
            if (f > f2) {
                f = f2;
            }
        }
        final float f3 = pointFG.y;
        float f4 = m1dVar.c;
        if (f3 < f4) {
            f3 = f4;
        } else {
            float f5 = m1dVar.d;
            if (f3 > f5) {
                f3 = f5;
            }
        }
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: z0d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                PointF pointF = pointFG;
                float f6 = pointF.x;
                float fC = c0a.c(f, f6, fFloatValue, f6);
                float f7 = pointF.y;
                float fC2 = c0a.c(f3, f7, fFloatValue, f7);
                a1d a1dVar = this;
                a1dVar.b.o(fC, fC2);
                PointF pointF2 = ((rn1) a1dVar.c).b;
                pointF2.x = fC;
                pointF2.y = fC2;
            }
        });
        this.h = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    @Override // defpackage.o1d
    public final void l(float f, float f2, int i, int i2, d1d d1dVar) {
        View view = this.a;
        this.i = tgl.a(view.getContext(), f - f55.o(view.getContext()).g, f2, i, i2, d1dVar);
    }

    @Override // defpackage.o1d
    public final boolean n(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        vn7 vn7Var = this.b;
        if (action == 0) {
            PointF pointFG = vn7Var.g();
            this.d = (int) pointFG.x;
            this.e = (int) pointFG.y;
            this.f = motionEvent.getRawX();
            this.g = motionEvent.getRawY();
        }
        int action2 = motionEvent.getAction();
        if (action2 == 1) {
            a();
            long eventTime = motionEvent.getEventTime() - motionEvent.getDownTime();
            if (motionEvent.getAction() != 1 || eventTime >= ViewConfiguration.getTapTimeout()) {
                return false;
            }
        } else {
            if (action2 == 2) {
                float rawX = motionEvent.getRawX() - this.f;
                float rawY = motionEvent.getRawY() - this.g;
                float f = this.d + rawX;
                float f2 = this.e + rawY;
                vn7Var.o(f, f2);
                PointF pointF = ((rn1) this.c).b;
                pointF.x = f;
                pointF.y = f2;
                return true;
            }
            if (action2 == 3) {
                a();
                return true;
            }
        }
        return true;
    }

    @Override // defpackage.o1d
    public final void q(float f, float f2) {
        this.b.o(f, f2);
        PointF pointF = ((rn1) this.c).b;
        pointF.x = f;
        pointF.y = f2;
    }
}
