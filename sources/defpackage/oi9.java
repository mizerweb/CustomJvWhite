package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class oi9 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qi9 b;

    public /* synthetic */ oi9(qi9 qi9Var, int i) {
        this.a = i;
        this.b = qi9Var;
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
        qi9 qi9Var = this.b;
        switch (i) {
            case 0:
                qi9Var.e().start();
                qi9Var.d().start();
                FrameLayout frameLayout = qi9Var.a;
                k36 k36Var = qi9Var.j;
                frameLayout.removeCallbacks(k36Var);
                frameLayout.postDelayed(k36Var, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
                break;
            case 2:
                qi9Var.e().stop();
                qi9Var.d().stop();
                qi9Var.a.removeCallbacks(qi9Var.j);
                qi9Var.f().setVisibility(8);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        qi9 qi9Var = this.b;
        switch (i) {
            case 0:
                qi9Var.e().start();
                qi9Var.d().start();
                FrameLayout frameLayout = qi9Var.a;
                k36 k36Var = qi9Var.j;
                frameLayout.removeCallbacks(k36Var);
                frameLayout.postDelayed(k36Var, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
                break;
            case 2:
                qi9Var.e().stop();
                qi9Var.d().stop();
                qi9Var.a.removeCallbacks(qi9Var.j);
                qi9Var.f().setVisibility(8);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        float f;
        float f2;
        Context context;
        int i = this.a;
        qi9 qi9Var = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                qi9Var.f().setBackground((GradientDrawable) qi9Var.g.getValue());
                qi9Var.f().setVisibility(0);
                w0c w0cVar = (w0c) qi9Var.f().findViewById(R.id.oneme_longpress_playback_control_counter);
                if (w0cVar != null) {
                    ViewGroup.LayoutParams layoutParams = w0cVar.getLayoutParams();
                    if (layoutParams == null) {
                        ore.n("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    } else {
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                        w0c w0cVar2 = (w0c) qi9Var.f().findViewById(R.id.oneme_longpress_playback_control_counter);
                        if (w0cVar2 == null || (context = w0cVar2.getContext()) == null || context.getResources().getConfiguration().orientation != 1) {
                            f = yl5.d().getDisplayMetrics().density;
                            f2 = 34.0f;
                        } else {
                            f = yl5.d().getDisplayMetrics().density;
                            f2 = 124.0f;
                        }
                        layoutParams2.topMargin = gm0.K(f2 * f);
                        w0cVar.setLayoutParams(layoutParams2);
                    }
                }
                View viewFindViewById = qi9Var.f().findViewById(R.id.oneme_longpress_playback_control_hint);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(0);
                }
                break;
            case 2:
                break;
            default:
                qi9Var.f().setVisibility(0);
                break;
        }
    }
}
