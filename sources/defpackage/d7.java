package defpackage;

import android.animation.Animator;
import android.text.Layout;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* JADX INFO: loaded from: classes2.dex */
public final class d7 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d7(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
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

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                oj ojVar = (oj) obj2;
                ojVar.d = null;
                oj.a(ojVar, (cyb) obj);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                break;
            default:
                ((fwg) obj2).i = null;
                ((dx4) obj).invoke();
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                e7 e7Var = (e7) obj2;
                View view = (View) obj;
                e7Var.k = null;
                View view2 = e7Var.l;
                if (view2 != null) {
                    view2.setForeground(null);
                }
                e7Var.l = null;
                e7Var.m = 0.0f;
                if (view != null) {
                    view.setClipToOutline(false);
                    view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                }
                break;
            case 1:
                oj ojVar = (oj) obj2;
                ojVar.d = null;
                oj.a(ojVar, (cyb) obj);
                break;
            case 2:
                break;
            case 3:
                FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = (FakeInAppReviewBottomSheet) obj2;
                zv8[] zv8VarArr = FakeInAppReviewBottomSheet.E;
                ((wf4) fakeInAppReviewBottomSheet.v.m(fakeInAppReviewBottomSheet, FakeInAppReviewBottomSheet.E[0])).setVisibility(8);
                ((FrameLayout) obj).postDelayed(fakeInAppReviewBottomSheet.C, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
                break;
            case 4:
                r6e r6eVar = (r6e) obj2;
                if (r6eVar != null) {
                    r6eVar.a();
                }
                ((t6e) obj).k = null;
                break;
            case 5:
                r6a r6aVar = (r6a) obj2;
                ((ve1) r6aVar.a).getOverlay().remove((unf) obj);
                r6aVar.b = null;
                break;
            default:
                ((fwg) obj2).i = null;
                ((dx4) obj).invoke();
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
            case 2:
                ((xg6) this.b).i = (Layout) this.c;
                break;
        }
    }
}
