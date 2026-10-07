package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class ry7 extends yk {
    public ry7(int i) {
        super(200L, 2);
    }

    @Override // defpackage.gr4
    public final gr4 b() {
        return new ry7(this.d, this.j);
    }

    @Override // defpackage.yk
    public final Animator l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (z) {
            if (view != null) {
                animatorSet.play(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, -view.getWidth()));
            }
            if (view2 != null) {
                animatorSet.play(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, view2.getWidth(), 0.0f));
                return animatorSet;
            }
        } else {
            if (view != null) {
                animatorSet.play(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, view.getWidth()));
            }
            if (view2 != null) {
                animatorSet.play(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, (view != null ? view.getTranslationX() : 0.0f) - view2.getWidth(), 0.0f));
            }
        }
        return animatorSet;
    }

    @Override // defpackage.yk
    public final void n(View view) {
        view.setTranslationX(0.0f);
    }

    public ry7() {
        super(0);
    }
}
