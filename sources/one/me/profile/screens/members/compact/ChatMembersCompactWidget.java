package one.me.profile.screens.members.compact;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.c9a;
import defpackage.cqk;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.g8c;
import defpackage.ha9;
import defpackage.hve;
import defpackage.i19;
import defpackage.in1;
import defpackage.j8e;
import defpackage.l73;
import defpackage.lq4;
import defpackage.lve;
import defpackage.mc4;
import defpackage.n09;
import defpackage.n1g;
import defpackage.n9a;
import defpackage.nbh;
import defpackage.ny8;
import defpackage.oc9;
import defpackage.oi8;
import defpackage.p63;
import defpackage.qq2;
import defpackage.r63;
import defpackage.r66;
import defpackage.t3f;
import defpackage.tp2;
import defpackage.vv;
import defpackage.w8;
import defpackage.wtc;
import defpackage.xx6;
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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/profile/screens/members/compact/ChatMembersCompactWidget;", "Lone/me/sdk/arch/Widget;", "Lmc4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "Lha9;", "localAccountId", "(JLha9;)V", "profile"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ChatMembersCompactWidget extends Widget implements mc4 {
    public static final /* synthetic */ zv8[] h = {new dwd(ChatMembersCompactWidget.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), zo5.f(zfe.a, ChatMembersCompactWidget.class, "membersListRouter", "getMembersListRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0)};
    public final vv a;
    public final t3f b;
    public final wtc c;
    public final ny8 d;
    public g8c e;
    public final ny8 f;
    public final j8e g;

    public ChatMembersCompactWidget(Bundle bundle) {
        super(bundle);
        this.a = new vv("id", Long.class);
        this.b = new t3f(nbh.s(o1(), "profile:compactChatMembersList:{", "}"), super.getB().b());
        this.c = new wtc(m35getAccountScopeuqN4xOY());
        this.d = createViewModelLazy(l73.class, new qq2(9, new r63(this, 0)));
        this.f = createViewModelLazy(n9a.class, new qq2(10, new r63(this, 1)));
        xx6 xx6Var = p1().q;
        i19 i19VarF = this.lifecycleOwner.f();
        n09 n09Var = n09.d;
        e9i.j0(n1g.v(xx6Var, i19VarF, n09Var), getLifecycleScope());
        int i = 3;
        e9i.j0(new fz6(n1g.v(q1().f, this.lifecycleOwner.f(), n09Var), new in1(this, (lq4) null, 23), i), getLifecycleScope());
        e9i.j0(new fz6(n1g.v(p1().p, this.lifecycleOwner.f(), n09Var), new w8(2, this, ChatMembersCompactWidget.class, "processEvents", "processEvents(Lone/me/profile/screens/members/ProfileListMembersEvents;)V", 4, 8), i), getLifecycleScope());
        this.g = childSlotRouter(R.id.profile_members_list_container);
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        long[] longArray;
        long[] longArray2;
        List list = r66.a;
        List listM1 = null;
        if (i == R.id.profile_members_list_delete_from_chat_btn) {
            if (bundle != null && (longArray2 = bundle.getLongArray("profile:memberslist:ids_to_delete")) != null) {
                listM1 = a.m1(longArray2);
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
            if (bundle != null && (longArray = bundle.getLongArray("profile:memberslist:ids_to_delete")) != null) {
                listM1 = a.m1(longArray);
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
    /* JADX INFO: renamed from: getInsetsConfig */
    public final oi8 getA() {
        oi8 oi8Var = oi8.e;
        return oi8.e;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScopeId, reason: from getter */
    public final t3f getB() {
        return this.b;
    }

    public final long o1() {
        zv8 zv8Var = h[0];
        return ((Number) this.a.a(this)).longValue();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        tp2 tp2Var = new tp2(getContext());
        tp2Var.setId(R.id.profile_members_list_container);
        tp2Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return tp2Var;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        g8c g8cVar = this.e;
        if (g8cVar != null) {
            g8cVar.a();
        }
        this.e = null;
        p1().I();
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        zp3 zp3Var = (zp3) this.g.m(this, h[1]);
        hve hveVar = zp3Var.a;
        if (cqk.d(zp3Var.b(), "compact_members_list_widget")) {
            return;
        }
        hveVar.S(false);
        MembersListWidget membersListWidget = new MembersListWidget(this.b, new c9a(o1(), p63.MEMBER, 4));
        membersListWidget.setTargetWidget(this);
        lve lveVarE = oc9.e(membersListWidget, null, null);
        lveVarE.e("compact_members_list_widget");
        hveVar.T(lveVarE);
    }

    public final l73 p1() {
        return (l73) this.d.getValue();
    }

    public final n9a q1() {
        return (n9a) this.f.getValue();
    }

    public ChatMembersCompactWidget(long j, ha9 ha9Var) {
        this(n1g.i(new ylc("id", Long.valueOf(j)), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
