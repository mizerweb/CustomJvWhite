package one.me.stories.edit.background;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.bpg;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.evg;
import defpackage.fz6;
import defpackage.ha9;
import defpackage.hm0;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.t2g;
import defpackage.vph;
import defpackage.vv;
import defpackage.wtc;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/stories/edit/background/ThemeBackgroundPageWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lhm0;", "backgroundNameId", "Lha9;", "localAccountId", "(Lhm0;Lha9;)V", "", "gradientName", "(Ljava/lang/String;Lha9;)V", "stories"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ThemeBackgroundPageWidget extends Widget {
    public static final /* synthetic */ zv8[] e = {new dwd(ThemeBackgroundPageWidget.class, "backgroundName", "getBackgroundName()Ljava/lang/String;", 0), zo5.f(zfe.a, ThemeBackgroundPageWidget.class, "gradientName", "getGradientName()Ljava/lang/String;", 0)};
    public final vv a;
    public final vv b;
    public final wtc c;
    public final ny8 d;

    public ThemeBackgroundPageWidget(Bundle bundle) {
        super(bundle);
        this.a = new vv(String.class, null, "bg_name");
        this.b = new vv(String.class, null, "gradient_name");
        this.c = new wtc(m35getAccountScopeuqN4xOY());
        this.d = createViewModelLazy(vph.class, new t2g(19, new bpg(12, this)));
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        e9i.j0(new fz6(n1g.v(((vph) this.d.getValue()).d, getViewLifecycleOwner().f(), n09.d), new evg(null, view, 1), 3), getViewLifecycleScope());
    }

    public ThemeBackgroundPageWidget(hm0 hm0Var, ha9 ha9Var) {
        this(n1g.i(new ylc("bg_name", hm0Var.a), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }

    public ThemeBackgroundPageWidget(String str, ha9 ha9Var) {
        this(n1g.i(new ylc("gradient_name", str), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
