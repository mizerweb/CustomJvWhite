package one.me.startconversation.channel;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.af7;
import defpackage.bb;
import defpackage.cyb;
import defpackage.dwd;
import defpackage.dxc;
import defpackage.dzc;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.gjg;
import defpackage.ha9;
import defpackage.ifh;
import defpackage.ixc;
import defpackage.kxc;
import defpackage.ln5;
import defpackage.m8b;
import defpackage.mjg;
import defpackage.n1g;
import defpackage.ow0;
import defpackage.p90;
import defpackage.py2;
import defpackage.pyc;
import defpackage.rcc;
import defpackage.rx8;
import defpackage.s8a;
import defpackage.t3f;
import defpackage.tnh;
import defpackage.ui9;
import defpackage.vv;
import defpackage.wbc;
import defpackage.wtc;
import defpackage.ylc;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import java.util.Collections;
import kotlin.Metadata;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.sdk.arch.Widget;
import one.me.startconversation.channel.PickSubscribersScreen;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/startconversation/channel/PickSubscribersScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Ldxc;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "Lha9;", "localAccountId", "(JLha9;)V", "start-conversation"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PickSubscribersScreen extends AbstractPickerScreen<dxc> {
    public static final /* synthetic */ zv8[] p = {new z8b(PickSubscribersScreen.class, "selectedIds", "getSelectedIds()[J"), zo5.f(zfe.a, PickSubscribersScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), new dwd(PickSubscribersScreen.class, "confirmButton", "getConfirmButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final vv j;
    public final vv k;
    public final wtc l;
    public final ifh m;
    public final mjg n;
    public final ow0 o;

    public PickSubscribersScreen(Bundle bundle) {
        super(bundle);
        this.j = new vv("selected_ids", long[].class);
        this.k = new vv("id", Long.class);
        this.l = new wtc(m35getAccountScopeuqN4xOY());
        final int i = 0;
        this.m = new ifh(new af7(this) { // from class: jxc
            public final /* synthetic */ PickSubscribersScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                PickSubscribersScreen pickSubscribersScreen = this.b;
                switch (i2) {
                    case 0:
                        return pickSubscribersScreen.l.g();
                    case 1:
                        zv8[] zv8VarArr = PickSubscribersScreen.p;
                        cyb cybVar = new cyb(pickSubscribersScreen.getContext());
                        cybVar.setId(R.id.oneme_startconversation_confirm_add_subscribers_button);
                        cybVar.setSize(ayb.g);
                        cybVar.setAppearance(zxb.PRIMARY);
                        cybVar.setText(np4.q(pickSubscribersScreen.getContext(), R.string.picker_chats_add_button));
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                        layoutParams.setMargins(iK, iK, iK, iK);
                        cybVar.setLayoutParams(layoutParams);
                        return cybVar;
                    default:
                        zv8[] zv8VarArr2 = PickSubscribersScreen.p;
                        int i3 = uw8.a;
                        if (uw8.b(uw8.c)) {
                            ml9.b(pickSubscribersScreen);
                        }
                        return sbi.a;
                }
            }
        });
        this.n = p90.a(new tnh(R.string.oneme_startconversations_member_search_hint));
        final int i2 = 1;
        this.o = binding(new af7(this) { // from class: jxc
            public final /* synthetic */ PickSubscribersScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                PickSubscribersScreen pickSubscribersScreen = this.b;
                switch (i3) {
                    case 0:
                        return pickSubscribersScreen.l.g();
                    case 1:
                        zv8[] zv8VarArr = PickSubscribersScreen.p;
                        cyb cybVar = new cyb(pickSubscribersScreen.getContext());
                        cybVar.setId(R.id.oneme_startconversation_confirm_add_subscribers_button);
                        cybVar.setSize(ayb.g);
                        cybVar.setAppearance(zxb.PRIMARY);
                        cybVar.setText(np4.q(pickSubscribersScreen.getContext(), R.string.picker_chats_add_button));
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                        layoutParams.setMargins(iK, iK, iK, iK);
                        cybVar.setLayoutParams(layoutParams);
                        return cybVar;
                    default:
                        zv8[] zv8VarArr2 = PickSubscribersScreen.p;
                        int i4 = uw8.a;
                        if (uw8.b(uw8.c)) {
                            ml9.b(pickSubscribersScreen);
                        }
                        return sbi.a;
                }
            }
        });
        e9i.j0(new fz6(x1().i, new kxc(this, null, 0), 3), getLifecycleScope());
        final int i3 = 2;
        ln5 ln5Var = new ln5(this, new af7(this) { // from class: jxc
            public final /* synthetic */ PickSubscribersScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                PickSubscribersScreen pickSubscribersScreen = this.b;
                switch (i4) {
                    case 0:
                        return pickSubscribersScreen.l.g();
                    case 1:
                        zv8[] zv8VarArr = PickSubscribersScreen.p;
                        cyb cybVar = new cyb(pickSubscribersScreen.getContext());
                        cybVar.setId(R.id.oneme_startconversation_confirm_add_subscribers_button);
                        cybVar.setSize(ayb.g);
                        cybVar.setAppearance(zxb.PRIMARY);
                        cybVar.setText(np4.q(pickSubscribersScreen.getContext(), R.string.picker_chats_add_button));
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                        layoutParams.setMargins(iK, iK, iK, iK);
                        cybVar.setLayoutParams(layoutParams);
                        return cybVar;
                    default:
                        zv8[] zv8VarArr2 = PickSubscribersScreen.p;
                        int i5 = uw8.a;
                        if (uw8.b(uw8.c)) {
                            ml9.b(pickSubscribersScreen);
                        }
                        return sbi.a;
                }
            }
        });
        if (getRouter() != null) {
            getRouter().a(ln5Var);
        } else {
            addLifecycleListener(new bb(this, ln5Var, 14));
        }
    }

    public final cyb A1() {
        zv8 zv8Var = p[2];
        return (cyb) this.o.getValue();
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Iterable o1() {
        e9i.j0(new fz6(x1().i, new kxc(this, null, 1), 3), getViewLifecycleScope());
        return Collections.singletonList(A1());
    }

    @Override // one.me.chats.picker.AbstractPickerScreen, one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        e9i.j0(new fz6(((dxc) x1().d).h, new kxc(this, null, 2), 3), getViewLifecycleScope());
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final pyc p1() {
        return (s8a) this.l.getAccessor().c(985);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Widget q1(t3f t3fVar) {
        return new PickerMembersListWidget(t3fVar, 0L, false, py2.d, false, 6, null);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final rcc r1(Context context, int i) {
        rcc rccVar = new rcc(context);
        rccVar.setId(i);
        rccVar.setTitle(R.string.oneme_startconversation_channel_select_subscribers_toolbar_title);
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new wbc(new ixc(this, 0)));
        return rccVar;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final dzc s1() {
        zv8 zv8Var = p[1];
        long jLongValue = ((Number) this.k.a(this)).longValue();
        wtc wtcVar = this.l;
        return new dxc(jLongValue, wtcVar.getAccessor().d(146), wtcVar.getAccessor().d(23), wtcVar.getAccessor().d(144), wtcVar.getAccessor().d(1021), wtcVar.getAccessor().d(24));
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final gjg t1() {
        return this.n;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final int w1() {
        return R.id.oneme_startconversation_select_channel_subscribers_toolbar;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final m8b z1(Bundle bundle) {
        long[] longArray = bundle.getLongArray("selected_ids");
        m8b m8bVarH0 = longArray != null ? rx8.h0(longArray) : null;
        return m8bVarH0 == null ? ui9.a : m8bVarH0;
    }

    public PickSubscribersScreen(long j, ha9 ha9Var) {
        this(n1g.i(new ylc("id", Long.valueOf(j)), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
