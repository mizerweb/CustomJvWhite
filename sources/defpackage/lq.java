package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;

/* JADX INFO: loaded from: classes3.dex */
public final class lq implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lq(Object obj, View view, View view2, int i) {
        this.a = i;
        this.d = obj;
        this.b = view;
        this.c = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        View view = this.c;
        View view2 = this.b;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((AppBarLayout$BaseBehavior) obj).F((et4) view2, (rq) view, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                ((tgh) obj).c(view2, view, valueAnimator.getAnimatedFraction());
                break;
        }
    }
}
