package one.me.settings.battery.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2c;
import defpackage.bc1;
import defpackage.chf;
import defpackage.d4f;
import defpackage.dtd;
import defpackage.due;
import defpackage.dwd;
import defpackage.dyd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.ha9;
import defpackage.i22;
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
import defpackage.qqf;
import defpackage.qyb;
import defpackage.rcc;
import defpackage.sbf;
import defpackage.tre;
import defpackage.tyd;
import defpackage.wbc;
import defpackage.wtc;
import defpackage.xqf;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.ztd;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/settings/battery/ui/SettingsBatteryScreen;", "Lone/me/sdk/arch/Widget;", "Lmc4;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "battery"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SettingsBatteryScreen extends Widget implements mc4 {
    public static final /* synthetic */ zv8[] g;
    public final ks6 a;
    public final oi8 b;
    public final wtc c;
    public final ny8 d;
    public final j8e e;
    public final qqf f;

    static {
        dwd dwdVar = new dwd(SettingsBatteryScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        zfe.a.getClass();
        g = new zv8[]{dwdVar};
    }

    public SettingsBatteryScreen(Bundle bundle) {
        super(bundle);
        this.a = tre.G(this, new tyd(27));
        this.b = oi8.f;
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.c = wtcVar;
        this.d = createViewModelLazy(xqf.class, new ztd(20, new ize(15, this)));
        this.e = viewBinding(R.id.oneme_settings_battery_screen_list);
        qqf qqfVar = new qqf(new due(this), ((a2c) wtcVar.getAccessor().c(27)).a());
        this.f = qqfVar;
        e9i.j0(new fz6(o1().h, new dyd(2, qqfVar, qqf.class, "submitList", "submitList(Ljava/util/List;)V", 4, 4), 3), getLifecycleScope());
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        o1().D(i);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getE() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.a;
    }

    public final xqf o1() {
        return (xqf) this.d.getValue();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayoutJ = bc1.j(layoutInflater.getContext(), new ViewGroup.LayoutParams(-1, -1), 1);
        rcc rccVar = new rcc(linearLayoutJ.getContext());
        rccVar.setId(R.id.oneme_settings_battery_screen_toolbar);
        rccVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        rccVar.setTitle(R.string.oneme_settings_battery_screen_toolbar_title);
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new wbc(new chf(3)));
        linearLayoutJ.addView(rccVar);
        RecyclerView recyclerView = new RecyclerView(linearLayoutJ.getContext());
        recyclerView.setId(R.id.oneme_settings_battery_screen_list);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.f);
        recyclerView.setItemAnimator(null);
        recyclerView.h(new sbf(pq3.j.h(recyclerView), new qyb(27, this), null, null, null, 60), -1);
        recyclerView.h(new i22(2), -1);
        linearLayoutJ.addView(recyclerView);
        n1g.N(new n(3, null, 18), linearLayoutJ);
        return linearLayoutJ;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        ((RecyclerView) this.e.m(this, g[0])).setAdapter(null);
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        e9i.j0(new fz6(n1g.v(o1().n, getViewLifecycleOwner().f(), n09.d), new dtd((lq4) null, this, 22), 3), getViewLifecycleScope());
    }

    public SettingsBatteryScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
