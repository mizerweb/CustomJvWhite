package one.me.webapp.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2c;
import defpackage.ahj;
import defpackage.bc1;
import defpackage.cpj;
import defpackage.d4f;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.ha9;
import defpackage.hzi;
import defpackage.i19;
import defpackage.j0i;
import defpackage.j8e;
import defpackage.ks6;
import defpackage.mc4;
import defpackage.n;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.o0j;
import defpackage.occ;
import defpackage.oi8;
import defpackage.pq3;
import defpackage.q35;
import defpackage.r8e;
import defpackage.rcc;
import defpackage.sbf;
import defpackage.tre;
import defpackage.vuf;
import defpackage.vv;
import defpackage.wbc;
import defpackage.woj;
import defpackage.xoj;
import defpackage.yfj;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.yoj;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zsj;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/webapp/settings/WebAppSettingsScreen;", "Lone/me/sdk/arch/Widget;", "Lmc4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "botId", "Lha9;", "localAccountId", "(JLha9;)V", "web-app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WebAppSettingsScreen extends Widget implements mc4 {
    public static final /* synthetic */ zv8[] j = {new dwd(WebAppSettingsScreen.class, "botId", "getBotId()J", 0), zo5.f(zfe.a, WebAppSettingsScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), new dwd(WebAppSettingsScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0)};
    public final ks6 a;
    public final ahj b;
    public final oi8 c;
    public final vv d;
    public final ny8 e;
    public final j8e f;
    public final j8e g;
    public yfj h;
    public final zsj i;

    public WebAppSettingsScreen(Bundle bundle) {
        super(bundle);
        this.a = tre.G(this, new o0j(23));
        ahj ahjVar = new ahj(m35getAccountScopeuqN4xOY());
        this.b = ahjVar;
        this.c = oi8.f;
        this.d = new vv("bot_id_arg", Long.class);
        this.e = createViewModelLazy(cpj.class, new hzi(6, new j0i(this, 18, bundle)));
        this.f = viewBinding(R.id.webapp_root_settings_sections_recycler);
        this.g = viewBinding(R.id.webapp_root_toolbar);
        this.i = new zsj(((a2c) ahjVar.getAccessor().c(27)).a(), new yoj(this), 0);
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getC() {
        return this.c;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.a;
    }

    public final cpj o1() {
        return (cpj) this.e.getValue();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayoutJ = bc1.j(layoutInflater.getContext(), new ViewGroup.LayoutParams(-1, -1), 1);
        rcc rccVar = new rcc(linearLayoutJ.getContext());
        rccVar.setId(R.id.webapp_root_toolbar);
        rccVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new wbc(new woj(this, 1)));
        linearLayoutJ.addView(rccVar);
        RecyclerView recyclerView = new RecyclerView(linearLayoutJ.getContext());
        recyclerView.setId(R.id.webapp_root_settings_sections_recycler);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.i);
        recyclerView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), recyclerView.getPaddingTop(), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        recyclerView.h(new sbf(pq3.j.h(recyclerView), new vuf(29, this), null, null, null, 60), -1);
        recyclerView.h(new q35(5), -1);
        linearLayoutJ.addView(recyclerView);
        n1g.N(new n(3, null, 26), linearLayoutJ);
        return linearLayoutJ;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        ((RecyclerView) this.f.m(this, j[1])).setAdapter(null);
        this.h = null;
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.h = new yfj(requireActivity(), new woj(this, 0), new occ(0, o1(), cpj.class, "onBiometryFail", "onBiometryFail()V", 0, 17));
        r8e r8eVar = o1().m;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new xoj(null, this, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(o1().n, getViewLifecycleOwner().f(), n09Var), new xoj(null, this, 1), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(o1().o, getViewLifecycleOwner().f(), n09Var), new xoj(null, this, 2), 3), getViewLifecycleScope());
    }

    public WebAppSettingsScreen(long j2, ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a)), new ylc("bot_id_arg", Long.valueOf(j2))));
    }
}
