package one.me.chats.picker.stories;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.ayb;
import defpackage.bb;
import defpackage.ca2;
import defpackage.cyb;
import defpackage.d97;
import defpackage.dzc;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.gjg;
import defpackage.gm0;
import defpackage.gwc;
import defpackage.ha9;
import defpackage.iua;
import defpackage.jsc;
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
import defpackage.ui9;
import defpackage.vv;
import defpackage.wbc;
import defpackage.wsc;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.ywc;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zwc;
import defpackage.zxb;
import java.util.Collections;
import kotlin.Metadata;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B#\b\u0016\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/chats/picker/stories/PickStoryPresetScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Lywc;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "", "titleRes", "", "preselectedIds", "Lha9;", "localAccountId", "(I[JLha9;)V", "chats-list"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PickStoryPresetScreen extends AbstractPickerScreen<ywc> {
    public static final /* synthetic */ zv8[] o = {new z8b(PickStoryPresetScreen.class, "selectedIds", "getSelectedIds()[J"), zo5.f(zfe.a, PickStoryPresetScreen.class, "titleRes", "getTitleRes()I", 0)};
    public final vv j;
    public final vv k;
    public final ca2 l;
    public final ny8 m;
    public final mjg n;

    public PickStoryPresetScreen(Bundle bundle) {
        super(bundle);
        this.j = new vv("selected_ids", long[].class);
        this.k = new vv("title_res", Integer.class);
        ca2 ca2Var = new ca2(m35getAccountScopeuqN4xOY());
        this.l = ca2Var;
        this.m = ca2Var.c();
        this.n = p90.a(new tnh(R.string.member_search_by_name_hint));
        e9i.j0(new fz6(x1().i, new zwc(this, (lq4) null), 3), getLifecycleScope());
        ln5 ln5Var = new ln5(this, new iua(22, this));
        if (getRouter() != null) {
            getRouter().a(ln5Var);
        } else {
            addLifecycleListener(new bb(this, ln5Var, 13));
        }
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Iterable o1() {
        cyb cybVar = new cyb(getContext());
        cybVar.setId(R.id.oneme_stories_preset_screen_save_button);
        cybVar.setSize(ayb.g);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setText(np4.q(getContext(), R.string.picker_chats_add_button));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        layoutParams.setMargins(iK, iK, iK, iK);
        cybVar.setLayoutParams(layoutParams);
        qe7.H(cybVar, 300L, new gwc(1, this));
        e9i.j0(new fz6(n1g.v(x1().i, getViewLifecycleOwner().f(), n09.d), new d97((lq4) null, cybVar, this, 20), 3), getViewLifecycleScope());
        return Collections.singletonList(cybVar);
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 156) {
            wsc wscVar = (wsc) this.m.getValue();
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
        e9i.j0(new fz6(n1g.v(((ywc) x1().d).e, getViewLifecycleOwner().f(), n09.d), new zwc((lq4) null, this), 3), getViewLifecycleScope());
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final pyc p1() {
        return (s8a) this.l.getAccessor().c(985);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Widget q1(t3f t3fVar) {
        return new PickerMembersListWidget(t3fVar, 0L, false, py2.d, true, 6, null);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final rcc r1(Context context, int i) {
        rcc rccVar = new rcc(context);
        rccVar.setId(i);
        zv8 zv8Var = o[1];
        rccVar.setTitle(((Number) this.k.a(this)).intValue());
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new wbc(new lh9(24, this)));
        return rccVar;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final dzc s1() {
        ca2 ca2Var = this.l;
        return new ywc(ca2Var.getAccessor().d(132), ca2Var.e(), ca2Var.c());
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final gjg t1() {
        return this.n;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final int w1() {
        return R.id.oneme_stories_preset_picker_toolbar;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final m8b z1(Bundle bundle) {
        long[] longArray = bundle.getLongArray("selected_ids");
        m8b m8bVarH0 = longArray != null ? rx8.h0(longArray) : null;
        return m8bVarH0 == null ? ui9.a : m8bVarH0;
    }

    public PickStoryPresetScreen(int i, long[] jArr, ha9 ha9Var) {
        this(n1g.i(new ylc("title_res", Integer.valueOf(i)), new ylc("selected_ids", jArr), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
