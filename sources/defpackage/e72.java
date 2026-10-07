package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final class e72 implements ValueAnimator.AnimatorUpdateListener {
    public final float[] a = new float[9];
    public final float[] b;
    public final float[] c;
    public final /* synthetic */ i72 d;

    public e72(i72 i72Var) {
        this.d = i72Var;
        float[] fArr = new float[9];
        this.b = fArr;
        float[] fArr2 = new float[9];
        this.c = fArr2;
        i72Var.t.getValues(fArr);
        i72Var.h.getValues(fArr2);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i = 0;
        while (true) {
            float[] fArr = this.a;
            if (i >= 9) {
                i72 i72Var = this.d;
                i72Var.t.setValues(fArr);
                i72Var.b();
                return;
            } else {
                float f = this.b[i];
                float f2 = this.c[i];
                fArr[i] = c0a.c(f, f2, fFloatValue, f2);
                i++;
            }
        }
    }
}
