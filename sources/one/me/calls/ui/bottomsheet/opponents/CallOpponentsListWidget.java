package one.me.calls.ui.bottomsheet.opponents;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import defpackage.br1;
import defpackage.chb;
import defpackage.d4f;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.et4;
import defpackage.fz6;
import defpackage.ha9;
import defpackage.ht1;
import defpackage.i19;
import defpackage.ifh;
import defpackage.j11;
import defpackage.j8e;
import defpackage.ks6;
import defpackage.kt1;
import defpackage.ll6;
import defpackage.lq4;
import defpackage.ml9;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.oq1;
import defpackage.ot1;
import defpackage.p1c;
import defpackage.p3c;
import defpackage.pq3;
import defpackage.pt1;
import defpackage.q32;
import defpackage.qyj;
import defpackage.r;
import defpackage.r32;
import defpackage.r8e;
import defpackage.rcc;
import defpackage.rq;
import defpackage.rx8;
import defpackage.s32;
import defpackage.sgg;
import defpackage.spc;
import defpackage.sx1;
import defpackage.tc;
import defpackage.tre;
import defpackage.vo8;
import defpackage.vp4;
import defpackage.yab;
import defpackage.ylc;
import defpackage.z4f;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lone/me/calls/ui/bottomsheet/opponents/CallOpponentsListWidget;", "Lone/me/sdk/arch/Widget;", "Lvp4;", "Lr32;", "Lchb;", "Lz4f;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "calls-ui"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CallOpponentsListWidget extends Widget implements vp4, r32, chb, z4f {
    public static final /* synthetic */ zv8[] v = {new z8b(CallOpponentsListWidget.class, "actionHandlerJob", "getActionHandlerJob()Lkotlinx/coroutines/Job;"), zo5.f(zfe.a, CallOpponentsListWidget.class, "collapsibleHeaderContainer", "getCollapsibleHeaderContainer()Landroid/widget/LinearLayout;", 0), new dwd(CallOpponentsListWidget.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new dwd(CallOpponentsListWidget.class, "oneMeButtonToolStack", "getOneMeButtonToolStack()Lone/me/sdk/uikit/common/buttonstack/OneMeButtonToolStack;", 0), new dwd(CallOpponentsListWidget.class, "opponentsListView", "getOpponentsListView()Landroidx/recyclerview/widget/RecyclerView;", 0), new dwd(CallOpponentsListWidget.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0), new dwd(CallOpponentsListWidget.class, "subtitleView", "getSubtitleView()Landroid/widget/TextView;", 0), new dwd(CallOpponentsListWidget.class, "titleWaitingListView", "getTitleWaitingListView()Landroid/widget/TextView;", 0), new dwd(CallOpponentsListWidget.class, "searchView", "getSearchView()Lone/me/sdk/uikit/common/views/OneMeEditText;", 0), new dwd(CallOpponentsListWidget.class, "appBarLayoutView", "getAppBarLayoutView()Lcom/google/android/material/appbar/AppBarLayout;", 0)};
    public final sx1 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final p3c f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final j8e j;
    public final j8e k;
    public final j8e l;
    public final j8e m;
    public final j8e n;
    public final j8e o;
    public final j8e p;
    public final j8e q;
    public final j8e r;
    public final ifh s;
    public final ny8 t;
    public final ks6 u;

    public CallOpponentsListWidget(Bundle bundle) {
        super(bundle);
        sx1 sx1Var = new sx1(m35getAccountScopeuqN4xOY());
        this.a = sx1Var;
        this.b = rx8.P(3, new br1(8));
        this.c = sx1Var.getAccessor().d(840);
        this.d = rx8.P(3, new ot1(this, 0));
        this.e = rx8.P(3, new br1(9));
        this.f = qyj.S();
        this.g = rx8.P(3, new ot1(this, 1));
        this.h = createViewModelLazy(kt1.class, new r(24, new ot1(this, 2)));
        this.i = rx8.P(3, new ot1(this, 3));
        this.j = viewBinding(R.id.call_opponents_list_collapsible_header);
        this.k = viewBinding(R.id.call_screen_opponent_list_toolbar);
        this.l = viewBinding(R.id.call_opponent_info_buttons);
        this.m = viewBinding(R.id.call_user_list_in_call_list);
        this.n = viewBinding(R.id.call_opponents_list_title);
        this.o = viewBinding(R.id.call_opponents_list_subtitle);
        this.p = viewBinding(R.id.call_screen_admin_user_in_wait_room_title);
        this.q = viewBinding(R.id.call_user_list_in_call_bottom_search);
        this.r = viewBinding(R.id.call_opponents_list_app_bar);
        this.s = new ifh(new ot1(this, 4));
        this.t = rx8.P(3, new ot1(this, 5));
        this.u = tre.G(this, new br1(7));
    }

    @Override // defpackage.r32
    public final void D(q32 q32Var) {
        ((TextView) this.o.m(this, v[6])).setText(q32Var != null ? q32Var.d : null);
    }

    @Override // defpackage.vp4
    public final void E(int i, Bundle bundle) {
        sgg sggVarI0 = yab.i0(getViewLifecycleScope(), null, 2, new ht1(this, i, bundle, (lq4) null, 1), 1);
        this.f.B(this, v[0], sggVarI0);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig */
    public final oi8 getA() {
        return new oi8(3, 3, 3, new j11(3, 3, false));
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.u;
    }

    public final rcc o1() {
        return (rcc) this.k.m(this, v[2]);
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        tc tcVar = new tc(this, 13, layoutInflater);
        et4 et4Var = new et4(getContext());
        et4Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        et4Var.setBackgroundColor(pq3.j.l(et4Var).b.b().c);
        tcVar.invoke(et4Var);
        return et4Var;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        zv8[] zv8VarArr = v;
        zv8 zv8Var = zv8VarArr[8];
        j8e j8eVar = this.q;
        ml9.d((p1c) j8eVar.m(this, zv8Var));
        ((p1c) j8eVar.m(this, zv8VarArr[8])).clearFocus();
        p1().q.a.remove(this);
        kt1 kt1VarP1 = p1();
        kt1VarP1.g.l.remove(kt1VarP1);
        vo8 vo8Var = (vo8) this.f.m(this, zv8VarArr[0]);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        zv8[] zv8VarArr = v;
        ((p1c) this.q.m(this, zv8VarArr[8])).clearFocus();
        zv8 zv8Var = zv8VarArr[9];
        j8e j8eVar = this.r;
        ((rq) j8eVar.m(this, zv8Var)).requestFocus();
        s32 s32Var = p1().q;
        s32Var.a.add(this);
        D(s32Var.b);
        ((rq) j8eVar.m(this, zv8VarArr[9])).a(spc.d(new oq1(new ll6(), this, 1), (rq) j8eVar.m(this, zv8VarArr[9]), getViewLifecycleOwner()));
        r8e r8eVar = p1().s;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new pt1(null, this, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(p1().p, getViewLifecycleOwner().f(), n09Var), new pt1(null, this, 1), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(p1().t, getViewLifecycleOwner().f(), n09Var), new pt1(null, this, 2), 3), getViewLifecycleScope());
    }

    public final kt1 p1() {
        return (kt1) this.h.getValue();
    }

    public CallOpponentsListWidget(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
