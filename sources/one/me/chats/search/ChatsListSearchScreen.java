package one.me.chats.search;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.a8j;
import defpackage.acc;
import defpackage.ae9;
import defpackage.aj3;
import defpackage.ak3;
import defpackage.be3;
import defpackage.bj3;
import defpackage.c8f;
import defpackage.ca2;
import defpackage.cj3;
import defpackage.d4f;
import defpackage.d8f;
import defpackage.dj3;
import defpackage.dq4;
import defpackage.due;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.ej3;
import defpackage.em3;
import defpackage.fj3;
import defpackage.fk3;
import defpackage.fz6;
import defpackage.g8c;
import defpackage.g8f;
import defpackage.gcc;
import defpackage.gl1;
import defpackage.gm8;
import defpackage.gr4;
import defpackage.h47;
import defpackage.h8c;
import defpackage.ha9;
import defpackage.hcc;
import defpackage.hr4;
import defpackage.i19;
import defpackage.i7c;
import defpackage.ifh;
import defpackage.j7c;
import defpackage.j8e;
import defpackage.jed;
import defpackage.jj3;
import defpackage.jsc;
import defpackage.k23;
import defpackage.k96;
import defpackage.kcc;
import defpackage.khb;
import defpackage.kj1;
import defpackage.kp0;
import defpackage.ks6;
import defpackage.lp0;
import defpackage.lq4;
import defpackage.lvb;
import defpackage.mc4;
import defpackage.mj3;
import defpackage.ml9;
import defpackage.n;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.nee;
import defpackage.nj3;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.ore;
import defpackage.p3c;
import defpackage.p4c;
import defpackage.p90;
import defpackage.pb7;
import defpackage.pj3;
import defpackage.q84;
import defpackage.qh1;
import defpackage.qq2;
import defpackage.qt4;
import defpackage.qyj;
import defpackage.r07;
import defpackage.r66;
import defpackage.r84;
import defpackage.r9f;
import defpackage.rcc;
import defpackage.rj3;
import defpackage.rj5;
import defpackage.s66;
import defpackage.sgg;
import defpackage.sja;
import defpackage.sn7;
import defpackage.svj;
import defpackage.t7c;
import defpackage.tc;
import defpackage.tre;
import defpackage.ud9;
import defpackage.um4;
import defpackage.v8;
import defpackage.vm4;
import defpackage.vo8;
import defpackage.vp4;
import defpackage.vq;
import defpackage.vv;
import defpackage.w83;
import defpackage.w8c;
import defpackage.wi3;
import defpackage.wsc;
import defpackage.x83;
import defpackage.xme;
import defpackage.xt4;
import defpackage.y8;
import defpackage.y8f;
import defpackage.yab;
import defpackage.yi3;
import defpackage.ylc;
import defpackage.ynh;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zhb;
import defpackage.zj3;
import defpackage.zm3;
import defpackage.zo0;
import defpackage.zo5;
import defpackage.zpg;
import defpackage.zsj;
import defpackage.zt4;
import defpackage.zv8;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/chats/search/ChatsListSearchScreen;", "Lone/me/sdk/arch/Widget;", "Lvp4;", "Lmc4;", "Lv8;", "Lc8f;", "Lum4;", "Lpb7;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "chats-list"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ChatsListSearchScreen extends Widget implements vp4, mc4, v8, c8f, um4, pb7 {
    public static final /* synthetic */ zv8[] F = {new z8b(ChatsListSearchScreen.class, "selectedChatIdForAction", "getSelectedChatIdForAction()Ljava/lang/Long;"), zo5.e(zfe.a, ChatsListSearchScreen.class, "shouldRestoreFocus", "getShouldRestoreFocus()Z"), new dwd(ChatsListSearchScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new dwd(ChatsListSearchScreen.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), new z8b(ChatsListSearchScreen.class, "contextMenuJob", "getContextMenuJob()Lkotlinx/coroutines/Job;")};
    public final em3 A;
    public final r84 B;
    public final j8e C;
    public final p3c D;
    public g8c E;
    public final ca2 a;
    public final ca2 b;
    public final ks6 c;
    public final ny8 d;
    public final ifh e;
    public final oi8 f;
    public final vv g;
    public final vv h;
    public final j8e i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ExecutorService n;
    public final ny8 o;
    public final zsj p;
    public final vm4 q;
    public final h47 r;
    public final xme s;
    public final d8f t;
    public final zsj u;
    public final aj3 v;
    public final d8f w;
    public final qh1 x;
    public final qh1 y;
    public final lp0 z;

    public ChatsListSearchScreen(Bundle bundle) {
        super(bundle);
        ca2 ca2Var = new ca2(m35getAccountScopeuqN4xOY());
        this.a = ca2Var;
        this.b = new ca2(m35getAccountScopeuqN4xOY());
        this.c = tre.G(this, new kj1(0, this, ChatsListSearchScreen.class, "getCurrentScreen", "getCurrentScreen()Lone/me/sdk/statistics/screen/Screen;", 0, 12));
        this.d = ca2Var.getAccessor().d(231);
        this.e = new ifh(new wi3(this, 0));
        this.f = oi8.f;
        this.g = new vv(Long.class, null, "selected.chatId.Action");
        this.h = new vv(Boolean.class, Boolean.TRUE, "should.restore.focus");
        this.i = viewBinding(R.id.chats_list_search_toolbar);
        this.j = createViewModelLazy(fk3.class, new qq2(28, new wi3(this, 1)));
        this.k = createViewModelLazy(gm8.class, new qq2(29, new wi3(this, 2)));
        this.l = createViewModelLazy(y8.class, new fj3(0, new wi3(this, 3)));
        this.m = createViewModelLazy(zo0.class, new fj3(1, new wi3(this, 4)));
        ExecutorService executorServiceA = ca2Var.b().a();
        this.n = executorServiceA;
        this.o = ca2Var.c();
        zsj zsjVar = new zsj(this, executorServiceA, 1);
        this.p = zsjVar;
        vm4 vm4Var = new vm4(new yi3(this), executorServiceA);
        this.q = vm4Var;
        h47 h47Var = new h47(new ej3(this), executorServiceA, 10);
        this.r = h47Var;
        this.s = p90.M(new wi3(this, 5));
        d8f d8fVar = new d8f((j7c) ca2Var.getAccessor().c(751), (p4c) ca2Var.getAccessor().d(353).getValue(), this, executorServiceA);
        this.t = d8fVar;
        zsj zsjVar2 = new zsj(new due(this), executorServiceA, 3);
        this.u = zsjVar2;
        this.v = new aj3(0, this);
        d8f d8fVar2 = new d8f((j7c) ca2Var.getAccessor().c(751), (p4c) ca2Var.getAccessor().d(353).getValue(), this, executorServiceA);
        this.w = d8fVar2;
        qh1 qh1Var = new qh1(executorServiceA, 3);
        this.x = qh1Var;
        qh1 qh1Var2 = new qh1(executorServiceA, 2);
        this.y = qh1Var2;
        lp0 lp0Var = new lp0(this, (kp0) ca2Var.getAccessor().c(235), executorServiceA, 0);
        this.z = lp0Var;
        em3 em3Var = new em3();
        this.A = em3Var;
        this.B = new r84(new q84(false, 1), zsjVar, vm4Var, lp0Var, h47Var, d8fVar, zsjVar2, d8fVar2, em3Var, qh1Var, qh1Var2);
        this.C = viewBinding(R.id.chats_list_search_recycler_view);
        this.D = qyj.S();
    }

    public static final void o1(ChatsListSearchScreen chatsListSearchScreen, ynh ynhVar, ynh ynhVar2, Integer num) {
        CharSequence charSequenceB = ynhVar.b(chatsListSearchScreen.getContext());
        if (charSequenceB == null) {
            return;
        }
        g8c g8cVar = chatsListSearchScreen.E;
        if (g8cVar != null) {
            g8cVar.b();
        }
        h8c h8cVar = new h8c(chatsListSearchScreen);
        h8cVar.n(charSequenceB);
        h8cVar.a(ynhVar2);
        if (num != null) {
            h8cVar.h(new w8c(num.intValue()));
        }
        chatsListSearchScreen.E = h8cVar.p();
    }

    @Override // defpackage.um4
    public final void B(int i) {
        ((wsc) this.o.getValue()).m(new svj(this, 1), wsc.f, 156);
    }

    @Override // defpackage.vp4
    public final void E(int i, Bundle bundle) {
        zv8[] zv8VarArr = F;
        zv8 zv8Var = zv8VarArr[0];
        vv vvVar = this.g;
        Long l = (Long) vvVar.a(this);
        if (l != null) {
            long jLongValue = l.longValue();
            zv8 zv8Var2 = zv8VarArr[0];
            vvVar.b(this, null);
            fk3 fk3VarR1 = r1();
            a8j.t(fk3VarR1, ((n0c) fk3VarR1.g).a(), new zj3(i, jLongValue, fk3VarR1, null), 2);
        }
    }

    @Override // defpackage.pb7
    public final void M0(int i, int i2, Intent intent) {
        if (i == 101 && i2 == -1) {
            zv8 zv8Var = F[1];
            this.h.b(this, Boolean.FALSE);
        }
    }

    @Override // defpackage.v8
    public final void a0() {
        ml9.b(this);
        fk3 fk3VarR1 = r1();
        int i = i7c.b;
        dq4 dq4Var = fk3VarR1.b;
        xt4 xt4VarA = ((n0c) fk3VarR1.g).a();
        zt4 zt4Var = fk3VarR1.o1;
        xt4VarA.getClass();
        fk3VarR1.v1.B(fk3VarR1, fk3.y1[3], yab.h0(dq4Var, lvb.x0(xt4VarA, zt4Var), 2, new rj3(fk3VarR1, null, 1)));
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        fk3 fk3VarR1 = r1();
        if (i == R.id.oneme_contact_not_found_bottom_sheet_positive_button) {
            a8j.x(fk3VarR1.X, new g8f());
        } else {
            fk3VarR1.getClass();
        }
        if (bundle != null) {
            long j = bundle.getLong("selected.chatId.Action");
            fk3 fk3VarR2 = r1();
            a8j.t(fk3VarR2, ((n0c) fk3VarR2.g).a(), new zj3(i, j, fk3VarR2, null), 2);
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getB() {
        return this.f;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getU() {
        return this.c;
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        super.onAttach(view);
        jed jedVar = (jed) this.s.getValue();
        if (jedVar != null) {
            jedVar.d();
        }
    }

    @Override // defpackage.br4
    public final void onChangeEnded(gr4 gr4Var, hr4 hr4Var) {
        t7c searchView;
        super.onChangeEnded(gr4Var, hr4Var);
        Activity activity = getActivity();
        if (activity == null || activity.isDestroyed() || activity.isFinishing()) {
            return;
        }
        fk3 fk3VarR1 = r1();
        fk3VarR1.getClass();
        if (mj3.$EnumSwitchMapping$1[hr4Var.ordinal()] == 1) {
            a8j.t(fk3VarR1, lvb.x0(zhb.b, ((n0c) fk3VarR1.g).a()), new nj3(fk3VarR1, null, 1), 2);
        }
        zv8[] zv8VarArr = F;
        zv8 zv8Var = zv8VarArr[1];
        vv vvVar = this.h;
        boolean zBooleanValue = ((Boolean) vvVar.a(this)).booleanValue();
        zv8 zv8Var2 = zv8VarArr[1];
        vvVar.b(this, Boolean.TRUE);
        if (!hr4Var.b || !zBooleanValue || getView() == null || (searchView = ((rcc) this.i.m(this, zv8VarArr[2])).getSearchView()) == null) {
            return;
        }
        ml9.e((View) searchView.q.getValue());
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onChangeStarted(gr4 gr4Var, hr4 hr4Var) {
        super.onChangeStarted(gr4Var, hr4Var);
        if (hr4Var == hr4.d) {
            ml9.b(this);
            zv8 zv8Var = F[1];
            this.h.b(this, Boolean.FALSE);
        }
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(R.id.chats_list_search_root_view);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        n1g.N(new n(3, null, 4), linearLayout);
        rcc rccVar = new rcc(getContext());
        rccVar.setId(R.id.chats_list_search_toolbar);
        rccVar.setTransitionName(rccVar.getContext().getString(R.string.chat_list_toolbar_transition_name));
        rccVar.setForm(gcc.Main);
        rccVar.setRightActions(new acc(new kcc(new bj3(this, rccVar)), new hcc(R.drawable.icon_plus_mini, new w83(4)), null));
        rccVar.setTitle(R.string.chat_list_toolbar_title);
        t7c searchView = rccVar.getSearchView();
        if (searchView != null) {
            searchView.setSearchHint(searchView.getResources().getString(R.string.chats_list_search_hint));
            searchView.setCollapsible(false);
            searchView.setSearchText(((jj3) r1().F.a.getValue()).b);
            if (bundle != null) {
                searchView.setExpandWithAnimation(false);
                searchView.c(false);
            }
        }
        linearLayout.addView(rccVar);
        k96 k96Var = new k96(getContext());
        k96Var.setId(R.id.chats_list_search_recycler_view);
        k96Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        k96Var.getContext();
        k96Var.setLayoutManager(new LinearLayoutManager());
        k96Var.setItemAnimator(null);
        nee neeVar = this.B;
        k96Var.setAdapter(neeVar);
        k96Var.setHasFixedSize(true);
        k96Var.setIgnoreRefreshingFlagsForScrollEvent(true);
        k96Var.setPager(new gl1(this, 1));
        k96Var.setDelegate(this.A);
        zpg zpgVar = new zpg(k96Var, neeVar, new rj5(9, new tc(this, 23, k96Var)));
        k96Var.h(zpgVar, -1);
        n1g.N(new x83(zpgVar, null, 1), k96Var);
        jed jedVar = (jed) this.s.getValue();
        if (jedVar != null) {
            jedVar.e(k96Var);
            k96Var.k(jedVar);
        }
        linearLayout.addView(k96Var);
        return linearLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        this.E = null;
        this.s.b = khb.k;
        this.w.E(this.v);
        super.onDestroyView(view);
    }

    @Override // defpackage.br4
    public final void onDetach(View view) {
        r1().J();
        super.onDetach(view);
    }

    @Override // defpackage.vp4
    public final void onDismiss() {
        zv8[] zv8VarArr = F;
        zv8 zv8Var = zv8VarArr[0];
        this.g.b(this, null);
        vo8 vo8Var = (vo8) this.D.m(this, zv8VarArr[4]);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 156) {
            wsc wscVar = (wsc) this.o.getValue();
            svj svjVar = new svj(this, 1);
            String[] strArr2 = wsc.f;
            jsc jscVar = new jsc(R.drawable.contacts_avd);
            wscVar.getClass();
            wsc.u(svjVar, strArr, iArr, strArr2, R.string.permissions_contacts_request, R.string.permissions_contacts_request_denied, jscVar);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        this.w.C(this.v);
        r07 r07Var = new r07(r1().F, ((y8) this.l.getValue()).g, new ud9(3, (lq4) null, 12), 0);
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(r07Var, i19VarF, n09Var), new cj3(null, this, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new r07(((zo0) this.m.getValue()).i, r1().F, new dj3(3, 4, ChatsListSearchScreen.class, this, "combineSearchAndBanners", "combineSearchAndBanners(Ljava/util/List;Lone/me/chats/search/ChatsListSearchState;)Ljava/util/List;"), 0), getViewLifecycleOwner().f(), n09Var), new cj3(null, this, 1), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(q1().o, getViewLifecycleOwner().f(), n09Var), new cj3(null, this, 2), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(e9i.m0(r1().J, q1().m), getViewLifecycleOwner().f(), n09Var), new cj3(null, this, 3), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(e9i.m0(q1().l, r1().K), getViewLifecycleOwner().f(), n09Var), new cj3(null, this, 4), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(r1().X, getViewLifecycleOwner().f(), n09Var), new cj3(null, this, 5), 3), getViewLifecycleScope());
    }

    public final void p1() {
        this.q.H(null);
        h47 h47Var = this.r;
        r66 r66Var = r66.a;
        h47Var.H(r66Var);
        this.t.H(r66Var);
        this.u.H(r66Var);
    }

    public final gm8 q1() {
        return (gm8) this.k.getValue();
    }

    public final fk3 r1() {
        return (fk3) this.j.getValue();
    }

    public final void s1(y8f y8fVar) {
        ml9.b(this);
        int iD = qt4.D(y8fVar.a);
        if (iD == 0) {
            r1().H(y8fVar);
            fk3 fk3VarR1 = r1();
            a8j.t(fk3VarR1, ((n0c) fk3VarR1.g).b(), new pj3(2, y8fVar.getItemId(), fk3VarR1, null), 2);
            zm3.o(zm3.b, y8fVar.getItemId(), "local", null, null, null, null, 124);
            return;
        }
        if (iD == 1) {
            r1().H(y8fVar);
            zm3.o(zm3.b, y8fVar.getItemId(), "server", null, null, null, null, 124);
            return;
        }
        if (iD == 2) {
            fk3 fk3VarR2 = r1();
            fk3VarR2.getClass();
            yab.i0(fk3VarR2.b, ((n0c) fk3VarR2.g).a(), 0, new vq(fk3VarR2, y8fVar.getItemId(), y8fVar, (lq4) null, 15), 2);
            return;
        }
        if (iD == 3) {
            fk3 fk3VarR3 = r1();
            yab.i0(fk3VarR3.b, ((n0c) fk3VarR3.g).a(), 0, new ak3(fk3VarR3, (sn7) y8fVar, null, 1), 2);
            return;
        }
        if (iD == 4) {
            r1().H(y8fVar);
            sja sjaVar = (sja) y8fVar;
            if (sjaVar.f == null) {
                return;
            }
            yab.i0(getViewLifecycleScope(), null, 0, new k23(this, sjaVar, null, 17), 3);
            return;
        }
        if (iD != 5) {
            ore.o();
            return;
        }
        fk3 fk3VarR4 = r1();
        yab.i0(fk3VarR4.b, null, 0, new nj3(fk3VarR4, null, 2), 3);
        ((ae9) ((r9f) fk3VarR4.z.getValue()).a.getValue()).h("search_click_more_button", s66.a);
    }

    public final void t1(y8f y8fVar, View view) {
        if (y8fVar instanceof be3) {
            long j = ((be3) y8fVar).y;
            ml9.b(this);
            sgg sggVarI0 = yab.i0(getViewLifecycleScope(), null, 2, new vq(this, j, view, (lq4) null, 13), 1);
            this.D.B(this, F[4], sggVarI0);
        }
    }

    public final void u1() {
        if (getView() != null) {
            ((k96) this.C.m(this, F[3])).w0(0);
        }
    }

    public final void v1(boolean z) {
        if (getView() != null) {
            ((k96) this.C.m(this, F[3])).setRefreshingNext(z);
        }
    }

    public ChatsListSearchScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
