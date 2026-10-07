package defpackage;

import android.animation.Animator;
import one.me.stories.viewer.viewer.UserStoriesScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class tni implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ UserStoriesScreen b;

    public /* synthetic */ tni(UserStoriesScreen userStoriesScreen, int i) {
        this.a = i;
        this.b = userStoriesScreen;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                UserStoriesScreen userStoriesScreen = this.b;
                if (userStoriesScreen.getView() != null) {
                    UserStoriesScreen.p1(userStoriesScreen).setVisibility(8);
                    UserStoriesScreen.q1(userStoriesScreen).setVisibility(8);
                    userStoriesScreen.z1().setVisibility(8);
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                UserStoriesScreen userStoriesScreen = this.b;
                if (userStoriesScreen.getView() != null) {
                    UserStoriesScreen.p1(userStoriesScreen).setVisibility(8);
                    UserStoriesScreen.q1(userStoriesScreen).setVisibility(8);
                    userStoriesScreen.z1().setVisibility(8);
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                break;
            default:
                UserStoriesScreen userStoriesScreen = this.b;
                if (userStoriesScreen.getView() != null) {
                    UserStoriesScreen.p1(userStoriesScreen).setVisibility(0);
                    UserStoriesScreen.q1(userStoriesScreen).setVisibility(0);
                    userStoriesScreen.z1().setVisibility(userStoriesScreen.H1().t1.a.getValue() instanceof lpi ? 8 : 0);
                }
                break;
        }
    }
}
