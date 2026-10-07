package one.me.stickersshowcase;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.a2c;
import defpackage.acc;
import defpackage.bdc;
import defpackage.bog;
import defpackage.chf;
import defpackage.dj9;
import defpackage.dwd;
import defpackage.dyd;
import defpackage.e97;
import defpackage.e9i;
import defpackage.ej9;
import defpackage.fz6;
import defpackage.g8c;
import defpackage.gcc;
import defpackage.gl1;
import defpackage.gm0;
import defpackage.gr4;
import defpackage.hcc;
import defpackage.hr4;
import defpackage.j8e;
import defpackage.k96;
import defpackage.kcc;
import defpackage.n1g;
import defpackage.ng7;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.ow0;
import defpackage.ptf;
import defpackage.q91;
import defpackage.r7d;
import defpackage.rcc;
import defpackage.t2g;
import defpackage.uog;
import defpackage.vog;
import defpackage.vv;
import defpackage.wbc;
import defpackage.wtc;
import defpackage.yl5;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zog;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/stickersshowcase/StickersShowcaseScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "stickers-showcase"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StickersShowcaseScreen extends Widget {
    public static final /* synthetic */ zv8[] m = {new dwd(StickersShowcaseScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), zo5.f(zfe.a, StickersShowcaseScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new dwd(StickersShowcaseScreen.class, "setsRecycler", "getSetsRecycler()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0)};
    public final vv a;
    public final wtc b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final dj9 f;
    public final j8e g;
    public final j8e h;
    public final ow0 i;
    public final ow0 j;
    public g8c k;
    public final bog l;

    public StickersShowcaseScreen(Bundle bundle) {
        super(bundle);
        this.a = new vv(Long.class, 0L, "chat_id");
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.b = wtcVar;
        this.c = createViewModelLazy(zog.class, new t2g(8, new uog(this, 0)));
        this.d = wtcVar.getAccessor().d(18);
        this.e = wtcVar.getAccessor().d(365);
        dj9 dj9Var = new dj9();
        this.f = dj9Var;
        this.g = viewBinding(R.id.oneme_stickers_showcase_toolbar);
        this.h = viewBinding(R.id.oneme_stickers_showcase_sets_list);
        this.i = binding(new uog(this, 1));
        this.j = binding(new uog(this, 2));
        this.l = new bog(((a2c) wtcVar.getAccessor().c(27)).a(), dj9Var, new vog(this));
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig */
    public final oi8 getA() {
        oi8 oi8Var = oi8.e;
        return oi8.f;
    }

    public final k96 o1() {
        return (k96) this.h.m(this, m[2]);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onActivityPaused(Activity activity) {
        ((ej9) this.e.getValue()).a(this.f);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onActivityResumed(Activity activity) {
        ((ej9) this.e.getValue()).b(this.f);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onChangeStarted(gr4 gr4Var, hr4 hr4Var) {
        super.onChangeStarted(gr4Var, hr4Var);
        hr4 hr4Var2 = hr4.e;
        ny8 ny8Var = this.e;
        dj9 dj9Var = this.f;
        if (hr4Var == hr4Var2 || hr4Var == hr4.c) {
            ((ej9) ny8Var.getValue()).b(dj9Var);
        } else if (hr4Var == hr4.d) {
            ((ej9) ny8Var.getValue()).a(dj9Var);
        }
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        n1g.N(new r7d(3, null, 3), frameLayout);
        rcc rccVar = new rcc(frameLayout.getContext());
        rccVar.setId(R.id.oneme_stickers_showcase_toolbar);
        rccVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        rccVar.setTitle(R.string.oneme_stickers_showcase_toolbar_title);
        rccVar.setForm(gcc.Compact);
        rccVar.setRightActions(new acc(new kcc(new e97(this, 2)), new hcc(R.drawable.icon_settings, new chf(20)), null));
        rccVar.setLeftActions(new wbc(new ptf(9, this)));
        frameLayout.addView(rccVar);
        k96 k96Var = new k96(frameLayout.getContext());
        k96Var.setId(R.id.oneme_stickers_showcase_sets_list);
        k96Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        k96Var.setClipToPadding(false);
        k96Var.setClipChildren(false);
        int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        k96Var.setPadding(iK, k96Var.getPaddingTop(), iK, k96Var.getPaddingBottom());
        frameLayout.addView(k96Var);
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        this.f.b();
        k96 k96VarO1 = o1();
        k96VarO1.setAdapter(null);
        k96VarO1.setPager(null);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        k96 k96VarO1 = o1();
        rcc rccVar = (rcc) this.g.m(this, m[1]);
        bdc.a(rccVar, new ng7(rccVar, k96VarO1, this, 26));
        k96VarO1.getContext();
        k96VarO1.setLayoutManager(new LinearLayoutManager());
        k96VarO1.setItemAnimator(null);
        int i = 11;
        k96VarO1.h(new q91(gm0.K(6.0f * yl5.d().getDisplayMetrics().density), gm0.K(8.0f * yl5.d().getDisplayMetrics().density), i), -1);
        k96VarO1.setPager(new gl1(this, i));
        k96VarO1.setIgnoreRefreshingFlagsForScrollEvent(true);
        k96VarO1.setAdapter(this.l);
        int i2 = 4;
        int i3 = 3;
        e9i.j0(new fz6(p1().o, new dyd(2, this, StickersShowcaseScreen.class, "handleNewState", "handleNewState(Lone/me/stickersshowcase/model/ShowcaseState;)V", i2, 14), i3), getViewLifecycleScope());
        e9i.j0(new fz6(p1().l, new dyd(2, this, StickersShowcaseScreen.class, "handleEvents", "handleEvents(Lone/me/stickersshowcase/ShowcaseEvent;)V", i2, 15), i3), getViewLifecycleScope());
        e9i.j0(new fz6(p1().m, new dyd(2, this, StickersShowcaseScreen.class, "handleNavEvents", "handleNavEvents(Lone/me/sdk/arch/event/NavigationEvent;)V", i2, 16), i3), getViewLifecycleScope());
    }

    public final zog p1() {
        return (zog) this.c.getValue();
    }
}
