package one.me.profile.screens.addadmins;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.aac;
import defpackage.acc;
import defpackage.d4f;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.g8c;
import defpackage.ha9;
import defpackage.j8e;
import defpackage.kcc;
import defpackage.ks6;
import defpackage.lq4;
import defpackage.lvb;
import defpackage.m;
import defpackage.n09;
import defpackage.n1g;
import defpackage.n9a;
import defpackage.nbh;
import defpackage.nl9;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.p7c;
import defpackage.pq;
import defpackage.r;
import defpackage.rcc;
import defpackage.rx8;
import defpackage.sa;
import defpackage.sfd;
import defpackage.t3f;
import defpackage.ta;
import defpackage.tre;
import defpackage.va;
import defpackage.vv;
import defpackage.wa;
import defpackage.wtc;
import defpackage.xbc;
import defpackage.y8j;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/profile/screens/addadmins/AddChatAdminsScreen;", "Lone/me/sdk/arch/Widget;", "Lp7c;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "Lha9;", "localAccountId", "(JLha9;)V", "profile"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AddChatAdminsScreen extends Widget implements p7c {
    public static final /* synthetic */ zv8[] l = {new dwd(AddChatAdminsScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), zo5.f(zfe.a, AddChatAdminsScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new dwd(AddChatAdminsScreen.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};
    public final vv a;
    public final t3f b;
    public final wtc c;
    public final ks6 d;
    public final oi8 e;
    public final ny8 f;
    public final j8e g;
    public final j8e h;
    public final List i;
    public final ny8 j;
    public g8c k;

    public AddChatAdminsScreen(Bundle bundle) {
        super(bundle);
        this.a = new vv("profile:add_admins:chat_id", Long.class);
        this.b = new t3f(nbh.s(o1(), "profile:add_admins:{", "}"), super.getB().b());
        this.c = new wtc(m35getAccountScopeuqN4xOY());
        this.d = tre.G(this, new va(0));
        this.e = oi8.f;
        this.f = createViewModelLazy(n9a.class, new r(4, new wa(this, 0)));
        this.g = viewBinding(R.id.profile_add_admins_toolbar);
        this.h = viewBinding(R.id.profile_add_admins_view_pager);
        this.i = Collections.singletonList(new ta());
        this.j = rx8.P(3, new wa(this, 1));
    }

    @Override // defpackage.p7c
    public final void E0(CharSequence charSequence) {
        ((n9a) this.f.getValue()).F(String.valueOf(charSequence));
    }

    @Override // defpackage.p7c
    public final void X() {
        ((n9a) this.f.getValue()).F(null);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getB() {
        return this.e;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScopeId, reason: from getter */
    public final t3f getB() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.d;
    }

    @Override // defpackage.p7c
    public final void o() {
        ((n9a) this.f.getValue()).F(null);
    }

    public final long o1() {
        zv8 zv8Var = l[0];
        return ((Number) this.a.a(this)).longValue();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        rcc rccVar = new rcc(linearLayout.getContext());
        rccVar.setId(R.id.profile_add_admins_toolbar);
        rccVar.setTitle(R.string.profile_add_admins_toolbar);
        rccVar.setLeftActions(new xbc(new m(5, this)));
        rccVar.setRightActions(new acc(null, new kcc(this), null));
        linearLayout.addView(rccVar);
        aac aacVar = new aac(linearLayout.getContext());
        aacVar.setId(R.id.profile_add_admins_tabs);
        aacVar.setLayoutParams(new pq());
        aacVar.setTabMode(1);
        aacVar.setElevation(yl5.d().getDisplayMetrics().density * 10.0f);
        aacVar.setVisibility(8);
        linearLayout.addView(aacVar);
        y8j y8jVar = new y8j(linearLayout.getContext());
        y8jVar.setId(R.id.profile_add_admins_view_pager);
        y8jVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        lvb.m0(y8jVar);
        linearLayout.addView(y8jVar);
        return linearLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        nl9.c(p1());
        if (!requireActivity().isChangingConfigurations()) {
            ((y8j) this.h.m(this, l[2])).setAdapter(null);
        }
        this.k = null;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        y8j y8jVar = (y8j) this.h.m(this, l[2]);
        y8jVar.setAdapter((sa) this.j.getValue());
        y8jVar.setOffscreenPageLimit(1);
        e9i.j0(new fz6(n1g.v(((n9a) this.f.getValue()).f, getViewLifecycleOwner().f(), n09.d), new sfd(3, (lq4) null, this), 3), getViewLifecycleScope());
    }

    public final rcc p1() {
        return (rcc) this.g.m(this, l[1]);
    }

    public AddChatAdminsScreen(long j, ha9 ha9Var) {
        this(n1g.i(new ylc("profile:add_admins:chat_id", Long.valueOf(j)), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
