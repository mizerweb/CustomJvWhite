package one.me.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.a4c;
import defpackage.a8g;
import defpackage.bdj;
import defpackage.bl9;
import defpackage.br4;
import defpackage.ca2;
import defpackage.ch3;
import defpackage.cl9;
import defpackage.cqk;
import defpackage.d4f;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.ei3;
import defpackage.f5d;
import defpackage.fl9;
import defpackage.fz6;
import defpackage.g21;
import defpackage.gl9;
import defpackage.gm0;
import defpackage.gr4;
import defpackage.ha9;
import defpackage.hm3;
import defpackage.hr4;
import defpackage.hve;
import defpackage.ia8;
import defpackage.ifh;
import defpackage.j68;
import defpackage.j8e;
import defpackage.je9;
import defpackage.jz;
import defpackage.ka8;
import defpackage.kc9;
import defpackage.kl9;
import defpackage.km3;
import defpackage.ks6;
import defpackage.lq4;
import defpackage.lve;
import defpackage.n09;
import defpackage.n1g;
import defpackage.np4;
import defpackage.ny8;
import defpackage.o83;
import defpackage.owh;
import defpackage.p3c;
import defpackage.pk9;
import defpackage.pq3;
import defpackage.pte;
import defpackage.pzf;
import defpackage.q1f;
import defpackage.qrc;
import defpackage.qv1;
import defpackage.qyj;
import defpackage.r8e;
import defpackage.rx8;
import defpackage.rxb;
import defpackage.t3f;
import defpackage.tbb;
import defpackage.tl5;
import defpackage.tre;
import defpackage.txb;
import defpackage.u03;
import defpackage.ubf;
import defpackage.ufe;
import defpackage.uk9;
import defpackage.ul5;
import defpackage.v65;
import defpackage.vk9;
import defpackage.wk9;
import defpackage.wo6;
import defpackage.ww3;
import defpackage.wz6;
import defpackage.xq4;
import defpackage.y3f;
import defpackage.yab;
import defpackage.yk9;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zk9;
import defpackage.zo5;
import defpackage.zv8;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.calllist.ui.CallHistoryScreen;
import one.me.chats.tab.ChatsTabWidget;
import one.me.contactlist.ContactListWidget;
import one.me.sdk.arch.Widget;
import one.me.settings.SettingsListScreen;
import one.me.webapp.rootscreen.WebAppRootScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u000b\fB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\n¨\u0006\r"}, d2 = {"Lone/me/main/MainScreen;", "Lone/me/sdk/arch/Widget;", "Lubf;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "", "route", "routeArgs", "(Ljava/lang/String;Landroid/os/Bundle;)V", "vk9", "a8g", "main-screen"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MainScreen extends Widget implements ubf {
    public final t3f a;
    public final ca2 b;
    public final ny8 c;
    public final ny8 d;
    public final ha9 e;
    public final u03 f;
    public final ny8 g;
    public final ny8 h;
    public final ks6 i;
    public final LinkedHashMap j;
    public final j8e k;
    public final j8e l;
    public final j8e m;
    public final ny8 n;
    public final ifh o;
    public ul5 p;
    public final p3c q;
    public bdj r;
    public final ny8 s;
    public final String t;
    public static final /* synthetic */ zv8[] v = {new dwd(MainScreen.class, "rootView", "getRootView()Landroid/widget/FrameLayout;", 0), zo5.f(zfe.a, MainScreen.class, "bottomBarView", "getBottomBarView()Lone/me/common/bottombar/OneMeBottomBarView;", 0), new dwd(MainScreen.class, "bottomActionBarView", "getBottomActionBarView()Lone/me/common/bottombar/OneMeBottomBarView;", 0), new z8b(MainScreen.class, "digitalIdShowOnboardingJob", "getDigitalIdShowOnboardingJob()Lkotlinx/coroutines/Job;")};
    public static final a8g u = new a8g(19);
    public static final pzf w = e9i.b(0, 1, 4);

    public MainScreen(Bundle bundle) {
        super(bundle);
        this.a = new t3f("main_screen_scope", super.getC().b());
        ca2 ca2Var = new ca2(m35getAccountScopeuqN4xOY());
        this.b = ca2Var;
        this.c = ca2Var.getAccessor().d(54);
        this.d = ca2Var.getAccessor().d(174);
        this.e = (ha9) ca2Var.getAccessor().c(30);
        this.f = (u03) ca2Var.getAccessor().c(19);
        this.g = createViewModelLazy(kl9.class, new ei3(11, new uk9(this, 0)));
        this.h = createViewModelLazy(km3.class, new ei3(12, new j68(7)));
        this.i = tre.E(this, new fl9(0, this, MainScreen.class, "getCurrentScreen", "getCurrentScreen()Lone/me/sdk/statistics/screen/Screen;", 0, 0), new fl9(0, this, MainScreen.class, "getCurrentParams", "getCurrentParams()Lone/me/sdk/statistics/params/Params;", 0, 1));
        this.j = new LinkedHashMap();
        this.k = viewBinding(R.id.oneme_main_root);
        this.l = viewBinding(R.id.oneme_main_bottom_bar);
        this.m = viewBinding(R.id.oneme_main_bottom_action_bar);
        this.n = rx8.P(3, new j68(8));
        this.o = new ifh(new uk9(this, 1));
        this.q = qyj.S();
        this.s = rx8.P(3, new uk9(this, 2));
        this.t = MainScreen.class.getName();
        setRetainViewMode(xq4.b);
    }

    public static final txb o1(MainScreen mainScreen) {
        return (txb) mainScreen.m.m(mainScreen, v[2]);
    }

    public static final txb p1(MainScreen mainScreen) {
        return (txb) mainScreen.l.m(mainScreen, v[1]);
    }

    public static final boolean q1(MainScreen mainScreen) {
        br4 parentController = mainScreen;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
        hve hveVarU1 = rootController != null ? rootController.u1() : null;
        if (hveVarU1 != null && hveVarU1.a.a.size() != 0) {
            return false;
        }
        br4 parentController2 = mainScreen;
        while (parentController2.getParentController() != null) {
            parentController2 = parentController2.getParentController();
        }
        RootController rootController2 = parentController2 instanceof RootController ? (RootController) parentController2 : null;
        hve hveVarW1 = rootController2 != null ? rootController2.w1() : null;
        return (!((hveVarW1 != null ? rx8.C(hveVarW1) : null) instanceof MainScreen) || ((hm3) mainScreen.u1().e.a.getValue()).a || ((rxb) mainScreen.y1().i.a.getValue()).e == kl9.w.e) ? false : true;
    }

    public static final void r1(MainScreen mainScreen, boolean z) {
        if (mainScreen.getView() != null) {
            if (z) {
                txb.d(p1(mainScreen), new gl9(mainScreen, 0), 3);
            } else if (o1(mainScreen).getVisibility() == 0) {
                txb.d(o1(mainScreen), new gl9(mainScreen, 1), 7);
            }
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScopeId, reason: from getter */
    public final t3f getC() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.i;
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        w.a(Boolean.TRUE);
    }

    @Override // defpackage.br4
    public final void onChangeEnded(gr4 gr4Var, hr4 hr4Var) {
        lve lveVar;
        lve lveVar2;
        super.onChangeEnded(gr4Var, hr4Var);
        if (isBeingDestroyed() || isDestroyed() || !hr4Var.b) {
            return;
        }
        hve router = getRouter();
        if (cqk.d((router == null || (lveVar2 = (lve) ww3.D1(router.e())) == null) ? null : lveVar2.a, this)) {
            hve hveVarV1 = v1();
            br4 br4Var = (hveVarV1 == null || (lveVar = (lve) ww3.D1(hveVarV1.e())) == null) ? null : lveVar.a;
            pte pteVar = br4Var instanceof pte ? (pte) br4Var : null;
            if (pteVar != null) {
                pteVar.k0();
            }
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onChangeStarted(gr4 gr4Var, hr4 hr4Var) {
        lve lveVar;
        lve lveVar2;
        super.onChangeStarted(gr4Var, hr4Var);
        if (hr4Var == hr4.d && isBeingDestroyed()) {
            tbb.g((tbb) this.b.getAccessor().d(231).getValue(), y3f.APPLICATION_BACKGROUND);
        }
        if (isBeingDestroyed() || isDestroyed()) {
            return;
        }
        hve router = getRouter();
        if (cqk.d((router == null || (lveVar2 = (lve) ww3.D1(router.e())) == null) ? null : lveVar2.a, this)) {
            return;
        }
        hve hveVarV1 = v1();
        br4 br4Var = (hveVarV1 == null || (lveVar = (lve) ww3.D1(hveVarV1.e())) == null) ? null : lveVar.a;
        pte pteVar = br4Var instanceof pte ? (pte) br4Var : null;
        if (pteVar != null) {
            pteVar.b();
        }
        ul5 ul5Var = this.p;
        if (ul5Var != null) {
            ul5Var.b(false);
        }
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        je9 je9Var = je9.d;
        u03 u03Var = this.f;
        u03Var.getClass();
        u03Var.C(null, q1f.b);
        String str = this.t;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, qv1.k("locale info: ", getContext().getResources().getConfiguration().getLocales().toLanguageTags()), null);
        }
        String str2 = this.t;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, qv1.k("locale info: ", kc9.b(getContext())), null);
        }
        vk9 vk9Var = new vk9(this, getContext());
        vk9Var.setId(R.id.oneme_main_root);
        vk9Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        txb txbVar = new txb(vk9Var.getContext());
        txbVar.setId(R.id.oneme_main_bottom_bar);
        txbVar.setElevation(yl5.d().getDisplayMetrics().density * 8.0f);
        ch3.o(txbVar.getContext().getApplicationContext());
        Boolean bool = Boolean.FALSE;
        txbVar.setBlurEnabled(bool);
        txb txbVar2 = new txb(vk9Var.getContext());
        txbVar2.setId(R.id.oneme_main_bottom_action_bar);
        txbVar2.setElevation(yl5.d().getDisplayMetrics().density * 8.0f);
        ch3.o(txbVar2.getContext().getApplicationContext());
        txbVar2.setBlurEnabled(bool);
        txbVar2.setAlpha(0.0f);
        txbVar2.setVisibility(8);
        pq3 pq3VarE = pq3.j.e(vk9Var.getContext());
        e9i.j0(new fz6((r8e) pq3VarE.h, new o83(this, vk9Var, pq3VarE, (lq4) null), 3), getViewLifecycleScope());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        vk9Var.addView(txbVar, layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 80;
        vk9Var.addView(txbVar2, layoutParams2);
        return vk9Var;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        String str = this.t;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onDestroyView()", null);
            }
        }
        ul5 ul5Var = this.p;
        if (ul5Var != null) {
            ul5Var.b(false);
        }
        this.p = null;
        if (((f5d) x1()).t()) {
            br4 parentController = this;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
            hve hveVarU1 = rootController != null ? rootController.u1() : null;
            if (hveVarU1 != null) {
                hveVarU1.M((wk9) this.s.getValue());
            }
        }
        if (((f5d) x1()).p()) {
            g21.a((g21) this.n.getValue());
        }
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            t1((rxb) ((ylc) it.next()).a);
        }
        this.j.clear();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onRestoreInstanceState(Bundle bundle) {
        Object next;
        super.onRestoreInstanceState(bundle);
        String string = bundle.getString("main:selected_tag");
        String str = this.t;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, qv1.k("onRestoreInstanceState, selectedTag=", string), null);
            }
        }
        if (string != null) {
            kl9 kl9VarY1 = y1();
            Iterator it = ((Iterable) kl9VarY1.g.a.getValue()).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((rxb) next).d.equals(string));
            rxb rxbVar = (rxb) next;
            if (rxbVar == null) {
                gm0.Y(kl9.class.getName(), "Early return in selectByTag cuz of buttons.find { it.tag == selectedTag } is null");
            } else {
                yab.i0(kl9VarY1.b, null, 0, new wz6(kl9VarY1, rxbVar, null, null, 11), 3);
            }
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String str = ((rxb) y1().i.a.getValue()).d;
        String str2 = this.t;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, "onSaveInstanceState, selectedTag=".concat(str), null);
            }
        }
        bundle.putString("main:selected_tag", str);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onUpdateArgs(Bundle bundle, Bundle bundle2) {
        super.onUpdateArgs(bundle, bundle2);
        rxb rxbVar = (rxb) y1().i.a.getValue();
        hve hveVarV1 = v1();
        br4 br4VarG = hveVarV1 != null ? hveVarV1.g(rxbVar.d) : null;
        Widget widget = br4VarG instanceof Widget ? (Widget) br4VarG : null;
        if (widget != null) {
            widget.onUpdateArgs(bundle, bundle2);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        u03 u03Var = this.f;
        ufe ufeVar = new ufe();
        r8e r8eVar = y1().g;
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(r8eVar, getViewLifecycleOwner().f(), n09Var), new cl9((lq4) null, this, ufeVar), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(y1().t, getViewLifecycleOwner().f(), n09Var), new bl9(null, this, 1), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(y1().l, getViewLifecycleOwner().f(), n09Var), new bl9(null, this, 2), 3), getViewLifecycleScope());
        if (((f5d) x1()).p()) {
            e9i.j0(new fz6(n1g.v(u1().e, getViewLifecycleOwner().f(), n09Var), new bl9(null, this, 3), 3), getViewLifecycleScope());
            e9i.j0(new fz6(n1g.v(new jz(u1().f, 16), getViewLifecycleOwner().f(), n09Var), new bl9(null, this, 4), 3), getViewLifecycleScope());
        }
        e9i.j0(new fz6(n1g.v(y1().r, getViewLifecycleOwner().f(), n09Var), new bl9(null, this, 5), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(y1().v, getViewLifecycleOwner().f(), n09Var), new cl9((lq4) null, ufeVar, this), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(y1().n, getViewLifecycleOwner().f(), n09Var), new bl9(null, this, 6), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(y1().p, getViewLifecycleOwner().f(), n09Var), new bl9(null, this, 7), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(y1().i, getViewLifecycleOwner().f(), n09Var), new bl9(null, this, 0), 3), getViewLifecycleScope());
        if (((f5d) x1()).t()) {
            br4 parentController = this;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
            hve hveVarU1 = rootController != null ? rootController.u1() : null;
            if (hveVarU1 != null) {
                hveVarU1.a((wk9) this.s.getValue());
            }
            this.p = new ul5(p1(this), (ViewGroup) view, (tl5) this.o.getValue(), new yk9(this, 0), this.b.getAccessor().d(738), this.b.getAccessor().d(157), getViewLifecycleScope(), getViewLifecycleOwner());
        }
        view.addOnAttachStateChangeListener(new zk9(this, view, 0));
        String str = u03Var.g;
        owh owhVar = str != null ? new owh(str) : null;
        String str2 = owhVar != null ? owhVar.a : null;
        if (str2 != null) {
            qrc.k(u03.i, "main_screen_created", 1, str2, false, null, null, 120);
            return;
        }
        String str3 = u03Var.b;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str3, "Invoked 'onMainScreenCreated', but traceId is null or empty!", null);
        }
    }

    public final Widget s1(rxb rxbVar) {
        Widget settingsListScreen;
        y3f y3fVar;
        String strQ;
        String str = rxbVar.d;
        pk9.c.getClass();
        boolean zEquals = str.equals(v65.a(pk9.d.a));
        t3f t3fVar = this.a;
        if (zEquals) {
            long jD = ((f5d) x1()).d();
            Integer num = rxbVar.a;
            if (num != null) {
                strQ = np4.q(getContext(), num.intValue());
            } else {
                strQ = null;
            }
            String string = getArgs().getString("start_param");
            String string2 = getArgs().getString("source_id");
            Long lValueOf = string2 != null ? Long.valueOf(Long.parseLong(string2)) : null;
            int i = getArgs().getInt("request_code", 0);
            bdj bdjVar = this.r;
            if (bdjVar == null) {
                bdjVar = bdj.BOTTOMBAR;
            }
            settingsListScreen = new WebAppRootScreen(jD, bdjVar, lValueOf, string, true, true, strQ, i, t3fVar.b());
            this.r = null;
            y3fVar = y3f.MINIAPP;
        } else if (str.equals(v65.a(pk9.e.a))) {
            settingsListScreen = new ContactListWidget(t3fVar.b());
            y3fVar = y3f.CONTACTS_TAB;
        } else if (str.equals(v65.a(pk9.f.a))) {
            settingsListScreen = new CallHistoryScreen(t3fVar.b());
            y3fVar = y3f.CALL_HISTORY_TAB;
        } else if (str.equals(v65.a(pk9.g.a))) {
            settingsListScreen = new ChatsTabWidget(getArgs().getString("folder_id"), t3fVar.b(), t3fVar);
            y3fVar = y3f.CHATS_LIST_TAB;
        } else {
            if (!str.equals(v65.a(pk9.h.a))) {
                throw new IllegalStateException("invalid screen! ".concat(rxbVar.d).toString());
            }
            settingsListScreen = new SettingsListScreen(t3fVar.b());
            y3fVar = y3f.SETTINGS_TAB;
        }
        settingsListScreen.addLifecycleListener(new ka8(y3fVar, 0, (ia8) this.b.getAccessor().f()));
        settingsListScreen.setRetainViewMode(xq4.b);
        return settingsListScreen;
    }

    public final void t1(rxb rxbVar) {
        ViewGroup viewGroup;
        String str = this.t;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "MainScreenTab.detach(), tag=".concat(rxbVar.d), null);
            }
        }
        ylc ylcVar = (ylc) this.j.get(rxbVar.d);
        if (ylcVar == null || (viewGroup = (ViewGroup) ylcVar.b) == null) {
            return;
        }
        hve childRouter = getChildRouter(viewGroup, rxbVar.d, false);
        if (childRouter != null) {
            childRouter.H();
        }
        ((FrameLayout) this.k.m(this, v[0])).removeView(viewGroup);
    }

    public final km3 u1() {
        return (km3) this.h.getValue();
    }

    public final hve v1() {
        ViewGroup viewGroup;
        if (isDestroyed() || isBeingDestroyed()) {
            return null;
        }
        rxb rxbVar = (rxb) y1().i.a.getValue();
        ylc ylcVar = (ylc) this.j.get(rxbVar.d);
        if (ylcVar == null || (viewGroup = (ViewGroup) ylcVar.b) == null) {
            return null;
        }
        return getChildRouter(viewGroup, rxbVar.d);
    }

    public final y3f w1() {
        int i = ((rxb) y1().i.a.getValue()).c;
        if (i == R.id.oneme_main_max_id_container) {
            return y3f.MINIAPP;
        }
        if (i == R.id.oneme_main_contacts_container) {
            return y3f.CONTACTS_TAB;
        }
        if (i == R.id.oneme_main_calls_container) {
            return y3f.CALL_HISTORY_TAB;
        }
        return i == R.id.oneme_main_settings_container ? y3f.SETTINGS_TAB : y3f.CHATS_LIST_TAB;
    }

    public final wo6 x1() {
        return (wo6) this.c.getValue();
    }

    public final kl9 y1() {
        return (kl9) this.g.getValue();
    }

    @Override // defpackage.ubf
    public final Object z0(lq4 lq4Var) {
        hve hveVarV1 = v1();
        br4 br4VarI = hveVarV1 != null ? rx8.I(hveVarV1) : null;
        ubf ubfVar = br4VarI instanceof ubf ? (ubf) br4VarI : null;
        return ubfVar == null ? Boolean.FALSE : ubfVar.z0(lq4Var);
    }

    public final void z1(rxb rxbVar, Bundle bundle) {
        String str = this.t;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "handleClick, selected item=" + rxbVar + ", has args=" + (bundle != null ? Boolean.valueOf(!bundle.isEmpty()) : null), null);
            }
        }
        ul5 ul5Var = this.p;
        if (ul5Var != null && ul5Var.h() && rxbVar.e == kl9.w.e) {
            ul5Var.b(true);
            ((tl5) ul5Var.a).f();
        }
        kl9 kl9VarY1 = y1();
        yab.i0(kl9VarY1.b, null, 0, new wz6(kl9VarY1, rxbVar, bundle, null, 11), 3);
    }

    public MainScreen(String str, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("main:arg:deep_link", str);
        bundle2.putAll(bundle);
        this(bundle2);
    }
}
