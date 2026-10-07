package defpackage;

import android.animation.Animator;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class ezi implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ izi b;

    public /* synthetic */ ezi(izi iziVar, int i) {
        this.a = i;
        this.b = iziVar;
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

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
        izi iziVar = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                if (!iziVar.g.d) {
                    izi.r(iziVar, false);
                }
                break;
            case 2:
                break;
            case 3:
                u35 u35Var = iziVar.r;
                u35Var.setTranslationX(0.0f);
                u35Var.setTranslationY(0.0f);
                iziVar.o.setTranslationY(0.0f);
                View viewR = iziVar.g.R();
                if (viewR != null) {
                    viewR.setTranslationX(0.0f);
                }
                break;
            case 4:
                break;
            case 5:
                iziVar.e.s(false);
                break;
            default:
                izi.M(iziVar);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        izi iziVar = this.b;
        switch (i) {
            case 0:
                iziVar.r.setAlpha(1.0f);
                iziVar.o.setAlpha(1.0f);
                iziVar.getTranscriptionView().setAlpha(1.0f);
                View viewR = iziVar.g.R();
                if (viewR != null) {
                    viewR.setAlpha(1.0f);
                }
                View viewR2 = iziVar.b.R();
                if (viewR2 != null) {
                    viewR2.setAlpha(1.0f);
                }
                View viewR3 = iziVar.c.R();
                if (viewR3 != null) {
                    viewR3.setAlpha(1.0f);
                }
                View viewR4 = iziVar.f.R();
                if (viewR4 != null) {
                    viewR4.setAlpha(1.0f);
                }
                View viewR5 = iziVar.h.R();
                if (viewR5 != null) {
                    viewR5.setAlpha(1.0f);
                }
                break;
            case 1:
                if (!iziVar.g.d) {
                    izi.r(iziVar, false);
                }
                break;
            case 2:
                break;
            case 3:
                u35 u35Var = iziVar.r;
                u35Var.setTranslationX(0.0f);
                u35Var.setTranslationY(0.0f);
                iziVar.o.setTranslationY(0.0f);
                View viewR6 = iziVar.g.R();
                if (viewR6 != null) {
                    viewR6.setTranslationX(0.0f);
                }
                break;
            case 4:
                break;
            case 5:
                iziVar.e.s(false);
                break;
            default:
                izi.M(iziVar);
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
        izi iziVar = this.b;
        switch (i) {
            case 2:
                izi.r(iziVar, true);
                break;
            case 4:
                if (iziVar.g.d) {
                    iziVar.e.J();
                    ny8 ny8Var = iziVar.y;
                    if (ny8Var.d()) {
                        ((pyi) ny8Var.getValue()).setVisibility(8);
                    }
                }
                iziVar.n.setOverlayDrawable(null);
                break;
        }
    }
}
