package one.me.profile.screens.members;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.a73;
import defpackage.b73;
import defpackage.d4f;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.ev;
import defpackage.fz6;
import defpackage.g8c;
import defpackage.ha9;
import defpackage.i19;
import defpackage.j8e;
import defpackage.k82;
import defpackage.ks6;
import defpackage.l73;
import defpackage.lq4;
import defpackage.ltb;
import defpackage.mc4;
import defpackage.ml9;
import defpackage.n09;
import defpackage.n1g;
import defpackage.n9a;
import defpackage.nbh;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.p63;
import defpackage.p7c;
import defpackage.qq2;
import defpackage.r66;
import defpackage.rcc;
import defpackage.t3f;
import defpackage.tp2;
import defpackage.tre;
import defpackage.ubf;
import defpackage.vv;
import defpackage.w8;
import defpackage.wbc;
import defpackage.wtc;
import defpackage.xx6;
import defpackage.ylc;
import defpackage.z63;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zp3;
import defpackage.zv8;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lone/me/profile/screens/members/ChatMembersScreen;", "Lone/me/sdk/arch/Widget;", "Lmc4;", "Lp7c;", "Lubf;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "Lp63;", "chatMemberType", "Lha9;", "localAccountId", "(JLp63;Lha9;)V", "profile"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ChatMembersScreen extends Widget implements mc4, p7c, ubf {
    public static final /* synthetic */ zv8[] k = {new dwd(ChatMembersScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), zo5.f(zfe.a, ChatMembersScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new dwd(ChatMembersScreen.class, "membersListRouter", "getMembersListRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0)};
    public final oi8 a;
    public final vv b;
    public final t3f c;
    public final wtc d;
    public final ks6 e;
    public final ny8 f;
    public final ny8 g;
    public final j8e h;
    public final j8e i;
    public g8c j;

    public ChatMembersScreen(Bundle bundle) {
        super(bundle);
        this.a = oi8.f;
        this.b = new vv("profile:memberslist:id", Long.class);
        this.c = new t3f(nbh.s(o1(), "profile:chatMembersList:{", "}"), super.getC().b());
        this.d = new wtc(m35getAccountScopeuqN4xOY());
        this.e = tre.G(this, new k82(23));
        this.f = createViewModelLazy(l73.class, new qq2(12, new z63(this, 0)));
        this.g = createViewModelLazy(n9a.class, new qq2(13, new z63(this, 1)));
        this.h = viewBinding(R.id.profile_members_list_toolbar);
        xx6 xx6Var = p1().q;
        i19 i19VarF = this.lifecycleOwner.f();
        n09 n09Var = n09.d;
        int i = 3;
        e9i.j0(new fz6(n1g.v(xx6Var, i19VarF, n09Var), new b73(this, null, 0), i), getLifecycleScope());
        e9i.j0(new fz6(n1g.v(q1().f, this.lifecycleOwner.f(), n09Var), new b73(this, null, 1), i), getLifecycleScope());
        e9i.j0(new fz6(n1g.v(p1().p, this.lifecycleOwner.f(), n09Var), new w8(2, this, ChatMembersScreen.class, "processEvents", "processEvents(Lone/me/profile/screens/members/ProfileListMembersEvents;)V", 4, 9), i), getLifecycleScope());
        this.i = childSlotRouter(R.id.profile_members_list_container);
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
        long[] longArray2;
        List list = r66.a;
        List listM1 = null;
        if (i == R.id.profile_members_list_delete_from_chat_btn || i == R.id.profile_members_list_delete_from_channel_btn) {
            if (bundle != null && (longArray = bundle.getLongArray("profile:memberslist:ids_to_delete")) != null) {
                listM1 = a.m1(longArray);
            }
            if (listM1 != null) {
                list = listM1;
            }
            q1().B();
            q1().D(list);
            p1().F(list, false);
            return;
        }
        if (i == R.id.profile_members_list_delete_from_chat_btn_with_clean) {
            if (bundle != null && (longArray2 = bundle.getLongArray("profile:memberslist:ids_to_delete")) != null) {
                listM1 = a.m1(longArray2);
            }
            if (listM1 != null) {
                list = listM1;
            }
            q1().B();
            q1().D(list);
            p1().F(list, true);
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

    public final long o1() {
        zv8 zv8Var = k[0];
        return ((Number) this.b.a(this)).longValue();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        rcc rccVar = new rcc(linearLayout.getContext());
        rccVar.setId(R.id.profile_members_list_toolbar);
        rccVar.setLeftActions(new wbc(new a73(this, 0)));
        linearLayout.addView(rccVar);
        tp2 tp2Var = new tp2(linearLayout.getContext());
        tp2Var.setId(R.id.profile_members_list_container);
        tp2Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(tp2Var);
        return linearLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        ml9.d(r1());
        q1().B();
        g8c g8cVar = this.j;
        if (g8cVar != null) {
            g8cVar.a();
        }
        this.j = null;
        p1().I();
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        ltb ltbVarH = getRouter().h();
        int i = 3;
        if (ltbVarH != null) {
            ltbVarH.a(getViewLifecycleOwner(), new ev(i, this));
        }
        ((zp3) this.i.m(this, k[2])).d("members_list_widget", new z63(this, 2));
        e9i.j0(new fz6(n1g.v(q1().i, getViewLifecycleOwner().f(), n09.d), new b73(null, this), i), getViewLifecycleScope());
    }

    public final l73 p1() {
        return (l73) this.f.getValue();
    }

    public final n9a q1() {
        return (n9a) this.g.getValue();
    }

    public final rcc r1() {
        return (rcc) this.h.m(this, k[1]);
    }

    @Override // defpackage.ubf
    public final Object z0(lq4 lq4Var) {
        return p1().H(lq4Var);
    }

    public ChatMembersScreen(long j, p63 p63Var, ha9 ha9Var) {
        this(n1g.i(new ylc("profile:memberslist:id", Long.valueOf(j)), new ylc("profile:memberslist:type", p63Var.a), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
