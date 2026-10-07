package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x79 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tp3 b;
    public final /* synthetic */ z79 c;

    public /* synthetic */ x79(tp3 tp3Var, z79 z79Var, int i) {
        this.a = i;
        this.b = tp3Var;
        this.c = z79Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        z79 z79Var = this.c;
        tp3 tp3Var = this.b;
        switch (i) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tp3Var.e = fFloatValue;
                tp3Var.f = fFloatValue;
                k96 k96Var = z79Var.a;
                k96Var.X();
                k96Var.requestLayout();
                k96Var.invalidate();
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tp3Var.e = fFloatValue2;
                tp3Var.f = fFloatValue2;
                float fU = 0.0f;
                float fU2 = oc9.u(fFloatValue2, 0.0f, 1.0f);
                if (fU2 > 0.35f) {
                    fU = fU2 >= 0.75f ? 1.0f : oc9.u((fU2 - 0.35f) / 0.4f, 0.0f, 1.0f);
                }
                tp3Var.g = fU;
                k96 k96Var2 = z79Var.a;
                k96Var2.X();
                k96Var2.requestLayout();
                k96Var2.invalidate();
                break;
        }
    }
}
