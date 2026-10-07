package defpackage;

import android.animation.ValueAnimator;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;

/* JADX INFO: loaded from: classes2.dex */
public final class f72 implements ValueAnimator.AnimatorUpdateListener {
    public float a;
    public float b;
    public final /* synthetic */ i72 c;

    public f72(qw1 qw1Var, i72 i72Var) {
        this.c = i72Var;
        this.a = qw1Var.a;
        this.b = qw1Var.b;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float[] fArr = (float[]) valueAnimator.getAnimatedValue();
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = this.a;
        if (f3 == f && this.b == f2) {
            return;
        }
        i72 i72Var = this.c;
        i72Var.t.postTranslate(f - f3, f2 - this.b);
        this.a = f;
        this.b = f2;
        TextureViewRenderer textureViewRenderer = i72Var.g;
        if (textureViewRenderer != null) {
            textureViewRenderer.setTransform(i72Var.t);
            textureViewRenderer.invalidate();
        }
    }
}
