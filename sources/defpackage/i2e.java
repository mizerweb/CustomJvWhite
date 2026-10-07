package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i2e implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ View f;

    public /* synthetic */ i2e(View view, float f, float f2, float f3, float f4, int i) {
        this.a = i;
        this.f = view;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        View view = this.f;
        switch (i) {
            case 0:
                k2e.c((k2e) view, this.b, this.c, this.d, this.e, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                pyi pyiVar = (pyi) view;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                float f = this.c;
                float f2 = this.b;
                pyiVar.t = c0a.c(f, f2, animatedFraction, f2);
                float f3 = this.e;
                float f4 = this.d;
                float fC = c0a.c(f3, f4, animatedFraction, f4);
                pyiVar.s = fC;
                pyiVar.h.setStrokeWidth(fC);
                pyiVar.d.setStrokeWidth(pyiVar.s);
                pyiVar.invalidate();
                break;
        }
    }
}
