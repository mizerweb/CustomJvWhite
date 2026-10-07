package one.me.settings.twofa.configuration;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2c;
import defpackage.bc1;
import defpackage.bpg;
import defpackage.c4h;
import defpackage.d4f;
import defpackage.dyd;
import defpackage.e9i;
import defpackage.f8i;
import defpackage.fz6;
import defpackage.g8i;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.ha9;
import defpackage.i19;
import defpackage.ic6;
import defpackage.j0i;
import defpackage.j8i;
import defpackage.k8i;
import defpackage.ks6;
import defpackage.lq4;
import defpackage.mc4;
import defpackage.n;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.n7i;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.pq3;
import defpackage.ptf;
import defpackage.pvf;
import defpackage.rcc;
import defpackage.rx8;
import defpackage.sbf;
import defpackage.t2g;
import defpackage.tre;
import defpackage.vuf;
import defpackage.wbc;
import defpackage.wtc;
import defpackage.xhh;
import defpackage.y3f;
import defpackage.yab;
import defpackage.yl5;
import defpackage.ylc;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/settings/twofa/configuration/TwoFASettingsScreen;", "Lone/me/sdk/arch/Widget;", "Lmc4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "trackId", "Lha9;", "localAccountId", "(Ljava/lang/String;Lha9;)V", "settings-twofa"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TwoFASettingsScreen extends Widget implements mc4 {
    public final wtc a;
    public final ks6 b;
    public final oi8 c;
    public final ny8 d;
    public final f8i e;
    public final ny8 f;

    public TwoFASettingsScreen(Bundle bundle) {
        super(bundle);
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.a = wtcVar;
        this.b = tre.F(this, y3f.SETTINGS_2FA);
        this.c = oi8.f;
        int i = 3;
        ny8 ny8VarCreateViewModelLazy = createViewModelLazy(k8i.class, new t2g(25, new j0i(this, i, bundle)));
        this.d = ny8VarCreateViewModelLazy;
        f8i f8iVar = new f8i(new c4h(2, this), ((a2c) wtcVar.getAccessor().c(27)).a());
        this.e = f8iVar;
        this.f = rx8.P(3, new bpg(28, this));
        e9i.j0(new fz6(((k8i) ny8VarCreateViewModelLazy.getValue()).i, new dyd(2, f8iVar, f8i.class, "submitList", "submitList(Ljava/util/List;)V", 4, 18), i), getLifecycleScope());
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        k8i k8iVar = (k8i) this.d.getValue();
        k8iVar.getClass();
        if (i == R.id.oneme_settings_twofa_configuration_disable_twofa_positive || i != R.id.oneme_settings_twofa_configuration_disable_twofa_negative) {
            return;
        }
        k8iVar.m.B(k8iVar, k8i.o[0], yab.h0(k8iVar.b, ((n0c) ((xhh) k8iVar.d.getValue())).b(), 2, new j8i(k8iVar, (lq4) null, 0)));
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getC() {
        return this.c;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getU() {
        return this.b;
    }

    @Override // defpackage.br4
    public final boolean handleBack() {
        n7i.b.j();
        return true;
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayoutJ = bc1.j(layoutInflater.getContext(), new ViewGroup.LayoutParams(-1, -1), 1);
        rcc rccVar = new rcc(linearLayoutJ.getContext());
        rccVar.setId(R.id.oneme_settings_twofa_configuration_toolbar);
        rccVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        rccVar.setTitle(R.string.oneme_settings_twofa_onboarding_title);
        rccVar.setForm(gcc.Compact);
        int i = 25;
        rccVar.setLeftActions(new wbc(new ptf(i, this)));
        linearLayoutJ.addView(rccVar);
        RecyclerView recyclerView = new RecyclerView(linearLayoutJ.getContext());
        recyclerView.setId(R.id.oneme_settings_twofa_configuration_recycler);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), recyclerView.getPaddingTop(), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        recyclerView.setAdapter(this.e);
        recyclerView.setItemAnimator(null);
        recyclerView.h(new sbf(pq3.j.h(recyclerView), new vuf(19, this), null, null, null, 60), -1);
        recyclerView.h(new pvf(1), -1);
        linearLayoutJ.addView(recyclerView);
        n1g.N(new n(3, null, i), linearLayoutJ);
        return linearLayoutJ;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        ny8 ny8Var = this.d;
        ic6 ic6Var = ((k8i) ny8Var.getValue()).j;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        int i = 3;
        e9i.j0(new fz6(n1g.v(ic6Var, i19VarF, n09Var), new g8i(null, this, 0), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((k8i) ny8Var.getValue()).k, getViewLifecycleOwner().f(), n09Var), new g8i(null, this, 1), i), getViewLifecycleScope());
    }

    public TwoFASettingsScreen(String str, ha9 ha9Var) {
        this(n1g.i(new ylc("twofa_settings_track_id_key", str), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
