package one.me.calls.ui.ui.call.panels;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ai1;
import defpackage.ch3;
import defpackage.ci1;
import defpackage.di1;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.ei1;
import defpackage.es4;
import defpackage.fz6;
import defpackage.fze;
import defpackage.hsk;
import defpackage.hu;
import defpackage.j8e;
import defpackage.lq4;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.ph1;
import defpackage.qh1;
import defpackage.r;
import defpackage.r66;
import defpackage.rx8;
import defpackage.sx1;
import defpackage.t3f;
import defpackage.xhh;
import defpackage.xr4;
import defpackage.xva;
import defpackage.xw3;
import defpackage.ylc;
import defpackage.yr4;
import defpackage.zfe;
import defpackage.zr4;
import defpackage.zv8;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\n\u000b\fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\r"}, d2 = {"Lone/me/calls/ui/ui/call/panels/CallEventsWidget;", "Lone/me/sdk/arch/Widget;", "Lzr4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "(Lt3f;)V", "bx1", "xva", "hu", "calls-ui"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CallEventsWidget extends Widget implements zr4 {
    public static final /* synthetic */ zv8[] j;
    public hu a;
    public es4 b;
    public final sx1 c;
    public final qh1 d;
    public final ny8 e;
    public final ArrayList f;
    public final xva g;
    public final ny8 h;
    public final j8e i;

    static {
        dwd dwdVar = new dwd(CallEventsWidget.class, "eventsRecyclerView", "getEventsRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0);
        zfe.a.getClass();
        j = new zv8[]{dwdVar};
    }

    public CallEventsWidget(Bundle bundle) {
        super(bundle);
        sx1 sx1Var = new sx1(m35getAccountScopeuqN4xOY());
        this.c = sx1Var;
        this.d = new qh1(ch3.b(((n0c) ((xhh) sx1Var.getAccessor().c(23))).a()), 0);
        this.e = createViewModelLazy(ai1.class, new r(16, new di1(this, 0)));
        this.f = new ArrayList();
        this.g = new xva(4, (boolean) (0 == true ? 1 : 0));
        this.h = rx8.P(3, new di1(this, 1));
        this.i = viewBinding(R.id.call_events_recyclerview);
    }

    @Override // defpackage.zr4
    public final List J(xr4 xr4Var, xr4 xr4Var2) {
        View view = getView();
        ViewParent parent = view != null ? view.getParent() : null;
        View view2 = parent instanceof View ? (View) parent : null;
        return view2 != null ? xw3.P0(hsk.c((Math.abs(xr4Var2.d) - xr4Var2.f) * xr4Var2.c, view2), hsk.b(view2, xr4Var2.a)) : r66.a;
    }

    @Override // defpackage.zr4
    public final void M() {
        yr4 yr4Var;
        es4 es4Var = this.b;
        if (es4Var == null || (yr4Var = es4Var.k) == null) {
            return;
        }
        View view = getView();
        ViewParent parent = view != null ? view.getParent() : null;
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view2.setTranslationY(yr4Var.c ? 0.0f : yr4Var.b() - yr4Var.b);
        }
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView = new RecyclerView(getContext());
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        recyclerView.setId(R.id.call_events_recyclerview);
        recyclerView.setAdapter(this.d);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, true));
        int i = 0;
        recyclerView.h(new ph1(i), -1);
        this.g.b = recyclerView;
        recyclerView.setItemAnimator((ei1) this.h.getValue());
        recyclerView.addOnLayoutChangeListener(new ci1(i, this));
        return recyclerView;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.f.clear();
        this.g.b = null;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        e9i.j0(new fz6(n1g.v(((ai1) this.e.getValue()).g, getViewLifecycleOwner().f(), n09.d), new fze((lq4) null, view, this, 7), 3), getViewLifecycleScope());
    }

    public CallEventsWidget(t3f t3fVar) {
        this(n1g.i(new ylc(Widget.ARG_SCOPE_ID, t3fVar)));
    }
}
