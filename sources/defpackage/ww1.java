package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes4.dex */
public final class ww1 extends yk {
    public static final /* synthetic */ int m = 0;
    public final boolean k;
    public final ny8 l;

    public ww1(long j, boolean z) {
        super(j, 2);
        this.k = z;
        r7 r7Var = r7.a;
        this.l = new sx1(r7.d(ha9.b)).getAccessor().d(872);
    }

    @Override // defpackage.yk, defpackage.gr4
    public final boolean d() {
        return this.k;
    }

    @Override // defpackage.yk
    public final Animator l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (z && view2 != null) {
            o(animatorSet, view2, true);
            return animatorSet;
        }
        if (!z && view != null) {
            o(animatorSet, view, false);
        }
        return animatorSet;
    }

    @Override // defpackage.yk
    public final void n(View view) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(AnimatorSet animatorSet, final View view, final boolean z) {
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.addListener(new vw1(this, view, z, view, z, view, z, 0));
        c79 c79VarW = yab.w();
        final PointF pointFE = ((rn1) ((qn1) this.l.getValue())).e();
        float f = z ? 0.0f : 1.0f;
        float f2 = z ? 1.0f : 0.0f;
        dk dkVar = new dk("bounds", f);
        boolean z2 = view instanceof uy1;
        final uy1 uy1Var = z2 ? (uy1) view : null;
        final ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, dkVar, f, f2);
        objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: uw1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ww1 ww1Var = this;
                ny8 ny8Var = ww1Var.l;
                int i = ww1.m;
                long j = ww1Var.d;
                ObjectAnimator objectAnimator = objectAnimatorOfFloat;
                objectAnimator.setDuration(j);
                boolean z3 = z;
                float animatedFraction = objectAnimator.getAnimatedFraction();
                if (!z3) {
                    animatedFraction = 1.0f - animatedFraction;
                }
                View view2 = view;
                int width = view2.getWidth();
                int height = view2.getHeight();
                PointF pointF = pointFE;
                float f3 = pointF.x;
                float f4 = 1.0f - animatedFraction;
                float f5 = pointF.y * f4;
                float fMin = Math.min(f3, f3 * f4);
                float fMin2 = Math.min(pointF.y, f5);
                float f6 = width * animatedFraction;
                float f7 = height * animatedFraction;
                float f8 = pointF.x;
                ((rn1) ((qn1) ny8Var.getValue())).getClass();
                RectF rectF = new RectF(fMin, fMin2, Math.max(f8 + gm0.K(l1d.a.b * yl5.d().getDisplayMetrics().density), f6), Math.max(pointF.y + ((rn1) ((qn1) ny8Var.getValue())).a(), f7));
                uy1 uy1Var2 = uy1Var;
                if (uy1Var2 != null) {
                    uy1Var2.d(rectF, z3);
                }
                Rect rect = new Rect();
                rectF.roundOut(rect);
                float f9 = yl5.d().getDisplayMetrics().density * 20.0f;
                view2.setClipToOutline(true);
                view2.setOutlineProvider(new l7j(rect, f9));
            }
        });
        if (z) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, f, f2);
            objectAnimatorOfFloat2.setDuration(50L);
            c79VarW.add(objectAnimatorOfFloat2);
        }
        c79VarW.add(objectAnimatorOfFloat);
        uy1 uy1Var2 = z2 ? (uy1) view : null;
        if (uy1Var2 != null) {
            uy1Var2.k(c79VarW, z, this.d);
        }
        animatorSet.playTogether(yab.j(c79VarW));
    }

    public ww1() {
        this(-1L, true);
    }
}
