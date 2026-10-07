package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import java.util.Arrays;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;
import one.me.sdk.richvector.VectorPath;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class p99 extends u96 implements eph {
    public ww8 d;
    public AnimatorSet e;
    public boolean f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;

    public p99(Context context) {
        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = new EnhancedAnimatedVectorDrawable(context, R.drawable.live_stream);
        super(enhancedAnimatedVectorDrawable);
        this.g = rx8.P(3, new ni(enhancedAnimatedVectorDrawable, 3));
        this.h = rx8.P(3, new ni(enhancedAnimatedVectorDrawable, 4));
        this.i = rx8.P(3, new ni(enhancedAnimatedVectorDrawable, 5));
    }

    public static ObjectAnimator c(VectorPath vectorPath, long j, int... iArr) {
        if (vectorPath == null) {
            ore.p("Required value was null.");
            return null;
        }
        ObjectAnimator objectAnimatorOfArgb = ObjectAnimator.ofArgb(vectorPath, "fillColor", Arrays.copyOf(iArr, iArr.length));
        objectAnimatorOfArgb.setDuration(167L);
        objectAnimatorOfArgb.setStartDelay(j);
        objectAnimatorOfArgb.setInterpolator(new LinearInterpolator());
        return objectAnimatorOfArgb;
    }

    @Override // defpackage.u96
    public final void a() {
        AnimatorSet animatorSet = this.e;
        if (animatorSet != null) {
            animatorSet.end();
        }
        ww8 ww8Var = this.d;
        if (ww8Var != null) {
            ww8Var.invoke();
        }
        if (this.f) {
            return;
        }
        start();
    }

    @Override // defpackage.u96
    public final void b() {
        AnimatorSet animatorSet = this.e;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        ny8 ny8Var = this.g;
        VectorPath vectorPath = (VectorPath) ny8Var.getValue();
        if (vectorPath != null) {
            vectorPath.setFillColor(-1);
        }
        ny8 ny8Var2 = this.h;
        VectorPath vectorPath2 = (VectorPath) ny8Var2.getValue();
        if (vectorPath2 != null) {
            vectorPath2.setFillColor(-1);
        }
        VectorPath vectorPath3 = (VectorPath) this.i.getValue();
        if (vectorPath3 != null) {
            vectorPath3.setFillColor(-1);
        }
        AnimatorSet animatorSet = this.e;
        boolean z = animatorSet != null && animatorSet.isRunning();
        AnimatorSet animatorSet2 = this.e;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(c((VectorPath) ny8Var.getValue(), 83L, tre.I0(-1, 0.0f), tre.I0(-1, 1.0f)), c((VectorPath) ny8Var2.getValue(), 250L, tre.I0(-1, 0.0f), tre.I0(-1, 1.0f)), c((VectorPath) ny8Var2.getValue(), 2417L, tre.I0(-1, 1.0f), tre.I0(-1, 0.0f)), c((VectorPath) ny8Var.getValue(), 2583L, tre.I0(-1, 1.0f), tre.I0(-1, 0.0f)));
        this.e = animatorSet3;
        if (z) {
            animatorSet3.start();
        }
    }

    @Override // defpackage.u96, android.graphics.drawable.Animatable
    public final void start() {
        this.f = false;
        super.start();
    }

    @Override // defpackage.u96, android.graphics.drawable.Animatable
    public final void stop() {
        this.f = true;
        super.stop();
    }
}
