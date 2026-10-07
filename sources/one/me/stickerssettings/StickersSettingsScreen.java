package one.me.stickerssettings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2c;
import defpackage.a8g;
import defpackage.bc1;
import defpackage.c7k;
import defpackage.chf;
import defpackage.d4f;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.h99;
import defpackage.ha9;
import defpackage.i19;
import defpackage.i20;
import defpackage.i22;
import defpackage.ic6;
import defpackage.irf;
import defpackage.ize;
import defpackage.j8e;
import defpackage.kog;
import defpackage.ks6;
import defpackage.ln8;
import defpackage.lq4;
import defpackage.mc4;
import defpackage.mog;
import defpackage.n;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.nog;
import defpackage.ny8;
import defpackage.odb;
import defpackage.oi8;
import defpackage.pq3;
import defpackage.rcc;
import defpackage.rn8;
import defpackage.rog;
import defpackage.sbf;
import defpackage.t2g;
import defpackage.tre;
import defpackage.vp4;
import defpackage.vuf;
import defpackage.wbc;
import defpackage.wtc;
import defpackage.yab;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/stickerssettings/StickersSettingsScreen;", "Lone/me/sdk/arch/Widget;", "Lvp4;", "Lmc4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "stickers-settings"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StickersSettingsScreen extends Widget implements vp4, mc4 {
    public static final /* synthetic */ zv8[] g;
    public final ks6 a;
    public final wtc b;
    public final ny8 c;
    public final j8e d;
    public rn8 e;
    public final kog f;

    static {
        dwd dwdVar = new dwd(StickersSettingsScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        zfe.a.getClass();
        g = new zv8[]{dwdVar};
    }

    public StickersSettingsScreen(Bundle bundle) {
        super(bundle);
        this.a = tre.G(this, new irf(22));
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.b = wtcVar;
        this.c = createViewModelLazy(rog.class, new t2g(7, new ize(29, this)));
        this.d = viewBinding(R.id.oneme_stickers_settings_content_recycler);
        this.f = new kog(((a2c) wtcVar.getAccessor().c(27)).a(), new mog(this, 0), new mog(this, 1), new mog(this, 2), 0);
        e9i.j0(new fz6(o1().i, new nog(this, null), 3), getLifecycleScope());
    }

    @Override // defpackage.vp4
    public final void E(int i, Bundle bundle) {
        rog rogVarO1 = o1();
        Long l = rogVarO1.p;
        if (l != null) {
            long jLongValue = l.longValue();
            rogVarO1.p = null;
            rogVarO1.r.B(rogVarO1, rog.t[1], yab.h0(rogVarO1.b, ((n0c) rogVarO1.d).a(), 2, new i20(rogVarO1, jLongValue, i, (lq4) null)));
        }
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        rog rogVarO1 = o1();
        Long l = rogVarO1.q;
        if (l != null) {
            long jLongValue = l.longValue();
            rogVarO1.q = null;
            if (i == R.id.oneme_stickers_settings_confirm_delete_set_action) {
                rogVarO1.s.B(rogVarO1, rog.t[2], yab.h0(rogVarO1.b, ((n0c) rogVarO1.d).b(), 2, new h99(rogVarO1, jLongValue, (lq4) null, 10)));
            }
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig */
    public final oi8 getC() {
        oi8 oi8Var = oi8.e;
        return oi8.f;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.a;
    }

    public final rog o1() {
        return (rog) this.c.getValue();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayoutJ = bc1.j(layoutInflater.getContext(), new ViewGroup.LayoutParams(-1, -1), 1);
        rcc rccVar = new rcc(linearLayoutJ.getContext());
        rccVar.setId(R.id.oneme_stickers_settings_toolbar);
        rccVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        rccVar.setTitle(R.string.oneme_stickers_settings_toolbar_title);
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new wbc(new mog(this, 3)));
        linearLayoutJ.addView(rccVar);
        RecyclerView recyclerView = new RecyclerView(linearLayoutJ.getContext());
        recyclerView.setId(R.id.oneme_stickers_settings_content_recycler);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.f);
        vuf vufVar = new vuf(7, this);
        a8g a8gVar = pq3.j;
        recyclerView.h(new sbf(a8gVar.h(recyclerView), vufVar, null, null, null, 60), -1);
        recyclerView.h(new odb(3, a8gVar.h(recyclerView)), -1);
        recyclerView.h(new i22(5), -1);
        rn8 rn8Var = new rn8(new ln8(new c7k(26, this), new chf(19)));
        this.e = rn8Var;
        rn8Var.i(recyclerView);
        linearLayoutJ.addView(recyclerView);
        n1g.N(new n(3, null, 24), linearLayoutJ);
        return linearLayoutJ;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        ((RecyclerView) this.d.m(this, g[0])).setAdapter(null);
        rn8 rn8Var = this.e;
        if (rn8Var != null) {
            rn8Var.i(null);
        }
        this.e = null;
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ic6 ic6Var = o1().j;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(ic6Var, i19VarF, n09Var), new nog(null, this, 1), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(o1().k, getViewLifecycleOwner().f(), n09Var), new nog(null, this, 2), 3), getViewLifecycleScope());
    }

    public StickersSettingsScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
