package one.me.profile.screens.joinrequests;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.a8j;
import defpackage.acc;
import defpackage.cf7;
import defpackage.ch8;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.er8;
import defpackage.ev;
import defpackage.fr8;
import defpackage.fz6;
import defpackage.gl1;
import defpackage.ha9;
import defpackage.hcc;
import defpackage.i19;
import defpackage.j6c;
import defpackage.j8e;
import defpackage.k96;
import defpackage.kcc;
import defpackage.l6c;
import defpackage.ltb;
import defpackage.mc4;
import defpackage.ml9;
import defpackage.mr8;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.nbh;
import defpackage.nr8;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.p7c;
import defpackage.qb3;
import defpackage.qq8;
import defpackage.r1c;
import defpackage.r6c;
import defpackage.r8e;
import defpackage.rcc;
import defpackage.rx8;
import defpackage.sgg;
import defpackage.sr8;
import defpackage.t3f;
import defpackage.tnh;
import defpackage.vp4;
import defpackage.vv;
import defpackage.wbc;
import defpackage.wtc;
import defpackage.xhh;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.profile.screens.joinrequests.JoinRequestsScreen;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/profile/screens/joinrequests/JoinRequestsScreen;", "Lone/me/sdk/arch/Widget;", "Lp7c;", "Lvp4;", "Lmc4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "Lha9;", "localAccountId", "(JLha9;)V", "profile"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class JoinRequestsScreen extends Widget implements p7c, vp4, mc4 {
    public static final /* synthetic */ zv8[] k = {new dwd(JoinRequestsScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), zo5.f(zfe.a, JoinRequestsScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new dwd(JoinRequestsScreen.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), new dwd(JoinRequestsScreen.class, "loadingView", "getLoadingView()Landroid/widget/FrameLayout;", 0), new dwd(JoinRequestsScreen.class, "emptyView", "getEmptyView()Lone/me/sdk/uikit/common/emptyview/OneMeEmptyView;", 0)};
    public final oi8 a;
    public final vv b;
    public final t3f c;
    public final wtc d;
    public final ny8 e;
    public final j8e f;
    public final j8e g;
    public final j8e h;
    public final j8e i;
    public final ny8 j;

    public JoinRequestsScreen(Bundle bundle) {
        super(bundle);
        this.a = oi8.f;
        vv vvVar = new vv("profile:joinrequests:id", Long.class);
        this.b = vvVar;
        zv8 zv8Var = k[0];
        this.c = new t3f(nbh.s(((Number) vvVar.a(this)).longValue(), "profile:joinRequests:{", "}"), super.getB().b());
        this.d = new wtc(m35getAccountScopeuqN4xOY());
        this.e = createViewModelLazy(sr8.class, new ch8(5, new er8(this, 0)));
        this.f = viewBinding(R.id.profile_join_requests_toolbar);
        this.g = viewBinding(R.id.profile_join_requests_list);
        this.h = viewBinding(R.id.profile_join_requests_loading);
        this.i = viewBinding(R.id.profile_join_requests_empty);
        this.j = rx8.P(3, new er8(this, 1));
    }

    @Override // defpackage.vp4
    public final void E(int i, Bundle bundle) {
        if (i == 10001) {
            sr8 sr8VarQ1 = q1();
            sr8VarQ1.getClass();
            a8j.t(sr8VarQ1, null, new nr8(sr8VarQ1, null, 0), 3);
        } else {
            if (i != 10002) {
                return;
            }
            sr8 sr8VarQ2 = q1();
            sr8VarQ2.getClass();
            a8j.t(sr8VarQ2, null, new nr8(sr8VarQ2, null, 1), 3);
        }
    }

    @Override // defpackage.p7c
    public final void E0(CharSequence charSequence) {
        q1().d.e(charSequence != null ? charSequence.toString() : null);
    }

    @Override // defpackage.p7c
    public final void X() {
        q1().d.e(null);
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        sr8 sr8VarQ1 = q1();
        if (i == R.id.profile_join_request_screen_reject_dialog_button) {
            sgg sggVar = sr8VarQ1.l;
            if (sggVar == null || !sggVar.isActive()) {
                sr8VarQ1.l = a8j.t(sr8VarQ1, ((n0c) ((xhh) sr8VarQ1.f.getValue())).b(), new mr8(sr8VarQ1, null, 2), 2);
                return;
            }
            return;
        }
        if (i != R.id.profile_join_request_screen_confirm_dialog_button) {
            sr8VarQ1.getClass();
            return;
        }
        sgg sggVar2 = sr8VarQ1.m;
        if (sggVar2 == null || !sggVar2.isActive()) {
            sr8VarQ1.m = a8j.t(sr8VarQ1, ((n0c) ((xhh) sr8VarQ1.f.getValue())).b(), new mr8(sr8VarQ1, null, 0), 2);
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getB() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScopeId, reason: from getter */
    public final t3f getB() {
        return this.c;
    }

    @Override // defpackage.p7c
    public final void o() {
        q1().d.e(null);
    }

    public final r1c o1() {
        return (r1c) this.i.m(this, k[4]);
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        super.onAttach(view);
        q1().d.g();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        final int i = 1;
        linearLayout.setOrientation(1);
        rcc rccVar = new rcc(getContext());
        rccVar.setId(R.id.profile_join_requests_toolbar);
        final int i2 = 0;
        rccVar.setLeftActions(new wbc(new cf7(this) { // from class: dr8
            public final /* synthetic */ JoinRequestsScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                int i3 = i2;
                sbi sbiVar = sbi.a;
                JoinRequestsScreen joinRequestsScreen = this.b;
                View view = (View) obj;
                switch (i3) {
                    case 0:
                        zv8[] zv8VarArr = JoinRequestsScreen.k;
                        j8e j8eVar = joinRequestsScreen.f;
                        zv8[] zv8VarArr2 = JoinRequestsScreen.k;
                        if (!((rcc) j8eVar.m(joinRequestsScreen, zv8VarArr2[1])).l()) {
                            joinRequestsScreen.getRouter().D();
                        } else {
                            t7c searchView = ((rcc) j8eVar.m(joinRequestsScreen, zv8VarArr2[1])).getSearchView();
                            if (searchView != null) {
                                searchView.b();
                            }
                        }
                        break;
                    default:
                        zv8[] zv8VarArr3 = JoinRequestsScreen.k;
                        opl.b(joinRequestsScreen, 1).f(view).l(xw3.P0(new rp4(10001, new tnh(R.string.join_requests_approve_all), (Integer) null, (Integer) null, 28), new rp4(10002, new tnh(R.string.join_requests_reject_all), (Integer) null, (Integer) null, 28))).b().build().u(joinRequestsScreen);
                        break;
                }
                return sbiVar;
            }
        }));
        rccVar.setRightActions(new acc(new kcc(this), new hcc(R.drawable.icon_dots_vertical, new cf7(this) { // from class: dr8
            public final /* synthetic */ JoinRequestsScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                int i3 = i;
                sbi sbiVar = sbi.a;
                JoinRequestsScreen joinRequestsScreen = this.b;
                View view = (View) obj;
                switch (i3) {
                    case 0:
                        zv8[] zv8VarArr = JoinRequestsScreen.k;
                        j8e j8eVar = joinRequestsScreen.f;
                        zv8[] zv8VarArr2 = JoinRequestsScreen.k;
                        if (!((rcc) j8eVar.m(joinRequestsScreen, zv8VarArr2[1])).l()) {
                            joinRequestsScreen.getRouter().D();
                        } else {
                            t7c searchView = ((rcc) j8eVar.m(joinRequestsScreen, zv8VarArr2[1])).getSearchView();
                            if (searchView != null) {
                                searchView.b();
                            }
                        }
                        break;
                    default:
                        zv8[] zv8VarArr3 = JoinRequestsScreen.k;
                        opl.b(joinRequestsScreen, 1).f(view).l(xw3.P0(new rp4(10001, new tnh(R.string.join_requests_approve_all), (Integer) null, (Integer) null, 28), new rp4(10002, new tnh(R.string.join_requests_reject_all), (Integer) null, (Integer) null, 28))).b().build().u(joinRequestsScreen);
                        break;
                }
                return sbiVar;
            }
        }), null));
        linearLayout.addView(rccVar);
        FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        k96 k96Var = new k96(getContext());
        k96Var.setId(R.id.profile_join_requests_list);
        k96Var.getContext();
        k96Var.setLayoutManager(new LinearLayoutManager());
        k96Var.setAdapter((qq8) this.j.getValue());
        k96Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        k96Var.setItemAnimator(null);
        k96Var.setClipToPadding(false);
        k96Var.setPager(new gl1(this, 3));
        k96Var.setThreshold(10);
        k96Var.setIgnoreRefreshingFlagsForScrollEvent(true);
        frameLayout.addView(k96Var);
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setId(R.id.profile_join_requests_loading);
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout2.setVisibility(8);
        n1g.N(new qb3(3, null, 4), frameLayout2);
        r6c r6cVar = new r6c(frameLayout2.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        r6cVar.setLayoutParams(layoutParams);
        r6cVar.setAppearance(j6c.a);
        r6cVar.setSize(l6c.a);
        frameLayout2.addView(r6cVar);
        frameLayout.addView(frameLayout2);
        r1c r1cVar = new r1c(getContext());
        r1cVar.setId(R.id.profile_join_requests_empty);
        r1cVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        r1cVar.setVisibility(8);
        r1cVar.setIcon(R.drawable.icon_users_add);
        r1cVar.setTitle(new tnh(R.string.join_requests_empty_title));
        frameLayout.addView(r1cVar);
        linearLayout.addView(frameLayout);
        return linearLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        p1().setAdapter(null);
        ml9.b(this);
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        r8e r8eVar = q1().o;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new fr8(null, this, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(q1().q, getViewLifecycleOwner().f(), n09Var), new fr8(null, this, 1), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(q1().r, getViewLifecycleOwner().f(), n09Var), new fr8(null, this, 2), 3), getViewLifecycleScope());
        ltb ltbVarH = getRouter().h();
        if (ltbVarH != null) {
            ltbVarH.a(getViewLifecycleOwner(), new ev(8, this));
        }
    }

    public final k96 p1() {
        return (k96) this.g.m(this, k[2]);
    }

    public final sr8 q1() {
        return (sr8) this.e.getValue();
    }

    public JoinRequestsScreen(long j, ha9 ha9Var) {
        this(n1g.i(new ylc("profile:joinrequests:id", Long.valueOf(j)), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
