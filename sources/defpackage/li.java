package defpackage;

import android.animation.Animator;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class li implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public li(oeh oehVar, float f) {
        this.a = 20;
        this.b = oehVar;
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

    private final void H(Animator animator) {
    }

    private final void I(Animator animator) {
    }

    private final void J(Animator animator) {
    }

    private final void K(Animator animator) {
    }

    private final void L(Animator animator) {
    }

    private final void M(Animator animator) {
    }

    private final void N(Animator animator) {
    }

    private final void O(Animator animator) {
    }

    private final void P(Animator animator) {
    }

    private final void Q(Animator animator) {
    }

    private final void R(Animator animator) {
    }

    private final void S(Animator animator) {
    }

    private final void T(Animator animator) {
    }

    private final void U(Animator animator) {
    }

    private final void V(Animator animator) {
    }

    private final void W(Animator animator) {
    }

    private final void X(Animator animator) {
    }

    private final void Y(Animator animator) {
    }

    private final void Z(Animator animator) {
    }

    private final void a(Animator animator) {
    }

    private final void a0(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void b0(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void c0(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void d0(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void e0(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    private final void f0(Animator animator) {
    }

    private final void g(Animator animator) {
    }

    private final void g0(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    private final void h0(Animator animator) {
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
        switch (this.a) {
            case 1:
                int[] iArr = ((mi) this.b).b;
                iArr[2] = -5029377;
                iArr[3] = -5029377;
                break;
            case 4:
                ((i72) this.b).v = false;
                break;
            case 7:
                xg6 xg6Var = (xg6) this.b;
                xg6Var.o = null;
                xg6Var.requestLayout();
                break;
            case 8:
                String str = (String) ((uj6) this.b).a;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "Fade animation end, animateView.alpha=" + ((x5j) ((uj6) this.b).c).getAlpha(), null);
                    }
                    break;
                }
                break;
            case 9:
                az7 az7Var = (az7) this.b;
                az7Var.a(0.0f, 0.0f);
                az7Var.a.b();
                az7Var.e = false;
                break;
            case 10:
                tea teaVar = (tea) this.b;
                teaVar.J = null;
                teaVar.y.setForeground(null);
                teaVar.O().setAlpha(150);
                break;
            case 12:
                ((iua) this.b).invoke();
                break;
            case 14:
                k1d k1dVar = (k1d) this.b;
                c7k c7kVar = k1dVar.b;
                View view = k1dVar.a;
                c7kVar.o(view.getX(), view.getY());
                k1dVar.b();
                break;
            case 15:
                af7 af7Var = ((d0e) this.b).m;
                if (af7Var != null) {
                    af7Var.invoke();
                }
                break;
            case 16:
                w5e w5eVar = (w5e) this.b;
                w5eVar.a = false;
                w5eVar.b = null;
                break;
            case 17:
                ((sfe) this.b).a = false;
                break;
            case 22:
                ((g1j) this.b).J = null;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                int[] iArr = ((mi) this.b).b;
                iArr[2] = -5029377;
                iArr[3] = -5029377;
                break;
            case 2:
                break;
            case 3:
                CallWaitingRoomEventsWidget callWaitingRoomEventsWidget = (CallWaitingRoomEventsWidget) this.b;
                zv8[] zv8VarArr = CallWaitingRoomEventsWidget.m;
                callWaitingRoomEventsWidget.u1();
                break;
            case 4:
                ((i72) this.b).v = false;
                break;
            case 5:
                break;
            case 6:
                ju5 ju5Var = (ju5) this.b;
                mu5 mu5Var = (mu5) ww3.D1(ju5Var.a);
                if (mu5Var != null) {
                    ju5Var.b(mu5Var.b);
                }
                ju5Var.e = null;
                break;
            case 7:
                xg6 xg6Var = (xg6) this.b;
                xg6Var.o = null;
                xg6Var.requestLayout();
                break;
            case 8:
                String str = (String) ((uj6) this.b).a;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "Fade animation end, animateView.alpha=" + ((x5j) ((uj6) this.b).c).getAlpha(), null);
                    }
                    break;
                }
                break;
            case 9:
                az7 az7Var = (az7) this.b;
                az7Var.a(0.0f, 0.0f);
                az7Var.a.b();
                az7Var.e = false;
                break;
            case 10:
                tea teaVar = (tea) this.b;
                teaVar.J = null;
                teaVar.y.setForeground(null);
                teaVar.O().setAlpha(150);
                break;
            case 11:
                ml9.e((View) ((t7c) this.b).q.getValue());
                break;
            case 12:
                ((iua) this.b).invoke();
                break;
            case 13:
                ((tcc) this.b).setAlpha(0.0f);
                break;
            case 14:
                k1d k1dVar = (k1d) this.b;
                c7k c7kVar = k1dVar.b;
                View view = k1dVar.a;
                c7kVar.o(view.getX(), view.getY());
                k1dVar.b();
                break;
            case 15:
                af7 af7Var = ((d0e) this.b).m;
                if (af7Var != null) {
                    af7Var.invoke();
                }
                break;
            case 16:
                w5e w5eVar = (w5e) this.b;
                w5eVar.a = false;
                w5eVar.b = null;
                break;
            case 17:
                break;
            case 18:
                tvj.a("ScreenFlashView", "ScreenFlash#apply: onAnimationEnd");
                ((h7b) this.b).run();
                break;
            case 19:
                ViewGroup viewGroup = (ViewGroup) this.b;
                viewGroup.removeView(viewGroup.findViewById(R.id.swipe_fade));
                break;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                oeh oehVar = (oeh) this.b;
                SwipeWidget swipeWidget = oehVar.s;
                ViewGroup viewGroup2 = oehVar.e;
                View view2 = oehVar.d;
                if (swipeWidget != null) {
                    swipeWidget.v1();
                }
                teh tehVar = view2 instanceof teh ? (teh) view2 : null;
                if (tehVar != null) {
                    tehVar.setOnTouch(null);
                    tehVar.setOnRequestInterceptTouchEvent(null);
                }
                viewGroup2.removeView(view2);
                viewGroup2.removeView(viewGroup2.findViewById(R.id.swipe_fade));
                SwipeWidget swipeWidget2 = oehVar.s;
                if (swipeWidget2 != null) {
                    swipeWidget2.b = false;
                    swipeWidget2.getRouter().D();
                    swipeWidget2.u1();
                }
                oehVar.s = null;
                xme xmeVar = oehVar.q;
                try {
                    ((VelocityTracker) xmeVar.getValue()).recycle();
                    break;
                } catch (Throwable unused) {
                }
                xmeVar.b = khb.k;
                break;
            case 21:
                ((i8f) this.b).invoke();
                break;
            case 22:
                ((g1j) this.b).J = null;
                break;
            default:
                VideoMessageWidget videoMessageWidget = (VideoMessageWidget) this.b;
                zv8[] zv8VarArr2 = VideoMessageWidget.B;
                videoMessageWidget.u1().setVisibility(8);
                videoMessageWidget.r1().setVisibility(8);
                videoMessageWidget.t1().setVisibility(8);
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
        Object obj = this.b;
        switch (i) {
            case 0:
                ((i9c) obj).invoke();
                break;
            case 2:
                ((cyb) obj).setClickable(false);
                break;
            case 4:
                ((i72) obj).v = true;
                break;
            case 5:
                in2.a((in2) obj, 1);
                break;
        }
    }

    public /* synthetic */ li(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
