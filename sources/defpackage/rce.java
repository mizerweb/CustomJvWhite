package defpackage;

import android.animation.Animator;
import android.graphics.drawable.Drawable;
import java.lang.reflect.InvocationTargetException;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* JADX INFO: loaded from: classes3.dex */
public final class rce implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecordControlsWidget b;

    public /* synthetic */ rce(RecordControlsWidget recordControlsWidget, int i) {
        this.a = i;
        this.b = recordControlsWidget;
    }

    private final void A(Animator animator) {
    }

    private final void B(Animator animator) {
    }

    private final void C(Animator animator) {
    }

    private final void D(Animator animator) {
    }

    private final void E(Animator animator) {
    }

    private final void F(Animator animator) {
    }

    private final void G(Animator animator) {
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

    private final void u(Animator animator) {
    }

    private final void v(Animator animator) {
    }

    private final void w(Animator animator) {
    }

    private final void x(Animator animator) {
    }

    private final void y(Animator animator) {
    }

    private final void z(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws IllegalAccessException, InvocationTargetException {
        int i = this.a;
        RecordControlsWidget recordControlsWidget = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = RecordControlsWidget.x1;
                recordControlsWidget.F1().setVisibility(8);
                RecordControlsWidget.o1(recordControlsWidget).setVisibility(8);
                ycj ycjVar = recordControlsWidget.v;
                if (ycjVar != null) {
                    ycjVar.setDurationText(null);
                }
                recordControlsWidget.A1().setAlpha(1.0f);
                recordControlsWidget.t1().setScaleX(1.0f);
                recordControlsWidget.u1().setAlpha(1.0f);
                br4 parentController = recordControlsWidget.getParentController();
                MessageWriteWidget messageWriteWidget = parentController instanceof MessageWriteWidget ? (MessageWriteWidget) parentController : null;
                if (messageWriteWidget != null) {
                    messageWriteWidget.r1(true);
                }
                RecordControlsWidget.p1(recordControlsWidget);
                recordControlsWidget.q1();
                recordControlsWidget.I1().r.setValue(null);
                break;
            case 1:
                zv8[] zv8VarArr2 = RecordControlsWidget.x1;
                recordControlsWidget.F1().setVisibility(8);
                RecordControlsWidget.o1(recordControlsWidget).setVisibility(8);
                recordControlsWidget.u1().setVisibility(8);
                recordControlsWidget.x1().setScaleX(1.0f);
                recordControlsWidget.x1().setScaleY(1.0f);
                recordControlsWidget.x1().setAlpha(1.0f);
                recordControlsWidget.x1().setVisibility(0);
                recordControlsWidget.G1().setVisibility(8);
                recordControlsWidget.G1().setScaleX(0.0f);
                recordControlsWidget.G1().setScaleY(0.0f);
                recordControlsWidget.y1().setAlpha(1.0f);
                recordControlsWidget.u1().setScaleX(1.0f);
                recordControlsWidget.u1().setScaleY(1.0f);
                recordControlsWidget.u1().setAlpha(1.0f);
                recordControlsWidget.A1().setScaleX(1.0f);
                recordControlsWidget.A1().setScaleY(1.0f);
                recordControlsWidget.A1().setAlpha(1.0f);
                br4 parentController2 = recordControlsWidget.getParentController();
                MessageWriteWidget messageWriteWidget2 = parentController2 instanceof MessageWriteWidget ? (MessageWriteWidget) parentController2 : null;
                if (messageWriteWidget2 != null) {
                    messageWriteWidget2.r1(true);
                }
                RecordControlsWidget.p1(recordControlsWidget);
                recordControlsWidget.q1();
                recordControlsWidget.I1().r.setValue(null);
                break;
            case 2:
                zv8[] zv8VarArr3 = RecordControlsWidget.x1;
                recordControlsWidget.x1().setVisibility(8);
                recordControlsWidget.G1().setVisibility(0);
                recordControlsWidget.G1().setAlpha(1.0f);
                break;
            case 3:
                zv8[] zv8VarArr4 = RecordControlsWidget.x1;
                recordControlsWidget.F1().setVisibility(8);
                recordControlsWidget.v1().setAlpha(1.0f);
                recordControlsWidget.E1().setScaleX(1.0f);
                recordControlsWidget.E1().setScaleY(1.0f);
                recordControlsWidget.D1().setScaleX(1.0f);
                recordControlsWidget.D1().setScaleY(1.0f);
                recordControlsWidget.C1().setScaleX(1.0f);
                recordControlsWidget.C1().setScaleY(1.0f);
                ycj ycjVar2 = recordControlsWidget.v;
                if (ycjVar2 != null) {
                    ycjVar2.setAlpha(1.0f);
                    ycjVar2.setBackgroundColor(false);
                    ycjVar2.setDurationColor(false);
                    ycjVar2.setVisiblePlayPauseButton(false);
                }
                recordControlsWidget.u1().setScaleX(1.0f);
                recordControlsWidget.u1().setScaleY(1.0f);
                recordControlsWidget.u1().setAlpha(1.0f);
                recordControlsWidget.v1().setVisibility(8);
                br4 parentController3 = recordControlsWidget.getParentController();
                MessageWriteWidget messageWriteWidget3 = parentController3 instanceof MessageWriteWidget ? (MessageWriteWidget) parentController3 : null;
                if (messageWriteWidget3 != null) {
                    messageWriteWidget3.r1(true);
                }
                RecordControlsWidget.p1(recordControlsWidget);
                recordControlsWidget.q1();
                recordControlsWidget.I1().r.setValue(null);
                break;
            case 4:
                zv8[] zv8VarArr5 = RecordControlsWidget.x1;
                recordControlsWidget.C1().setVisibility(8);
                ycj ycjVar3 = recordControlsWidget.v;
                if (ycjVar3 != null) {
                    ycjVar3.e();
                }
                break;
            case 6:
                zv8[] zv8VarArr6 = RecordControlsWidget.x1;
                recordControlsWidget.C1().setVisibility(8);
                break;
            case 8:
                zv8[] zv8VarArr7 = RecordControlsWidget.x1;
                recordControlsWidget.D1().setVisibility(8);
                ycj ycjVar4 = recordControlsWidget.v;
                if (ycjVar4 != null) {
                    ycjVar4.e();
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
        RecordControlsWidget recordControlsWidget = this.b;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                zv8[] zv8VarArr = RecordControlsWidget.x1;
                recordControlsWidget.F1().setVisibility(0);
                recordControlsWidget.r1().setImageDrawable((Drawable) recordControlsWidget.y.getValue());
                ycj ycjVar = recordControlsWidget.v;
                if (ycjVar != null) {
                    ycjVar.getHandFreeDotView().setVisibility(0);
                }
                recordControlsWidget.D1().setVisibility(8);
                recordControlsWidget.C1().setVisibility(0);
                break;
            case 6:
                break;
            case 7:
                zv8[] zv8VarArr2 = RecordControlsWidget.x1;
                recordControlsWidget.D1().setVisibility(0);
                recordControlsWidget.C1().setVisibility(0);
                ycj ycjVar2 = recordControlsWidget.v;
                if (ycjVar2 != null) {
                    ycjVar2.setVisiblePlayPauseButton(true);
                    ycjVar2.getHandFreeDotView().setVisibility(8);
                    ycjVar2.c();
                }
                break;
            case 8:
                break;
            case 9:
                zv8[] zv8VarArr3 = RecordControlsWidget.x1;
                recordControlsWidget.r1().setImageDrawable((Drawable) recordControlsWidget.y.getValue());
                ycj ycjVar3 = recordControlsWidget.v;
                if (ycjVar3 != null) {
                    ycjVar3.getHandFreeDotView().setVisibility(0);
                }
                recordControlsWidget.D1().setVisibility(0);
                recordControlsWidget.C1().setVisibility(0);
                break;
            default:
                zv8[] zv8VarArr4 = RecordControlsWidget.x1;
                recordControlsWidget.x1().setTranslationX(yl5.d().getDisplayMetrics().density * 72.0f);
                recordControlsWidget.x1().setAlpha(0.0f);
                recordControlsWidget.y1().setTranslationX(yl5.d().getDisplayMetrics().density * 72.0f);
                recordControlsWidget.y1().setAlpha(0.0f);
                recordControlsWidget.w1().setTranslationX(yl5.d().getDisplayMetrics().density * 70.0f);
                recordControlsWidget.w1().setAlpha(0.0f);
                recordControlsWidget.t1().setAlpha(0.0f);
                recordControlsWidget.u1().setScaleX(1.0f);
                recordControlsWidget.u1().setScaleY(1.0f);
                recordControlsWidget.r1().setImageDrawable(recordControlsWidget.B1());
                recordControlsWidget.A1().setAlpha(0.0f);
                recordControlsWidget.A1().setVisibility(0);
                RecordControlsWidget.o1(recordControlsWidget).setVisibility(0);
                recordControlsWidget.u1().setVisibility(0);
                recordControlsWidget.F1().setVisibility(0);
                br4 parentController = recordControlsWidget.getParentController();
                MessageWriteWidget messageWriteWidget = parentController instanceof MessageWriteWidget ? (MessageWriteWidget) parentController : null;
                if (messageWriteWidget != null) {
                    messageWriteWidget.r1(false);
                }
                break;
        }
    }
}
