package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final class g4f implements x58 {
    public float a;
    public ValueAnimator b;
    public final /* synthetic */ h4f c;

    public g4f(h4f h4fVar) {
        this.c = h4fVar;
    }

    @Override // defpackage.x58
    public final void a(long j, y58 y58Var) {
        tvj.a("ScreenFlashView", "ScreenFlash#apply");
        h4f h4fVar = this.c;
        this.a = h4fVar.getBrightness();
        h4fVar.setBrightness(1.0f);
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        h7b h7bVar = new h7b(20, y58Var);
        tvj.a("ScreenFlashView", "animateToFullOpacity");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(h4fVar.getVisibilityRampUpAnimationDurationMillis());
        valueAnimatorOfFloat.addUpdateListener(new ak(29, h4fVar));
        valueAnimatorOfFloat.addListener(new li(18, h7bVar));
        valueAnimatorOfFloat.start();
        this.b = valueAnimatorOfFloat;
    }

    @Override // defpackage.x58
    public final void clear() {
        tvj.a("ScreenFlashView", "ScreenFlash#clear");
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.b = null;
        }
        h4f h4fVar = this.c;
        h4fVar.setAlpha(0.0f);
        h4fVar.setBrightness(this.a);
    }
}
