package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tcj implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ycj b;

    public /* synthetic */ tcj(ycj ycjVar, int i) {
        this.a = i;
        this.b = ycjVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        ycj ycjVar = this.b;
        switch (i) {
            case 0:
                ycjVar.j.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 1:
                ycjVar.g.setLinesColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 2:
                ycjVar.j.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                ycjVar.g.setLinesColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
