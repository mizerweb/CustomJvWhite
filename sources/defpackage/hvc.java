package defpackage;

import android.animation.Animator;
import one.me.mediaeditor.PhotoEditScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class hvc implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoEditScreen b;

    public /* synthetic */ hvc(PhotoEditScreen photoEditScreen, int i) {
        this.a = i;
        this.b = photoEditScreen;
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

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    private final void i(Animator animator) {
    }

    private final void j(Animator animator) {
    }

    private final void k(Animator animator) {
    }

    private final void l(Animator animator) {
    }

    private final void m(Animator animator) {
    }

    private final void n(Animator animator) {
    }

    private final void o(Animator animator) {
    }

    private final void p(Animator animator) {
    }

    private final void q(Animator animator) {
    }

    private final void r(Animator animator) {
    }

    private final void s(Animator animator) {
    }

    private final void t(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
        PhotoEditScreen photoEditScreen = this.b;
        switch (i) {
            case 1:
                if (photoEditScreen.isAttached()) {
                    photoEditScreen.r1().setVisibility(8);
                }
                break;
            case 3:
                if (photoEditScreen.isAttached()) {
                    photoEditScreen.z1().setVisibility(8);
                }
                break;
            case 4:
                if (photoEditScreen.isAttached()) {
                    photoEditScreen.x1().setVisibility(8);
                }
                break;
            case 6:
                if (photoEditScreen.isAttached()) {
                    photoEditScreen.x1().setVisibility(8);
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        PhotoEditScreen photoEditScreen = this.b;
        switch (i) {
            case 1:
                if (photoEditScreen.isAttached()) {
                    photoEditScreen.r1().setVisibility(8);
                }
                break;
            case 3:
                if (photoEditScreen.isAttached()) {
                    photoEditScreen.z1().setVisibility(8);
                }
                break;
            case 4:
                if (photoEditScreen.isAttached()) {
                    photoEditScreen.x1().setVisibility(8);
                }
                break;
            case 6:
                if (photoEditScreen.isAttached()) {
                    photoEditScreen.x1().setVisibility(8);
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
        PhotoEditScreen photoEditScreen = this.b;
        switch (i) {
            case 0:
                if (photoEditScreen.isAttached()) {
                    photoEditScreen.x1().setVisibility(0);
                }
                break;
            case 1:
                break;
            case 2:
                if (photoEditScreen.isAttached()) {
                    photoEditScreen.x1().setVisibility(0);
                }
                break;
            case 3:
            case 4:
                break;
            case 5:
                if (photoEditScreen.isAttached()) {
                    photoEditScreen.r1().setAlpha(0.0f);
                    photoEditScreen.r1().setVisibility(0);
                    photoEditScreen.r1().H0();
                }
                break;
            case 6:
                break;
            default:
                if (photoEditScreen.isAttached()) {
                    photoEditScreen.z1().setAlpha(0.0f);
                    photoEditScreen.z1().setVisibility(0);
                }
                break;
        }
    }
}
