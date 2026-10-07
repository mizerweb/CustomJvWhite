package defpackage;

import android.animation.ValueAnimator;
import one.me.stories.viewer.viewer.UserStoriesScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class sni implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ UserStoriesScreen a;
    public final /* synthetic */ ValueAnimator b;

    public sni(UserStoriesScreen userStoriesScreen, ValueAnimator valueAnimator) {
        this.a = userStoriesScreen;
        this.b = valueAnimator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        UserStoriesScreen userStoriesScreen = this.a;
        if (userStoriesScreen.getView() != null) {
            float fFloatValue = ((Float) this.b.getAnimatedValue()).floatValue();
            UserStoriesScreen.p1(userStoriesScreen).setAlpha(fFloatValue);
            UserStoriesScreen.q1(userStoriesScreen).setAlpha(fFloatValue);
            userStoriesScreen.z1().setAlpha(fFloatValue);
        }
    }
}
