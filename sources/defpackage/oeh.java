package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;

/* JADX INFO: loaded from: classes3.dex */
public final class oeh {
    public final veh a;
    public final veh b;
    public final veh c;
    public final View d;
    public final ViewGroup e;
    public final xre f;
    public final int g;
    public boolean h;
    public final int m;
    public final int n;
    public View o;
    public final c8 p;
    public SwipeWidget s;
    public Long t;
    public ValueAnimator u;
    public ValueAnimator v;
    public float i = -1.0f;
    public float j = -1.0f;
    public float k = -1.0f;
    public float l = -1.0f;
    public final xme q = p90.M(new yvg(10));
    public final ny8 r = rx8.P(3, new bpg(5, this));

    public oeh(Integer num, veh vehVar, veh vehVar2, veh vehVar3, View view, ViewGroup viewGroup, xre xreVar, int i) {
        this.a = vehVar;
        this.b = vehVar2;
        this.c = vehVar3;
        this.d = view;
        this.e = viewGroup;
        this.f = xreVar;
        this.g = i;
        this.m = wk8.u(view.getContext());
        this.n = wk8.t(view.getContext());
        this.p = ax.b(view.getContext(), num, null, 4);
    }

    public final View a() {
        View view = this.o;
        if (view != null) {
            return view;
        }
        View view2 = (View) this.f.invoke();
        this.o = view2;
        return view2;
    }

    public final boolean b() {
        return this.g == 2;
    }

    public final void c(float f, boolean z) {
        ValueAnimator valueAnimator = this.u;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            Long l = this.t;
            long jLongValue = l != null ? l.longValue() : 200L;
            ValueAnimator duration = ValueAnimator.ofFloat(f, 0.0f).setDuration(oc9.x(gm0.L(Math.abs(f) * jLongValue), 120L, jLongValue));
            duration.addUpdateListener(new neh(this, 1));
            duration.addListener(new zkd(this, z, f, 1));
            this.u = duration;
            duration.start();
        }
    }

    public final void d(float f) {
        boolean zB = b();
        View view = this.d;
        c8 c8Var = this.p;
        ViewGroup viewGroup = this.e;
        if (!zB) {
            ksk.b(viewGroup, a(), view, c8Var, f, this.g != 3);
            return;
        }
        a();
        view.setTranslationX(viewGroup.getMeasuredWidth() * f);
        if (c8Var != null) {
            c8Var.setAlpha(1.0f - f);
        }
    }
}
