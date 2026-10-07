package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class lg1 extends yk {
    public final boolean k;

    public lg1() {
        this(-1L, true);
    }

    @Override // defpackage.yk, defpackage.gr4
    public final boolean d() {
        return this.k;
    }

    @Override // defpackage.yk
    public final Animator l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z && view2 != null) {
            arrayList.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
        } else if (!z && view != null) {
            arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f));
        }
        animatorSet.playTogether(arrayList);
        return animatorSet;
    }

    @Override // defpackage.yk
    public final void n(View view) {
    }

    public lg1(long j, boolean z) {
        super(j, 2);
        this.k = z;
    }
}
