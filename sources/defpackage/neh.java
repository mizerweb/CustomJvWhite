package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class neh implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ oeh b;

    public /* synthetic */ neh(oeh oehVar, int i) {
        this.a = i;
        this.b = oehVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        oeh oehVar = this.b;
        switch (i) {
            case 0:
                oehVar.d(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                oehVar.d(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
