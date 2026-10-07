package defpackage;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class um3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ tp3 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ym3 c;

    public /* synthetic */ um3(tp3 tp3Var, boolean z, ym3 ym3Var) {
        this.a = tp3Var;
        this.b = z;
        this.c = ym3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        tp3 tp3Var = this.a;
        tp3Var.e = fFloatValue;
        tp3Var.f = fFloatValue;
        if (this.b) {
            float fU = 0.0f;
            float fU2 = oc9.u(fFloatValue, 0.0f, 1.0f);
            if (fU2 > 0.35f) {
                fU = fU2 >= 0.75f ? 1.0f : oc9.u((fU2 - 0.35f) / 0.4f, 0.0f, 1.0f);
            }
            tp3Var.g = fU;
        }
        RecyclerView recyclerView = this.c.a;
        recyclerView.X();
        recyclerView.requestLayout();
        recyclerView.invalidate();
    }
}
