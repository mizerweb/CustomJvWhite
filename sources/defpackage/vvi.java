package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;

/* JADX INFO: loaded from: classes4.dex */
public final class vvi extends sr implements z5j, y5j {
    public qf7 c;
    public qf7 d;
    public t50 e;
    public Long f;
    public ObjectAnimator g;
    public final AccelerateDecelerateInterpolator h;

    public vvi() {
        super(new u8h(25));
        this.h = new AccelerateDecelerateInterpolator();
    }

    @Override // defpackage.z5j
    public final boolean B() {
        return n7j.o((ny8) this.b) && ((x5j) Q()).getAlpha() > 0.0f;
    }

    @Override // defpackage.z5j
    public final void D(q5j q5jVar, t50 t50Var, long j, boolean z, boolean z2) {
        ObjectAnimator objectAnimator;
        this.f = Long.valueOf(j);
        this.e = t50Var;
        ((x5j) Q()).a(q5jVar);
        x5j x5jVar = (x5j) Q();
        ViewGroup viewGroup = (ViewGroup) this.a;
        if (viewGroup == null) {
            viewGroup = null;
        }
        y5j y5jVar = viewGroup instanceof y5j ? (y5j) viewGroup : null;
        x5jVar.setVideoShape(y5jVar != null ? y5jVar.H(z) : H(z));
        ((x5j) Q()).setVideoContentMode(t50Var instanceof oxi ? r5j.b : r5j.a);
        qe7.H(Q(), 300L, new aah(8, this));
        ((x5j) Q()).setOnLongClickListener(new cw0(12, this));
        r();
        if (z2 && ((x5j) Q()).getAlpha() < 1.0f && ((objectAnimator = this.g) == null || !objectAnimator.isRunning())) {
            Z();
        }
        View viewQ = Q();
        if (viewQ.isAttachedToWindow()) {
            viewQ.addOnAttachStateChangeListener(new ga0(viewQ, 14, this));
            return;
        }
        x5j x5jVar2 = (x5j) Q();
        if (x5jVar2.b == null || x5jVar2.getChildCount() <= 0) {
            return;
        }
        J();
    }

    @Override // defpackage.y5j
    public final u5j H(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.a;
        if (viewGroup == null) {
            viewGroup = null;
        }
        float[] fArrA = ((fea) viewGroup.getBackground()).a();
        if (z) {
            fArrA[0] = 0.0f;
            fArrA[1] = 0.0f;
            fArrA[2] = 0.0f;
            fArrA[3] = 0.0f;
        }
        return new t5j(fArrA);
    }

    @Override // defpackage.z5j
    public final void J() {
        ny8 ny8Var = (ny8) this.b;
        if (ny8Var.d()) {
            x5j x5jVar = (x5j) ny8Var.getValue();
            ObjectAnimator objectAnimator = this.g;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            x5jVar.setAlpha(0.0f);
            x5jVar.setVisibility(8);
            x5jVar.b();
        }
    }

    public final void Z() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(Q(), (Property<View, Float>) View.ALPHA, ((x5j) Q()).getAlpha(), 1.0f);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.setInterpolator(this.h);
        objectAnimatorOfFloat.start();
        this.g = objectAnimatorOfFloat;
    }

    @Override // defpackage.z5j
    public final boolean n() {
        ny8 ny8Var = (ny8) this.b;
        if (!ny8Var.d()) {
            return false;
        }
        x5j x5jVar = (x5j) ny8Var.getValue();
        return x5jVar.b != null && x5jVar.getChildCount() > 0;
    }

    @Override // defpackage.z5j
    public final void s(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.a;
        if (viewGroup == null) {
            viewGroup = null;
        }
        izi iziVar = viewGroup instanceof izi ? (izi) viewGroup : null;
        if (iziVar == null || !iziVar.g.d) {
            ny8 ny8Var = (ny8) this.b;
            if (ny8Var.d()) {
                x5j x5jVar = (x5j) ny8Var.getValue();
                x5jVar.setVisibility(0);
                if (z) {
                    Z();
                } else {
                    x5jVar.setAlpha(1.0f);
                }
            }
        }
    }

    @Override // defpackage.z5j
    public final void setVideoClickListener(qf7 qf7Var) {
        this.c = qf7Var;
    }

    @Override // defpackage.z5j
    public final void setVideoLongClickListener(qf7 qf7Var) {
        this.d = qf7Var;
    }
}
