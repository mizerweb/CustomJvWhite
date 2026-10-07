package one.me.calls.ui.ui.pip;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.chb;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.ev1;
import defpackage.fz6;
import defpackage.gvc;
import defpackage.ha9;
import defpackage.i1d;
import defpackage.j8e;
import defpackage.lq4;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.p1d;
import defpackage.pq3;
import defpackage.qz9;
import defpackage.rx8;
import defpackage.sx1;
import defpackage.t3g;
import defpackage.ylc;
import defpackage.z4f;
import defpackage.zfe;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/calls/ui/ui/pip/PipScreen;", "Lone/me/sdk/arch/Widget;", "Lchb;", "Lz4f;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "calls-ui"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PipScreen extends Widget implements chb, z4f {
    public static final /* synthetic */ zv8[] f;
    public final int a;
    public final j8e b;
    public final sx1 c;
    public final ny8 d;
    public final ny8 e;

    static {
        dwd dwdVar = new dwd(PipScreen.class, "fakePipView", "getFakePipView()Lone/me/calls/ui/view/pip/CallPipView;", 0);
        zfe.a.getClass();
        f = new zv8[]{dwdVar};
    }

    public PipScreen(Bundle bundle) {
        super(bundle);
        this.a = 3;
        this.b = viewBinding(R.id.call_pip_fake_view_id);
        this.c = new sx1(m35getAccountScopeuqN4xOY());
        this.d = rx8.P(3, new p1d(this, 1));
        this.e = rx8.P(3, new gvc(9));
    }

    public final i1d o1() {
        return (i1d) this.d.getValue();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ((t3g) this.e.getValue()).getClass();
        t3g.a();
        ev1 ev1Var = new ev1(getContext(), getB().b());
        ev1Var.setId(R.id.call_pip_fake_view_id);
        ev1Var.setPipTheme(pq3.j.l(ev1Var).b);
        ev1Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ev1Var.setVideoLayoutUpdatesControllerProvider(new p1d(this, 0));
        ev1Var.setBackgroundCorners(0.0f);
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(R.id.call_pip_container_id);
        frameLayout.addView(ev1Var);
        frameLayout.setBackgroundColor(0);
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onDestroy() {
        super.onDestroy();
        i1d i1dVarO1 = o1();
        i1dVarO1.b.e(i1dVarO1);
        i1dVarO1.c = null;
        i1dVarO1.g().b();
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        o1().c = null;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        o1().c = (ev1) this.b.m(this, f[0]);
        e9i.j0(new fz6(o1().e, new qz9(this, (lq4) null, 22), 3), getViewLifecycleScope());
    }

    @Override // defpackage.z4f
    /* JADX INFO: renamed from: v, reason: from getter */
    public final int getA() {
        return this.a;
    }

    public PipScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
