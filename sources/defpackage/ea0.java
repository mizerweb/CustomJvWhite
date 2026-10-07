package defpackage;

import android.animation.Animator;

/* JADX INFO: loaded from: classes3.dex */
public final class ea0 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ea0(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
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

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
            case 1:
                break;
            case 2:
                ((e7e) obj).invoke(Integer.valueOf(i2));
                break;
            default:
                pbg pbgVar = (pbg) ((tg8) obj);
                pbgVar.C("");
                pbgVar.w.setTextColor(tre.I0(i2, 1.0f));
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
            case 1:
                break;
            case 2:
                ((e7e) obj).invoke(Integer.valueOf(i2));
                break;
            default:
                pbg pbgVar = (pbg) ((tg8) obj);
                pbgVar.C("");
                pbgVar.w.setTextColor(tre.I0(i2, 1.0f));
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
        int i2 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ha0 ha0Var = (ha0) obj;
                ad0 ad0Var = ha0Var.r;
                v0i v0iVar = ha0Var.h;
                if (v0iVar.d) {
                    ha0Var.getTranscriptionView().setVisibility(0);
                    ha0Var.getTranscriptionView().setAlpha(0.0f);
                }
                ad0Var.setExpanded(v0iVar.d);
                int iG = i2 - ha0Var.g();
                if (Math.abs(iG - ad0Var.o) > gm0.K(4.0f * yl5.d().getDisplayMetrics().density)) {
                    ad0Var.q = true;
                    ad0Var.a(iG, ad0Var.u);
                    break;
                }
                break;
            case 1:
                in2.a((in2) obj, i2);
                break;
        }
    }
}
