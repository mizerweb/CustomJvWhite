package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class v5f implements cf7 {
    public final /* synthetic */ View a;
    public final /* synthetic */ w5f b;
    public final /* synthetic */ r5f c;
    public final /* synthetic */ w5f d;
    public final /* synthetic */ j5f e;

    public v5f(j5f j5fVar, w5f w5fVar, r5f r5fVar, w5f w5fVar2, j5f j5fVar2) {
        this.a = j5fVar;
        this.b = w5fVar;
        this.c = r5fVar;
        this.d = w5fVar2;
        this.e = j5fVar2;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        ValueAnimator valueAnimator = (ValueAnimator) obj;
        View view = this.a;
        float translationY = 1.0f - (view.getTranslationY() / (yl5.d().getDisplayMetrics().density * 4.0f));
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(view.getTranslationY(), yl5.d().getDisplayMetrics().density * 4.0f);
        valueAnimatorOfFloat.setDuration((long) (200.0f * translationY));
        valueAnimatorOfFloat.setInterpolator(w5f.k);
        w5f w5fVar = this.d;
        j5f j5fVar = this.e;
        View view2 = this.a;
        valueAnimatorOfFloat.addListener(new t5f(view2, this.b, this.c, w5fVar, j5fVar));
        valueAnimatorOfFloat.addUpdateListener(new u5f(view2, animatedFraction));
        valueAnimatorOfFloat.start();
        return valueAnimatorOfFloat;
    }
}
