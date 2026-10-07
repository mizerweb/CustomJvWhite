package one.me.profile.screens.addmembers;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.ab;
import defpackage.ayb;
import defpackage.bb;
import defpackage.cyb;
import defpackage.d4f;
import defpackage.dwd;
import defpackage.dzc;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.fze;
import defpackage.g8c;
import defpackage.gcc;
import defpackage.gjg;
import defpackage.gm0;
import defpackage.gu4;
import defpackage.ha9;
import defpackage.j8e;
import defpackage.ks6;
import defpackage.ln5;
import defpackage.lq4;
import defpackage.m;
import defpackage.m8b;
import defpackage.mc4;
import defpackage.mjg;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.np4;
import defpackage.p90;
import defpackage.py2;
import defpackage.pyc;
import defpackage.qe7;
import defpackage.qo7;
import defpackage.rcc;
import defpackage.rx8;
import defpackage.s8a;
import defpackage.t3f;
import defpackage.t8;
import defpackage.tnh;
import defpackage.tre;
import defpackage.ui9;
import defpackage.va;
import defpackage.vv;
import defpackage.wbc;
import defpackage.wtc;
import defpackage.xhh;
import defpackage.ya;
import defpackage.yab;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.z8b;
import defpackage.za;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zxb;
import java.util.Collections;
import kotlin.Metadata;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/profile/screens/addmembers/AddChatMembersScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Lza;", "Lmc4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "", "isChat", "Lha9;", "localAccountId", "(JZLha9;)V", "profile"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AddChatMembersScreen extends AbstractPickerScreen<za> implements mc4 {
    public static final /* synthetic */ zv8[] r = {new dwd(AddChatMembersScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), zo5.f(zfe.a, AddChatMembersScreen.class, "isChat", "isChat()Z", 0), new z8b(AddChatMembersScreen.class, "selectedIds", "getSelectedIds()[J"), new dwd(AddChatMembersScreen.class, "confirmButton", "getConfirmButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final vv j;
    public final vv k;
    public final vv l;
    public final wtc m;
    public final ks6 n;
    public final mjg o;
    public final j8e p;
    public g8c q;

    public AddChatMembersScreen(Bundle bundle) {
        super(bundle);
        this.j = new vv(Long.class, 0L, "chat_id");
        this.k = new vv(Boolean.class, Boolean.TRUE, "is_chat");
        this.l = new vv("selected_ids", long[].class);
        this.m = new wtc(m35getAccountScopeuqN4xOY());
        this.n = tre.G(this, new va(2));
        this.o = p90.a(new tnh(R.string.oneme_profile_add_members_search_hint));
        this.p = viewBinding(R.id.profile_members_confirm_btn);
        e9i.j0(new fz6(x1().i, new ab(this, (lq4) null), 3), getLifecycleScope());
        ln5 ln5Var = new ln5(this, new qo7(7, this));
        if (getRouter() != null) {
            getRouter().a(ln5Var);
        } else {
            addLifecycleListener(new bb(this, ln5Var, 0));
        }
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        if (i == R.id.profile_add_members_show_history_cancel_action) {
            return;
        }
        za zaVar = (za) x1().d;
        m8b m8bVar = (m8b) x1().i.a.getValue();
        gu4 gu4Var = zaVar.e;
        zaVar.h.B(zaVar, za.j[0], gu4Var != null ? yab.h0(gu4Var, ((n0c) ((xhh) zaVar.c.getValue())).b(), 2, new ya(i, zaVar, m8bVar, null)) : null);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.n;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Iterable o1() {
        cyb cybVar = new cyb(getContext());
        cybVar.setId(R.id.profile_members_confirm_btn);
        cybVar.setSize(ayb.g);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setText(np4.q(getContext(), ((za) x1().d).i ? R.string.oneme_profile_add_members_action_title_channel : R.string.oneme_profile_add_members_action_title));
        cybVar.setCount(1);
        cybVar.setVisibility(8);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        layoutParams.setMargins(iK, iK, iK, iK);
        cybVar.setLayoutParams(layoutParams);
        qe7.H(cybVar, 300L, new t8(1, this));
        e9i.j0(new fz6(x1().i, new fze(cybVar, this, (lq4) null, 1), 3), getViewLifecycleScope());
        return Collections.singletonList(cybVar);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen, one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        e9i.j0(new fz6(n1g.v(((za) x1().d).g, getViewLifecycleOwner().f(), n09.d), new ab((lq4) null, this), 3), getViewLifecycleScope());
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final pyc p1() {
        return (s8a) this.m.getAccessor().c(985);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Widget q1(t3f t3fVar) {
        zv8[] zv8VarArr = r;
        zv8 zv8Var = zv8VarArr[0];
        long jLongValue = ((Number) this.j.a(this)).longValue();
        zv8 zv8Var2 = zv8VarArr[1];
        return new PickerMembersListWidget(t3fVar, jLongValue, true, py2.c, ((Boolean) this.k.a(this)).booleanValue());
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final rcc r1(Context context, int i) {
        rcc rccVar = new rcc(context);
        rccVar.setId(i);
        rccVar.setTitle(((za) x1().d).i ? R.string.oneme_profile_add_members_toolbar_title_channel : R.string.oneme_profile_add_members_toolbar_title);
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new wbc(new m(6, this)));
        return rccVar;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final dzc s1() {
        zv8 zv8Var = r[0];
        long jLongValue = ((Number) this.j.a(this)).longValue();
        wtc wtcVar = this.m;
        return new za(jLongValue, wtcVar.a(), wtcVar.getAccessor().d(23), wtcVar.getAccessor().d(97));
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final gjg t1() {
        return this.o;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final int w1() {
        return R.id.profile_add_members_toolbar;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final m8b z1(Bundle bundle) {
        long[] longArray = bundle.getLongArray("selected_ids");
        m8b m8bVarH0 = longArray != null ? rx8.h0(longArray) : null;
        return m8bVarH0 == null ? ui9.a : m8bVarH0;
    }

    public AddChatMembersScreen(long j, boolean z, ha9 ha9Var) {
        this(n1g.i(new ylc("chat_id", Long.valueOf(j)), new ylc("is_chat", Boolean.valueOf(z)), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
