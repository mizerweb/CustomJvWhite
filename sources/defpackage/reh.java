package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class reh extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public final j7j a;
    public boolean b;
    public ValueAnimator c;
    public qeh d;

    public reh(Context context) {
        super(context, null);
        j7j j7jVar = new j7j(getContext(), this, new o11(3, this));
        j7jVar.b = (int) (1.0f * j7jVar.b);
        this.a = j7jVar;
    }

    public static void a(reh rehVar, float f) {
        rehVar.setBackgroundAlpha(f);
    }

    public static void b(reh rehVar, float f, float f2) {
        if (f2 != 0.0f) {
            f2 = 1.0f - f2;
        }
        if (f > f2) {
            rehVar.setBackgroundAlpha(1.0f - f);
        }
    }

    private final void setBackgroundAlpha(float f) {
        Drawable background = getBackground();
        if (background != null) {
            background.setAlpha((int) (oc9.u(f, 0.0f, 1.0f) * 255.0f));
        }
    }

    public final void c(int i, int i2, af7 af7Var, af7 af7Var2, qf7 qf7Var) {
        qeh qehVar = this.d;
        if (qehVar == null) {
            return;
        }
        ValueAnimator valueAnimator = this.c;
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        ValueAnimator valueAnimator2 = this.c;
        if (valueAnimator2 != null) {
            lsk.a(valueAnimator2);
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setDuration(200L);
        valueAnimatorOfInt.addUpdateListener(new mj(qehVar, qf7Var, animatedFraction, 4));
        valueAnimatorOfInt.addListener(new pk(af7Var2, this, af7Var, 2));
        valueAnimatorOfInt.start();
        this.c = valueAnimatorOfInt;
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.a.f()) {
            postInvalidateOnAnimation();
        }
    }

    public final boolean d(MotionEvent motionEvent) {
        View viewZ;
        qeh qehVar = this.d;
        if (qehVar == null || (viewZ = qehVar.z()) == null) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        return x >= viewZ.getLeft() && x <= viewZ.getRight() && y >= viewZ.getTop() && y <= viewZ.getBottom();
    }

    public final void e() {
        reh rehVar;
        qeh qehVar = this.d;
        if (qehVar == null) {
            return;
        }
        if (qehVar.z().getHeight() > 0) {
            int iC = qehVar.C();
            int iS = qehVar.s();
            int i = 11;
            rehVar = this;
            rehVar.c(iC, iS, new yvg(i), new yvg(i), new peh(this, 0));
        } else {
            rehVar = this;
        }
        rehVar.invalidate();
    }

    public final qeh getCallback() {
        return this.d;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (d(motionEvent)) {
            return this.a.p(motionEvent);
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        qeh qehVar = this.d;
        if (qehVar == null) {
            return;
        }
        View viewZ = qehVar.z();
        int top = viewZ.getHeight() > 0 ? viewZ.getTop() : qehVar.C();
        super.onLayout(z, i, i2, i3, i4);
        viewZ.offsetTopAndBottom(top);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        j7j j7jVar = this.a;
        if (j7jVar.a == 0 && !d(motionEvent)) {
            return false;
        }
        j7jVar.j(motionEvent);
        return true;
    }

    public final void setCallback(qeh qehVar) {
        this.d = qehVar;
    }
}
