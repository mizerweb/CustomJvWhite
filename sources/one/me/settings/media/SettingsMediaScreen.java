package one.me.settings.media;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2c;
import defpackage.bc1;
import defpackage.buf;
import defpackage.chf;
import defpackage.d4f;
import defpackage.dtd;
import defpackage.dwd;
import defpackage.dyd;
import defpackage.e9i;
import defpackage.euf;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.gr4;
import defpackage.ha9;
import defpackage.hr4;
import defpackage.i22;
import defpackage.irf;
import defpackage.ize;
import defpackage.j8e;
import defpackage.ks6;
import defpackage.lq4;
import defpackage.mc4;
import defpackage.n;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.pq3;
import defpackage.pvh;
import defpackage.qyb;
import defpackage.rcc;
import defpackage.sbf;
import defpackage.tre;
import defpackage.ttf;
import defpackage.wbc;
import defpackage.wtc;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.ztd;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/settings/media/SettingsMediaScreen;", "Lone/me/sdk/arch/Widget;", "Lmc4;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "media"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SettingsMediaScreen extends Widget implements mc4 {
    public static final /* synthetic */ zv8[] h;
    public final ks6 a;
    public final oi8 b;
    public final wtc c;
    public final ny8 d;
    public final j8e e;
    public pvh f;
    public final ttf g;

    static {
        dwd dwdVar = new dwd(SettingsMediaScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        zfe.a.getClass();
        h = new zv8[]{dwdVar};
    }

    public SettingsMediaScreen(Bundle bundle) {
        super(bundle);
        this.a = tre.G(this, new irf(8));
        this.b = oi8.f;
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.c = wtcVar;
        this.d = createViewModelLazy(euf.class, new ztd(25, new ize(17, this)));
        this.e = viewBinding(R.id.oneme_settings_media_screen_list);
        ttf ttfVar = new ttf(new buf(this), ((a2c) wtcVar.getAccessor().c(27)).a());
        this.g = ttfVar;
        e9i.j0(new fz6(o1().q, new dyd(2, ttfVar, ttf.class, "submitList", "submitList(Ljava/util/List;)V", 4, 5), 3), getLifecycleScope());
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        o1().G(i);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getB() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getU() {
        return this.a;
    }

    public final euf o1() {
        return (euf) this.d.getValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onActivityResumed(Activity activity) {
        if (getView() != null) {
            o1().H();
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onChangeStarted(gr4 gr4Var, hr4 hr4Var) {
        if (hr4Var == hr4.e) {
            gm0.n(SettingsMediaScreen.class.getName(), "refresh items when return");
            o1().H();
        }
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayoutJ = bc1.j(layoutInflater.getContext(), new ViewGroup.LayoutParams(-1, -1), 1);
        rcc rccVar = new rcc(linearLayoutJ.getContext());
        rccVar.setId(R.id.oneme_settings_media_screen_toolbar);
        rccVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        rccVar.setTitle(R.string.oneme_settings_media_screen_toolbar_title);
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new wbc(new chf(5)));
        linearLayoutJ.addView(rccVar);
        RecyclerView recyclerView = new RecyclerView(linearLayoutJ.getContext());
        recyclerView.setId(R.id.oneme_settings_media_screen_list);
        recyclerView.setClipChildren(false);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.g);
        recyclerView.setItemAnimator(null);
        recyclerView.h(new sbf(pq3.j.h(recyclerView), new qyb(29, this), null, null, null, 60), -1);
        recyclerView.h(new i22(3), -1);
        linearLayoutJ.addView(recyclerView);
        n1g.N(new n(3, null, 21), linearLayoutJ);
        return linearLayoutJ;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        pvh pvhVar = this.f;
        zv8[] zv8VarArr = h;
        j8e j8eVar = this.e;
        if (pvhVar != null) {
            pvhVar.b((RecyclerView) j8eVar.m(this, zv8VarArr[0]));
        }
        this.f = null;
        ((RecyclerView) j8eVar.m(this, zv8VarArr[0])).setAdapter(null);
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.f = tre.Y((RecyclerView) this.e.m(this, h[0]));
        e9i.j0(new fz6(n1g.v(o1().y, getViewLifecycleOwner().f(), n09.d), new dtd((lq4) null, this, 24), 3), getViewLifecycleScope());
    }

    public SettingsMediaScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
