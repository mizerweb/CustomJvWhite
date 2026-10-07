package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ati extends yk {
    public ati() {
        super(0);
    }

    @Override // defpackage.gr4
    public final gr4 b() {
        return new ati(this.d, this.j);
    }

    @Override // defpackage.yk
    public final Animator l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z && view2 != null) {
            arrayList.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, view2.getHeight(), 0.0f));
        } else if (!z && view != null) {
            arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getHeight()));
        }
        animatorSet.playTogether(arrayList);
        return animatorSet;
    }

    @Override // defpackage.yk
    public final void n(View view) {
    }
}
