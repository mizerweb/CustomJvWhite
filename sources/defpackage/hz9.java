package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import one.me.keyboardmedia.MediaKeyboardWidget;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hz9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ kz9 b;

    public /* synthetic */ hz9(kz9 kz9Var, int i) {
        this.a = i;
        this.b = kz9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        int i = this.a;
        kz9 kz9Var = this.b;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                MediaKeyboardWidget mediaKeyboardWidgetH = kz9Var.h();
                if (mediaKeyboardWidgetH != null && (view = mediaKeyboardWidgetH.getView()) != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    } else {
                        layoutParams.height = iIntValue;
                        view.setLayoutParams(layoutParams);
                    }
                    break;
                }
                break;
            default:
                int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                View view2 = kz9Var.c;
                view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), iIntValue2);
                break;
        }
    }
}
