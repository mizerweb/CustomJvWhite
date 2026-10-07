package defpackage;

import android.animation.ValueAnimator;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d72 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d72(int i, Serializable serializable, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = serializable;
        this.d = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                float[] fArr = (float[]) obj3;
                float[] fArr2 = (float[]) obj2;
                i72 i72Var = (i72) obj;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float[] fArr3 = new float[9];
                for (int i2 = 0; i2 < 9; i2++) {
                    float f = fArr[i2];
                    fArr3[i2] = c0a.c(fArr2[i2], f, fFloatValue, f);
                }
                i72Var.t.setValues(fArr3);
                i72Var.b();
                break;
            default:
                tp2 tp2Var = (tp2) obj3;
                sfe sfeVar = (sfe) obj2;
                za2 za2Var = (za2) obj;
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tp2Var.setAlpha(fFloatValue2 <= 0.5f ? 1.0f - (2.0f * fFloatValue2) : (fFloatValue2 - 0.5f) * 2.0f);
                if (fFloatValue2 >= 0.5f && !sfeVar.a) {
                    za2Var.invoke();
                    sfeVar.a = true;
                    break;
                }
                break;
        }
    }
}
