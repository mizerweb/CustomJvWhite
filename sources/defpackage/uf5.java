package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes4.dex */
public class uf5 implements u1k, Animator.AnimatorListener {
    public final h6f a;
    public z1k b = null;
    public boolean c = false;
    public boolean d = true;
    public boolean e = false;
    public boolean f = false;
    public float g = 1.0f;
    public float h = 4.0f;
    public final RectF i = new RectF();
    public final RectF j = new RectF();
    public final RectF k = new RectF();
    public final Matrix l = new Matrix();
    public final Matrix m = new Matrix();

    public uf5(h6f h6fVar) {
        new Matrix();
        this.a = h6fVar;
        h6fVar.c = this;
    }

    @Override // defpackage.u1k
    public void a(final float f, final float f2) {
        float f3;
        float fA = v3e.a(this.m);
        if (fA > 1.1d) {
            f3 = 1.0f;
        } else if (!this.d) {
            return;
        } else {
            f3 = 2.5f;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fA, f3);
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tf5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uf5 uf5Var = this.a;
                Matrix matrix = uf5Var.m;
                float fA2 = fFloatValue / v3e.a(matrix);
                matrix.postScale(fA2, fA2, f, f2);
                uf5Var.l.set(matrix);
                uf5Var.c();
                z1k z1kVar = uf5Var.b;
                if (z1kVar != null) {
                    z1kVar.h(matrix);
                }
            }
        });
        valueAnimatorOfFloat.addListener(this);
        valueAnimatorOfFloat.start();
    }

    public void b(float f, float f2) {
        Matrix matrix = this.m;
        float fA = v3e.a(matrix);
        float f3 = this.g;
        if (fA < f3) {
            float f4 = f3 / fA;
            matrix.postScale(f4, f4, f, f2);
            e();
        } else {
            float f5 = this.h;
            if (fA > f5) {
                float f6 = f5 / fA;
                matrix.postScale(f6, f6, f, f2);
            }
        }
    }

    public void c() {
        RectF rectF = this.j;
        RectF rectF2 = this.k;
        rectF2.set(rectF);
        Matrix matrix = this.m;
        matrix.mapRect(rectF2);
        float f = rectF2.left;
        float fWidth = rectF2.width();
        RectF rectF3 = this.i;
        float fWidth2 = rectF3.width() - fWidth;
        float fMin = fWidth2 > 0.0f ? fWidth2 / 2.0f : Math.min(Math.max(fWidth2, f), 0.0f);
        float f2 = rectF2.top;
        float fHeight = rectF3.height() - rectF2.height();
        float fMin2 = fHeight > 0.0f ? fHeight / 2.0f : Math.min(Math.max(fHeight, f2), 0.0f);
        float f3 = rectF2.left;
        if (fMin == f3 && fMin2 == rectF2.top) {
            return;
        }
        matrix.postTranslate(fMin - f3, fMin2 - rectF2.top);
        e();
    }

    public void d() {
        ((l5b) this.a.b).g();
        this.l.reset();
        this.m.reset();
    }

    public final void e() {
        l5b l5bVar = (l5b) this.a.b;
        if (l5bVar.a) {
            l5bVar.h();
            for (int i = 0; i < 2; i++) {
                ((float[]) l5bVar.d)[i] = ((float[]) l5bVar.f)[i];
                ((float[]) l5bVar.e)[i] = ((float[]) l5bVar.g)[i];
            }
            if (!l5bVar.a) {
                l5bVar.a = true;
            }
        }
        this.f = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.e = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.e = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.e = true;
    }
}
