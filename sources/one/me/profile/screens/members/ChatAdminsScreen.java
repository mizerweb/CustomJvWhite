package one.me.profile.screens.members;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.a8j;
import defpackage.acc;
import defpackage.au2;
import defpackage.c9a;
import defpackage.cqk;
import defpackage.d4f;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.g8c;
import defpackage.gu2;
import defpackage.ha9;
import defpackage.hve;
import defpackage.i19;
import defpackage.ic6;
import defpackage.in1;
import defpackage.ird;
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
import defpackage.n1g;
import defpackage.n9a;
import defpackage.nbh;
import defpackage.ny8;
import defpackage.oc9;
import defpackage.oi8;
import defpackage.p63;
import defpackage.p7c;
import defpackage.qq2;
import defpackage.r66;
import defpackage.rcc;
import defpackage.rx8;
import defpackage.t3f;
import defpackage.tnh;
import defpackage.tp2;
import defpackage.tre;
import defpackage.ubf;
import defpackage.vv;
import defpackage.w8;
import defpackage.wbc;
import defpackage.wtc;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zp3;
import defpackage.zv8;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import one.me.members.list.MembersListWidget;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/profile/screens/members/ChatAdminsScreen;", "Lone/me/sdk/arch/Widget;", "Lmc4;", "Lp7c;", "Lubf;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "Lha9;", "localAccountId", "(JLha9;)V", "profile"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ChatAdminsScreen extends Widget implements mc4, p7c, ubf {
    public static final /* synthetic */ zv8[] l = {new dwd(ChatAdminsScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), zo5.f(zfe.a, ChatAdminsScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new dwd(ChatAdminsScreen.class, "membersListRouter", "getMembersListRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0)};
    public final oi8 a;
    public final vv b;
    public final t3f c;
    public final wtc d;
    public final ks6 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final j8e i;
    public g8c j;
    public final j8e k;

    public ChatAdminsScreen(Bundle bundle) {
        super(bundle);
        this.a = oi8.f;
        this.b = new vv("id", Long.class);
        this.c = new t3f(nbh.s(p1(), "profile:chatMembersList:{", "}"), super.getC().b());
        this.d = new wtc(m35getAccountScopeuqN4xOY());
        this.e = tre.G(this, new k82(10));
        this.f = createViewModelLazy(gu2.class, new qq2(2, new au2(this, 0)));
        int i = 3;
        this.g = createViewModelLazy(n9a.class, new qq2(i, new au2(this, 1)));
        this.h = rx8.P(3, new au2(this, 2));
        this.i = viewBinding(R.id.profile_members_list_toolbar_admin);
        ic6 ic6Var = q1().f;
        i19 i19VarF = this.lifecycleOwner.f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(ic6Var, i19VarF, n09Var), new in1(this, (lq4) null, 11), i), getLifecycleScope());
        e9i.j0(new fz6(n1g.v(o1().m, this.lifecycleOwner.f(), n09Var), new w8(2, this, ChatAdminsScreen.class, "processEvents", "processEvents(Lone/me/profile/screens/members/ProfileListMembersEvents;)V", 4, 7), i), getLifecycleScope());
        this.k = childSlotRouter(R.id.profile_members_list_container_admin);
    }

    @Override // defpackage.p7c
    public final void E0(CharSequence charSequence) {
        q1().F(String.valueOf(charSequence));
    }

    @Override // defpackage.p7c
    public final void X() {
        q1().F(null);
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        long[] longArray;
        if (i == R.id.profile_members_list_delete_from_admin_btn) {
            List listM1 = (bundle == null || (longArray = bundle.getLongArray("profile:adminslist:ids_to_delete")) == null) ? null : a.m1(longArray);
            if (listM1 == null) {
                listM1 = r66.a;
            }
            List list = listM1;
            q1().D(list);
            gu2 gu2VarO1 = o1();
            gu2VarO1.l.addAll(list);
            a8j.x(gu2VarO1.m, new ird(new tnh(R.string.profile_members_list_delete_from_admin_snackbar)));
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getA() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScopeId, reason: from getter */
    public final t3f getC() {
        return this.c;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getU() {
        return this.e;
    }

    @Override // defpackage.p7c
    public final void o() {
        q1().F(null);
    }

    public final gu2 o1() {
        return (gu2) this.f.getValue();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        rcc rccVar = new rcc(linearLayout.getContext());
        rccVar.setId(R.id.profile_members_list_toolbar_admin);
        rccVar.setTitle(R.string.profile_members_list_toolbar_admin_title);
        rccVar.setLeftActions(new wbc(new j22(8, this)));
        rccVar.setRightActions(new acc(null, new kcc(this), null));
        linearLayout.addView(rccVar);
        tp2 tp2Var = new tp2(linearLayout.getContext());
        tp2Var.setId(R.id.profile_members_list_container_admin);
        tp2Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(tp2Var);
        return linearLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        ml9.d((rcc) this.i.m(this, l[1]));
        g8c g8cVar = this.j;
        if (g8cVar != null) {
            g8cVar.a();
        }
        this.j = null;
        o1().D();
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        zp3 zp3Var = (zp3) this.k.m(this, l[2]);
        hve hveVar = zp3Var.a;
        if (cqk.d(zp3Var.b(), "admins_list_widget")) {
            return;
        }
        hveVar.S(false);
        MembersListWidget membersListWidget = new MembersListWidget(this.c, new c9a(p1(), p63.ADMIN, 12));
        membersListWidget.setTargetWidget(this);
        lve lveVarE = oc9.e(membersListWidget, null, null);
        lveVarE.e("admins_list_widget");
        hveVar.T(lveVarE);
    }

    public final long p1() {
        zv8 zv8Var = l[0];
        return ((Number) this.b.a(this)).longValue();
    }

    public final n9a q1() {
        return (n9a) this.g.getValue();
    }

    @Override // defpackage.ubf
    public final Object z0(lq4 lq4Var) {
        return o1().C(lq4Var);
    }

    public ChatAdminsScreen(long j, ha9 ha9Var) {
        this(n1g.i(new ylc("id", Long.valueOf(j)), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
