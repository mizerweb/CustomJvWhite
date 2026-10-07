package defpackage;

import android.animation.FloatEvaluator;
import android.animation.IntEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class wd2 extends FrameLayout {
    public static final /* synthetic */ int o = 0;
    public k2e a;
    public ValueAnimator b;
    public final IntEvaluator c;
    public final FloatEvaluator d;
    public int e;
    public int f;
    public float g;
    public int h;
    public int i;
    public final kw3 j;
    public boolean k;
    public boolean l;
    public vd2 m;
    public boolean n;

    public wd2(Context context) {
        super(context, null, 0, 0);
        this.c = new IntEvaluator();
        this.d = new FloatEvaluator();
        kw3 kw3Var = new kw3();
        this.j = kw3Var;
        this.k = true;
        this.l = true;
        setOutlineProvider(kw3Var);
    }

    public static final void e(wd2 wd2Var, int i, int i2, int i3, int i4, float f, float f2, int i5, int i6, int i7, int i8, float f3) {
        IntEvaluator intEvaluator = wd2Var.c;
        kw3 kw3Var = wd2Var.j;
        Integer numEvaluate = intEvaluator.evaluate(f3, Integer.valueOf(i), Integer.valueOf(i2));
        IntEvaluator intEvaluator2 = wd2Var.c;
        Integer numEvaluate2 = intEvaluator2.evaluate(f3, Integer.valueOf(i3), Integer.valueOf(i4));
        Float fEvaluate = wd2Var.d.evaluate(f3, (Number) Float.valueOf(f), (Number) Float.valueOf(f2));
        Integer numEvaluate3 = intEvaluator2.evaluate(f3, Integer.valueOf(i5), Integer.valueOf(i6));
        Integer numEvaluate4 = intEvaluator2.evaluate(f3, Integer.valueOf(i7), Integer.valueOf(i8));
        ViewGroup.LayoutParams layoutParams = wd2Var.getLayoutParams();
        if (layoutParams == null) {
            ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.width = numEvaluate.intValue();
        layoutParams.height = numEvaluate2.intValue();
        wd2Var.setLayoutParams(layoutParams);
        wd2Var.setTranslationY(fEvaluate.floatValue());
        kw3Var.b = numEvaluate3.intValue();
        kw3Var.c = numEvaluate4.intValue();
        wd2Var.invalidateOutline();
    }

    public final void a() {
        k2e k2eVar = this.a;
        if (k2eVar != null) {
            if (k2eVar == null) {
                k2eVar = null;
            }
            hj2 hj2Var = (hj2) k2eVar.getCameraApi();
            hj2Var.getClass();
            gm0.n(hj2.class.getName(), "destroyCamera");
            hj2Var.j = false;
            hj2Var.h = false;
            hj2Var.c.x();
            hj2Var.d.a();
        }
        if (this.n) {
            c();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof k2e) {
            super.addView(view, layoutParams);
        } else {
            ore.p("child must be QuickCameraView instance");
        }
    }

    public final void b(n2e n2eVar, uvc uvcVar) {
        if (this.a != null) {
            return;
        }
        k2e k2eVar = new k2e(getContext());
        k2eVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.a = k2eVar;
        c7k c7kVar = new c7k(7, this);
        k2eVar.d = n2eVar;
        k2eVar.f = c7kVar;
        k2eVar.e = uvcVar;
        ((hj2) k2eVar.getCameraApi()).setCameraListener(new ft0(k2eVar));
        ic6 ic6Var = n2eVar.o;
        i19 i19VarF = v7j.a(k2eVar).f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(ic6Var, i19VarF, n09Var), new j2e(null, k2eVar, 0), 3), tre.d0(v7j.a(k2eVar)));
        e9i.j0(new fz6(n1g.v(n2eVar.n, v7j.a(k2eVar).f(), n09Var), new j2e(null, k2eVar, 1), 3), tre.d0(v7j.a(k2eVar)));
        e9i.j0(new fz6(n1g.v(n2eVar.m, v7j.a(k2eVar).f(), n09Var), new j2e(null, k2eVar, 2), 3), tre.d0(v7j.a(k2eVar)));
        k2e k2eVar2 = this.a;
        if (k2eVar2 == null) {
            k2eVar2 = null;
        }
        addView(k2eVar2);
        k2e k2eVar3 = this.a;
        ((hj2) (k2eVar3 != null ? k2eVar3 : null).getCameraApi()).d();
        qe7.H(this, 300L, new t8(10, this));
    }

    public final void c() {
        if (isAttachedToWindow()) {
            ViewParent parent = getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.setClipToPadding(this.k);
                viewGroup.setClipChildren(this.l);
            }
        }
    }

    public final void d(boolean z, boolean z2) {
        int measuredWidth;
        int measuredHeight;
        if (this.n == z) {
            return;
        }
        this.n = z;
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        k2e k2eVar = this.a;
        k2e k2eVar2 = k2eVar == null ? null : k2eVar;
        boolean z3 = this.n;
        if (k2eVar2.b != z3) {
            k2eVar2.b = z3;
            ValueAnimator valueAnimator2 = k2eVar2.c;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float alpha = k2eVar2.h.getAlpha();
            float f = 1.0f;
            float f2 = z3 ? 0.0f : 1.0f;
            float alpha2 = k2eVar2.p.getAlpha();
            if (!z3) {
                f = 0.0f;
            }
            if (!z3) {
                n2e n2eVar = k2eVar2.d;
                if (n2eVar == null) {
                    n2eVar = null;
                }
                mjg mjgVar = n2eVar.m;
                if (mjgVar.getValue() instanceof z1e) {
                    mjgVar.j(null, a2e.a);
                    a8j.x(n2eVar.o, t1e.a);
                }
                n2eVar.C();
            }
            if (z2) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                k2eVar2.c = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new i2e(k2eVar2, alpha, f2, alpha2, f, 0));
                valueAnimatorOfFloat.setStartDelay(z3 ? 50L : 0L);
                valueAnimatorOfFloat.setDuration(150L);
                valueAnimatorOfFloat.start();
            } else {
                k2e.c(k2eVar2, alpha, f2, alpha2, f, 1.0f);
            }
        }
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        int paddingTop = viewGroup != null ? viewGroup.getPaddingTop() : 0;
        if (z && viewGroup != null) {
            this.k = viewGroup.getClipToPadding();
            this.l = viewGroup.getClipChildren();
            viewGroup.setClipToPadding(false);
            viewGroup.setClipChildren(false);
        }
        final int measuredWidth2 = getMeasuredWidth();
        final int measuredHeight2 = getMeasuredHeight();
        if (this.n) {
            ViewGroup viewGroupL = yab.L(this);
            if (viewGroupL == null) {
                ore.p("Required value was null.");
                return;
            }
            measuredWidth = viewGroupL.getMeasuredWidth();
        } else {
            measuredWidth = this.e;
        }
        if (this.n) {
            ViewGroup viewGroupL2 = yab.L(this);
            if (viewGroupL2 == null) {
                ore.p("Required value was null.");
                return;
            }
            measuredHeight = viewGroupL2.getMeasuredHeight();
        } else {
            measuredHeight = this.f;
        }
        final float translationY = getTranslationY();
        boolean z4 = this.n;
        float f3 = z4 ? -paddingTop : this.g;
        kw3 kw3Var = this.j;
        final int i = kw3Var.b;
        int i2 = z4 ? 0 : this.h;
        final int i3 = kw3Var.c;
        final int i4 = z4 ? 0 : this.i;
        if (!z2) {
            e(this, measuredWidth2, measuredWidth, measuredHeight2, measuredHeight, translationY, f3, i, i2, i3, i4, 1.0f);
            if (this.n) {
                return;
            }
            c();
            return;
        }
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.b = valueAnimatorOfFloat2;
        final float f4 = f3;
        final int i5 = measuredWidth;
        final int i6 = measuredHeight;
        final int i7 = i2;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ud2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                wd2.e(this.a, measuredWidth2, i5, measuredHeight2, i6, translationY, f4, i, i7, i3, i4, ((Float) valueAnimator3.getAnimatedValue()).floatValue());
            }
        });
        if (!this.n) {
            valueAnimatorOfFloat2.addListener(new y7(2, this));
        }
        valueAnimatorOfFloat2.setDuration(200L);
        valueAnimatorOfFloat2.start();
    }

    public final void f(int i, int i2) {
        this.e = i;
        this.f = i2;
        if (this.n) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        setLayoutParams(layoutParams);
    }

    public final vd2 getListener() {
        return this.m;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.n;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float y = motionEvent.getY();
        kw3 kw3Var = this.j;
        boolean z = y <= ((float) kw3Var.b);
        boolean z2 = motionEvent.getY() >= ((float) (getMeasuredHeight() - kw3Var.c));
        if (this.n || !(z || z2)) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setListener(vd2 vd2Var) {
        this.m = vd2Var;
    }

    public final void setPreviewTranslationY(float f) {
        this.g = f;
        if (this.n) {
            return;
        }
        setTranslationY(f);
    }
}
