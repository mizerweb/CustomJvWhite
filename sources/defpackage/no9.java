package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class no9 extends yk {
    public static final /* synthetic */ int m = 0;
    public final int k;
    public final int l;

    public no9(int i, boolean z) {
        super(300L, z);
        this.k = i;
        this.l = gm0.K(30.0f * yl5.d().getDisplayMetrics().density);
    }

    public static ObjectAnimator p(View view, float f, float f2) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f, scaleX * f2), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f * scaleY, f2 * scaleY));
        objectAnimatorOfPropertyValuesHolder.addListener(new mo9(view, scaleX, scaleY));
        return objectAnimatorOfPropertyValuesHolder;
    }

    public static ObjectAnimator q(View view, float f, float f2, float f3) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f, f2));
        objectAnimatorOfPropertyValuesHolder.addListener(new lo9(view, f3, 2));
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // defpackage.gr4
    public final gr4 b() {
        return new no9(this.k, this.j);
    }

    @Override // defpackage.yk
    public final Animator l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        no9 no9Var;
        View view3;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new ll6());
        if (view2 != null) {
            float alpha = view2.getAlpha() == 0.0f ? 1.0f : view2.getAlpha();
            no9Var = this;
            animatorSet.play(o(view2, 0.0f, alpha, oc9.u(-0.15f, 0.0f, 1.0f), 1.0f, alpha));
        } else {
            no9Var = this;
        }
        if (view == null || (z && !no9Var.j)) {
            view3 = view;
        } else {
            float alpha2 = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
            view3 = view;
            animatorSet.play(no9Var.o(view3, alpha2, 0.0f, 0.0f, oc9.u(0.85f, 0.0f, 1.0f), alpha2));
        }
        int iD = qt4.D(no9Var.k);
        if (iD == 0) {
            int i = no9Var.l;
            if (z) {
                if (view2 != null) {
                    animatorSet.play(q(view2, view2.getTranslationX() + i, view2.getTranslationX(), view2.getTranslationX()));
                }
                if (view3 != null) {
                    animatorSet.play(q(view3, view3.getTranslationX(), view3.getTranslationX() - i, view3.getTranslationX()));
                    return animatorSet;
                }
            } else {
                if (view2 != null) {
                    animatorSet.play(q(view2, view2.getTranslationX() - i, view2.getTranslationX(), view2.getTranslationX()));
                }
                if (view3 != null) {
                    animatorSet.play(q(view3, view3.getTranslationX(), view3.getTranslationX() + i, view3.getTranslationX()));
                }
            }
        } else {
            if (iD != 1) {
                ore.o();
                return null;
            }
            if (z) {
                if (view2 != null) {
                    animatorSet.play(p(view2, 0.8f, 1.0f));
                }
                if (view3 != null) {
                    animatorSet.play(p(view3, 1.0f, 1.1f));
                    return animatorSet;
                }
            } else {
                if (view2 != null) {
                    animatorSet.play(p(view2, 1.1f, 1.0f));
                }
                if (view3 != null) {
                    animatorSet.play(p(view3, 1.0f, 0.8f));
                    return animatorSet;
                }
            }
        }
        return animatorSet;
    }

    @Override // defpackage.yk
    public final void n(View view) {
        view.setAlpha(1.0f);
    }

    public final ValueAnimator o(final View view, final float f, final float f2, final float f3, final float f4, float f5) {
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(valueAnimatorOfFloat, view, this, f, f2, f3, f4) { // from class: ko9
            public final /* synthetic */ ValueAnimator a;
            public final /* synthetic */ View b;
            public final /* synthetic */ float c;
            public final /* synthetic */ float d;
            public final /* synthetic */ float e;
            public final /* synthetic */ float f;

            {
                this.c = f;
                this.d = f2;
                this.e = f3;
                this.f = f4;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i = no9.m;
                float fFloatValue = ((Float) this.a.getAnimatedValue()).floatValue();
                float f6 = this.e;
                float fC = this.c;
                if (fFloatValue >= f6) {
                    float f7 = this.f;
                    float f8 = this.d;
                    fC = fFloatValue > f7 ? f8 : tqk.c(fC, f8, (fFloatValue - f6) / (f7 - f6));
                }
                this.b.setAlpha(fC);
            }
        });
        valueAnimatorOfFloat.addListener(new lo9(view, f5, 1));
        valueAnimatorOfFloat.addListener(new lo9(view, f5, 0));
        return valueAnimatorOfFloat;
    }

    public /* synthetic */ no9(int i) {
        this(1, true);
    }

    public no9() {
        this(1, true);
    }
}
