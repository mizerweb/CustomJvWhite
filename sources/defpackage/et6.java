package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.animation.PathInterpolator;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;
import one.me.sdk.richvector.VectorPath;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class et6 extends u96 implements eph {
    public int d;
    public final RectF e;
    public final AnimatorSet f;
    public boolean g;

    public et6(Context context) {
        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = new EnhancedAnimatedVectorDrawable(context, R.drawable.file_typing);
        super(enhancedAnimatedVectorDrawable);
        this.d = 255;
        this.e = new RectF();
        AnimatorSet animatorSet = new AnimatorSet();
        PathInterpolator pathInterpolator = new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f);
        final VectorPath vectorPathFindPath = enhancedAnimatedVectorDrawable.findPath("_R_G_L_4_G_D_0_P_0");
        if (vectorPathFindPath != null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(122, 255);
            valueAnimatorOfInt.setDuration(350L);
            valueAnimatorOfInt.setInterpolator(pathInterpolator);
            final int i = 0;
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dt6
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i2 = i;
                    VectorPath vectorPath = vectorPathFindPath;
                    switch (i2) {
                        case 0:
                            vectorPath.setStrokeAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                            break;
                        default:
                            vectorPath.setStrokeAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                            break;
                    }
                }
            });
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(255, 122);
            valueAnimatorOfInt2.setDuration(350L);
            valueAnimatorOfInt2.setStartDelay(350L);
            valueAnimatorOfInt2.setInterpolator(pathInterpolator);
            final int i2 = 1;
            valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dt6
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i3 = i2;
                    VectorPath vectorPath = vectorPathFindPath;
                    switch (i3) {
                        case 0:
                            vectorPath.setStrokeAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                            break;
                        default:
                            vectorPath.setStrokeAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                            break;
                    }
                }
            });
            animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorOfInt2);
        }
        this.f = animatorSet;
    }

    @Override // defpackage.u96
    public final void a() {
        this.f.cancel();
        if (this.g) {
            return;
        }
        start();
    }

    @Override // defpackage.u96
    public final void b() {
        if (this.g) {
            return;
        }
        this.f.start();
    }

    @Override // defpackage.zt5, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = this.b;
        enhancedAnimatedVectorDrawable.setBounds(bounds);
        Rect bounds2 = getBounds();
        RectF rectF = this.e;
        rectF.set(bounds2);
        canvas.saveLayerAlpha(rectF, this.d);
        enhancedAnimatedVectorDrawable.draw(canvas);
        canvas.restore();
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.d = (kbcVar.getIcon().d >> 24) & 255;
        int iI0 = tre.I0(kbcVar.getIcon().d, 1.0f);
        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = this.b;
        lvb.B0(enhancedAnimatedVectorDrawable, "_R_G_L_3_G_D_0_P_0", iI0);
        lvb.B0(enhancedAnimatedVectorDrawable, "_R_G_L_2_G_D_0_P_0", iI0);
        lvb.B0(enhancedAnimatedVectorDrawable, "_R_G_L_1_G_D_0_P_0", iI0);
        lvb.B0(enhancedAnimatedVectorDrawable, "_R_G_L_0_G_D_0_P_0", iI0);
        lvb.B0(enhancedAnimatedVectorDrawable, "_R_G_L_4_G_D_0_P_0", iI0);
    }

    @Override // defpackage.u96, android.graphics.drawable.Animatable
    public final void start() {
        this.g = false;
        super.start();
    }

    @Override // defpackage.u96, android.graphics.drawable.Animatable
    public final void stop() {
        this.g = true;
        super.stop();
    }
}
