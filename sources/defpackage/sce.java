package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* JADX INFO: loaded from: classes3.dex */
public final class sce implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecordControlsWidget b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ sce(RecordControlsWidget recordControlsWidget, boolean z, int i) {
        this.a = i;
        this.b = recordControlsWidget;
        this.c = z;
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

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        boolean z = this.c;
        RecordControlsWidget recordControlsWidget = this.b;
        switch (i) {
            case 0:
                RecordControlsWidget.o1(recordControlsWidget).setVisibility(8);
                recordControlsWidget.x1().setTranslationY(0.0f);
                recordControlsWidget.x1().setAlpha(1.0f);
                recordControlsWidget.y1().setTranslationY(0.0f);
                recordControlsWidget.y1().setAlpha(1.0f);
                recordControlsWidget.w1().setTranslationY(0.0f);
                recordControlsWidget.w1().setAlpha(1.0f);
                recordControlsWidget.v1().setAlpha(1.0f);
                recordControlsWidget.E1().setTranslationY(0.0f);
                recordControlsWidget.E1().setAlpha(1.0f);
                if (z) {
                    recordControlsWidget.C1().setTranslationY(0.0f);
                    recordControlsWidget.C1().setAlpha(1.0f);
                }
                ycj ycjVar = recordControlsWidget.v;
                if (ycjVar != null) {
                    ycjVar.e();
                }
                break;
            case 1:
                break;
            default:
                zv8[] zv8VarArr = RecordControlsWidget.x1;
                recordControlsWidget.x1().setAlpha(1.0f);
                recordControlsWidget.x1().setTranslationX(0.0f);
                recordControlsWidget.y1().setAlpha(1.0f);
                recordControlsWidget.y1().setTranslationX(0.0f);
                recordControlsWidget.w1().setAlpha(1.0f);
                recordControlsWidget.w1().setTranslationX(0.0f);
                recordControlsWidget.A1().setAlpha(1.0f);
                Drawable drawableB1 = recordControlsWidget.B1();
                pq3.j.h(recordControlsWidget.r1());
                sb8.m0(-1, drawableB1);
                recordControlsWidget.t1().setScaleX(1.0f);
                recordControlsWidget.t1().setScaleY(1.0f);
                recordControlsWidget.t1().setAlpha(1.0f);
                if (z) {
                    View viewX1 = recordControlsWidget.x1();
                    recordControlsWidget.r1.B(recordControlsWidget, RecordControlsWidget.x1[17], yab.i0(v7j.b(viewX1), null, 0, new dn0(viewX1, null, 5), 3));
                    AnimatorSet animatorSet = new AnimatorSet();
                    recordControlsWidget.u1 = animatorSet;
                    animatorSet.play(fsk.a(recordControlsWidget.w1(), View.TRANSLATION_X, 0.0f, yl5.d().getDisplayMetrics().density * (-4.0f), 1000L, 1000L, false, np0.m));
                    AnimatorSet animatorSet2 = recordControlsWidget.u1;
                    if (animatorSet2 != null) {
                        animatorSet2.start();
                    }
                    recordControlsWidget.v1 = new AnimatorSet();
                    ylc ylcVar = recordControlsWidget.I;
                    float fFloatValue = ylcVar != null ? ((Number) ylcVar.b).floatValue() : 0.0f;
                    AnimatorSet animatorSet3 = recordControlsWidget.v1;
                    if (animatorSet3 != null) {
                        animatorSet3.play(fsk.a(recordControlsWidget.A1(), View.TRANSLATION_Y, fFloatValue, fFloatValue + gm0.K(8.0f * yl5.d().getDisplayMetrics().density), 1000L, 1000L, false, np0.m));
                    }
                    AnimatorSet animatorSet4 = recordControlsWidget.v1;
                    if (animatorSet4 != null) {
                        animatorSet4.addListener(new u5e(recordControlsWidget, fFloatValue, 1));
                    }
                    AnimatorSet animatorSet5 = recordControlsWidget.v1;
                    if (animatorSet5 != null) {
                        animatorSet5.start();
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
            case 1:
                zv8[] zv8VarArr = RecordControlsWidget.x1;
                RecordControlsWidget recordControlsWidget = this.b;
                recordControlsWidget.E1().setTranslationY(yl5.d().getDisplayMetrics().density * 48.0f);
                recordControlsWidget.E1().setAlpha(0.0f);
                boolean z = this.c;
                if (z) {
                    recordControlsWidget.C1().setTranslationY(yl5.d().getDisplayMetrics().density * 48.0f);
                    recordControlsWidget.C1().setAlpha(0.0f);
                }
                recordControlsWidget.C1().setVisibility(z ? 0 : 8);
                recordControlsWidget.D1().setVisibility(8);
                recordControlsWidget.u1().setScaleX(1.0f);
                recordControlsWidget.u1().setScaleY(1.0f);
                Float f = recordControlsWidget.G;
                if (f != null) {
                    recordControlsWidget.u1().setX(f.floatValue());
                }
                recordControlsWidget.r1().setImageDrawable((Drawable) recordControlsWidget.y.getValue());
                ycj ycjVar = recordControlsWidget.v;
                if (ycjVar != null) {
                    ycjVar.getHandFreeDotView().setVisibility(0);
                    ycjVar.getHandFreeDotView().setAlpha(1.0f);
                    ycjVar.getHandFreeDotView().setScaleX(1.0f);
                    ycjVar.getHandFreeDotView().setScaleY(1.0f);
                }
                recordControlsWidget.v1().setAlpha(0.0f);
                recordControlsWidget.v1().setVisibility(0);
                break;
        }
    }
}
