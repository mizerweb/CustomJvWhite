package one.me.calllist.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import defpackage.aac;
import defpackage.ae9;
import defpackage.b0m;
import defpackage.b1k;
import defpackage.br4;
import defpackage.bt4;
import defpackage.ca2;
import defpackage.ccc;
import defpackage.dl1;
import defpackage.dwd;
import defpackage.e5d;
import defpackage.e9i;
import defpackage.ea2;
import defpackage.et4;
import defpackage.ev;
import defpackage.fwg;
import defpackage.fz6;
import defpackage.g19;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.h;
import defpackage.h6b;
import defpackage.ha9;
import defpackage.hu;
import defpackage.hve;
import defpackage.i19;
import defpackage.i26;
import defpackage.ifh;
import defpackage.j8e;
import defpackage.jc4;
import defpackage.k92;
import defpackage.l8b;
import defpackage.lq4;
import defpackage.ltb;
import defpackage.lvb;
import defpackage.lve;
import defpackage.m5;
import defpackage.mc4;
import defpackage.mjg;
import defpackage.n09;
import defpackage.n1g;
import defpackage.n7j;
import defpackage.ny8;
import defpackage.o5b;
import defpackage.oa4;
import defpackage.oi8;
import defpackage.ore;
import defpackage.ow3;
import defpackage.p;
import defpackage.p5b;
import defpackage.p6f;
import defpackage.p91;
import defpackage.pa4;
import defpackage.pl1;
import defpackage.pq;
import defpackage.pte;
import defpackage.pzb;
import defpackage.qe7;
import defpackage.qt4;
import defpackage.qz9;
import defpackage.r;
import defpackage.r1c;
import defpackage.r66;
import defpackage.rcc;
import defpackage.rl1;
import defpackage.rq;
import defpackage.rw3;
import defpackage.rx8;
import defpackage.s81;
import defpackage.sl1;
import defpackage.svj;
import defpackage.t3f;
import defpackage.tl1;
import defpackage.tnh;
import defpackage.ul1;
import defpackage.ul9;
import defpackage.v09;
import defpackage.vl1;
import defpackage.vp4;
import defpackage.wl1;
import defpackage.wsc;
import defpackage.ww3;
import defpackage.wy7;
import defpackage.xk1;
import defpackage.xl1;
import defpackage.xu1;
import defpackage.y8j;
import defpackage.yab;
import defpackage.ybc;
import defpackage.yl1;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.ysc;
import defpackage.yw7;
import defpackage.zfe;
import defpackage.zl1;
import defpackage.zo5;
import defpackage.zv8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.calllist.ui.CallHistoryScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.vpnconnectedwarning.VpnConnectedWarningBottomSheet;
import org.webrtc.MediaStreamTrack;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lone/me/calllist/ui/CallHistoryScreen;", "Lone/me/sdk/arch/Widget;", "Lvp4;", "Lmc4;", "Lp6f;", "Lpte;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "call-list"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CallHistoryScreen extends Widget implements vp4, mc4, p6f, pte {
    public static final /* synthetic */ zv8[] D = {new dwd(CallHistoryScreen.class, "container", "getContainer()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", 0), zo5.f(zfe.a, CallHistoryScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new dwd(CallHistoryScreen.class, "callTabLayout", "getCallTabLayout()Lone/me/common/tablayout/OneMeTabLayout;", 0), new dwd(CallHistoryScreen.class, "callHistoryPager", "getCallHistoryPager()Landroidx/viewpager2/widget/ViewPager2;", 0), new dwd(CallHistoryScreen.class, "micPermissionBanner", "getMicPermissionBanner()Lone/me/sdk/uikit/common/banner/OneMeCompactBannerView;", 0), new dwd(CallHistoryScreen.class, "collapsingToolbarLayout", "getCollapsingToolbarLayout()Lcom/google/android/material/appbar/CollapsingToolbarLayout;", 0), new dwd(CallHistoryScreen.class, "callEmptyHistoryView", "getCallEmptyHistoryView()Lone/me/sdk/uikit/common/emptyview/OneMeEmptyView;", 0)};
    public static final int[] E = {-11664148, -7436801};
    public final wy7 A;
    public final int B;
    public final oi8 C;
    public final t3f a;
    public final ca2 b;
    public final ny8 c;
    public final h d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final int l;
    public final ny8 m;
    public final j8e n;
    public final j8e o;
    public final j8e p;
    public final j8e q;
    public final j8e r;
    public final j8e s;
    public final j8e t;
    public final b1k u;
    public final dl1 v;
    public fwg w;
    public rq x;
    public yl1 y;
    public Integer z;

    public CallHistoryScreen(Bundle bundle) {
        super(bundle);
        t3f t3fVar = new t3f("call_history_scope_id", super.getA().b());
        this.a = t3fVar;
        ca2 ca2Var = new ca2(m35getAccountScopeuqN4xOY());
        this.b = ca2Var;
        ca2Var.getAccessor().getClass();
        this.c = ysc.a.a();
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.d = hVar;
        this.e = createViewModelLazy(vl1.class, new r(18, new pl1(this, 2)));
        int i = 3;
        this.f = rx8.P(3, new pl1(this, 3));
        hVar.getAccessor().getClass();
        ifh ifhVarD = hVar.getAccessor().d(26);
        this.g = ifhVarD;
        this.h = hVar.getAccessor().d(778);
        this.i = hVar.getAccessor().d(140);
        this.j = rx8.P(3, new pl1(this, 4));
        this.k = hVar.getAccessor().d(738);
        this.l = pa4.d;
        this.m = rx8.P(3, new pl1(this, 5));
        this.n = viewBinding(R.id.call_history_screen_container);
        this.o = viewBinding(R.id.call_history_screen_toolbar);
        this.p = viewBinding(R.id.call_history_tabs);
        this.q = viewBinding(R.id.call_history_pager);
        this.r = viewBinding(R.id.call_history_screen_banner);
        this.s = viewBinding(R.id.call_history_screen_collapsing_toolbar);
        this.t = viewBinding(R.id.call_history_empty);
        b1k b1kVar = new b1k(5);
        b1kVar.b = r66.a;
        this.u = b1kVar;
        this.v = new dl1(this, t3fVar.b());
        this.A = new wy7(i, this);
        this.B = 3;
        this.C = oi8.f;
        e9i.j0(new fz6(n1g.v(((e5d) ifhVarD.getValue()).h().h(), this.lifecycleOwner.f(), n09.c), new tl1(this, (lq4) null, 0), i), getLifecycleScope());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v4, types: [br4] */
    @Override // defpackage.vp4
    public final void E(int i, Bundle bundle) {
        Object value;
        if (i == 0) {
            mjg mjgVar = r1().h.a;
            do {
                value = mjgVar.getValue();
            } while (!mjgVar.h(value, new o5b(true, ((o5b) value).b, true)));
            return;
        }
        if (i != 1) {
            return;
        }
        zv8[] zv8VarArr = BottomSheetWidget.t;
        jc4 jc4VarC = p.c(R.string.call_history_clear_all_confirm_title, null, null, 6);
        jc4VarC.b(0, new tnh(R.string.call_history_clear_all_confirm_button));
        jc4VarC.c(1, new tnh(R.string.call_history_clear_all_cancel_button));
        ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(this);
        confirmationBottomSheetF.setTargetController(this);
        ?? parentController = this;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
        hve hveVarU1 = rootController != null ? rootController.u1() : null;
        if (hveVarU1 != null) {
            lve lveVar = new lve(confirmationBottomSheetF, null, null, null, false, -1);
            p.k(false, lveVar, true, "BottomSheetWidget");
            hveVarU1.I(lveVar);
        }
    }

    @Override // defpackage.p6f
    public final void U0() {
        lve lveVar;
        hve hveVar = (hve) this.v.h.get(o1().getCurrentItem());
        br4 br4Var = (hveVar == null || (lveVar = (lve) ww3.t1(hveVar.e())) == null) ? null : lveVar.a;
        p6f p6fVar = br4Var instanceof p6f ? (p6f) br4Var : null;
        if (p6fVar != null) {
            p6fVar.U0();
            rq rqVar = this.x;
            if (rqVar != null) {
                rqVar.g(true, true, true);
            }
        }
    }

    @Override // defpackage.pte
    public final void b() {
        if (p1()) {
            ((ea2) this.j.getValue()).c();
        }
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        String str;
        lq4 lq4Var = null;
        if (i == 0) {
            vl1 vl1VarR1 = r1();
            xl1 xl1Var = (xl1) vl1VarR1.g.getValue();
            int i2 = vl1VarR1.j;
            ae9 ae9Var = (ae9) xl1Var.a.getValue();
            ul9 ul9Var = new ul9();
            ul9Var.put("removedItemsCount", Integer.valueOf(i2));
            ae9Var.g("CLEAR_CALL_HISTORY", ul9Var.b());
            yab.i0(vl1VarR1.b, null, 0, new m5(vl1VarR1, lq4Var, 12), 3);
            r1().B();
            return;
        }
        if (i != 2) {
            ((xu1) this.f.getValue()).g(i);
            return;
        }
        vl1 vl1VarR2 = r1();
        Set set = ((o5b) vl1VarR2.h.b.a.getValue()).b;
        l8b l8bVar = vl1VarR2.i;
        ArrayList<yw7> arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            yw7 yw7Var = (yw7) l8bVar.f(((Number) it.next()).longValue());
            if (yw7Var != null) {
                arrayList.add(yw7Var);
            }
        }
        if (!arrayList.isEmpty()) {
            xl1 xl1Var2 = (xl1) vl1VarR2.g.getValue();
            for (yw7 yw7Var2 : arrayList) {
                ae9 ae9Var2 = (ae9) xl1Var2.a.getValue();
                ul9 ul9Var2 = new ul9();
                List list = yw7Var2.m;
                ul9Var2.put("deleteType", (list.isEmpty() ? 1 : list.size()) > 1 ? "grouped" : "single");
                int i3 = wl1.$EnumSwitchMapping$1[qt4.D(yw7Var2.j)];
                if (i3 == 1) {
                    str = MediaStreamTrack.AUDIO_TRACK_KIND;
                } else {
                    if (i3 != 2) {
                        ore.o();
                        return;
                    }
                    str = MediaStreamTrack.VIDEO_TRACK_KIND;
                }
                ul9Var2.put("callType", str);
                String strA = xl1.a(yw7Var2.k);
                if (strA != null) {
                    ul9Var2.put("dialogType", strA);
                }
                ae9Var2.g("DELETE_CALL_HISTORY_ITEM", ul9Var2.b());
            }
            yab.i0(vl1VarR2.b, null, 0, new i26(vl1VarR2, arrayList, lq4Var, 27), 3);
        }
        vl1VarR2.B();
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getC() {
        return this.C;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScopeId, reason: from getter */
    public final t3f getA() {
        return this.a;
    }

    @Override // defpackage.pte
    public final void k0() {
        if (p1()) {
            ((ea2) this.j.getValue()).h();
        }
    }

    public final y8j o1() {
        return (y8j) this.q.m(this, D[3]);
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        Object value;
        boolean z;
        List list;
        super.onAttach(view);
        vl1 vl1VarR1 = r1();
        mjg mjgVar = vl1VarR1.k;
        do {
            value = mjgVar.getValue();
            k92 k92Var = (k92) value;
            z = !((wsc) vl1VarR1.e.getValue()).c(wsc.i);
            list = k92Var.a;
            k92Var.getClass();
        } while (!mjgVar.h(value, new k92(list, z)));
        s1(o1().getCurrentItem());
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ((pa4) this.k.getValue()).a(this.l, (oa4) this.m.getValue());
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        final int i = 1;
        linearLayout.setOrientation(1);
        rcc rccVar = new rcc(linearLayout.getContext());
        rccVar.setId(R.id.call_history_screen_toolbar);
        rccVar.setForm(gcc.Main);
        rccVar.setTitle(R.string.call_history_call_title);
        rccVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.addView(rccVar);
        et4 et4Var = new et4(linearLayout.getContext());
        et4Var.setId(R.id.call_history_screen_container);
        et4Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        rq rqVar = new rq(et4Var.getContext());
        rqVar.setElevation(yl5.d().getDisplayMetrics().density * 0.0f);
        rqVar.setLayoutParams(new bt4(-1, -2));
        rqVar.setBackground(null);
        rw3 rw3Var = new rw3(rqVar.getContext());
        rw3Var.setId(R.id.call_history_screen_collapsing_toolbar);
        final int i2 = 0;
        rw3Var.setTitleEnabled(false);
        pq pqVar = new pq();
        pqVar.a = this.B;
        rw3Var.setLayoutParams(pqVar);
        LinearLayout linearLayout2 = new LinearLayout(rw3Var.getContext());
        linearLayout2.setOrientation(1);
        pzb pzbVar = new pzb(linearLayout2.getContext());
        pzbVar.setId(R.id.call_history_screen_banner);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        layoutParams.setMarginEnd(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        layoutParams.bottomMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        pzbVar.setLayoutParams(layoutParams);
        pzbVar.setTitle(pzbVar.getContext().getString(R.string.call_history_call_create_banner_title));
        pzbVar.setSubtitle(pzbVar.getContext().getString(R.string.call_history_call_create_banner_subtitle));
        pzbVar.v(pzbVar.getContext().getDrawable(R.drawable.icon_microphone).mutate(), gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        b0m.e(pzbVar.D, E, new float[]{0.0f, 1.0f});
        qe7.H(pzbVar, 300L, new View.OnClickListener(this) { // from class: ol1
            public final /* synthetic */ CallHistoryScreen b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                CallHistoryScreen callHistoryScreen = this.b;
                switch (i3) {
                    case 0:
                        zv8[] zv8VarArr = CallHistoryScreen.D;
                        if (!((gbj) callHistoryScreen.r1().f.getValue()).a()) {
                            xu1 xu1Var = callHistoryScreen.r1().d;
                            va vaVar = new va(27);
                            xu1Var.c();
                            xu1Var.j = true;
                            if (!xu1Var.f().a(xu1Var.a, false)) {
                                xu1Var.l = vaVar;
                                xu1Var.h = null;
                                xu1Var.i = false;
                            } else {
                                vaVar.invoke();
                            }
                        } else {
                            zv8[] zv8VarArr2 = BottomSheetWidget.t;
                            VpnConnectedWarningBottomSheet vpnConnectedWarningBottomSheet = new VpnConnectedWarningBottomSheet(y3f.CALL_VPN_WARNING_SHEET, callHistoryScreen.a.b());
                            vpnConnectedWarningBottomSheet.setTargetController(callHistoryScreen);
                            br4 parentController = callHistoryScreen;
                            while (parentController.getParentController() != null) {
                                parentController = parentController.getParentController();
                            }
                            RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                            hve hveVarU1 = rootController != null ? rootController.u1() : null;
                            if (hveVarU1 != null) {
                                lve lveVar = new lve(vpnConnectedWarningBottomSheet, null, null, null, false, -1);
                                p.k(false, lveVar, true, "BottomSheetWidget");
                                hveVarU1.I(lveVar);
                            }
                        }
                        break;
                    default:
                        ((wsc) callHistoryScreen.c.getValue()).m(new svj(callHistoryScreen, 0), wsc.i, 160);
                        break;
                }
            }
        });
        linearLayout2.addView(pzbVar);
        p91 p91Var = new p91(linearLayout2.getContext());
        p91Var.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(yl5.d().getDisplayMetrics().density * 0.0f), gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(yl5.d().getDisplayMetrics().density * 0.0f));
        p91Var.setId(R.id.call_history_screen_contact_call);
        p91Var.setActionIcon(R.drawable.icon_call);
        p91Var.setActionText(R.string.call_history_call_contact_action);
        qe7.H(p91Var, 300L, new sl1(i));
        p91Var.setLayoutParams(new LinearLayout.LayoutParams(-1, gm0.K(yl5.d().getDisplayMetrics().density * 52.0f)));
        linearLayout2.addView(p91Var);
        p91 p91Var2 = new p91(linearLayout2.getContext());
        p91Var2.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(yl5.d().getDisplayMetrics().density * 0.0f), gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(yl5.d().getDisplayMetrics().density * 0.0f));
        p91Var2.setId(R.id.call_history_screen_group_call);
        p91Var2.setActionIcon(R.drawable.icon_link);
        p91Var2.setActionText(R.string.oneme_create_group_call_button_text);
        qe7.H(p91Var2, 300L, new View.OnClickListener(this) { // from class: ol1
            public final /* synthetic */ CallHistoryScreen b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                CallHistoryScreen callHistoryScreen = this.b;
                switch (i3) {
                    case 0:
                        zv8[] zv8VarArr = CallHistoryScreen.D;
                        if (!((gbj) callHistoryScreen.r1().f.getValue()).a()) {
                            xu1 xu1Var = callHistoryScreen.r1().d;
                            va vaVar = new va(27);
                            xu1Var.c();
                            xu1Var.j = true;
                            if (!xu1Var.f().a(xu1Var.a, false)) {
                                xu1Var.l = vaVar;
                                xu1Var.h = null;
                                xu1Var.i = false;
                            } else {
                                vaVar.invoke();
                            }
                        } else {
                            zv8[] zv8VarArr2 = BottomSheetWidget.t;
                            VpnConnectedWarningBottomSheet vpnConnectedWarningBottomSheet = new VpnConnectedWarningBottomSheet(y3f.CALL_VPN_WARNING_SHEET, callHistoryScreen.a.b());
                            vpnConnectedWarningBottomSheet.setTargetController(callHistoryScreen);
                            br4 parentController = callHistoryScreen;
                            while (parentController.getParentController() != null) {
                                parentController = parentController.getParentController();
                            }
                            RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                            hve hveVarU1 = rootController != null ? rootController.u1() : null;
                            if (hveVarU1 != null) {
                                lve lveVar = new lve(vpnConnectedWarningBottomSheet, null, null, null, false, -1);
                                p.k(false, lveVar, true, "BottomSheetWidget");
                                hveVarU1.I(lveVar);
                            }
                        }
                        break;
                    default:
                        ((wsc) callHistoryScreen.c.getValue()).m(new svj(callHistoryScreen, 0), wsc.i, 160);
                        break;
                }
            }
        });
        p91Var2.setLayoutParams(new LinearLayout.LayoutParams(-1, gm0.K(52.0f * yl5.d().getDisplayMetrics().density)));
        linearLayout2.addView(p91Var2);
        linearLayout2.setLayoutParams(new ow3(-1, -2));
        rw3Var.addView(linearLayout2);
        rqVar.addView(rw3Var);
        aac aacVar = new aac(rqVar.getContext());
        aacVar.setId(R.id.call_history_tabs);
        aacVar.setTabMode(0);
        aacVar.setLayoutParams(new pq());
        rqVar.addView(aacVar);
        rqVar.setStateListAnimator(null);
        this.x = rqVar;
        et4Var.addView(rqVar);
        y8j y8jVar = new y8j(et4Var.getContext());
        y8jVar.setId(R.id.call_history_pager);
        bt4 bt4Var = new bt4(-1, -1);
        bt4Var.b(new AppBarLayout$ScrollingViewBehavior());
        y8jVar.setLayoutParams(bt4Var);
        lvb.m0(y8jVar);
        et4Var.addView(y8jVar);
        linearLayout.addView(et4Var);
        return linearLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        o1().j(this.A);
        this.y = null;
        if (!requireActivity().isChangingConfigurations()) {
            o1().setAdapter(null);
            r1().B();
        }
        pa4 pa4Var = (pa4) this.k.getValue();
        oa4 oa4Var = (oa4) this.m.getValue();
        Set set = (Set) pa4Var.b.get(Integer.valueOf(this.l));
        if (set != null) {
            set.remove(oa4Var);
        }
        fwg fwgVar = this.w;
        if (fwgVar != null) {
            fwgVar.d();
        }
        this.w = null;
    }

    @Override // defpackage.br4
    public final void onDetach(View view) {
        super.onDetach(view);
        this.y = null;
        if (requireActivity().isChangingConfigurations()) {
            return;
        }
        r1().B();
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (p1()) {
            ((ea2) this.j.getValue()).e(i);
        }
        if (((xu1) this.f.getValue()).b(i, iArr)) {
            return;
        }
        if (i == 160 && ((wsc) this.c.getValue()).c(strArr)) {
            if (getView() != null) {
                ((pzb) this.r.m(this, D[4])).setVisibility(8);
                return;
            }
            return;
        }
        for (int i2 : iArr) {
            if (i2 == -1) {
                svj.e(new svj(this, 0), R.string.call_history_call_create_banner_permission_denied_title, Integer.valueOf(R.string.call_history_call_create_banner_permission_denied_subtitle), null, null, false, null, 60);
                return;
            }
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        mjg mjgVar = r1().l;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        lq4 lq4Var = null;
        int i = 3;
        e9i.j0(new fz6(n1g.v(mjgVar, i19VarF, n09Var), new ul1(lq4Var, this, 0), i), getViewLifecycleScope());
        p5b p5bVar = r1().h;
        rcc rccVarQ1 = q1();
        int i2 = 1;
        e9i.j0(new fz6(p5bVar.b, new h6b(rccVarQ1, new rl1(this, 1), new xk1(i2), p5bVar, new s81(2, this), (lq4) null), i), getViewLifecycleScope());
        p5b p5bVar2 = r1().h;
        ltb ltbVarD = requireActivity().d();
        g19 viewLifecycleOwner = getViewLifecycleOwner();
        v09 viewLifecycleScope = getViewLifecycleScope();
        ev evVar = new ev(p5bVar2, 0 == true ? 1 : 0, 10);
        ltbVarD.a(viewLifecycleOwner, evVar);
        e9i.j0(new fz6(p5bVar2.b, new qz9(evVar, lq4Var, 11), i), viewLifecycleScope);
        e9i.j0(new fz6(n1g.v(r1().h.b, getViewLifecycleOwner().f(), n09Var), new ul1(lq4Var, this, i2), i), getViewLifecycleScope());
        o1().setAdapter(this.v);
        o1().setOffscreenPageLimit(1);
        o1().e(this.A);
        aac aacVar = (aac) this.p.m(this, D[2]);
        y8j y8jVarO1 = o1();
        b1k b1kVar = this.u;
        b1kVar.getClass();
        fwg fwgVar = new fwg(aacVar, y8jVarO1, new hu(b1kVar, i, aacVar));
        fwgVar.c();
        this.w = fwgVar;
    }

    public final boolean p1() {
        return ((Number) ((e5d) this.g.getValue()).h().i()).longValue() > 0;
    }

    public final rcc q1() {
        return (rcc) this.o.m(this, D[1]);
    }

    public final vl1 r1() {
        return (vl1) this.e.getValue();
    }

    public final void s1(int i) {
        yl1 yl1Var;
        String str;
        zl1 zl1Var = (zl1) ww3.u1(i, ((k92) r1().l.getValue()).a);
        if (zl1Var == null || (yl1Var = zl1Var.c) == this.y) {
            return;
        }
        this.y = yl1Var;
        ae9 ae9Var = (ae9) ((xl1) this.h.getValue()).a.getValue();
        ul9 ul9Var = new ul9();
        int i2 = wl1.$EnumSwitchMapping$0[yl1Var.ordinal()];
        if (i2 == 1) {
            str = "all";
        } else {
            if (i2 != 2) {
                ore.o();
                return;
            }
            str = "missed";
        }
        ul9Var.put("filterType", str);
        ae9Var.g("OPEN_CALL_HISTORY", ul9Var.b());
    }

    public final void t1(boolean z) {
        if (q1().b()) {
            return;
        }
        if (z) {
            q1().setRightActions(new ccc(2, new rl1(this, 0)));
        } else {
            q1().setRightActions(ybc.a);
        }
    }

    public final void u1(k92 k92Var) {
        float f;
        float f2;
        boolean zIsEmpty = k92Var.a.isEmpty();
        int i = 0;
        boolean z = !zIsEmpty || getContext().getResources().getConfiguration().orientation == 2;
        zv8[] zv8VarArr = D;
        ViewGroup.LayoutParams layoutParams = ((rw3) this.s.m(this, zv8VarArr[5])).getLayoutParams();
        pq pqVar = layoutParams instanceof pq ? (pq) layoutParams : null;
        if (pqVar != null) {
            pqVar.a = z ? this.B : 0;
        }
        boolean z2 = requireView().findViewById(R.id.call_history_empty) != null;
        j8e j8eVar = this.t;
        if (!zIsEmpty) {
            if (z2) {
                ((r1c) j8eVar.m(this, zv8VarArr[6])).setVisibility(8);
                return;
            }
            return;
        }
        if (!z2) {
            zv8 zv8Var = zv8VarArr[0];
            j8e j8eVar2 = this.n;
            ((et4) j8eVar2.m(this, zv8Var)).setClipChildren(false);
            et4 et4Var = (et4) j8eVar2.m(this, zv8VarArr[0]);
            r1c r1cVar = new r1c(getContext());
            r1cVar.setId(R.id.call_history_empty);
            bt4 bt4Var = new bt4(-1, -1);
            bt4Var.b(new AppBarLayout$ScrollingViewBehavior());
            r1cVar.setLayoutParams(bt4Var);
            r1cVar.setIcon(R.drawable.icon_call_fill);
            r1cVar.setTitle(new tnh(R.string.call_history_call_history_empty_title));
            r1cVar.setSubtitle(new tnh(R.string.call_history_call_history_empty_subtitle));
            r1cVar.f(r1cVar.getContext().getString(R.string.call_history_call_contact_action), new sl1(i));
            r1cVar.setVisibility(8);
            if (yl5.e(r1cVar.getContext())) {
                f = yl5.d().getDisplayMetrics().density;
                f2 = 80.0f;
            } else {
                f = yl5.d().getDisplayMetrics().density;
                f2 = 150.0f;
            }
            r1cVar.setBlurPadding(gm0.K(f2 * f) * 2);
            n7j.a(et4Var, r1cVar, -1);
        }
        ((r1c) j8eVar.m(this, zv8VarArr[6])).setVisibility(0);
    }

    public CallHistoryScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
