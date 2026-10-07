package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lk1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lk1(Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        int i2 = this.c;
        int i3 = this.b;
        Object obj = this.d;
        switch (i) {
            case 0:
                View view = (View) obj;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                view.setAlpha(fFloatValue);
                view.setClipBounds(new Rect(0, 0, i3, (int) (i2 * fFloatValue)));
                break;
            case 1:
                in2 in2Var = (in2) obj;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                Float[] fArr = in2Var.e;
                float f = in2Var.d;
                boolean z = fArr[i3] != null;
                if (z) {
                    fArr[i3] = Float.valueOf(((f - 1.0f) * animatedFraction) + 1.0f);
                }
                boolean z2 = fArr[i2] != null;
                if (z2) {
                    fArr[i2] = Float.valueOf(f - ((f - 1.0f) * animatedFraction));
                }
                if (z || z2) {
                    in2Var.a.invoke();
                }
                break;
            default:
                MediaBarWidget mediaBarWidget = (MediaBarWidget) obj;
                Integer numEvaluate = mediaBarWidget.h.evaluate(valueAnimator.getAnimatedFraction(), Integer.valueOf(i3), Integer.valueOf(i2));
                mediaBarWidget.C.setAlpha(numEvaluate.intValue());
                mediaBarWidget.v.setAlpha(numEvaluate.intValue());
                break;
        }
    }
}
