package one.me.settings.media.autosave;

import android.content.Context;
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
import defpackage.dwd;
import defpackage.dyd;
import defpackage.e9i;
import defpackage.er3;
import defpackage.fqf;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.gqf;
import defpackage.gr4;
import defpackage.ha9;
import defpackage.hr4;
import defpackage.i1m;
import defpackage.i22;
import defpackage.ize;
import defpackage.ks6;
import defpackage.lq4;
import defpackage.n;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.pq3;
import defpackage.qf0;
import defpackage.qyb;
import defpackage.rcc;
import defpackage.sbf;
import defpackage.tre;
import defpackage.vv;
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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/settings/media/autosave/SettingsAutoSaveScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "Lqf0;", "chatType", "(Lha9;Lqf0;)V", "media"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SettingsAutoSaveScreen extends Widget {
    public static final /* synthetic */ zv8[] g;
    public final oi8 a;
    public final vv b;
    public final wtc c;
    public final ny8 d;
    public final fqf e;
    public final ks6 f;

    static {
        dwd dwdVar = new dwd(SettingsAutoSaveScreen.class, "chatTypeName", "getChatTypeName()Ljava/lang/String;", 0);
        zfe.a.getClass();
        g = new zv8[]{dwdVar};
    }

    public SettingsAutoSaveScreen(Bundle bundle) {
        super(bundle);
        this.a = oi8.f;
        this.b = new vv("chat_type", String.class);
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.c = wtcVar;
        this.d = createViewModelLazy(gqf.class, new ztd(19, new ize(14, this)));
        fqf fqfVar = new fqf(new i1m(this), ((a2c) wtcVar.getAccessor().c(27)).a());
        this.e = fqfVar;
        this.f = tre.F(this, y3f.SETTINGS_AUTOSAVE_MEDIA);
        e9i.j0(new fz6(o1().h, new dyd(2, fqfVar, fqf.class, "submitList", "submitList(Ljava/util/List;)V", 4, 3), 3), getLifecycleScope());
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getA() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.f;
    }

    public final gqf o1() {
        return (gqf) this.d.getValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onChangeStarted(gr4 gr4Var, hr4 hr4Var) {
        if (hr4Var == hr4.e) {
            gqf gqfVarO1 = o1();
            gqfVarO1.g.setValue(gqfVarO1.B());
        }
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayoutJ = bc1.j(layoutInflater.getContext(), new ViewGroup.LayoutParams(-1, -1), 1);
        rcc rccVar = new rcc(linearLayoutJ.getContext());
        rccVar.setId(R.id.oneme_settings_media_autosave_screen_toolbar);
        rccVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        Context context = rccVar.getContext();
        er3 er3Var = qf0.d;
        zv8 zv8Var = g[0];
        String str = (String) this.b.a(this);
        er3Var.getClass();
        rccVar.setTitle(context.getString(er3.E(str).a));
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new wbc(new chf(2)));
        linearLayoutJ.addView(rccVar);
        RecyclerView recyclerView = new RecyclerView(linearLayoutJ.getContext());
        recyclerView.setId(R.id.oneme_settings_media_autosave_screen_list);
        recyclerView.setClipChildren(false);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.e);
        recyclerView.setItemAnimator(null);
        recyclerView.h(new sbf(pq3.j.h(recyclerView), new qyb(26, this), null, null, null, 60), -1);
        recyclerView.h(new i22(3), -1);
        linearLayoutJ.addView(recyclerView);
        n1g.N(new n(3, null, 17), linearLayoutJ);
        return linearLayoutJ;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        e9i.j0(new fz6(n1g.v(o1().i, getViewLifecycleOwner().f(), n09.d), new dtd((lq4) null, this, 21), 3), getViewLifecycleScope());
    }

    public SettingsAutoSaveScreen(ha9 ha9Var, qf0 qf0Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a)), new ylc("chat_type", qf0Var.name())));
    }
}
