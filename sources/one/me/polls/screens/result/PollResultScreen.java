package one.me.polls.screens.result;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2c;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.g9d;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.h47;
import defpackage.h8d;
import defpackage.h9d;
import defpackage.ha9;
import defpackage.hta;
import defpackage.i19;
import defpackage.i9d;
import defpackage.j8e;
import defpackage.lq4;
import defpackage.n;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.p7d;
import defpackage.ph1;
import defpackage.pq3;
import defpackage.qyb;
import defpackage.r8e;
import defpackage.rcc;
import defpackage.s9d;
import defpackage.sbf;
import defpackage.t3f;
import defpackage.ubf;
import defpackage.vv;
import defpackage.wtc;
import defpackage.xbc;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B)\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/polls/screens/result/PollResultScreen;", "Lone/me/sdk/arch/Widget;", "Lubf;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "messageId", "pollId", "Lha9;", "localAccountId", "(JJJLha9;)V", "polls"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PollResultScreen extends Widget implements ubf {
    public static final /* synthetic */ zv8[] k = {new dwd(PollResultScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), zo5.f(zfe.a, PollResultScreen.class, "messageId", "getMessageId()J", 0), new dwd(PollResultScreen.class, "pollId", "getPollId()J", 0), new dwd(PollResultScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0)};
    public final oi8 a;
    public final t3f b;
    public final vv c;
    public final vv d;
    public final vv e;
    public final wtc f;
    public final ny8 g;
    public final ny8 h;
    public final j8e i;
    public final h47 j;

    public PollResultScreen(Bundle bundle) {
        super(bundle);
        this.a = oi8.f;
        this.b = new t3f("PollResultScreen", null, 2);
        Class<Long> cls = Long.class;
        this.c = new vv("chat_id", cls);
        this.d = new vv("message_id", cls);
        this.e = new vv("poll_id", cls);
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.f = wtcVar;
        this.g = createViewModelLazy(s9d.class, new hta(18, new g9d(this, 0)));
        this.h = createViewModelLazy(h8d.class, new hta(19, new g9d(this, 1)));
        this.i = viewBinding(R.id.oneme_poll_result__toolbar_view);
        this.j = new h47(new i9d(this), ((a2c) wtcVar.getAccessor().c(27)).a(), 9);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getA() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScopeId, reason: from getter */
    public final t3f getB() {
        return this.b;
    }

    public final s9d o1() {
        return (s9d) this.g.getValue();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        rcc rccVar = new rcc(linearLayout.getContext());
        rccVar.setId(R.id.oneme_poll_result__toolbar_view);
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new xbc(new p7d(1, this)));
        linearLayout.addView(rccVar);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext());
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.j);
        recyclerView.setClipChildren(false);
        recyclerView.setClipToPadding(false);
        recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), recyclerView.getPaddingTop(), recyclerView.getPaddingEnd(), gm0.K(42.0f * yl5.d().getDisplayMetrics().density));
        int i = 7;
        recyclerView.h(new sbf(pq3.j.h(recyclerView), new qyb(i, this), null, null, null, 60), -1);
        recyclerView.h(new ph1(i), -1);
        linearLayout.addView(recyclerView);
        n1g.N(new n(3, null, 13), linearLayout);
        return linearLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        r8e r8eVar = o1().o;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        lq4 lq4Var = null;
        int i = 3;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new h9d(lq4Var, this, 0), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(o1().q, getViewLifecycleOwner().f(), n09Var), new h9d(lq4Var, this, 1), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(o1().t, getViewLifecycleOwner().f(), n09Var), new h9d(lq4Var, this, 2), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(o1().u, getViewLifecycleOwner().f(), n09Var), new h9d(lq4Var, this, i), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((h8d) this.h.getValue()).c, getViewLifecycleOwner().f(), n09Var), new h9d(lq4Var, this, 4), i), getViewLifecycleScope());
    }

    @Override // defpackage.ubf
    public final Object z0(lq4 lq4Var) {
        return o1().E(lq4Var);
    }

    public PollResultScreen(long j, long j2, long j3, ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a)), new ylc("chat_id", Long.valueOf(j)), new ylc("message_id", Long.valueOf(j2)), new ylc("poll_id", Long.valueOf(j3))));
    }
}
