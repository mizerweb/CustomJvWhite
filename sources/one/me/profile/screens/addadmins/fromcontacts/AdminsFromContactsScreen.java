package one.me.profile.screens.addadmins.fromcontacts;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a76;
import defpackage.c;
import defpackage.c0a;
import defpackage.ce;
import defpackage.de;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.h47;
import defpackage.i19;
import defpackage.ie;
import defpackage.j8e;
import defpackage.je;
import defpackage.m;
import defpackage.n09;
import defpackage.n1g;
import defpackage.n9a;
import defpackage.ny8;
import defpackage.p3c;
import defpackage.pvh;
import defpackage.qo7;
import defpackage.r;
import defpackage.t3f;
import defpackage.tre;
import defpackage.vv;
import defpackage.wtc;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zpg;
import defpackage.zv8;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/profile/screens/addadmins/fromcontacts/AdminsFromContactsScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "", ApiProtocol.PARAM_CHAT_ID, "(Lt3f;J)V", "profile"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AdminsFromContactsScreen extends Widget {
    public static final /* synthetic */ zv8[] k = {new dwd(AdminsFromContactsScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), zo5.f(zfe.a, AdminsFromContactsScreen.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), new dwd(AdminsFromContactsScreen.class, "emptySearchView", "getEmptySearchView()Lone/me/sdk/uikit/common/views/EmptySearchView;", 0)};
    public final wtc a;
    public final vv b;
    public final ny8 c;
    public final ny8 d;
    public final j8e e;
    public final j8e f;
    public pvh g;
    public zpg h;
    public final ExecutorService i;
    public final h47 j;

    public AdminsFromContactsScreen(Bundle bundle) {
        super(bundle);
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.a = wtcVar;
        this.b = new vv("profile:add_admins_from_contacts:chat_id", Long.class);
        Object objF0 = tre.f0(bundle, "arg_scope_id", t3f.class);
        if (objF0 == null) {
            c.o(c0a.o("No value passed for key arg_scope_id of type ", t3f.class.getSimpleName(), " in bundle"));
            throw null;
        }
        this.c = getSharedViewModel((t3f) ((Parcelable) objF0), n9a.class, null);
        this.d = createViewModelLazy(je.class, new r(8, new qo7(10, this)));
        this.e = viewBinding(R.id.profile_add_admins_from_contacts_list);
        this.f = viewBinding(R.id.profile_add_admins_empty_search_view);
        ExecutorService executorServiceA = wtcVar.getExecutors().a();
        this.i = executorServiceA;
        this.j = new h47(this, executorServiceA, 2);
    }

    public final void o1(RecyclerView recyclerView) {
        zpg zpgVar = new zpg(recyclerView, this.j, new p3c(11, new m(10, this)));
        this.h = zpgVar;
        recyclerView.h(zpgVar, -1);
        n1g.N(new ce(zpgVar, null, 0), recyclerView);
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        RecyclerView recyclerView = new RecyclerView(frameLayout.getContext());
        recyclerView.setId(R.id.profile_add_admins_from_contacts_list);
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(this.j);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setClipToPadding(false);
        this.g = tre.Y(recyclerView);
        o1(recyclerView);
        frameLayout.addView(recyclerView);
        a76 a76Var = new a76(frameLayout.getContext());
        a76Var.setId(R.id.profile_add_admins_empty_search_view);
        a76Var.setGravity(17);
        a76Var.setTitle(R.string.oneme_empty_search_title);
        a76Var.setDescription(R.string.oneme_empty_search_subtitle);
        a76Var.setIsButtonVisible(false);
        frameLayout.addView(a76Var);
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        pvh pvhVar = this.g;
        if (pvhVar != null) {
            pvhVar.b(p1());
        }
        this.g = null;
        this.h = null;
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        ie ieVar = ((je) this.d.getValue()).i;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        int i = 3;
        e9i.j0(new fz6(n1g.v(ieVar, i19VarF, n09Var), new de(null, this, 0), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((n9a) this.c.getValue()).k, getViewLifecycleOwner().f(), n09Var), new de(null, this, 1), i), getViewLifecycleScope());
    }

    public final RecyclerView p1() {
        return (RecyclerView) this.e.m(this, k[1]);
    }

    public AdminsFromContactsScreen(t3f t3fVar, long j) {
        this(n1g.i(new ylc("arg_scope_id", t3fVar), new ylc("profile:add_admins_from_contacts:chat_id", Long.valueOf(j)), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(t3fVar.b().a))));
    }
}
