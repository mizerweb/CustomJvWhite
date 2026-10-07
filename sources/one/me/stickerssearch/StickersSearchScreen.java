package one.me.stickerssearch;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import defpackage.a2c;
import defpackage.bdc;
import defpackage.dj9;
import defpackage.dwd;
import defpackage.dyd;
import defpackage.e9i;
import defpackage.ej9;
import defpackage.ft0;
import defpackage.fz6;
import defpackage.gl1;
import defpackage.gm0;
import defpackage.gr4;
import defpackage.hr4;
import defpackage.i19;
import defpackage.i22;
import defpackage.j8e;
import defpackage.k96;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.occ;
import defpackage.og7;
import defpackage.oi8;
import defpackage.ong;
import defpackage.ow0;
import defpackage.png;
import defpackage.r7d;
import defpackage.r8e;
import defpackage.t2g;
import defpackage.t7c;
import defpackage.vng;
import defpackage.vv;
import defpackage.wtc;
import defpackage.yl5;
import defpackage.yw8;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zsj;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/stickerssearch/StickersSearchScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "stickers-search"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StickersSearchScreen extends Widget {
    public static final /* synthetic */ zv8[] l = {new dwd(StickersSearchScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), zo5.f(zfe.a, StickersSearchScreen.class, "stickersRecycler", "getStickersRecycler()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), new dwd(StickersSearchScreen.class, "searchView", "getSearchView()Lone/me/sdk/uikit/common/search/OneMeSearchView;", 0)};
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
    public final zsj k;

    public StickersSearchScreen(Bundle bundle) {
        super(bundle);
        this.a = new vv("chat_id", Long.class);
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.b = wtcVar;
        this.c = createViewModelLazy(vng.class, new t2g(6, new ong(this, 0)));
        this.d = wtcVar.getAccessor().d(18);
        this.e = wtcVar.getAccessor().d(365);
        this.f = new dj9();
        this.g = viewBinding(R.id.oneme_stickers_search_stickers_list);
        this.h = viewBinding(R.id.oneme_stickers_search_toolbar);
        this.i = binding(new ong(this, 1));
        this.j = binding(new ong(this, 2));
        this.k = new zsj(((a2c) wtcVar.getAccessor().c(27)).a(), new ft0(this), (occ) null);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig */
    public final oi8 getC() {
        oi8 oi8Var = oi8.e;
        return oi8.f;
    }

    public final k96 o1() {
        return (k96) this.g.m(this, l[1]);
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
        n1g.N(new r7d(3, null, 2), frameLayout);
        t7c t7cVar = new t7c(frameLayout.getContext());
        t7cVar.setId(R.id.oneme_stickers_search_toolbar);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.rightMargin = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        t7cVar.setLayoutParams(layoutParams);
        t7cVar.setSearchHint(t7cVar.getContext().getString(R.string.oneme_stickers_search_hint));
        t7cVar.c(true);
        t7cVar.setListener(new png(this));
        frameLayout.addView(t7cVar);
        k96 k96Var = new k96(frameLayout.getContext());
        k96Var.setId(R.id.oneme_stickers_search_stickers_list);
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
        t7c t7cVar = (t7c) this.h.m(this, l[2]);
        bdc.a(t7cVar, new og7(t7cVar, k96VarO1, this, 27));
        int iK = (k96VarO1.getContext().getResources().getDisplayMetrics().widthPixels - (gm0.K(12.0f * yl5.d().getDisplayMetrics().density) * 2)) / (gm0.K(81.0f * yl5.d().getDisplayMetrics().density) + gm0.K(yl5.d().getDisplayMetrics().density * 4.0f));
        if (iK < 1) {
            iK = 1;
        }
        k96VarO1.getContext();
        k96VarO1.setLayoutManager(new GridLayoutManager(iK));
        k96VarO1.setItemAnimator(null);
        k96VarO1.h(new i22(iK, gm0.K(4.0f * yl5.d().getDisplayMetrics().density)), -1);
        k96VarO1.i(new yw8(4, this));
        k96VarO1.setPager(new gl1(this, 10));
        k96VarO1.setIgnoreRefreshingFlagsForScrollEvent(true);
        k96VarO1.setAdapter(this.k);
        r8e r8eVar = p1().i;
        i19 i19VarF = this.lifecycleOwner.f();
        n09 n09Var = n09.d;
        int i = 4;
        int i2 = 3;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new dyd(2, this, StickersSearchScreen.class, "handleNewState", "handleNewState(Lone/me/stickerssearch/model/SearchState;)V", i, 9), i2), getLifecycleScope());
        e9i.j0(new fz6(n1g.v(p1().j, this.lifecycleOwner.f(), n09Var), new dyd(2, this, StickersSearchScreen.class, "handleNavEvents", "handleNavEvents(Lone/me/sdk/arch/event/NavigationEvent;)V", i, 10), i2), getLifecycleScope());
    }

    public final vng p1() {
        return (vng) this.c.getValue();
    }
}
