package one.me.polls.screens.result.voterslist;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.a2c;
import defpackage.dwd;
import defpackage.e6d;
import defpackage.e9i;
import defpackage.f6d;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.gl1;
import defpackage.h47;
import defpackage.ha9;
import defpackage.hta;
import defpackage.i19;
import defpackage.iua;
import defpackage.j8e;
import defpackage.k96;
import defpackage.l6d;
import defpackage.lh9;
import defpackage.lq4;
import defpackage.n;
import defpackage.n09;
import defpackage.n11;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.pvh;
import defpackage.qh1;
import defpackage.r66;
import defpackage.r84;
import defpackage.r8e;
import defpackage.rcc;
import defpackage.tre;
import defpackage.vv;
import defpackage.wtc;
import defpackage.xbc;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0004\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/polls/screens/result/voterslist/PollAnswerVotersListScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "messageId", "pollId", "", "answerId", "Lha9;", "localAccountId", "(JJJILha9;)V", "polls"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PollAnswerVotersListScreen extends Widget {
    public static final /* synthetic */ zv8[] n = {new dwd(PollAnswerVotersListScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), zo5.f(zfe.a, PollAnswerVotersListScreen.class, "messageId", "getMessageId()J", 0), new dwd(PollAnswerVotersListScreen.class, "pollId", "getPollId()J", 0), new dwd(PollAnswerVotersListScreen.class, "answerId", "getAnswerId()I", 0), new dwd(PollAnswerVotersListScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new dwd(PollAnswerVotersListScreen.class, "recycler", "getRecycler()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0)};
    public final oi8 a;
    public final vv b;
    public final vv c;
    public final vv d;
    public final vv e;
    public final wtc f;
    public final ny8 g;
    public final h47 h;
    public final qh1 i;
    public final r84 j;
    public final j8e k;
    public final j8e l;
    public pvh m;

    public PollAnswerVotersListScreen(Bundle bundle) {
        super(bundle);
        this.a = oi8.f;
        Class<Long> cls = Long.class;
        this.b = new vv("chat_id", cls);
        this.c = new vv("message_id", cls);
        this.d = new vv("poll_id", cls);
        this.e = new vv("answer_id", Integer.class);
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.f = wtcVar;
        this.g = createViewModelLazy(l6d.class, new hta(15, new iua(27, this)));
        h47 h47Var = new h47(new f6d(this), ((a2c) wtcVar.getAccessor().c(27)).a(), 9);
        this.h = h47Var;
        qh1 qh1Var = new qh1(((a2c) wtcVar.getAccessor().c(27)).a(), 5);
        this.i = qh1Var;
        this.j = new r84(h47Var, qh1Var);
        this.k = viewBinding(R.id.oneme_poll_voterslist__toolbar_id);
        this.l = viewBinding(R.id.oneme_poll_voterslist__recycler_id);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getA() {
        return this.a;
    }

    public final l6d o1() {
        return (l6d) this.g.getValue();
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
        rccVar.setId(R.id.oneme_poll_voterslist__toolbar_id);
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new xbc(new lh9(29, this)));
        linearLayout.addView(rccVar);
        k96 k96Var = new k96(linearLayout.getContext());
        k96Var.setId(R.id.oneme_poll_voterslist__recycler_id);
        k96Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        k96Var.getContext();
        k96Var.setLayoutManager(new LinearLayoutManager());
        k96Var.setAdapter(this.j);
        k96Var.setItemAnimator(null);
        this.m = tre.Y(k96Var);
        k96Var.setThreshold(20);
        k96Var.setIgnoreRefreshingFlagsForScrollEvent(true);
        r66 r66Var = r66.a;
        qh1 qh1Var = this.i;
        qh1Var.H(r66Var);
        k96Var.setDelegate(new n11(11, qh1Var));
        k96Var.setPager(new gl1(this, 8));
        linearLayout.addView(k96Var);
        n1g.N(new n(3, null, 12), linearLayout);
        return linearLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        k96 k96Var = (k96) this.l.m(this, n[5]);
        pvh pvhVar = this.m;
        if (pvhVar != null) {
            pvhVar.b(k96Var);
        }
        k96Var.setDelegate(null);
        k96Var.setPager(null);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        r8e r8eVar = o1().p;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        lq4 lq4Var = null;
        int i = 3;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new e6d(lq4Var, this, 0), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(o1().m, getViewLifecycleOwner().f(), n09Var), new e6d(lq4Var, this, 1), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(o1().q, getViewLifecycleOwner().f(), n09Var), new e6d(lq4Var, this, 2), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(o1().r, getViewLifecycleOwner().f(), n09Var), new e6d(lq4Var, this, i), i), getViewLifecycleScope());
    }

    public PollAnswerVotersListScreen(long j, long j2, long j3, int i, ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a)), new ylc("chat_id", Long.valueOf(j)), new ylc("message_id", Long.valueOf(j2)), new ylc("poll_id", Long.valueOf(j3)), new ylc("answer_id", Integer.valueOf(i))));
    }
}
