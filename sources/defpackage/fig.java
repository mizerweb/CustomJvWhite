package defpackage;

import android.animation.Animator;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class fig implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ TextView c;

    public /* synthetic */ fig(boolean z, TextView textView, int i) {
        this.a = i;
        this.b = z;
        this.c = textView;
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
                boolean z = this.b;
                TextView textView = this.c;
                if (!z) {
                    textView.setAlpha(1.0f);
                } else {
                    ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                    if (layoutParams == null) {
                        ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMarginStart(0);
                        textView.setLayoutParams(marginLayoutParams);
                        textView.setVisibility(4);
                    }
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                boolean z = this.b;
                TextView textView = this.c;
                if (!z) {
                    textView.setAlpha(1.0f);
                } else {
                    ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                    if (layoutParams == null) {
                        ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMarginStart(0);
                        textView.setLayoutParams(marginLayoutParams);
                        textView.setVisibility(4);
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
        switch (this.a) {
            case 0:
                break;
            default:
                boolean z = this.b;
                TextView textView = this.c;
                if (!z) {
                    ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                    if (layoutParams == null) {
                        ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMarginStart(gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
                        textView.setLayoutParams(marginLayoutParams);
                        textView.setVisibility(0);
                    }
                } else {
                    textView.setAlpha(0.0f);
                }
                break;
        }
    }
}
