package one.me.notifications.settings.screens.other;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.ha9;
import defpackage.hta;
import defpackage.k96;
import defpackage.lq4;
import defpackage.n;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.ow0;
import defpackage.qz9;
import defpackage.rcc;
import defpackage.rsf;
import defpackage.uik;
import defpackage.v0k;
import defpackage.vic;
import defpackage.wic;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/notifications/settings/screens/other/OtherNotificationsSettingsScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "notifications-settings"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class OtherNotificationsSettingsScreen extends Widget {
    public static final /* synthetic */ zv8[] g = {new dwd(OtherNotificationsSettingsScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), zo5.f(zfe.a, OtherNotificationsSettingsScreen.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0)};
    public final oi8 a;
    public final v0k b;
    public final ny8 c;
    public final rsf d;
    public final ow0 e;
    public final ow0 f;

    public OtherNotificationsSettingsScreen(Bundle bundle) {
        super(bundle);
        this.a = oi8.f;
        v0k v0kVar = new v0k(m35getAccountScopeuqN4xOY());
        this.b = v0kVar;
        this.c = createViewModelLazy(wic.class, new hta(6, new vic(this, 0)));
        this.d = new rsf(new uik(19, this), v0kVar.getExecutors().a());
        this.e = binding(new vic(this, 1));
        this.f = binding(new vic(this, 2));
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getD() {
        return this.a;
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(R.id.oneme_notifications_settings_other_linearlayout);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0, gm0.K(12.0f * yl5.d().getDisplayMetrics().density), 0);
        zv8[] zv8VarArr = g;
        zv8 zv8Var = zv8VarArr[0];
        linearLayout.addView((rcc) this.e.getValue());
        zv8 zv8Var2 = zv8VarArr[1];
        linearLayout.addView((k96) this.f.getValue());
        n1g.N(new n(3, null, 10), linearLayout);
        return linearLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        e9i.j0(new fz6(n1g.v(((wic) this.c.getValue()).g, getViewLifecycleOwner().f(), n09.d), new qz9((lq4) null, this, 16), 3), getViewLifecycleScope());
    }

    public OtherNotificationsSettingsScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
