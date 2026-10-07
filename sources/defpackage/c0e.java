package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c0e implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d0e b;

    public /* synthetic */ c0e(d0e d0eVar, int i) {
        this.a = i;
        this.b = d0eVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        d0e d0eVar = this.b;
        switch (i) {
            case 0:
                d0eVar.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0eVar.invalidate();
                break;
            default:
                d0eVar.a.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                d0eVar.invalidate();
                break;
        }
    }
}
