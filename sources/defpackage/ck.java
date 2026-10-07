package defpackage;

import android.animation.Animator;
import android.view.View;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class ck implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public ck(ProfileAvatarsScreen profileAvatarsScreen, boolean z) {
        this.a = 2;
        this.c = profileAvatarsScreen;
        this.b = z;
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

    private final void f(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                View view = (View) this.c;
                view.setAlpha(1.0f);
                view.setVisibility(this.b ? 0 : 8);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        boolean z = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                View view = (View) obj;
                view.setAlpha(1.0f);
                view.setVisibility(z ? 0 : 8);
                break;
            case 1:
                break;
            default:
                ProfileAvatarsScreen profileAvatarsScreen = (ProfileAvatarsScreen) obj;
                if (profileAvatarsScreen.getView() != null) {
                    zv8[] zv8VarArr = ProfileAvatarsScreen.r;
                    profileAvatarsScreen.I1().setVisibility(z ? 0 : 8);
                    if (!z) {
                        profileAvatarsScreen.G1(false);
                    }
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
        int i = this.a;
        boolean z = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (z) {
                    ((View) obj).setVisibility(0);
                }
                break;
            case 1:
                if (z) {
                    p0m.a(((xy7) obj).a, lt7.GESTURE_START);
                }
                break;
            default:
                ProfileAvatarsScreen profileAvatarsScreen = (ProfileAvatarsScreen) obj;
                if (profileAvatarsScreen.getView() != null) {
                    zv8[] zv8VarArr = ProfileAvatarsScreen.r;
                    profileAvatarsScreen.I1().setVisibility(0);
                    if (z) {
                        profileAvatarsScreen.G1(true);
                    }
                }
                break;
        }
    }

    public /* synthetic */ ck(boolean z, Object obj, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }
}
