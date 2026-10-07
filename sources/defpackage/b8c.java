package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b8c implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e8c b;

    public /* synthetic */ b8c(e8c e8cVar, int i) {
        this.a = i;
        this.b = e8cVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        e8c e8cVar = this.b;
        switch (i) {
            case 0:
                e8cVar.d.c(((Float) valueAnimator.getAnimatedValue()).floatValue());
                e8cVar.invalidate();
                break;
            default:
                e8cVar.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e8cVar.invalidate();
                break;
        }
    }
}
