package one.me.calls.ui.ui.call;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a4c;
import defpackage.a8j;
import defpackage.a9j;
import defpackage.ac1;
import defpackage.ad1;
import defpackage.ao1;
import defpackage.b1d;
import defpackage.b9b;
import defpackage.bc1;
import defpackage.br1;
import defpackage.br4;
import defpackage.bsb;
import defpackage.bx1;
import defpackage.bz1;
import defpackage.c1d;
import defpackage.c3;
import defpackage.c32;
import defpackage.c79;
import defpackage.ch3;
import defpackage.chb;
import defpackage.chg;
import defpackage.cqk;
import defpackage.cx1;
import defpackage.cz1;
import defpackage.d4f;
import defpackage.d62;
import defpackage.d9b;
import defpackage.dhg;
import defpackage.dk2;
import defpackage.due;
import defpackage.dwd;
import defpackage.dx1;
import defpackage.e5d;
import defpackage.e9i;
import defpackage.eg4;
import defpackage.ehg;
import defpackage.es4;
import defpackage.ev;
import defpackage.ex1;
import defpackage.f5d;
import defpackage.f62;
import defpackage.fs4;
import defpackage.fx1;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.gr4;
import defpackage.gx1;
import defpackage.h;
import defpackage.h02;
import defpackage.h22;
import defpackage.hhg;
import defpackage.hr4;
import defpackage.hsk;
import defpackage.ht1;
import defpackage.hu;
import defpackage.hve;
import defpackage.i7j;
import defpackage.ifh;
import defpackage.ix1;
import defpackage.j11;
import defpackage.j8e;
import defpackage.je9;
import defpackage.jf1;
import defpackage.jhd;
import defpackage.jx1;
import defpackage.jz;
import defpackage.k32;
import defpackage.k42;
import defpackage.kf1;
import defpackage.ki6;
import defpackage.ks6;
import defpackage.l6m;
import defpackage.l7j;
import defpackage.lf1;
import defpackage.lq4;
import defpackage.lr1;
import defpackage.ltb;
import defpackage.lvb;
import defpackage.lve;
import defpackage.lxi;
import defpackage.m02;
import defpackage.m32;
import defpackage.mc4;
import defpackage.md1;
import defpackage.mf1;
import defpackage.mjg;
import defpackage.mr1;
import defpackage.msc;
import defpackage.mxj;
import defpackage.n09;
import defpackage.n1g;
import defpackage.n42;
import defpackage.n7j;
import defpackage.nf1;
import defpackage.ns4;
import defpackage.ny8;
import defpackage.o22;
import defpackage.o7j;
import defpackage.oc9;
import defpackage.oi8;
import defpackage.ore;
import defpackage.ox1;
import defpackage.p22;
import defpackage.p3c;
import defpackage.p5;
import defpackage.p82;
import defpackage.pq3;
import defpackage.q1f;
import defpackage.q72;
import defpackage.qe;
import defpackage.qp4;
import defpackage.qq7;
import defpackage.qrc;
import defpackage.qt1;
import defpackage.qv1;
import defpackage.qyj;
import defpackage.r;
import defpackage.r07;
import defpackage.r32;
import defpackage.ra1;
import defpackage.rb0;
import defpackage.rx1;
import defpackage.rx8;
import defpackage.ry1;
import defpackage.s32;
import defpackage.sa2;
import defpackage.sgg;
import defpackage.swj;
import defpackage.sx1;
import defpackage.t3f;
import defpackage.t3g;
import defpackage.tp2;
import defpackage.tre;
import defpackage.tx1;
import defpackage.ud9;
import defpackage.uf4;
import defpackage.ufe;
import defpackage.vai;
import defpackage.ve1;
import defpackage.vo8;
import defpackage.vp4;
import defpackage.vq7;
import defpackage.vv;
import defpackage.w82;
import defpackage.wf4;
import defpackage.wo6;
import defpackage.wsc;
import defpackage.x02;
import defpackage.x7j;
import defpackage.xr4;
import defpackage.xw1;
import defpackage.y6j;
import defpackage.yab;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.yp9;
import defpackage.yr4;
import defpackage.yw1;
import defpackage.z4f;
import defpackage.z8b;
import defpackage.zb1;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zp3;
import defpackage.zpe;
import defpackage.zr4;
import defpackage.zv8;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;
import one.me.calls.ui.ui.call.panels.CallEventsWidget;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;
import one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import ru.ok.android.externcalls.sdk.AudioLevelListener;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\u000bB\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lone/me/calls/ui/ui/call/CallScreen;", "Lone/me/sdk/conductor/changehandlers/swipe/SwipeWidget;", "Lvp4;", "Lchb;", "Lz4f;", "Lmc4;", "Lzr4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "l6m", "calls-ui"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CallScreen extends SwipeWidget implements vp4, chb, z4f, mc4, zr4 {
    public final j8e A;
    public final ny8 A1;
    public final j8e B;
    public qp4 B1;
    public final ny8 C;
    public final int C1;
    public final ny8 D;
    public final ny8 E;
    public final ny8 F;
    public final ny8 G;
    public final p3c H;
    public final j8e I;
    public final j8e J;
    public final j8e K;
    public final j8e X;
    public final j8e Y;
    public final j8e Z;
    public final ny8 d;
    public ConfirmationBottomSheet e;
    public final t3f f;
    public final oi8 g;
    public final sx1 h;
    public final h i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ifh m;
    public final ifh n;
    public mxj n1;
    public final ny8 o;
    public md1 o1;
    public final ny8 p;
    public final j8e p1;
    public final ny8 q;
    public final j8e q1;
    public final vv r;
    public final ny8 r1;
    public final ifh s;
    public final ny8 s1;
    public final ny8 t;
    public final ny8 t1;
    public boolean u;
    public final ny8 u1;
    public boolean v;
    public final ny8 v1;
    public float w;
    public final ny8 w1;
    public final j8e x;
    public final ny8 x1;
    public final j8e y;
    public final q72 y1;
    public final j8e z;
    public final ks6 z1;
    public static final /* synthetic */ zv8[] E1 = {new z8b(CallScreen.class, "initialPayload", "getInitialPayload()Ljava/lang/String;"), zo5.f(zfe.a, CallScreen.class, "callTopPanelRouter", "getCallTopPanelRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new dwd(CallScreen.class, "callBottomPanelRouter", "getCallBottomPanelRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new dwd(CallScreen.class, "callEventsRouter", "getCallEventsRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new dwd(CallScreen.class, "callVpnRouter", "getCallVpnRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new dwd(CallScreen.class, "callWaitingRoomEventsRouter", "getCallWaitingRoomEventsRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new z8b(CallScreen.class, "actionHandlerJob", "getActionHandlerJob()Lkotlinx/coroutines/Job;"), new dwd(CallScreen.class, "mainView", "getMainView()Lone/me/calls/ui/view/CallScreenView;", 0), new dwd(CallScreen.class, "callScreenContainer", "getCallScreenContainer()Lone/me/calls/ui/view/CallConstraintLayoutAnimationDepended;", 0), new dwd(CallScreen.class, "bottomContainer", "getBottomContainer()Landroid/widget/FrameLayout;", 0), new dwd(CallScreen.class, "callEventsRouterFrameLayout", "getCallEventsRouterFrameLayout()Landroid/widget/FrameLayout;", 0), new dwd(CallScreen.class, "vpnContainer", "getVpnContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new dwd(CallScreen.class, "callWaitingRoomContainer", "getCallWaitingRoomContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new dwd(CallScreen.class, "dotsView", "getDotsView()Landroid/view/View;", 0), new dwd(CallScreen.class, "scrollToStart", "getScrollToStart()Landroid/view/View;", 0)};
    public static final l6m D1 = new l6m(19);

    public CallScreen(Bundle bundle) {
        super(bundle);
        this.d = rx8.P(3, new br1(17));
        this.f = new t3f("CALL_SCREEN_SCOPE_ID", super.getB().b());
        this.g = new oi8(3, 0, 3, null, 10);
        sx1 sx1Var = new sx1(m35getAccountScopeuqN4xOY());
        this.h = sx1Var;
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.i = hVar;
        this.j = sx1Var.getAccessor().d(236);
        ifh ifhVarD = sx1Var.getAccessor().d(731);
        this.k = ifhVarD;
        this.l = hVar.getAccessor().d(61);
        this.m = new ifh(new xw1(this, 1));
        this.n = new ifh(new br1(14));
        this.o = sx1Var.getAccessor().d(54);
        this.p = sx1Var.getAccessor().d(26);
        this.q = sx1Var.getAccessor().d(714);
        this.r = new vv(String.class, null, "action");
        this.s = new ifh(new yw1(0, bundle));
        this.t = createViewModelLazy(h02.class, new r(27, new xw1(this, 2)));
        this.x = childSlotRouter(R.id.call_top_control_container);
        this.y = childSlotRouter(R.id.call_bottom_control_container);
        this.z = childSlotRouter(R.id.call_events_view);
        this.A = childSlotRouter(R.id.call_screen_vpn_container_id);
        this.B = childSlotRouter(R.id.call_waiting_room_events_router);
        this.C = rx8.P(3, new br1(15));
        this.D = rx8.P(3, new br1(16));
        this.E = rx8.P(3, new xw1(this, 3));
        this.F = rx8.P(3, new xw1(this, 4));
        this.G = rx8.P(3, new xw1(this, 5));
        this.H = qyj.S();
        this.I = viewBinding(R.id.call_screen_main_content_id);
        this.J = viewBinding(R.id.call_screen_container_id);
        this.K = viewBinding(R.id.call_bottom_control_container);
        this.X = viewBinding(R.id.call_events_view);
        this.Y = viewBinding(R.id.call_screen_vpn_container_id);
        this.Z = viewBinding(R.id.call_waiting_room_events_router);
        this.p1 = viewBinding(R.id.call_users_speakers_view_tab_layout);
        this.q1 = viewBinding(R.id.call_users_speakers_scroll_start);
        this.C1 = 1;
        this.r1 = rx8.P(3, new xw1(this, 9));
        this.s1 = rx8.P(3, new xw1(this, 10));
        this.t1 = rx8.P(3, new xw1(this, 11));
        this.u1 = rx8.P(3, new xw1(this, 12));
        this.v1 = rx8.P(3, new xw1(this, 13));
        this.w1 = rx8.P(3, new xw1(this, 14));
        this.x1 = rx8.P(3, new br1(18));
        this.y1 = e9i.o(new qt1(this, null, 3));
        this.z1 = tre.G(this, new br1(19));
        this.A1 = rx8.P(3, new xw1(this, 0));
        tx1 tx1Var = (tx1) ifhVarD.getValue();
        tx1Var.getClass();
        tx1Var.g = qrc.x(tx1Var, null, null, null, null, 15);
    }

    public static final zp3 D1(CallScreen callScreen) {
        return (zp3) callScreen.A.m(callScreen, E1[4]);
    }

    public static void G1(CallScreen callScreen) {
        callScreen.F1(true, !callScreen.N1().g);
    }

    @Override // defpackage.zr4
    public final void A(yr4 yr4Var) {
        ((View) this.p1.m(this, E1[13])).setTranslationY((getContext().getResources().getConfiguration().orientation == 1 || yr4Var.c) ? 0.0f : yr4Var.a);
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final Long B1() {
        return 1000L;
    }

    @Override // defpackage.vp4
    public final void E(int i, Bundle bundle) {
        sgg sggVarI0 = yab.i0(getViewLifecycleScope(), null, 2, new ht1(this, i, bundle, (lq4) null, 2), 1);
        this.H.B(this, E1[6], sggVarI0);
    }

    public final void E1(FrameLayout frameLayout, tp2 tp2Var, tp2 tp2Var2, boolean z) {
        int iK = gm0.K((z ? 12 : 0) * yl5.d().getDisplayMetrics().density);
        tp2Var2.setPadding(iK, iK, iK, iK);
        frameLayout.setPadding(0, bc1.f(8.0f), 0, gm0.K(yl5.c() * (z ? 24 : 8)));
        ViewGroup.LayoutParams layoutParams = tp2Var.getLayoutParams();
        if (layoutParams == null) {
            ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.width = z ? -1 : -2;
        tp2Var.setLayoutParams(layoutParams);
        H1(z);
    }

    public final void F1(boolean z, boolean z2) {
        N1().e(z2);
        fs4 fs4Var = (fs4) this.F.getValue();
        fs4Var.c.removeCallbacks(fs4Var.d);
        if (z) {
            h02 h02VarR1 = R1();
            sa2 sa2Var = (sa2) h02VarR1.j.getValue();
            String strA = ns4.a(h02VarR1.J());
            boolean z3 = ((ao1) h02VarR1.u.a.getValue()).h;
            sa2Var.getClass();
            sa2.c(sa2Var, "FULL_SCREEN", strA, null, Long.valueOf(!z2 ? 1L : 0L), null, null, z3, null, 372);
        }
    }

    public final void H1(boolean z) {
        mxj mxjVar = this.n1;
        if (z) {
            if (mxjVar != null) {
                mxjVar.a(1);
            }
        } else if (mxjVar != null) {
            mxjVar.a.q(1);
        }
    }

    public final void I1(CallEventsWidget callEventsWidget) {
        callEventsWidget.b = N1();
        N1().b(callEventsWidget);
        callEventsWidget.f.add(new bx1(this));
        callEventsWidget.a = new hu(this, 5, callEventsWidget);
    }

    @Override // defpackage.zr4
    public final List J(xr4 xr4Var, xr4 xr4Var2) {
        float fAbs = (Math.abs(xr4Var2.d) - N1().k.b) * xr4Var2.c;
        c79 c79VarW = yab.w();
        if (getContext().getResources().getConfiguration().orientation == 2) {
            c79VarW.add(hsk.c(fAbs, (View) this.p1.m(this, E1[13])));
        }
        return yab.j(c79VarW);
    }

    public final void J1(CallWaitingRoomEventsWidget callWaitingRoomEventsWidget) {
        callWaitingRoomEventsWidget.a = N1();
        N1().b(callWaitingRoomEventsWidget);
        callWaitingRoomEventsWidget.i = new hu(this, 4, callWaitingRoomEventsWidget);
    }

    public final void K1(boolean z) {
        if (z) {
            h02 h02VarR1 = R1();
            ((n42) h02VarR1.H()).c().y();
            h02VarR1.F = ((x02) h02VarR1.I().i.a.getValue()).s();
        }
        View viewRequireView = requireView();
        if (viewRequireView.getMeasuredWidth() == 0 || viewRequireView.getMeasuredHeight() == 0) {
            requireView().post(new c3(21, this));
        } else {
            getRouter().C(this);
        }
    }

    public final zp3 L1() {
        return (zp3) this.z.m(this, E1[3]);
    }

    @Override // defpackage.zr4
    public final void M() {
        yr4 yr4Var = N1().k;
        ((View) this.p1.m(this, E1[13])).setTranslationY((getContext().getResources().getConfiguration().orientation == 1 || yr4Var.c) ? 0.0f : yr4Var.a);
    }

    public final zp3 M1() {
        return (zp3) this.B.m(this, E1[5]);
    }

    public final es4 N1() {
        return (es4) this.E.getValue();
    }

    public final bz1 O1() {
        return (bz1) this.I.m(this, E1[7]);
    }

    public final c1d P1() {
        return (c1d) this.C.getValue();
    }

    public final View Q1() {
        return (View) this.q1.m(this, E1[14]);
    }

    public final h02 R1() {
        return (h02) this.t.getValue();
    }

    public final void S1() {
        Object systemService = requireActivity().getSystemService("media_projection");
        MediaProjectionManager mediaProjectionManager = systemService instanceof MediaProjectionManager ? (MediaProjectionManager) systemService : null;
        if (mediaProjectionManager == null) {
            a8j.x(R1().G, ry1.q);
        } else {
            startActivityForResult(mediaProjectionManager.createScreenCaptureIntent(), 1);
        }
    }

    public final void T1(d62 d62Var) {
        boolean z;
        View viewQ1 = Q1();
        ViewStub viewStub = viewQ1 instanceof ViewStub ? (ViewStub) viewQ1 : null;
        vai vaiVar = d62Var.d;
        List list = d62Var.c;
        int i = 8;
        if (vaiVar != null) {
            ((qq7) this.G.getValue()).a();
            if (viewStub == null || n7j.n(viewStub)) {
                Q1().setVisibility(8);
                return;
            }
            return;
        }
        View viewQ2 = Q1();
        if (d62Var.a == x7j.c) {
            boolean z2 = true;
            if (list.isEmpty()) {
                z = false;
            } else {
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((lr1) it.next()).a != x7j.b) {
                                z = false;
                            }
                        }
                    }
                }
                z = true;
            }
            if (viewStub != null && !n7j.n(viewStub)) {
                z2 = false;
            }
            if (!z && z2 && Q1().getAlpha() == 1.0f) {
                i = 0;
            }
        }
        viewQ2.setVisibility(i);
    }

    public final void U1(boolean z) {
        View view = getView();
        if (view == null) {
            return;
        }
        if (!z) {
            view.setClipToOutline(false);
            view.setOutlineProvider(null);
        } else {
            Rect rect = new Rect(0, 0, view.getWidth(), view.getHeight());
            float f = yl5.d().getDisplayMetrics().density * 32.0f;
            view.setClipToOutline(true);
            view.setOutlineProvider(new l7j(rect, f));
        }
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        if (i != 1) {
            if (i != 2) {
                return;
            }
            S1();
        } else {
            ConfirmationBottomSheet confirmationBottomSheet = this.e;
            if (confirmationBottomSheet != null) {
                zpe zpeVar = BaseBottomSheetWidget.i;
                confirmationBottomSheet.v1(true);
            }
            this.e = null;
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getA() {
        return this.g;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScopeId, reason: from getter */
    public final t3f getB() {
        return this.f;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getU() {
        return this.z1;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onActivityPaused(Activity activity) {
        super.onActivityPaused(activity);
        mjg mjgVar = R1().t;
        Boolean bool = Boolean.FALSE;
        mjgVar.getClass();
        mjgVar.j(null, bool);
    }

    @Override // defpackage.br4
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            R1().Q(true, intent);
            ((m02) this.l.getValue()).e(requireActivity(), (k42) this.i.getAccessor().d(66).getValue());
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
        mjg mjgVar = R1().t;
        Boolean bool = Boolean.TRUE;
        mjgVar.getClass();
        mjgVar.j(null, bool);
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        z1();
        zv8[] zv8VarArr = E1;
        zv8 zv8Var = zv8VarArr[0];
        vv vvVar = this.r;
        String str = (String) vvVar.a(this);
        zv8 zv8Var2 = zv8VarArr[0];
        vvVar.b(this, null);
        if (str != null) {
            view.post(new qe(this, 23, str));
        }
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget, defpackage.br4
    public final void onChangeEnded(gr4 gr4Var, hr4 hr4Var) {
        super.onChangeEnded(gr4Var, hr4Var);
        boolean z = false;
        this.u = false;
        if (hr4Var.b) {
            h02 h02VarR1 = R1();
            es4 es4VarN1 = N1();
            if (es4VarN1.g && es4VarN1.b == null) {
                z = true;
            }
            h02VarR1.M(z);
        }
        if (hr4Var == hr4.f) {
            ((t3g) this.x1.getValue()).getClass();
            t3g.a();
        }
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget, one.me.sdk.arch.Widget, defpackage.br4
    public final void onChangeStarted(gr4 gr4Var, hr4 hr4Var) {
        super.onChangeStarted(gr4Var, hr4Var);
        this.u = true;
        R1().M(false);
        if (hr4Var == hr4.f) {
            H1(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:101:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:103:0x02af  */
    /* JADX WARN: Code duplicated, block: B:104:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:107:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:108:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:110:0x02df A[LOOP:3: B:96:0x027c->B:110:0x02df, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:113:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:120:0x0309  */
    /* JADX WARN: Code duplicated, block: B:125:0x034c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0353  */
    /* JADX WARN: Code duplicated, block: B:131:0x0361  */
    /* JADX WARN: Code duplicated, block: B:133:0x0374  */
    /* JADX WARN: Code duplicated, block: B:137:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:140:0x0415  */
    /* JADX WARN: Code duplicated, block: B:141:0x0418  */
    /* JADX WARN: Code duplicated, block: B:164:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:167:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:170:0x0519  */
    /* JADX WARN: Code duplicated, block: B:173:0x0527  */
    /* JADX WARN: Code duplicated, block: B:176:0x059b  */
    /* JADX WARN: Code duplicated, block: B:179:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:182:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:185:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:188:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:190:0x0704  */
    /* JADX WARN: Code duplicated, block: B:192:0x041c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x01c1 A[EDGE_INSN: B:197:0x01c1->B:66:0x01c1 BREAK  A[LOOP:1: B:60:0x0199->B:74:0x01ec], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x0237 A[EDGE_INSN: B:198:0x0237->B:84:0x0237 BREAK  A[LOOP:2: B:82:0x0212->B:92:0x0262], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x02a1 A[EDGE_INSN: B:199:0x02a1->B:98:0x02a1 BREAK  A[LOOP:3: B:96:0x027c->B:110:0x02df], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x017e  */
    /* JADX WARN: Code duplicated, block: B:57:0x018b  */
    /* JADX WARN: Code duplicated, block: B:58:0x018e  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ec A[LOOP:1: B:60:0x0199->B:74:0x01ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:79:0x0206  */
    /* JADX WARN: Code duplicated, block: B:80:0x0209  */
    /* JADX WARN: Code duplicated, block: B:86:0x023d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0240  */
    /* JADX WARN: Code duplicated, block: B:89:0x0244  */
    /* JADX WARN: Code duplicated, block: B:90:0x0247  */
    /* JADX WARN: Code duplicated, block: B:92:0x0262 A[LOOP:2: B:82:0x0212->B:92:0x0262, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x0264  */
    /* JADX WARN: Code duplicated, block: B:95:0x026c  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object next;
        boolean z;
        yp9 yp9Var;
        yp9 yp9Var2;
        yp9 yp9VarA;
        yp9 yp9Var3;
        yp9 yp9Var4;
        yp9 yp9Var5;
        Throwable th;
        f62 f62Var;
        jhd jhdVar;
        Object value;
        String str;
        boolean z2;
        c32 c32Var;
        Object value2;
        yp9 yp9Var6;
        yp9 yp9Var7;
        k42 k42VarH;
        boolean z3;
        boolean z4;
        boolean z5;
        cz1 cz1Var;
        boolean z6;
        Object value3;
        yp9 yp9Var8;
        yp9 yp9Var9;
        boolean z7;
        boolean z8;
        boolean z9;
        Object value4;
        ao1 ao1Var;
        boolean z10;
        yp9 yp9Var10;
        yp9 yp9Var11;
        boolean z11;
        boolean z12;
        nf1 lf1Var;
        tx1 tx1Var;
        String strH;
        String str2;
        Activity activity;
        View childAt;
        RecyclerView recyclerView;
        tp2 tp2Var;
        tp2 tp2Var2;
        vq7 vq7Var;
        tx1 tx1Var2;
        String str3;
        String str4;
        a4c a4cVar;
        String str5;
        a4c a4cVar2;
        je9 je9Var = je9.f;
        nf1 nf1Var = jf1.a;
        int i = 3;
        if (R1().K().f instanceof ki6) {
            String string = getArgs().getString("type");
            Iterator it = cx1.b.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!cqk.d(((cx1) next).name(), string));
            cx1 cx1Var = (cx1) next;
            int i2 = cx1Var == null ? -1 : dx1.$EnumSwitchMapping$0[cx1Var.ordinal()];
            if (i2 != -1) {
                if (i2 != 1) {
                    z = true;
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                ore.o();
                                return null;
                            }
                            long j = getArgs().getLong("opponent_id", -1L);
                            String string2 = getArgs().getString("conversation_id");
                            if (string2 != null) {
                                ifh ifhVar = ns4.b;
                            } else {
                                string2 = null;
                            }
                            ns4 ns4Var = string2 != null ? new ns4(string2) : null;
                            if (ns4Var == null) {
                                ore.p("Required value was null.");
                                return null;
                            }
                            lf1Var = new mf1(j, ns4Var.a, getArgs().getBoolean("video_enabled"), getArgs().getBoolean("microphone_enabled"), (c32) this.s.getValue());
                        }
                        tx1Var = (tx1) this.k.getValue();
                        strH = zfe.a(nf1Var.getClass()).h();
                        str2 = tx1Var.g;
                        if (str2 == null) {
                            str5 = tx1Var.b;
                            a4cVar2 = gm0.f;
                            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                                a4cVar2.c(je9Var, str5, "Invoked 'callScreenViewCreationStarted', but traceId is null or empty!", th);
                            }
                        } else {
                            qrc.k(tx1Var, "call_screen_on_create_view_started", 0, str2, false, null, null, 120);
                            if (strH == null) {
                                strH = "Unknown";
                            }
                            tx1Var.i(str2, new ylc("call_type", strH));
                        }
                        ((m02) this.l.getValue()).a(requireActivity(), (k42) this.i.getAccessor().d(66).getValue());
                        activity = getActivity();
                        if (activity != null) {
                            mxj mxjVar = new mxj(activity.getWindow(), activity.getWindow().getDecorView());
                            mxjVar.a.b0();
                            this.n1 = mxjVar;
                        }
                        ix1 ix1Var = new ix1(this, getContext());
                        ix1Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        ix1Var.setBackgroundColor(pq3.j.l(ix1Var).b.b().c);
                        Context context = layoutInflater.getContext();
                        wf4 ve1Var = new ve1(context);
                        ve1Var.setId(R.id.call_screen_container_id);
                        bz1 bz1Var = new bz1(context, this.f.b());
                        bz1Var.setupCallModesAdapter((mr1) this.v1.getValue());
                        je9 je9Var2 = je9.g;
                        childAt = bz1Var.E.getChildAt(0);
                        if (childAt instanceof RecyclerView) {
                            recyclerView = (RecyclerView) childAt;
                        } else {
                            recyclerView = null;
                        }
                        if (recyclerView != null) {
                            try {
                                Field declaredField = RecyclerView.class.getDeclaredField("w1");
                                declaredField.setAccessible(z);
                                declaredField.set(recyclerView, Integer.valueOf(((Integer) declaredField.get(recyclerView)).intValue() * 3));
                            } catch (IllegalAccessException e) {
                                String name = bz1.class.getName();
                                a4c a4cVar3 = gm0.f;
                                if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                                    a4cVar3.c(je9Var2, name, gm0.N(e), null);
                                }
                            } catch (NoSuchFieldException e2) {
                                String name2 = bz1.class.getName();
                                a4c a4cVar4 = gm0.f;
                                if (a4cVar4 != null && a4cVar4.b(je9Var2)) {
                                    a4cVar4.c(je9Var2, name2, gm0.N(e2), null);
                                }
                            }
                        }
                        bz1Var.setupListener((fx1) this.A1.getValue());
                        bz1Var.setPipBoundariesController(P1());
                        bz1Var.setupControlsMediator(N1());
                        qq7 qq7Var = (qq7) this.G.getValue();
                        qq7Var.d = bz1Var.E;
                        bz1Var.x = qq7Var;
                        tp2Var = new tp2(context);
                        tp2Var.setId(R.id.call_top_control_container);
                        lvb.H(tp2Var, new oi8(0, 5, 0, null, 13), null);
                        P1().a(tp2Var, b1d.a);
                        WeakHashMap weakHashMap = i7j.a;
                        if (tp2Var.isLaidOut() || tp2Var.isLayoutRequested()) {
                            tp2Var.addOnLayoutChangeListener(new ex1(this, 1));
                        } else {
                            P1().c();
                        }
                        tp2Var2 = new tp2(context);
                        tp2Var2.setId(R.id.call_bottom_control_container);
                        tp2Var2.setLayoutParams(new uf4(-2, -2));
                        lvb.H(tp2Var2, new oi8(0, 0, 0, new j11(5, 1, false), 7), null);
                        c1d c1dVarP1 = P1();
                        b1d b1dVar = b1d.b;
                        c1dVarP1.a(tp2Var2, b1dVar);
                        if (tp2Var2.isLaidOut() || tp2Var2.isLayoutRequested()) {
                            tp2Var2.addOnLayoutChangeListener(new ex1(this, 0));
                        } else {
                            P1().c();
                        }
                        ViewGroup tp2Var3 = new tp2(context);
                        tp2Var3.setId(R.id.call_events_view);
                        tp2Var3.setLayoutParams(new uf4(-1, -2));
                        P1().a(tp2Var3, b1dVar);
                        tp2 tp2Var4 = new tp2(context);
                        tp2Var4.setId(R.id.call_waiting_room_events_router);
                        tp2Var4.setLayoutParams(new uf4(-1, -2));
                        tp2 tp2Var5 = new tp2(context);
                        tp2Var5.setId(R.id.call_screen_vpn_container_id);
                        tp2Var5.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        vq7Var = new vq7(context);
                        vq7Var.setId(R.id.call_users_speakers_view_tab_layout);
                        vq7Var.setBackgroundColor(0);
                        vq7Var.setVisibility(0);
                        ((qq7) this.G.getValue()).j = vq7Var;
                        if (!((f5d) ((wo6) this.o.getValue())).a()) {
                            vq7Var.setZeroPageIcon(null);
                        }
                        ViewStub viewStub = new ViewStub(context);
                        viewStub.setId(R.id.call_users_speakers_scroll_start);
                        ve1Var.addView(bz1Var);
                        ve1Var.addView(tp2Var2);
                        ve1Var.addView(tp2Var, 0, -2);
                        ve1Var.addView(tp2Var3);
                        ve1Var.addView(tp2Var4);
                        ve1Var.addView(tp2Var5);
                        ve1Var.addView(vq7Var, gm0.K(80.0f * yl5.d().getDisplayMetrics().density), gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
                        ve1Var.addView(viewStub, -2, -2);
                        es4 es4VarN1 = N1();
                        tp2Var.addOnLayoutChangeListener((View.OnLayoutChangeListener) es4VarN1.e.getValue());
                        es4VarN1.c = tp2Var;
                        tp2Var2.addOnLayoutChangeListener((View.OnLayoutChangeListener) es4VarN1.f.getValue());
                        es4VarN1.d = tp2Var2;
                        N1().b(this);
                        fs4 fs4Var = (fs4) this.F.getValue();
                        fs4Var.e = bz1Var;
                        lvb.j0(bz1Var, new dk2(1, fs4Var));
                        eg4 eg4VarH = ch3.h(ve1Var);
                        int id = tp2Var.getId();
                        int i3 = i;
                        eg4VarH.d(id, i3, 0, i3);
                        eg4VarH.d(id, 6, 0, 6);
                        eg4VarH.d(id, 7, 0, 7);
                        int id2 = tp2Var2.getId();
                        eg4VarH.d(id2, 4, 0, 4);
                        eg4VarH.d(id2, 6, 0, 6);
                        eg4VarH.d(id2, 7, 0, 7);
                        int id3 = tp2Var3.getId();
                        eg4VarH.d(id3, 4, tp2Var2.getId(), 3);
                        eg4VarH.d(id3, 6, 0, 6);
                        eg4VarH.d(id3, 7, 0, 7);
                        int id4 = tp2Var4.getId();
                        eg4VarH.d(id4, 3, tp2Var.getId(), 4);
                        eg4VarH.d(id4, 6, 0, 6);
                        eg4VarH.d(id4, 7, 0, 7);
                        int id5 = tp2Var5.getId();
                        eg4VarH.d(id5, 4, tp2Var2.getId(), 3);
                        eg4VarH.d(id5, 6, 0, 6);
                        eg4VarH.d(id5, 7, 0, 7);
                        int id6 = vq7Var.getId();
                        eg4VarH.d(id6, 4, tp2Var2.getId(), 3);
                        eg4VarH.d(id6, 6, 0, 6);
                        eg4VarH.d(id6, 7, 0, 7);
                        int id7 = viewStub.getId();
                        eg4VarH.d(id7, 6, 0, 6);
                        new bsb(6, eg4VarH, id7).a(gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
                        eg4VarH.d(id7, 4, vq7Var.getId(), 4);
                        eg4VarH.d(id7, 3, vq7Var.getId(), 3);
                        eg4VarH.a(ve1Var);
                        E1(tp2Var2, tp2Var5, tp2Var4, getContext().getResources().getConfiguration().orientation == 1);
                        ix1Var.addView(ve1Var);
                        tx1Var2 = (tx1) this.k.getValue();
                        str3 = tx1Var2.g;
                        if (str3 == null) {
                            str4 = tx1Var2.b;
                            a4cVar = gm0.f;
                            if (a4cVar != null && a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str4, "Invoked 'callScreenViewCreationFinished', but traceId is null or empty!", null);
                            }
                        } else {
                            qrc.k(tx1Var2, "call_screen_on_create_view_finished", 1, str3, false, null, null, 120);
                        }
                        return ix1Var;
                    }
                    lf1Var = new kf1(getArgs().getLong("chat_id", -1L), getArgs().getBoolean("video_enabled"), getArgs().getBoolean("microphone_enabled"), (c32) this.s.getValue());
                } else {
                    z = true;
                    String string3 = getArgs().getString("link");
                    if (string3 == null) {
                        ore.p("Required value was null.");
                        return null;
                    }
                    lf1Var = new lf1(string3, getArgs().getBoolean("is_new"), getArgs().getBoolean("is_video_call"), getArgs().getBoolean("front_camera_enabled"), getArgs().getBoolean("video_enabled"), getArgs().getBoolean("microphone_enabled"), (c32) this.s.getValue());
                }
                nf1Var = lf1Var;
            } else {
                z = true;
            }
            getArgs().putString("type", "ACTIVE");
            h02 h02VarR1 = R1();
            x7j x7jVar = x7j.c;
            msc mscVar = h02VarR1.d;
            w82 w82Var = h02VarR1.e;
            mjg mjgVar = h02VarR1.s;
            yp9 yp9Var12 = yp9.b;
            boolean zD = nf1Var.d();
            if (mscVar.b().c(wsc.i)) {
                if (zD) {
                    yp9Var2 = yp9Var12;
                } else {
                    yp9Var = yp9.a;
                }
                yp9VarA = mscVar.a(nf1Var.c());
                if (nf1Var instanceof mf1) {
                    mf1 mf1Var = (mf1) nf1Var;
                    long j2 = mf1Var.a;
                    String str6 = mf1Var.b;
                    if (yp9VarA == yp9Var12) {
                        z9 = z;
                    } else {
                        z9 = false;
                    }
                    m32 m32Var = new m32(j2, str6, z9);
                    c32 c32Var2 = mf1Var.e;
                    w82Var.a(x7j.a);
                    while (true) {
                        value4 = mjgVar.getValue();
                        ao1Var = (ao1) value4;
                        if (yp9VarA == yp9Var12) {
                            z10 = z;
                        } else {
                            z10 = false;
                        }
                        yp9Var10 = yp9VarA;
                        yp9Var11 = yp9Var2;
                        if (mjgVar.h(value4, ao1.a(ao1Var, null, null, null, false, yp9Var10, yp9Var2, z10, 13893503))) {
                            break;
                        }
                        yp9Var2 = yp9Var11;
                        yp9VarA = yp9Var10;
                    }
                    k42 k42VarH2 = h02VarR1.H();
                    if (yp9Var10 == yp9Var12) {
                        z11 = z;
                    } else {
                        z11 = false;
                    }
                    if (yp9Var11 == yp9Var12) {
                        z12 = z;
                    } else {
                        z12 = false;
                    }
                    ((n42) k42VarH2).d(new hhg(new ehg(m32Var), z11, z12, null, c32Var2));
                } else {
                    i = 3;
                    yp9Var3 = yp9VarA;
                    yp9Var4 = yp9Var2;
                    if (nf1Var instanceof kf1) {
                        kf1 kf1Var = (kf1) nf1Var;
                        long j3 = kf1Var.a;
                        th = null;
                        if (yp9Var3 == yp9Var12) {
                            z6 = z;
                        } else {
                            z6 = false;
                        }
                        k32 k32Var = new k32(j3, z6);
                        c32 c32Var3 = kf1Var.d;
                        w82Var.a(x7jVar);
                        while (true) {
                            value3 = mjgVar.getValue();
                            yp9Var8 = yp9Var3;
                            yp9Var9 = yp9Var4;
                            yp9Var3 = yp9Var8;
                            if (mjgVar.h(value3, ao1.a((ao1) value3, null, null, null, true, yp9Var8, yp9Var9, false, 15990655))) {
                                break;
                            }
                            yp9Var4 = yp9Var9;
                        }
                        k42 k42VarH3 = h02VarR1.H();
                        if (yp9Var3 == yp9Var12) {
                            z7 = z;
                        } else {
                            z7 = false;
                        }
                        if (yp9Var9 == yp9Var12) {
                            z8 = z;
                        } else {
                            z8 = false;
                        }
                        ((n42) k42VarH3).d(new hhg(new chg(k32Var), z7, z8, null, c32Var3));
                    } else {
                        yp9Var5 = yp9Var4;
                        th = null;
                        if (nf1Var instanceof lf1) {
                            lf1 lf1Var2 = (lf1) nf1Var;
                            str = lf1Var2.a;
                            boolean z13 = lf1Var2.b;
                            z2 = lf1Var2.c;
                            boolean z14 = lf1Var2.d;
                            c32Var = lf1Var2.g;
                            w82Var.a(x7jVar);
                            while (true) {
                                value2 = mjgVar.getValue();
                                yp9Var6 = yp9Var3;
                                yp9Var7 = yp9Var5;
                                if (mjgVar.h(value2, ao1.a((ao1) value2, null, null, null, true, yp9Var6, yp9Var7, false, 15990655))) {
                                    break;
                                }
                                yp9Var5 = yp9Var7;
                                yp9Var3 = yp9Var6;
                            }
                            k42VarH = h02VarR1.H();
                            z3 = !z13;
                            if (yp9Var6 == yp9Var12) {
                                z4 = z;
                            } else {
                                z4 = false;
                            }
                            if (yp9Var7 == yp9Var12) {
                                z5 = z;
                            } else {
                                z5 = false;
                            }
                            cz1Var = new cz1(h02VarR1, z14, 0);
                            if (str.length() != 0) {
                                ore.p("unknown target to call");
                                return null;
                            }
                            ((n42) k42VarH).d(new hhg(new dhg(str, z2, z3, z4), z4, z5, cz1Var, c32Var));
                        } else {
                            if (nf1Var instanceof jf1) {
                                ore.o();
                                return null;
                            }
                            f62Var = (f62) ((n42) h02VarR1.H()).f.a.getValue();
                            if (!h02VarR1.I().g() && f62Var.o == null) {
                                jhdVar = f62Var.p;
                                if (jhdVar == null) {
                                    jhdVar = jhd.e;
                                }
                                do {
                                    value = mjgVar.getValue();
                                } while (!mjgVar.h(value, ao1.a((ao1) value, jhdVar.b, jhdVar.c, h02VarR1.h.a(jhdVar.d), false, null, null, false, 16777111)));
                            }
                        }
                    }
                }
                tx1Var = (tx1) this.k.getValue();
                strH = zfe.a(nf1Var.getClass()).h();
                str2 = tx1Var.g;
                if (str2 == null) {
                    str5 = tx1Var.b;
                    a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        a4cVar2.c(je9Var, str5, "Invoked 'callScreenViewCreationStarted', but traceId is null or empty!", th);
                    }
                } else {
                    qrc.k(tx1Var, "call_screen_on_create_view_started", 0, str2, false, null, null, 120);
                    if (strH == null) {
                        strH = "Unknown";
                    }
                    tx1Var.i(str2, new ylc("call_type", strH));
                }
                ((m02) this.l.getValue()).a(requireActivity(), (k42) this.i.getAccessor().d(66).getValue());
                activity = getActivity();
                if (activity != null) {
                    mxj mxjVar2 = new mxj(activity.getWindow(), activity.getWindow().getDecorView());
                    mxjVar2.a.b0();
                    this.n1 = mxjVar2;
                }
                ix1 ix1Var2 = new ix1(this, getContext());
                ix1Var2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                ix1Var2.setBackgroundColor(pq3.j.l(ix1Var2).b.b().c);
                Context context2 = layoutInflater.getContext();
                wf4 ve1Var2 = new ve1(context2);
                ve1Var2.setId(R.id.call_screen_container_id);
                bz1 bz1Var2 = new bz1(context2, this.f.b());
                bz1Var2.setupCallModesAdapter((mr1) this.v1.getValue());
                je9 je9Var3 = je9.g;
                childAt = bz1Var2.E.getChildAt(0);
                if (childAt instanceof RecyclerView) {
                    recyclerView = (RecyclerView) childAt;
                } else {
                    recyclerView = null;
                }
                if (recyclerView != null) {
                    Field declaredField2 = RecyclerView.class.getDeclaredField("w1");
                    declaredField2.setAccessible(z);
                    declaredField2.set(recyclerView, Integer.valueOf(((Integer) declaredField2.get(recyclerView)).intValue() * 3));
                }
                bz1Var2.setupListener((fx1) this.A1.getValue());
                bz1Var2.setPipBoundariesController(P1());
                bz1Var2.setupControlsMediator(N1());
                qq7 qq7Var2 = (qq7) this.G.getValue();
                qq7Var2.d = bz1Var2.E;
                bz1Var2.x = qq7Var2;
                tp2Var = new tp2(context2);
                tp2Var.setId(R.id.call_top_control_container);
                lvb.H(tp2Var, new oi8(0, 5, 0, null, 13), null);
                P1().a(tp2Var, b1d.a);
                WeakHashMap weakHashMap2 = i7j.a;
                if (tp2Var.isLaidOut()) {
                    tp2Var.addOnLayoutChangeListener(new ex1(this, 1));
                } else {
                    tp2Var.addOnLayoutChangeListener(new ex1(this, 1));
                }
                tp2Var2 = new tp2(context2);
                tp2Var2.setId(R.id.call_bottom_control_container);
                tp2Var2.setLayoutParams(new uf4(-2, -2));
                lvb.H(tp2Var2, new oi8(0, 0, 0, new j11(5, 1, false), 7), null);
                c1d c1dVarP2 = P1();
                b1d b1dVar2 = b1d.b;
                c1dVarP2.a(tp2Var2, b1dVar2);
                if (tp2Var2.isLaidOut()) {
                    tp2Var2.addOnLayoutChangeListener(new ex1(this, 0));
                } else {
                    tp2Var2.addOnLayoutChangeListener(new ex1(this, 0));
                }
                ViewGroup tp2Var6 = new tp2(context2);
                tp2Var6.setId(R.id.call_events_view);
                tp2Var6.setLayoutParams(new uf4(-1, -2));
                P1().a(tp2Var6, b1dVar2);
                tp2 tp2Var7 = new tp2(context2);
                tp2Var7.setId(R.id.call_waiting_room_events_router);
                tp2Var7.setLayoutParams(new uf4(-1, -2));
                tp2 tp2Var8 = new tp2(context2);
                tp2Var8.setId(R.id.call_screen_vpn_container_id);
                tp2Var8.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                vq7Var = new vq7(context2);
                vq7Var.setId(R.id.call_users_speakers_view_tab_layout);
                vq7Var.setBackgroundColor(0);
                vq7Var.setVisibility(0);
                ((qq7) this.G.getValue()).j = vq7Var;
                if (!((f5d) ((wo6) this.o.getValue())).a()) {
                    vq7Var.setZeroPageIcon(null);
                }
                ViewStub viewStub2 = new ViewStub(context2);
                viewStub2.setId(R.id.call_users_speakers_scroll_start);
                ve1Var2.addView(bz1Var2);
                ve1Var2.addView(tp2Var2);
                ve1Var2.addView(tp2Var, 0, -2);
                ve1Var2.addView(tp2Var6);
                ve1Var2.addView(tp2Var7);
                ve1Var2.addView(tp2Var8);
                ve1Var2.addView(vq7Var, gm0.K(80.0f * yl5.d().getDisplayMetrics().density), gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
                ve1Var2.addView(viewStub2, -2, -2);
                es4 es4VarN2 = N1();
                tp2Var.addOnLayoutChangeListener((View.OnLayoutChangeListener) es4VarN2.e.getValue());
                es4VarN2.c = tp2Var;
                tp2Var2.addOnLayoutChangeListener((View.OnLayoutChangeListener) es4VarN2.f.getValue());
                es4VarN2.d = tp2Var2;
                N1().b(this);
                fs4 fs4Var2 = (fs4) this.F.getValue();
                fs4Var2.e = bz1Var2;
                lvb.j0(bz1Var2, new dk2(1, fs4Var2));
                eg4 eg4VarH2 = ch3.h(ve1Var2);
                int id8 = tp2Var.getId();
                int i4 = i;
                eg4VarH2.d(id8, i4, 0, i4);
                eg4VarH2.d(id8, 6, 0, 6);
                eg4VarH2.d(id8, 7, 0, 7);
                int id9 = tp2Var2.getId();
                eg4VarH2.d(id9, 4, 0, 4);
                eg4VarH2.d(id9, 6, 0, 6);
                eg4VarH2.d(id9, 7, 0, 7);
                int id10 = tp2Var6.getId();
                eg4VarH2.d(id10, 4, tp2Var2.getId(), 3);
                eg4VarH2.d(id10, 6, 0, 6);
                eg4VarH2.d(id10, 7, 0, 7);
                int id11 = tp2Var7.getId();
                eg4VarH2.d(id11, 3, tp2Var.getId(), 4);
                eg4VarH2.d(id11, 6, 0, 6);
                eg4VarH2.d(id11, 7, 0, 7);
                int id12 = tp2Var8.getId();
                eg4VarH2.d(id12, 4, tp2Var2.getId(), 3);
                eg4VarH2.d(id12, 6, 0, 6);
                eg4VarH2.d(id12, 7, 0, 7);
                int id13 = vq7Var.getId();
                eg4VarH2.d(id13, 4, tp2Var2.getId(), 3);
                eg4VarH2.d(id13, 6, 0, 6);
                eg4VarH2.d(id13, 7, 0, 7);
                int id14 = viewStub2.getId();
                eg4VarH2.d(id14, 6, 0, 6);
                new bsb(6, eg4VarH2, id14).a(gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
                eg4VarH2.d(id14, 4, vq7Var.getId(), 4);
                eg4VarH2.d(id14, 3, vq7Var.getId(), 3);
                eg4VarH2.a(ve1Var2);
                E1(tp2Var2, tp2Var8, tp2Var7, getContext().getResources().getConfiguration().orientation == 1);
                ix1Var2.addView(ve1Var2);
                tx1Var2 = (tx1) this.k.getValue();
                str3 = tx1Var2.g;
                if (str3 == null) {
                    str4 = tx1Var2.b;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        a4cVar.c(je9Var, str4, "Invoked 'callScreenViewCreationFinished', but traceId is null or empty!", null);
                    }
                } else {
                    qrc.k(tx1Var2, "call_screen_on_create_view_finished", 1, str3, false, null, null, 120);
                }
                return ix1Var2;
            }
            yp9Var = yp9.e;
            yp9Var2 = yp9Var;
            yp9VarA = mscVar.a(nf1Var.c());
            if (nf1Var instanceof mf1) {
                mf1 mf1Var2 = (mf1) nf1Var;
                long j4 = mf1Var2.a;
                String str7 = mf1Var2.b;
                if (yp9VarA == yp9Var12) {
                    z9 = z;
                } else {
                    z9 = false;
                }
                m32 m32Var2 = new m32(j4, str7, z9);
                c32 c32Var4 = mf1Var2.e;
                w82Var.a(x7j.a);
                while (true) {
                    value4 = mjgVar.getValue();
                    ao1Var = (ao1) value4;
                    if (yp9VarA == yp9Var12) {
                        z10 = z;
                    } else {
                        z10 = false;
                    }
                    yp9Var10 = yp9VarA;
                    yp9Var11 = yp9Var2;
                    if (mjgVar.h(value4, ao1.a(ao1Var, null, null, null, false, yp9Var10, yp9Var2, z10, 13893503))) {
                        break;
                        break;
                    }
                    yp9Var2 = yp9Var11;
                    yp9VarA = yp9Var10;
                }
                k42 k42VarH4 = h02VarR1.H();
                if (yp9Var10 == yp9Var12) {
                    z11 = z;
                } else {
                    z11 = false;
                }
                if (yp9Var11 == yp9Var12) {
                    z12 = z;
                } else {
                    z12 = false;
                }
                ((n42) k42VarH4).d(new hhg(new ehg(m32Var2), z11, z12, null, c32Var4));
            } else {
                i = 3;
                yp9Var3 = yp9VarA;
                yp9Var4 = yp9Var2;
                if (nf1Var instanceof kf1) {
                    kf1 kf1Var2 = (kf1) nf1Var;
                    long j5 = kf1Var2.a;
                    th = null;
                    if (yp9Var3 == yp9Var12) {
                        z6 = z;
                    } else {
                        z6 = false;
                    }
                    k32 k32Var2 = new k32(j5, z6);
                    c32 c32Var5 = kf1Var2.d;
                    w82Var.a(x7jVar);
                    while (true) {
                        value3 = mjgVar.getValue();
                        yp9Var8 = yp9Var3;
                        yp9Var9 = yp9Var4;
                        yp9Var3 = yp9Var8;
                        if (mjgVar.h(value3, ao1.a((ao1) value3, null, null, null, true, yp9Var8, yp9Var9, false, 15990655))) {
                            break;
                            break;
                        }
                        yp9Var4 = yp9Var9;
                    }
                    k42 k42VarH5 = h02VarR1.H();
                    if (yp9Var3 == yp9Var12) {
                        z7 = z;
                    } else {
                        z7 = false;
                    }
                    if (yp9Var9 == yp9Var12) {
                        z8 = z;
                    } else {
                        z8 = false;
                    }
                    ((n42) k42VarH5).d(new hhg(new chg(k32Var2), z7, z8, null, c32Var5));
                } else {
                    yp9Var5 = yp9Var4;
                    th = null;
                    if (nf1Var instanceof lf1) {
                        lf1 lf1Var3 = (lf1) nf1Var;
                        str = lf1Var3.a;
                        boolean z15 = lf1Var3.b;
                        z2 = lf1Var3.c;
                        boolean z16 = lf1Var3.d;
                        c32Var = lf1Var3.g;
                        w82Var.a(x7jVar);
                        while (true) {
                            value2 = mjgVar.getValue();
                            yp9Var6 = yp9Var3;
                            yp9Var7 = yp9Var5;
                            if (mjgVar.h(value2, ao1.a((ao1) value2, null, null, null, true, yp9Var6, yp9Var7, false, 15990655))) {
                                break;
                                break;
                            }
                            yp9Var5 = yp9Var7;
                            yp9Var3 = yp9Var6;
                        }
                        k42VarH = h02VarR1.H();
                        z3 = !z15;
                        if (yp9Var6 == yp9Var12) {
                            z4 = z;
                        } else {
                            z4 = false;
                        }
                        if (yp9Var7 == yp9Var12) {
                            z5 = z;
                        } else {
                            z5 = false;
                        }
                        cz1Var = new cz1(h02VarR1, z16, 0);
                        if (str.length() != 0) {
                            ore.p("unknown target to call");
                            return null;
                        }
                        ((n42) k42VarH).d(new hhg(new dhg(str, z2, z3, z4), z4, z5, cz1Var, c32Var));
                    } else {
                        if (nf1Var instanceof jf1) {
                            ore.o();
                            return null;
                        }
                        f62Var = (f62) ((n42) h02VarR1.H()).f.a.getValue();
                        if (!h02VarR1.I().g()) {
                            jhdVar = f62Var.p;
                            if (jhdVar == null) {
                                jhdVar = jhd.e;
                            }
                            do {
                                value = mjgVar.getValue();
                            } while (!mjgVar.h(value, ao1.a((ao1) value, jhdVar.b, jhdVar.c, h02VarR1.h.a(jhdVar.d), false, null, null, false, 16777111)));
                        }
                    }
                }
            }
            tx1Var = (tx1) this.k.getValue();
            strH = zfe.a(nf1Var.getClass()).h();
            str2 = tx1Var.g;
            if (str2 == null) {
                str5 = tx1Var.b;
                a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    a4cVar2.c(je9Var, str5, "Invoked 'callScreenViewCreationStarted', but traceId is null or empty!", th);
                }
            } else {
                qrc.k(tx1Var, "call_screen_on_create_view_started", 0, str2, false, null, null, 120);
                if (strH == null) {
                    strH = "Unknown";
                }
                tx1Var.i(str2, new ylc("call_type", strH));
            }
            ((m02) this.l.getValue()).a(requireActivity(), (k42) this.i.getAccessor().d(66).getValue());
            activity = getActivity();
            if (activity != null) {
                mxj mxjVar3 = new mxj(activity.getWindow(), activity.getWindow().getDecorView());
                mxjVar3.a.b0();
                this.n1 = mxjVar3;
            }
            ix1 ix1Var3 = new ix1(this, getContext());
            ix1Var3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            ix1Var3.setBackgroundColor(pq3.j.l(ix1Var3).b.b().c);
            Context context3 = layoutInflater.getContext();
            wf4 ve1Var3 = new ve1(context3);
            ve1Var3.setId(R.id.call_screen_container_id);
            bz1 bz1Var3 = new bz1(context3, this.f.b());
            bz1Var3.setupCallModesAdapter((mr1) this.v1.getValue());
            je9 je9Var4 = je9.g;
            childAt = bz1Var3.E.getChildAt(0);
            if (childAt instanceof RecyclerView) {
                recyclerView = (RecyclerView) childAt;
            } else {
                recyclerView = null;
            }
            if (recyclerView != null) {
                Field declaredField3 = RecyclerView.class.getDeclaredField("w1");
                declaredField3.setAccessible(z);
                declaredField3.set(recyclerView, Integer.valueOf(((Integer) declaredField3.get(recyclerView)).intValue() * 3));
            }
            bz1Var3.setupListener((fx1) this.A1.getValue());
            bz1Var3.setPipBoundariesController(P1());
            bz1Var3.setupControlsMediator(N1());
            qq7 qq7Var3 = (qq7) this.G.getValue();
            qq7Var3.d = bz1Var3.E;
            bz1Var3.x = qq7Var3;
            tp2Var = new tp2(context3);
            tp2Var.setId(R.id.call_top_control_container);
            lvb.H(tp2Var, new oi8(0, 5, 0, null, 13), null);
            P1().a(tp2Var, b1d.a);
            WeakHashMap weakHashMap3 = i7j.a;
            if (tp2Var.isLaidOut()) {
                tp2Var.addOnLayoutChangeListener(new ex1(this, 1));
            } else {
                tp2Var.addOnLayoutChangeListener(new ex1(this, 1));
            }
            tp2Var2 = new tp2(context3);
            tp2Var2.setId(R.id.call_bottom_control_container);
            tp2Var2.setLayoutParams(new uf4(-2, -2));
            lvb.H(tp2Var2, new oi8(0, 0, 0, new j11(5, 1, false), 7), null);
            c1d c1dVarP3 = P1();
            b1d b1dVar3 = b1d.b;
            c1dVarP3.a(tp2Var2, b1dVar3);
            if (tp2Var2.isLaidOut()) {
                tp2Var2.addOnLayoutChangeListener(new ex1(this, 0));
            } else {
                tp2Var2.addOnLayoutChangeListener(new ex1(this, 0));
            }
            ViewGroup tp2Var9 = new tp2(context3);
            tp2Var9.setId(R.id.call_events_view);
            tp2Var9.setLayoutParams(new uf4(-1, -2));
            P1().a(tp2Var9, b1dVar3);
            tp2 tp2Var10 = new tp2(context3);
            tp2Var10.setId(R.id.call_waiting_room_events_router);
            tp2Var10.setLayoutParams(new uf4(-1, -2));
            tp2 tp2Var11 = new tp2(context3);
            tp2Var11.setId(R.id.call_screen_vpn_container_id);
            tp2Var11.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            vq7Var = new vq7(context3);
            vq7Var.setId(R.id.call_users_speakers_view_tab_layout);
            vq7Var.setBackgroundColor(0);
            vq7Var.setVisibility(0);
            ((qq7) this.G.getValue()).j = vq7Var;
            if (!((f5d) ((wo6) this.o.getValue())).a()) {
                vq7Var.setZeroPageIcon(null);
            }
            ViewStub viewStub3 = new ViewStub(context3);
            viewStub3.setId(R.id.call_users_speakers_scroll_start);
            ve1Var3.addView(bz1Var3);
            ve1Var3.addView(tp2Var2);
            ve1Var3.addView(tp2Var, 0, -2);
            ve1Var3.addView(tp2Var9);
            ve1Var3.addView(tp2Var10);
            ve1Var3.addView(tp2Var11);
            ve1Var3.addView(vq7Var, gm0.K(80.0f * yl5.d().getDisplayMetrics().density), gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
            ve1Var3.addView(viewStub3, -2, -2);
            es4 es4VarN3 = N1();
            tp2Var.addOnLayoutChangeListener((View.OnLayoutChangeListener) es4VarN3.e.getValue());
            es4VarN3.c = tp2Var;
            tp2Var2.addOnLayoutChangeListener((View.OnLayoutChangeListener) es4VarN3.f.getValue());
            es4VarN3.d = tp2Var2;
            N1().b(this);
            fs4 fs4Var3 = (fs4) this.F.getValue();
            fs4Var3.e = bz1Var3;
            lvb.j0(bz1Var3, new dk2(1, fs4Var3));
            eg4 eg4VarH3 = ch3.h(ve1Var3);
            int id15 = tp2Var.getId();
            int i5 = i;
            eg4VarH3.d(id15, i5, 0, i5);
            eg4VarH3.d(id15, 6, 0, 6);
            eg4VarH3.d(id15, 7, 0, 7);
            int id16 = tp2Var2.getId();
            eg4VarH3.d(id16, 4, 0, 4);
            eg4VarH3.d(id16, 6, 0, 6);
            eg4VarH3.d(id16, 7, 0, 7);
            int id17 = tp2Var9.getId();
            eg4VarH3.d(id17, 4, tp2Var2.getId(), 3);
            eg4VarH3.d(id17, 6, 0, 6);
            eg4VarH3.d(id17, 7, 0, 7);
            int id18 = tp2Var10.getId();
            eg4VarH3.d(id18, 3, tp2Var.getId(), 4);
            eg4VarH3.d(id18, 6, 0, 6);
            eg4VarH3.d(id18, 7, 0, 7);
            int id19 = tp2Var11.getId();
            eg4VarH3.d(id19, 4, tp2Var2.getId(), 3);
            eg4VarH3.d(id19, 6, 0, 6);
            eg4VarH3.d(id19, 7, 0, 7);
            int id110 = vq7Var.getId();
            eg4VarH3.d(id110, 4, tp2Var2.getId(), 3);
            eg4VarH3.d(id110, 6, 0, 6);
            eg4VarH3.d(id110, 7, 0, 7);
            int id111 = viewStub3.getId();
            eg4VarH3.d(id111, 6, 0, 6);
            new bsb(6, eg4VarH3, id111).a(gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
            eg4VarH3.d(id111, 4, vq7Var.getId(), 4);
            eg4VarH3.d(id111, 3, vq7Var.getId(), 3);
            eg4VarH3.a(ve1Var3);
            E1(tp2Var2, tp2Var11, tp2Var10, getContext().getResources().getConfiguration().orientation == 1);
            ix1Var3.addView(ve1Var3);
            tx1Var2 = (tx1) this.k.getValue();
            str3 = tx1Var2.g;
            if (str3 == null) {
                str4 = tx1Var2.b;
                a4cVar = gm0.f;
                if (a4cVar != null) {
                    a4cVar.c(je9Var, str4, "Invoked 'callScreenViewCreationFinished', but traceId is null or empty!", null);
                }
            } else {
                qrc.k(tx1Var2, "call_screen_on_create_view_finished", 1, str3, false, null, null, 120);
            }
            return ix1Var3;
        }
        z = true;
        th = null;
        tx1Var = (tx1) this.k.getValue();
        strH = zfe.a(nf1Var.getClass()).h();
        str2 = tx1Var.g;
        if (str2 == null) {
            str5 = tx1Var.b;
            a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                a4cVar2.c(je9Var, str5, "Invoked 'callScreenViewCreationStarted', but traceId is null or empty!", th);
            }
        } else {
            qrc.k(tx1Var, "call_screen_on_create_view_started", 0, str2, false, null, null, 120);
            if (strH == null) {
                strH = "Unknown";
            }
            tx1Var.i(str2, new ylc("call_type", strH));
        }
        ((m02) this.l.getValue()).a(requireActivity(), (k42) this.i.getAccessor().d(66).getValue());
        activity = getActivity();
        if (activity != null) {
            mxj mxjVar4 = new mxj(activity.getWindow(), activity.getWindow().getDecorView());
            mxjVar4.a.b0();
            this.n1 = mxjVar4;
        }
        ix1 ix1Var4 = new ix1(this, getContext());
        ix1Var4.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        ix1Var4.setBackgroundColor(pq3.j.l(ix1Var4).b.b().c);
        Context context4 = layoutInflater.getContext();
        wf4 ve1Var4 = new ve1(context4);
        ve1Var4.setId(R.id.call_screen_container_id);
        bz1 bz1Var4 = new bz1(context4, this.f.b());
        bz1Var4.setupCallModesAdapter((mr1) this.v1.getValue());
        je9 je9Var5 = je9.g;
        childAt = bz1Var4.E.getChildAt(0);
        if (childAt instanceof RecyclerView) {
            recyclerView = (RecyclerView) childAt;
        } else {
            recyclerView = null;
        }
        if (recyclerView != null) {
            Field declaredField4 = RecyclerView.class.getDeclaredField("w1");
            declaredField4.setAccessible(z);
            declaredField4.set(recyclerView, Integer.valueOf(((Integer) declaredField4.get(recyclerView)).intValue() * 3));
        }
        bz1Var4.setupListener((fx1) this.A1.getValue());
        bz1Var4.setPipBoundariesController(P1());
        bz1Var4.setupControlsMediator(N1());
        qq7 qq7Var4 = (qq7) this.G.getValue();
        qq7Var4.d = bz1Var4.E;
        bz1Var4.x = qq7Var4;
        tp2Var = new tp2(context4);
        tp2Var.setId(R.id.call_top_control_container);
        lvb.H(tp2Var, new oi8(0, 5, 0, null, 13), null);
        P1().a(tp2Var, b1d.a);
        WeakHashMap weakHashMap4 = i7j.a;
        if (tp2Var.isLaidOut()) {
            tp2Var.addOnLayoutChangeListener(new ex1(this, 1));
        } else {
            tp2Var.addOnLayoutChangeListener(new ex1(this, 1));
        }
        tp2Var2 = new tp2(context4);
        tp2Var2.setId(R.id.call_bottom_control_container);
        tp2Var2.setLayoutParams(new uf4(-2, -2));
        lvb.H(tp2Var2, new oi8(0, 0, 0, new j11(5, 1, false), 7), null);
        c1d c1dVarP4 = P1();
        b1d b1dVar4 = b1d.b;
        c1dVarP4.a(tp2Var2, b1dVar4);
        if (tp2Var2.isLaidOut()) {
            tp2Var2.addOnLayoutChangeListener(new ex1(this, 0));
        } else {
            tp2Var2.addOnLayoutChangeListener(new ex1(this, 0));
        }
        ViewGroup tp2Var12 = new tp2(context4);
        tp2Var12.setId(R.id.call_events_view);
        tp2Var12.setLayoutParams(new uf4(-1, -2));
        P1().a(tp2Var12, b1dVar4);
        tp2 tp2Var13 = new tp2(context4);
        tp2Var13.setId(R.id.call_waiting_room_events_router);
        tp2Var13.setLayoutParams(new uf4(-1, -2));
        tp2 tp2Var14 = new tp2(context4);
        tp2Var14.setId(R.id.call_screen_vpn_container_id);
        tp2Var14.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        vq7Var = new vq7(context4);
        vq7Var.setId(R.id.call_users_speakers_view_tab_layout);
        vq7Var.setBackgroundColor(0);
        vq7Var.setVisibility(0);
        ((qq7) this.G.getValue()).j = vq7Var;
        if (!((f5d) ((wo6) this.o.getValue())).a()) {
            vq7Var.setZeroPageIcon(null);
        }
        ViewStub viewStub4 = new ViewStub(context4);
        viewStub4.setId(R.id.call_users_speakers_scroll_start);
        ve1Var4.addView(bz1Var4);
        ve1Var4.addView(tp2Var2);
        ve1Var4.addView(tp2Var, 0, -2);
        ve1Var4.addView(tp2Var12);
        ve1Var4.addView(tp2Var13);
        ve1Var4.addView(tp2Var14);
        ve1Var4.addView(vq7Var, gm0.K(80.0f * yl5.d().getDisplayMetrics().density), gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        ve1Var4.addView(viewStub4, -2, -2);
        es4 es4VarN4 = N1();
        tp2Var.addOnLayoutChangeListener((View.OnLayoutChangeListener) es4VarN4.e.getValue());
        es4VarN4.c = tp2Var;
        tp2Var2.addOnLayoutChangeListener((View.OnLayoutChangeListener) es4VarN4.f.getValue());
        es4VarN4.d = tp2Var2;
        N1().b(this);
        fs4 fs4Var4 = (fs4) this.F.getValue();
        fs4Var4.e = bz1Var4;
        lvb.j0(bz1Var4, new dk2(1, fs4Var4));
        eg4 eg4VarH4 = ch3.h(ve1Var4);
        int id112 = tp2Var.getId();
        int i6 = i;
        eg4VarH4.d(id112, i6, 0, i6);
        eg4VarH4.d(id112, 6, 0, 6);
        eg4VarH4.d(id112, 7, 0, 7);
        int id113 = tp2Var2.getId();
        eg4VarH4.d(id113, 4, 0, 4);
        eg4VarH4.d(id113, 6, 0, 6);
        eg4VarH4.d(id113, 7, 0, 7);
        int id114 = tp2Var12.getId();
        eg4VarH4.d(id114, 4, tp2Var2.getId(), 3);
        eg4VarH4.d(id114, 6, 0, 6);
        eg4VarH4.d(id114, 7, 0, 7);
        int id115 = tp2Var13.getId();
        eg4VarH4.d(id115, 3, tp2Var.getId(), 4);
        eg4VarH4.d(id115, 6, 0, 6);
        eg4VarH4.d(id115, 7, 0, 7);
        int id116 = tp2Var14.getId();
        eg4VarH4.d(id116, 4, tp2Var2.getId(), 3);
        eg4VarH4.d(id116, 6, 0, 6);
        eg4VarH4.d(id116, 7, 0, 7);
        int id117 = vq7Var.getId();
        eg4VarH4.d(id117, 4, tp2Var2.getId(), 3);
        eg4VarH4.d(id117, 6, 0, 6);
        eg4VarH4.d(id117, 7, 0, 7);
        int id118 = viewStub4.getId();
        eg4VarH4.d(id118, 6, 0, 6);
        new bsb(6, eg4VarH4, id118).a(gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH4.d(id118, 4, vq7Var.getId(), 4);
        eg4VarH4.d(id118, 3, vq7Var.getId(), 3);
        eg4VarH4.a(ve1Var4);
        E1(tp2Var2, tp2Var14, tp2Var13, getContext().getResources().getConfiguration().orientation == 1);
        ix1Var4.addView(ve1Var4);
        tx1Var2 = (tx1) this.k.getValue();
        str3 = tx1Var2.g;
        if (str3 == null) {
            str4 = tx1Var2.b;
            a4cVar = gm0.f;
            if (a4cVar != null) {
                a4cVar.c(je9Var, str4, "Invoked 'callScreenViewCreationFinished', but traceId is null or empty!", null);
            }
        } else {
            qrc.k(tx1Var2, "call_screen_on_create_view_finished", 1, str3, false, null, null, 120);
        }
        return ix1Var4;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        o7j.d(requireActivity(), false);
        super.onDestroyView(view);
        if (!requireActivity().isChangingConfigurations()) {
            es4 es4VarN1 = N1();
            es4VarN1.a.clear();
            tp2 tp2Var = es4VarN1.c;
            if (tp2Var != null) {
                tp2Var.removeOnLayoutChangeListener((View.OnLayoutChangeListener) es4VarN1.e.getValue());
            }
            tp2 tp2Var2 = es4VarN1.d;
            if (tp2Var2 != null) {
                tp2Var2.removeOnLayoutChangeListener((View.OnLayoutChangeListener) es4VarN1.f.getValue());
            }
            es4VarN1.c = null;
            es4VarN1.d = null;
            ((p22) ((o22) this.n.getValue())).a.clear();
            fs4 fs4Var = (fs4) this.F.getValue();
            fs4Var.c.removeCallbacks(fs4Var.d);
            bz1 bz1Var = fs4Var.e;
            if (bz1Var != null) {
                WeakHashMap weakHashMap = i7j.a;
                y6j.l(bz1Var, null);
                swj.a(bz1Var, null);
            }
            fs4Var.e = null;
            h02 h02VarR1 = R1();
            w82 w82Var = h02VarR1.e;
            ((d9b) w82Var.x.getValue()).a(Boolean.FALSE);
            w82Var.f.b();
            ac1 ac1Var = (ac1) w82Var.b;
            ac1Var.i.set(null);
            rb0 rb0Var = (rb0) ac1Var.h.get();
            if (rb0Var != null) {
                rb0Var.c(null);
            }
            zb1 zb1Var = w82Var.b;
            AudioLevelListener audioLevelListener = (AudioLevelListener) w82Var.A.getValue();
            ac1 ac1Var2 = (ac1) zb1Var;
            ac1Var2.getClass();
            try {
                MicrophoneManager microphoneManagerB = ac1Var2.b();
                if (microphoneManagerB != null) {
                    microphoneManagerB.removeAudioSampleCallback(audioLevelListener);
                }
            } catch (Exception e) {
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "CallAudioController", qv1.k("CallAudioController can't unregister mic audio listener due to: ", e.getMessage()), e);
                    }
                }
            }
            w82Var.f.h.remove((p82) w82Var.D.getValue());
            w82Var.f.g = null;
            vo8 vo8Var = (vo8) w82Var.B.m(w82Var, w82.E[0]);
            if (vo8Var != null) {
                vo8Var.b(null);
            }
            ((lxi) h02VarR1.E.getValue()).b();
            ((s32) h02VarR1.X.getValue()).a.clear();
        }
        c1d c1dVarP1 = P1();
        c1dVarP1.b.clear();
        c1dVarP1.a.clear();
        N1().e(true);
        O1().z();
        br4 parentController = this;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
        hve hveVarU1 = rootController != null ? rootController.u1() : null;
        if (hveVarU1 != null) {
            hveVarU1.M((gx1) this.w1.getValue());
        }
        br4 br4VarC = rx8.C(L1().a);
        CallEventsWidget callEventsWidget = br4VarC instanceof CallEventsWidget ? (CallEventsWidget) br4VarC : null;
        if (callEventsWidget != null) {
            N1().a.remove(callEventsWidget);
        }
        vo8 vo8Var2 = (vo8) this.H.m(this, E1[6]);
        if (vo8Var2 != null) {
            vo8Var2.b(null);
        }
        H1(true);
        ((a9j) this.D.getValue()).a = null;
        ConfirmationBottomSheet confirmationBottomSheet = this.e;
        if (confirmationBottomSheet != null) {
            zpe zpeVar = BaseBottomSheetWidget.i;
            confirmationBottomSheet.v1(true);
        }
        this.e = null;
        md1 md1Var = this.o1;
        if (md1Var != null) {
            view.getContext().unregisterComponentCallbacks(md1Var);
        }
        this.o1 = null;
    }

    @Override // defpackage.vp4
    public final void onDismiss() {
        h22 h22VarG = R1().G();
        h22VarG.f = false;
        if (h22VarG.g) {
            return;
        }
        h22VarG.b(2000L);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        je9 je9Var = je9.f;
        tx1 tx1Var = (tx1) this.k.getValue();
        String str = tx1Var.g;
        if (str == null) {
            String str2 = tx1Var.b;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, "Invoked 'callScreenViewCreatedStarted', but traceId is null or empty!", null);
            }
        } else {
            qrc.k(tx1Var, "call_screen_view_created_started", 2, str, false, null, null, 120);
        }
        super.onViewCreated(view);
        br4 parentController = this;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
        hve hveVarU1 = rootController != null ? rootController.u1() : null;
        if (hveVarU1 != null) {
            hveVarU1.a((gx1) this.w1.getValue());
        }
        o7j.d(requireActivity(), true);
        h02 h02VarR1 = R1();
        w82 w82Var = h02VarR1.e;
        w82Var.l();
        w82Var.k();
        w82Var.f.a();
        w82Var.f.h.add((p82) w82Var.D.getValue());
        w82Var.f.g = new due(w82Var);
        w82Var.B.B(w82Var, w82.E[0], e9i.j0(w82Var.C, w82Var.g));
        mjg mjgVar = h02VarR1.t;
        Boolean bool = Boolean.TRUE;
        mjgVar.getClass();
        mjgVar.j(null, bool);
        j8e j8eVar = this.y;
        zv8[] zv8VarArr = E1;
        zp3 zp3Var = (zp3) j8eVar.m(this, zv8VarArr[2]);
        hve hveVar = zp3Var.a;
        if (!cqk.d(zp3Var.b(), "call_bottom_panel_widget_tag")) {
            hveVar.S(false);
            lve lveVarE = oc9.e(new CallBottomPanelWidget(this.f), null, null);
            lveVarE.e("call_bottom_panel_widget_tag");
            hveVar.T(lveVarE);
        }
        zp3 zp3Var2 = (zp3) this.x.m(this, zv8VarArr[1]);
        hve hveVar2 = zp3Var2.a;
        if (!cqk.d(zp3Var2.b(), "call_top_panel_widget_tag")) {
            hveVar2.S(false);
            lve lveVarE2 = oc9.e(new CallTopPanelWidget(this.f), null, null);
            lveVarE2.e("call_top_panel_widget_tag");
            hveVar2.T(lveVarE2);
        }
        Object objC = rx8.C(((zp3) this.x.m(this, zv8VarArr[1])).a);
        r32 r32Var = objC instanceof r32 ? (r32) objC : null;
        if (r32Var != null) {
            s32 s32Var = (s32) R1().X.getValue();
            s32Var.a.add(r32Var);
            r32Var.D(s32Var.b);
        }
        br4 br4VarC = rx8.C(L1().a);
        CallEventsWidget callEventsWidget = br4VarC instanceof CallEventsWidget ? (CallEventsWidget) br4VarC : null;
        if (callEventsWidget != null) {
            N1().b(callEventsWidget);
        }
        ltb ltbVarH = getRouter().h();
        if (ltbVarH != null) {
            ltbVarH.a(getViewLifecycleOwner(), new ev(2, this));
        }
        r07 r07Var = new r07(R1().H, new ra1(2, new p5(R1().x, 15)), new ud9(3, (lq4) null, 3), 0);
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(r07Var, getViewLifecycleOwner().f(), n09Var), new jx1(null, this, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(R1().J, getViewLifecycleOwner().f(), n09Var), new jx1(null, this, 1), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(R1().z, getViewLifecycleOwner().f(), n09Var), new jx1(null, this, 2), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(R1().y, getViewLifecycleOwner().f(), n09Var), new jx1(null, this, 3), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(R1().x, getViewLifecycleOwner().f(), n09Var), new jx1(null, this, 4), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(R1().G, getViewLifecycleOwner().f(), n09Var), new jx1(null, this, 5), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(e9i.I(new r07(R1().A, R1().B, new rx1(3, null, 0), 0)), getViewLifecycleOwner().f(), n09Var), new jx1(null, this, 7), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new jz(e9i.k0(e9i.I(new r07(R1().Y, this.y1, new ad1(3, null, 1), 0)), new ox1(2, null)), 13), getViewLifecycleOwner().f(), n09.e), new jx1(null, this, 6), 3), getViewLifecycleScope());
        tx1 tx1Var2 = (tx1) this.k.getValue();
        boolean z = ((ao1) R1().u.a.getValue()).h;
        boolean z2 = R1().K().e;
        String str3 = tx1Var2.g;
        if (str3 == null) {
            String str4 = tx1Var2.b;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str4, "Invoked 'openCallScreenInitFinished', but traceId is null or empty!", null);
            }
        } else {
            long[] jArr = q1f.a;
            b9b b9bVar = new b9b();
            b9bVar.k("group_call", Boolean.valueOf(z));
            b9bVar.k("incoming_call", Boolean.valueOf(z2));
            qrc.k(tx1Var2, "call_screen_on_view_created_finished", 3, str3, true, null, b9bVar, 80);
        }
        Context context = view.getContext();
        ufe ufeVar = new ufe();
        ufeVar.a = context.getResources().getConfiguration().orientation;
        md1 md1Var = new md1(ufeVar, this, 5);
        context.registerComponentCallbacks(md1Var);
        this.o1 = md1Var;
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    /* JADX INFO: renamed from: q1, reason: from getter */
    public final int getH() {
        return this.C1;
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    /* JADX INFO: renamed from: s1 */
    public final boolean getX() {
        return ((Boolean) ((e5d) this.p.getValue()).T2.a(e5d.S6[203]).i()).booleanValue();
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void t1(float f) {
        this.w = 0.0f;
        this.v = false;
        U1(false);
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void u1() {
        this.w = 0.0f;
        this.v = false;
        U1(false);
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void w1(float f) {
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(this.w);
        if (!this.v && fAbs >= 0.25f) {
            View view = getView();
            if (view != null) {
                view.performHapticFeedback(Build.VERSION.SDK_INT >= 30 ? 12 : 1);
            }
            this.v = true;
        }
        if (this.v && fAbs2 >= 0.25f && fAbs < 0.25f) {
            this.v = false;
        }
        this.w = f;
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void x1() {
        U1(true);
    }
}
