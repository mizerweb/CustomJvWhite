package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes3.dex */
public final class e7 extends yk {
    public static final /* synthetic */ int q = 0;
    public br3 k;
    public View l;
    public float m;
    public float n;
    public float o;
    public final b7 p;

    public e7() {
        super(650L, true);
        this.p = new b7(0, this);
    }

    @Override // defpackage.gr4
    public final gr4 b() {
        return new e7();
    }

    @Override // defpackage.yk
    public final Animator l(ViewGroup viewGroup, View view, final View view2, boolean z, boolean z2) {
        if (!z || view2 == null || viewGroup.getWidth() == 0 || viewGroup.getHeight() == 0) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(0L);
            return valueAnimatorOfFloat;
        }
        or3 or3VarB = oml.b(view, true, true);
        int i = 0;
        if (or3VarB == null) {
            oml.c(view);
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat2.setDuration(650L);
            valueAnimatorOfFloat2.addUpdateListener(new z6(view2, 0));
            valueAnimatorOfFloat2.addListener(new c7(view2, 0));
            return valueAnimatorOfFloat2;
        }
        Context context = viewGroup.getContext();
        a8g a8gVar = pq3.j;
        int i2 = a8gVar.e(context).m().getIcon().h;
        int i3 = a8gVar.e(viewGroup.getContext()).m().b().c;
        int iB = mx3.b(i3, 0.6f, i2);
        float f = or3VarB.a;
        this.n = f;
        float f2 = or3VarB.b;
        this.o = f2;
        final float f3 = or3VarB.c;
        float fHypot = (float) Math.hypot(f, f2);
        float[] fArr = {(float) Math.hypot(viewGroup.getWidth() - this.n, this.o), (float) Math.hypot(this.n, viewGroup.getHeight() - this.o), (float) Math.hypot(viewGroup.getWidth() - this.n, viewGroup.getHeight() - this.o)};
        for (int i4 = 0; i4 < 3; i4++) {
            fHypot = Math.max(fHypot, fArr[i4]);
        }
        br3 br3Var = new br3(this.n, this.o, iB, i3);
        this.k = br3Var;
        if (view != null) {
            view.setForeground(br3Var);
        }
        this.l = view;
        view2.setVisibility(0);
        view2.setClipToOutline(true);
        view2.setOutlineProvider(this.p);
        final PathInterpolator pathInterpolator = new PathInterpolator(0.4f, 0.0f, 0.24f, 1.0f);
        final PathInterpolator pathInterpolator2 = new PathInterpolator(0.33f, 0.0f, 0.67f, 1.0f);
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat3.setDuration(650L);
        final float f4 = fHypot;
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: a7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i5 = e7.q;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float interpolation = pathInterpolator.getInterpolation(fFloatValue);
                float interpolation2 = pathInterpolator2.getInterpolation(fFloatValue);
                float f5 = f4;
                float f6 = f3;
                float fC = c0a.c(f5, f6, interpolation, f6);
                e7 e7Var = this;
                e7Var.m = fC;
                br3 br3Var2 = e7Var.k;
                if (br3Var2 != null) {
                    br3Var2.f = fC;
                }
                if (br3Var2 != null) {
                    br3Var2.e = interpolation2;
                }
                View view3 = e7Var.l;
                if (view3 != null) {
                    view3.invalidate();
                }
                view2.invalidateOutline();
            }
        });
        valueAnimatorOfFloat3.addListener(new d7(this, i, view2));
        return valueAnimatorOfFloat3;
    }

    @Override // defpackage.yk
    public final void n(View view) {
    }
}
