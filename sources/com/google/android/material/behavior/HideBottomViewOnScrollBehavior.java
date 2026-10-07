package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import defpackage.e9i;
import defpackage.et4;
import defpackage.lk;
import defpackage.qt4;
import defpackage.y7;
import defpackage.ys4;
import java.util.Iterator;
import java.util.LinkedHashSet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends ys4 {
    public int b;
    public int c;
    public TimeInterpolator d;
    public TimeInterpolator e;
    public ViewPropertyAnimator h;
    public final LinkedHashSet a = new LinkedHashSet();
    public int f = 0;
    public int g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // defpackage.ys4
    public boolean h(et4 et4Var, View view, int i) {
        this.f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.b = e9i.u0(R.attr.motionDurationLong2, 225, view.getContext());
        this.c = e9i.u0(R.attr.motionDurationMedium4, 175, view.getContext());
        this.d = e9i.v0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, lk.d);
        this.e = e9i.v0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, lk.c);
        return false;
    }

    @Override // defpackage.ys4
    public final void l(et4 et4Var, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        LinkedHashSet linkedHashSet = this.a;
        if (i2 > 0) {
            if (this.g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                throw qt4.h(it);
            }
            this.h = view.animate().translationY(this.f).setInterpolator(this.e).setDuration(this.c).setListener(new y7(4, this));
            return;
        }
        if (i2 >= 0 || this.g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            throw qt4.h(it2);
        }
        this.h = view.animate().translationY(0.0f).setInterpolator(this.d).setDuration(this.b).setListener(new y7(4, this));
    }

    @Override // defpackage.ys4
    public boolean p(et4 et4Var, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
