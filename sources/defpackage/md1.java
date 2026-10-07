package defpackage;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;
import one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget;
import one.me.chatmedia.viewer.VideoWebViewScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class md1 implements ComponentCallbacks {
    public final /* synthetic */ int a;
    public final /* synthetic */ ufe b;
    public final /* synthetic */ Object c;

    public /* synthetic */ md1(ufe ufeVar, Object obj, int i) {
        this.a = i;
        this.b = ufeVar;
        this.c = obj;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void i() {
    }

    private final void j() {
    }

    private final void k() {
    }

    private final void l() {
    }

    private final void m() {
    }

    private final void n() {
    }

    /* JADX WARN: Code duplicated, block: B:122:0x01d1  */
    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        boolean z;
        boolean zO;
        yr4 yr4Var;
        yr4 yr4Var2;
        int i = this.a;
        boolean zO2 = false;
        Object obj = this.c;
        ufe ufeVar = this.b;
        switch (i) {
            case 0:
                CallBottomPanelWidget callBottomPanelWidget = (CallBottomPanelWidget) obj;
                int i2 = configuration.orientation;
                if (i2 != ufeVar.a && i2 != 0) {
                    ufeVar.a = i2;
                    zv8[] zv8VarArr = CallBottomPanelWidget.l;
                    mvh mvhVar = callBottomPanelWidget.o1().H;
                    if (mvhVar != null) {
                        mvhVar.a();
                    }
                    mvh mvhVar2 = callBottomPanelWidget.o1().I;
                    if (mvhVar2 != null) {
                        mvhVar2.a();
                    }
                    qp4 qp4Var = callBottomPanelWidget.h;
                    if (qp4Var != null) {
                        qp4Var.dismiss();
                    }
                    callBottomPanelWidget.h = null;
                    break;
                }
                break;
            case 1:
                int i3 = configuration.orientation;
                if (i3 != ufeVar.a && i3 != 0) {
                    ufeVar.a = i3;
                    g52 g52Var = ((pd1) obj).s;
                    z = i3 == 1;
                    zv8[] zv8VarArr2 = g52.a2;
                    g52Var.V(z, false);
                    break;
                }
                break;
            case 2:
                fj1 fj1Var = (fj1) obj;
                y8j y8jVar = fj1Var.u;
                int i4 = configuration.orientation;
                if (i4 != ufeVar.a && i4 != 0) {
                    ufeVar.a = i4;
                    fj1Var.t.b = khb.k;
                    ylc ylcVarU = fj1Var.u(i4 == 1);
                    ej1 ej1Var = fj1Var.y;
                    if (ej1Var != null) {
                        ((hx1) ej1Var).a(y8jVar.getCurrentItem());
                    }
                    ViewGroup.LayoutParams layoutParams = y8jVar.getLayoutParams();
                    if (layoutParams == null) {
                        p51.d();
                    } else {
                        layoutParams.width = ((Number) ylcVarU.a).intValue();
                        layoutParams.height = ((Number) ylcVarU.b).intValue();
                        y8jVar.setLayoutParams(layoutParams);
                        as4 as4Var = fj1Var.A;
                        if (as4Var != null) {
                            es4 es4Var = (es4) as4Var;
                            fj1Var.G(es4Var.j);
                            fj1Var.A(es4Var.k);
                        }
                    }
                    break;
                }
                break;
            case 3:
                CallIncomingScreen callIncomingScreen = (CallIncomingScreen) obj;
                int i5 = configuration.orientation;
                if (i5 != ufeVar.a && i5 != 0) {
                    ufeVar.a = i5;
                    ou7 ou7Var = CallIncomingScreen.m;
                    Object value = callIncomingScreen.q1().o.getValue();
                    em1 em1Var = value instanceof em1 ? (em1) value : null;
                    if (em1Var != null) {
                        ((g52) callIncomingScreen.f.m(callIncomingScreen, CallIncomingScreen.n[0])).V(i5 == 1, em1Var.b);
                        break;
                    }
                }
                break;
            case 4:
                CallLinkInfoScreen callLinkInfoScreen = (CallLinkInfoScreen) obj;
                int i6 = configuration.orientation;
                if (i6 != ufeVar.a && i6 != 0) {
                    ufeVar.a = i6;
                    if (i6 != 1) {
                        ldf ldfVar = CallLinkInfoScreen.t;
                        cyb cybVarQ1 = callLinkInfoScreen.q1();
                        ViewGroup.LayoutParams layoutParams2 = cybVarQ1.getLayoutParams();
                        if (layoutParams2 == null) {
                            ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        } else {
                            layoutParams2.width = gm0.K(yl5.d().getDisplayMetrics().density * 360.0f);
                            cybVarQ1.setLayoutParams(layoutParams2);
                            RecyclerView recyclerViewP1 = CallLinkInfoScreen.p1(callLinkInfoScreen);
                            ViewGroup.LayoutParams layoutParams3 = recyclerViewP1.getLayoutParams();
                            if (layoutParams3 == null) {
                                ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                            } else {
                                layoutParams3.width = gm0.K(360.0f * yl5.d().getDisplayMetrics().density);
                                recyclerViewP1.setLayoutParams(layoutParams3);
                            }
                        }
                    } else {
                        ldf ldfVar2 = CallLinkInfoScreen.t;
                        cyb cybVarQ2 = callLinkInfoScreen.q1();
                        ViewGroup.LayoutParams layoutParams4 = cybVarQ2.getLayoutParams();
                        if (layoutParams4 == null) {
                            ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        } else {
                            layoutParams4.width = -1;
                            cybVarQ2.setLayoutParams(layoutParams4);
                            RecyclerView recyclerViewP2 = CallLinkInfoScreen.p1(callLinkInfoScreen);
                            ViewGroup.LayoutParams layoutParams5 = recyclerViewP2.getLayoutParams();
                            if (layoutParams5 == null) {
                                ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                            } else {
                                layoutParams5.width = -1;
                                recyclerViewP2.setLayoutParams(layoutParams5);
                            }
                        }
                    }
                    break;
                }
                break;
            case 5:
                CallScreen callScreen = (CallScreen) obj;
                int i7 = configuration.orientation;
                if (i7 != ufeVar.a && i7 != 0) {
                    ufeVar.a = i7;
                    boolean z2 = i7 == 1;
                    j8e j8eVar = callScreen.K;
                    zv8[] zv8VarArr3 = CallScreen.E1;
                    callScreen.E1((FrameLayout) j8eVar.m(callScreen, zv8VarArr3[9]), (tp2) callScreen.Y.m(callScreen, zv8VarArr3[11]), (tp2) callScreen.Z.m(callScreen, zv8VarArr3[12]), z2);
                    fs4 fs4Var = (fs4) callScreen.F.getValue();
                    if (z2) {
                        bz1 bz1Var = fs4Var.e;
                        if (bz1Var != null) {
                            WeakHashMap weakHashMap = i7j.a;
                            ixj ixjVarA = z6j.a(bz1Var);
                            if (ixjVarA != null) {
                                zO2 = ixjVarA.a.o(1);
                            }
                        }
                    } else {
                        bz1 bz1Var2 = fs4Var.e;
                        if (bz1Var2 == null) {
                            zO = false;
                        } else {
                            WeakHashMap weakHashMap2 = i7j.a;
                            ixj ixjVarA2 = z6j.a(bz1Var2);
                            if (ixjVarA2 != null) {
                                zO = ixjVarA2.a.o(1);
                            } else {
                                zO = false;
                            }
                        }
                        if (!zO) {
                            zO2 = true;
                        }
                    }
                    fs4Var.g = zO2;
                    fs4Var.f = true;
                    if (z2) {
                        fs4Var.c.removeCallbacks(fs4Var.d);
                    }
                    fs4Var.a();
                    yr4 yr4Var3 = callScreen.N1().k;
                    ((View) callScreen.p1.m(callScreen, zv8VarArr3[13])).setTranslationY((z2 || yr4Var3.c) ? 0.0f : yr4Var3.a);
                    if (z2) {
                        Object value2 = callScreen.R1().x.getValue();
                        of1 of1Var = value2 instanceof of1 ? (of1) value2 : null;
                        if (of1Var != null) {
                            callScreen.T1(of1Var.a);
                        }
                    } else {
                        View viewQ1 = callScreen.Q1();
                        ViewStub viewStub = viewQ1 instanceof ViewStub ? (ViewStub) viewQ1 : null;
                        if (viewStub == null || n7j.n(viewStub)) {
                            callScreen.Q1().setVisibility(8);
                        }
                    }
                    qp4 qp4Var2 = callScreen.B1;
                    if (qp4Var2 != null) {
                        qp4Var2.dismiss();
                    }
                    callScreen.B1 = null;
                    break;
                }
                break;
            case 6:
                bz1 bz1Var3 = (bz1) obj;
                y8j y8jVar2 = bz1Var3.E;
                int i8 = configuration.orientation;
                if (i8 != ufeVar.a && i8 != 0) {
                    ufeVar.a = i8;
                    bz1Var3.t.b = khb.k;
                    bz1Var3.x(i8 == 1);
                    View childAt = y8jVar2.getChildAt(0);
                    RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
                    if (recyclerView != null) {
                        recyclerView.X();
                    }
                    WeakHashMap weakHashMap3 = i7j.a;
                    if (y8jVar2.isLaidOut() && !y8jVar2.isLayoutRequested()) {
                        bz1Var3.getCallModeChangeManager().a().f();
                    } else {
                        y8jVar2.addOnLayoutChangeListener(new az1(bz1Var3, 1));
                    }
                    break;
                }
                break;
            case 7:
                r12 r12Var = (r12) obj;
                int i9 = configuration.orientation;
                if (i9 != ufeVar.a && i9 != 0) {
                    ufeVar.a = i9;
                    z = i9 == 1;
                    eg4 eg4VarH = ch3.h(r12Var);
                    r12Var.u(eg4VarH, z);
                    eg4VarH.a(r12Var);
                    r12Var.x.setVisibility(z ? 0 : 8);
                    r12Var.v.setVisibility(z ? 0 : 8);
                    break;
                }
                break;
            case 8:
                m22 m22Var = (m22) obj;
                int i10 = configuration.orientation;
                if (i10 != ufeVar.a && i10 != 0) {
                    ufeVar.a = i10;
                    m22Var.t.b = khb.k;
                    m22Var.x(m22Var.B);
                    as4 as4Var2 = m22Var.E;
                    if (as4Var2 != null && (yr4Var = ((es4) as4Var2).j) != null) {
                        m22Var.setTranslationY(m22.u(yr4Var, i10 == 1));
                        break;
                    }
                }
                break;
            case 9:
                w22 w22Var = (w22) obj;
                int i11 = configuration.orientation;
                if (i11 != ufeVar.a && i11 != 0) {
                    ufeVar.a = i11;
                    boolean z3 = i11 == 1;
                    eg4 eg4VarH2 = ch3.h(w22Var);
                    w22Var.C(eg4VarH2, z3);
                    eg4VarH2.a(w22Var);
                    w22Var.D(z3);
                    as4 as4Var3 = w22Var.n1;
                    if (as4Var3 != null && (yr4Var2 = ((es4) as4Var3).k) != null) {
                        w22Var.A(yr4Var2);
                        g52 g52Var2 = w22Var.t;
                        z = i11 == 1;
                        zv8[] zv8VarArr4 = g52.a2;
                        g52Var2.V(z, false);
                        break;
                    }
                }
                break;
            case 10:
                a42 a42Var = (a42) obj;
                int i12 = configuration.orientation;
                if (i12 != ufeVar.a && i12 != 0) {
                    ufeVar.a = i12;
                    if (i12 == 1) {
                        a42Var.getCallShareSound().setVisibility(8);
                    } else if (a42Var.x) {
                        n7j.m(a42Var.C, a42Var.getCallShareSound(), null);
                        a42Var.getCallShareSound().setVisibility(0);
                    }
                    break;
                }
                break;
            case 11:
                int i13 = configuration.orientation;
                if (i13 != ufeVar.a && i13 != 0) {
                    ufeVar.a = i13;
                    zv8[] zv8VarArr5 = CallWaitingRoomEventsWidget.m;
                    CallWaitingRoomEventsWidget.o1(((CallWaitingRoomEventsWidget) obj).q1(), i13 == 1);
                    break;
                }
                break;
            case 12:
                izi iziVar = (izi) obj;
                int i14 = configuration.orientation;
                if (i14 != ufeVar.a && i14 != 0) {
                    ufeVar.a = i14;
                    ViewParent parent = iziVar.getParent();
                    iea ieaVar = parent instanceof iea ? (iea) parent : null;
                    if (ieaVar != null) {
                        ieaVar.addOnLayoutChangeListener(new dzi(iziVar, 1));
                    }
                    break;
                }
                break;
            default:
                int i15 = configuration.orientation;
                if (i15 != ufeVar.a && i15 != 0) {
                    ufeVar.a = i15;
                    VideoWebViewScreen.D1((VideoWebViewScreen) obj, i15);
                    break;
                }
                break;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        int i = this.a;
    }
}
