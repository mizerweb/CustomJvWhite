package one.me.settings.ringtone.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2c;
import defpackage.bc1;
import defpackage.d4f;
import defpackage.dtd;
import defpackage.dwd;
import defpackage.dyd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.gv7;
import defpackage.ha9;
import defpackage.j8e;
import defpackage.ks6;
import defpackage.ks9;
import defpackage.lq4;
import defpackage.mvf;
import defpackage.n;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.p7d;
import defpackage.pq3;
import defpackage.pvf;
import defpackage.qp4;
import defpackage.qyb;
import defpackage.rcc;
import defpackage.rx8;
import defpackage.sbf;
import defpackage.tre;
import defpackage.tyd;
import defpackage.vp4;
import defpackage.vpf;
import defpackage.wbc;
import defpackage.wtc;
import defpackage.xhh;
import defpackage.xpf;
import defpackage.xra;
import defpackage.yab;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.ztd;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/settings/ringtone/ui/SettingRingtoneScreen;", "Lone/me/sdk/arch/Widget;", "Lvp4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "settings-ringtone"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SettingRingtoneScreen extends Widget implements vp4 {
    public static final /* synthetic */ zv8[] i;
    public final oi8 a;
    public final ks6 b;
    public final wtc c;
    public final ny8 d;
    public qp4 e;
    public final ny8 f;
    public final j8e g;
    public final mvf h;

    static {
        dwd dwdVar = new dwd(SettingRingtoneScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        zfe.a.getClass();
        i = new zv8[]{dwdVar};
    }

    public SettingRingtoneScreen(Bundle bundle) {
        super(bundle);
        this.a = oi8.f;
        this.b = tre.G(this, new tyd(24));
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.c = wtcVar;
        this.d = rx8.P(3, new vpf(this, 0));
        this.f = createViewModelLazy(xpf.class, new ztd(18, new vpf(this, 1)));
        this.g = viewBinding(R.id.oneme_settings_ringtone_settings_list);
        mvf mvfVar = new mvf(new ks9(26, this), ((a2c) wtcVar.getAccessor().c(27)).a());
        this.h = mvfVar;
        e9i.j0(new fz6(o1().k, new dyd(2, mvfVar, mvf.class, "submitList", "submitList(Ljava/util/List;)V", 4, 2), 3), getLifecycleScope());
    }

    @Override // defpackage.vp4
    public final void E(int i2, Bundle bundle) {
        String string;
        if (bundle == null || (string = bundle.getString("ringtone_file_path")) == null) {
            return;
        }
        xpf xpfVarO1 = o1();
        yab.i0(xpfVarO1.b, ((n0c) ((xhh) xpfVarO1.d.getValue())).b(), 0, new xra(xpfVarO1, string, (lq4) null, 16), 2);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getA() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.b;
    }

    public final xpf o1() {
        return (xpf) this.f.getValue();
    }

    @Override // defpackage.br4
    public final void onActivityResult(int i2, int i3, Intent intent) {
        Uri data;
        super.onActivityResult(i2, i3, intent);
        if (i2 != 998 || intent == null || (data = intent.getData()) == null) {
            return;
        }
        xpf xpfVarO1 = o1();
        yab.i0(xpfVarO1.b, ((n0c) ((xhh) xpfVarO1.d.getValue())).b(), 0, new gv7(xpfVarO1, data, null, 16), 2);
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayoutJ = bc1.j(layoutInflater.getContext(), new ViewGroup.LayoutParams(-1, -1), 1);
        rcc rccVar = new rcc(linearLayoutJ.getContext());
        rccVar.setId(R.id.oneme_settings_ringtone_title);
        rccVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        rccVar.setTitle(R.string.oneme_settings_ringtone_title);
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new wbc(new p7d(28, this)));
        linearLayoutJ.addView(rccVar);
        RecyclerView recyclerView = new RecyclerView(linearLayoutJ.getContext());
        recyclerView.setId(R.id.oneme_settings_ringtone_settings_list);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.h);
        recyclerView.setItemAnimator(null);
        recyclerView.h(new sbf(pq3.j.h(recyclerView), new qyb(25, this), null, null, null, 60), -1);
        recyclerView.h(new pvf(0), -1);
        linearLayoutJ.addView(recyclerView);
        n1g.N(new n(3, null, 16), linearLayoutJ);
        return linearLayoutJ;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        ((RecyclerView) this.g.m(this, i[0])).setAdapter(null);
        super.onDestroyView(view);
        qp4 qp4Var = this.e;
        if (qp4Var != null) {
            qp4Var.dismiss();
        }
        this.e = null;
        o1().D().j();
    }

    @Override // defpackage.br4
    public final void onDetach(View view) {
        super.onDetach(view);
        o1().D().j();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        e9i.j0(new fz6(n1g.v(o1().l, getViewLifecycleOwner().f(), n09.d), new dtd((lq4) null, this, 20), 3), getViewLifecycleScope());
    }

    public SettingRingtoneScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
