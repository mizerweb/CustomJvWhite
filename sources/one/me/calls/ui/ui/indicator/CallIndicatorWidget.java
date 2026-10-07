package one.me.calls.ui.ui.indicator;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.ha9;
import defpackage.hn1;
import defpackage.i19;
import defpackage.ic6;
import defpackage.j8e;
import defpackage.kn1;
import defpackage.mn1;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.on1;
import defpackage.ow0;
import defpackage.pn1;
import defpackage.pq3;
import defpackage.r;
import defpackage.sx1;
import defpackage.uik;
import defpackage.ylc;
import defpackage.ym1;
import defpackage.z4f;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/calls/ui/ui/indicator/CallIndicatorWidget;", "Lone/me/sdk/arch/Widget;", "Lz4f;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "calls-ui"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CallIndicatorWidget extends Widget implements z4f {
    public static final /* synthetic */ zv8[] g = {new dwd(CallIndicatorWidget.class, "indicatorView", "getIndicatorView()Lone/me/calls/ui/view/indicator/CallIndicatorView;", 0), zo5.f(zfe.a, CallIndicatorWidget.class, "fakeIndicatorView", "getFakeIndicatorView()Landroid/view/View;", 0)};
    public final int a;
    public final sx1 b;
    public final ym1 c;
    public final ow0 d;
    public final j8e e;
    public final ny8 f;

    public CallIndicatorWidget(Bundle bundle) {
        super(bundle);
        this.a = 2;
        sx1 sx1Var = new sx1(0, m35getAccountScopeuqN4xOY());
        this.b = sx1Var;
        this.c = sx1Var.a();
        this.d = binding(new mn1(this, 0));
        this.e = viewBinding(R.id.call_indicator_panel_fake);
        this.f = createViewModelLazy(kn1.class, new r(20, new mn1(this, 1)));
    }

    public static final void o1(CallIndicatorWidget callIndicatorWidget, boolean z) {
        View view = callIndicatorWidget.getView();
        if (view != null) {
            int i = z ? pq3.j.k(view.getContext()).b.b().c : 0;
            Drawable background = ((View) callIndicatorWidget.e.m(callIndicatorWidget, g[1])).getBackground();
            ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
            if (colorDrawable != null) {
                ColorDrawable colorDrawable2 = colorDrawable.getColor() != i ? colorDrawable : null;
                if (colorDrawable2 != null) {
                    colorDrawable2.setColor(i);
                }
            }
        }
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return new on1(this, viewGroup, getContext());
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ic6 ic6VarD = q1().D();
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(ic6VarD, i19VarF, n09Var), new pn1(null, this, 0), 3), getViewLifecycleScope());
        p1().setActionsListener(new uik(4, this));
        e9i.j0(new fz6(n1g.v(q1().B(), getViewLifecycleOwner().f(), n09Var), new pn1(null, this, 1), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(q1().E(), getViewLifecycleOwner().f(), n09Var), new pn1(null, this, 2), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(q1().C(), getViewLifecycleOwner().f(), n09Var), new pn1(null, this, 3), 3), getViewLifecycleScope());
    }

    public final hn1 p1() {
        zv8 zv8Var = g[0];
        return (hn1) this.d.getValue();
    }

    public final kn1 q1() {
        return (kn1) this.f.getValue();
    }

    @Override // defpackage.z4f
    /* JADX INFO: renamed from: v, reason: from getter */
    public final int getA() {
        return this.a;
    }

    public CallIndicatorWidget(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
