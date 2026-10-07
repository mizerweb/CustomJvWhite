package one.me.settings.media.video;

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
import defpackage.dyd;
import defpackage.e9i;
import defpackage.epf;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.ha9;
import defpackage.i22;
import defpackage.ipf;
import defpackage.ize;
import defpackage.ks6;
import defpackage.n;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.pq3;
import defpackage.qyb;
import defpackage.rcc;
import defpackage.sbf;
import defpackage.tre;
import defpackage.ttf;
import defpackage.wbc;
import defpackage.wtc;
import defpackage.y3f;
import defpackage.ylc;
import defpackage.ztd;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/settings/media/video/SettingMediaVideoScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "media"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SettingMediaVideoScreen extends Widget {
    public final ks6 a;
    public final oi8 b;
    public final wtc c;
    public final ny8 d;
    public final ttf e;

    public SettingMediaVideoScreen(Bundle bundle) {
        super(bundle);
        this.a = tre.F(this, y3f.SETTINGS_VIDEO_AUTODOWNLOAD);
        this.b = oi8.f;
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.c = wtcVar;
        ny8 ny8VarCreateViewModelLazy = createViewModelLazy(ipf.class, new ztd(17, new ize(11, this)));
        this.d = ny8VarCreateViewModelLazy;
        ttf ttfVar = new ttf(new epf(this), ((a2c) wtcVar.getAccessor().c(27)).a());
        this.e = ttfVar;
        e9i.j0(new fz6(((ipf) ny8VarCreateViewModelLazy.getValue()).f, new dyd(2, ttfVar, ttf.class, "submitList", "submitList(Ljava/util/List;)V", 4, 1), 3), getLifecycleScope());
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getB() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.a;
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayoutJ = bc1.j(layoutInflater.getContext(), new ViewGroup.LayoutParams(-1, -1), 1);
        rcc rccVar = new rcc(linearLayoutJ.getContext());
        rccVar.setId(R.id.oneme_settings_media_screen_toolbar);
        rccVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        rccVar.setTitle(R.string.oneme_settings_media_screen_toolbar_title);
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new wbc(new chf(1)));
        linearLayoutJ.addView(rccVar);
        RecyclerView recyclerView = new RecyclerView(linearLayoutJ.getContext());
        recyclerView.setId(R.id.oneme_settings_media_screen_list);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.e);
        recyclerView.setItemAnimator(null);
        recyclerView.h(new sbf(pq3.j.h(recyclerView), new qyb(24, this), null, null, null, 60), -1);
        recyclerView.h(new i22(3), -1);
        linearLayoutJ.addView(recyclerView);
        n1g.N(new n(3, null, 15), linearLayoutJ);
        return linearLayoutJ;
    }

    public SettingMediaVideoScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
