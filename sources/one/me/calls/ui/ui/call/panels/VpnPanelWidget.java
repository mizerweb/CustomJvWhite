package one.me.calls.ui.ui.call.panels;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.bdc;
import defpackage.dm8;
import defpackage.gm0;
import defpackage.hbj;
import defpackage.hzi;
import defpackage.ks9;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.reh;
import defpackage.sx1;
import defpackage.t3f;
import defpackage.v62;
import defpackage.vbi;
import defpackage.xtj;
import defpackage.yl5;
import defpackage.ylc;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\n"}, d2 = {"Lone/me/calls/ui/ui/call/panels/VpnPanelWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "(Lt3f;)V", "ks9", "calls-ui"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VpnPanelWidget extends Widget {
    public ks9 a;
    public final sx1 b;
    public final ny8 c;

    public VpnPanelWidget(Bundle bundle) {
        super(bundle);
        this.b = new sx1(m35getAccountScopeuqN4xOY());
        this.c = createViewModelLazy(hbj.class, new hzi(4, new vbi(18, this)));
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        dm8 dm8Var = new dm8(this, getContext());
        reh rehVar = new reh(getContext());
        rehVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        rehVar.addView(dm8Var);
        rehVar.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(0.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        rehVar.setCallback(new xtj(this, rehVar, dm8Var, 19));
        bdc.a(rehVar, new v62(rehVar, rehVar, 2));
        return rehVar;
    }

    public VpnPanelWidget(t3f t3fVar) {
        this(n1g.i(new ylc(Widget.ARG_SCOPE_ID, t3fVar)));
    }
}
