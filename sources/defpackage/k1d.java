package defpackage;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes2.dex */
public final class k1d implements o1d {
    public final View a;
    public final c7k b;
    public final qn1 c;
    public float d;
    public float e;
    public final ny8 f = rx8.P(3, new iua(26, this));
    public m1d g = m1d.e;

    public k1d(View view, c7k c7kVar, qn1 qn1Var) {
        this.a = view;
        this.b = c7kVar;
        this.c = qn1Var;
    }

    public final void a() {
        View view = this.a;
        float translationX = view.getTranslationX();
        float translationX2 = this.g.a;
        if (translationX >= translationX2) {
            float translationX3 = view.getTranslationX();
            translationX2 = this.g.b;
            if (translationX3 <= translationX2) {
                translationX2 = view.getTranslationX();
            }
        }
        float translationY = view.getTranslationY();
        float translationY2 = this.g.c;
        if (translationY >= translationY2) {
            float translationY3 = view.getTranslationY();
            translationY2 = this.g.d;
            if (translationY3 <= translationY2) {
                translationY2 = view.getTranslationY();
            }
        }
        if (translationX2 == view.getTranslationX() && translationY2 == view.getTranslationY()) {
            b();
        } else {
            view.animate().setDuration(200L).translationX(translationX2).translationY(translationY2).setListener(new li(14, this)).start();
        }
    }

    public final void b() {
        View view = this.a;
        float x = view.getX();
        float y = view.getY();
        PointF pointF = ((rn1) this.c).b;
        pointF.x = x;
        pointF.y = y;
    }

    @Override // defpackage.o1d
    public final void l(float f, float f2, int i, int i2, d1d d1dVar) {
        this.g = tgl.a(this.a.getContext(), f, f2, i, i2, d1dVar);
    }

    @Override // defpackage.o1d
    public final boolean n(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        View view = this.a;
        if (action == 0) {
            this.d = motionEvent.getRawX();
            this.e = motionEvent.getRawY();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
        int action2 = motionEvent.getAction();
        if (action2 == 1) {
            a();
            float fAbs = Math.abs(this.d - motionEvent.getRawX());
            ny8 ny8Var = this.f;
            boolean z = fAbs < ((float) ((Number) ny8Var.getValue()).intValue());
            boolean z2 = Math.abs(this.e - motionEvent.getRawY()) < ((float) ((Number) ny8Var.getValue()).intValue());
            long eventTime = motionEvent.getEventTime() - motionEvent.getDownTime();
            if ((motionEvent.getAction() != 1 || eventTime >= ViewConfiguration.getTapTimeout()) && (!z || !z2)) {
                return false;
            }
        } else {
            if (action2 == 2) {
                view.setTranslationX((motionEvent.getRawX() - this.d) + view.getTranslationX());
                view.setTranslationY((motionEvent.getRawY() - this.e) + view.getTranslationY());
                this.d = motionEvent.getRawX();
                this.e = motionEvent.getRawY();
                this.b.o(view.getX(), view.getY());
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
        View view = this.a;
        view.setTranslationX(f);
        view.setTranslationY(f2);
        a();
    }
}
