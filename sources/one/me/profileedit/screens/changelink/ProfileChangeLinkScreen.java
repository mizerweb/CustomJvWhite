package one.me.profileedit.screens.changelink;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import defpackage.a2c;
import defpackage.a8d;
import defpackage.cyb;
import defpackage.d4f;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.et4;
import defpackage.fz6;
import defpackage.g8c;
import defpackage.gn;
import defpackage.gq2;
import defpackage.ha9;
import defpackage.hta;
import defpackage.i19;
import defpackage.j8e;
import defpackage.jz;
import defpackage.k9d;
import defpackage.ks6;
import defpackage.lp0;
import defpackage.lq4;
import defpackage.mc4;
import defpackage.ml9;
import defpackage.mnd;
import defpackage.n09;
import defpackage.n1g;
import defpackage.nnd;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.osk;
import defpackage.pw3;
import defpackage.qld;
import defpackage.rq;
import defpackage.sld;
import defpackage.t5d;
import defpackage.tld;
import defpackage.tre;
import defpackage.vp4;
import defpackage.vv;
import defpackage.wtc;
import defpackage.ylc;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.rlottie.RLottieDrawable;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB)\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0007\u0010\u0011¨\u0006\u0012"}, d2 = {"Lone/me/profileedit/screens/changelink/ProfileChangeLinkScreen;", "Lone/me/sdk/arch/Widget;", "Lmc4;", "", "Lvp4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "Lnnd;", "type", "Lmnd;", "flow", "Lha9;", "localAccountId", "(JLnnd;Lmnd;Lha9;)V", "profile-edit"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ProfileChangeLinkScreen extends Widget implements mc4, vp4 {
    public static final /* synthetic */ zv8[] t = {new dwd(ProfileChangeLinkScreen.class, "flowType", "getFlowType()Lone/me/profileedit/deeplink/ProfileEditDeepLinkRoutes$FlowType;", 0), zo5.f(zfe.a, ProfileChangeLinkScreen.class, "idType", "getIdType()Lone/me/profileedit/deeplink/ProfileEditDeepLinkRoutes$Type;", 0), new dwd(ProfileChangeLinkScreen.class, "shortLinkMoreButton", "getShortLinkMoreButton()Landroid/widget/ImageView;", 0), new dwd(ProfileChangeLinkScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new dwd(ProfileChangeLinkScreen.class, "button", "getButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new dwd(ProfileChangeLinkScreen.class, "collapsibleContent", "getCollapsibleContent()Landroid/widget/LinearLayout;", 0), new dwd(ProfileChangeLinkScreen.class, "appBarLayout", "getAppBarLayout()Lcom/google/android/material/appbar/AppBarLayout;", 0), new dwd(ProfileChangeLinkScreen.class, "headerIcon", "getHeaderIcon()Landroid/widget/ImageView;", 0), new dwd(ProfileChangeLinkScreen.class, "headerTitle", "getHeaderTitle()Landroid/widget/TextView;", 0), new z8b(ProfileChangeLinkScreen.class, "lastLottieUrl", "getLastLottieUrl()Ljava/lang/String;")};
    public final vv a;
    public final vv b;
    public final wtc c;
    public final ks6 d;
    public final oi8 e;
    public final ny8 f;
    public final lp0 g;
    public final j8e h;
    public final j8e i;
    public final j8e j;
    public final j8e k;
    public final j8e l;
    public final j8e m;
    public final j8e n;
    public g8c o;
    public RLottieDrawable p;
    public final t5d q;
    public final pw3 r;
    public final gn s;

    public ProfileChangeLinkScreen(Bundle bundle) {
        super(bundle);
        this.a = new vv("entity:flow_type", mnd.class);
        this.b = new vv("entity:id_type", nnd.class);
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.c = wtcVar;
        this.d = tre.G(this, new a8d(10, this));
        this.e = oi8.f;
        this.f = createViewModelLazy(gq2.class, new hta(21, new k9d(this, 5, bundle)));
        this.g = new lp0(((a2c) wtcVar.getAccessor().c(27)).a(), this);
        this.h = viewBinding(R.id.profile_edit_short_link_input_button);
        this.i = viewBinding(R.id.profile_edit_short_link_toolbar);
        this.j = viewBinding(R.id.profile_edit_shortlink_confirm_button);
        this.k = viewBinding(R.id.profile_edit_shortlink_collapsing_content);
        this.l = viewBinding(R.id.profile_edit_shortlink_app_bar_layout);
        this.m = viewBinding(R.id.profile_edit_shortlink_header_icon);
        this.n = viewBinding(R.id.profile_edit_shortlink_header_title);
        this.q = new t5d(3, this);
        this.r = new pw3(1, this);
        this.s = new gn(5, this);
        e9i.j0(new fz6(s1().e, new sld(this, (lq4) null, 0), 3), getLifecycleScope());
        e9i.j0(new fz6(s1().i, new sld(this, (lq4) null, 1), 3), getLifecycleScope());
    }

    public static final cyb o1(ProfileChangeLinkScreen profileChangeLinkScreen) {
        return (cyb) profileChangeLinkScreen.j.m(profileChangeLinkScreen, t[4]);
    }

    @Override // defpackage.vp4
    public final void E(int i, Bundle bundle) {
        s1().c.i(i);
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        s1().c.h(i);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getI() {
        return this.e;
    }

    @Override // one.me.sdk.arch.Widget
    public final d4f getScreenDelegate() {
        return this.d;
    }

    @Override // defpackage.br4
    public final boolean handleBack() {
        ml9.b(this);
        return super.handleBack();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        qld qldVar = new qld(this, 0);
        et4 et4Var = new et4(getContext());
        et4Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        n1g.N(new tld(3, null, 0), et4Var);
        qldVar.invoke(et4Var);
        return et4Var;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        ((rq) this.l.m(this, t[6])).f(this.r);
        super.onDestroyView(view);
    }

    @Override // defpackage.br4
    public final void onDetach(View view) {
        if (p1().getVisibility() == 0) {
            osk.e(r1(), this.s);
        }
        super.onDetach(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        ((rq) this.l.m(this, t[6])).a(this.r);
        RLottieDrawable rLottieDrawable = this.p;
        if (rLottieDrawable != null && !rLottieDrawable.isRecycled()) {
            r1().setImageDrawable(rLottieDrawable);
        }
        jz jzVar = new jz(s1().g, 13);
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(jzVar, i19VarF, n09Var), new sld((lq4) null, this, 2), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(s1().h, getViewLifecycleOwner().f(), n09Var), new sld((lq4) null, this, 3), 3), getViewLifecycleScope());
    }

    public final LinearLayout p1() {
        return (LinearLayout) this.k.m(this, t[5]);
    }

    public final mnd q1() {
        zv8 zv8Var = t[0];
        return (mnd) this.a.a(this);
    }

    public final ImageView r1() {
        return (ImageView) this.m.m(this, t[7]);
    }

    public final gq2 s1() {
        return (gq2) this.f.getValue();
    }

    public ProfileChangeLinkScreen(long j, nnd nndVar, mnd mndVar, ha9 ha9Var) {
        this(n1g.i(new ylc("entity:id", Long.valueOf(j)), new ylc("entity:id_type", nndVar), new ylc("entity:flow_type", mndVar), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
