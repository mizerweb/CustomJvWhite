package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nce implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecordControlsWidget b;

    public /* synthetic */ nce(RecordControlsWidget recordControlsWidget, int i) {
        this.a = i;
        this.b = recordControlsWidget;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        RecordControlsWidget recordControlsWidget = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = RecordControlsWidget.x1;
                sb8.m0(((Integer) valueAnimator.getAnimatedValue()).intValue(), recordControlsWidget.r1().getDrawable());
                break;
            case 1:
                zv8[] zv8VarArr2 = RecordControlsWidget.x1;
                View viewF1 = recordControlsWidget.F1();
                ViewGroup.LayoutParams layoutParams = viewF1.getLayoutParams();
                if (layoutParams == null) {
                    ore.n("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                } else {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    viewF1.setLayoutParams(layoutParams2);
                }
                break;
            case 2:
                zv8[] zv8VarArr3 = RecordControlsWidget.x1;
                View viewF2 = recordControlsWidget.F1();
                ViewGroup.LayoutParams layoutParams3 = viewF2.getLayoutParams();
                if (layoutParams3 == null) {
                    ore.n("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                } else {
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                    layoutParams4.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    viewF2.setLayoutParams(layoutParams4);
                }
                break;
            default:
                zv8[] zv8VarArr4 = RecordControlsWidget.x1;
                sb8.m0(((Integer) valueAnimator.getAnimatedValue()).intValue(), recordControlsWidget.B1());
                break;
        }
    }
}
