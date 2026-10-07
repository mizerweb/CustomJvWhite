package defpackage;

import android.animation.ValueAnimator;
import one.me.stories.viewer.viewer.StoriesViewerScreen;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uy7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tfe b;
    public final /* synthetic */ y8j c;

    public /* synthetic */ uy7(tfe tfeVar, y8j y8jVar, int i) {
        this.a = i;
        this.b = tfeVar;
        this.c = y8jVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        y8j y8jVar = this.c;
        tfe tfeVar = this.b;
        switch (i) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y8jVar.c(fFloatValue - tfeVar.a);
                tfeVar.a = fFloatValue;
                break;
            case 1:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y8jVar.c(-(fFloatValue2 - tfeVar.a));
                tfeVar.a = fFloatValue2;
                break;
            case 2:
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y8jVar.c(fFloatValue3 - tfeVar.a);
                tfeVar.a = fFloatValue3;
                break;
            default:
                zv8[] zv8VarArr = StoriesViewerScreen.t;
                float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y8jVar.c(-(fFloatValue4 - tfeVar.a));
                tfeVar.a = fFloatValue4;
                break;
        }
    }
}
