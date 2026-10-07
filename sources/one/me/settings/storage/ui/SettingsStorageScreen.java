package one.me.settings.storage.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2c;
import defpackage.a8j;
import defpackage.awf;
import defpackage.bc1;
import defpackage.d4f;
import defpackage.dtd;
import defpackage.dwd;
import defpackage.dyd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.ha9;
import defpackage.hwf;
import defpackage.ize;
import defpackage.j8e;
import defpackage.ks6;
import defpackage.kwf;
import defpackage.lq4;
import defpackage.mc4;
import defpackage.n;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.pq3;
import defpackage.ptf;
import defpackage.q91;
import defpackage.rcc;
import defpackage.sbf;
import defpackage.t3f;
import defpackage.tre;
import defpackage.vn7;
import defpackage.vuf;
import defpackage.wbc;
import defpackage.wtc;
import defpackage.y3f;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.ztd;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/settings/storage/ui/SettingsStorageScreen;", "Lone/me/sdk/arch/Widget;", "Lmc4;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "settings-storage"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SettingsStorageScreen extends Widget implements mc4 {
    public static final /* synthetic */ zv8[] g;
    public final wtc a;
    public final ny8 b;
    public final j8e c;
    public final awf d;
    public final oi8 e;
    public final ks6 f;

    static {
        dwd dwdVar = new dwd(SettingsStorageScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        zfe.a.getClass();
        g = new zv8[]{dwdVar};
        new t3f("settings-storage", null, 2);
    }

    public SettingsStorageScreen(Bundle bundle) {
        super(bundle);
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.a = wtcVar;
        ny8 ny8VarCreateViewModelLazy = createViewModelLazy(kwf.class, new ztd(27, new ize(19, this)));
        this.b = ny8VarCreateViewModelLazy;
        this.c = viewBinding(R.id.oneme_settings_storage_screen_list);
        awf awfVar = new awf(new vn7(28, this), ((a2c) wtcVar.getAccessor().c(27)).a());
        this.d = awfVar;
        this.e = oi8.f;
        this.f = tre.F(this, y3f.SETTINGS_CACHE);
        e9i.j0(new fz6(((kwf) ny8VarCreateViewModelLazy.getValue()).i, new dyd(2, awfVar, awf.class, "submitList", "submitList(Ljava/util/List;)V", 4, 7), 3), getLifecycleScope());
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        ((kwf) this.b.getValue()).E(i);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getB() {
        return this.e;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.f;
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        super.onAttach(view);
        kwf kwfVar = (kwf) this.b.getValue();
        kwfVar.getClass();
        kwfVar.k.B(kwfVar, kwf.m[1], a8j.t(kwfVar, null, new hwf(kwfVar, null, 2), 1));
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayoutJ = bc1.j(layoutInflater.getContext(), new ViewGroup.LayoutParams(-1, -1), 1);
        rcc rccVar = new rcc(linearLayoutJ.getContext());
        rccVar.setId(R.id.oneme_settings_storage_screen_toolbar);
        rccVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        rccVar.setTitle(R.string.oneme_settings_storage_screen_toolbar_title);
        rccVar.setLeftActions(new wbc(new ptf(2, this)));
        rccVar.setForm(gcc.Compact);
        linearLayoutJ.addView(rccVar);
        RecyclerView recyclerView = new RecyclerView(linearLayoutJ.getContext());
        recyclerView.setId(R.id.oneme_settings_storage_screen_list);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.d);
        recyclerView.setItemAnimator(null);
        recyclerView.h(new sbf(pq3.j.h(recyclerView), new vuf(1, this), null, null, null, 60), -1);
        recyclerView.h(new q91(9), -1);
        linearLayoutJ.addView(recyclerView);
        n1g.N(new n(3, null, 23), linearLayoutJ);
        return linearLayoutJ;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        ((RecyclerView) this.c.m(this, g[0])).setAdapter(null);
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        e9i.j0(new fz6(n1g.v(((kwf) this.b.getValue()).l, getViewLifecycleOwner().f(), n09.d), new dtd((lq4) null, this, 25), 3), getViewLifecycleScope());
    }

    public SettingsStorageScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
