package one.me.profile.screens.changeowner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.a8j;
import defpackage.acc;
import defpackage.c9a;
import defpackage.cqk;
import defpackage.d4f;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.ha9;
import defpackage.hve;
import defpackage.i19;
import defpackage.ic6;
import defpackage.j22;
import defpackage.j8e;
import defpackage.k82;
import defpackage.kcc;
import defpackage.ks6;
import defpackage.lq4;
import defpackage.lve;
import defpackage.mc4;
import defpackage.ml9;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.n9a;
import defpackage.nbh;
import defpackage.ny8;
import defpackage.oc9;
import defpackage.oi8;
import defpackage.oq2;
import defpackage.p63;
import defpackage.p7c;
import defpackage.pq2;
import defpackage.qq2;
import defpackage.rcc;
import defpackage.t3f;
import defpackage.tp2;
import defpackage.tre;
import defpackage.uq2;
import defpackage.vv;
import defpackage.wbc;
import defpackage.wq2;
import defpackage.wtc;
import defpackage.xhh;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zp3;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.members.list.MembersListWidget;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/profile/screens/changeowner/ChangeOwnerScreen;", "Lone/me/sdk/arch/Widget;", "Lp7c;", "Lmc4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "", "leaveFromChat", "Lha9;", "localAccountId", "(JZLha9;)V", "profile"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ChangeOwnerScreen extends Widget implements p7c, mc4 {
    public static final /* synthetic */ zv8[] k = {new dwd(ChangeOwnerScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), zo5.f(zfe.a, ChangeOwnerScreen.class, "leaveFromChat", "getLeaveFromChat()Z", 0), new dwd(ChangeOwnerScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new dwd(ChangeOwnerScreen.class, "membersListRouter", "getMembersListRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0)};
    public final oi8 a;
    public final vv b;
    public final vv c;
    public final t3f d;
    public final wtc e;
    public final ks6 f;
    public final ny8 g;
    public final ny8 h;
    public final j8e i;
    public final j8e j;

    public ChangeOwnerScreen(Bundle bundle) {
        super(bundle);
        this.a = oi8.f;
        this.b = new vv("chat_id", Long.class);
        this.c = new vv("leave_chat", Boolean.class);
        this.d = new t3f(nbh.s(o1(), "profile:chatMembersList:{", "}"), super.getD().b());
        this.e = new wtc(m35getAccountScopeuqN4xOY());
        this.f = tre.G(this, new k82(7));
        this.g = createViewModelLazy(wq2.class, new qq2(0, new oq2(this, 0)));
        this.h = createViewModelLazy(n9a.class, new qq2(1, new oq2(this, 1)));
        this.i = viewBinding(R.id.profile_change_owner_toolbar);
        this.j = childSlotRouter(R.id.profile_change_owner_members_list_container);
    }

    @Override // defpackage.p7c
    public final void E0(CharSequence charSequence) {
        ((n9a) this.h.getValue()).F(String.valueOf(charSequence));
    }

    @Override // defpackage.p7c
    public final void X() {
        ((n9a) this.h.getValue()).F(null);
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        if (i != R.id.profile_change_owner_change_action || bundle == null) {
            return;
        }
        long j = bundle.getLong("new_owner_id");
        wq2 wq2Var = (wq2) this.g.getValue();
        a8j.t(wq2Var, ((n0c) ((xhh) wq2Var.g.getValue())).a(), new uq2(wq2Var, j, p1(), null), 2);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getA() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScopeId, reason: from getter */
    public final t3f getD() {
        return this.d;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.f;
    }

    @Override // defpackage.p7c
    public final void o() {
        ((n9a) this.h.getValue()).F(null);
    }

    public final long o1() {
        zv8 zv8Var = k[0];
        return ((Number) this.b.a(this)).longValue();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        rcc rccVar = new rcc(linearLayout.getContext());
        rccVar.setId(R.id.profile_change_owner_toolbar);
        rccVar.setTitle(R.string.profile_change_owner_toolbar);
        rccVar.setLeftActions(new wbc(new j22(4, this)));
        rccVar.setRightActions(new acc(null, new kcc(this), null));
        linearLayout.addView(rccVar);
        tp2 tp2Var = new tp2(linearLayout.getContext());
        tp2Var.setId(R.id.profile_change_owner_members_list_container);
        tp2Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(tp2Var);
        return linearLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        ml9.d((rcc) this.i.m(this, k[2]));
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        int i = 3;
        zp3 zp3Var = (zp3) this.j.m(this, k[3]);
        hve hveVar = zp3Var.a;
        int i2 = 0;
        lq4 lq4Var = null;
        if (!cqk.d(zp3Var.b(), "change_owner_widget")) {
            hveVar.S(false);
            MembersListWidget membersListWidget = new MembersListWidget(this.d, new c9a(o1(), p63.MEMBER, 12));
            membersListWidget.setTargetWidget(this);
            lve lveVarE = oc9.e(membersListWidget, null, null);
            lveVarE.e("change_owner_widget");
            hveVar.T(lveVarE);
        }
        ic6 ic6Var = ((n9a) this.h.getValue()).f;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(ic6Var, i19VarF, n09Var), new pq2(lq4Var, this, i2), i), getViewLifecycleScope());
        ny8 ny8Var = this.g;
        e9i.j0(new fz6(n1g.v(((wq2) ny8Var.getValue()).i, getViewLifecycleOwner().f(), n09Var), new pq2(lq4Var, this, 1), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((wq2) ny8Var.getValue()).j, getViewLifecycleOwner().f(), n09Var), new pq2(lq4Var, this, 2), i), getViewLifecycleScope());
    }

    public final boolean p1() {
        zv8 zv8Var = k[1];
        return ((Boolean) this.c.a(this)).booleanValue();
    }

    public ChangeOwnerScreen(long j, boolean z, ha9 ha9Var) {
        this(n1g.i(new ylc("chat_id", Long.valueOf(j)), new ylc("leave_chat", Boolean.valueOf(z)), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
