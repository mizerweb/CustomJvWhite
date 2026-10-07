package one.me.startconversation.chat;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.ayb;
import defpackage.bb;
import defpackage.cyb;
import defpackage.d4f;
import defpackage.d97;
import defpackage.dzc;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.gjf;
import defpackage.gjg;
import defpackage.gm0;
import defpackage.gvc;
import defpackage.gwc;
import defpackage.ha9;
import defpackage.hwc;
import defpackage.iua;
import defpackage.iwc;
import defpackage.jsc;
import defpackage.ks6;
import defpackage.lh9;
import defpackage.ln5;
import defpackage.lq4;
import defpackage.m8b;
import defpackage.mjg;
import defpackage.n09;
import defpackage.n1g;
import defpackage.np4;
import defpackage.ny8;
import defpackage.p90;
import defpackage.py2;
import defpackage.pyc;
import defpackage.qe7;
import defpackage.rcc;
import defpackage.rx8;
import defpackage.s8a;
import defpackage.svj;
import defpackage.t3f;
import defpackage.tnh;
import defpackage.tre;
import defpackage.ui9;
import defpackage.vv;
import defpackage.wbc;
import defpackage.wsc;
import defpackage.wtc;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zv8;
import defpackage.zxb;
import java.util.Collections;
import kotlin.Metadata;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/startconversation/chat/PickChatMembers;", "Lone/me/chats/picker/AbstractPickerScreen;", "Liwc;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "start-conversation"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PickChatMembers extends AbstractPickerScreen<iwc> {
    public static final /* synthetic */ zv8[] p;
    public final vv j;
    public final wtc k;
    public final ny8 l;
    public final gjf m;
    public final ks6 n;
    public final mjg o;

    static {
        z8b z8bVar = new z8b(PickChatMembers.class, "selectedIds", "getSelectedIds()[J");
        zfe.a.getClass();
        p = new zv8[]{z8bVar};
    }

    public PickChatMembers(Bundle bundle) {
        super(bundle);
        this.j = new vv("selected_ids", long[].class);
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.k = wtcVar;
        this.l = wtcVar.getAccessor().d(34);
        this.m = wtcVar.g();
        this.n = tre.G(this, new gvc(1));
        this.o = p90.a(new tnh(R.string.oneme_startconversations_member_search_hint));
        e9i.j0(new fz6(x1().i, new hwc(this, (lq4) null), 3), getLifecycleScope());
        ln5 ln5Var = new ln5(this, new iua(21, this));
        if (getRouter() != null) {
            getRouter().a(ln5Var);
        } else {
            addLifecycleListener(new bb(this, ln5Var, 12));
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.n;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Iterable o1() {
        cyb cybVar = new cyb(getContext());
        cybVar.setId(R.id.oneme_startconversation_confirm_add_subscribers_button);
        cybVar.setSize(ayb.g);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setText(np4.q(getContext(), R.string.picker_chats_add_button));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        layoutParams.setMargins(iK, iK, iK, iK);
        cybVar.setLayoutParams(layoutParams);
        qe7.H(cybVar, 300L, new gwc(0, this));
        e9i.j0(new fz6(x1().i, new d97(cybVar, this, (lq4) null, 19), 3), getViewLifecycleScope());
        return Collections.singletonList(cybVar);
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 156) {
            wsc wscVar = (wsc) this.l.getValue();
            svj svjVar = new svj(this, 1);
            String[] strArr2 = wsc.f;
            jsc jscVar = new jsc(R.drawable.contacts_avd);
            wscVar.getClass();
            wsc.u(svjVar, strArr, iArr, strArr2, R.string.permissions_contacts_request, R.string.permissions_contacts_request_denied, jscVar);
        }
    }

    @Override // one.me.chats.picker.AbstractPickerScreen, one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        e9i.j0(new fz6(n1g.v(((iwc) x1().d).e, getViewLifecycleOwner().f(), n09.d), new hwc((lq4) null, this), 3), getViewLifecycleScope());
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final pyc p1() {
        return (s8a) this.k.getAccessor().c(985);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Widget q1(t3f t3fVar) {
        return new PickerMembersListWidget(t3fVar, 0L, false, py2.d, true, 6, null);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final rcc r1(Context context, int i) {
        rcc rccVar = new rcc(context);
        rccVar.setId(i);
        rccVar.setTitle(R.string.oneme_startconversations_chat_members);
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new wbc(new lh9(22, this)));
        return rccVar;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final dzc s1() {
        wtc wtcVar = this.k;
        return new iwc(wtcVar.getAccessor().d(132), wtcVar.getAccessor().d(23), wtcVar.getAccessor().d(34));
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final gjg t1() {
        return this.o;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final int w1() {
        return R.id.oneme_startconversation_chat_toolbar;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final m8b z1(Bundle bundle) {
        long[] longArray = bundle.getLongArray("selected_ids");
        m8b m8bVarH0 = longArray != null ? rx8.h0(longArray) : null;
        return m8bVarH0 == null ? ui9.a : m8bVarH0;
    }

    public PickChatMembers(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
