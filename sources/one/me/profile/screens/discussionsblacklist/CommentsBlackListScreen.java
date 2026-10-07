package one.me.profile.screens.discussionsblacklist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.a4c;
import defpackage.a8j;
import defpackage.acc;
import defpackage.d04;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.en3;
import defpackage.ev;
import defpackage.f04;
import defpackage.fj3;
import defpackage.fz6;
import defpackage.g04;
import defpackage.gl1;
import defpackage.gm0;
import defpackage.ha9;
import defpackage.i19;
import defpackage.i20;
import defpackage.j22;
import defpackage.j6c;
import defpackage.j8e;
import defpackage.je9;
import defpackage.k96;
import defpackage.kcc;
import defpackage.l6c;
import defpackage.lq4;
import defpackage.ltb;
import defpackage.mc4;
import defpackage.ml9;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.nbh;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.p7c;
import defpackage.q04;
import defpackage.qb3;
import defpackage.r1c;
import defpackage.r6c;
import defpackage.r8e;
import defpackage.rcc;
import defpackage.rx8;
import defpackage.t3f;
import defpackage.tnh;
import defpackage.vv;
import defpackage.wbc;
import defpackage.wtc;
import defpackage.xhh;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\r"}, d2 = {"Lone/me/profile/screens/discussionsblacklist/CommentsBlackListScreen;", "Lone/me/sdk/arch/Widget;", "Lp7c;", "Lmc4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "Lha9;", "localAccountId", "(JLha9;)V", "profile"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CommentsBlackListScreen extends Widget implements p7c, mc4 {
    public static final /* synthetic */ zv8[] k = {new dwd(CommentsBlackListScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), zo5.f(zfe.a, CommentsBlackListScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new dwd(CommentsBlackListScreen.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), new dwd(CommentsBlackListScreen.class, "loadingView", "getLoadingView()Landroid/widget/FrameLayout;", 0), new dwd(CommentsBlackListScreen.class, "emptyView", "getEmptyView()Lone/me/sdk/uikit/common/emptyview/OneMeEmptyView;", 0)};
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

    public CommentsBlackListScreen(Bundle bundle) {
        super(bundle);
        this.a = oi8.f;
        vv vvVar = new vv("profile:discussions_black_list:id", Long.class);
        this.b = vvVar;
        zv8 zv8Var = k[0];
        this.c = new t3f(nbh.s(((Number) vvVar.a(this)).longValue(), "profile:discussionsBlackList:{", "}"), super.getB().b());
        this.d = new wtc(m35getAccountScopeuqN4xOY());
        this.e = createViewModelLazy(q04.class, new fj3(2, new f04(this, 0)));
        this.f = viewBinding(R.id.profile_discussions_black_list_toolbar);
        this.g = viewBinding(R.id.profile_discussions_black_list_list);
        this.h = viewBinding(R.id.profile_discussions_black_list_loading);
        this.i = viewBinding(R.id.profile_discussions_black_list_empty);
        this.j = rx8.P(3, new f04(this, 1));
    }

    @Override // defpackage.p7c
    public final void E0(CharSequence charSequence) {
        r1().d.e(charSequence != null ? charSequence.toString() : null);
    }

    @Override // defpackage.p7c
    public final void X() {
        r1().d.e(null);
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        if (bundle != null) {
            long j = bundle.getLong("discussions_black_list:user_id");
            q04 q04VarR1 = r1();
            q04VarR1.getClass();
            if (i == R.id.profile_discussions_black_list_keep_blocked_button || i != R.id.profile_discussions_black_list_confirm_unblock_button) {
                return;
            }
            if (q04VarR1.k.add(Long.valueOf(j))) {
                a8j.t(q04VarR1, ((n0c) ((xhh) q04VarR1.e.getValue())).a(), new i20(q04VarR1, j, (lq4) null, 10), 2).Y(new en3(q04VarR1, j, 2));
                return;
            }
            String name = q04.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, nbh.s(j, "user ", " already in processing"), null);
            }
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getE() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScopeId, reason: from getter */
    public final t3f getB() {
        return this.c;
    }

    @Override // defpackage.p7c
    public final void o() {
        r1().d.e(null);
    }

    public final r1c o1() {
        return (r1c) this.i.m(this, k[4]);
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        super.onAttach(view);
        r1().d.g();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        rcc rccVar = new rcc(getContext());
        rccVar.setId(R.id.profile_discussions_black_list_toolbar);
        rccVar.setLeftActions(new wbc(new j22(20, this)));
        rccVar.setRightActions(new acc(new kcc(this), null, null));
        linearLayout.addView(rccVar);
        FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        k96 k96Var = new k96(getContext());
        k96Var.setId(R.id.profile_discussions_black_list_list);
        k96Var.getContext();
        k96Var.setLayoutManager(new LinearLayoutManager());
        k96Var.setAdapter((d04) this.j.getValue());
        k96Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        k96Var.setItemAnimator(null);
        k96Var.setClipToPadding(false);
        k96Var.setPager(new gl1(this, 2));
        k96Var.setThreshold(10);
        k96Var.setIgnoreRefreshingFlagsForScrollEvent(true);
        frameLayout.addView(k96Var);
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setId(R.id.profile_discussions_black_list_loading);
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout2.setVisibility(8);
        n1g.N(new qb3(3, null, 2), frameLayout2);
        r6c r6cVar = new r6c(frameLayout2.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        r6cVar.setLayoutParams(layoutParams);
        r6cVar.setAppearance(j6c.a);
        r6cVar.setSize(l6c.a);
        frameLayout2.addView(r6cVar);
        frameLayout.addView(frameLayout2);
        r1c r1cVar = new r1c(getContext());
        r1cVar.setId(R.id.profile_discussions_black_list_empty);
        r1cVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        r1cVar.setVisibility(8);
        r1cVar.setIcon(R.drawable.icon_block);
        r1cVar.setTitle(new tnh(R.string.discussions_black_list_empty_title));
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
        r8e r8eVar = r1().n;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new g04(null, this, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(r1().o, getViewLifecycleOwner().f(), n09Var), new g04(null, this, 1), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(r1().p, getViewLifecycleOwner().f(), n09Var), new g04(null, this, 2), 3), getViewLifecycleScope());
        ltb ltbVarH = getRouter().h();
        if (ltbVarH != null) {
            ltbVarH.a(getViewLifecycleOwner(), new ev(4, this));
        }
    }

    public final k96 p1() {
        return (k96) this.g.m(this, k[2]);
    }

    public final rcc q1() {
        return (rcc) this.f.m(this, k[1]);
    }

    public final q04 r1() {
        return (q04) this.e.getValue();
    }

    public CommentsBlackListScreen(long j, ha9 ha9Var) {
        this(n1g.i(new ylc("profile:discussions_black_list:id", Long.valueOf(j)), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
