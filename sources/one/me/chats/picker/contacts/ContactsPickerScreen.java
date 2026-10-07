package one.me.chats.picker.contacts;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.ao4;
import defpackage.ayb;
import defpackage.bb;
import defpackage.ca2;
import defpackage.co4;
import defpackage.cyb;
import defpackage.do4;
import defpackage.dwd;
import defpackage.dzc;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.fze;
import defpackage.gcc;
import defpackage.gjg;
import defpackage.gm0;
import defpackage.gu4;
import defpackage.ha9;
import defpackage.ifh;
import defpackage.ih;
import defpackage.j22;
import defpackage.ke3;
import defpackage.ln5;
import defpackage.lq4;
import defpackage.m8b;
import defpackage.mc4;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.np4;
import defpackage.ny8;
import defpackage.p90;
import defpackage.pbb;
import defpackage.pe3;
import defpackage.pyc;
import defpackage.qe7;
import defpackage.rcc;
import defpackage.sol;
import defpackage.t3f;
import defpackage.t8;
import defpackage.tnh;
import defpackage.ui9;
import defpackage.vv;
import defpackage.xbc;
import defpackage.xde;
import defpackage.xhh;
import defpackage.y3f;
import defpackage.yab;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zxb;
import java.util.Collections;
import kotlin.Metadata;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB)\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0007\u0010\u0011¨\u0006\u0012"}, d2 = {"Lone/me/chats/picker/contacts/ContactsPickerScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Ldo4;", "Lpbb;", "Lmc4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "requestCode", "Lha9;", "localAccountId", "", ApiProtocol.PARAM_CHAT_ID, "Lt3f;", "chatScopeId", "(ILha9;JLt3f;)V", "chats-list"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ContactsPickerScreen extends AbstractPickerScreen<do4> implements pbb, mc4 {
    public static final /* synthetic */ zv8[] o = {new dwd(ContactsPickerScreen.class, "requestCode", "getRequestCode()I", 0), zo5.f(zfe.a, ContactsPickerScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), new dwd(ContactsPickerScreen.class, "chatScopeId", "getChatScopeId()Lone/me/sdk/arch/store/ScopeId;", 0)};
    public final vv j;
    public final vv k;
    public final vv l;
    public final ca2 m;
    public final xde n;

    public ContactsPickerScreen(Bundle bundle) {
        super(bundle);
        this.j = new vv(Integer.class, 0, "contacts.picker.request_code.key");
        this.k = new vv(Long.class, 0L, "contacts.picker.chat_id.key");
        this.l = new vv(t3f.class, t3f.e, "contacts.picker.chat_scope_id.key");
        ca2 ca2Var = new ca2(m35getAccountScopeuqN4xOY());
        this.m = ca2Var;
        ln5 ln5Var = new ln5(this, new pe3(15, this));
        if (getRouter() != null) {
            getRouter().a(ln5Var);
        } else {
            addLifecycleListener(new bb(this, ln5Var, 1));
        }
        this.n = new xde(ca2Var.e(), (ny8) null, 6);
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        do4 do4Var = (do4) x1().d;
        if (i != R.id.oneme_contact_picker_confirm_send_message_positive) {
            do4Var.getClass();
        } else {
            gu4 gu4Var = do4Var.h;
            do4Var.i.B(do4Var, do4.l[0], gu4Var != null ? yab.h0(gu4Var, ((n0c) ((xhh) do4Var.e.getValue())).b(), 2, new co4(do4Var, null, 1)) : null);
        }
    }

    @Override // defpackage.pbb
    public final y3f o0() {
        return y3f.CHAT_SHARE_CONTACT;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Iterable o1() {
        cyb cybVar = new cyb(getContext());
        cybVar.setSize(ayb.g);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setText(np4.q(getContext(), R.string.contacts_picker_send_btn_title));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        layoutParams.setMargins(iK, iK, iK, iK);
        cybVar.setLayoutParams(layoutParams);
        qe7.H(cybVar, 300L, new t8(24, this));
        e9i.j0(new fz6(x1().i, new fze(cybVar, this, (lq4) null, 24), 3), getViewLifecycleScope());
        return Collections.singletonList(cybVar);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen, one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        n1g.N(new ao4(3, null, 0), view);
        e9i.j0(new fz6(n1g.v(((do4) x1().d).k, getViewLifecycleOwner().f(), n09.d), new ke3(14, (lq4) null, this), 3), getViewLifecycleScope());
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final pyc p1() {
        return new ih(this.m.getAccessor().d(942), this.n, false);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Widget q1(t3f t3fVar) {
        return new PickerContactsListWidget(t3fVar, null, 2, 0 == true ? 1 : 0);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final rcc r1(Context context, int i) {
        rcc rccVar = new rcc(context);
        rccVar.setId(i);
        rccVar.setTitle(R.string.contacts_picker_toolbar_title);
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new xbc(new j22(23, this)));
        return rccVar;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final dzc s1() {
        ca2 ca2Var = this.m;
        ifh ifhVarD = ca2Var.getAccessor().d(942);
        ny8 ny8VarE = ca2Var.e();
        ifh ifhVarD2 = ca2Var.getAccessor().d(144);
        ny8 ny8VarD = ca2Var.d();
        zv8[] zv8VarArr = o;
        zv8 zv8Var = zv8VarArr[1];
        long jLongValue = ((Number) this.k.a(this)).longValue();
        zv8 zv8Var2 = zv8VarArr[2];
        return new do4(ifhVarD, ny8VarE, ifhVarD2, ny8VarD, this.n, jLongValue, sol.b((t3f) this.l.a(this)));
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final gjg t1() {
        return p90.a(new tnh(R.string.contacts_picker_search_hint));
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final int w1() {
        return R.id.oneme_contacts_picker_toolbar;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final m8b z1(Bundle bundle) {
        return ui9.a;
    }

    public ContactsPickerScreen(int i, ha9 ha9Var, long j, t3f t3fVar) {
        this(n1g.i(new ylc("contacts.picker.request_code.key", Integer.valueOf(i)), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a)), new ylc("contacts.picker.chat_id.key", Long.valueOf(j)), new ylc("contacts.picker.chat_scope_id.key", t3fVar)));
    }
}
