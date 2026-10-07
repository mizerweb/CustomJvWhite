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
import defpackage.atj;
import defpackage.bc1;
import defpackage.btj;
import defpackage.ctj;
import defpackage.d4f;
import defpackage.dtj;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.ha9;
import defpackage.hzi;
import defpackage.j8e;
import defpackage.ks6;
import defpackage.lq4;
import defpackage.n;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.o0j;
import defpackage.oi8;
import defpackage.pni;
import defpackage.pq3;
import defpackage.q35;
import defpackage.rcc;
import defpackage.sbf;
import defpackage.tre;
import defpackage.vbi;
import defpackage.wbc;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zsj;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/webapp/settings/WebAppsSettingScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "web-app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WebAppsSettingScreen extends Widget {
    public static final /* synthetic */ zv8[] f;
    public final ahj a;
    public final ks6 b;
    public final ny8 c;
    public final j8e d;
    public final zsj e;

    static {
        dwd dwdVar = new dwd(WebAppsSettingScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        zfe.a.getClass();
        f = new zv8[]{dwdVar};
    }

    public WebAppsSettingScreen(Bundle bundle) {
        super(bundle);
        ahj ahjVar = new ahj(m35getAccountScopeuqN4xOY());
        this.a = ahjVar;
        this.b = tre.G(this, new o0j(27));
        ny8 ny8VarCreateViewModelLazy = createViewModelLazy(dtj.class, new hzi(7, new vbi(22, this)));
        this.c = ny8VarCreateViewModelLazy;
        this.d = viewBinding(R.id.webapp_root_settings_sections_recycler);
        this.e = new zsj(((a2c) ahjVar.getAccessor().c(27)).a(), new ctj(this), 0);
        e9i.j0(new fz6(((dtj) ny8VarCreateViewModelLazy.getValue()).g, new btj(this, (lq4) null), 3), getLifecycleScope());
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig */
    public final oi8 getD() {
        oi8 oi8Var = oi8.e;
        return oi8.f;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.b;
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayoutJ = bc1.j(layoutInflater.getContext(), new ViewGroup.LayoutParams(-1, -1), 1);
        rcc rccVar = new rcc(linearLayoutJ.getContext());
        rccVar.setId(R.id.webapp_root_toolbar);
        rccVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        rccVar.setTitle(R.string.web_app_root_settings_webapps);
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new wbc(new pni(6, this)));
        linearLayoutJ.addView(rccVar);
        RecyclerView recyclerView = new RecyclerView(linearLayoutJ.getContext());
        recyclerView.setId(R.id.webapp_root_settings_sections_recycler);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), recyclerView.getPaddingTop(), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        recyclerView.setAdapter(this.e);
        recyclerView.h(new sbf(pq3.j.h(recyclerView), new atj(0, this), null, null, null, 60), -1);
        recyclerView.h(new q35(5), -1);
        linearLayoutJ.addView(recyclerView);
        n1g.N(new n(3, null, 27), linearLayoutJ);
        return linearLayoutJ;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        ((RecyclerView) this.d.m(this, f[0])).setAdapter(null);
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        e9i.j0(new fz6(n1g.v(((dtj) this.c.getValue()).h, getViewLifecycleOwner().f(), n09.d), new btj((lq4) null, this), 3), getViewLifecycleScope());
    }

    public WebAppsSettingScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
