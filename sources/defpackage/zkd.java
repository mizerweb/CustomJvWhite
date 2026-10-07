package defpackage;

import android.animation.Animator;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class zkd implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zkd(Object obj, boolean z, float f, int i) {
        this.a = i;
        this.d = obj;
        this.b = z;
        this.c = f;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ProfileAvatarsScreen profileAvatarsScreen = (ProfileAvatarsScreen) this.d;
                if (profileAvatarsScreen.getView() != null) {
                    ProfileAvatarsScreen.D1(profileAvatarsScreen).setAlpha(this.c);
                    profileAvatarsScreen.q = null;
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws IllegalAccessException, InvocationTargetException {
        int i = this.a;
        boolean z = this.b;
        Object obj = this.d;
        switch (i) {
            case 0:
                ProfileAvatarsScreen profileAvatarsScreen = (ProfileAvatarsScreen) obj;
                if (profileAvatarsScreen.getView() != null) {
                    ProfileAvatarsScreen.D1(profileAvatarsScreen).setVisibility(z ? 0 : 8);
                    profileAvatarsScreen.q = null;
                }
                break;
            default:
                oeh oehVar = (oeh) obj;
                boolean zB = oehVar.b();
                ViewGroup viewGroup = oehVar.e;
                if (zB) {
                    oehVar.a();
                } else {
                    ksk.b(viewGroup, oehVar.a(), null, null, 1.0f, oehVar.g != 3);
                }
                oehVar.o = null;
                viewGroup.removeView(viewGroup.findViewById(R.id.swipe_fade));
                if (z) {
                    oehVar.h = false;
                    oehVar.i = -1.0f;
                    oehVar.j = -1.0f;
                }
                SwipeWidget swipeWidget = oehVar.s;
                if (swipeWidget != null) {
                    swipeWidget.b = false;
                    swipeWidget.p1();
                    swipeWidget.t1(this.c);
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
                ProfileAvatarsScreen profileAvatarsScreen = (ProfileAvatarsScreen) this.d;
                if (profileAvatarsScreen.getView() != null) {
                    ProfileAvatarsScreen.D1(profileAvatarsScreen).setVisibility(0);
                }
                break;
        }
    }
}
