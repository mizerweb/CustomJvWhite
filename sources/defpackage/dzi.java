package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes2.dex */
public final class dzi implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ izi b;

    public /* synthetic */ dzi(izi iziVar, int i) {
        this.a = i;
        this.b = iziVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.a;
        izi iziVar = this.b;
        switch (i9) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                ViewParent parent = iziVar.getParent();
                iea ieaVar = parent instanceof iea ? (iea) parent : null;
                if (ieaVar != null) {
                    boolean zC0 = izi.c0(iziVar.getModel());
                    int maxAvailableWidth$message_list = ieaVar.getMaxAvailableWidth$message_list();
                    if (!zC0 || p90.E(iziVar)) {
                        maxAvailableWidth$message_list = gm0.K(228.0f * yl5.d().getDisplayMetrics().density);
                    }
                    if (maxAvailableWidth$message_list != iziVar.x1) {
                        if (zC0 && !p90.E(iziVar)) {
                            iziVar.e.s(false);
                        }
                        int i10 = iziVar.x1;
                        ValueAnimator valueAnimator = iziVar.K;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i10, maxAvailableWidth$message_list);
                        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
                        valueAnimatorOfInt.addUpdateListener(new m11(5, iziVar));
                        valueAnimatorOfInt.setDuration(250L);
                        valueAnimatorOfInt.addListener(new s0i(3));
                        valueAnimatorOfInt.start();
                        iziVar.K = valueAnimatorOfInt;
                        break;
                    }
                }
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                zv8[] zv8VarArr = izi.y1;
                iziVar.Q();
                break;
        }
    }
}
