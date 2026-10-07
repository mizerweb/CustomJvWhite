package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class vj6 extends yk {
    public vj6(int i) {
        super(150L, 2);
    }

    @Override // defpackage.gr4
    public final gr4 b() {
        return new vj6(this.d, this.j);
    }

    @Override // defpackage.yk
    public final Animator l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (view2 != null) {
            animatorSet.play(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, z2 ? 0.0f : view2.getAlpha(), 1.0f));
        }
        if (view != null && (!z || this.j)) {
            animatorSet.play(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f));
        }
        return animatorSet;
    }

    @Override // defpackage.yk
    public final void n(View view) {
        view.setAlpha(1.0f);
    }

    public vj6() {
        super(0);
    }
}
