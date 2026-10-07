package one.me.settings.privacy.ui.blacklist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.a2c;
import defpackage.a8j;
import defpackage.arf;
import defpackage.bc1;
import defpackage.brf;
import defpackage.d4f;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.ft0;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.h99;
import defpackage.ha9;
import defpackage.i19;
import defpackage.ize;
import defpackage.j8e;
import defpackage.ks6;
import defpackage.l96;
import defpackage.lq4;
import defpackage.mc4;
import defpackage.n;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.p7d;
import defpackage.pq3;
import defpackage.r1c;
import defpackage.r8e;
import defpackage.rcc;
import defpackage.tnh;
import defpackage.tre;
import defpackage.wbc;
import defpackage.wtc;
import defpackage.xhh;
import defpackage.y3f;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zsj;
import defpackage.ztd;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/settings/privacy/ui/blacklist/SettingsBlacklistScreen;", "Lone/me/sdk/arch/Widget;", "Lmc4;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "settings-privacy"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SettingsBlacklistScreen extends Widget implements mc4 {
    public static final /* synthetic */ zv8[] h = {new dwd(SettingsBlacklistScreen.class, "recycler", "getRecycler()Lone/me/sdk/lists/widgets/EndlessRecyclerView;", 0), zo5.f(zfe.a, SettingsBlacklistScreen.class, "emptyState", "getEmptyState()Lone/me/sdk/uikit/common/emptyview/OneMeEmptyView;", 0)};
    public final ks6 a;
    public final oi8 b;
    public final wtc c;
    public final ny8 d;
    public final j8e e;
    public final j8e f;
    public final zsj g;

    public SettingsBlacklistScreen(Bundle bundle) {
        super(bundle);
        this.a = tre.F(this, y3f.SETTINGS_PRIVACY_BLOCK_LIST);
        this.b = oi8.f;
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.c = wtcVar;
        this.d = createViewModelLazy(brf.class, new ztd(21, new ize(16, this)));
        this.e = viewBinding(R.id.oneme_settings_privacy_black_list_rv);
        this.f = viewBinding(R.id.oneme_settings_privacy_black_list_empty_state);
        this.g = new zsj(new ft0(this), ((a2c) wtcVar.getAccessor().c(27)).a(), 10);
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        if (i == R.id.oneme_settings_privacy_black_list_unblock_action) {
            brf brfVarO1 = o1();
            brfVarO1.getClass();
            if (bundle == null) {
                gm0.Y(brf.class.getName(), "Early return in unblock cuz of long is null");
            } else {
                a8j.t(brfVarO1, ((n0c) ((xhh) brfVarO1.j.getValue())).b(), new h99(brfVarO1, bundle.getLong("user_unblock_id"), (lq4) null, 8), 2);
            }
        }
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

    public final brf o1() {
        return (brf) this.d.getValue();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayoutJ = bc1.j(layoutInflater.getContext(), new ViewGroup.LayoutParams(-1, -1), 1);
        rcc rccVar = new rcc(linearLayoutJ.getContext());
        rccVar.setId(R.id.oneme_settings_privacy_black_list_toolbar);
        rccVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        rccVar.setTitle(R.string.oneme_settings_privacy_black_list_toolbar_title);
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new wbc(new p7d(29, this)));
        linearLayoutJ.addView(rccVar);
        r1c r1cVar = new r1c(linearLayoutJ.getContext());
        r1cVar.setId(R.id.oneme_settings_privacy_black_list_empty_state);
        r1cVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        r1cVar.setIcon(R.drawable.icon_users_fill);
        r1cVar.setTitle(new tnh(R.string.oneme_settings_privacy_black_list_empty_state_desc));
        r1cVar.onThemeChanged(pq3.j.h(r1cVar));
        linearLayoutJ.addView(r1cVar);
        l96 l96Var = new l96(linearLayoutJ.getContext());
        l96Var.setId(R.id.oneme_settings_privacy_black_list_rv);
        l96Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        l96Var.getContext();
        l96Var.setLayoutManager(new LinearLayoutManager());
        l96Var.setAdapter(this.g);
        l96Var.setHasFixedSize(true);
        l96Var.setPager(o1());
        linearLayoutJ.addView(l96Var);
        n1g.N(new n(3, null, 19), linearLayoutJ);
        return linearLayoutJ;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        ((l96) this.e.m(this, h[0])).setAdapter(null);
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        r8e r8eVar = o1().l;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new arf(null, this, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(o1().p, getViewLifecycleOwner().f(), n09Var), new arf(null, this, 1), 3), getViewLifecycleScope());
    }

    public SettingsBlacklistScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
