package one.me.folders.picker;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.ayb;
import defpackage.bb;
import defpackage.cyb;
import defpackage.dwd;
import defpackage.dzc;
import defpackage.e47;
import defpackage.e9i;
import defpackage.el6;
import defpackage.euc;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.gjg;
import defpackage.gm0;
import defpackage.h;
import defpackage.ha9;
import defpackage.i1m;
import defpackage.ifh;
import defpackage.ln5;
import defpackage.lq4;
import defpackage.m8b;
import defpackage.mjg;
import defpackage.mp5;
import defpackage.n1g;
import defpackage.n37;
import defpackage.nei;
import defpackage.np4;
import defpackage.nv4;
import defpackage.o37;
import defpackage.oi8;
import defpackage.p90;
import defpackage.pyc;
import defpackage.qe7;
import defpackage.rcc;
import defpackage.rx8;
import defpackage.t3f;
import defpackage.tnh;
import defpackage.ui9;
import defpackage.vv;
import defpackage.wbc;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zxb;
import java.util.Collections;
import kotlin.Metadata;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.chats.PickerChatsListWidget;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B1\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0005\u0010\u0010¨\u0006\u0011"}, d2 = {"Lone/me/folders/picker/FolderMemberPickerScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Ln37;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "folderId", "resultTag", "", "filtersEnabled", "", "membersIds", "Lha9;", "localAccountId", "(Ljava/lang/String;Ljava/lang/String;Z[JLha9;)V", "folders"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FolderMemberPickerScreen extends AbstractPickerScreen<n37> {
    public static final /* synthetic */ zv8[] q = {new dwd(FolderMemberPickerScreen.class, "folderId", "getFolderId()Ljava/lang/String;", 0), zo5.f(zfe.a, FolderMemberPickerScreen.class, "tag", "getTag()Ljava/lang/String;", 0), new dwd(FolderMemberPickerScreen.class, "filtersEnabled", "getFiltersEnabled()Z", 0)};
    public final oi8 j;
    public final mjg k;
    public final h l;
    public final e47 m;
    public final vv n;
    public final vv o;
    public final vv p;

    public FolderMemberPickerScreen(Bundle bundle) {
        super(bundle);
        this.j = oi8.f;
        this.k = p90.a(new tnh(R.string.oneme_folders_picker_entity_search_hint));
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.l = hVar;
        this.m = new e47(hVar.getAccessor().d(23), hVar.getAccessor().d(144), z1(bundle));
        Class<String> cls = String.class;
        this.n = new vv("folder_id", cls);
        this.o = new vv("result_tag", cls);
        this.p = new vv("filters_enabled", Boolean.class);
        ln5 ln5Var = new ln5(this, new mp5(12, this));
        if (getRouter() != null) {
            getRouter().a(ln5Var);
        } else {
            addLifecycleListener(new bb(this, ln5Var, 5));
        }
    }

    @Override // one.me.chats.picker.AbstractPickerScreen, one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getJ() {
        return this.j;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Iterable o1() {
        cyb cybVar = new cyb(getContext());
        cybVar.setSize(ayb.g);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setText(np4.q(getContext(), R.string.to_save));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        layoutParams.setMargins(iK, iK, iK, iK);
        cybVar.setLayoutParams(layoutParams);
        qe7.H(cybVar, 300L, new o37(0, this));
        return Collections.singletonList(cybVar);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen, one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        e9i.j0(new fz6(((n37) x1().d).f, new el6(this, (lq4) null, 4), 3), getViewLifecycleScope());
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final pyc p1() {
        return new euc(this.m, new i1m(this.l.getAccessor().d(144)), (Object) null, 13);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Widget q1(t3f t3fVar) {
        zv8 zv8Var = q[2];
        return new PickerChatsListWidget("all.chat.folder", t3fVar, null, false, ((Boolean) this.p.a(this)).booleanValue(), false, false, 100, null);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final rcc r1(Context context, int i) {
        rcc rccVar = new rcc(context);
        rccVar.setId(i);
        rccVar.setTransitionName(context.getString(R.string.chat_list_toolbar_transition_name));
        rccVar.setTitle(R.string.oneme_folders_picker_entity_toolbar_title);
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new wbc(new nv4(12, this)));
        return rccVar;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final dzc s1() {
        h hVar = this.l;
        ifh ifhVarD = hVar.getAccessor().d(23);
        ifh ifhVarD2 = hVar.getAccessor().d(316);
        return new n37(this.m, (nei) hVar.getAccessor().c(1028), ifhVarD2, ifhVarD);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final gjg t1() {
        return this.k;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final int w1() {
        return R.id.oneme_folders_chats_picker_toolbar;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final m8b z1(Bundle bundle) {
        long[] longArray = bundle.getLongArray("preselected_ids");
        m8b m8bVarH0 = longArray != null ? rx8.h0(longArray) : null;
        return m8bVarH0 == null ? ui9.a : m8bVarH0;
    }

    public FolderMemberPickerScreen(String str, String str2, boolean z, long[] jArr, ha9 ha9Var) {
        this(n1g.i(new ylc("folder_id", str), new ylc("result_tag", str2), new ylc("filters_enabled", Boolean.valueOf(z)), new ylc("preselected_ids", jArr), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
