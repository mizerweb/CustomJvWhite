package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;
import one.me.sdk.richvector.VectorPath;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class qoh extends u96 implements eph {
    public AnimatorSet d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;

    public qoh(Context context) {
        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = new EnhancedAnimatedVectorDrawable(context, R.drawable.text_typing);
        super(enhancedAnimatedVectorDrawable);
        this.e = rx8.P(3, new ni(enhancedAnimatedVectorDrawable, 6));
        this.f = rx8.P(3, new ni(enhancedAnimatedVectorDrawable, 7));
        this.g = rx8.P(3, new ni(enhancedAnimatedVectorDrawable, 8));
    }

    public static ObjectAnimator c(VectorPath vectorPath, int i, int i2, int i3, int i4) {
        if (vectorPath == null) {
            ore.p("Required value was null.");
            return null;
        }
        ObjectAnimator objectAnimatorOfArgb = ObjectAnimator.ofArgb(vectorPath, "fillColor", i, i2, i3, i4);
        objectAnimatorOfArgb.setDuration(1000L);
        objectAnimatorOfArgb.setRepeatCount(-1);
        objectAnimatorOfArgb.setRepeatMode(1);
        objectAnimatorOfArgb.setInterpolator(new LinearInterpolator());
        return objectAnimatorOfArgb;
    }

    @Override // defpackage.u96
    public final void a() {
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.end();
        }
    }

    @Override // defpackage.u96
    public final void b() {
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        int i = kbcVar.getIcon().d;
        float f = ((i >> 24) & 255) / 255.0f;
        ny8 ny8Var = this.e;
        VectorPath vectorPath = (VectorPath) ny8Var.getValue();
        if (vectorPath != null) {
            vectorPath.setFillColor(i);
        }
        ny8 ny8Var2 = this.f;
        VectorPath vectorPath2 = (VectorPath) ny8Var2.getValue();
        if (vectorPath2 != null) {
            vectorPath2.setFillColor(i);
        }
        ny8 ny8Var3 = this.g;
        VectorPath vectorPath3 = (VectorPath) ny8Var3.getValue();
        if (vectorPath3 != null) {
            vectorPath3.setFillColor(i);
        }
        AnimatorSet animatorSet = this.d;
        boolean z = animatorSet != null && animatorSet.isRunning();
        AnimatorSet animatorSet2 = this.d;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        ObjectAnimator objectAnimatorC = c((VectorPath) ny8Var.getValue(), tre.I0(i, 1.0f > f ? f : 1.0f), tre.I0(i, 0.25f), tre.I0(i, 0.25f), tre.I0(i, 1.0f > f ? f : 1.0f));
        ObjectAnimator objectAnimatorC2 = c((VectorPath) ny8Var2.getValue(), tre.I0(i, 0.25f), tre.I0(i, 1.0f > f ? f : 1.0f), tre.I0(i, 0.25f), tre.I0(i, 0.25f));
        VectorPath vectorPath4 = (VectorPath) ny8Var3.getValue();
        int iI0 = tre.I0(i, 0.25f);
        int iI1 = tre.I0(i, 0.25f);
        if (1.0f <= f) {
            f = 1.0f;
        }
        animatorSet3.playTogether(objectAnimatorC, objectAnimatorC2, c(vectorPath4, iI0, iI1, tre.I0(i, f), tre.I0(i, 0.25f)));
        this.d = animatorSet3;
        if (z) {
            animatorSet3.start();
        }
    }
}
