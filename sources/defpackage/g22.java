package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes2.dex */
public final class g22 extends yk {
    public static final /* synthetic */ int m = 0;
    public final boolean k;
    public final ny8 l;

    public g22(long j, boolean z) {
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
    public final void o(AnimatorSet animatorSet, View view, boolean z) {
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.addListener(new vw1(this, view, z, view, z, view, z, 1));
        c79 c79VarW = yab.w();
        int iA = z ? ((rn1) ((qn1) this.l.getValue())).a() : view.getHeight();
        int height = z ? view.getHeight() : 0;
        ik ikVar = new ik("bounds", iA);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt((Object) null, ikVar, iA, height);
        objectAnimatorOfInt.addUpdateListener(new mk(view, 1, ikVar));
        c79VarW.add(objectAnimatorOfInt);
        wy1 wy1Var = view instanceof wy1 ? (wy1) view : null;
        if (wy1Var != null) {
            wy1Var.l(c79VarW, z, this.d);
        }
        animatorSet.playTogether(yab.j(c79VarW));
    }

    public g22() {
        this(-1L, true);
    }
}
