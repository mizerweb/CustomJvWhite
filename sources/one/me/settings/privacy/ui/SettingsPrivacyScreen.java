package one.me.settings.privacy.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2c;
import defpackage.a8j;
import defpackage.bad;
import defpackage.bc1;
import defpackage.c7k;
import defpackage.d4f;
import defpackage.dwd;
import defpackage.dyd;
import defpackage.e9i;
import defpackage.fvf;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.gvf;
import defpackage.ha9;
import defpackage.i19;
import defpackage.i22;
import defpackage.ize;
import defpackage.j8e;
import defpackage.ks6;
import defpackage.mc4;
import defpackage.n;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.pq3;
import defpackage.ptf;
import defpackage.q8e;
import defpackage.quf;
import defpackage.rcc;
import defpackage.sbf;
import defpackage.t3f;
import defpackage.tbb;
import defpackage.tre;
import defpackage.vuf;
import defpackage.wbc;
import defpackage.wtc;
import defpackage.wuf;
import defpackage.xuf;
import defpackage.y3f;
import defpackage.ylc;
import defpackage.yuf;
import defpackage.zfe;
import defpackage.ztd;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/settings/privacy/ui/SettingsPrivacyScreen;", "Lone/me/sdk/arch/Widget;", "Lmc4;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "settings-privacy"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SettingsPrivacyScreen extends Widget implements mc4 {
    public static final /* synthetic */ zv8[] i;
    public static final t3f j;
    public final t3f a;
    public final ks6 b;
    public final oi8 c;
    public final wtc d;
    public final ny8 e;
    public final ny8 f;
    public final j8e g;
    public final quf h;

    static {
        dwd dwdVar = new dwd(SettingsPrivacyScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        zfe.a.getClass();
        i = new zv8[]{dwdVar};
        j = new t3f("settings-privacy", null, 2);
    }

    public SettingsPrivacyScreen(Bundle bundle) {
        super(bundle);
        this.a = t3f.a(j, super.getA().b().a, 1);
        this.b = tre.F(this, y3f.SETTINGS_PRIVACY);
        this.c = oi8.f;
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.d = wtcVar;
        this.e = createViewModelLazy(gvf.class, new ztd(26, new ize(18, this)));
        this.f = wtcVar.getAccessor().d(231);
        this.g = viewBinding(R.id.oneme_settings_privacy_screen_list);
        quf qufVar = new quf(new c7k(24, this), ((a2c) wtcVar.getAccessor().c(27)).a());
        this.h = qufVar;
        e9i.j0(new fz6(o1().p, new dyd(2, qufVar, quf.class, "submitList", "submitList(Ljava/util/List;)V", 4, 6), 3), getLifecycleScope());
    }

    @Override // defpackage.mc4
    public final void D0() {
        tbb.g((tbb) this.f.getValue(), y3f.SETTINGS_PRIVACY);
    }

    @Override // defpackage.mc4
    public final void e(int i2, Bundle bundle) {
        gvf gvfVarO1 = o1();
        if (i2 == R.id.oneme_settings_privacy_screen_dialog_online_button_contacts) {
            gvfVarO1.K(true);
            return;
        }
        if (i2 == R.id.oneme_settings_privacy_screen_dialog_online_button_nobody) {
            gvfVarO1.K(false);
            return;
        }
        if (i2 == R.id.oneme_settings_privacy_screen_dialog_call_button_all) {
            gvfVarO1.getClass();
            gvfVarO1.r.B(gvfVarO1, gvf.C[1], a8j.t(gvfVarO1, null, new fvf(gvfVarO1, 1, null, 1), 3));
            return;
        }
        if (i2 == R.id.oneme_settings_privacy_screen_dialog_call_button_contacts) {
            gvfVarO1.getClass();
            gvfVarO1.r.B(gvfVarO1, gvf.C[1], a8j.t(gvfVarO1, null, new fvf(gvfVarO1, 4, null, 1), 3));
            return;
        }
        if (i2 == R.id.oneme_settings_privacy_screen_dialog_add_chat_button_all) {
            gvfVarO1.getClass();
            gvfVarO1.s.B(gvfVarO1, gvf.C[2], a8j.t(gvfVarO1, null, new fvf(gvfVarO1, 1, null, 0), 3));
            return;
        }
        if (i2 == R.id.oneme_settings_privacy_screen_dialog_add_chat_button_contacts) {
            gvfVarO1.getClass();
            gvfVarO1.s.B(gvfVarO1, gvf.C[2], a8j.t(gvfVarO1, null, new fvf(gvfVarO1, 4, null, 0), 3));
            return;
        }
        if (i2 == R.id.oneme_settings_privacy_screen_dialog_search_by_phone_all) {
            gvfVarO1.M(1);
            return;
        }
        if (i2 == R.id.oneme_settings_privacy_screen_dialog_search_by_phone_contacts) {
            gvfVarO1.M(4);
            return;
        }
        if (i2 == R.id.oneme_settings_privacy_screen_dialog_content_level_access_safe) {
            gvfVarO1.J(true);
            return;
        }
        if (i2 == R.id.oneme_settings_privacy_screen_dialog_content_level_access_all) {
            gvfVarO1.J(false);
            return;
        }
        if (i2 == R.id.oneme_settings_privacy_screen_dialog_phone_number_privacy_all) {
            gvfVarO1.L(1);
            return;
        }
        if (i2 == R.id.oneme_settings_privacy_screen_dialog_phone_number_privacy_contacts) {
            gvfVarO1.L(4);
        } else if (i2 == R.id.oneme_settings_privacy_screen_dialog_phone_number_privacy_no_one) {
            gvfVarO1.L(3);
        } else {
            gvfVarO1.getClass();
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getA() {
        return this.c;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScopeId, reason: from getter */
    public final t3f getA() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.b;
    }

    public final gvf o1() {
        return (gvf) this.e.getValue();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayoutJ = bc1.j(layoutInflater.getContext(), new ViewGroup.LayoutParams(-1, -1), 1);
        rcc rccVar = new rcc(linearLayoutJ.getContext());
        rccVar.setId(R.id.oneme_settings_privacy_screen_toolbar);
        rccVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        rccVar.setTitle(R.string.privacy);
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new wbc(new ptf(1, this)));
        linearLayoutJ.addView(rccVar);
        RecyclerView recyclerView = new RecyclerView(linearLayoutJ.getContext());
        recyclerView.setId(R.id.oneme_settings_privacy_screen_list);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.h);
        recyclerView.setItemAnimator(null);
        recyclerView.setClipChildren(false);
        recyclerView.h(new sbf(pq3.j.h(recyclerView), new vuf(0, this), null, new bad(this, 9, recyclerView), null, 44), -1);
        recyclerView.h(new i22(4), -1);
        recyclerView.h(new xuf(recyclerView.getContext()), -1);
        linearLayoutJ.addView(recyclerView);
        n1g.N(new n(3, null, 22), linearLayoutJ);
        return linearLayoutJ;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        ((RecyclerView) this.g.m(this, i[0])).setAdapter(null);
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        gvf gvfVarO1 = o1();
        a8j.t(gvfVarO1, ((n0c) gvfVarO1.c).a(), new yuf(gvfVarO1, null, 2), 2);
        q8e q8eVar = o1().A;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(q8eVar, i19VarF, n09Var), new wuf(null, this, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(o1().B, getViewLifecycleOwner().f(), n09Var), new wuf(null, this, 1), 3), getViewLifecycleScope());
    }

    public SettingsPrivacyScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
