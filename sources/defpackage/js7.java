package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.Arrays;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;

/* JADX INFO: loaded from: classes3.dex */
public class js7 extends ns0 {
    public static final zpe u;
    public static final /* synthetic */ zv8[] v;
    public final zpe f;
    public final zb g;
    public boolean h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public int[] p;
    public final ValueAnimator q;
    public ValueAnimator r;
    public ValueAnimator s;
    public boolean t;

    static {
        z8b z8bVar = new z8b(js7.class, "_colorState", "get_colorState()Lone/me/calls/ui/view/halo/HaloBackgroundView$ColorState;");
        zfe.a.getClass();
        v = new zv8[]{z8bVar};
        u = new zpe(28);
    }

    public js7(Context context) {
        super(context);
        this.f = zpe.i;
        this.g = new zb(this, 16);
        this.i = -16777216;
        this.k = 70.0f;
        this.l = 120.0f;
        this.m = 0.6f;
        this.n = 0.5f;
        u.getClass();
        this.p = zpe.p(gs7.a);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 6.2831855f);
        valueAnimatorOfFloat.setDuration(8000L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new es7(this, 1));
        this.q = valueAnimatorOfFloat;
        this.t = true;
    }

    private final gs7 get_colorState() {
        zv8 zv8Var = v[0];
        return (gs7) this.g.b;
    }

    private final void set_colorState(gs7 gs7Var) {
        this.g.B(this, v[0], gs7Var);
    }

    @Override // defpackage.ns0
    public final void a(we weVar, float f, float f2) {
        float fMin = Math.min(f / 2.0f, yl5.d().getDisplayMetrics().density * 180.0f);
        float f3 = this.l / 120.0f;
        float f4 = this.k / 70.0f;
        weVar.c("circle3Radius", j(1.3f * fMin));
        float f5 = 0.5f * fMin * f3;
        weVar.c("circle2Radius", j(f5));
        weVar.c("centers2Radius", j(f5));
        float f6 = 0.45f * fMin;
        weVar.c("circle1Radius", j(f4 * f6));
        weVar.c("centers1Radius", j(0.15f * fMin));
        weVar.c("alpha1", g(this.m));
        weVar.c("alpha2", this.n);
        weVar.c("alpha3", this.o);
        weVar.c("centers1Angle", -0.7853982f);
        weVar.c("centers2Angle", this.j);
        weVar.c("blur1", h(0.25f * fMin));
        weVar.c("blur2", i(f6));
        weVar.c("blur3", fMin * 0.75f);
        weVar.c("falloff", getFalloff());
        weVar.d("vignetteScale", 1.0f, k(f, f2));
        int length = this.p.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            weVar.b(this.p[i], zo5.h(i2, DatabaseHelper.COMPRESSED_COLUMN_NAME));
            i = i2;
        }
        weVar.b(this.i, "bgColor");
    }

    public final void e(final ks7 ks7Var, final int[] iArr) {
        ValueAnimator valueAnimator = this.s;
        this.s = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final float f = this.k;
        final float f2 = this.l;
        final float f3 = this.m;
        final float f4 = this.n;
        final float f5 = this.o;
        int[] iArr2 = this.p;
        final int[] iArrCopyOf = Arrays.copyOf(iArr2, iArr2.length);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(2000L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fs7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                ks7 ks7Var2 = ks7Var;
                float fB = esk.b(f, ks7Var2.a, fFloatValue);
                js7 js7Var = this.a;
                js7Var.k = fB;
                js7Var.l = esk.b(f2, ks7Var2.b, fFloatValue);
                js7Var.m = esk.b(f3, ks7Var2.c, fFloatValue);
                js7Var.n = esk.b(f4, ks7Var2.d, fFloatValue);
                js7Var.o = esk.b(f5, ks7Var2.e, fFloatValue);
                int length = js7Var.p.length;
                for (int i = 0; i < length; i++) {
                    js7Var.p[i] = esk.c(iArrCopyOf[i], fFloatValue, iArr[i]);
                }
                js7Var.b();
            }
        });
        valueAnimatorOfFloat.addListener(new y7(3, this));
        valueAnimatorOfFloat.start();
        this.s = valueAnimatorOfFloat;
    }

    public final ks7 f(gs7 gs7Var) {
        int i = is7.$EnumSwitchMapping$0[gs7Var.ordinal()];
        if (i == 1 || i == 2) {
            return new ks7(70.0f, 120.0f, 0.6f, 0.5f, 0.3f);
        }
        if (i == 3) {
            boolean z = this.h;
            return new ks7(z ? 70.0f : 49.0f, z ? 180.0f : 120.0f, z ? 1.0f : 0.0f, 0.5f, z ? 0.5f : 0.3f);
        }
        if (i == 4) {
            return new ks7(70.0f, 120.0f, 0.3f, 0.2f, 0.5f);
        }
        ore.o();
        return null;
    }

    public float g(float f) {
        return f;
    }

    public final gs7 getColorState() {
        gs7 gs7Var = get_colorState();
        return gs7Var == null ? gs7.a : gs7Var;
    }

    public float getFalloff() {
        return 5.0f;
    }

    public final int getShineBackgroundColor() {
        return this.i;
    }

    @Override // defpackage.ns0
    public qbi getSpec() {
        return this.f;
    }

    public float h(float f) {
        return f;
    }

    public float i(float f) {
        return f;
    }

    public float j(float f) {
        return f;
    }

    public float k(float f, float f2) {
        return 1.0f;
    }

    public final void l() {
        ValueAnimator valueAnimatorOfFloat;
        m();
        if (this.t) {
            ValueAnimator valueAnimator = this.s;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                int i = is7.$EnumSwitchMapping$0[getColorState().ordinal()];
                if (i == 1 || i == 2) {
                    valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.setDuration(4000L);
                    valueAnimatorOfFloat.setRepeatCount(-1);
                    valueAnimatorOfFloat.setRepeatMode(2);
                    valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                    valueAnimatorOfFloat.addUpdateListener(new es7(this, 0));
                } else {
                    valueAnimatorOfFloat = null;
                }
                this.r = valueAnimatorOfFloat;
                if (valueAnimatorOfFloat != null) {
                    valueAnimatorOfFloat.start();
                }
            }
        }
    }

    public final void m() {
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.r = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.t) {
            this.q.start();
            l();
        }
    }

    @Override // defpackage.ns0, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.q.cancel();
        m();
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        super.onDetachedFromWindow();
    }

    public final void setColorState(gs7 gs7Var) {
        set_colorState(gs7Var);
    }

    public void setContinuousAnimationsEnabled(boolean z) {
        this.t = z;
        ValueAnimator valueAnimator = this.q;
        if (z) {
            valueAnimator.start();
            l();
        } else {
            valueAnimator.cancel();
            m();
        }
    }

    public final void setShineBackgroundColor(int i) {
        this.i = i;
    }

    public final void setTalking(boolean z) {
        if (this.h != z) {
            this.h = z;
            if (getColorState() == gs7.c) {
                m();
                ks7 ks7VarF = f(getColorState());
                gs7 colorState = getColorState();
                u.getClass();
                e(ks7VarF, zpe.p(colorState));
            }
        }
    }
}
